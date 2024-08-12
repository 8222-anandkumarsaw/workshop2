package Work2;
import java.util.*;

public class Exception {
    static class Fun{
        String name;
        void setName(String name){
            try{
                this.name=name;
            }
            catch(NullPointerException e){
                System.out.println(e);
            }

        }
        void getName(){
            System.out.println("Name of the student is :"+name);
        }

    };
    static public void validObject(Fun obj){
        try{
            obj.setName("anand");
        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        Fun student=new Fun();

        Fun child=null;
        validObject(student);
        validObject(child);
        student.getName();

    }
}
