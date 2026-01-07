📌 Task Management API

A Task Management API é uma aplicação moderna e simples para gerenciamento de tarefas, desenvolvida com foco em boas práticas, código limpo e arquitetura sustentável.
Mesmo utilizando apenas uma entidade principal (Task), o projeto foi pensado para refletir padrões encontrados em sistemas reais, sendo ideal para estudo e portfólio.

🚀 Funcionalidades

📋 Gerenciamento de Tarefas
- Criar tarefa
- Atualizar tarefa
- Listar todas as tarefas
- Consultar tarefa por ID
- Excluir tarefa

⭐ Atributos da Task
- title
- description
- status → TODO | DOING | DONE
- priority → LOW | MEDIUM | HIGH
- dueDate
- createdAt

🔎 Filtro por Prazo
- A API oferece filtros inteligentes para consulta de tarefas baseadas no prazo:
- Overdue → tarefas com prazo vencido
- Today → tarefas que vencem hoje
- Upcoming → tarefas com prazo futuro

Exemplo de uso:
GET /tasks?dueStatus=overdue
GET /tasks?dueStatus=today
GET /tasks?dueStatus=upcoming

🧠 Regras de Negócio
- Não permite criação de tarefa sem título
- Não permite definição de dueDate no passado
- Comparação de prazo baseada em data

🏗️ Base Técnica
- Java 17
- Spring Boot
- Lombok para redução de boilerplate
- PostgreSQL como banco de dados principal
- Docker para padronização e execução do ambiente
- Swagger para documentação da API

🎯 Objetivo do Projeto
- Este projeto foi criado com foco em:
- Demonstrar boas práticas de desenvolvimento
- Estruturar um projeto limpo mesmo em cenários simples
- Servir como base para estudos e evolução futura
- Compor um portfólio sólido e profissional

📈 Possíveis Evoluções Futuras
- Autenticação e perfis de usuário
- Paginação e ordenação avançada
- Relatórios de produtividade
- Notificações
- Dashboard
- Multitenancy

🧪 Qualidade
- Arquitetura organizada
- Preparado para testes
- Fácil manutenção e evolução
