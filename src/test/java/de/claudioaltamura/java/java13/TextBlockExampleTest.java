package de.claudioaltamura.java.java13;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TextBlockExampleTest {

  @Test
  void textBlockExample() {
    TextBlockExample textBlockExample = new TextBlockExample();
    assertEquals("Name: Peter\nPhone: 123456\nage: 5\n", textBlockExample.getElement());
  }

}
