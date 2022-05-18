# Dependency Injection
# DI using configuration .xml file and .java file

In this we can configure spring by using a xml file as well as in java class file.
This shows that we can use spring in both java side and xml side.

Tags used in this project are:
(1.) @Component - It is a class level annotation and it will automatically create a
	                  bean for the class as it automatically detects by using component scan.
Eg - @Component
         public class Student {}
Now in order to create a bean automatically for this component we have to use 
another annotation which is @ComponentScan.

(2.) @ComponentScan - This annotation scans for the @Component annotation in
the provided package and it will create the bean for that class where component annotation is used.
It enables component scanning with @ComponentScan.
-> In java it is used on config class like this - 
@Configuration
@ComponentScan(basePackages = "package_name")
public class Config {}

-> In .xml file it is used like this - 
<context:component-scan base-package="package_name"/>

(3.) @Configuration - Spring @Configuration annotation is part of the spring core framework.
Spring @Configuration annotation indicates that the class has @Bean definition methods.
So Spring container can process the class and generate Spring Beans to be used in the application.
@Configuration indicates that the class can be used by the Spring IoC container as a source of bean definitions.
@Configuration annotation indicates that a class declares one or more @Bean methods and may be,
 processed by the Spring container to generate bean definitions and service requests for those beans at runtime.
Once your configuration classes are defined, you can load and provide them,
to Spring container using AnnotationConfigApplicationContext.

To use configuration class use this -
ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
With this we tell our IOC container that beans are in this config.class as we did for .xml file.

(4.) @Bean - @Bean is a method level annotation.It requires @Configuration annotation to use.
@Bean is used to mark a method as one that creates a bean and Spring will then add it to the context for us.
A bean is an object that is instantiated, assembled, and otherwise managed by a Spring IoC container.
-> To create a bean in config class -
@Bean
public College college1(){
           return new College();
}
-> To create a bean in xml file - 
<bean id="college1" class="provide_qualified_name"></bean>