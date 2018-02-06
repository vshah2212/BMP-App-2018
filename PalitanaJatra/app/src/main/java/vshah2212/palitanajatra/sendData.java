package vshah2212.palitanajatra;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.util.Date;

import cz.msebera.android.httpclient.HttpResponse;
import cz.msebera.android.httpclient.client.HttpClient;
import cz.msebera.android.httpclient.client.methods.HttpGet;
import cz.msebera.android.httpclient.impl.client.DefaultHttpClient;

import static android.content.Context.MODE_PRIVATE;

class sendData extends AsyncTask<String, Void, String> {
    Context ctx;

    public sendData(Context context)
    {
        ctx = context;
    }


    protected String doInBackground(String... message) {
        HttpClient httpclient;
        HttpGet request;
        HttpResponse response = null;
        String result = "";
        try {
            String send = message[0];

            String tt = DateFormat.getDateTimeInstance().format(new Date());

            Log.e("DateTime:",tt);

            while(tt.contains(" "))
            {
                int ind=tt.indexOf(" ");
                tt = tt.substring(0,ind)+"."+tt.substring(ind+1);
            }

            Log.e("DateTime:",tt);

            httpclient = new DefaultHttpClient();
            request = new HttpGet("http://phpdatabaseandroid.esy.es/UpdateYatra.php?number=" + send + "&timer=" + tt);
            response = httpclient.execute(request);
        } catch (Exception e) {
            result = "error1";
        }

        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(
                    response.getEntity().getContent()));
            String line = "";
            while ((line = rd.readLine()) != null) {
                result = result + line;
            }
        } catch (Exception e) {
            result = "error2";
        }
        return result;
    }

    protected void onPostExecute(String result) {

        Log.e("Result", "Result" + result);

        if (result.trim().equalsIgnoreCase("Done"))
        {
            Toast.makeText(ctx, "Updated successfully!", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(ctx,"Unable to update!",Toast.LENGTH_SHORT).show();
        }

    }
}
