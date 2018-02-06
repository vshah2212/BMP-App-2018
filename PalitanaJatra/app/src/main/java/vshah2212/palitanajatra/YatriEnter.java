package vshah2212.palitanajatra;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class YatriEnter extends AppCompatActivity {

    EditText inp;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yatri_enter);

        inp = (EditText) findViewById(R.id.input);
        submit = (Button) findViewById(R.id.sub);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(inp.getText().toString().trim().equalsIgnoreCase(""))
                {
                    Toast.makeText(getApplicationContext(),"Please enter a number!",Toast.LENGTH_SHORT).show();
                }
                else {
                    if(haveNetworkConnection()==true) {
                        int xy = Integer.parseInt(inp.getText().toString());
                        Intent i = new Intent(YatriEnter.this, YatriStatus.class);
                        i.putExtra("ynum", xy);
                        startActivity(i);
                    }
                    else {
                        Toast.makeText(getApplicationContext(),"Check internet connection!",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });




    }

    private boolean haveNetworkConnection() {
        boolean haveConnectedWifi = false;
        boolean haveConnectedMobile = false;

        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo[] netInfo = cm.getAllNetworkInfo();
        for (NetworkInfo ni : netInfo) {
            if (ni.getTypeName().equalsIgnoreCase("WIFI"))
                if (ni.isConnected())
                    haveConnectedWifi = true;
            if (ni.getTypeName().equalsIgnoreCase("MOBILE"))
                if (ni.isConnected())
                    haveConnectedMobile = true;
        }
        return haveConnectedWifi || haveConnectedMobile;
    }

}
