package com.yeuristic.liba.di;

import com.yeuristic.base.ApplicationScope;
import com.yeuristic.liba.AMain;

import dagger.Component;

@ApplicationScope
@Component(modules = {AModule.class})
public interface AComponent {
    void inject(AMain aMain);
}
