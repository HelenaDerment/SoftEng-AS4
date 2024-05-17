import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PostTestCases {

//addPost Function

//Test Case #1 - Data 1
public void testAddPostValid() {
    String[] tags = {"tag1", "tag2"};
    Post post = new Post(1, "What is the best way to code a string into a linked list in java", 
    "I am writing a program to add String type data to a circular doubly linked list and to view them in java. 
    I want to know that how to add Strings to the linked list and how to get the output.", tags, "Easy", "Ordinary");
    assertTrue(post.addPost());
}

//Test Case #1 - Data 2
public void testAddPostValid() {
    String[] tags = {"tag1", "tag2", "tag3"};
    Post post = new Post(3, "How to create a user in linux using python", 
    "How do I create a user in Linux using Python? I mean, I know about the subprocess module and thought about calling 'adduser' and 
    passing all the parameters at once, but the 'adduser' command asks some questions like password, full name, phone and stuff. 
    How would I answer this questions using subprocess?.", tags, "Difficult", "Highly Needed");
    assertTrue(post.addPost());
}

//Test Case #2 - Data 1

//Test Case #2 - Data 2

//Test Case #3 - Data 1

//Test Case #3 - Data 2

//Test Case #4 - Data 1

//Test Case #4 - Data 2

//Test Case #5 - Data 1

//Test Case #5 - Data 2

//Test Case #6 - Data 1

//Test Case #6 - Data 2


//addComment Function

//Test Case #1 - Data 1

//Test Case #1 - Data 2

//Test Case #2 - Data 1

//Test Case #2 - Data 2

//Test Case #3 - Data 1

//Test Case #3 - Data 2

//Test Case #4 - Data 1

//Test Case #4 - Data 2

//Test Case #5 - Data 1

//Test Case #5 - Data 2

//Test Case #6 - Data 1

//Test Case #6 - Data 2


}