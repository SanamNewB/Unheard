package com.sanamshikalgar.unheard;


import java.util.Random;

public class UnheardContent {
    // Fields or Member Variables - Properties about the object
    private String[] facts = {
            // add content here separated by commas
            "Earth is the only planet that is not named after a god.",
            "There are 5 temples in Kyoto, Japan that have blood stained ceilings. " +
                    "The ceilings are made from the floorboards of a castle where warriors killed themselves after a long hold-off against an army. " +
                    "To this day, you can still see the outlines and footprints.",
            "68% of the universe is dark energy, and 27% is dark matter; both are invisible, even with our powerful telescopes. " +
                    "This means we have only seen 5% of the universe from earth.",
            "The founders of Google were willing to sell Google for $1 million to Excite in 1999, but Excite turned them down. " +
                    "Google is now worth $527 Billion.",
            "In the past 20 years, scientists have found over 1,000 planets outside of our solar system.",
            "If you started with $0.01 and doubled your money every day, it would take 27 days to become a millionaire.",
            "A person can live without food for about a month, but only about a week without water.\n" +
                    "If the amount of water in your body is reduced by just 1%, you’ll feel thirsty.\n" +
                    "If it’s reduced by 10%, you’ll die.",
            "Russia has a larger surface area than Pluto.",
            "You’ll find a Z (Arizona), a J (New Jersey), and even two X’s (New Mexico and Texas)—but not a single Q",
            "People stash their phones in their back pockets all the time, which is why Samsung created a robot that is shaped like a butt—and yes, " +
                    "even wears jeans—to “sit” on their phones to make sure they can take the pressure.",
            "Armadillo shells are bulletproof",
            "Firefighters use wetting agents to make water wetter. " +
                    "The chemicals reduce the surface tension of plain water so it’s easier to spread and soak into objects," +
                    " which is why it’s known as “wet water.” ",
            "Iceland’s last McDonald’s burger was sold nine years ago …",
            "The American flag was designed by a high school student Bob Heft’ in 1958 as a school project",
            "The clothing retail shop was originally called Hennes—Swedish for “hers”—before acquiring the hunting and fishing equipment brand Mauritz Widforss. " +
                    "Eventually, Hennes & Mauritz was shortened to H&M.",
    };

    // Methods - Actions the object can take
    public String getFact() {
        // Randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(facts.length);
        return facts[randomNumber];
    }
}
