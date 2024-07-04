package solidprinciples.singleresponsibility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/*
 * SingleResponsibility
 * 
 * Every Single software entity (class or method) should have only a single reason to change.
 * Every class or method in a computer program should have responsibility over a single part of that program's functionality, which it should encapsulate.
 */

public class SingleResponsibility {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numberOfValues :: ");
        int numberOfValues = scanner.nextInt();

        List<Integer> nums = getInput(numberOfValues);
        sort(nums);
        display(nums);
    }

    private static void sort(List<Integer> list){
        Collections.sort(list);
    }

    private static void display(List<Integer> list){
        for(int num : list)
        System.out.print(num+" ");
    }

    private static List<Integer> getInput(int numberOfValues){

        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();
        
        while(numberOfValues > 0) { 
            String s = scanner.nextLine();
            numberOfValues--;  
            if(!isValid(s)) {
                continue;
            }         
            nums.add(Integer.parseInt(s));
        }
        scanner.close();   
        return nums;
    }

    private static boolean isValid(String input){
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException nfe) {
           return false;
        }
        return true;
    }
}
