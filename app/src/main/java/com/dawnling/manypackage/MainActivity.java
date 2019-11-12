package com.dawnling.manypackage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.blankj.utilcode.util.AppUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e("包名", "包名：" + getPackageName() + " 版本名：" + AppUtils.getAppVersionName());
    }
}
