import java.io.*;
class Objects3
{
     public static void main(String args[])throws Exception
     {
      ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));
      Student s=(Student)in.readObject();
      System.out.println(s.id+" "+s.name);
      in.close();
     }
}
