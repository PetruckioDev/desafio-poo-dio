# Desafio POO DIO

Este é um projeto exemplo de um sistema de Bootcamp para desenvolvedores, utilizando conceitos de Programação Orientada a Objetos (POO) em Java e framework Spring Boot.

## Estrutura do Projeto

O projeto é composto pelas seguintes classes principais:

- `Developer`: Representa um desenvolvedor que pode se inscrever em bootcamps e completar conteúdos.
- `BootCamp`: Representa um bootcamp com uma lista de conteúdos (cursos e mentorias) e uma lista de desenvolvedores inscritos.
- `Content`: Uma classe abstrata que representa o conteúdo que pode ser um `Course` ou `Mentoring`.
- `Course`: Uma classe que estende `Content`, representando um curso.
- `Mentoring`: Uma classe que estende `Content`, representando uma mentoria.

## Dependências

Certifique-se de que as seguintes dependências estejam no seu `pom.xml`:

```xml
<dependencies>
    <!-- Spring Boot Starter Web -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>

    <!-- Lombok -->
    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <version>1.18.20</version>
        <scope>provided</scope>
    </dependency>

    <!-- Spring Boot Starter Test -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
    </dependency>

    <!-- JUnit Jupiter API -->
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter-api</artifactId>
        <version>5.7.1</version>
        <scope>test</scope>
    </dependency>
    
    <!-- JUnit Jupiter Engine -->
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter-engine</artifactId>
        <version>5.7.1</version>
        <scope>test</scope>
    </dependency>
</dependencies>
```

## Executando o Projeto
Para executar o projeto, você pode usar sua IDE preferida (como IntelliJ IDEA ou Eclipse) ou usar o Maven diretamente no terminal:

```bash
mvn spring-boot:run
```

## Testes
O projeto inclui testes de unidade para garantir que a lógica das classes Developer e BootCamp funcionam conforme esperado.

### Estrutura dos Testes
Os testes estão localizados no pacote com.petruckio.desafiopoodio.model e incluem:

 - DeveloperTest: Testa a funcionalidade da classe Developer.

### Executando os Testes
Para executar os testes, você pode usar sua IDE ou o Maven:

```bash
mvn spring-boot:test
```

Aqui está um exemplo de um teste na classe DeveloperTest:

```java
@Test
void testProgressThrowsExceptionWhenNoContent() {
    assertThrows(EmptyContentException.class, () -> devF.progress(), 
            "You are not registered for any content");
}
```
Estrutura do Projeto
A estrutura do projeto é a seguinte:

```css
src
├── main
│   ├── java
│   │   └── com
│   │       └── petruckio
│   │           └── desafiopoodio
│   │               ├── DesafioPooDio.java
│   │               ├── exception
│   │               │   └── EmptyContentException.java
│   │               └── model
│   │                   ├── BootCamp.java
│   │                   ├── Content.java
│   │                   ├── Course.java
│   │                   ├── Developer.java
│   │                   └── Mentoring.java
│   └── resources
│       └── application.properties
└── test
    └── java
        └── com
            └── petruckio
                └── desafiopoodio
                    └── model
                        └── DeveloperTest.java
```


## Contribuição
Se você quiser contribuir para este projeto, sinta-se à vontade para abrir um pull request ou relatar problemas na página de issues.