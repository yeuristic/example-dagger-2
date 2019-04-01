package com.yeuristic.libb;

import dagger.Subcomponent;

@Subcomponent
public interface BSubComponent {
    void inject(BMain bMain);
}
