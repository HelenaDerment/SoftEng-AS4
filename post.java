import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.*;

public class Post {
    private int postID;
    private String postTitle;
    private String postBody;
    private String[] postTags;
    private String[] postTypes = {"Very Difficult", "Difficult", "Easy"};
    private String[] postEmergencies = {"Immediately Needed", "Highly Needed", "Ordinary"};
    private ArrayList<String> postComments = new ArrayList<>();

    public Post(int postID, String postTitle, String postBody, String[] postTags, String postType, String postEmergency) {
        this.postID = postID;
        this.postTitle = postTitle;
        this.postBody = postBody;
        this.postTags = postTags;
        this.postType = postType;
        this.postEmergency = postEmergency;
    }

    public boolean addPost() {
        if (isValidPost()) {
            try (PostEditor edit = new PostEditor(new FileWriter("posts.txt", true))) {
                edit.write(this.toString());
                edit.newLine();
                return true;
            } 
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    //Checks over each condition and weather it is valid 
    public boolean isValidPost() {
        //condition 1
        if (postTitle.length() < 10 || postTitle.length() > 250 || !postTitle.matches("^[^\\d\\W]{5}.*")) {
            return false;
        }

        //condition 2
        if (postBody.length() < 250) {
            return false;
        }

        //condition 3
        if (postTags.length < 2 || postTags.length > 5) {
            return false;
        }
        for (String tag : postTags) {
            if (tag.length() < 2 || tag.length() > 10 || !tag.matches("^[a-z]+$")) {
                return false;
            }
        }

        //condition 4
        if (postType.equals("Easy") && postTags.length > 3) {
            return false;
        }
        if ((postType.equals("Very Difficult") || postType.equals("Difficult")) && postBody.length() < 300) {
            return false;
        }

        //condition 5
        if (postType.equals("Easy") && (postEmergency.equals("Immediately Needed") || postEmergency.equals("Highly Needed"))) {
            return false;
        }
        if ((postType.equals("Very Difficult") || postType.equals("Difficult")) && postEmergency.equals("Ordinary")) {
            return false;
        }
        return true;
    }

    public boolean addComment() {

    }

    public boolean isValidComment() {

    }
}