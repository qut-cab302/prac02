This week's practical exercises aim to get you familiar with object-oriented programming and exceptions in Java.


# Shapes

This exercise will give you experience in polymorphism.

You are provided with the `Shape` interface. Create three implementations of `Shape`, implementing the volume and surface area methods required by the interface as follows:

## `Tetrahedron(double edge)`

![](imgs/tetrahedron_vol.png)

![](imgs/tetrahedron_sa.png)


## `Cylinder(double radius, double height)` 

![](imgs/cylinder_vol.png)

![](imgs/cylinder_sa.png)


## `Cube(double edge)`

![](imgs/cube_vol.png)

![](imgs/cube_sa.png)



You can verify your classes work by constructing objects from them and checking that `volume` and `surfaceArea` return the correct results.

Your second task is to use polymorphism to complete the two methods in the `ShapeHandler` class:

```java
package shapes;

public class ShapeHandler {

    // Returns the sum of the volumes of the given shapes.
    public static double volumeSum(Shape[] shapes) {
        return 0;
    }

    // Returns the sum of the surface areas of the given shapes.
    public static double surfaceAreaSum(Shape[] shapes) {
        return 0;
    }

}
```

You can test that you have implemented `ShapeHandler` correctly by constructing an array of various shapes and passing them to your `ShapeHandler` methods.


**Question**:  Why do we make the Shape methods non-static but the ShapeHandler methods static?


# A superhero class hierarchy

This exercise will give you experience at interpreting Application Programming Interface documentation and developing non-trivial class hierarchies, including a Java _interface_, _abstract class_ and _concrete classes_.

Comic book superheroes remain in vogue thanks to the financial success of the recent Marvel movies. In this exercise you will develop a type hierarchy that models the characteristics of comic book superheroes. (But for testing purposes we will use 'Golden Age' superheroes from the 1940s and 1950s since these were when superheroes peaked.)

Enclosed with these instructions you will find the API documentation for a 'superhero' class hierarchy, along with two Java files:

* Enumerated type `SuperPower.java` which lists the superpowers available to
Golden Age superheroes.
*  A 'main' program `HeroTester.java` which will work fully only when you have completed the exercise. You will probably want to comment out some of the tests during code development. We suggest you begin with just the tests related to mortal superheroes uncommented. Once you have got this class working, uncomment some of the other tests.

Included in this documentation is the role of each class and the intended purpose of its members, as well as brief hints about intended usage.

Your task is to study the API documentation and, based on this, to implement the missing classes, `Hero.java`, `SuperHero.java`, `Human.java`, `EnhancedHuman.java` and `SuperHuman.java`. These classes form a hierarchy as shown overleaf. Make sure you read _all_ the API documentation and clearly understand how the various classes and their methods relate to one another _before_ you start writing code. Also, try to make good use of IntelliJ's "intention action" features to help you develop the code quickly. For instance, when creating a subclass you can get IntelliJ to automatically declare all the inherited methods that must be implemented. Remember that you can use Alt+Enter or click on the red or yellow light bulb to access intention actions.

**Hint**: For one of the above classes you will can implement the powers as an array. For another one of the classes you will need to need to implement the powers as a Set, implemented as a HashSet. The code to declare a HashSet is 
`HashSet<T> set=new HashSet<T>();`,
where  `T` is the name of the class stored in the Set. We will learn about Set/HashSet and other Java collections in week 4. You can find out more about the HashSet class, including with methods will be most useful, either via the Java API documentation or by using IntelliJ's inline help (hint: use Ctrl+Q to view the documentation for a method or class). Also, as powers are passed as an array you will need to find a way to convert them to a HashSet.


![Hero class hierarchy](imgs/hero.jpg "Hero class hierarchy")

(**Comment for nitpickers**: The particular choices of superpowers used in test program `HeroTester.java` are somewhat debatable. For instance, Captain Marvel is usually described as 'swift as Mercury' but we have not given him the power of 'super speed' because he seems to be nowhere near as fast as characters who specialise in speed, such as The Flash. Similarly, we have not ascribed the power of flight to Wonder Woman because in her Golden Age incarnation she needed her invisible plane to fly. More recently, however, she has acquired the ability to 'ride the winds' as if flying. In summary, the superpowers used in `HeroTester.java` are for illustrative purposes only. No correspondence will be entered into.)

**Question**:  Why was Hero an declared as an interface? Why was SuperHero declared as an abstract Class. Could/Should we have declared Hero as an abstract class or SuperHero as an interface? Why or why not?


## Adding secret agents as heroes

So far the `Hero` interface doesn't appear to be especially helpful. However, it serves an important purpose because it gives us flexibility in extending the type hierarchy. For instance, we can add a (concrete) `SecretAgent` class below it, without affecting the superhero classes in any way.

![Hero class heirarchy extended with SecretAgent](imgs/agent.jpg "Hero class heirarchy extended with SecretAgent")

Not only do secret agents have an alias (when on a mission James Bond is known as '007' and Maxwell Smart as 'Agent 86'), but they are frequently associated with gadgets (like Max's shoephone). Therefore, your `SecretAgent` class should inherit the features of the `Hero` class and add an attribute which stores the gadget typically associated with this agent (as a text string). Once again, consult the API documentation provided for the precise specification. Use the `AgentTester.java` program to test your class.

**Question:**  Do you need to declare a method for returning a secret agent powers? Why or why not?
