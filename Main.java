import java.util.Scanner;
/********************************************
*	AUTHORS:	<your name> Aaron Siegman
* COLLABORATORS: <name of peer, tutor, instructor>
*	LAST MODIFIED:	<date of last change> 5/12/2022
********************************************/

/********************************************
*	<TITLE OF PROGRAM> Battleship
*********************************************
*	PROGRAM DESCRIPTION:
*	<1-2 sentences describing overall program>
*   This program runs a simplified version of the board game Battleship, where coordinates are input by the user via UtilityBelt.java, and the board is displayed in the console with the designated user specifications.
*********************************************
*	ALGORITHM:
*	<Pseudocode here>
*   1.
*	2.
*	3.
*********************************************
*	STATIC METHODS:
* <UML style list of static methods>
	public static void printBoard()
	public static void fillBoard(char boardStatus[][])
	public static void placeShip()
	public static void fillShip()
	public static void guessShipLocation()
*********************************************
*	ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
*	<ex: Scanner= used for console input>
*********************************************/

// <IMPORTS GO HERE>
import java.util.Scanner;

public class Main
{

  /***** CONSTANT SECTION *****/

 //char openWater


  public static void main(String[] args)
  {
    /***** DECLARATION SECTION *****/

	//Declaring 2-D array, 10 rows, 10 columns per row

	//int [ ][ ] numbers = new int [10][10];

	char [][] boardStatus = {
			{'O','O','O','O','O','O','O','O','O','O'},
			{'O','O','O','O','O','O','O','O','O','O'},
			{'O','O','O','O','O','O','O','O','O','O'},
			{'O','O','O','O','O','O','O','O','O','O'},
			{'O','O','O','O','O','O','O','O','O','O'},
			{'O','O','O','O','O','O','O','O','O','O'},
			{'O','O','O','O','O','O','O','O','O','O'},
			{'O','O','O','O','O','O','O','O','O','O'},
			{'O','O','O','O','O','O','O','O','O','O'},
			{'O','O','O','O','O','O','O','O','O','O'}
		};

	/*fillBoard(boardStatus);*/

	//Columns:  0  1  2  3  4  5  6  7  8  9
	//  Row A: [1][2][3][4][5][6][7][8][9][10]
	//  Row B: [1][2][3][4][5][6][7][8][9][10]
	//  Row C: [1][2][3][4][5][6][7][8][9][10]
	//  Row D: [1][2][3][4][5][6][7][8][9][10]
	//  Row E: [1][2][3][4][5][6][7][8][9][10]
	//  Row F: [1][2][3][4][5][6][7][8][9][10]
	//  Row G: [1][2][3][4][5][6][7][8][9][10]
	//  Row H: [1][2][3][4][5][6][7][8][9][10]
	//  Row I: [1][2][3][4][5][6][7][8][9][10]
	//  Row J: [1][2][3][4][5][6][7][8][9][10]

    /***** INITIALIZATION SECTION *****/

	//int counter = 1;

	//don't need counter;
	//refer to lab that converts ascii code(letters) to numbers

	/*for(int row = 0; row < numbers.length; row++)
	{
		//Go to OLI
		char letter = (char)(row + 'A');
		System.out.println("row: " + letter);
		for(int col = 0; col < numbers.length; col++)
		{
			char openWater = 'C';
			System.out.print("col: " + col);
			int value = numbers[row][col];
			System.out.print("value: " + numbers[row][col]);
		}
	}
	*/


//Algorithm for Placing one ship (possible method)
	//Input one sets of coordinates (one int, one int or char) start of ship
	//Input one sets of coordinates (one int, one int or char) end of ship
	//Use utilityBelt for user inputs (use four times)
	//Use three chars for whether a ship is there, a ship is hit, or openwater.
	// int lower = 1;
	// int upper = 10;


	//UtilityBelt.readInt("Please enter an x coordinate for the start of the ship", lower, upper);
	//UtilityBelt.readChar(String prompt, String validChars)

	/*String prompt = "Please enter an x coordinate for the start of the ship: ";
	String validChars = "A, B, C, D, E, F, G, H, I, J";

	char startX = UtilityBelt.readChar(/*"Please enter an x coordinate for the start of the ship: ", prompt, validChars);
	int startY = UtilityBelt.readInt("Please enter an y coordinate for the start of the ship: ", lower, upper);
	char endX = UtilityBelt.readChar(/*"Please enter an x coordinate for the start of the ship: ", prompt, validChars);
	int endY = UtilityBelt.readInt("Please enter an y coordinate for the end of the ship: ", lower, upper);*/

	// placeShip(numbers); //loop function call to place multiple ships

	//char shipPresent = '';
	//char shipHit = '';
	//char openWater = '';

//fill with the openwater char, then check to see if it is there by printing it (dynamic array method = loops; refer to module 13, 14)

	// printBoard(numbers); //Could potentially wrap

	  //////////////////////////////////////////////////// Write function that denotes sinkingopponentBoard.printBoard();System.out.println("Destroyer has sunk");//pseudocode /* *  * Inside ship declaration function placeShip() *  *  * force user to declare variable in order *  *  * Prompts: * Please place your cruiser: * a12, a13,a14 * This is a valid placement*  * please place your sub: * b13, b14,b15 * if (length = 3){Call this cruiser}if (length = 3){Call this sub}In reality:Order of Events:>Show board status>Print Empty board player/opp>Line Prompt saying what ship to fill in>PlaceShip(Number[][], shipName) into FillShip();>Invalid/valid ship placement function isValid() this is according to whatever ship its on ***>PlaceValidShip>Clear Screen with questionable ASCII (look up console clear screen for java) ***>Lineprompt to let opponent fill board>Do same for Opponent>>Game starts~1.5-2hr approx>>>InterfaceUser Input: (1-3)if 1 PrintHitScreenBoard (Top Board in battleship)2 ViewOwnBoard (To see your own board)3 HitBoard-1 Sentinel (if you really want to kill program early)If User =3 >>Declare hit values>GuessShipLocation()>Clearscreen>Pass to opponent>>Add function to detect that all ships are sunk ***>>Victory statement>>User prompt for Replay or quit if Quit, kill programreplay start fresh.~30 minutes to code

	Scanner user_input = new Scanner(System.in);

	// guessShipLocation(numbers);
	System.out.println("Battleship Menu");
	System.out.println("1. Display Hits and Misses");
	System.out.println("2. Display Player Board");
	System.out.println("3. Display Hitboard");
	System.out.println("4. Quit");

	int user_selected = user_input.nextInt();

	System.out.println("Please select an option from the menu: ");
	if (user_selected == 1) {
		fillBoard(boardStatus);
	} else {
		System.out.println("Your selection is not yet implemented");
	}
	//if (user_input == 2)
	// printBoard(numbers);

	Board playerBoard, opponentBoard;

	playerBoard = new Board();

	opponentBoard = new Board();

	playerBoard.printBoard();

	opponentBoard.printBoard();

	//playerBoard.

	/*public static void main(String[] args)
		{
			while (!menu.equals("quit"))
			{
				//read menu item from user (do you want to place a ship or attempt to hit a ship?)
				printmenu
				hitboard
				printboard
				hitboard
			}
		}

*/

	//if (row = )
	//{

	//}


//first fill the array, then print the array
//convert filling the array and printing array into methods
//get one user input to place a ship

    /***** INTRO SECTION *****/

    /***** INPUT SECTION *****/

    /***** PROCESSING SECTION *****/

    /***** OUTPUT SECTION *****/

  }

