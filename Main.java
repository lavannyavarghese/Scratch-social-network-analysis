/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lavanya;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;


public class Main {
    
    static ArrayList<UserNode> unList = new ArrayList<>();
    
    public static void main(String[] args){
        try {
            BufferedReader readUser = new BufferedReader(new FileReader("./1000userData/users.csv"));
            String s = readUser.readLine();
            String[] featList=  s.split(",");
            UserNode.getFeatList(featList);
            int n = featList.length;
            while((s=readUser.readLine())!=null){
                System.out.println(s.split(",").length);
                if(s.split(",").length==n){
                    UserNode un = new UserNode();
                    un.getValueList(s.split(","));
                    unList.add(un);
                }
            }
            //Display UserNodes
            for(int i=0; i<unList.size(); i++){
                unList.get(i).printNode();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
