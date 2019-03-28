package com.yeuristic.liba;

import com.yeuristic.liba.di.ADIManager;

import javax.inject.Inject;

public class AMain {
    @Inject
    AProvider mAProvider;

    public AMain() {
        ADIManager.getaSubComponent().inject(this);
    }
}
