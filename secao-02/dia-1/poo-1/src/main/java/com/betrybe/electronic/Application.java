package com.betrybe.electronic;

public class Application {

  public static void main(String[] args) {
    double sizeCm = Television.convertToCentimeters(32);
    System.out.println("O tamanho em centímetros é: " + sizeCm);

    Television television = new Television("Phillips","LCD", 32);

    System.out.println("A televisão está ligada?");
    System.out.println(television.isOn());

    System.out.println("O volume atual é:");
    System.out.println(television.getVolume());

    System.out.println("Modelo antigo:");
    System.out.println(television.getModel());

    television.setModel("LCD-Ultra");

    System.out.println("Modelo novo:");
    System.out.println(television.getModel());
  }
}
