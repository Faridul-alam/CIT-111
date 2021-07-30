/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit_111_spring;
import java.util.Scanner;

/**program ask users series of question to assess the compatibility 
 *
 * @author farid
 */
public class friend_project {
    public static void main(String[] notUsed){
        // create variables
        int compatScore=0;
        final int compat_Threshold=45;
        int userResponse=0;
        Scanner inputScanner;
       
        boolean passThreshold=false;
        
     //point allotment for the question 1
     final int Q1_yes=30;
     final int Q1_no=-50;
        //creat scanner
        inputScanner=new Scanner(System.in);
        
        System.out.println("Hello , I am Farid. Let's see if we are compatible as friend");
        System.out.println("Please answer the following questions");
        
        System.out.println("Do you like sports? Enter 1 for yes 0 for no");
        // use inputScanner to get the user's response
        userResponse=inputScanner.nextInt();
        
        
        if(userResponse==1){
            // This is for nested logic and will only run if user likes sports
            // add 30 to the compatScore
            compatScore=compatScore+Q1_yes;
             System.out.println("cool! Me too");
             System.out.println("Your Score compatiblity score "+Q1_yes+" points");
             
            /// ************ Question 2 sports type*****************
            
            System.out.println("What sports do you like? Type in the number and press enter");
            System.out.println("1.Soccer");
            System.out.println("2.Basketball");
            System.out.println("3.MMA");
            System.out.println("4.Boxing");
            System.out.println("5.Cricket");
            System.out.println("6.other");
            userResponse= inputScanner.nextInt();
            if(userResponse==1){
                // Soccer
                compatScore=compatScore+70;
                System.out.println("compatiblity score "+compatScore);
            }else if(userResponse==2){
                // Basketball
                compatScore=compatScore+60;
                System.out.println("compatiblity score "+compatScore);
                //MMA
            }else if(userResponse==3){
                compatScore=compatScore+50;
                System.out.println("compatiblity score "+compatScore);
                
            //Boxing
            }else if(userResponse==4){
                compatScore=compatScore+40;
                System.out.println("compatiblity score "+compatScore);
                // Cricket
            }else if(userResponse==5){
                compatScore=compatScore+30;
                System.out.println("compatiblity score "+compatScore);
                
                //Other
            }else if(userResponse==6){
                compatScore=compatScore+10;
                System.out.println("compatiblity score "+compatScore);
            
            }//Close Q2 sports type
           
    
 
            
        } else{// if user enters anything other than 1
          compatScore=compatScore+Q1_no;
          System.out.println("Too bad");
          System.out.println("your compatibility score "+Q1_no+" points");
        
        }//close Q1 if/else
        
        System.out.println("Do you speak more than one language");
        System.out.println("Please 1 for yes , 0 for no");
        userResponse=inputScanner.nextInt();
        
        if(userResponse==1){
            compatScore=compatScore+50;
            System.out.println("Great! me too");
            System.out.println("Compatibility score "+compatScore);
           System.out.println("which other language do you speak?Type in the number");
           System.out.println("1 for French");
           System.out.println("2 For German");
           System.out.println("3 for Italian");
           System.out.println("4 for other language");
           userResponse=inputScanner.nextInt();
           switch(userResponse){
                   case 1://Frence
                   compatScore=compatScore+60;
                   break;
                   case 2://German
                   compatScore=compatScore+50;
                   break;
                   
                   case 3://Italian
                       compatScore=compatScore+40;
                       break;
                   case 4://other language
                           compatScore=compatScore+30;
                           break;
                   default:
                       compatScore=compatScore+0;}
           
            
        }else {
            compatScore=compatScore+0;
        }
        
        
        
        
        System.out.println("Calculating friend compatiblity score");
        System.out.println("your compatibility score "+compatScore+" points");
        
        if(compatScore>=compat_Threshold){
            passThreshold=true;
            System.out.println("Enchante! lets be friend");
        }else {
            System.out.println("Sorry, we cant be friend");
        }//  close end/if overall compatibility test
        
       System.out.println("Thank you for using compatibility tool");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }//close main
    
}// close class friend_project
