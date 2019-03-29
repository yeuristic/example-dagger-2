package com.yeuristic.liba.di;

import com.yeuristic.base.ScreenScope;
import com.yeuristic.liba.AMain;

import dagger.Component;

@ScreenScope
@Component(modules = {AModule.class})
public interface AComponent {
    void inject(AMain aMain);
}
