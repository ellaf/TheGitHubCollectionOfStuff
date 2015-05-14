// Copyright Wintriss Technical Schools 2013
import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
	public static void main(String[] args)
	{
		
	

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
int RandomNumber = new Random().nextInt(8);
	// 3. Print out this variable

	// 4. Get the user to enter a question for the 8 ball
String Question = JOptionPane.showInputDialog("Okay, ask me any yes or no question!");

	// 5. If the random number is 0
if(RandomNumber == 0)
{
	JOptionPane.showMessageDialog(null, "Yes!");
}

if(RandomNumber == 1)
{
	JOptionPane.showMessageDialog(null, "No.");
}

if(RandomNumber == 2)
{
	JOptionPane.showMessageDialog(null, "Maybe?");
}

if(RandomNumber == 3)
{
	JOptionPane.showMessageDialog(null, "Ha! You thought I was psyhic!");
}

if(RandomNumber == 4)
{
	JOptionPane.showMessageDialog(null, "I must reply to your question with a question... was it a questionably questionable question?");
}

if(RandomNumber == 5)
{
	JOptionPane.showMessageDialog(null, "Beauty is in the eye of the beholder.  Because that makes sense.  It just does.");
}


if(RandomNumber == 6)
{
	JOptionPane.showMessageDialog(null, "You can ask as many times as you like.  My answer is......... I have no idea!");
}

if(RandomNumber == 7)
{
	JOptionPane.showMessageDialog(null, "Ask again later... I'm too tired... zzzzzz...");
}



if(Question.contains("candy"))
		{
	JOptionPane.showMessageDialog(null, "But I must ask: how much sugar exactly do you eat?");
		}

if(Question.contains("superhero"))
{
	JOptionPane.showMessageDialog(null, "But really, Captain America.  That's always the answer." );
}

if(Question.contains("superheroes"))
{
	JOptionPane.showMessageDialog(null, "But really, Captain America.  That's always the answer." );
}


	// -- tell the user "Yes"

	// 6. If the random number is 1

	// -- tell the user "No"

	// 7. If the random number is 2

	// -- tell the user "Maybe?"

	// 8. If the random number is 3

	// -- write your own answer

	}
	}

