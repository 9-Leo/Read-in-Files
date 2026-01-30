import java.io.*;
import java.util.*;
public class files{
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("numbers.txt");
        Scanner scanner1 = new Scanner(file);
        int count = 0;
        while(scanner1.hasNext()){
            String line = scanner1.nextLine().trim();
            if(!line.isEmpty()){
                count++;
            }
        }
        System.out.println("Count: " + count);

        scanner1.close();

        Scanner scanner2 = new Scanner(file);
        // String[] animals = new String[count];
        int[] numList = new int[count];
        

        int i = 0;
        while(scanner2.hasNext()){
            String line = scanner2.nextLine().trim();
            int num = Integer.parseInt(line);

            if(!line.isEmpty()){
                numList[i] = num;
                i++;
            }
        }

        scanner2.close();

        for(int j = 0; j < numList.length; j++){
            System.out.println(numList[j]);
        }

    }
}