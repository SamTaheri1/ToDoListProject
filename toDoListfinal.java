import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class toDoListfinal{
    public static void main(String[] args){
        Boolean loop = true;
        Scanner input = new Scanner(System.in);
        List<String> toDo = new ArrayList<>();

        
        while (loop){
            //1st
            System.out.println("");
            System.out.println("Add a task: ");
            String answer1 = input.nextLine();
            toDo.add(answer1);

            //modify?

            System.out.println("Do you wish to modify anything? ");
            String answer2 = input.nextLine();
            if (answer2.toLowerCase().contains("yes")){
                System.out.println("Which task do you wish to modify? ");
                String answer3 = input.nextLine();
                
                //detect modify in list

                for (String item : toDo) {
                    if (item.toLowerCase().contains(answer3)) {
                        System.out.println("Found: " + item);

                        //replace in list

                        toDo.remove(item);
                        System.out.println("What task do you wish to replace it with? ");
                        String answer4 = input.nextLine();
                        toDo.add(answer4);
                    
                        System.out.println(toDo);
                        break;
                    }
                }
            }
            
            if (answer2.toLowerCase().contains("no") || answer2.toLowerCase().contains("yes")) {
            //delete?

                System.out.println("Do you wish to delete a task? ");
                String answer5 = input.nextLine();
             
                if (answer5.toLowerCase().contains("yes")){
                    System.out.println("Which task do you wish to erase? ");
                    String answer6 = input.nextLine();

                    //detect for remove

                    for (String item : toDo) {
                        if (item.toLowerCase().contains(answer6)) {
                            System.out.println("Found: " + item);
                            toDo.remove(item);

                            System.out.println(toDo);
                            
                            break;
                        }
                    }  
                }

                //if no

                else if (answer5.toLowerCase().contains("no")){
                    System.out.println("");
                }

                //if other

                else{
                    System.out.println("error");
                }
            }

            //if other

            else{
                System.out.println("error");
            }
        }
        input.close();
    }
}