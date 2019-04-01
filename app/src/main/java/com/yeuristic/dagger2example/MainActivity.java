package com.yeuristic.dagger2example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.yeuristic.libaapi.APublicComponent;
import com.yeuristic.libaapi.APublicDIManager;
import com.yeuristic.libb.BMain;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BMain b = new BMain();
        Toast.makeText(this, "Test", Toast.LENGTH_LONG).show();
    }
}
