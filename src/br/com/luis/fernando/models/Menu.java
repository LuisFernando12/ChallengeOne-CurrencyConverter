package br.com.luis.fernando.models;

import br.com.luis.fernando.enums.CurrencyEnum;
import br.com.luis.fernando.exceptions.CurrencyException;

import java.util.Scanner;

public class Menu {
    public static void start(){
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit){
            for (int i = 0; i < CurrencyEnum.values().length; i++) {
                System.out.println("["+i+"] "+CurrencyEnum.values()[i]);
            }
            System.out.println("["+(CurrencyEnum.values().length+1)+"] Sair");
            System.out.println("Digite o numero da moeda que ira inserir para conversão");
            int actualCurrencyOption = scanner.nextInt();
            if(actualCurrencyOption==(CurrencyEnum.values().length+1)){
                exit = true;
                break;
            }
            System.out.println("Digite o numero para moeda que deseja converter");
            int converterCurrencyOption = scanner.nextInt();
            if(converterCurrencyOption==(CurrencyEnum.values().length+1)){
                exit = true;
                break;
            }
            CurrencyEnum currency = CurrencyEnum.values()[actualCurrencyOption];
            CurrencyEnum currencyConverter = CurrencyEnum.values()[converterCurrencyOption];
            double conversionRate = 0;
            try {
                conversionRate = new Currency().convertion(currency.getIsoCode(), currencyConverter.getIsoCode());
            } catch (CurrencyException e) {
                System.out.println("Error: "+ e.getMessage());
            }
            System.out.println("Agora digite o valor que deseja converter: ");
            double amount = scanner.nextDouble();
            if(amount == 0 ){
                System.out.println("O valor para conversão deve ser diferente de 0");
                continue;
            }
            System.out.println("*******************************************************");
            System.out.println("  "+currency.getSymbol()+amount+
                    " é igual a "+currencyConverter.getSymbol()+(amount*conversionRate)+
                    " em "+ currencyConverter.getIsoCode());
            System.out.println("*******************************************************\n");

            System.out.println("Deseja fazer outra conversão digite s/n (s para sim e n para não!)");
            String next = scanner.next();
            if (!next.equalsIgnoreCase("s")){
                exit = true;
                break;
            }
        }
    }
}
