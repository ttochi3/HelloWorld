package javaUtil.exam;

import java.util.*;

public class ListExam2 {
    public List<String> addArray(String[] arr1, String[] arr2){
        List<String> list = new ArrayList<String>();
        
        for(String str : arr1){
            System.out.println(str);     
        }

        for(String str : arr2){
            System.out.println(str);
        }

        return list;
    }
    
    public static void main(String[] args){
        String[] astr = {"kim","sang","yeon"};
        String[] bstr = {"jung","hae","young"};

        ListExam2 ex = new ListExam2();
        List<String> list1 = ex.addArray(astr,bstr);
    }
}
