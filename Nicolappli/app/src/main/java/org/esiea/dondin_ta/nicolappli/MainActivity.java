package org.esiea.dondin_ta.nicolappli;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
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


        bgElement.setBackgroundColor(Color.argb(255, 255, 0, 127));

    }

    public void gayModeDesactivated(View v) {

        Toast.makeText(getApplicationContext(), getString(R.string.gaymodedesact), Toast.LENGTH_LONG).show();
        RelativeLayout bgElement = (RelativeLayout) findViewById(R.id.container);


        bgElement.setBackgroundColor(Color.WHITE);

    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        RelativeLayout bgElement = (RelativeLayout) findViewById(R.id.container);

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.homo:
                if (checked)
                    // homo
                    bgElement.setBackground(getResources().getDrawable(R.drawable.homo));
                    break;
            case R.id.lesbia:
                if (checked)
                    // lesbia
                    bgElement.setBackground( getResources().getDrawable(R.drawable.lesbi) );
                    break;

            case R.id.animal:
                if (checked)
                    // animal
                bgElement.setBackground(getResources().getDrawable(R.drawable.animal));
                    break;
        }
    }



        }


