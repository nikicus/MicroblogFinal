package MicroblogPart1;

import java.util.Scanner;
import java.util.ArrayList;

public class Menu {


    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        ArrayList<User> users = new ArrayList();
        ArrayList<Post> posts = new ArrayList();


        boolean exit = false;
        //int userName = 0;
        //int printPost = printPost;
        int currentUser = 0;
        //int firstName = firstName;
        //int lastName = lastName;
        //int websiteURL = websiteURL;
        //int emailAddress = emailAddress;



        while (!exit) {

            System.out.println("Microblog");
            System.out.println("Main Menu");
            System.out.println("1 Create a new user");
            System.out.println("2 Become an existing user");
            System.out.println("3 Create a post as the current user");
            System.out.println("4 Print all posts");
            System.out.println("5 Print all users");
            System.out.println("6 Finished");


            if (users.size() > 0) {

                System.out.println("Current User \"" + users.get(currentUser).getUserName() + "\". What's next?");
            }else{

                System.out.println("You have not created a new current user. What's next?");}

            int selection = keyboard.nextInt();
            if (selection == 1) {

                keyboard.nextLine();
                System.out.println("Enter userName");
                String userName = keyboard.nextLine();
                System.out.println("Enter firstName");
                String firstName = keyboard.nextLine();
                System.out.println("Enter lastName");
                String lastName = keyboard.nextLine();
                System.out.println("Enetr websiteURL");
                String websiteURL = keyboard.nextLine();
                System.out.println("Enter emailAddress");
                String emailAddress = keyboard.nextLine();

                //store above input as a new user

                //add the new user to the user array

                users.add(new User(userName, firstName, lastName, websiteURL, emailAddress));

            } else if (selection == 2) {
                keyboard.nextLine();
                System.out.println("Please select user below?");
                for (int c = 0; c < users.size(); c++) {
                    System.out.println(c + 1 + ")" + users.get(c).getUserName());

                }
                currentUser = keyboard.nextInt() - 1;

            } else if (selection == 3) {
                keyboard.nextLine();
                if (posts.size() > 0) {
                    for (int c = posts.size() - 1; c >= 0; c--) {
                        if (posts.get(c).getUserName().equals(users.get(currentUser).getUserName())) {
                            posts.get(c).printPost();
                            c = 0;

                        }
                    }
                }
                System.out.println("Please enter post:");
                String post = keyboard.nextLine();
                posts.add(new Post(users.get(currentUser).getUserName(), post));

            } else if (selection ==4) {
                for (int c = posts.size() - 1; c >= 0; c--) {
                    posts.get(c).printPost();
                }
            } else if (selection ==5) {
                for (int c = users.size() - 1; c >= 0; c--) {
                    // instead of getUserName, call the method you created in User
                    users.get(c).printUser();
                }
            } else if (selection ==6) {
                exit = true;



            }
        }
    }
}








