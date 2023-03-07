/**
 - This code creates a class called App and defines a main method. 
 - The main method prints out the string "Hello, world!" and 
   then creates an instance of the MainFrame class and calls its init() method.
 */
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, world!");
        MainFrame myFrame = new MainFrame();
        myFrame.init();
    }
}