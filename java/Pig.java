import java.util.Scanner;

public class Pig{
  public static void main (String[] args){
    Scanner scan = new Scanner(System.in);
    int points = 0;
    int roundpoints = 0;
    int comroundpoints = 0;
    int compoints= 0;
    int dice1 = 0;
    int dice2 = 0;
    PairOfDice dice = new Paradise();
    while (true){
    points = 0; 
    compoints= 0;
    System.out.println("Welcome to Pig!");
    System.out.println("Press 1 to start or press 2 for the rules");
    System.out.println();
    int input = scan.nextInt();

    if (input == 2){
      System.out.println("Against the computer, you will roll a pair of die and the numbers you get will be added to your points, or you could bank your points earned.");
      System.out.println("However, if you get a one, you will lose your points that you got that round and your turn will end.");
      System.out.println("If you get both ones (Snake Eyes), you lose all of your points, even from the bank! The first to get to 100 points wins.");
      System.out.println();
    }
    int turn = (int)(Math.random()*2)+1;
while (input == 1 && points < 100 && compoints < 100){
    if (turn % 2 != 0 ){
        System.out.println("It's your turn!");
        System.out.println("Press 1 to roll or press 2 to end your turn");
        int choice = scan.nextInt();
        if (choice == 1){
            dice1 = dice.paradice1(dice1);
            dice2 = dice.paradice2(dice2);
            if ((dice1 == 1 || dice2 == 1) && dice1 != dice2){
              System.out.println();
              System.out.println(dice1 + "   " + dice2);
              System.out.println("==========You got a one. You lost your points for this round==========");
              System.out.println("Your points: " + points +"\nComputer points: " + compoints);
              roundpoints = 0;
              turn += 1;
            }
            else if (dice1 != 1 || dice2 != 1){
              System.out.println();
              System.out.println(dice1 + "   " + dice2);
              System.out.println("You got " + (dice1+dice2) + " points!");
              roundpoints += dice1 + dice2;
              System.out.println("Round points accumulated: " +roundpoints);
            }
else if (dice1 == 1 && dice2 == 1){
              System.out.println();
              System.out.println(dice1 + "   " + dice2);
              System.out.println("||||||||||||||||Snake eyes! You lost ALL of your points!||||||||||||||||");
              roundpoints = 0;
              points = 0;
              System.out.println("Your points: " + points +"\nComputer points: " + compoints);
              turn += 1;
            }
        }
            System.out.println();

            if (choice != 1){
              points += roundpoints;
              System.out.println("Your points: " + points +"\nComputer points: " + compoints);
              turn +=1;
            }
      }

      if (turn % 2 == 0 && points < 100 && compoints < 100){
        System.out.println("It's the computer's turn!");
        comroundpoints=0;
        int end = 0;
        while (comroundpoints < 20 && end != 1){
        try{
            Thread.sleep(1500);
        }
catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        }
          dice1 = dice.paradice1(dice1);
          dice2 = dice.paradice2(dice2);
          if ((dice1 == 1 || dice2 == 1) && dice1 != dice2){
              System.out.println();
              System.out.println(dice1 + "   " + dice2);
              System.out.println("==========The computer got a one, it has lost its round points!==========");
              System.out.println("Your points: " + points +"\nComputer points: " + compoints);
              System.out.println();
              System.out.println("=================================================================");
              comroundpoints = 0;
               end = 1;
            }
          else if (dice1 == 1 && (dice1==dice2)){
            System.out.println();
            System.out.println(dice1 + "   " + dice2);
            System.out.println("||||||||||||||||Snake eyes! The computer lost all of its points!||||||||||||||||");

            System.out.println("=================================================================");
            comroundpoints = 0;
            compoints = 0;
            System.out.println("Your points: " + points +"\nComputer points: " + compoints);
            System.out.println();
             end = 1;
          }
else {
            System.out.println();
            System.out.println(dice1 + "   " + dice2);
            System.out.println("The computer got " + (dice1 + dice2) + " points!");
            comroundpoints += dice1+dice2;
            System.out.println("Round points accumulated: " + comroundpoints);
          }
          if(comroundpoints+compoints >= 100)
              end = 1;
          }
       compoints += comroundpoints;
       if (comroundpoints >= 20 || comroundpoints+compoints >= 100) {
           try{
            Thread.sleep(1500);
        } 
        catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        }
System.out.println();
           System.out.println("The computer banked its points!");
           System.out.println("Your points: " + points +"\nComputer points: " + compoints);
           System.out.println();
           System.out.println("=================================================================");
       }
       turn += 1;
       roundpoints = 0;
      }
      if (points >= 100){
          System.out.println();
        System.out.println("You win!");
      }
      else if (compoints >= 100){
          System.out.println();
        System.out.println("You lose!");
      }
      }
    }
  }
  }