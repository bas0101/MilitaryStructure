package ua.military.structure.entity;

public class General extends Human{

    public General(String name, int age) {
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
