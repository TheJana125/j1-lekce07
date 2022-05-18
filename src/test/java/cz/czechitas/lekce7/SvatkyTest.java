package cz.czechitas.lekce7;

import org.junit.jupiter.api.Test;

import java.time.Month;
import java.time.MonthDay;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Filip Jirsák
 */
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
    assertTrue(svatky.jeVSeznamu("Přemysl"));
    assertFalse(svatky.jeVSeznamu("Jiří"));

  }

  @Test
  void getPocetJmen() {
    Svatky svatky = new Svatky();
    assertEquals(20, svatky.getPocetJmen());
  }

  @Test
  void getSeznamJmen() {
    Svatky svatky = new Svatky();
    assertEquals(20, svatky.getSeznamJmen().size());    //musím porovnat číslo a číslo, proto size
    //TODO Zkontrolovat, že seznam jmen má správný počet položek.
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
    //TODO
  }

  @Test
  void prridatSvatekMonthDay() {
    Svatky svatky = new Svatky();
    svatky.pridatSvatek("Tamara", MonthDay.of(6, 3));
    assertEquals(21, svatky.getPocetJmen());
    assertTrue(svatky.jeVSeznamu("Tamara"));
  }
    //TODO


  @Test
  void smazatSvatek() {
      Svatky svatky = new Svatky();
      svatky.smazatSvatek("Emil");
      svatky.smazatSvatek("Veronika");
      assertEquals(19, svatky.getPocetJmen());
      //TODO Zkontrolovat, že po smazání bude počet svátků odpovídat novému počtu.
    }
  }

