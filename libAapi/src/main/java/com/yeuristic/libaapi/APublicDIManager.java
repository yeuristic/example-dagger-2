package com.yeuristic.libaapi;

import com.yeuristic.base.ComponentFactory;
import com.yeuristic.base.Components;

public class APublicDIManager {
    public static APublicComponent getPublicComponent() {
        ComponentFactory<APublicComponent> componentFactory = Components.MAP.get(APublicComponent.class.getSimpleName());
        if (componentFactory != null) {
            return componentFactory.create();
        }
        throw new IllegalStateException("Component is not initialized");
    }
}
