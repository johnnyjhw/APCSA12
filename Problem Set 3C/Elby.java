public class Elby {
    /**
     * Get a default greeting
     *
     * @return a greeting
     */
    public String getGreeting() {
        return "Hello, let's talk.";
    }

    /**
     * Gives a response to a user statement
     *
     * @param statement the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement) {
        int index - findKeyward(statement, "hello", 0);
        if (index != -1) {
            return "Hello! How can I help you today?";
        } else {
            return "I'm not sure what you mean.";
        
        String response = "";

        if (statement.indexOf("mother") >= 0
        || statement.indexOf("father") >= 0
        || statement.indexOf("sister") >= 0
        || statement.indexOf("brother") >= 0) {
            response = "Tell me more about your family.";
        } else if (statement.indexOf("no"){
            reponse = "Why so serious?";
        }
        else if (statement.indexOf("dog") >= 0
        || statement.indexOf("cat") >= 0
        ) {
            response = "Tell me more about your pets. ";
        } else if (statement.indexOf("Johnny") >= 0) {
            response = "He is a good student";
        } else if (statement.trim().length() == 0) {
            response = "Say something, please";
        } else if (statement.indexOf("sad") >= 0) {
            response = "I hope you feel better soon";
        } else if (statement.indexOf("depressed") >= 0) {
            response = "You should talk to a therapist";
        } else if (statement.indexOf("pizza") >= 0) {
            response = "I LOVE CHEESE";
        }
        else {
            response = getRandomResponse();
        }

        return response;
    }

    /**
     * Pick a default response to use if nothing else fits.
     *
     * @return a non-committal string
     */
    private String getRandomResponse() {
        final int NUMBER_OF_RESPONSES = 5;
        double r = Math.random();
        int whichResponse = (int) (r * NUMBER_OF_RESPONSES);

        String response = "";

        if (whichResponse == 0) {
            response = "Interesting, tell me more.";
        } else if (whichResponse == 1) {
            response = "Hmmm.";
        } else if (whichResponse == 2) {
            response = "Do you really think so?";
        } else if (whichResponse == 3) {
            response = "You don't say.";
        } else if (whichResponse == 4) {
            response = "Bro what?";
        } else if (whichResponse == 5) {
            reponse = "I see...";
        } else if (whichResponse == 6) {
            reponse = "Why does this bother you?";
        }

        return response;
    }


    public int findKeyword(String statement, String goal, int startPos) {
        String phrase = statement.trim().toLowerCase();
        goal = goal.toLowerCase();

        int goalPos = phrase.indexOf(goal, startPos);
        while (goalPos >= 0) {
            String before = " ", after = " ";
            if (goalPos > 0) {
                before = phrase.substring(goalPos - 1, goalPos);
            }

            if (goalPos + goal.length() < phrase.length()) {
                after = phrase.substring(goalPos + goal.length(), 
                    goalPos + goal.length() + 1);
            }

      
            if (((before.compareTo("a") < 0) || (before.compareTo("z") > 0)) &&                
            ((after.compareTo("a")  < 0) || (after.compareTo("z")  > 0))) {
                return goalPos;
            }

            goalPos = phrase.indexOf(goal,goalPos + 1);
        }
        return -1;
    }
}
 