package com.carpediem.homer.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;

import com.carpediem.homer.funswitch.FunSwitch;

public class MainActivity extends AppCompatActivity {

    private FunSwitch mFunSwitch;

    private Button mSwitch;

    private Switch mSwitch2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFunSwitch = (FunSwitch) findViewById(R.id.switchButton);
        mFunSwitch.setOnSwitchChangeListener(new FunSwitch.OnSwitchChangedListener() {
            @Override
            public void onSwitchChange(FunSwitch funSwitch, boolean isChecked) {
                Log.d("mr_wind", "isChecked: " + isChecked);
            }
        });
        mSwitch = (Button) findViewById(R.id.switchbtn);
        mSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mFunSwitch.isOpen()) {
                    mFunSwitch.setChecked(false);
                } else {
                    mFunSwitch.setChecked(true);
                }
            }
        });
    }
}
