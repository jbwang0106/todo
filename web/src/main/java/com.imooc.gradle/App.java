package com.imooc.gradle;

import java.util.Scanner;

/**
 * Created by jbwang0106 on 2017/5/26.
 */
public class App {
    
    public static void main(String [] args) {
        int i = 0;

        Scanner scanner = new Scanner(System.in);
        
        while (++i > 0) {
            System.out.println(i + " please input todo item name: ");
            TodoItem todoItem = new TodoItem(scanner.nextLine());
            System.out.println(todoItem);
        }
    }
}
