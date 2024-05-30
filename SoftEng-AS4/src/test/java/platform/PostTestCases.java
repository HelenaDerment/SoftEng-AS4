package platform;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

class PostTestCases {
    private static final String POSTS_FILE = "posts.txt";
    private static final String COMMENTS_FILE = "comments.txt";

    @BeforeEach
    public void setUp() throws IOException {
        // Clear the posts and comments files before each test
        new FileWriter(POSTS_FILE, false).close();
        new FileWriter(COMMENTS_FILE, false).close();
    }


//addPost Function

//Test Case #1 - Data 1
@Test
public void testAddPostValid() {
    String[] tags = {"tag1", "tag2"};
    Post post = new Post(1, "What is the best way to code a string into a linked list in java", "I am writing a program to add String type data to a circular doubly linked list and to view them in java. I want to know that how to add Strings to the linked list and how to get the output.", tags, "Easy", "Ordinary");
    assertTrue(post.addPost());
}

//Test Case #1 - Data 2
@Test
public void testAddPostValid2() {
    String[] tags = {"tag1", "tag2", "tag3"};
    Post post = new Post(2, "How to create a user in linux using python", "How do I create a user in Linux using Python? I mean, I know about the subprocess module and thought about calling 'adduser' and + passing all the parameters at once, but the 'adduser' command asks some questions like password, full name, phone and stuff. How would I answer this questions using subprocess?.", tags, "Difficult", "Highly Needed");
    assertTrue(post.addPost());
}

//Test Case #2 - Data 1
@Test
public void testAddPostInvalidTitle() {
    String[] tags = {"tag1", "tag2"};
    Post post = new Post(3, "A 22 letter String", "The result after decoding is then 16 bytes (every 3 bytes becomes 4 characters, so we get 20 from the first 15 bytes and 2 characters more to encode the last byte; you'll note that the final character has fewer options than the other ones, because it really encodes 2 trailing bits (so we'd expect 4 different ones, including A for 00 etc.). Read up on base64 encoding if you want the nitty gritty", tags, "Easy", "Ordinary");
    assertFalse(post.addPost());
}

//Test Case #2 - Data 2
@Test
public void testAddPostInvalidTitle2() {
    String[] tags = {"tag1", "tag2"};
    Post post = new Post(4, "10 Python Tips", "Consistency is very important when you are learning a new language. We recommend making a commitment to code every day. It may be hard to believe, but muscle memory plays a large part in programming. Committing to coding everyday will really help develop that muscle memory. Though it may seem daunting at first, consider starting small with 25 minutes everyday and working your way up from there.", tags, "Easy", "Ordinary");
    assertFalse(post.addPost());
}

//Test Case #3 - Data 1
@Test
public void testAddPostValidBody() {
    String[] tags = {"tag1", "tag2"};
    Post post = new Post(5, "Software Engineering Fundamentals for Beginners", "Online learning platforms provide a flexible and affordable way to build software engineering skills without needing to enroll in a formal degree program. With the wealth of free and paid online courses, certifications, books, and other resources now available, self-driven learners can craft personalized curriculums tailored to their goals.", tags, "Easy", "Ordinary");
    assertTrue(post.addPost());
}

//Test Case #3 - Data 2
@Test
public void testAddPostValidBody2() {
    String[] tags = {"tag1", "tag2", "tag3"};
    Post post = new Post(6, "Decrypting an asymmetric public key", "This topic provides information about creating and using a key for asymmetric encryption using an RSA key. Asymmetric encryption uses the public key portion of the asymmetric key and decryption uses the private key portion of the key. Cloud Key Management Service provides functionality to retrieve the public key and functionality to decrypt ciphertext that was encrypted with the public key. Cloud KMS does not allow direct access to the private key.", tags, "Difficult", "Immediately Needed");
    assertTrue(post.addPost());
    
}

//Test Case #4 - Data 1
@Test
public void testAddPostInvalidTag() {
    String[] tags = {"Software"};
    Post post = new Post(7, "Software Testing Explanation", "Software testing is the process of checking the quality, functionality, and performance of a software product before launching. To do software testing, testers either interact with the software manually or execute test scripts to find bugs and errors, ensuring that the software works as expected. Software testing is also done to see if business logic is fulfilled, or if there are any missing gaps in requirements that need immediate tackles." ,tags, "Easy", "Ordinary");
    assertFalse(post.addPost());
}

//Test Case #4 - Data 2
@Test
public void testAddPostInvalidTag2() {
    String[] tags = {"tag1", "tooLongTagHere123", "tag3"};
    Post post = new Post(8, "AI Innovations in Healthcare", "The fusion of physiological data with lifestyle and environmental factors is paving the way for deep phenotyping. Coupled with genomics, this is set to take healthcare to new heights. Bloomer Tech is combining cutting-edge fabric technology with ML to transform clothes, for example, women's bras, into wearable medical devices. AI's role in generating digital biomarkers promises transformative impacts, especially for diseases that disproportionately affect women. Bloomer Tech’s focus lies in the cardiovascular system in women, given the challenges in diagnostics and treatment.", tags, "Difficult", "Highly Needed");
    assertFalse(post.addPost());
}

//Test Case #5 - Data 1
@Test
public void testAddPostInvalidType() {
    String[] tags = {"Energy", "Engineering", "EcoWave", "Technology"};
    Post post = new Post(9, "Eco Wave Power", "The project generates clean and affordable electricity, using a simple design that allows the project’s uniquely shaped floaters to be attached to existing man-made structures (such as piers, breakwaters and jetties), and thereby simplifying the installation process, as well as maintenance and accessibility.", tags, "Easy", "Ordinary");
    assertFalse(post.addPost());
}

//Test Case #5 - Data 2
@Test
public void testAddPostInvalidType2() {
    String[] tags = {"Prim's", "Maths", "Prim'sMST"};
    Post post = new Post(10, "Prim's Algorithm", "The idea is to maintain two sets of vertices. The first set contains the vertices already included in the MST, and the other set contains the vertices not yet included. At every step, it considers all the edges that connect the two sets and picks the minimum weight edge from these edges.", tags, "Very Difficult", "Immediately Needed");
    assertFalse(post.addPost());
}

//Test Case #6 - Data 1
@Test
public void testAddPostInvalidEmergency() {
    String[] tags = {"Attacks", "Cyber", "Security"};
    Post post = new Post(11, "Suppy Chain Attack", "Since many large organisations have strong cyber security protocols in place, attackers increasingly target their supply chains. These attacks through suppliers require sophisticated planning and can have dire consequences, such as the SolarWinds hack in 2020. TNO is developing technologies to prevent these supply chain attacks", tags, "Very Difficult", "Ordinary");
    assertFalse(post.addPost());
}

//Test Case #6 - Data 2
@Test
public void testAddPostInvalidEmergency2() {
    String[] tags = {"Engineering", "Principles", };
    Post post = new Post(12, "Engineering Principles", "Engineering Principles are the principles of engineering and Engineering Data is the data used in the application of those principles. Engineering is the science of design, construction, maintenance and operation of structures, machines, systems and processes according to scientific and mathematical principals.", tags, "Easy", "Immediately Needed");
    assertFalse(post.addPost());
}

//addComment Function

//Test Case #1 - Data 1
@Test
public void testAddValidComment() {
    String[] tags = {"tag1", "tag2"};
    Post post = new Post(1, "What is the best way to code a string into a linked list in java", "I am writing a program to add String type data to a circular doubly linked list and to view them in java. I want to know that how to add Strings to the linked list and how to get the output.", tags, "Easy", "Ordinary");
    post.addPost();
    assertTrue(post.addComment("Strings has to be empty"));
}

//Test Case #1 - Data 2
@Test
public void testAddValidComment2() {
    String[] tags = {"tag1", "tag2"};
    Post post = new Post(1, "What is the best way to code a string into a linked list in java", "I am writing a program to add String type data to a circular doubly linked list and to view them in java. I want to know that how to add Strings to the linked list and how to get the output.", tags, "Easy", "Ordinary");
    post.addPost();
    assertTrue(post.addComment("Create a node that will store the first character"));
}

//Test Case #2 - Data 1
@Test
public void testAddInvalidWords() {
    String[] tags = {"tag1", "tag2"};
    Post post = new Post(1, "What is the best way to code a string into a linked list in java", "I am writing a program to add String type data to a circular doubly linked list and to view them in java. I want to know that how to add Strings to the linked list and how to get the output.", tags, "Easy", "Ordinary");
    post.addPost();
    assertFalse(post.addComment("The head node of the linked list should be the first character of the string, and so the head should be pointing to the first character of the string"));
}

//Test Case #2 - Data 2
@Test
public void testAddInvalidWords2() {
    String[] tags = {"tag1", "tag2"};
    Post post = new Post(1, "What is the best way to code a string into a linked list in java", "I am writing a program to add String type data to a circular doubly linked list and to view them in java. I want to know that how to add Strings to the linked list and how to get the output.", tags, "Easy", "Ordinary");
    post.addPost();
    assertFalse(post.addComment("Create node"));
}

//Test Case #3 - Data 1
@Test
public void testAddInvalidCharacter() {
    String[] tags = {"tag1", "tag2"};
    Post post = new Post(1, "What is the best way to code a string into a linked list in java", "I am writing a program to add String type data to a circular doubly linked list and to view them in java. I want to know that how to add Strings to the linked list and how to get the output.", tags, "Easy", "Ordinary");
    post.addPost();
    assertFalse(post.addComment("each object carries some data"));
}

//Test Case #3 - Data 2
@Test
public void testAddInvalidCharacter2() {
    String[] tags = {"tag1", "tag2"};
    Post post = new Post(1, "What is the best way to code a string into a linked list in java", "I am writing a program to add String type data to a circular doubly linked list and to view them in java. I want to know that how to add Strings to the linked list and how to get the output.", tags, "Easy", "Ordinary");
    post.addPost();
    assertFalse(post.addComment("start iterating the string from its second character"));
}

//Test Case #4 - Data 1
@Test
public void testAddValidEasy() {
    String[] tags = {"tag1", "tag2"};
    Post post = new Post(1, "What is the best way to code a string into a linked list in java", "I am writing a program to add String type data to a circular doubly linked list and to view them in java. I want to know that how to add Strings to the linked list and how to get the output.", tags, "Easy", "Ordinary");
    post.addPost();
    post.addComment("No nodes can be added");
    post.addComment("Iterating the sting from character");
    assertTrue(post.addComment("Initialise with a curr pointer"));
}

//Test Case #4 - Data 2
@Test
public void testAddValidEasy2() {
    String[] tags = {"tag1", "tag2"};
    Post post = new Post(1, "What is the best way to code a string into a linked list in java", "I am writing a program to add String type data to a circular doubly linked list and to view them in java. I want to know that how to add Strings to the linked list and how to get the output.", tags, "Easy", "Ordinary");
    post.addPost();
    assertTrue(post.addComment("No nodes can be added"));
}

//Test Case #5 - Data 1
@Test
public void testAddInvalidOrdinary() {
    String[] tags = {"tag1", "tag2"};
    Post post = new Post(1, "What is the best way to code a string into a linked list in java", "I am writing a program to add String type data to a circular doubly linked list and to view them in java. I want to know that how to add Strings to the linked list and how to get the output.", tags, "Easy", "Ordinary");
    post.addPost();
    post.addComment("No nodes can be added");
    post.addComment("Iterating the sting from character");
    post.addComment("Initialise with a curr pointer");
    post.addComment("Transverse the linked list");
    assertFalse(post.addComment("Using a string conversion to build it"));
}

//Test Case #5 - Data 2
@Test
public void testAddInvalidOrdinary2() {
    String[] tags = {"tag1", "tag2"};
    Post post = new Post(1, "What is the best way to code a string into a linked list in java", "I am writing a program to add String type data to a circular doubly linked list and to view them in java. I want to know that how to add Strings to the linked list and how to get the output.", tags, "Easy", "Ordinary");
    post.addPost();
    post.addComment("No nodes can be added");
    post.addComment("Iterating the sting from character");
    post.addComment("Initialise with a curr pointer");
    assertFalse(post.addComment("Transverse the linked list"));
}


//Test Case #6 - Data 1
@Test
public void testAddInvalidAmountComment() {
    String[] tags = {"tag1", "tag2", "tag3"};
    Post post = new Post(2, "How to create a user in linux using python", "How do I create a user in Linux using Python? I mean, I know about the subprocess module and thought about calling 'adduser' and passing all the parameters at once, but the 'adduser' command asks some questions like password, full name, phone and stuff. How would I answer this questions using subprocess?.", tags, "Difficult", "Highly Needed");
    post.addPost();
    post.addComment("No nodes can be added");
    post.addComment("Iterating the sting from character");
    post.addComment("Initialise with a curr pointer");
    post.addComment("Transverse the linked list");
    post.addComment("Using a string conversion to build it");
    assertFalse(post.addComment("Use ArrayClass to create a string list"));
}


//Test Case #6 - Data 2
@Test
public void testAddInvalidAmountComment2() {
    String[] tags = {"tag1", "tag2"};
    Post post = new Post(1, "What is the best way to code a string into a linked list in java", "I am writing a program to add String type data to a circular doubly linked list and to view them in java. I want to know that how to add Strings to the linked list and how to get the output.", tags, "Easy", "Ordinary");
    post.addPost();
    post.addComment("No nodes can be added");
    post.addComment("Iterating the sting from character");
    post.addComment("Initialise with a curr pointer");
    assertFalse(post.addComment("Transverse the linked list"));
}

}