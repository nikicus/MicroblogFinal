package MicroblogPart1;

public class User {

    private String userName;
    private String firstName;
    private String lastName;
    private String websiteURL;
    private String emailAddress;

    public User(String userName, String firstName, String lastName, String websiteURL, String emailAddress){

        this.userName = userName;
        this.firstName  = firstName;
        this.lastName = lastName;
        this.websiteURL = websiteURL;
        this.emailAddress = emailAddress;
    }

    public String getUserName() {
        return this.userName;
    }

    public void printUser(){
        System.out.println(" User Name:" + userName + "\n" + "First Name: " +  firstName + "\n" + "Last Name:" + lastName +"\n" +"Website URL:" + websiteURL + "\n" + " Email Address;" + emailAddress + "\n ");;
    }

    //create method to print user

}

/*
public static void main(String)[] args)

        {


    User[] users =  new User[3];
    // user constuctor ask for web address, username, 1st name, last name and email.

    users [0] = new User(avatar. "www.hello.com", username. "GGame", firstname "Bob", lastname. "Kline", email. "GGames@gmail.comm");
    users [1] = new User(avatar. "www.bulid.com", username. "buildoworld", firstname "Sam", lastname. "Were", email. "SW1234@yahoo.com");
    users [2] = new User(avatar. "www.sports.com", username. "bball", firstname "Brooke", lastname. "Simon", email. "Brookie@sbcglobal.net");

    Post[] posts = new Post[5];
    posts [0] = new Post (username. "GGame",postID 1, content "1st post,"  )
}
}

*/

