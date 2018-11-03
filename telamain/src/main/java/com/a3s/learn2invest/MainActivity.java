package com.a3s.learn2invest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {
    public static final String Montante_input = "com.example.myfirstapp.MESSAGE";
    public static String montante_final = "";
    public static String periodo_final = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view){
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText2);
        String message = editText.getText().toString();
        EditText editText1 = (EditText) findViewById(R.id.editText);
        String message2 = editText1.getText().toString();
        intent.putExtra(Montante_input, message);
        montante_final = message;
        periodo_final = message2;
        startActivity(intent);

    }


}
