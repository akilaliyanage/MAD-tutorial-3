package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.FontsContract;
import android.text.Editable;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    private Button ok_btn;
    private EditText txt_one;
    private  EditText txt_two;
    public String val1,val2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        ok_btn = findViewById(R.id.ok_button);
        txt_one = findViewById(R.id.number_one_text);
        txt_two = findViewById(R.id.number_two_text);


        ok_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence message =  "You just clicked the OK button";
                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(context,message,duration);
                //toast.setGravity(Gravity.TOP|Gravity.LEFT,0,0);
                toast.show();

                val1 = txt_one.getText().toString();
                val2 = txt_two.getText().toString();

                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                intent.putExtra("value1",val1);
                intent.putExtra("value2",val2);
                startActivity(intent);

            }
        });
    }
}