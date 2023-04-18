# SoftwareConstructionProject

Final project in HBV202G hugbúnaðarhönnun og forritun

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
- PÆLING HVORT VIÐ ÞURFUM MEIRA HÉR? exec:java, package, site

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

The project has observer design pattern, explained further [here](DesignPattern)

## License
[License link](LICENSE)

## How to run the jar file
To run the jar file you go in the terminal and type in runjar.cmd and enter. You might have to write source before, i.e. source runjar.cmd.

## Pom.xml
`pom.xml` supports to execute the main file
