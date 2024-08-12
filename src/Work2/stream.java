package Work2;
import java.util.*;
public class stream {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        Scanner input=new Scanner(System.in);
        int n;
        System.out.println("Enter the size of list :");
        n=input.nextInt();
        input.nextLine();
        for(int i=0;i<n;i++){
            String s=input.nextLine();
            list.add(s);
        }
        int ans= (int) list.stream().filter(name->name.startsWith("J")).count();
        System.out.println("Number of strings that starts with the letter J is :"+ ans);


    }
}
