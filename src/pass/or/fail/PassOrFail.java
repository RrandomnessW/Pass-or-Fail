/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pass.or.fail;

import java.util.Scanner;

/**
 *
 * @author ryanj
 */
public class PassOrFail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int[][] weight = new int[10][4];        
        int[] no = new int[10];
        int[][][] student=new int[10][35][4];
        int temp=0;
        double temp2;
        int[] pass=new int[10];
        
        for(int i=0;i<10;i++){
            for (int j=0;j<4;j++){
            weight[i][j]=sc.nextInt();
            }
            no[i]=sc.nextInt();//number of students
            for (int k=0;k<no[i];k++){
                for(int m=0;m<4;m++){
                    student[i][k][m]=sc.nextInt();
                }
            }
        }
        for(int i=0;i<10;i++){
            for (int j=0;j<no[i];j++){
                temp = weight[i][0]*student[i][j][0];
                temp += weight[i][1]*student[i][j][1];
                temp += weight[i][2]*student[i][j][2];
                temp += weight[i][3]*student[i][j][3];
                temp2 = temp/100.0;
                if (temp2>=50){
                    pass[i]+=1;
                }
                temp=0;
            }
        }
        for (int i=0;i<10;i++){
            System.out.println(pass[i]);
        }
    }
    
}
