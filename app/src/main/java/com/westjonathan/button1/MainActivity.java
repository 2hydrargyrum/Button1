package com.westjonathan.button1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button submitButton;
    Button changeButton;
    EditText inputText;
    TextView dispMessage;
    TextView number;
    int num = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number=findViewById(R.id.numberText);
        submitButton=findViewById(R.id.submitButton);
        inputText=findViewById((R.id.inputText));
        changeButton=findViewById(R.id.button2);
        dispMessage=findViewById(R.id.msgBox);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!inputText.getText().toString().trim().equals("")) {
                    String newMsg = "Howdy " + inputText.getText() + "!";
                    Log.i("modified message: ", newMsg);
                    dispMessage.setText(newMsg);
                    inputText.setText("");
                }
            }
        });
    }
    public void incrementText(View view) {
        num += 1;
        number.setText(Integer.toString(num));
    }
}
