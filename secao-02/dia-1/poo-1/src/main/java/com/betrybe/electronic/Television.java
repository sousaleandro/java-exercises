package com.betrybe.electronic;

public class Television {
  private static int MAX_VOLUME = 30;
  private int volume = 0;

  private boolean isOn = false;

  private String brand;
  private String model;
  private int size;
  private static double INCH_TO_CM = 2.54;
  public Television(String brand, String model, int size) {
    this.brand = brand;
    this.model = model;
    this.size = size;
  }

  public void turnOn() {
    System.out.println("Ligando televisão...");
    this.isOn = true;
  }

  public void turnOff() {
    System.out.println("Desligando televisão...");
    this.isOn = false;
  }

  public String info() {
    return "Marca: %s, Modelo: %s, Tamanho: %d, Ligada: %b".formatted(
        brand, model, size, isOn
    );
  }
  public void increaseVolume() {
    if (volume < MAX_VOLUME) {
      volume++;
    }
  }

  public void decreaseVolume() {
    if (volume > 0) {
      volume--;
    }
  }
  public static double convertToCentimeters(double inches) {
    return inches * INCH_TO_CM;
  }
  public int getVolume() {
    return volume;
  }

  public boolean isOn() {
    return isOn;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public String getModel() {
    return model;
  }

  public int getSize() {
    return size;
  }
}
