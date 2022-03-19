package com.example.yourcv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button next = findViewById(R.id.p2button);

        EditText name = findViewById(R.id.Name);
        EditText age = findViewById(R.id.Age);
        EditText job = findViewById(R.id.Job);
        EditText number = findViewById(R.id.number);
        EditText email = findViewById(R.id.Email);


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (name.getText().toString().isEmpty() || age.getText().toString().isEmpty() || job.getText().toString().isEmpty() || number.getText().toString().isEmpty()  ||  email.getText().toString().isEmpty()) {
                    Toast.makeText(getBaseContext(), "Must fill in all!!",
                            Toast.LENGTH_LONG).show();
                    // Do nothing...
                } else {
                    final Intent i = new Intent(MainActivity.this, MainActivity2.class);
                    String n = name.getText().toString();
                    String a = age.getText().toString();
                    String jo = job.getText().toString();
                    String num = number.getText().toString();
                    String em = email.getText().toString();

                    i.putExtra("name", n);
                    i.putExtra("age", a);
                    i.putExtra("Job", jo);
                    i.putExtra("number", num);
                    i.putExtra("Email", em);
                    startActivity(i);
                }
            }
        });
    }
}