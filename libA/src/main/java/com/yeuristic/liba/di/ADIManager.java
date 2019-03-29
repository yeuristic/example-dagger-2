package com.yeuristic.liba.di;

public class ADIManager {

    public static AComponent getaComponent() {
        return DaggerAComponent.create();
    }
}
