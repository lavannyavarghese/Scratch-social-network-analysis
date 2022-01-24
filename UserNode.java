/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lavanya;

import java.util.ArrayList;


public class UserNode {
    
    public static ArrayList<String> fList = new ArrayList<>();
     ArrayList<String> vList = new ArrayList<>();
    
    public static void getFeatList(String[] fArr){
        for(int i=0; i<fArr.length; i++){
            fList.add(fArr[i]);
        }
    }
    
     void getValueList(String[] vArr){
        for(int i=0; i<vArr.length; i++){
            vList.add(vArr[i]);
        }
    }

    void printNode() {
        for(int i=0; i<fList.size(); i++){
            System.out.println(fList.get(i)+" :: "+vList.get(i));
        }
        System.out.println("____________________________________________________________________");
    }
    
}
