# SoftwareConstructionProject

Final project in HBV202G hugbúnaðarhönnun og forritun

## To do:

* Renna yfir forrit og athuga hvort öll breytuheiti eru á ensku (done)
* Gera javadoc fyrir hvert fall (done)
* Klára UML class diagram
* Láta jar skrárnar virka (done) 
* Finna út úr Design Pattern (done)
* hmm erum við með þetta?...but also mention where a pattern is used, but also some end-user documentation, e.g., on how to run your jar.
* endUserDocumentation? ég bætti við howtorunjar en veit ekki hvort þurfi eh meira?
* þurfum við pom dæmið úr verkefni 10?

## Maven:

- `mvn compile` compiles all implementation classes.
- `mvn test` runs all test cases (i.e. all classes with a name that either starts with `Test` or ends
  with `Test`, `Tests`, or `TestCase`).

## UML Class diagram:

[UML Class Diagram](src/site/resources/UMLClassDiagram.png)

## Project needs to have:

* Git (done)
* Maven (done)
* Junit tests for backend (done)
* Design patterns (done semi, bara spurning hvort við þurfum að bæta eh við því við erum bara með einn listener)
* Refactoring for self explaining code (done)
* Packaged jar file and command provided
* Documentation, UML design needs to be a part of it, also mention where a pattern is used, what maven goals are
  supported, license and end user documentation, e.g how to run jar file (hmm við erum ekki með how to run a jar file??)

## Design patterns:

Uses the observer pattern on multiple occasions. Creating changelisteners and observable properties and list that are
bound together. hmmm það er bara einu sinni, þurfum við að bæta við verkefnið?

The design pattern in the project explained [here](DesignPattern)

## License
[License link](LICENSE)

## How to run the jar file

To run the jar file you go in the terminal and type in runjar.cmd and enter. You might have to write source before, i.e. source runjar.cmd.
