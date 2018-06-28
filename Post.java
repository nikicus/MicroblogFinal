package MicroblogPart1;

public class Post {



    private String userName;
    private String post;
   // private String printPost;

    public Post(String userName, String post) {
        this.userName = userName;
        this.post = post;
        //this.printPost = printPost;
    }

    public void printPost() {
        System.out.println(" UserName:" + userName + "\n" + "Post: " + post + "\n");
    }

        public String getUserName() {
            return this.userName;

        }
    }


