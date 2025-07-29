# 💱 Conversor de Moedas - Java Console

Aplicação Java de conversão de moedas em tempo real com interação via terminal. Este projeto consome uma API de câmbio para fornecer taxas atualizadas e permite ao usuário realizar conversões entre diferentes moedas com facilidade.

## 🚀 Funcionalidades

- Conversão de moedas em tempo real
- Interface interativa via console
- Mínimo de 6 opções de moedas disponíveis:
    - USD ⇄ BRL
    - EUR ⇄ BRL
    - GBP ⇄ BRL
- Integração com API pública de câmbio
- Validação básica de entrada

## 🛠 Tecnologias Utilizadas

- Java 17
- Maven
- [Gson](https://github.com/google/gson) (para parse de JSON)
- API: [ExchangeRate Host](https://exchangerate.host/)

## 📦 Estrutura do Projeto

```
ConversorMoedas/
│
├── src/
│ └── main/
│ └── java/
│ └── br/com/conversor/
│ ├── Main.java # Classe principal (menu e entrada do usuário)
│ ├── Conversor.java # Lógica de requisição à API e conversão
│ └── Moeda.java # Modelo para o resultado do JSON
│
└── pom.xml # Gerenciador de dependências (Maven)
```

## 🧾 Exemplo de uso
```
==== CONVERSOR DE MOEDAS ====
1. USD para BRL
2. BRL para USD
3. EUR para BRL
4. BRL para EUR
5. GBP para BRL
6. BRL para GBP
7. Sair
Escolha uma opção: 1
Digite o valor a converter: 100
💱 100.00 USD = 534.12 BRL

```

## 📡 Fonte de Dados
- As taxas de câmbio são obtidas da API:

    https://exchangerate.host/

- Sem necessidade de autenticação ou chave de API.

## 💻 Desenvolvido com por 
- [Gilson Inocêncio da silva Ramos]
- [Atividade challenge da formção backende Alura e Oracle]