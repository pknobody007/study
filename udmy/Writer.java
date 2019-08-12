package Print ;
import java.io.PrintWriter;
class Writer
{
public static void main(String args[])
{
PrintWriter pw=new PrintWriter(System.out,true);
String s="project";
pw.println("this is " +s);
}

}