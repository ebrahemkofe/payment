package com.example.ebrahem.payment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RadioButton visa , cash;
    EditText visaNum , visaPassword ;
    List<Hero> heroList;
    ListView listView;

    boolean valid = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cash = findViewById(R.id.cash);
        visa = findViewById(R.id.visa);
        visaNum = findViewById(R.id.visaNum);
        visaPassword = findViewById(R.id.visaPassword);

        cash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                visaNum.setVisibility(View.INVISIBLE);
                visaPassword.setVisibility(View.INVISIBLE);


            }
        });

        visa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                visaNum.setVisibility(View.VISIBLE);
                visaPassword.setVisibility(View.VISIBLE);


            }
        });



        heroList = new ArrayList<>();
        listView = findViewById(R.id.listView);


        heroList.add(new Hero(R.drawable.image9, "new dress", "249.95"));
        heroList.add(new Hero(R.drawable.image13, "new dress", "124.95"));
        heroList.add(new Hero(R.drawable.image9, "new dress", "659.95"));
        heroList.add(new Hero(R.drawable.image13, "new dress", "564.95"));
        heroList.add(new Hero(R.drawable.image9, "new dress", "987.95"));
        heroList.add(new Hero(R.drawable.image13, "new dress", "323.95"));


        MyListAdapter adapter = new MyListAdapter(this, R.layout.my_custom_list, heroList);


        listView.setAdapter(adapter);
    }
    public boolean validate(){


        if(visaNum.length() < 14 ){
            visaNum.setError("Enter correct visa Number!!");
            valid = false;
        }



        if(visaPassword.length() == 0){
            visaPassword.setError("must be filled");
            valid = false;
        }
        return valid;
    }

    public void comblete(View view) {

            Intent c = new Intent(this, Main4Activity.class);
            startActivity(c);
        
    }
}