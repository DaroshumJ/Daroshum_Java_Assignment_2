/* Chapter 9 Ex9.9
 * (What Does Each Code Snippet Do?)

Assume the following method call is in an overridden earnings method in a subclass:

 super.earnings()
Assume that the following line of code appears before a method declaration:

 @Override
Assume the following line of code appears as the first statement in a constructor’s body:

 super(firstArgument, secondArgument);
 
 
 
 1. super.earnings():
This code snippet calls the earnings() method of the superclass. 
When you call super.earnings(), you're explicitly invoking the earnings() 
method defined in the superclass. This can be useful when we want to use or 
extend the functionality of the superclass's method.

2. @Override:
This annotation is used to indicate that a method in a subclass is overriding 
a method of the same name in its superclass. When you annotate a method with 
@Override, you're telling the compiler that you intend to override a 
method from the superclass. If the method signature does not match any method 
in the superclass, the compiler will generate an error.

3. super(firstArgument, secondArgument):
This line of code calls the constructor of the superclass from within the 
constructor of a subclass. This is often used to ensure that common features of 
objects are properly initialized by the superclass before the subclass 
adds its own unique features.
 
*/




 