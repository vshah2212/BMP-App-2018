package vshah2212.palitanajatra;

import android.content.Intent;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import cz.msebera.android.httpclient.HttpEntity;
import cz.msebera.android.httpclient.HttpResponse;
import cz.msebera.android.httpclient.client.HttpClient;
import cz.msebera.android.httpclient.client.methods.HttpPost;
import cz.msebera.android.httpclient.impl.client.HttpClientBuilder;

public class YatriDetails extends AppCompatActivity {

    TextView textYNo,textYName, textYRoom, textYCoach, textYSeat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yatri_details);

        textYNo = findViewById(R.id.textYNoDet);
        textYName = findViewById(R.id.textYNameDet);
        textYRoom = findViewById(R.id.roomVal);
        textYCoach = findViewById(R.id.CoachVal);
        textYSeat = findViewById(R.id.SeatVal);

        int numb = 0;

        Intent i = getIntent();
        numb = i.getIntExtra("ynum",0);


        if (android.os.Build.VERSION.SDK_INT > 9) {
            StrictMode.ThreadPolicy policy =
                    new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }

        String result = null;
        InputStream is = null;

        try{
            HttpClient httpclient = HttpClientBuilder.create().build();
            HttpPost httppost;

            httppost = new HttpPost("http://phpdatabaseandroid.esy.es/getYatri.php?number="+numb);

            HttpResponse response = httpclient.execute(httppost);
            HttpEntity entity = response.getEntity();
            is = entity.getContent();

            //   Log.e("log_tag", "connection success ");
            //   Toast.makeText(getApplicationContext(), "pass", Toast.LENGTH_SHORT).show();
        }
        catch(Exception e)
        {
            //   Log.e("log_tag", "Error in http connection "+e.toString());
            //  Toast.makeText(getApplicationContext(), "Connection fail", Toast.LENGTH_SHORT).show();

        }
        //convert response to string
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(is,"iso-8859-1"),8);
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null)
            {
                sb.append(line + "\n");
            }
            is.close();

            result=sb.toString();
        }
        catch(Exception e)
        {
            //   Log.e("log_tag", "Error converting result "+e.toString());
            //   Toast.makeText(getApplicationContext(), " Input reading fail", Toast.LENGTH_SHORT).show();
        }

        //parse json data
        try
        {

            Log.e("result","Result string in jSON "+result);

            JSONArray jArray = new JSONArray(result);

            JSONObject json_data = jArray.getJSONObject(0);

            String stime1=json_data.getString("YNo");
            textYNo.setText(stime1);

            String stime2=json_data.getString("YName");
            textYName.setText(stime2);

            String stime3=json_data.getString("YRoom");
            textYRoom.setText(stime3);

            String stimeJ1=json_data.getString("YRetCoach");
            textYCoach.setText(stimeJ1);
            String stimeJ2=json_data.getString("YRetSeat");
            textYSeat.setText(stimeJ2);


        }
        catch(JSONException e)
        {
            Log.e("log_tag", "Error parsing data "+e.toString());
            Toast.makeText(this, "Yatri Number does not exist!", Toast.LENGTH_LONG).show();
        }




    }
}
