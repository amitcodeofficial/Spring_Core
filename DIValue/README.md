# Dependency Injection
# DI in the form of literals using @Value annotation
@Value - This annotation is used for injecting dependencies(literals) in the dependency eg-(String firstName , int age)
and it can be used at field or setter method level.

***********************************************************************
->(1.) In Config.xml file we can inject values like this :-
 <bean id="customer1" class="Customer">
        <property name="firstName" value="Amit"/>
        <property name="age" value="22"/>
    </bean>

->(2.) And by using annotations we can inject values like this :-
@Value("Amit")
private String firstName;

@Value("22")
private int age;
***********************************************************************

Above we are using @Value annotation directly on variables and injecting values in it statically
and we are doing the same with .xml file providing values statically.
But in order to add values dynamically, we can use a .properties file which consists of same data
and we can change it according to our need.

File-Name - Customer-info.properties
And to read data from this .properties file we use this tag:-
    <context:property-placeholder location="Customer-info.properties"/>
	This tag provides the location of the .properties file and so we can use it to get the values
The values are stored in this file in format and are called as property values:-
customer1.firstName = Amit
customer1.age = 22
(properties)     =  (values)

We read property values from this file by using property tag(in .xml) or @Value annotation(in .java) :-

***********************************************************************
-> In .xml file we can read property values it like this :-
 <bean id="customer" class="com.bridgelab.divalue.Customer">
<property name="firstName" value="${customer1.firstName}"/>
<property name="age" value="${customer1.age}"/>
</bean>

-> In .java we can read property values using @Value :-
@Value("${customer1.firstName}")
private String firstName;

@Value("${customer1.age}")
private int age;
***********************************************************************