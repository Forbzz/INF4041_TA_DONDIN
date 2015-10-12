package org.esiea.dondin_ta.nicolappli;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gayMode(View v) {

        Toast.makeText(getApplicationContext(), getString(R.string.gaymode), Toast.LENGTH_LONG).show();
        RelativeLayout bgElement = (RelativeLayout) findViewById(R.id.container);
       int switchgay =0;

                bgElement.setBackgroundColor(Color.argb(255, 255, 0, 127));

            }

        }
       

