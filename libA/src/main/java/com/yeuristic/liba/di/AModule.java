package com.yeuristic.liba.di;

import com.yeuristic.base.ApplicationScope;
import com.yeuristic.liba.AProvider;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class AModule {

    @ApplicationScope
    @Provides
    static AProvider getProvider() {
        return new AProvider();
    }
}
