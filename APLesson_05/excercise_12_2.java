public class excercise_12_2
{
	
	private String userName, firstName, lastName;
	
	
	public excercise_12_2()
	{
		userName = "";
		firstName = "";
		lastName= "";
	}
	
	
	public excercise_12_2(String uName, String fName, String lName)
	{
		userName = uName;
		firstName = fName;
		lastName = lName;
	}
	

	public void setUserName(String uName)
	{
		userName = uName;
	}
	
	
	public String getUserName()
	{
		return userName;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	
	public static void main (String[]args)
	{
		excercise_12_2 object = new excercise_12_2("navyaasinha", "Navyaa", "Sinha");
		
		System.out.println("<<<<<<<<<<<<<<<User Info>>>>>>>>>>>>>>>>");
		System.out.println("Name: " + object.getFirstName() + " " + object.getLastName());
		System.out.println("Username: " + object.getUserName());
	}
}
