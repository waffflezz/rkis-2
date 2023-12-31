package ru.sfu.waffflezz.dependences;


/**
 * Класс, представляющий аквариум с рыбками
 */
public class Aquarium implements AnimalEnclosure {

  /**
   * Название рыбки в аквариуме
   */
  private  String fishName;
  /**
   * Объем аквариума (в литрах)
   */
  private  int volume;

  /**
   * Конструктор класса с параметрами
   *
   * @param fishName название рыбки в аквариуме
   * @param volume объем аквариума (в литрах)
   */
  public Aquarium(String fishName, int volume) {
    this.fishName = fishName;
    this.volume = volume;
  }

  /**
   * Конструктор без параметров с аргументами по умолчанию
   */
  public Aquarium() {
    this.fishName = "NoName";
    this.volume = 0;
  }

  /**
   * Сеттер для имени рыбки
   *
   * @param fishName имя рыбки
   */
  public void setFishName(String fishName) {
    this.fishName = fishName;
  }

  /**
   * Сеттер для объема аквариума
   *
   * @param volume объем аквариума (в литрах)
   */
  public void setVolume(int volume) {
    this.volume = volume;
  }

  /**
   * Метод для просмотра содержания аквариума
   */
  @Override
  public String contain() {
    return "Aquarium has volume " + volume + " liters, contain: " + fishName;
  }
}
