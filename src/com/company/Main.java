package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    /*  Realizuoti programą, kuri apskaičiuotų kiek automobilis vidutiniškai sunaudoja kuro 100
        km. Programa turi paprašyti vartotojo įvesti nuvažiuotus km ir kuro sąnaudas.
        vidurkis = (kuro sąnaudos *100)/ nuvažiuoto atstumo
    */
    /*
        Papildyti 1.8 programą, parašykite du atskirus metodus, vienas turi nuskaityti įvestus
        vartotojo parametrus, kitas paskaičiuotų ir grąžintų vidurkį. Rezultatus spausdinti ekrane.
     */
        float km, sanaudos;
        Scanner in = new Scanner(System.in);

        System.out.print("Iveskite nuvaziuotus kilometrus: ");
        km = in.nextFloat();
        System.out.print("Iveskite Kuro sanaudas: ");
        sanaudos = in.nextFloat();

        System.out.print("Vidurkis: " + (sanaudos * 100) / km);

    }
}