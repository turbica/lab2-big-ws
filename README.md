[![Build Status](https://travis-ci.com/UNIZAR-30246-WebEngineering/lab2-big-ws.svg?branch=master)](https://travis-ci.com/UNIZAR-30246-WebEngineering/lab2-big-ws)
# Web Engineering 2020-2021 / Big Web Services
**In this assignment your PR must only modify the `README.md` file**. Please, go to the [Wiki](https://github.com/UNIZAR-30246-WebEngineering/lab2-big-ws/wiki) in order to get the instructions for this assignment.


## Primary goal

`DummyTranslator` should throw a `RuntimeException` rather than return a fake response.
Fix this and protect the testing code against:

- Network failures (e.g. the remote web service is down)
- Remote service failures (e.g. the remote web service throws an exception)

Always use a solution related to web services. It is super easy!

## Secondary goals (:gift:)

Solutions must meet primary goals too. 

Granted:
- [Upgrade to WSDL 2.0 and SOAP 1.2](https://github.com/luisgg98/lab2-big-ws/tree/WSDL2.0_AND_SOAP1.2). Achieving this goal Luis García has learnt that the support promised by Spring Web Services for WSDL 2.0 is deceiving but the support for SOAP 1.2 is ok and can be used as transport independed of the WSDL version used :gift:

Proposed:

- Secure the endpoint [WS-Security](https://docs.spring.io/spring-ws/docs/3.0.10.RELEASE/reference/#security)
- Project splits in two (client/server), and the `build.gradle` of the client generates classes from a `wsdl` file retrieved from the server during the build 
- Re-implement the project following [Writing Contract-First Web Services tutorial](https://docs.spring.io/spring-ws/docs/3.0.10.RELEASE/reference/#tutorial)
- Re-implement the project with [gRPC](https://yidongnan.github.io/grpc-spring-boot-starter/en/)
- Re-implement the project with [GraphQL](https://www.graphql-java.com/tutorials/getting-started-with-spring-boot/)
- Re-implement the project with [Thrift](https://github.com/aatarasoff/spring-thrift-starter)

New ideas will be provided if the gift list gets exhausted.

Manifest your intention first by a PR updating this `README.md` with your goal.
If you desist of your goal, release it by a PR so other fellow can try it. 

|NIA    | User name | Repo | Build Status | What was explored | Review for :gift: | Score
|-------|-----------|------|--------------|-------------------|----------------------|--------
|758906 |[Raul Javierre](https://github.com/rauljavierre)|[rauljavierre/lab2-big-ws](https://github.com/rauljavierre/lab2-big-ws/tree/test)|![Build Status](https://travis-ci.com/rauljavierre/lab2-big-ws.svg)|JUnit, code generation|Re-implement the project with [GraphQL](https://www.graphql-java.com/tutorials/getting-started-with-spring-boot/)|
|758267 |[Pedro Allué](https://github.com/piter1902)|[piter1902/lab2-big-ws](https://github.com/piter1902/lab2-big-ws/tree/test) |  [![Build Status](https://travis-ci.com/piter1902/lab2-big-ws.svg?branch=test)](https://travis-ci.com/piter1902/lab2-big-ws)    |  JUnit Tests     |                      |
|757153 |[Fran Morés])(https://github.com/Fran-sw)|[Fran-sw/lab2-big-ws](https://github.com/Fran-sw/lab2-big-ws/tree/test) |[![Build Status](https://travis-ci.com/Fran-sw/lab2-big-ws.svg)](https://travis-ci.com/Fran-sw/lab2-big-ws)       | Spring exceptions (Runtime and Service), JUnit tests|                      |
|761319 |[Marcos Nuez])(https://github.com/Markles01)|[Markles01/lab2-big-ws](https://github.com/Markles01/lab2-big-ws/tree/test) |[![Build Status](https://travis-ci.com/Markles01/lab2-big-ws.svg)](https://travis-ci.com/Markles01/lab2-big-ws)       | JUnit tests, Spring exceptions|                      |
|755769 |[Saúl Flores](https://github.com/saul205)|[saul205/lab2-big-ws](https://github.com/saul205/lab2-big-ws/tree/test)|![Build Status](https://travis-ci.com/saul205/lab2-big-ws.svg?branch=test)|[JUnit Exception Testing](https://github.com/junit-team/junit4/wiki/Exception-testing)| Re-implement the project with [gRPC](https://yidongnan.github.io/grpc-spring-boot-starter/en/)
|739202 |[Luis García](https://github.com/luisgg98)|[luisgg98/lab2-big-ws](https://github.com/luisgg98/lab2-big-ws/) |  [![Build Status](https://travis-ci.com/luisgg98/lab2-big-ws.svg)](https://travis-ci.com/luisgg98/lab2-big-ws)    |  Exception Tests  |  [Upgrade to WSDL 2.0 and SOAP 1.2](https://github.com/luisgg98/lab2-big-ws/tree/WSDL2.0_AND_SOAP1.2) | :gift: |  
|756123 |[Rogelio Lacruz](https://github.com/RogorStuff)|[RogorStuff/lab2-big-ws](https://github.com/RogorStuff/lab2-big-ws/tree/test) |[![Build Status](https://travis-ci.org/RogorStuff/lab2-big-ws.svg)](https://travis-ci.org/RogorStuff/lab2-big-ws)    | Spring exceptions, JUnit tests |                      |
|760704 |[Álvaro García](https://github.com/Alvarogd6)|[Alvarogd6/lab2-big-ws](https://github.com/Alvarogd6/lab2-big-ws/tree/test)|![Build Status](https://travis-ci.com/Alvarogd6/lab2-big-ws.svg?branch=test)|JUnit, Spring ws exceptions| Re-implement the project with [Thrift](https://github.com/aatarasoff/spring-thrift-starter)   |
|760739 |[Alberto Calvo](https://github.com/AlbertoCalvoRubio)|[AlbertoCalvoRubio/lab2-big-ws](https://github.com/AlbertoCalvoRubio/lab2-big-ws/tree/test)|![Build Status](https://travis-ci.com/AlbertoCalvoRubio/lab2-big-ws.svg?branch=test)|Spring Ws exceptions, Junit|                      |
|766685 |[Enrique Ruiz](https://github.com/TheRealFreeman) | [TheRealFreeman/lab2-big-ws](https://github.com/TheRealFreeman/lab2-big-ws/tree/test) | ![Build Status](https://api.travis-ci.com/TheRealFreeman/lab2-big-ws.svg?branch=test) | JUnit and WSDL description |                      |
|755742 |[Juan José Tambo](https://github.com/jtambo99)|[jtambo99/lab2-big-ws](https://github.com/jtambo99/lab2-big-ws/tree/test)|[![Build Status](https://travis-ci.com/jtambo99/lab2-big-ws.svg?branch=test)](https://travis-ci.com/jtambo99/lab2-big-ws) | JUnit test & Spring exceptions |                         | 
|758325 |[Irene Fumanal](https://github.com/irefu)|[irefu/lab2-big-ws](https://github.com/irefu/lab2-big-ws/tree/test) |  [![Build Status](https://travis-ci.org/irefu/lab2-big-ws.svg?branch=test)](https://travis-ci.org/github/irefu/lab2-big-ws)    |  JUnit Tests and Exception    |                      |
|757755 |[Andrés Otero](https://github.com/andrewknoll)|[andrewknoll/lab2-big-ws](https://github.com/andrewknoll/lab2-big-ws/tree/test) |  [![Build Status](https://travis-ci.com/andrewknoll/lab2-big-ws.svg?branch=test)](https://travis-ci.com/github/andrewknoll/lab2-big-ws)    |  JUnit tests, thrown exceptions (by Spring)    |                      |
|740491 |[José Ignacio Hernández](https://github.com/740491)|[740491/lab2-big-ws](https://github.com/740491/lab2-big-ws/tree/test)| ![Build Status](https://travis-ci.com/740491/lab2-big-ws.svg) | Spring exceptions, testing | | 
|738845 |[Victor Martinez](https://github.com/viriannn)|[viriannn/lab2-big-ws](https://github.com/viriannn/lab2-big-ws/tree/test)|![Build Status](https://travis-ci.com/viriannn/lab2-big-ws.svg?branch=test)| Test and exceptions |                      |
