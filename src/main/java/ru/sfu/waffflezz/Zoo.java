package ru.sfu.waffflezz;

import java.beans.ConstructorProperties;
import ru.sfu.waffflezz.dependences.AnimalEnclosure;

/**
 * Класс, представляющий зоопарк
 */
public class Zoo {

  /**
   * Клетка с животным
   */
  private final AnimalEnclosure animalCage;
  /**
   * Аквариум с рыбкой
   */
  private final AnimalEnclosure fishAquarium;

  /**
   * Конструктор с параметрами для инициализации зоопарка
   *
   * @param animalCage клетка
   * @param fishAquarium аквариум
   */
  @ConstructorProperties({"animalCage", "fishAquarium"})
  public Zoo(AnimalEnclosure animalCage, AnimalEnclosure fishAquarium) {
    this.animalCage = animalCage;
    this.fishAquarium = fishAquarium;
  }

  /**
   * Получение информации о зоопарке
   */
  public void getZooInfo() {
    System.out.println("Zoo has:\n" + animalCage.contain() + "\n" + fishAquarium.contain() + "\n");
  }
}
