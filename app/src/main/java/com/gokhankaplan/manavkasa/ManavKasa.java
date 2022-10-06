package com.gokhankaplan.manavkasa;

import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {

        double armut, elma, domates, muz, patlıcan;
        double kilo1, kilo2, kilo3,kilo4,kilo5;
        armut= 2.14;
        elma= 3.67;
        domates= 1.11;
        muz= 0.95;
        patlıcan= 5.00;

        Scanner input = new Scanner(System.in);
        System.out.println("Kaç kilo armut aldığınızı yazınız: ");
        kilo1 = input.nextDouble();
        System.out.println("Kaç kilo elma aldığınızı yazınız: ");
        kilo2 = input.nextDouble();
        System.out.println("Kaç kilo domates aldığınızı yazınız: ");
        kilo3 = input.nextDouble();
        System.out.println("Kaç kilo muz aldığınızı yazınız: ");
        kilo4 = input.nextDouble();
        System.out.println("Kaç kilo patlıcan aldığınızı yazınız: ");
        kilo5 = input.nextDouble();

        double toplamtutar = kilo1*armut + kilo2*elma + kilo3*domates + kilo4*muz + kilo5*patlıcan;
        System.out.println("Toplam tutar: " + toplamtutar);

        
    }
}
