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
    Post post = new Post(2, "How to create a user in linux using python", 
    "How do I create a user in Linux using Python? I mean, I know about the subprocess module and thought about calling 'adduser' and 
    passing all the parameters at once, but the 'adduser' command asks some questions like password, full name, phone and stuff. 
    How would I answer this questions using subprocess?.", tags, "Difficult", "Highly Needed");
    assertTrue(post.addPost());
}

//Test Case #2 - Data 1
public void testAddPostInvalidTitle() {
    String[] tags = {"tag1", "tag2"};
    Post post = new Post(3, "A 22 letter String", 
    "The result after decoding is then 16 bytes (every 3 bytes becomes 4 characters, 
    so we get 20 from the first 15 bytes and 2 characters more to encode the last byte; 
    you'll note that the final character has fewer options than the other ones, because it really encodes 2 trailing bits 
    (so we'd expect 4 different ones, including A for 00 etc.). Read up on base64 encoding if you want the nitty gritty", tags, "Easy", "Ordinary");
    assertTrue(post.addPost());
}

//Test Case #2 - Data 2
public void testAddPostInvalidTitle() {
    String[] tags = {"tag1", "tag2"};
    Post post = new Post(4, "10 Python Tips",
    "Consistency is very important when you are learning a new language. We recommend making a commitment to code every day. 
    It may be hard to believe, but muscle memory plays a large part in programming. Committing to coding everyday will really help develop that muscle memory. 
    Though it may seem daunting at first, consider starting small with 25 minutes everyday and working your way up from there.", tags, "Easy", "Ordinary");
    assertTrue(post.addPost());
}

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