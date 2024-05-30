package platform;
import java.util.Scanner;

//Function of the console based program
public class Main {
    public static void main(String[] args) {
        //Create a scanner to get user input
        Scanner scanner = new Scanner(System.in);

        //Description of what is needed in each part
        System.out.println("Enter post ID:");
        int postID = scanner.nextInt();
        //New line for each attribute
        scanner.nextLine(); 

        System.out.println("Enter post Title:");
        String postTitle = scanner.nextLine();

        System.out.println("Enter post Body:");
        String postBody = scanner.nextLine();

        System.out.println("Enter post tags (,):");
        String[] postTags = scanner.nextLine().split(",");

        System.out.println("Enter post type - Easy, Difficult, Very Difficult:");
        String postType = scanner.nextLine();

        System.out.println("Enter post emergency - Ordinary, Highly Needed, Immediately:");
        String postEmergency = scanner.nextLine();

        //Create a post object with the input data given
        Post post = new Post(postID, postTitle, postBody, postTags, postType, postEmergency);

        //Try to add the post and show the output
        if (post.addPost()) {
            System.out.println("Post successfully added");
        } else {
            System.out.println("Post not added, Try again.");
        }

        //Asks the user to add a comment to the post
        System.out.println("Enter a comment:");
        String comment = scanner.nextLine();

        //Try to add the comment and show the output
        if (post.addComment(comment)) {
            System.out.println("Comment successfully added");
        } else {
            System.out.println("Comment not added, Try again.");
        }

        scanner.close(); //end the scanner
    }
}