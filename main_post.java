import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter post ID:");
        int postID = scanner.nextInt();
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

        Post post = new Post(postID, postTitle, postBody, postTags, postType, postEmergency);

        if (post.addPost()) {
            System.out.println("Post successfully added");
        } else {
            System.out.println("Post not added, Try again.");
        }


        System.out.println("Enter a comment:");
        String comment = scanner.nextLine();
        
        if (post.addComment(comment)) {
            System.out.println("Comment successfully added");
        } else {
            System.out.println("Comment not added, Try again.");
        }

        scanner.close();
    }
}