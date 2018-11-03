
package com.a3s.learn2invest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.Montante_input);

        TextView textView = findViewById(R.id.textView);
        textView.setText(message);

    }

    public void goLowrisk(View view){
        Intent intent = new Intent(this, LowRisk.class);
        startActivity(intent);
    }

    public void goModeraterisk(View view){
        Intent intent = new Intent(this, ModerateRisk.class);
        startActivity(intent);
    }

    public void goHighrisk(View view){
        Intent intent = new Intent(this, HighRisk.class);
        startActivity(intent);
    }
}
