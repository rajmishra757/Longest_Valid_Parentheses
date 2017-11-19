import java.util.Scanner;
import java.util.stream.IntStream;

public class ParenthesesDemo {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int testCaseCount = Integer.parseInt(scanner.nextLine());
        while(testCaseCount > 0) {
            Parentheses parentheses = new Parentheses();
            parentheses.setInput(scanner.nextLine());
            System.out.println(parentheses.getValidParenthesesCount());
            --testCaseCount;
        }
    }
}

class Parentheses {
    private String input;
    
    public String getInput() {
        return input;
    }
    
    public void setInput(String input) {
        this.input = input;
    }
    
    //Get number of valid parentheses
    public long getValidParenthesesCount() {
        long leftParenthesesCount = input.chars().filter(element -> element == '(').count();
        long rightParenthesesCount = input.chars().filter(element -> element == ')').count();
        if(leftParenthesesCount < rightParenthesesCount)
            return 2 * leftParenthesesCount;
        return 2 * rightParenthesesCount;
    }
}
