package newProject;

import java.util.ArrayList;

public class SimpleStartup {
    private ArrayList<String> locationCells;
//    private int noOfHits = 0;

    public void setLocationCells(ArrayList<String> location){
        locationCells = location;
    }

    public String checkYourself(String userGuess){
        String result = "miss";
        int idx = locationCells.indexOf(userGuess);
        if(idx >= 0){
            locationCells.remove(idx);
            if(locationCells.isEmpty()){
                result = "kill";
            }
            else {
                result = "hit";
            }
        }
        return result;
   }
}


