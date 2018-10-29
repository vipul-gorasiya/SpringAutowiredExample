# Spring @Autowired examples

## How is it used in example

1. ExampleService.java has following examples:
	a. Autowiring of all beans of that type in Set, Array, List and Map
	b. Autowiring through strong types of beans
	c. Autowiring primary bean (Example of @Primary with @Service)
	d. Autowiring primary bean (Example of @Primay with @Bean)
	e. @Qualifier example
	f. Autowiring through constructor
	g. @Qualifier in constructor argument

## Importing and running project

1. Import project as Maven project
2. Run application as Spring Boot Application
3. Observe log to see the sequence of execution and relate it with the code in ExampleService.java
