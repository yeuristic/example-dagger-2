package com.yeuristic.liba.di;

import com.yeuristic.base.AService;
import com.yeuristic.base.ApplicationScope;
import com.yeuristic.liba.AServiceImpl;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class APublicModule {

    @Binds
    abstract AService getService(AServiceImpl aServiceImpl);

    @ApplicationScope
    @Provides
    static AServiceImpl getServiceImpl() {
        return new AServiceImpl();
    }
}
