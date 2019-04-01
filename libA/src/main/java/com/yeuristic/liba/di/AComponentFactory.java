package com.yeuristic.liba.di;

import com.yeuristic.base.BridgeScope;
import com.yeuristic.base.ComponentFactory;
import com.yeuristic.libaapi.APublicComponent;

import javax.inject.Inject;

@BridgeScope
public class AComponentFactory implements ComponentFactory<APublicComponent> {

    @Inject
    public AComponentFactory() {
    }

    @Override
    public APublicComponent create() {
        return DaggerAPublicComponentImpl.create();
    }
}
