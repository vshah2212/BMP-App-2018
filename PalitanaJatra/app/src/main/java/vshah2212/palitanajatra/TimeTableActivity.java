package vshah2212.palitanajatra;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TimeTableActivity extends AppCompatActivity {

    Button d1,d2,d3,d4,d5;
    TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,p1,p2,p3,p4,p5,p6,p7,p8,p9,dateV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_table);

        dateV = (TextView) findViewById(R.id.dateView);
        d1 = (Button) findViewById(R.id.day1);
        d2 = (Button) findViewById(R.id.day2);
        d3 = (Button) findViewById(R.id.day3);
        d4 = (Button) findViewById(R.id.day4);
        d5 = (Button) findViewById(R.id.day5);
        t1 = (TextView) findViewById(R.id.t1);
        t2 = (TextView) findViewById(R.id.t2);
        t3 = (TextView) findViewById(R.id.t3);
        t4 = (TextView) findViewById(R.id.t4);
        t5 = (TextView) findViewById(R.id.t5);
        t6 = (TextView) findViewById(R.id.t6);
        t7 = (TextView) findViewById(R.id.t7);
        t8 = (TextView) findViewById(R.id.t8);
        t9 = (TextView) findViewById(R.id.t9);
        p1 = (TextView) findViewById(R.id.p1);
        p2 = (TextView) findViewById(R.id.p2);
        p3 = (TextView) findViewById(R.id.p3);
        p4 = (TextView) findViewById(R.id.p4);
        p5 = (TextView) findViewById(R.id.p5);
        p6 = (TextView) findViewById(R.id.p6);
        p7 = (TextView) findViewById(R.id.p7);
        p8 = (TextView) findViewById(R.id.p8);
        p9 = (TextView) findViewById(R.id.p9);


        dateV.setText("17-01-2018");
        t1.setText("11:30am ");
        p1.setText("Seva Pooja");
        t2.setText("12:30pm ");
        p2.setText("Lunch");
        t3.setText("3:00pm ");
        p3.setText("Tea Time");
        t4.setText("3:30pm ");
        p4.setText("Sacha Sumtinath Darshan");
        t5.setText("5:00pm");
        p5.setText("Chauvihar");
        t6.setText("6:15pm");
        p6.setText("Pratikaman");
        t7.setText("7:00pm");
        p7.setText("Sandhya Bhakti at Taleti");
        t8.setText("9:00pm");
        p8.setText("Yatrik Meeting & Kit Distribution");
        t9.setText("10:30pm ");
        p9.setText("Santharo");


        d1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             dateV.setText("17-01-2018");
                t1.setText("11:30am");
                p1.setText("Seva Pooja");
                t2.setText("12:30pm");
                p2.setText("Lunch");
                t3.setText("3:00pm");
                p3.setText("Tea Time");
                t4.setText("3:30pm");
                p4.setText("Sacha Sumtinath Darshan");
                t5.setText("5:00pm");
                p5.setText("Chauvihar");
                t6.setText("6:15pm");
                p6.setText("Pratikaman");
                t7.setText("7:00pm");
                p7.setText("Sandhya Bhakti at Taleti");
                t8.setText("9:00pm");
                p8.setText("Yatrik Meeting & Kit Distribution");
                t9.setText("10:30pm");
                p9.setText("Santharo");
            }
        });
        d2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dateV.setText("18-01-2018");
                t1.setText("6:00am");
                p1.setText("Pratikaman");
                t2.setText("8:00am");
                p2.setText("Navkarsi");
                t3.setText("9:45am");
                p3.setText("Pravachan");
                t4.setText("11:30pm");
                p4.setText("Fruits & Fruit Juice (No lunch)");
                t5.setText("2:00pm");
                p5.setText("Pravachan at Chennai Dharamshala");
                t6.setText("6:30pm");
                p6.setText("Pratikaman");
                t7.setText("8:00pm");
                p7.setText("Vaiyavachiyo ni Meeting");
                t8.setText("");
                p8.setText("");
                t9.setText("");
                p9.setText("");
            }
        });
        d3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dateV.setText("19-01-2018");
                t1.setText("5:30am");
                p1.setText("Jatra Start");
                t2.setText("");
                p2.setText("");
                t3.setText("");
                p3.setText("");
                t4.setText("");
                p4.setText("");
                t5.setText("");
                p5.setText("");
                t6.setText("");
                p6.setText("");
                t7.setText("");
                p7.setText("");
                t8.setText("");
                p8.setText("");
                t9.setText("");
                p9.setText("");
            }
        });
        d4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dateV.setText("20-01-2018");
                t1.setText("5:30am");
                p1.setText("Jatra Start");
                t2.setText("");
                p2.setText("");
                t3.setText("");
                p3.setText("");
                t4.setText("");
                p4.setText("");
                t5.setText("");
                p5.setText("");
                t6.setText("");
                p6.setText("");
                t7.setText("");
                p7.setText("");
                t8.setText("");
                p8.setText("");
                t9.setText("");
                p9.setText("");
            }
        });
        d5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dateV.setText("21-01-2018");
                t1.setText("8:00am");
                p1.setText("Paarna");
                t2.setText("");
                p2.setText("");
                t3.setText("");
                p3.setText("");
                t4.setText("");
                p4.setText("");
                t5.setText("");
                p5.setText("");
                t6.setText("");
                p6.setText("");
                t7.setText("");
                p7.setText("");
                t8.setText("");
                p8.setText("");
                t9.setText("");
                p9.setText("");
            }
        });


    }
}
