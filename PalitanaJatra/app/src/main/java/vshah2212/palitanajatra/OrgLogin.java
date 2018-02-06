package vshah2212.palitanajatra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class OrgLogin extends AppCompatActivity {

    EditText us, pw;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_org_login);

        us = (EditText) findViewById(R.id.username);
        pw = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.log);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("us pw:",us.getText().toString()+", "+pw.getText().toString());
                String user = us.getText().toString().trim();
                String pass = pw.getText().toString().trim();
                Log.e("us pw:",user+", "+pass);
                if(user.equalsIgnoreCase("palitana") && pass.equalsIgnoreCase("12345"))
                {
                    Intent i = new Intent(OrgLogin.this,OrganizerActivity.class);
                    startActivity(i);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Invalid username or password!",Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
