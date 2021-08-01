package collections.comparingexample;
import java.util.*;
public class ArrayListSortComparator  {

 public static void main(String args[]){
    ArrayList<StudentComparator> arraylist = new ArrayList<StudentComparator>();
    arraylist.add(new StudentComparator(111, "Zyan", 30));
    arraylist.add(new StudentComparator(333, "Ronaldo", 31));
    arraylist.add(new StudentComparator(222, "Messi", 29));

    /*Sorting based on Student Name*/
    System.out.println("Student Name Sorting:");
    Collections.sort(arraylist, StudentComparator.StuNameComparator);

    for(StudentComparator str: arraylist){
   System.out.println(str);
    }

    /* Sorting on Rollno property*/
    System.out.println("RollNum Sorting:");
    Collections.sort(arraylist, StudentComparator.StuRollno);
    for(StudentComparator str: arraylist){
   System.out.println(str);
    }
 }
}