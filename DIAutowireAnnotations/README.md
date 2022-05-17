# Dependency Injection
# DI using @Autowire and @Qualifier Annotation
@Autowire - autowire annotations implicity injects the object dependency.
Its disadvantage is that it cannot be used with the primitive values
because it checks for only beans (object) in xml file.

@Qualifier - qualifier annotations is used to differentiate between the same 
type of bean objects.
Its main use is that it resolves the autowire conflict, when there are
multiple beans of same type.