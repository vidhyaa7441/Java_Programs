import java.util.*;
public class printing_ascii_value
{
    public static void main(String[] args) {
            Scanner c = new Scanner(System.in);
            char x = c.next().charAt(0);
            System.out.printf("%c:%d", x, (int) x);
        }
}
