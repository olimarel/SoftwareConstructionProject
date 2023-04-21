# SoftwareConstructionProject

Final project in HBV202G hugbúnaðarhönnun og forritun

## Description:

This is a takeaway food order system developed using
Java and JavaFX frameworks. It allows the user to place an
order, provide the necessary personal information and simulate a payment process as well.
This project was initially created in HBV201G Viðmótsforritun but necessary changes were made for HBV202G
Hugbúnaðarhönnun og forritun.

## Running the project

You can run the project using various methods:

- Running `Main` or `TakeAwayApplication` directly
- Running the project with maven
- Running the jar file (more info later in this readme file)

## Maven:

- `mvn compile` compiles all implementation classes.
- `mvn test` runs all test cases (i.e. all classes with a name that either starts with `Test` or ends
  with `Test`, `Tests`, or `TestCase`).
- `mvn package` packages a jar file and executable jar file
- `mvn exec:java` runs the project

## UML Class diagram:

[UML Class Diagram](src/site/resources/UMLClassDiagram.png)

## Design patterns:

The project has observer design pattern, explained further [here](DesignPattern)

## License

[License link](LICENSE)

## How to run the jar file

To run the jar file:

1. run: `mvn clean package`
2. run the prompt command: `source runjar.cmd`.

## Pom.xml

`pom.xml` supports to execute the main file
