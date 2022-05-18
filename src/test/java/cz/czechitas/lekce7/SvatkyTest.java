package cz.czechitas.lekce7;

import org.junit.jupiter.api.Test;

import java.time.Month;
import java.time.MonthDay;

import static org.junit.jupiter.api.Assertions.*;

class SvatkyTest {

  @Test
  void kdyMaSvatek() {
    Svatky svatky = new Svatky();
    assertEquals(MonthDay.of(5, 18), svatky.kdyMaSvatek("Nataša"));
    assertNull(svatky.kdyMaSvatek("Eva"));
  }

  @Test
  void jeVSeznamu() {
    Svatky svatky = new Svatky();
    assertTrue(svatky.jeVSeznamu("Ivo"));
    assertFalse(svatky.jeVSeznamu("Adam"));
  }

  @Test
  void getPocetJmen() {
    Svatky svatky = new Svatky();
    assertEquals(20, svatky.getPocetJmen());
  }

  @Test
  void getSeznamJmen() {
    Svatky svatky = new Svatky();
    assertEquals(20, svatky.getSeznamJmen().size());
  }

  @Test
  void pridatSvatekDenMesicInt() {
    Svatky svatky = new Svatky();
    svatky.pridatSvatek("Laura", 1, 6);
    assertEquals(21, svatky.getPocetJmen());
    assertTrue(svatky.jeVSeznamu("Laura"));
  }

  @Test
  void pridatSvatekDenMesicMonth() {
    Svatky svatky = new Svatky();
    svatky.pridatSvatek("Jarmil", 2, Month.JUNE);
    assertEquals(21, svatky.getPocetJmen());
    assertTrue(svatky.jeVSeznamu("Jarmil"));
  }

  @Test
  void prridatSvatekMonthDay() {
    Svatky svatky = new Svatky();
    svatky.pridatSvatek("Tamara", MonthDay.of(6, 3));
    assertEquals(21, svatky.getPocetJmen());
    assertTrue(svatky.jeVSeznamu("Tamara"));
  }

  @Test
  void smazatSvatek() {
    Svatky svatky = new Svatky();
    svatky.smazatSvatek("Emil");
    svatky.smazatSvatek("Veronika");
    assertEquals(19, svatky.getPocetJmen());
  }
}
