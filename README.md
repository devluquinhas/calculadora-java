# Calculadora Java com Arquitetura em Camadas

Este projeto é uma calculadora simples desenvolvida em Java com foco em aprendizado de **boas práticas de programação e arquitetura de software**.

---

## Objetivo

O objetivo deste projeto é praticar:

- Java puro
- Programação orientada a objetos (POO)
- Arquitetura em camadas (Layered Architecture)
- Princípios de separação de responsabilidades

---

## Tecnologias

- Java

---

## Conceitos aplicados

- Interfaces
- Polimorfismo
- Injeção de dependência manual
- Separação de responsabilidades (SRP)

---

## Arquitetura do Projeto

### Domain
Responsável pelas regras de negócio da aplicação.

- `OperacaoMatematica` (interface)
- `Operadores` (implementação das operações matemáticas)

---

### Application
Responsável pela lógica de execução do sistema.

- `CalculadoraService`

---

### Presentation
Responsável pela interação com o usuário.

- `Menu` (interface via terminal)

---

### Main
Responsável por orquestrar e injetar dependências do sistema

---

## Funcionalidades

- Operações em dois números
- Interface via terminal
- Estrutura pronta para expansão (subtração, multiplicação, etc.)

---

## Como executar o projeto

1. Clone o repositório:

```bash
git clone https://github.com/devluquinhas/calculadora-java.git
```

2. Abra o projeto no IntelliJ IDEA

3. Execute a classe Main.java

---

Projeto desenvolvido para fins de estudo de Java e arquitetura de software.