  /***** STATIC METHODS *****/
	//Description: printBoard takes in the multidimensional array numbers and
	//Precondition: @param
	//Postcondition:
	public static void printBoard(int[][]numbers)
	{
		//print 0 through 9 separated by a space
		System.out.println("col:    0 1 2 3 4 5 6 7 8 9");
		System.out.println(" ");
		for(int row = 0; row < numbers.length; row++)
		{
		//Go to OLI
			char letter = (char)(row + 'A');
			System.out.print("row: " + letter + "\t");
			for(int col = 0; col < numbers.length; col++)
			{
				//System.out.print("col: " + col);
				//int value = numbers[row][col];
				//System.out.print("value: " + value);
				char openWater = 'O'; //0 = Water
				char shipPresent = 'P'; //1 = Ship Present
				char shipHit = 'H'; //2 = Ship Hit


				if (numbers[row][col] == 0)
				{
					System.out.print(openWater);
				}
				else if (numbers[row][col] == 1)
				{
					System.out.print(shipPresent);
				}
				else if (numbers[row][col] == 2)
				{
					System.out.print(shipHit);
				}
				System.out.print(" ");
			}

			System.out.println();
		}

	}

	//fillboard method that fills with openWater char
	public static void fillBoard(char[][]numbers)
	{
		System.out.println("col:    0 1 2 3 4 5 6 7 8 9");
		System.out.println(" ");
		for (int i = 0; i < 10; i++) //row
		{
			char letter = (char)(i + 'A');
			System.out.print("row: " + letter + "\t");
			for (int j = 0; j < 10; j++) //column
			{
				System.out.print(numbers[i][j]);
				if (j != 9)
				{
					System.out.print(' '); // this is a space to separate columns.
				}
			}
			System.out.println();
		}
	}

	//placeship method that uses user input coordinates and then places the characters showing the ship' presence on the board.

	//prompt
	//get x, y, x2, y2

	//board.placeship(x, y, x2, y2);

	//class:

	//placeShip(char startX, int startY, char endX, int endY)

	//Board game = new Board();
	//game.print();

