#### Descrição do Sistema UNIPE JET
Este sistema deve apresentar funcionalidades parecidas como os presentes em um controle de venda de passagens aéreas ou de onibus.

#### Tecnologias Back-End
* Spring MVC
* Spring Security
* Spring Core
* Spring ORM
* Hibernate
* JSP
* Servlet

#### Tecnologias Front-End
  * AdminLTE
  * HTML5
  * CSS3
  * JQuery
  * DataTables
  * Datepicker
  * JQuery Maskmoney

#### Tecnologias Controle de Dependências
  * Maven

#### Tecnologias Banco de Dados
  * MySQL

#### Configuração
Na pasta resources modificar os parâmetros do arquivo application.properties

```
jdbc.url = jdbc:mysql://localhost/nome-da-tabela
jdbc.username = senha do mysql
jdbc.password = senha do mysql caso não tenha deixar em branco
```

#### Adicionando usuário

Executar as querys abaixo.

Usuário.: admin
Senha.: abc125

```sql
INSERT INTO app_user(sso_id, password, first_name, last_name, email)
VALUES ('admin','$2a$10$4eqIF5s/ewJwHK1p8lqlFOEm2QIA0S8g6./Lok.pQxqcxaBZYChRm', 'Thomas','Matheus','thomas_matheus60@hotmail.com');
```

Inserido permissões
```sql
INSERT INTO user_profile(type)
VALUES ('USER');
  
INSERT INTO user_profile(type)
VALUES ('ADMIN');
```

Atribuindo permissão
```sql
INSERT INTO app_user_user_profile (user_id, user_profile_id)
  SELECT user.id, profile.id FROM app_user user, user_profile profile
  where user.sso_id = 'admin' and profile.type = 'ADMIN';
```

