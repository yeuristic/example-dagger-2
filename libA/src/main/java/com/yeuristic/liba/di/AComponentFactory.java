package com.yeuristic.liba.di;

import com.yeuristic.base.ComponentFactory;
import com.yeuristic.libaapi.APublicComponent;

public class AComponentFactory implements ComponentFactory<APublicComponent> {
    @Override
    public APublicComponent create() {
        return DaggerAPublicComponentImpl.create();
    }
}
