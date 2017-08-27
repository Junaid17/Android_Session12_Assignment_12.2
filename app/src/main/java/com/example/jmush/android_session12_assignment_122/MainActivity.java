package com.example.jmush.android_session12_assignment_122;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etName,etAge,etPhone,etCity;
    Button btnSave;

    SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getViewID();
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=etName.getText().toString();
                String age=etAge.getText().toString();
                String phone=etPhone.getText().toString();
                String city=etCity.getText().toString();
                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putString("Name", name);
                editor.putString("Phone", phone);
                editor.putString("Age", age);
                editor.putString("City", city);
                editor.commit();
                Toast.makeText(MainActivity.this,"Saved Succesfully",Toast.LENGTH_LONG).show();
                Intent i=new Intent(MainActivity.this,GetPreferences.class);
                startActivity(i);


            }
        });

    }

    private void getViewID(){
        etName= (EditText) findViewById(R.id.name);
        etAge= (EditText) findViewById(R.id.age);
        etPhone= (EditText) findViewById(R.id.phone);
        etCity= (EditText) findViewById(R.id.city);
        btnSave= (Button) findViewById(R.id.save);
        sharedpreferences = getSharedPreferences("MyPREFERENCES",Context.MODE_PRIVATE);
    }


}
