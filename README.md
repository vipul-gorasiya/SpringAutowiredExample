# Spring @Autowired examples

## How is it used in example

1. [ExampleService.java](SpringAutowiredExample/src/main/java/com/vipul/ExampleService.java) has following examples:
	- Autowiring of all beans of that type in Set, Array, List and Map
	- Autowiring through strong types of beans
	- Autowiring primary bean (Example of @Primary with @Service)
	- Autowiring primary bean (Example of @Primay with @Bean)
	- @Qualifier example
	- Autowiring through constructor
	- @Qualifier in constructor argument

## Importing and running project

1. Import project as Maven project
2. Run application as Spring Boot Application
3. Observe log to see the sequence of execution and relate it with the code in ExampleService.java
