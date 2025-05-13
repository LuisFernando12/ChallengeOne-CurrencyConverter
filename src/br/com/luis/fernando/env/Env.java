package br.com.luis.fernando.env;

import java.io.*;
import java.util.function.Predicate;

public class Env {
    static {
        init();
    }
    private Env(){
    }
    public static void init(){
        File file = new File(".env");
        if(!file.exists()){
            System.err.println("Arquivo .env não encontrado (ignore o erro em caso de produção)");
            return;
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(".env"))) {
            reader.lines().forEach(Env::setProperty);
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo .env: " + e.getMessage());
        }
    }
    private static boolean isSkippableLine(String line) {
        final Predicate<String> isComment = value -> value.trim().startsWith("#") ;
        final Predicate<String> isEmptyOrNullLine = value -> value == null || value.trim().isEmpty();
        return isComment.test(line) && !isEmptyOrNullLine.test(line);
    }
    private static void setProperty(String environmentVariables){
        if(isSkippableLine(environmentVariables)) return;
            var getProperty = environmentVariables.split("=");
            if (getProperty.length<2){
                System.err.println("Linha malformada" + environmentVariables);
                return;
            }
            String key = getProperty[0].trim();
            String value = getProperty[1].trim().replaceAll("^['\"]|['\"]$", "");
            System.setProperty(key, value );
    }
    public static String get(String key){
        final var value = System.getenv(key);
        return  value != null? value: System.getProperty(key);
    }
}
