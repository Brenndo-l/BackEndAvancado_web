# programacao-avancada-back-end-t6

Repositório da disciplina Programação Avançada Back-end (Turma 6)

<details>

<summary>
    <h2>Atualizando seu repositório local</h2>
</summary>

O código produzido em sala de aula, e compartilhado neste repositório, pode ser atualizado em seu repositório local com o comando:

```console
git pull
```

No entanto, se você fez alterações no seu repositório local, o comando acima pode gerar conflitos. Para evitar lidar com isso, você pode forçar uma atualização com o repositório remoto por meio dos comandos:

```console
git fetch origin
git reset --hard origin/main
```

O primeiro comando recebe as atualizações mais recentes do repositório remoto, e o segundo descarta todas as alterações locais e atualiza com o histórico mais recente do repositório remoto (branch main).

</details>

<details>

<summary>
    <h2>Como inciar a aplicação</h2>
</summary>

A aplicação back-end pode ser iniciada pelo Spring Boot Dashboard ou diretamente com o Maven.

1. No Spring Boot Dashboard, clicar em "Run" na aplicação "sgcmapi".

2. No prompt de comandos, a partir do diretório `./sgcmapi`:

    a. Para iniciar a aplicação com o Maven:

    ```console
    mvn spring-boot:run
    ```

    Ou

    b. Para compilar o pacote e depois executar o JAR gerado:

    ```console
    mvn package
    java -jar target\sgcmapi.jar
    ```

A aplicação vai iniciar no endereço <http://localhost:9000/>, com acesso local a base de dados MySQL, por meio da porta padrão 3306, além de usuário e senha "root".

</details>

<details open>

<summary>
    <h2>Sites de referência</h2>
</summary>

- Spring Boot Reference Documentation: <https://docs.spring.io/spring-boot/docs/3.2.6/reference/html/index.html>
- Spring Getting Started Guides: <https://spring.io/guides#getting-started-guides>
- Swagger Documentation: <https://swagger.io/docs/>
- Baeldung: <https://www.baeldung.com/>

</details>

<details>

<summary>
    <h2>Ferramentas</h2>
</summary>

- **Visual Studio Code**
  - <https://code.visualstudio.com/Download>
- **Extension Pack for Java (Extensão do VS Code)**
  - <https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack>
- **Spring Boot Extension Pack (Extensão do VS Code)**
  - <https://marketplace.visualstudio.com/items?itemName=pivotal.vscode-boot-dev-pack>
- **XML (Extensão do VS Code)**
  - <https://marketplace.visualstudio.com/items?itemName=redhat.vscode-xml>
- **Git**
  - <https://git-scm.com/downloads>
- **Postman**
  - <https://www.postman.com/downloads/>
  - Link para download da coleção compartilhada (contendo requisições utilizadas nas aulas): <https://api.postman.com/collections/19704449-a6115254-3fb3-472f-8d67-b674f22fcc44?access_key=PMAT-01J9M2RXF4MD4Z9M2HQF0XRCNR>
    - Para importar a coleção no Postman, clique em `Import` e cole o link acima.
- **JDK 17**
  - Para verificar se o JDK está corretamente instalado e configurado, digite no prompt de comandos:

    ```console
    javac -version
    ```

  - Se necessário, realizar a instalação e configuração:
    - Link para download: <https://download.oracle.com/java/17/archive/jdk-17.0.10_windows-x64_bin.msi>
    - Criar a variável de ambiente JAVA_HOME configurada para o diretório de instalação do JDK. Exemplo: “C:\Program Files\Java\jdk-17”.
    - Adicionar “%JAVA_HOME%\bin” na variável de ambiente PATH.
    - Tutorial de configuração: <https://mkyong.com/java/how-to-set-java_home-on-windows-10/>
- **Maven**
  - Para verificar se o Maven está corretamente instalado e configurado, digite no prompt de comandos:

    ```console
    mvn -version
    ```

  - Se necessário, realizar a instalação e configuração:
    - Link para download: <https://dlcdn.apache.org/maven/maven-3/3.8.8/binaries/apache-maven-3.8.8-bin.zip>
    - Adicionar o diretório de instalação do Maven na variável de ambiente PATH. Exemplo: “C:\apache-maven\bin”.
    - Tutorial de instalação: <https://mkyong.com/maven/how-to-install-maven-in-windows/>
- **MySQL**
  - Verificar se o MySQL está funcionando:
    - Para tentar conectar no MySQL, no prompt de comandos digite:

      ```console
      mysql -u root -p
      ```

    - Tentar acessar com senha em branco ou senha igual ao nome de usuário (root).
    - Tutorial para resetar a senha de root, caso necessário: <https://dev.mysql.com/doc/mysql-windows-excerpt/8.0/en/resetting-permissions-windows.html>
  - Remova o banco de dados `sgcm`, se existir:
    - No prompt de comandos digite:
  
      ```console
      mysql -u root -p
      ```
  
    - Ao conectar no MySQL, execute a seguinte instrução SQL:

      ```sql
      DROP DATABASE sgcm;
      ```
  
  - Se necessário, realizar a instalação:
    - Link para download: <https://dev.mysql.com/downloads/file/?id=516927>
    - [Tutorial de instalação](https://github.com/webacademyufac/tutoriais/blob/main/mysql/mysql.md)

</details>

<details>

<summary>
    <h2>SGCM - Sistema de Gerenciamento de Clínica Médica</h2>
</summary>

A demonstração de uso das ferramentas e tecnologias abordadas na capacitação é baseada em um projeto de exemplo, o SGCM. A documentação básica deste projeto está disponível [em outro repositório](https://github.com/webacademyufac/sgcmdocs) e aborda os seguintes tópicos:

- [Principais funcionalidades](https://github.com/webacademyufac/sgcmdocs#principais-funcionalides)
- [Histórias de usuário](https://github.com/webacademyufac/sgcmdocs#histórias-de-usuário)
- [Diagrama de Classes](https://github.com/webacademyufac/sgcmdocs#diagrama-de-classes)
- [Diagrama Entidade Relacionamento](https://github.com/webacademyufac/sgcmdocs#diagrama-entidade-relacionamento)

</details>
