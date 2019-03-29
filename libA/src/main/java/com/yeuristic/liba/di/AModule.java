package com.yeuristic.liba.di;

import com.yeuristic.base.ScreenScope;
import com.yeuristic.liba.AProvider;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class AModule {

    @ScreenScope
    @Provides
    static AProvider getProvider() {
        return new AProvider();
    }
}
