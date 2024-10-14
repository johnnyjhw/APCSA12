public class Elby {

    public String getGreeting() {
        return "Hello, let's talk.";
    }


    public String getResponse(String statement) {
        String response = "";

        if (findKeyword(statement, "I want to", 0) >= 0) {
            response = transformIWantToStatement(statement);
        } else if (findKeyword(statement, "you", 0) >= 0
                && findKeyword(statement, "me", findKeyword(statement, "you", 0)) >= 0) {
            response = transformYouMeStatement(statement);
        } else if (findKeyword(statement, "mother", 0) >= 0
                || findKeyword(statement, "father", 0) >= 0
                || findKeyword(statement, "sister", 0) >= 0
                || findKeyword(statement, "brother", 0) >= 0) {
            response = "Tell me more about your family.";
        } else if (findKeyword(statement, "no", 0) >= 0) {
            response = "Why so serious?";
        } else if (findKeyword(statement, "dog", 0) >= 0
                || findKeyword(statement, "cat", 0) >= 0) {
            response = "Tell me more about your pets.";
        } else if (findKeyword(statement, "Johnny", 0) >= 0) {
            response = "He is a good student.";
        } else if (statement.trim().length() == 0) {
            response = "Say something, please.";
        } else if (findKeyword(statement, "sad", 0) >= 0) {
            response = "I hope you feel better soon.";
        } else if (findKeyword(statement, "depressed", 0) >= 0) {
            response = "You should talk to a therapist.";
        } else if (findKeyword(statement, "pizza", 0) >= 0) {
            response = "I LOVE CHEESE!";
        } else {
            response = getRandomResponse();
        }

        return response;
    }


    private String getRandomResponse() {
        final int NUMBER_OF_RESPONSES = 6;
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
            response = "I see...";
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
                ((after.compareTo("a") < 0) || (after.compareTo("z") > 0))) {
                return goalPos;
            }

 
            goalPos = phrase.indexOf(goal, goalPos + 1);
        }

        return -1;
    }

    /**
     * Take a statement with "you <something> me" and transform it into "What makes
     * you think that I <something> you?"
     *
     * @param statement the user statement, assumed to contain "you" followed by "me"
     * @return the transformed statement
     */
    public String transformYouMeStatement(String statement) {
       
        statement = statement.trim();
        String lastChar = statement.substring(statement.length() - 1);
        if (lastChar.equals(".")) {
            statement = statement.substring(0, statement.length() - 1);
        }

        int posOfYou = findKeyword(statement, "you", 0);
        int posOfMe = findKeyword(statement, "me", posOfYou + 3);

        String restOfStatement = statement.substring(posOfYou + 3, posOfMe).trim();
        return "What makes you think that I " + restOfStatement + " you?";
    }


    public String transformIWantToStatement(String statement) {
       
        statement = statement.trim();
        String lastChar = statement.substring(statement.length() - 1);
        if (lastChar.equals(".")) {
            statement = statement.substring(0, statement.length() - 1);
        }
        int pos = findKeyword(statement, "I want to", 0);
        String restOfStatement = statement.substring(pos + 9).trim();
        return "What would it mean to " + restOfStatement + "?";
    }
}
