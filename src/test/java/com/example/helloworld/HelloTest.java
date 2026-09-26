package com.example.helloworld;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class HelloTest {
  @Test 
  public void retornarHelloWorldComSucesso() {
    Hello hello = new Hello();
    String resultado = hello.sayHello();
    assertTrue(resultado.equals("Hello, world!"));
  }
}