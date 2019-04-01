package com.yeuristic.bridge;

import com.yeuristic.base.BridgeScope;

import dagger.Component;

@BridgeScope
@Component(modules = {BridgeModule.class})
public interface BridgeComponent {
    ComponentHolder getComponentHolder();
}
