# Design Patterns

<em>**source**</em>
- https://elqoo.thinkific.com/courses/take/design-patterns-in-java
- https://www.coursera.org/learn/design-patterns

<hr />

## Contents
- [Creational Patterns](#creational-patterns)
    - [Singleton Pattern](#singleton) 
    - [Builder Pattern](#builder)
    - [Factory Object](#factory-object)
    - [Factory Method](#factory-method)

<hr /> 

## <a name="#creational"></a>Creational Patterns
### <a name="#singleton"></a>Singleton
##### Keys
- One instance + one access point.
- Encapsulate the constructor. Only allow accessing through getInstance method.
- Use a variable to validate uniqueness of the instance.
- Prevent creating new instances, hence prevent conflict and make it consistent.

##### When
- Only one instance of class required.
- Must be one access point.
- Need to manage object instances
- e.g. FileSystem, Window Manager

##### Benefits
- Controlled access to one instance.
- Reduce name space (Avoids global variables).
- The ability to subclass the singleton class.
- Can configure the number of instances.
- lazy constructor: the object is not created until it's needed.

##### Drawbacks
- State of the singleton must be shareable between program executions.


### <a name="#builder"></a>Builder
![image](resources/builder-pattern-structure.png)
##### Keys
- 'Separate the construction' of a complex object from its representation so that the same construction process can create different representations
- **One build process** for multiple similar objects
- **Advance control** over the build process.

##### When
- Separate construction with internal representation.
- One process have multiple object representation (or various implementation)
- need to assemble objects
- e.g. query construction to use with many databases

##### Implementation
- have object and builder interface.
- each can have various implementation.
1. Client creates a concreteBuilder.
2. Client creates a new director and pass concreteBuilder to the director.
3. Director constructs the objects by buildPart().
4. Client asks the result from concreteObject that got built.

##### Benefits
- Uniform production creation via an interface.
- Abstract building process.
- Loose coupling (separate construction from representation).
- Finer control on the build process -> Allow multiple steps or assemble objects more easily.

### <a name="#factory-object"></a>Factory Object (not gang of four's)
##### Keys
- Factory could create various type of object without changing Client code.
- coding to interface, not implementation.

##### Benefits
- Clients can instantiate the same set of classes.
- Cut out redundant code and made the software easier.

### <a name="#factory-method"></a>Factory Method
##### Keys
- Define an interface for creating objects, but let subclasses decide which class to instantiate.
- Virtual Constructor: Factory Method lets a class defer instantiation to subclasses.
- Instead of creating a new instance, using Factory method able us to generalize the class, hence 'coding to interface, not implementation'

##### When
- Class can't expect the type of object it must create.
- Subclasses must decide what types of objects are to be created.

##### Benefits
- Delegate object creation until runtime.
- Hooks for subclasses.
- Base class can provide a 'default implementation'.