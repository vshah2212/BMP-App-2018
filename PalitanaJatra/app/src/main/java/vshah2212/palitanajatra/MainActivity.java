package vshah2212.palitanajatra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button Yatri,Login,TimeT,Details,EmerContact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Yatri = (Button) findViewById(R.id.buttonYatri);
        TimeT = (Button) findViewById(R.id.TimeTable);
        Details = (Button) findViewById(R.id.YatriPersonal);
        EmerContact = (Button) findViewById(R.id.EmergencyNumber);
       // Login = (Button) findViewById(R.id.buttonLogin);

        Yatri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,YatriEnter.class);
                startActivity(i);
            }
        });

        EmerContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,EmergencyActivity.class);
                startActivity(i);
            }
        });

        TimeT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,TimeTableActivity.class);
                startActivity(i);
            }
        });

        Details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,YatriEnterDet.class);
                startActivity(i);
            }
        });
       // Login.setOnClickListener(new View.OnClickListener() {
       //     @Override
       //     public void onClick(View view) {
       //         Intent i = new Intent(MainActivity.this,OrgLogin.class);
       //         startActivity(i);
       //     }
       // });


    }
}
