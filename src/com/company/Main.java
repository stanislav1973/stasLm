package com.company;

import java.util.Scanner;

public class Main {
static int numberShip = 5;
    public static void inputCoordinates(){
        int count = 5;
        String[][]arr = Battleship.getArray();
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {

            String startCoordinates = scanner.next();
            String endCoordinates1 = scanner.next();

            String  start = startCoordinates.substring(0,1);
            int intStart = Integer.parseInt(startCoordinates.substring(1));

            String end = endCoordinates1.substring(0,1);
            int intEnd = Integer.parseInt(endCoordinates1.substring(1));

            short firstStart = (short) Battleship.transformationCoordinates(start);
            short endStart = (short) Battleship.transformationCoordinates(end);

            int sum = Math.abs(intStart - intEnd) + 1;

            if(sum != count){
                System.out.print("Error! Wrong length of the Submarine! Try again:\n");
                continue;
            }
            count--;
            AddShips.addShipsOnField(firstStart, (short) intStart , endStart, (short) intEnd,arr);
            if(count < 1){
                break;
            }
            AddShips.inputText(numberShip);

        }
    }
    public static void main(String[] args) {
        Battleship.inputFieldOnConsole();
        AddShips.inputText(numberShip);
       inputCoordinates();
    }
}














