package com.a3s.learn2invest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LowRisk extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_low_risk);
    }

    public void goPort1(View view){
        Intent intent = new Intent(this, low_portifolio_one.class);
        startActivity(intent);
    }


}
