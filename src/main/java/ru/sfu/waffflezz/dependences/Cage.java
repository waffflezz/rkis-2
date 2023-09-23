package ru.sfu.waffflezz.dependences;

/**
 * Класс, представляющий клетку с животным
 */
public class Cage implements AnimalEnclosure {

  /**
   * Название животного в клетке
   */
  private String animalName;

  /**
   * Конструктор класса с аргументами
   *
   * @param animalName название животного
   */
  public Cage(String animalName) {
    this.animalName = animalName;
  }

  /**
   * Конструктор без параметров с аргументами по умолчанию
   */
  public Cage() {
    this.animalName = "NoName";
  }

  /**
   * Сеттер для имени животного в клетке
   *
   * @param animalName имя животного в клетки
   */
  public void setAnimalName(String animalName) {
    this.animalName = animalName;
  }

  /**
   * Метод для просмотра содержания клетки
   */
  @Override
  public String contain() {
    return "Cage contain: " + animalName;
  }
}
