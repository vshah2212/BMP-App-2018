package vshah2212.palitanajatra;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class YatriEnterDet extends AppCompatActivity {

    EditText inpD;
    Button subD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yatri_enter_det);

        inpD = findViewById(R.id.inputDet);
        subD = findViewById(R.id.subDet);

        subD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(inpD.getText().toString().trim().equalsIgnoreCase(""))
                {
                    Toast.makeText(getApplicationContext(),"Please enter a number!",Toast.LENGTH_SHORT).show();
                }
                else {
                    if(haveNetworkConnection()==true) {
                        int xy = Integer.parseInt(inpD.getText().toString());
                        Intent i = new Intent(YatriEnterDet.this, YatriDetails.class);
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
