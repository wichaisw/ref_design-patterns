# Design Patterns

## Creational Patterns
### Singleton
##### Keys
- One instance + one access point.
- Encapsulate constructor. Only allow accessing throgh getInstance method.
- Use a variable to validate uniqueness of the instance.
- Prevent creating new instances, hence prevent conflict and make it consistent.

##### Issues
- Multiple classes require the same object instance.
- There 'can only be one' object for the entire application.
- It must be guaranteed that there is only one object.
- e.g. FileSystem, Window Manager

##### When
- Only one instance of class required.
- Must be one access point.
- Need to manage object instances

##### Benefits
- Controlled access to one instance.
- Reduce name space (Avoids global variables).
- The ability to subclass the singleton class.
- Can configure the number of instances.
- lazy constructor: the object is not created until it's needed.

##### Drawbacks
- State of the singleton must be shareable between program executions.
