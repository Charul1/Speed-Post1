package com.example.rachiket.speed_post;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by udaipur on 7/2/2017.
 */

public class Hindi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_hindi);

        Button useKioskButHindi = (Button)findViewById(R.id.back_use_kiosk_hindi);
        useKioskButHindi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(),UseKioskHindi.class);
                startActivity(i);
            }
        });

        Button printQRButHindi = (Button)findViewById(R.id.print_QR_hindi);
        printQRButHindi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(),GenerateQR_Hindi.class);
                startActivity(i);
            }
        });

        Button postButHindi = (Button)findViewById(R.id.post_letter_hin);
        postButHindi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(),UseKioskHindi.class);
            }
        });

    }
}
