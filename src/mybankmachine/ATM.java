/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mybankmachine;

import javax.swing.JOptionPane;

/**
 *
 * @author clkon
 */
public class ATM {
    double money,i,money2 ;
        String money1,bank,year ;
        double money3,days;;
    
public ATM(){
     money = (int)(Math.random()*10000);
        money1 = JOptionPane.showInputDialog("How much money do you want to deposit\n"+"the current balance:"
        +money);
         i = Integer.parseInt(money1);
         if(i > 0 );{
        money2 = i + money;
                JOptionPane.showMessageDialog(null,"Now, you have money:"+ money2);
}
          if (i<0) {
          JOptionPane.showMessageDialog(null,"Your input should be greater than 0");  
                 }

}
public ATM(double withdrawmoney){
    money =(int)(Math.random()*10000);
    money1 = JOptionPane.showInputDialog("How much money do you want to withdraw?"+"the current balance:"
        +money);
    i = Integer.parseInt(money1);;
        if(i > 0 );{
        withdrawmoney = money - i;
                JOptionPane.showMessageDialog(null,"Now, you have money:"+ withdrawmoney);
}
        if(i < 0) {
          JOptionPane.showMessageDialog(null,"Your input should be greater than 0");  
                 }
    
}
    public ATM(String dailyinterest){
        double d = new Double(dailyinterest);
    bank = JOptionPane.showInputDialog("Which bank is your bank card?\n"+
            "1.BMO"+
            "2.Royal Bank"+
            "Other bank");
    if(bank.equals("1")){
        d = (1.5/100);
        money =(int)(Math.random()*10000);
        days = (int)(Math.random()*600);
        money3 = money*(Math.pow((1+d),days));
        JOptionPane.showMessageDialog(null,"the annual interest rate:"+ d+"\n"
        +"the number of days to leave the balance invested"+ days
        +"It should then add the interest to the current balance"+money3);  
    }
    else if (bank.equals("2")){
        d =(1.4/100);
        money =(int)(Math.random()*10000);
        days = (int)(Math.random()*600);
        money3 = money*(Math.pow((1+d),days));
        JOptionPane.showMessageDialog(null,"the annual interest rate:"+ dailyinterest+"\n"
        +"the number of days to leave the balance invested"+ days
        +"It should then add the interest to the current balance"+money3);  
    }
    else{
        d = (1.6/100);
        money =(int)(Math.random()*10000);
        days = (int)(Math.random()*600);
        money3 = money*(Math.pow((1+d),days));
        JOptionPane.showMessageDialog(null,"the annual interest rate:"+ dailyinterest+"\n"
        +"the number of days to leave the balance invested"+ days
        +"It should then add the interest to the current balance"+money3);  
    }

    
}

}

