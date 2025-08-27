import java.io.DataInputStream;
import java.io.IOException;
import java.util.*;
import java.util.Scanner;
public class MyException2 {
    public static void main(String[] args) throws IOException {
        int x,y,z=0;
        DataInputStream dis=new DataInputStream(System.in);
        x=dis.readInt();
        y=dis.readInt();
        z=x/y;
        System.out.println("Exception Not Occur");
        System.out.println("Result: "+z);
    }
}
