package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//test file
class HelloWorldTest {
  @Test
  void itHasAGreeting() {
    HelloWorld helloWorld = new HelloWorld();
    assertEquals(helloWorld.getGreeting(), "Hello World!");
    //assertNotNull(helloWorld.getGreeting());
  }
}
