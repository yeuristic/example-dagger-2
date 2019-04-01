package com.yeuristic.libaapi;

import com.yeuristic.base.ComponentFactory;
import com.yeuristic.base.Components;
import com.yeuristic.base.PublicComponentKey;

public class APublicDIManager {
    public static APublicComponent getPublicComponent() {
        ComponentFactory<APublicComponent> componentFactory = Components.MAP.get(PublicComponentKey.A_COMPONENT);
        if (componentFactory != null) {
            return componentFactory.create();
        }
        throw new IllegalStateException("Component is not initialized");
    }
}
