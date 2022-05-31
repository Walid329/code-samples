

// allows user input
import java.util.Scanner;

// allows use of random numbers
import java.util.Random;

public class Rockets
{
  public static void main (String[] args)
  {
    // randomizes the computer's choice
    Random rand = new Random();
    
    // to scan the user's choice
    Scanner scan = new Scanner(System.in);
    
    // introduces the name of the game
    System.out.println ("Welcome to: "
                          + "\nRockets, Panthers, Spartans");
    
    // rules for the game and useful information
    System.out.println();
    System.out.println ("Rules and Information: " // idea from Kidus Zegeye
                          + "\n 1) Select a number that is 1, 2, or 3."
                          + "\n 2) Each number represents a choice of Rockets, Panthers, or Scissors."
                          + "\n 3) Selecting the number 1 will give you the choice of Rockets,"
                          + "\n    2 = Panthers, 3 = Spartans."
                          + "\n 4) The computer's choice will be randomly selected."
                          + "\n 5) The winner of each round will be determined after both parties have selected."
                          + "\n 6) The statistics of the game will be printed after each round."
                          + "\n 7) The player with more round wins total wins the game at the end."
                          + "\n 8) Entering an invalid input will count against your number of rounds played."
                          + "\n 9) You must enter an integer when prompted."
                          + "\n 10) Rockets beat Panthers, Panthers beat Scissors, Scissors beat Rockets.");
    
    // sets variables to zero
    int numRounds = 0;
    int numUser = 0;
    int numTie = 0;
    int numComp = 0;      
    
    // user input for amount of rounds
    Scanner input = new Scanner(System.in);
    System.out.println();
    System.out.println("How many times would you like to play? ");
    int loop = input.nextInt();
    for(int i = 0; i < loop; i++) // from stack overflow user: ItamarG3
    {
      
      System.out.println();
      
      // instructions for the user
      System.out.println ("Pick an integer 1 - 3: ");
      
      // number that is scanned for user's choice
      int rps = scan.nextInt();
      numRounds+=1;
      
      // computer's number for choice
      int game;
      
      // rockets = rock
      // panthers = paper
      // spartans = scissors
      
      // user picks rock (rockets)  
      if (rps == 1) 
      {
        System.out.println("You have selected: Rockets");
      }
      
      // user picks paper (panthers)
      else if (rps == 2) 
      {
        System.out.println("You have selected: Panthers");
        
      }
      
      // user picks scissors (spartans)
      else if (rps == 3)
      {
        System.out.println("You have selected: Spartans");
        
      }
      // if input is not between 1 through 3
      else
      {
        System.out.println("That is not a valid input.");
        System.out.println("Please enter an integer 1 - 3: ");
        rps = scan.nextInt();
      }
      
      System.out.println();
      
      game = rand.nextInt(3) + 1;
      if (game == 1)
        System.out.println("Computer selection: Rockets");
      
      if (game == 2)
        System.out.println("Computer selection: Panthers");
      
      if (game == 3)
        System.out.println("Computer selection: Spartans");
      
      System.out.println();
      
      /* rock beats scissors
       * scissors beats paper
       * paper beats rock */
      
      // rock = 1, paper = 2, scissors = 3 
      
      /* possible outcomes:
       * rock rock - tie
       * rock paper - paper wins
       * rock scissors - rock wins
       * paper paper - tie
       * paper rock - paper wins
       * paper scissors - scissors wins
       * scissors scissors - tie
       * scissors rock - rock wins
       * scissors paper - scissors wins
       * total: 9 */
      
      String user = "You win!";
      String comp = "Computer wins!";
      String tie = "It's a tie!";
      
      //user is 1 computer is 1
      // user: rock, computer: rock
      if ((rps == 1) && (game == 1)) 
      { 
        System.out.println(tie);
        numTie++;
      }
      
      // user is 1 computer is 2
      // user: rock, computer: paper
      if ((rps == 1) && (game == 2)) 
      {
        System.out.println(user);
        numUser++;
      }
      
      // user is 1 computer is 3
      // user: rock, computer: scissors
      if ((rps == 1) && (game == 3)) 
      {
        System.out.println(user);
        numUser++;
      }
      
      // user is 2 computer is 1
      // user: paper, computer: rock
      if ((rps == 2) && (game == 1)) 
      {
        System.out.println(user);
        numUser++;
      }
      
      // user is 2 computer is 2
      // user: paper, computer: paper
      if ((rps == 2) & (game == 2))
      {
        System.out.println(tie);
        numTie++;
      }
      
      
      // user: paper, computer: rock
      if ((rps == 2) && (game == 3))
      {
        System.out.println(comp);
        numComp++;
      }
      
      
      // user is 3 computer is 1
      // user: scissors, computer: rock
      if ((rps == 3) && (game == 1))
      {
        System.out.println(comp);
        numComp++;
      }
      
      
      // user is 3 computer is 2
      // user: scissors, computer: paper
      if ((rps == 3) && (game == 2))
      {
        System.out.println(user);
        numUser++;
      }
      
      
      // user is 3 computer is 3
      // user: scissors, computer: rock
      
      if ((rps == 3) && (game == 3))
      {
        System.out.println(tie);
        numTie++;
      }
      
      // statistics of game
      System.out.println();
      System.out.println("Statistics: ");
      System.out.println ("You have played: " + numRounds + " round(s) so far");
      System.out.println ("Computer's wins: " + numComp);
      System.out.println ("Ties: " + numTie);
      System.out.println ("Your wins: " + numUser);
    }
    
    // extras for user
    System.out.println();
    System.out.println ("Thank you for playing!");
    System.out.println();
    
    // runs program again
    System.out.println("Click [F2] to play again (Dr Java)");
    System.out.println("Click [Ctrl] + [F11] to play again (Eclipse)");
    System.out.println();
  }
}
