package newProject;

import java.util.*;

public class SimpleStartupGame {
        public static void main(String[] args) {
                SimpleStartup game1 = new SimpleStartup();
                Scanner input = new Scanner(System.in);

                int noOfGuess = 0;
                String result = "start";
                String userGuess;

                ArrayList<String> location = new ArrayList<String>();

                int randomNum = (int) (Math.random() * 5);

                String random = Integer.toString(randomNum);
                location.add(random);

                for(int i = 1;i < 3;i ++){
                        random = Integer.toString(randomNum + i);
                        location.add(random);  
                }

                game1.setLocationCells(location);

                while (!(result.equals("kill"))) {
                        System.out.println("Enter your guess >");
                        userGuess = input.nextLine();
                        noOfGuess++;

                        result = game1.checkYourself(userGuess);
                        System.out.println(result);
                }
                System.out.println("You took " + noOfGuess + " guesses.");
                input.close();
        }

}
