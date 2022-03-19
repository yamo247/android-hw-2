package com.example.yourcv;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        TextView name = findViewById(R.id.finalname);
        Bundle uname = getIntent().getExtras();
        String username = uname.getString("name");
        name.setText(username);

        TextView age = findViewById(R.id.finalage);
        Bundle uage = getIntent().getExtras();
        String userage = uage.getString("age");
        age.setText(userage);


        TextView job = findViewById(R.id.Job);
        Bundle ujob = getIntent().getExtras();
        String userjob = uage.getString("job");
        age.setText(userage);

        TextView number = findViewById(R.id.number);
        Bundle unum = getIntent().getExtras();
        String usernum = uage.getString("number");
        age.setText(userage);

        TextView email = findViewById(R.id.Email);
        Bundle uemail = getIntent().getExtras();
        String useremail = uage.getString("email");
        age.setText(userage);



    }
}
