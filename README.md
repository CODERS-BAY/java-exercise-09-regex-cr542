# Regular Expression
## First Task
Your task is to implement a program which fulfills the following requirements:

* It should detect spam messages. In `resources/spams` you will find some example spam texts. A score on how likely it is spam would be very nice.
* Implement a password validator. Define requirements for a strong password. Moreover, it must not be in the provided dictionary. The dictionary is also in the `resource` folder. 
* It must also be possible count the occurrence of the word `Java` in a text. A sample text is in the `resources`. Lower/upper case does not matter. 
  Find an example below:
  
  ~~~
    Lorem ipsum dolor sit amet, consetetur sadipscing elitr, Java sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua.
    At vero eos et accusam et justo java duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor 
    sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et
    justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.javA
  ~~~
  The word `Java` occurs 3 times.
* Your program should validate an email with regular expressions. For example `foo@example.org` is valid but `foo@example` is not.

---

## Second Task
Use test driven development **TDD for the whole** exercise.
The three rules of TDD can be found [here.](https://medium.com/@rrugamba/3-laws-of-tdd-58b5ec46a998)

You must have a code coverage of nearly 100% procent. You can check the coverage in Eclipse very easily. Here is a [description](https://developers.redhat.com/blog/2017/10/06/java-code-coverage-eclipse#:~:text=To%20use%20it%2C%20you%20can,colors%20are%20fairly%20self%2Dexplanatory) how to do this.

Use JUnit 5 for the tests. They have a very well written [user guide](https://junit.org/junit5/docs/current/user-guide/).

---

## Third Task (Bonus)
Implement a GUI in JavaFX for the requirements of the first task.

It might be a good choice to create a new project with the JavaFX archetype.

---
> Implement the software with a clean architecture. Use abstraction and do not repeat yourself. Keep an eye on runtime and memory complexity of your program.
You must handle every exception accordingly! You may also want to write your own if needed. Also test them in the unit tests.

