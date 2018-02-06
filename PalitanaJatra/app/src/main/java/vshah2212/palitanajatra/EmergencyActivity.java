package vshah2212.palitanajatra;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class EmergencyActivity extends AppCompatActivity {

    TextView em1,em2,em3,em4,em5,em6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency);

        em1 = (TextView) findViewById(R.id.Emer1);
        em2 = (TextView) findViewById(R.id.Emer2);
        em3 = (TextView) findViewById(R.id.Emer3);
        em4 = (TextView) findViewById(R.id.Emer4);
        em5 = (TextView) findViewById(R.id.Emer5);
        em6 = (TextView) findViewById(R.id.Emer6);


        int reqcode=0;
        if (ContextCompat.checkSelfPermission(EmergencyActivity.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(EmergencyActivity.this, new String[]{android.Manifest.permission.CALL_PHONE},reqcode);
        }
            em1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String phone_no = "09820061628";
                    Intent callIntent = new Intent(Intent.ACTION_CALL);
                    callIntent.setData(Uri.parse("tel:" + phone_no));
                    callIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    try {
                        startActivity(callIntent);
                    } catch (Exception e) {
                    }
                }
            });

            em2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String phone_no = "09920499406";
                    Intent callIntent = new Intent(Intent.ACTION_CALL);
                    callIntent.setData(Uri.parse("tel:" + phone_no));
                    callIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    try {
                        startActivity(callIntent);
                    } catch (Exception e) {
                    }
                }
            });

            em3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String phone_no = "09820818142";
                    Intent callIntent = new Intent(Intent.ACTION_CALL);
                    callIntent.setData(Uri.parse("tel:" + phone_no));
                    callIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    try {
                        startActivity(callIntent);
                    } catch (Exception e) {
                    }
                }
            });

            em4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String phone_no = "09820309260";
                    Intent callIntent = new Intent(Intent.ACTION_CALL);
                    callIntent.setData(Uri.parse("tel:" + phone_no));
                    callIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    try {
                        startActivity(callIntent);
                    } catch (Exception e) {
                        Log.e("Exception", e.toString());
                    }
                }
            });

            em5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String phone_no = "09820722244";
                    Intent callIntent = new Intent(Intent.ACTION_CALL);
                    callIntent.setData(Uri.parse("tel:" + phone_no));
                    callIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    try {
                        startActivity(callIntent);
                    } catch (Exception e) {
                    }
                }
            });

            em6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String phone_no = "09892199971";
                    Intent callIntent = new Intent(Intent.ACTION_CALL);
                    callIntent.setData(Uri.parse("tel:" + phone_no));
                    callIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    try {
                        startActivity(callIntent);
                    } catch (Exception e) {
                    }
                }
            });


    }
}
