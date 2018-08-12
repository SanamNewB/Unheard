package com.sanamshikalgar.unheard;

import android.graphics.Color;

import java.util.Random;

public class RandomColors {
    // Fields or Member Variables - Properties about the object
    private String[] colors = {
            "#7986cb",
            "#c5cae9",
            "#b39ddb",
            "#9fa8da",
            "#90caf9",
            "#bbdefb",
            "#42a5f5",
            "#3f51b5",
            "#303f9f",
            "#1976d2"
    };

    // Methods - Actions the object can take
    int getColor() {
        // Randomly select a color
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(colors.length);
        int color = Color.parseColor(colors[randomNumber]);
        return color;
    }
}
