package com.example.ebrahem.payment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

    public void change(View view) {
        Intent e=new Intent(this,Main2Activity.class);
        startActivity(e);
    }

    public void confirm(View view) {
        Toast.makeText(this,"the order confirmed",Toast.LENGTH_LONG).show();
        Intent v=new Intent(this,MainActivity.class);
        startActivity(v);
    }
}
