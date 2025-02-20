# Desafio Técnico - API de Comunicação

## 📝 Introdução
Bem-vindo(a) ao desafio técnico! Este projeto tem como objetivo desenvolver uma API para gestão de comunicação, contemplando o agendamento, consulta e cancelamento de envios.

## 🎯 Objetivo
Nesta sprint, você irá desenvolver três endpoints principais:
- **📅 Agendamento de envio de comunicação**
- **🔍 Consulta do status do envio da comunicação**
- **❌ Cancelamento do envio da comunicação**

## 📌 Requisitos

### ✅ Endpoint de Agendamento (1)
Deve receber uma solicitação de agendamento de envio contendo os seguintes campos:
- **📆 Data/Hora para envio**
- **📩 Destinatário**
- **✉️ Mensagem**

A solicitação deve ser salva no banco de dados. A estrutura do banco deve estar preparada para futuras implementações que realizarão o envio e atualização do status.

### 🔎 Endpoint de Consulta (2)
Permitir a consulta do status de um agendamento com base no identificador da solicitação.

### ❎ Endpoint de Cancelamento (3)
Permitir o cancelamento de um agendamento de envio de comunicação.

## 🛠 Tecnologias
- **🔹 Linguagens recomendadas:** Java, Python ou Node.js (ou outra, com justificativa)
- **🗄 Banco de Dados:** MySQL, PostgreSQL ou H2
- **🔗 API:** Deve seguir o padrão RESTFul e usar JSON

## 🏆 Boas Práticas
- Seguir padrões e boas práticas de desenvolvimento
- Estruturar commits pequenos e bem descritos no repositório GIT
