[README_consultorio.md](https://github.com/user-attachments/files/26361485/README_consultorio.md)
# Sistema de Gestão de Consultório 🏥

Aplicação desktop desenvolvida em Java para gestão de uma clínica de psicologia. Permite o cadastro e acompanhamento completo de pacientes, sessões, anamneses e agendamentos.

---

## ✨ Funcionalidades

- 🔐 Autenticação de psicólogos (login com usuário e senha)
- 👤 Cadastro de pacientes com dados clínicos completos (CPF, data de nascimento, plano de saúde, foto, observações)
- 📋 Anamnese — registro detalhado do histórico clínico do paciente
- 🗓 Controle de sessões com:
  - Queixas do paciente
  - Diagnóstico e plano de tratamento
  - Evolução e resumo da sessão
  - Controle de pagamento
- 📅 Agendamentos
- 📊 Histórico completo por paciente

---

## 🛠 Stack

| Tecnologia | Uso |
|------------|-----|
| Java (Swing) | Interface gráfica desktop |
| MySQL | Banco de dados relacional |
| Maven | Gerenciamento de dependências |
| NetBeans | IDE |

---

## 🏗 Arquitetura

O projeto segue arquitetura em 3 camadas:

```
src/main/java/
├── apresentacao/   # Telas e formulários (Java Swing)
├── negocio/        # Regras de negócio (Paciente, Sessão, Anamnese, Psicólogo)
└── persistencia/   # Acesso ao banco de dados (MySQL)
```

---

## 🚀 Como rodar

### Pré-requisitos
- Java 11+
- MySQL 8+
- Maven

### Configuração do banco
```sql
CREATE DATABASE consultorio;
```
Importe o script SQL disponível em `src/main/resources/banco.sql`

### Rodando o projeto
```bash
mvn clean install
mvn exec:java
```
Ou abra o projeto no NetBeans e clique em **Run**.

---

## 👨‍💻 Autor

**Lucas Rocha de Oliveira**
[github.com/lcslro](https://github.com/lcslro)
