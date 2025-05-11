package ProblemSolving;

public class CountingValleys {
    public static void main(String[] args) {

        int steps = 8;
        String path = "UDDDUDUU";
        System.out.println(countingValleys(steps, path));
    }

    /*

    https://www.hackerrank.com/challenges/counting-valleys/problem?isFullScreen=true

    An avid hiker keeps meticulous records
     of their hikes. During the last hike that took exactly
     steps, for every step it was noted if it was an uphill, U
     , or a downhill, D step. Hikes always start and end at sea level
     , and each step up or down represents a  unit change in altitude.
     We define the following terms:

A mountain is a sequence of consecutive steps above sea level,
 starting with a step up from sea level and ending with a step
  down to sea level.
A valley is a sequence of consecutive steps below sea level,
 starting with a step down from sea level and ending
 with a step up to sea level.
Given the sequence of up and down steps during a hike,
 find and print the number of valleys walked through.

     */

    public static int countingValleys(int steps, String path) {

        int countingValleys = 0;
        int totalDiatance = 0;

        for (int i = 0; i < steps; i++) {
            if (path.charAt(i) == 'U') {
                if (totalDiatance == -1) {
                    countingValleys++;
                }
                totalDiatance++;
            }
            if (path.charAt(i) == 'D') {
                totalDiatance--;
            }


        }

        return countingValleys;

    }
}
