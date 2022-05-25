package ua.military.structure.entity;

public class Commander extends Human{

    public Commander(String name, int age) {
        super(name, age);
    }

    @Override
    public boolean isReadyToWar() {
        return false;
    }

    @Override
    public boolean isReadyToReport() {
        return false;
    }
}
