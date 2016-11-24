package com.ahstu.corki.calculator;
/**
 * Created by corki on 2016-11-15.
 */

public class Count {
    static String run(String s){
        s=s.replaceAll("＋","&");
        s=s.replaceAll("\\+","&");
        s=s.replaceAll("－","-");
        s=s.replaceAll("×","*");
        s=s.replaceAll("÷","/");
        if (s.charAt(s.length()-1)=='％')
        {
            return String.valueOf(Double.parseDouble(s.substring(0,s.length()-1))*100)+"％";
        }
        return run_as(run_md(s));
    }

    static String run_md(String s){

        String num_regex = "[1-9][0-9]*[.]?[0-9]*",op_regex = "[\\p{Punct}&&[^.]]+";
        String[] num = s.split(op_regex),op = s.split(num_regex);
        for (int i=0;i<op.length;i++){
            if (op[i].equals("*")){
                double a=Double.parseDouble(num[i-1]),b=Double.parseDouble(num[i]);
                s=s.replaceAll(num[i-1]+"\\"+op[i]+num[i],String.valueOf(a*b));//加反斜杠为转义
                return run_md(s);
            }
            if (op[i].equals("/")){
                double a=Double.parseDouble(num[i-1]),b=Double.parseDouble(num[i]);
                s=s.replaceAll(num[i-1]+"\\"+op[i]+num[i],String.valueOf(a/b));//加反斜杠为转义
                return run_md(s);
            }

        }

        return s;
    }
    static String run_as(String s){

        String num_regex = "[1-9][0-9]*[.]?[0-9]*",op_regex = "[\\p{Punct}&&[^.]]+";
        String[] num = s.split(op_regex),op = s.split(num_regex);
        for (int i=0;i<op.length;i++){

            if (op[i].equals("-")&&i!=0){
                double a=Double.parseDouble(num[i-1]),b=Double.parseDouble(num[i]);
                if (a-b<0){
                    s=s.concat(String.valueOf(a-b));
                    s=s.replace(num[i - 1]  + op[i] + num[i],"");

                }
                else {
                    s = s.replaceAll(num[i - 1] + "\\" + op[i] + num[i], String.valueOf(a - b));//加反斜杠为转义
                }
                return run_as(s);
            }
            if (op[i].equals("&")){
                if(i==0)
                {
                    s=s.substring(1,s.length());
                }
                else {
                    double a = Double.parseDouble(num[i - 1]), b = Double.parseDouble(num[i]);
                    s = s.replaceAll(num[i - 1] + "\\" + op[i] + num[i], String.valueOf(a + b));//加反斜杠为转义
                }
                return run_as(s);
            }

        }

        return s;
    }


}