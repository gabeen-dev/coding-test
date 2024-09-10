package org.example;

import java.awt.*;

public class Angle {

    public static void main(String[] args) {
        Angle sol = new Angle();
        int diff = sol.solution(100);
        System.out.println(diff);
    }

    public int solution(int angle) {

        if (0 < angle && angle <= 180){
            if (0 < angle && angle < 90) {
                return 1;
            }else if (angle == 90) {
                return 2;
            }else if (90 < angle && angle < 180) {
                return 3;
            }else if (angle == 180) {
                return 4;
            }else {
                return 0;
            }
        }else {
            return 0;
        }
    }
}
