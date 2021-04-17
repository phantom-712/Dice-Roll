 import java.util.*;
 class dice_roll
    {
        public static void Main()
        {
            Scanner obj=new Scanner(System.in);
            char repeat=' ';
        do
        {
            System.out.println("Welcome to dice roll \nYou have two choices -");
            System.out.println("1 for rolling a dice until you get the number you want");
            System.out.println("2 for rolling a dice for as many times as you want");
            int choice = obj.nextInt();int s=0;int s_1=0;int n;
            switch (choice)
            {
            case 1  : System.out.println("Select the number mentioned in the 1st choice \nMake sure the number is neither less than 1 nor greater than 6 or else it would throw an error");
                      n=obj.nextInt();
                         if(n<=0 && n>=7)
                       {
                        System.out.println("Sorry Wrong choice \n*EXIT*");
                        System.exit(0);
                       }
                      int roll,attempts;
                      roll=0;attempts=0;
                      while (roll!=n)
                      {
                       
                        roll = (int)(Math.random()*6)+1;
                        System.out.println("you rolled a "+roll);
                        attempts++;
                      }
                      System.out.println("it took you "+attempts+" attempts to roll a " +n+ " gg");
                      break;
             
            case 2 : System.out.println("Here you have two options (choose between 1 and 2 only , \n1 - Press r to roll the dice again  \n2- roll the dice as many times as you want and display the result in one go.");
                     int choice_1 = obj.nextInt();
                     switch(choice_1)
                     {
                        case 1 : int attempt_1,roll_1;roll_1=0;char repeat_1;repeat_1=' ';attempt_1=0;
                                 System.out.println("Press r after every roll to roll the dice again \nTo exit press any key except r \nNote that R is not accepted in place of r \n");
                                 do
                                 {
                                   roll_1 = (int)(Math.random()*6)+1;
                                   System.out.println("you rolled a "+roll_1);
                                   attempt_1++;
                                   repeat_1=obj.next().charAt(0);
                                   s+=roll_1;
                                }while(repeat_1=='r');
                                System.out.println("The sum of all the rolls = "+s);
                                break;
                        case 2 : System.out.println("How many times do you want to roll the dice?");
                                 int times,i,roll_2;roll_2=0;
                                 times = obj.nextInt();
                                 for(i=1;i<=times;i++)
                                 {
                                   roll_2 = (int)(Math.random()*6)+1;
                                   System.out.println("you rolled a "+roll_2);s_1+=roll_2;
                                 }
                                 System.out.println("The sum of all the rolls = "+s_1);
                                 break;
                        default : System.out.println("Invalid choice");System.exit(0);break;
                      }
                      break;
                      default: System.out.println("Invalid choice");System.exit(0);break;
        }
            System.out.println("To roll again press R \nTo exit press E");
            repeat = obj.next().charAt(0);
            if(repeat=='E')
            {
             System.out.println("*EXIT*");
             System.exit(0);
            }
            else if(repeat !='R')
            {
             System.out.println("sorry wrong input. "+ "\n*EXIT*");
             System.exit(0);
            }
    }while(repeat == 'R');
    }
}
