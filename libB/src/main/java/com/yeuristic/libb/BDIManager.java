package com.yeuristic.libb;

public class BDIManager {
    private static BSubComponent bSubComponent;

    public static BSubComponent getbSubComponent() {
        return bSubComponent;
    }

    public static void setbSubComponent(BSubComponent bSubComponent) {
        BDIManager.bSubComponent = bSubComponent;
    }
}
