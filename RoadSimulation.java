import java.util.Vector;
import java.util.Random;
import java.util.*;
import java.util.Scanner;



public class RoadSimulation {
  public static Random rand = new Random();


  public static void main(String args[]){


    System.out.println("Choose the level of workload:\n 1.Weak\n 2.Medium\n 3.High\n");
    Scanner scan = new Scanner(System.in);
    String s = scan.next();
    Double[][] c = new Double [100][100];
    Double[][] v = new Double [100][100];
    Double[][] q = new Double [100][100];
    if(s.equals("1")){
      for(int i = 0;i<3;i++){
        System.out.println("Enter the starting number of cars on the first sector");
        int nn1 = scan.nextInt();
        Double n1 = (double) nn1;
        Double d = (double)n1*10/100;
        int border = Integer.valueOf(d.intValue());

        int Qchanges = rand.nextInt(border);
        Double qIn1 = n1;
        Double qOut1  = qIn1 - Qchanges;

        Double qIn2  = qOut1;
        Qchanges = rand.nextInt(border);
        Double qOut2 = qIn2 - Qchanges;
        Double qIn3 = qOut2;
        Qchanges = rand.nextInt(border);
        Double qOut3 = qIn3 - Qchanges;

        if(i==0){

          c[i][1] = (1/(0.1*3))*(qIn1 - qOut1);
        }else{

          c[i][1]= c[i-1][1] + (1/(0.1*3))*(qIn1 - qOut1);
        }
        v[i][1] = (100/n1)*(1 - (c[i][1]/2000));
        q[i][1] = c[i][1]*v[i][1]*3;

        if(i==0){
          c[i][2] = (1/(0.1*3))*(qIn2 - qOut2);
        }else{
          c[i][2]= c[i-1][2] + (1/(0.1*3))*(qIn2- qOut2);
        }
        v[i][2] = (100/n1)*(1 - (c[i][2]/2000));
        q[i][2] = c[i][2]*v[i][2]*3;

        if(i==0){
          c[i][3] = (1/(0.1*3))*(qIn3 - qOut3);
        }else{
          c[i][3]= c[i-1][3] + (1/(0.1*3))*(qIn3- qOut3);
        }
        v[i][3] = (100/n1)*(1 - (c[i][3]/2000));
        q[i][3] = c[i][3]*v[i][3]*3;
        String res = "hour:"+i+"\n1 section \n c: "+c[i][1]+ " v: "+v[i][1]+" q: "+q[i][1]+"\n 2 section \nc:"+c[i][2]+ " v: "+v[i][2]+" q: "+q[i][2]+"\n 3 section \n c:" + c[i][3] + " v: "+v[i][3]+" q: "+q[i][3];
        System.out.println(res);
      }

    }else if(s.equals("2")){
      for(int i = 0;i<3;i++){
        System.out.println("Enter the starting number of cars on the first sector");
        int nn1 = scan.nextInt();
        Double n1 = (double) nn1;
        Double d = (double)n1*40/100;
        int border = Integer.valueOf(d.intValue());
        
        int Qchanges = rand.nextInt(border);
        Double qIn1 = n1;
        Double qOut1  = qIn1 - Qchanges;

        Double qIn2  = qOut1;
        Qchanges = rand.nextInt(border);
        Double qOut2 = qIn2 - Qchanges;
        Double qIn3 = qOut2;
        Qchanges = rand.nextInt(border);
        Double qOut3 = qIn3 - Qchanges;

        if(i==0){

          c[i][1] = (1/(0.1*3))*(qIn1 - qOut1);
        }else{
          c[i][1]= c[i-1][1] + (1/(0.1*3))*(qIn1 - qOut1);
        }
        v[i][1] = (100/n1)*(1 - (c[i][1]/2000));
        q[i][1] = c[i][1]*v[i][1]*3;

        if(i==0){
          c[i][2] = (1/(0.1*3))*(qIn2 - qOut2);
        }else{
          c[i][2]= c[i-1][2] + (1/(0.1*3))*(qIn2- qOut2);
        }
        v[i][2] = (100/n1)*(1 - (c[i][2]/2000));
        q[i][2] = c[i][2]*v[i][2]*3;

        if(i==0){
          c[i][3] = (1/(0.1*3))*(qIn3 - qOut3);
        }else{
          c[i][3]= c[i-1][3] + (1/(0.1*3))*(qIn3- qOut3);
        }
        v[i][3] = (100/n1)*(1 - (c[i][3]/2000));
        q[i][3] = c[i][3]*v[i][3]*3;
        String res = "hour:"+i+"\n1 section \n c: "+c[i][1]+ " v: "+v[i][1]+" q: "+q[i][1]+"\n 2 section \nc:"+c[i][2]+ " v: "+v[i][2]+" q: "+q[i][2]+"\n 3 section \n c:" + c[i][3] + " v: "+v[i][3]+" q: "+q[i][3];
        System.out.println(res);
      }

    }else if(s.equals("3")){
      for(int i = 1;i<=3;i++){
        System.out.println("Enter the starting number of cars on the first sector");
        int nn1 = scan.nextInt();
        Double n1 = (double) nn1;
        Double d = (double)n1*80/100;
        int border = Integer.valueOf(d.intValue());

        int Qchanges = rand.nextInt(border);
        Double qIn1 = n1;
        Double qOut1  = qIn1 - Qchanges;

        Double qIn2  = qOut1;
        Qchanges = rand.nextInt(border);
        Double qOut2 = qIn2 - Qchanges;
        Double qIn3 = qOut2;
        Qchanges = rand.nextInt(border);
        Double qOut3 = qIn3 - Qchanges;
        c[0][1]=0.0;
        c[0][2]=0.0;
        c[0][3]=0.0;

          c[i][1]= c[i-1][1] + (1/(0.1*3))*(qIn1 - qOut1);

        v[i][1] = (100/n1)*(1 - (c[i][1]/2000));
        q[i][1] = c[i][1]*v[i][1]*3;


          c[i][2]=  c[i-1][2] + (1/(0.1*3))*(qIn2- qOut2);

        v[i][2] = (100/n1)*(1 - (c[i][2]/2000));
        q[i][2] = c[i][2]*v[i][2]*3;


          c[i][3]= c[i-1][3] + (1/(0.1*3))*(qIn3- qOut3);

        v[i][3] = (100/n1)*(1 - (c[i][3]/2000));
        q[i][3] = c[i][3]*v[i][3]*3;
        String res = "hour:"+i+"\n1 section \n c: "+c[i][1]+ " v: "+v[i][1]+" q: "+q[i][1]+"\n 2 section \nc:"+c[i][2]+ " v: "+v[i][2]+" q: "+q[i][2]+"\n 3 section \n c:" + c[i][3] + " v: "+v[i][3]+" q: "+q[i][3];
        System.out.println(res);

    }
  }

  }
}
