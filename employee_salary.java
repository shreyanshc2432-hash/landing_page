import java.util.Scanner;

public class employee_salary {
    public static void main(String[] args){
        Scanner inp= new Scanner(System.in);
        System.out.println("enter employee ID: ");
        long id = inp.nextLong();
        System.out.println("enter basic salary: ");
        double bs=inp.nextDouble();
        double hra= bs*0.2;
        double da=bs*0.1;
        double gs=bs+hra+da;
        double tax=0;
        if (gs>50000){
            tax=gs*0.2;
        }else if (gs>=30000 && gs<50000){
            tax=gs*0.1;
        }else{
            tax=gs*0.05;
        }
        double ns=gs-tax;
        System.out.println(" EMPLOYEE ID = "+ id);
        System.out.println(" HRA = "+ hra);
        System.out.println(" DA = "+ da);
        System.out.println(" GROSS SALARY = "+ gs);
        System.out.println(" TAX "+ tax);
        System.out.println(" NET SALARY = "+ ns);
    }
}
