# DSMeta
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/newrodrigo/dsmeta/blob/main/LICENSE) 

## Sobre o Projeto

O DSMeta é uma aplicação construída durante o Intensivão Java Spring, um evento organizado pela [DevSuperior](https://devsuperior.com.br/). A aplicação oferece uma solução integrada para gerenciamento de vendas e análise de desempenho de vendedores.

## Principais Recursos:

- **Relatórios de Vendas Detalhados:** Analise o desempenho dos seus vendedores com relatórios personalizados, filtrados por data.
- **Líderes de Vendas:** Identifique os vendedores que mais se destacaram.
- **Notificações por SMS:** Reconheça e motive sua equipe com notificações automáticas por SMS.
- **Controle Total:** Personalize as análises de acordo com as suas necessidades, selecionando intervalos de datas e visualizando métricas cruciais.

## Layout Web
![Dashboard](https://github.com/newrodrigo/dsmeta/assets/88519491/07671be8-ec46-4a48-98bb-c5696de4956b)

![SMS Notification](https://github.com/newrodrigo/dsmeta/assets/88519491/26497779-14ca-49fc-8b24-b429e318adc5)

## Notificação por SMS
![SMS Notification](https://github.com/newrodrigo/dsmeta/assets/88519491/978543da-7276-45ad-a8e0-999d03c0366e)

## Exemplos de Consultas Realizadas no Postman

1. **Filtrar por Data:**
   - Consulta que retorna uma lista paginada das vendas registradas em um determinado período.
   - Método: GET
   - Endpoint: `/sales?minDate=2023-02-01&maxDate=2023-02-28`
   ![Consulta por Data](https://github.com/newrodrigo/dsmeta/assets/88519491/0ae3b435-e3fc-4455-9850-7b9abf18ddd6)

2. **Filtrar por Data (Mês Atual):**
   - Consulta que retorna uma lista paginada das vendas efetuadas no mês atual.
   - Método: GET
   - Endpoint: `/sales`

3. **Notificação por SMS:**
   - Envia uma notificação por SMS informando o ID do vendedor.
   - Método: GET
   - Endpoint: `sales/53/notification`
   ![Notificação por SMS](https://github.com/newrodrigo/dsmeta/assets/88519491/f398f6c5-ff15-49fe-af68-ec7220cf7c6d)

## Tecnologias Utilizadas

### Back-End
- Java
- Spring Boot
- JPA / Hibernate
- SQL
- Maven
- H2 Database

### Front End
- HTML / CSS / JS / TypeScript
- ReactJS
- Toast
- Axios

## Como Executar o Projeto

### Back-End
Pré-requisitos: Java 17

```bash
# Clonar o repositório
git clone git@github.com:newrodrigo/dsmeta.git

# Entrar na pasta do projeto back-end
cd backend

# Executar o projeto
./mvnw spring-boot:run
```

### Front End
Pré-requisitos: npm / yarn

```bash
# Clonar o repositório
git clone git@github.com:newrodrigo/dsmeta.git

# Entrar na pasta do projeto back-end
cd frontend

# instalar dependências
yarn install

# executar o projeto
yarn dev
```

# Autor

Rodrigo Oliveira Cerqueira

[LinkedIn](https://www.linkedin.com/in/rodrigooc)
