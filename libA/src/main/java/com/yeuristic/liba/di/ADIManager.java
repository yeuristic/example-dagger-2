package com.yeuristic.liba.di;

public class ADIManager {
    private static ASubComponent aSubComponent;

    public static ASubComponent getaSubComponent() {
        return aSubComponent;
    }

    public static void setaSubComponent(ASubComponent aSubComponent) {
        ADIManager.aSubComponent = aSubComponent;
    }
}
