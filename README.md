# 💱 CurrencyConverter

Projeto em Java para conversão de valores monetários entre diferentes moedas utilizando a API [ExchangeRate-API](https://www.exchangerate-api.com/). Criado com a IDE IntelliJ IDEA, o sistema é simples, direto e eficaz para fins educacionais e práticos.

---

## ✨ Funcionalidades

* Conversão de valores entre as seguintes moedas:

  * 🇺🇸 Dólar Americano (USD)
  * 🇪🇺 Euro (EUR)
  * 🇬🇧 Libra Esterlina (GBP)
  * 🇯🇵 Iene Japonês (JPY)
  * 🇧🇷 Real Brasileiro (BRL)
  * 🇨🇦 Dólar Canadense (CAD)
* Consumo de cotações em tempo real via `exchangerate-api`
* Uso da biblioteca [GSON](https://github.com/google/gson) para manipulação de JSON
* Interface simples via console

---

## ⚙ Requisitos

* Java 21
* IDE IntelliJ IDEA (ou compatível)
* Conexão com a Internet (para acesso à API)
* Biblioteca GSON (já incluída no projeto)

---

## 🛠 Como executar o projeto

1. **Clone o repositório**

```bash
git clone https://github.com/seu-usuario/CurrencyConverter.git
cd CurrencyConverter
```

2. **Abra no IntelliJ IDEA**

* `File > Open` e selecione o diretório do projeto.

3. **Instale dependências (se estiver usando Maven/Gradle)**

* Certifique-se de que o GSON esteja no classpath. Caso o projeto seja puro (sem Maven), baixe o `.jar` do GSON [aqui](https://mvnrepository.com/artifact/com.google.code.gson/gson) e adicione manualmente.

4. **Execute a classe principal**

* Acesse a classe `Main` (ou onde estiver o `public static void main`) e execute.

---

## 📅 Exemplo de uso

```bash
[0] $ USD Dolar
[1] € EUR Euro
[2] £ GBP Libra Esterlina
[3] ¥ JPY Iene Japonês
[4] R$ BRL Real
[5] CA$ CAD Dólar canadense
[7] Sair
Digite o numero da moeda que ira inserir para conversão
0
Digite o numero para moeda que deseja converter
5
Agora digite o valor que deseja converter: 
100
*******************************************************
  $100.0 é igual a CA$139.78 em CAD
*******************************************************
```

---

## 🌐 API Utilizada

* [ExchangeRate-API](https://www.exchangerate-api.com/)

  * Gratuita para uso básico
  * Necessário obter uma chave de API e configurar no projeto (ex: via `.env` ou constante)

---

## 📚 Tecnologias Usadas

* Java 21
* IntelliJ IDEA
* GSON (Google JSON Library)
* ExchangeRate-API

---

## ✉ Contribuições

Contribuições são bem-vindas! Basta:

1. Fazer um fork
2. Criar uma branch: `git checkout -b minha-feature`
3. Commitar suas alterações: `git commit -m "feat: minha nova funcionalidade"`
4. Enviar um push: `git push origin minha-feature`
5. Abrir um Pull Request

---

## 👤 Autor

* **Luis Fernando**
* GitHub: [@LuisFernando12](https://github.com/LuisFernando12)

---

## 💸 Licença

Este projeto está licenciado sob a Licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---

Feito com ❤️ em Java ✨
