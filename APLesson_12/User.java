public class User
{
   private String firstName;
   private String lastName;
   private String avatar;
   private int userID;
   
   public User(String fN, String lN)
{
   firstName = fN;
   lastName = lN;
   avatar = "Undefined";
   userID = (int)(Math.random() * 1000000) + 1;
}

public User(String fN, String lN, String av)
{
   firstName = fN;
   lastName = lN;
   avatar = av;
   userID = (int)(Math.random() * 1000000) + 1;
}

public void setUser (String fN, String lN, String av)
{
	firstName = fN;
   lastName = lN;
   avatar = av;
   userID = (int)(Math.random() * 1000000) + 1;
}

public String fN()
{
	return firstName;
}
public String lN()
{
	return lastName;
}
public String av()
{
	return avatar;
}
public String toString()
{
   return "customer Info...\nFirst Name: " + firstName +
                           "\nLast Name: " + lastName +
                           "\nAvatar: " + avatar +
                           "\nUser ID#: " + userID;
}

}