package ua.military.structure;

import ua.military.structure.entity.Commander;
import ua.military.structure.entity.General;
import ua.military.structure.entity.Human;
import ua.military.structure.entity.Soldier;

public class Main {
    public static void main(String[] args) {
        Human soldier1 = new Soldier("Ivan", 20);
        Human soldier2 = new Soldier("Peter", 21);
        Human soldier3 = new Soldier("Ivan2", 18);
        Human soldier4 = new Soldier("Peter2", 25);
        Human soldier5 = new Soldier("Ivan3", 24);
        Human soldier6 = new Soldier("Peter3", 23);

        Human comander1 = new Commander("Ivan Ivanov", 35);
        Human comander2 = new Commander("Petr Petrov", 37);

        Human general = new General("Ivanov Ivan Ivanovich", 55);

        Human [] headquarters = {soldier1, soldier2, soldier3, soldier4, soldier5, soldier6, comander1, comander2, general};



        System.out.println();
    }
}
