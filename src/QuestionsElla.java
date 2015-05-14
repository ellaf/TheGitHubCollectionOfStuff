import javax.swing.JOptionPane;


public class QuestionsElla
{
public static void main(String[] args)
{

	Object[] options = {"Other!",
	                    "Fish!",
	                    "Cats!",
	                    "Dogs!"};
	int n = JOptionPane.showOptionDialog(null,
	    "What is your favorite type "
	    + "of pet?",
	    "A Silly Question",
	    JOptionPane.YES_NO_CANCEL_OPTION,
	    JOptionPane.QUESTION_MESSAGE,
	    null,
	    options,
	    options[2]);
	if (n == 0)
	{
	String Favorite =	JOptionPane.showInputDialog(null, "What could it be?");
	JOptionPane.showMessageDialog(null, "Cool! I like " + Favorite + " too!");
	}
	if (n == 1)
	{
		JOptionPane.showMessageDialog(null, "Glub, Glub, Glub.  I'm a fish!");
	}
	if (n == 2)
	{
		JOptionPane.showMessageDialog(null, "Meeeeeooooooowwwww.  I'm a cat!");
	}
	if (n == 3)
	{
		JOptionPane.showMessageDialog(null, "Woof, Woof!  I'm a dog!");
	}

	Object[] options2 = {"Yep!",
            "Nope.",
            "I want one!",
            "I used to."};
int p = JOptionPane.showOptionDialog(null,
"Now that I know what pets you like, I have to ask: "
+ "do you have any pets?",
"A Silly Question",
JOptionPane.YES_NO_CANCEL_OPTION,
JOptionPane.QUESTION_MESSAGE,
null,
options2,
options[2]);
if (p == 0)
{
JOptionPane.showMessageDialog(null, "Me too! I've got a bug! (Just kidding!)");

}
if (p == 1)
{
JOptionPane.showMessageDialog(null, "Why not?");
}
if (p == 2)
{
JOptionPane.showMessageDialog(null, "Then you should get one! I love pets!");
}
if (p == 3)
{
JOptionPane.showMessageDialog(null, "Are you getting another?");
}


}
}
