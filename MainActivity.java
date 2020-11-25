package com.example.parkingcharges;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView total;
    EditText parkingHour;
    Button btnCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        float hourRate = (float) 1.4;
        total = (TextView)findViewById(R.id.total);
        parkingHour = (EditText)findViewById(R.id.parkingHour);
        btnCount = (Button)findViewById(R.id.btnCount);

        btnCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float totalCharge = hourRate * Integer.parseInt(parkingHour.getText().toString());
                total.setText("" + totalCharge);
            }
        });
    }
}
