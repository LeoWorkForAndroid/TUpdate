package com.top.tupdate;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import com.top.tupdatelib.TUpdate;
import com.top.tupdatelib.TUpdateKotlin;
import com.top.tupdatelib.bean.VersionBean;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        new TUpdate.Builder()
                .setContext(this)
                .setOnlyWifi(false)
                .setUpdateUrl("")
                .build()
                .update();


        VersionBean bean=new VersionBean();


        AlertDialog.Builder builder1=new AlertDialog.Builder(this);

    }
}
