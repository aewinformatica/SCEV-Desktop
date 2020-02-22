# SCEV-Desktop
Sistema de Controle de Estoque e Vendas - Desktop

* Criação da Estrutura do Projeto usando Maven;
* Inclusão Spring,Conectores de BD, Configuração da Classe Application
* Criação da ViewPrincipal e seu Controller e Application.properties
* Criação do modelo Usuario Mapeamento Usando Hibernate Jpa
* Inclusao do Flyway no Projeto para migração dos Dados do BD - Deshabilitado geração automatica de entidades
* Criação da ViewLogin e seu controller
* Criação da Interface  Usuarios como Repository de Usuario 
* Criação da Interface UsuariosQueries e Implementacao de metodo  validarLoginSenha
* Criação da Camada de Servico UsuarioService para Gerenciar Usuario e metodo validarLoginSenha
* Criação da Camada de Servico LoginService para manter padrão e utilizar validação do Usuario
* Inclusao de Modelos Compartilhados para Entidades em Componentes Jtable e ComboBox
* criado Panel para inclusao Jtable de Usuarios com o Modelo para entidades
* Criado ViewUsuario para Exibir Usuarios Cadastrados
* Criado Classe Abstrata com metodos para manipular eventos dos components Swing