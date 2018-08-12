package com.sanamshikalgar.unheard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();
    private UnheardContent factBook = new UnheardContent();
    private RandomColors colorWheel = new RandomColors();
    // Declare our View variables
    private TextView factTextView;
    private Button showNextButton;
    private Button showPreviousButton;
    private LinearLayout linearLayout;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // Assign the Views from the layout file to the corresponding variables
        factTextView = findViewById(R.id.factTextView);
        factTextView.setText(factBook.getFact()); // Update the screen with our new fact to start execution right away
        linearLayout = findViewById(R.id.linearLayout);
        showNextButton = findViewById(R.id.showNextButton);
        showPrevious = findViewById(R.id.showPreviousText);
        
        // Shuffle Button logic
        showNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fact = factBook.getFact();
                counter++;
                factTextView.setText(fact);

                int color = colorWheel.getColor();
                linearLayout.setBackgroundColor(color);
            }
        });
        
        // Previous Button logic
        showPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fact = factBook.getPreviousFact();
                factTextView.setText(fact);

                int color = colorWheel.getColor();
                linearLayout.setBackgroundColor(color);
            }
        });
    }
}
