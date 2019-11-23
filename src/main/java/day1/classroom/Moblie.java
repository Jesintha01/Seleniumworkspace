package day1.classroom;

public class Moblie {
private static final String Riya = null;
public int makeCall(int n)
{
	System.out.println("Attend the call "+n);
	return n;
}
public boolean sendSMS(String name)
{
	System.out.println(name+" received the sms");
	return true;
}
public void shutDown()
{
	System.out.println("Shutdown the system");
}
public static void main(String[] args)
{
	Moblie obj = new Moblie();
	obj.makeCall(123456789);
	obj.sendSMS(Riya);
	obj.shutDown();
}

	
	
	
	}

