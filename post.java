import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.*;

//Post Class Function to add posts and comment on posts
public class Post {
    //Attributes of the post
    private int postID;
    private String postTitle;
    private String postBody;
    private String[] postTags;
    private String postType;
    private String postEmergency;
    private ArrayList<String> postComments = new ArrayList<>();

    //Array Strings to hold the 2 attributes that have options
    private String[] postTypes = {"Very Difficult", "Difficult", "Easy"};
    private String[] postEmergencies = {"Immediately Needed", "Highly Needed", "Ordinary"};

    //Post constructor to initalise the post attributes
    public Post(int postID, String postTitle, String postBody, String[] postTags, String postType, String postEmergency) {
        this.postID = postID;
        this.postTitle = postTitle;
        this.postBody = postBody;
        this.postTags = postTags;
        this.postType = postType;
        this.postEmergency = postEmergency;
    }

    //Check to add a post and if it is valid
    public boolean addPost() {
        if (isValidPost()) {
            try (BufferedWriter edit = new BufferedWriter(new FileWriter("posts.txt", true))) {
                //Write out the comment information
                edit.write(this.postInfo());
                edit.newLine(); 
                return true; //Return true if the post was successful
            } 
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        return false; //Return false if the post could not be posted or an error occured.
    }

    //Checks over each condition and weather it is valid for the post
    public boolean isValidPost() {
        //condition 1: Check valid title length & first five character are only letters
        if (postTitle.length() < 10 || postTitle.length() > 250 || !postTitle.matches("^[^\\d\\W]{5}.*")) {
            return false;
        }

        //condition 2: Check valid post body of no less than 250 character

        if (postBody.length() < 250) {
            return false;
        }

        //condition 3: Check valid amount of post tags & valid amount of character in each tag & no uppercase
        if (postTags.length < 2 || postTags.length > 5) {
            return false;
        }
        for (String tag : postTags) {
            if (tag.length() < 2 || tag.length() > 10 || !tag.matches("^[a-z]+$")) {
                return false;
            }
        }

        //condition 4: Check valid post type based on tag amount or body length
        if (postType.equals("Easy") && postTags.length > 3) {
            return false;
        }
        if ((postType.equals("Very Difficult") || postType.equals("Difficult")) && postBody.length() < 300) {
            return false;
        }

        //condition 5: Check valid post emergency based on post type
        if (postType.equals("Easy") && (postEmergency.equals("Immediately Needed") || postEmergency.equals("Highly Needed"))) {
            return false;
        }
        if ((postType.equals("Very Difficult") || postType.equals("Difficult")) && postEmergency.equals("Ordinary")) {
            return false;
        }
        return true;  //return true if all the conditions of the post are meet
    }

    //Format of the post when it is put together into a file
    public String postInfo() {
        return postID + "|" + postTitle + "|" + postBody + "|" + String.join(",", postTags) + "|" + postType + "|" + postEmergency;
    }

    //Check to add a comment to a post and if it is valid
    public boolean addComment(String comment) {
        if (isValidComment(comment)) {
            try (BufferedWriter edit = new BufferedWriter(new FileWriter("comments.txt", true))) {
                //Write out the comment information
                edit.write("PostID: " + postID + " Comment: " + comment);
                edit.newLine();
                //Adds the comment to the post with that ID
                postComments.add(comment);
                return true; //Return true if the comment is posted
            } 
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        return false; //Return false if the comment could not be posted or an error occured.
    }

    //Checks over each condition and weather it is valid for the comment 
    public boolean isValidComment(String comment) {

        //condition 1: Check amount of comments allowed based off post type
        if (postComments.size() >= 5 || (postType.equals("Easy") && postComments.size() >= 3) || (postEmergency.equals("Ordinary") && postComments.size() >= 3)) {
            return false;
        }

        //condition 2: Check valid comment length and first character
        String[] words = comment.split(" ");
        if (words.length < 4 || words.length > 10 || !Character.isUpperCase(words[0].charAt(0))) {
            return false;
        }
        return true; //Return true if all the conditions of the post are meet
    }

    
}