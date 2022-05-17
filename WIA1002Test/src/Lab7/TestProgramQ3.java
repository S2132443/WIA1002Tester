/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab7;

import java.util.Scanner;

public class TestProgramQ3 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int earn = 0;
        
        MyQueue<Integer> share = new MyQueue<>();
        MyQueue<Integer> price = new MyQueue<>();
        
        System.out.println("Enter your query (In format 'Buy / Sell x shares at $y each'): ");
        String option = in.nextLine();
        
        while (!option.equalsIgnoreCase("quit")) {
            if (option.equalsIgnoreCase("Buy")) {
                System.out.println("Buying now...");
                System.out.print("Enter the number of shares: ");
                int num_shares = in.nextInt();
                share.enqueue(num_shares);
                System.out.print("Enter the amount of prices: ");
                int amount = in.nextInt();
                price.enqueue(amount);
                
                System.out.println("Queue for Share: " + share.toString());
                System.out.println("Queue for Price: " + price.toString());
                
                System.out.println("Enter your query (In format 'Buy / Sell x shares at $y each'): ");
                in.nextLine();
                option = in.nextLine();
            } else if (option.equalsIgnoreCase("Sell")) {
                System.out.println("Selling the shares now...");
                System.out.print("Enter the number of shares: ");
                int num_shares = in.nextInt();
                System.out.print("Enter the amount of prices: ");
                int amount = in.nextInt();
                
                if (share.getSize() == 1) {
                    int temp_share = share.dequeue();
                    int temp_price = price.dequeue();
                    if (num_shares > temp_share) {
                        earn += (temp_share * amount) - (temp_share * temp_price);
                        System.out.println("Total Capital Gain / Loss: " + earn);
                    } else if (num_shares > 0) {
                        System.out.println("No shares to sell!");
                    }
                    
                    System.out.println("Queue for Share: " + share.toString());
                    System.out.println("Queue for Price: " + price.toString());
                    break;
                } else {
                    if (!share.isEmpty() && share.getSize() != 1) {
                        for (int i = 0; i < share.getSize(); i++) {
                            if (num_shares < share.getElement(0)) {
                                int num = share.dequeue() - num_shares;
                                share.enqueue(num);
                                earn += (num_shares * amount) - (num_shares * price.getElement(i));
                                System.out.println("Total Capital Gain / Loss: " + earn);
                                System.out.println("Queue for Share: " + share.toString());
                                System.out.println("Queue for Price: " + price.toString());
                                System.out.println("Enter your query (In format 'Buy / Sell x shares at $y each'): ");
                                option = in.nextLine();
                                break;
                            } else if (num_shares > share.getElement(0)) {
                                if (num_shares > 0) {
                                    int temp = share.dequeue();
                                    num_shares -= temp;
                                    int temp_price = price.dequeue();
                                    earn += (temp * amount) - (temp * temp_price);
                                    if (num_shares > share.getElement(0)) {
                                        continue;
                                    } else {
                                        int num = share.dequeue() - num_shares;
                                        share.enqueue(num);
                                        earn += (num_shares * amount) - (num_shares * price.getElement(i));
                                    }
                                    System.out.println("Total Capital Gain / Loss: " + earn);
                                    System.out.println("Queue for Share: " + share.toString());
                                    System.out.println("Queue for Price: " + price.toString());
                                    System.out.println("Enter your query (In format 'Buy / Sell x shares at $y each'): ");
                                    option = in.nextLine();
                                    break;
                                }
                            }
                        }
                    }
                }
                System.out.println("Final Capital Gain / Loss : " + earn);
            }
        }
    }
    
}
