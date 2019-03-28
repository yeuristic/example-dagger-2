package com.yeuristic.liba.di;

import com.yeuristic.base.AService;
import com.yeuristic.base.ApplicationScope;
import com.yeuristic.liba.ABookingDetail;
import com.yeuristic.liba.AListener;
import com.yeuristic.liba.AProvider;
import com.yeuristic.liba.AServiceImpl;
import com.yeuristic.liba.AStatefulProvider;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class AModule {

    @Binds
    abstract AService getService(AServiceImpl aServiceImpl);

    @ApplicationScope
    @Provides
    static ABookingDetail getBookingDetail() {
        return new ABookingDetail();
    }

    @ApplicationScope
    @Provides
    static AListener getListener() {
        return new AListener();
    }

    @ApplicationScope
    @Provides
    static AProvider getProvider() {
        return new AProvider();
    }

    @ApplicationScope
    @Provides
    static AServiceImpl getServiceImpl() {
        return new AServiceImpl();
    }

    @ApplicationScope
    @Provides
    static AStatefulProvider getStatefulProvider() {
        return new AStatefulProvider();
    }
}
