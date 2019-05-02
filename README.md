# Universal Data Convertor

Universal Data Convertor is a tool to convert data from a format to another format. 

## Summary
* Getting Started (Prerequisites, Installing)
* Running the tests
* Deployment
* Built With
* Do you have any issue?
* Contributing
* Versioning
* Authors
* License
* Donation

## Getting Started

Clone or download a copy of this project.

### Prerequisites

This project requires Java 1.8, MySQL and Maven.

### Installing

After MySQL instalation, it is required to create a dabase:

```
CREATE DATABSE udc;
```
Execute the content of `.sql` files, such as: 
```
chart_type.sql
data.sql
```
All this files contains initial data. Just copy and paste the file's content Go to downloaded folder and create the build (you should have something similar like the following):
```
SDR:universal-data-convertor sdrahnea$ mvn clean compile package
[INFO] Scanning for projects...
[INFO] 
[INFO] ------------------< com.udc:universal-data-convertor >-------------------
[INFO] Building universal-data-convertor 0.0.1-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-clean-plugin:2.6.1:clean (default-clean) @ universal-data-convertor ---
[INFO] Deleting /my-projects/universal-data-convertor/target
[INFO] 
[INFO] --- maven-enforcer-plugin:1.4.1:enforce (enforce-versions) @ universal-data-convertor ---
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ universal-data-convertor ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO] Copying 69 resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.7.0:compile (default-compile) @ universal-data-convertor ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 127 source files to /my-projects/universal-data-convertor/target/classes
[INFO] /my-projects/universal-data-convertor/src/main/java/com/oms/controller/AbstractController.java: Some input files use unchecked or unsafe operations.
[INFO] /my-projects/universal-data-convertor/src/main/java/com/oms/controller/AbstractController.java: Recompile with -Xlint:unchecked for details.
[INFO] 
[INFO] --- maven-enforcer-plugin:1.4.1:enforce (enforce-versions) @ universal-data-convertor ---
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ universal-data-convertor ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO] Copying 69 resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.7.0:compile (default-compile) @ universal-data-convertor ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ universal-data-convertor ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /my-projects/universal-data-convertor/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.7.0:testCompile (default-testCompile) @ universal-data-convertor ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- maven-surefire-plugin:2.18.1:test (default-test) @ universal-data-convertor ---
[INFO] No tests to run.
[INFO] 
[INFO] --- maven-jar-plugin:3.0.2:jar (default-jar) @ universal-data-convertor ---
[INFO] Building jar: /my-projects/universal-data-convertor/target/universal-data-convertor-0.0.1-SNAPSHOT.jar
[INFO] 
[INFO] --- spring-boot-maven-plugin:1.5.7.RELEASE:repackage (default) @ universal-data-convertor ---
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  8.183 s
[INFO] Finished at: 2019-01-10T10:14:15+02:00
[INFO] ------------------------------------------------------------------------
SDR:universal-data-convertor sdrahnea$ 
```

## Running the tests

This project does not have any kind of tests :).

## Deployment

Once the build (the jar file) is ready the application can be run. Please, use the following command to run the application:
```
SDR:universal-data-convertor sdrahnea$ java -jar target/universal-data-convertor-0.0.1-SNAPSHOT.jar
```
If was used default configuration then the application should be available at this url: http://localhost:8081/oms/login.xhtml 
Use the following credentials: username: admin, password: 123.

## Built With

* [Java](https://www.java.com/en/download/) - Java technology allows you to work and play in a secure computing environment. Java allows you to play online games, chat with people around the world, calculate your mortgage interest, and view images in 3D, just to name a few.
* [PrimeFaces](https://www.primefaces.org/) - PrimeFaces is a popular open source framework for JavaServer Faces featuring over 100 components, touch optimized mobilekit, client side validation, theme engine and more.
* [Spring Security](https://spring.io/projects/spring-security) - Spring Security is a powerful and highly customizable authentication and access-control framework. It is the de-facto standard for securing Spring-based applications.
* [Spring Boot](https://spring.io/projects/spring-boot) - Spring Boot makes it easy to create stand-alone, production-grade Spring based Applications that you can "just run".
* [Spring Data](https://spring.io/projects/spring-data) - Spring Data’s mission is to provide a familiar and consistent, Spring-based programming model for data access while still retaining the special traits of the underlying data store.
* [Spring Data JPA](https://spring.io/projects/spring-data-jpa) - Spring Data JPA, part of the larger Spring Data family, makes it easy to easily implement JPA based repositories. This module deals with enhanced support for JPA based data access layers. It makes it easier to build Spring-powered applications that use data access technologies.
* [MySQL](https://www.mysql.com/) - MySQL is the world's most popular open source database. Whether you are a fast growing web property, technology ISV or large enterprise, MySQL can cost-effectively help you deliver high performance, scalable database applications.
* [Maven](https://maven.apache.org/) - Apache Maven is a software project management and comprehension tool. Based on the concept of a project object model (POM), Maven can manage a project's build, reporting and documentation from a central piece of information. 

## Do you have any issue?

Please contact via LinkedIn account or drop an email (read [LICENSE.md](LICENSE.md) file) or create an issue into project's space.

## Contributing

Please read [CONTRIBUTING.md](CONTRIBUTING.md) for details on our code of conduct, and the process for submitting pull requests to us.

## Versioning

We use [SemVer](http://semver.org/) for versioning.

## Authors

* **Sergiu Drahnea** - *Initial work* - [LinkedIn](https://www.linkedin.com/in/sergiu-drahnea-563745123)

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Donation
* [PayPal](https://www.paypal.me/sdrahnea) - any donation is welcomed in case that you was pleased with this work :p

