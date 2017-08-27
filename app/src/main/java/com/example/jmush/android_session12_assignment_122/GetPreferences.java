package com.example.jmush.android_session12_assignment_122;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by jmush on 8/28/17.
 */

public class GetPreferences extends Activity {

TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferences);
        tv= (TextView) findViewById(R.id.tv);
        SharedPreferences sharedPreferences = getSharedPreferences("MyPREFERENCES",Context.MODE_PRIVATE);
        String name = sharedPreferences.getString("Name", "");
        String age = sharedPreferences.getString("Age", "");
        String phone = sharedPreferences.getString("Phone", "");
        String city = sharedPreferences.getString("City", "");

        String Details= "Name:"+name+ "\nAge:"+age+ "\nPhone:"+phone+ "\nCity:"+city;

        Toast.makeText(this,"" +Details,Toast.LENGTH_LONG).show();

    }
}
