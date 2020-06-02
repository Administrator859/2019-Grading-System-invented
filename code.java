import java.util.Scanner;
public class Main1 
{
  public static void main(String[] args) 
    {
      Scanner input = new Scanner(System.in);//EXAMPLE OF import java.util.Scanner;
      char ch;//FINAL SELECTION OF 'Y' AND 'N'
      String[] subjects = new String[]//ARRAY FOR THE subject[a]
      {"    Computer", "    Math", "    English","    APEH",
         "    AP","    Science","    Val-ed","    Filipino"};//8 subjects. 
      int name;
         //spacing
         //spacing
        do//do Nested Loop  
        {//BEGINING BRACKET OF DO NESTED 
          int [] grades; //GRADES FOR THE 8 SUBJECTS. 
          grades = new int[8];//8 GRADES WILL COMPUTE
          int x=0,average_grade=0,total_sum=0;//x=0 - IS FOR THE #average_grade#,AT SA #total_sum#
          System.out.println("::::::FEB 29 TO MARH 7, 2020 (1 WEEK)=(7 DAYS)::::::");
          System.out.println("  !!!!!WELCOME TO 2019 GRADING SYSTEM PROGRAM!!!!! ");
          System.out.println("              #####TAGLISH VERSION#####");
          System.out.println("                [[[[ONLY 96 CODES]]]]");
          System.out.println("         <==================================>");
          System.out.println("        M.A.K.E.R__OF__T.H.I.S__P.R.O.G.R.A.M");
          System.out.println("      :{CABAYAO}:{BENDIGOSA}:{MENDEZ}:{PALMAERA}:");
          System.out.println();
           for (int a=0; a<8; a++)//FOR THE COMPUTATION OF HOW MANY GRADES WILL BE COMPUTED IN 8 array subjects
           {//BEGINING BRACKET NG FIRST forLoop
             System.out.print("   <<Enter A Grade for this Subject " + subjects[a] + " : ");
             grades[a] = input.nextInt();                                                
             total_sum+=grades[a];                                                           
             average_grade = total_sum/8;                                              
             int sum = 0;
           }//FINAL BRACKET NG FIRST forLoop
             System.out.println(" <===================================>");
             System.out.println("    SUBJECTS" + "      \tGRADES");
             System.out.println("   <--------------------------->");
             for(int l = 0; l < subjects.length; l++)//ANOTHER forLoop 
             {//BEGINING BRACKET OF SECOND forLoop  
               System.out.println(subjects[l] + "   \t" + "\t" + grades[l]); 
               if(grades[l] > 0 && grades[l] < 85)
               {//BEGINING BRACKET OF FIRST if statement
                 System.out.println("********                ^^");//statement
                 System.out.println("You cannot Enter to the honors list because  you have below 85 graade");//statement
                 System.out.println("********");//statement
               }//FINAL BRACKET OF FIRST if statement
             }//FINAL BRACKET OF SECOND forLoop
                 System.out.println("<------------------------------------------------------->");
                 System.out.println("total subjects: 8");//statement OF HOW MANY GRADES
                 System.out.println("<------------------------------------------------------->");
                 System.out.println("Total Grades: " + total_sum);//statement OF HOW MANY GRADES DO YOU HAVE IN 8 SUB
                 System.out.println("<------------------------------------------------------->");
                 System.out.print("Average Grade of 8 subjects: " + average_grade);//statement OF WHAT IS THE TOTAL OF THE average
                 System.out.println();//????
                 if(average_grade > 99 && average_grade < 99999999)//FOR THE INVALID average IF SOME OF HIS/HER SUB GOT 100 GRADES UP
                 {//BEGINING BRACKET OF SECOND if satetmrnt
                   System.out.println("--YOUR TOTAL AVERAGE GRADE IS INVALID--");//statement FOR THE INVALID KEY
                   System.out.println("<===================================================>");
                 }//FINAL BRACKET OF THE SECOND if statement
                   if (average_grade >= 97 && average_grade <= 99)//FOR THE HONORS LIST
                   {//BEGINING BRACKET OF THE THIRD if statement
                     System.out.println("<=======================================================>");
                     System.out.print("--WITH HIGHEST HONOR--");//statement
                   }else if(average_grade >= 94 && average_grade <= 96)//FOR THE HONORS LIST
                    {//BEGINING BRACKET OF THE FIRST else if satement
                      System.out.println("<======================================================>");
                      System.out.println("--WITH HIGH HONOR--");//statement
                    }else if(average_grade >= 90 && average_grade <=93)//FOR THE HONORS LIST
                     {//BEGINING BRACKET OF THE SECOND else if statement
                       System.out.println("<======================================================>");
                       System.out.println("--WITH HONOR--");//statement
                     }else if(average_grade >= 75 && average_grade <= 89)//FOR THE PASSING GRADE
                      {//BEGINING BRACKET OF THE THIRD else if statement 
                        System.out.println("<======================================================>");
                        System.out.println("--PASSED--");//statement
                      }else if(average_grade >= 0 && average_grade <= 74)//FOR THE PAASING GRADE
                       {//BEGINING BRACKET OF THE FOURTH else if statement
                         System.out.println("<======================================================>");
                         System.out.println("--FAILED--");//statement
                       }else// else statement
                        {//BEGINING BRACKET OF THE FIRST else if statement
                          System.out.println();
                        }//FINAL BRACKET OF THE FIRST else if statement
                          System.out.println();
                          System.out.println("<------------------------------------------------------->");
                          System.out.println("\nIf you want to continue this program(TYPE Y OR N)");
                          System.out.println("and");
                          System.out.println("If you want to exit to our average solver (type any key)");
                          ch = input.next().charAt(0);//IT WILL BACK TO THE BEGINING OF THE PROGRANG IF YOU WILL PUT y OR n KEY
                        } while (ch == 'y'|| ch == 'n');//SELECTION
                          System.out.println();
                          System.out.print("\t !!THANK YOU FOR USE OUR AVERAGE SOLVER!!");//END OF THE PROGRAM
                          System.out.println("\n\n");
    }
} 
