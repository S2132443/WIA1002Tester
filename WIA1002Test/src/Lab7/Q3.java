/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q3 {
// Profit/loss = sellPrice - buyPrice
    public static class Pair{
        private Integer key;
        private Integer value;
        
        public Pair (Integer k, Integer v){
            key = k;
            value = v;
        }
        
        public Integer getKey(){
            return key;
        }
        public Integer getValue(){
            return value;
        }
        public void modifyKey(Integer k) {
            key += k;
        }

        public String toString() {
            return String.format("{Units: %s , Buy Price: %s}", key, value);
        }     
    }
  
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Queue<Pair> q = new LinkedList();
        
        String query;
        int profit = 0;
        
        while(true) {
        System.out.print("Enter your query (In format 'Buy / Sell x shares at $y each'): ");
        query = s.nextLine();
        if (query.isEmpty()) break;
        
        String[] temp = query.split(" "); // size of 5
        int share = Integer.parseInt(temp[1]);
        int price = Integer.parseInt(temp[4].substring(1));
        
        if (temp[0].equalsIgnoreCase("Buy")){
            System.out.println("Buying now...");
            q.offer(new Pair(share, price));
            System.out.println("The queue now is: " + q);
        } else {
            System.out.println("Selling now...");
            while(share > 0 && !q.isEmpty()) {
                int diff = price - q.peek().getValue(); // difference in price
                if (share >= q.peek().getKey()) {
                    share -= q.peek().getKey();
                    profit += diff * q.peek().getKey();
                    q.poll();
                } else {// if the share is smaller than out stock in hand
                    // decrease the share balance in our hand
                    profit += diff * share;
                    q.peek().modifyKey(-share);
                    share = 0;   
                }
                System.out.println("Total Capital Gain / Loss: " + profit);
            }
            if (share > 0) {
                System.out.println("No shares to sell!");
            }
            System.out.println("The queue now is: " + q);
        } 
        System.out.println("Final Capital Gain / Loss: " + profit);
    }
  }
}
