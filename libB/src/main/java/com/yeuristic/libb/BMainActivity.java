package com.yeuristic.libb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.yeuristic.base.AService;

import javax.inject.Inject;

public class BMainActivity extends AppCompatActivity {

    @Inject
    AService mAService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmain);
        BDIManager.getbSubComponent().inject(this);
    }
}
