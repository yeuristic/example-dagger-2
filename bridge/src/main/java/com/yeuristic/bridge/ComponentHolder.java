package com.yeuristic.bridge;

import com.yeuristic.base.ComponentFactory;
import com.yeuristic.base.BridgeScope;

import java.util.Map;

import javax.inject.Inject;

@BridgeScope
public class ComponentHolder {

    private final Map<String, ComponentFactory> mComponents;

    @Inject
    public ComponentHolder(Map<String, ComponentFactory> components) {
        mComponents = components;
    }

    public Map<String, ComponentFactory> getComponents() {
        return mComponents;
    }
}
