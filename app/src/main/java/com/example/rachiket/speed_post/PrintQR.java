package com.example.rachiket.speed_post;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Rachiket on 21-06-2017.
 */

public class PrintQR extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.printing_qr);

        Button backBut = (Button) findViewById(R.id.back_from_print);
        backBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), GenerateQR.class);
                startActivity(i);
            }
        });

    }

}
