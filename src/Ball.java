import java.util.Random;


public class Ball {
	//fields
	private final int MAX = 20;
	private int answerIndex;
	private String[] answers = {"<html><font color = 'purple'> It is certain.</font></html>",
			"<html><font color = '660000'> It is decidedly so.</font></html>",
			"<html><font color = 'FF6600'> Without a doubt.</font></html>",
			"<html><font color = '0099FF'> Yes, definitely.</font></html>",
			"<html><font color = 'FF0099'> As I see it, yes.</font></html>",
			"<html><font color = '000066'> Most Likely.</font></html>",
			"<html><font color = '006600'> Outlook good.</font></html>",
			"<html><font color = 'FF6633'> Yes.</font></html>",
			"<html><font color = '330066'> Signs point to yes.</font></html>",
			"<html><font color = 'CCCC99'> Reply hazy, try again.</font></html>",
			"<html><font color = 'FF00FF'> Ask again later.</font></html>",
			"<html><font color = '00CCFF'> Better not tell you now.</font></html>",
			"<html><font color = 'CCCCCC'> Cannot predict now.</font></html>",
			"<html><font color = '333333'> Concentrate and ask again.</font></html>",
			"<html><font color = '006666'> Don't count on it.</font></html>",
			"<html><font color = 'FF6666'> My reply is no.</font></html>",
			"<html><font color = '006600'> My sources say no.</font></html>",
			"<html><font color = '3399FF'> Outlook not so good.</font></html>",
			"<html><font color = 'FF9966'> Very doubtful.</font></html>"};
	private Random rand = new Random();
	//Constructor
	public Ball() {};
	
	//Methods
	
	//Reset the Ball
	public void setFaceDown(){
		answerIndex = 0;
	}
	
	//Turn the Ball
	public void turn(){
		answerIndex = rand.nextInt(MAX) + 1;
		//answerIndex = 0;
		//return answers[answerIndex];
	}
	
	//Get the answer
	public String getAnswer(){
		return answers[answerIndex];
	}
	
	//Checking if a question is a correct answer
	public String checkIfAnswer(String input){
		String result = "";
		try{
			//input = reader.nextLine();
			if(input.substring(0,4).equalsIgnoreCase("WILL") || input.substring(0,3).equalsIgnoreCase("ARE") || input.substring(0,2).equalsIgnoreCase("IS") || input.substring(0,3).equalsIgnoreCase("WAS") || input.substring(0,2).equalsIgnoreCase("DO") || input.substring(0,3).equalsIgnoreCase("CAN") || input.substring(0,3).equalsIgnoreCase("HAS") || input.substring(0,3).equalsIgnoreCase("DID")){
				result = "ready";}
			//else{isQuestion = false;}
			else if (input.equalsIgnoreCase("ADMINCONSOLE")){result = "adm1234567890";}
			else{throw new Exception();}
			}
			catch(Exception e){
				result = "This is not a valid question.";
			}
		return result;
	}
	
	
	@Override
	public String toString(){
		return answerIndex + " | " + answers[answerIndex];
	}
}