	//In main placeShip();
	public static void placeShip(int[][]numbers)
	{
		int lower = 0;
		int upper = 9;

		int letter = 0;
		int number = 0;

		String promptX1 = "Please enter an x coordinate for the start of the ship: ";
		String promptY1 = "Please enter an y coordinate for the start of the ship: ";
		String promptX2 = "Please enter an x coordinate for the end of the ship: ";
		String promptY2 = "Please enter an y coordinate for the end of the ship: ";
		String validChars = "A, B, C, D, E, F, G, H, I, J";

		//replace with readString method, use charat to get row and column

		char startX = UtilityBelt.readChar(/*"Please enter an x coordinate for the start of the ship: ",*/ promptX1, validChars);
		int startY = UtilityBelt.readInt(/*"Please enter an y coordinate for the start of the ship: ",*/promptY1, lower, upper);
		char endX = UtilityBelt.readChar(/*"Please enter an x coordinate for the start of the ship: ",*/ promptX2, validChars);
		int endY = UtilityBelt.readInt(/*"Please enter an y coordinate for the end of the ship: ",*/promptY2, lower, upper);

		//error check for ship placement; one must be purely horizontal or purely vertical
		if (!(startX == endX || startY == endY))
		{
			System.out.println("Error : either x coordinates or y cordinates must be equal to each other in order for a ship to be placed; retry.");
			return;
		}

		//convert char to int
		letter = startX - 65; //represents place on board; new x coordinate
		number = startY; // represents place on board; new y coordinate

		numbers[letter][number] = 1; //shipPresent

		letter = endX - 65; //represents place on board; new x coordinate
		number = endY; // represents place on board; new y coordinate
		/*char openWater = 'O'; //0 = Water
		char shipPresent = 'P'; //1 Ship Present
		char shipHit = 'X'; //2 Ship Hit*/

		numbers[letter][number] = 1; //shipPresent

		fillShip(numbers, startX, endX, startY, endY);
		//Create a loop where the start is (startX, startY) and it iterates through until it hits (endX, endY)
	}

	//Pseudocode for filling in between start of ship and end of ship
//Make a variable for shipLength, construct a for loop that iterates through the spaces between the start and end coordinates of the ship, and have something that allows for the program to fill in the ship effectively regardless of the ship's orientation.

	public static void fillShip(int[][]numbers, char startX, char endX, int startY, int endY)
	{
		int shipLengthVertical = ((endX - 65) - (startX - 65)) + 1;

		int shipLengthHorizontal = ((endY) - (startY)) + 1;
		//System.out.print(shipLengthHorizontal + " " +  shipLengthVertical);
		if (shipLengthHorizontal > 2)
		{
			for (int i = 0; i < shipLengthHorizontal; i++)
			{
				numbers[endX - 65][i] = 1;
			}
		}
		else if (shipLengthVertical > 2)
		{

			for (int i = 0; i < shipLengthVertical; i++)
			{
				numbers[i][endY] = 1;
			}
		}

	}


	//Pseudocode for guessing ship location
//Use the

	public static void guessShipLocation(int[][]numbers)
	{
		int lower = 0;
		int upper = 9;

		int letter = 0;
		int number = 0;

		String prompt = "Please enter an x coordinate for the start of the ship: ";
		String validChars = "A, B, C, D, E, F, G, H, I, J";

		char guessX = UtilityBelt.readChar(/*"Please enter an x coordinate for the start of the ship: ",*/ prompt, validChars);
		int guessY = UtilityBelt.readInt("Please enter an y coordinate for the start of the ship: ", lower, upper);

		letter = guessX - 65; //represents place on board; new x coordinate
		number = guessY; // represents place on board; new y coordinate

		if (numbers[letter][number] == 1)  //shipPresent; converted O to P
		{
			numbers[letter][number] = numbers[letter][number] + 1; //or numbers[letter][number]++
			System.out.println("Ship was hit!");

		}
		else
		{
			System.out.println("Miss!");
		}


	}




	// public static void inputCoordinates(String prompt)
	// {
	// 	//replace with readString method, use charat to get row and column


	// 	char startX = UtilityBelt.readString(/*"Please enter an x coordinate for the start of the ship: ",*/ prompt, lower, upper);
	// 	int startY = UtilityBelt.readInt("Please enter an y coordinate for the start of the ship: ", lower, upper);
	// 	char endX = UtilityBelt.readChar(/*"Please enter an x coordinate for the start of the ship: ",*/ prompt, validChars);
	// 	int endY = UtilityBelt.readInt("Please enter an y coordinate for the end of the ship: ", lower, upper);

	// }
	// 	*/


	public static void Interface()
	{
		Scanner user_input = new Scanner(System.in);

		System.out.println("Battleship Menu");
		System.out.println("1. Display Hits and Misses");
		System.out.println("2. Display Player Board");
		System.out.println("3. Display Hitboard");
		System.out.println("4. Quit");

		int user_selected = user_input.nextInt();

		System.out.println("Please select an option from the menu: ");
		if (user_selected == 1) {
			System.out.println("You selected #1");
			//playerBoard.fillBoard(boardStatus);
		} else if (user_selected == 2) {
			System.out.println("You selected #2");
		} else {
			System.out.println("Your selection is not yet implemented");
		}

	}
}





//make a board class, use setters to set ship at a certain spot, getters to get a certain location, setall to set all of the openwater places on the board. Put code for placing and filling in ship in this class.

//Create two board objects, one that is the player board and one that is the opponent board. Create a print method that prints the board for the player, and a print method for the opponent, which would print everything except the ships. Still print literals for openwater, hits and misses, but not the ships.

//System.cls
