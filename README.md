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

## To do:

* Renna yfir forrit og athuga hvort öll breytuheiti eru á ensku (DONE)
* Gera javadoc fyrir hvert fall (DONE)
* Klára UML class diagram (DONE)
* Láta jar skrárnar virka (done) virkar ekki hja mér?
* Finna út úr Design Pattern (DONE)
*
* endUserDocumentation? ég bætti við howtorunjar en veit ekki hvort þurfi eh meira?
* þurfum við pom dæmið úr verkefni 10? setti það inn

## Maven:

- `mvn compile` compiles all implementation classes.
- `mvn test` runs all test cases (i.e. all classes with a name that either starts with `Test` or ends
  with `Test`, `Tests`, or `TestCase`).
- `mvn package` packages a jar file and executable jar file
- `mvn site`
- PÆLING HVORT VIÐ ÞURFUM MEIRA HÉR? exec:java, package, site

## UML Class diagram:

[UML Class Diagram](src/site/resources/UMLClassDiagram.png)

## Project needs to have:

* Git (done)
* Maven (done)
* Junit tests for backend (done)
* Design patterns (done semi, bara spurning hvort við þurfum að bæta eh við því við erum bara með einn listener)
* Refactoring for self explaining code (done)
* Packaged jar file and command provided (done)
* Documentation, UML design needs to be a part of it, also mention where a pattern is used, what maven goals are
  supported, license and end user documentation, e.g how to run jar file (hmm við erum ekki með how to run a jar file??)

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
