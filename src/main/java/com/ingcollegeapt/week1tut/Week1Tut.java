package com.ingcollegeapt.week1tut;

import com.ingcollegeapt.week1tut.model.Topic;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Week1Tut {

    private static final Scanner scanner = new Scanner(System.in);
    private static final List<Topic> topics = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            showMenu();
            String choice = scanner.next();
            scanner.nextLine();

            switch (choice) {
                case "1":
                    // TODO: Add topic
                    System.out.print("Enter the topic name: ");  
                    String topicName = scanner.nextLine();
                    if(topicName.isEmpty()){
                        System.out.println("Topic not added!");
                        break;
                    } 
                    int check = 0;
                    for(Topic top : topics){
                        if(topicName.equalsIgnoreCase(top.getTopicName())){
                            System.out.println("Topic not added! Already present!");
                            check=1;
                            break;
                        }
                    }
                    if(check==1) break;
                    int id = topics.size()+1;   // id will start from 1 so size +1
                    Topic topic = new Topic(id, topicName);  // create topic object to add to arraylist
                    topics.add(topic);                       // add to the topics list  
                    System.out.println("Topic is added successfully!");
                    break;
                case "2":
                    // TODO: View topics
                    if(topics.isEmpty()){
                        System.out.println("Np Topics available");
                        break;
                    } 
                    for (Topic topi: topics){
                        System.out.println("ID: "+topi.getTopicId()+" Name: "+topi.getTopicName()
                        +" created Date:"+ topi.getCreatedAt().toLocalDate());
                    }                  
                    break;
                case "3":
                    // TODO: Add entry to a topic
                    break;
                case "4":
                     // TODO: View entries
                    break;
                case "5":
                    //Exit
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
            
            
            
           
        }
    }

    private static void showMenu() {
        System.out.println("\nLearning Logs Menu");
        System.out.println("1. Add Topic");
        System.out.println("2. View Topics");
        System.out.println("3. Add Entry");
        System.out.println("4. View Entries");
        System.out.println("5. Exit");
        System.out.print("Choose an option: ");
    }
}
