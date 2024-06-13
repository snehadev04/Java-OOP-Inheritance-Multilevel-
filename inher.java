
// Define the main class 'inher' to test the multilevel inheritance
public class inher 
{

    // Main method to run the program
    public static void main(String[] args) 
    {
        
        // Create an object of class 'power' which can access all methods from 'calc', 'advcal', and 'power'
        power obj = new power();
        
        // Call the 'add' method from the 'calc' class and print the result
        System.out.println(obj.add(5, 8)); // Output: 13
        
        // Call the 'sub' method from the 'calc' class and print the result
        System.out.println(obj.sub(9, 3)); // Output: 6
        
        // Call the 'multi' method from the 'advcal' class and print the result
        System.out.println(obj.multi(10, 23)); // Output: 230
        
        // Call the 'div' method from the 'advcal' class and print the result
        System.out.println(obj.div(12, 3)); // Output: 4
        
        // Call the 'po' method from the 'power' class and print the result
        System.out.println(obj.po(4, 2)); // Output: 16.0
    }
}
