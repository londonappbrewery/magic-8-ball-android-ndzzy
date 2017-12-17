package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView ballDisplay;
        ballDisplay=(ImageView)findViewById(R.id.img_8ball);

        //Array Inhalte mit GESCHWEIFTER KLAMMER
        final int[] ballArray = {R.drawable.ball1,
                            R.drawable.ball2,
                            R.drawable.ball3,
                            R.drawable.ball4,
                            R.drawable.ball5};

        final Button askButton = (Button) findViewById(R.id.btn_ask);

        //der Code wird automatisch eingefügt nach new View.OnClickListener()
        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rdmNumGen = new Random();
                int rdmNum = rdmNumGen.nextInt(5);
                //Log.d("8ball", "rdmNum= " + rdmNum);
                //bound 5 bedeutet von 0 bis 4 also: 0 bis bound i-1

                //Dem Bild das Objekt aus dem Array über Zufallszahl zuweisen
                ballDisplay.setImageResource(ballArray[rdmNum]);



            }
        });







    }
}
