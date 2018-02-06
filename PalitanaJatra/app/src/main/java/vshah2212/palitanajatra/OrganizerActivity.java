package vshah2212.palitanajatra;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class OrganizerActivity extends AppCompatActivity {

    EditText inp;
    Button upd;
    CheckBox CBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_organizer);

        inp = (EditText) findViewById(R.id.inputY);
        upd = (Button) findViewById(R.id.updateY);
        CBox = (CheckBox) findViewById(R.id.cb);

        upd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(inp.getText().toString()=="")
                {
                    Toast.makeText(getApplicationContext(),"Please enter a value!",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    if(CBox.isChecked()) {
                        String message = inp.getText().toString();
                        CBox.toggle();
                        new sendData(getApplicationContext()).execute(message);
                    }
                    else {
                        Toast.makeText(getApplicationContext(),"Please tick the check box!",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }
}
