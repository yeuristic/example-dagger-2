package com.yeuristic.libb;

import com.yeuristic.base.AService;

import javax.inject.Inject;

public class BMain {

    @Inject
    AService mAService;

    public BMain() {
        BDIManager.getbSubComponent().inject(this);
    }
}
