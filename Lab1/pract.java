import java.io.*;
import java.util.*;
import java.util.regex.*;

public class NLArray {

   public static class Read {
       String data []= null;

       public String[] wordtokenize(String a) {
           try {
               File myObj1 = new File(a);
               Scanner myReader1 = new Scanner(myObj1);
               for (int i=0; i< data.length; i++)
               {
                   if(myReader1.hasNextLine())
                   data[i]=data[i]+myReader1.nextLine() + "\n";
               }
               myReader1.close();
           } catch (FileNotFoundException e) {
               System.out.println("An error Occurred");
           }
           return data;
       }

       public String []extractEmail(String b) {
           try {
               File myObj2 = new File(b);
               Scanner myReader2 = new Scanner(myObj2);
               for(int i=0; i< data.length; i++)
               {
                   if(myReader2.hasNextLine())
                   {
                       data[i]=data[i]+myReader2.nextLine();
                   }
                   }
               myReader2.close();
           } catch (FileNotFoundException e) {
               System.out.println("An error Occurred");
           }
           return data;
       }
   }

   public static void extractBoundaries(int arr[][]) {
       int rows = arr.length;
       int cols = arr[0].length;

       for (int i = 0; i < rows; i++) {
           for (int j = 0; j < cols; j++) {
               if (i == 0 || j == 0 || i == rows - 1 || j == cols - 1) {
                   System.out.print(arr[i][j] + " ");
               } else {
                   System.out.print("  ");
               }
           }
           System.out.println();
       }
   }

   public static void cropCenterPart(int arr[][]) {
       int rows = arr.length;
       int cols = arr[0].length;

       for (int i = 1; i < rows - 1; i++) {
           for (int j = 1; j < cols - 1; j++) {
               System.out.print(arr[i][j] + " ");
           }
           System.out.println();
       }
   }

   public static void main(String args[]) {
       Read r = new Read();
       String store_data = "";
       String store_email = "";

       System.out.println("Text with special characters.\n");

       System.out.println(r.wordtokenize("d:\\GM.txt")+"\n");
       System.out.println(r.extractEmail("d:\\GM.txt")+"\n");

       System.out.println("Text without special characters.\n");
       for (int i = 0; i < data.length(; i++) {
          

           if ((cha >= 'a' && cha <= 'z') || (cha >= 'A' && cha <= 'Z') || cha == ' ') {
               store_data += cha;
           } else {
               continue;
           }
       }

       String[] wordsArray = store_data.split("\\s+");
       for (String word : wordsArray) {
           System.out.println(word);
       }

       System.out.println("Following emails are in text.");

       Pattern emailPattern = Pattern.compile("\\b[\\w\\.-]+@[\\w\\.-]+\\.\\w{2,4}\\b");
       Matcher emailMatcher = emailPattern.matcher(r.data);

       List<String> emailsList = new ArrayList<>();
       while (emailMatcher.find()) {
           String email = emailMatcher.group();
           emailsList.add(email);
       }

       String[] emailsArray = emailsList.toArray(new String[0]);
       for (String email : emailsArray) {
           System.out.println(email);
       }

       // Example matrix for testing boundary extraction and center cropping
       int[][] exampleMatrix = {
               {1, 2, 3, 4, 5},
               {6, 7, 8, 9, 10},
               {11, 12, 13, 14, 15},
               {16, 17, 18, 19, 20},
               {21, 22, 23, 24, 25}
       };

       System.out.println("Matrix with boundaries:");
       extractBoundaries(exampleMatrix);

       System.out.println("Center part of matrix:");
       cropCenterPart(exampleMatrix);
   }
}



// new pract
import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Main {

   public static class Read {
       String data []= null;

       public String[] wordtokenize(String a) {
           try {
               File myObj1 = new File(a);
               Scanner myReader1 = new Scanner(myObj1);
               for (int i=0; i< data.length; i++)
               {
                   if(myReader1.hasNextLine())
                       data[i]=data[i]+myReader1.nextLine() + "\n";
               }
               myReader1.close();
           } catch (FileNotFoundException e) {
               System.out.println("An error Occurred");
           }
           return data;
       }

       public String []extractEmail(String b) {
           try {
               File myObj2 = new File(b);
               Scanner myReader2 = new Scanner(myObj2);
               for(int i=0; i< data.length; i++)
               {
                   if(myReader2.hasNextLine())
                   {
                       data[i]=data[i]+myReader2.nextLine();
                   }
               }
               myReader2.close();
           } catch (FileNotFoundException e) {
               System.out.println("An error Occurred");
           }
           return data;
       }
   }


   public static void main(String args[]) {
       Read r = new Read();
       String store_data = "";
       String store_email = "";

       System.out.println("Text with special characters.\n");

       System.out.println(r.wordtokenize("d:\\GM.txt")+"\n");
       //System.out.println(r.extractEmail("d:\\GM.txt")+"\n");

       System.out.println("Text without special characters.\n");
       for (int i = 0; i <r.data.length; i++ )
       {

           char cha =r.data[i].charAt(0);

           if ((cha >= 'a' && cha <= 'z') || (cha >= 'A' && cha <= 'Z') || cha == ' ') {
               store_data += cha;
           } else {
               continue;
           }
           System.out.println(cha);
       }


       }


   }






