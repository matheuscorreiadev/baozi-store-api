# Baozi Store - API REST

API REST desenvolvida em **Java com Spring Boot** para informatizar o controle básico de **clientes**, **produtos** e **pedidos** da **Baozi Store** (loja especializada em pãozinho chinês).

Projeto desenvolvido como Atividade Prática da disciplina de **Desenvolvimento Web Back-End** — Análise e Desenvolvimento de Sistemas (UNINTER).

---

## Autor

* **Nome:** Matheus Correia
* **RU:** 4675673

---

## Tecnologias Utilizadas

* **Java**
* **Spring Boot** (v3.3.5)
* **Spring Data JPA**
* **Banco de Dados Relacional H2** (em memória)
* **Maven**
* **JSON** (comunicação nos endpoints)

---

## Arquitetura do Projeto

O projeto segue o padrão **MVC** organizado nos seguintes pacotes:

```text
src/main/java/...
 ├── model/          # Entidades JPA (Cliente, Produto, Pedido)
 ├── repository/     # Interfaces que estendem JpaRepository
 └── controller/     # Controladores REST com os endpoints da API