package com.tapakkur.atm;

import java.util.Scanner;

/**
 * created by tapakkur on 2019/1/27
 */
public class Test {

    public static void main(String args[]) {
        //欢迎界面
        welcome();

        ServiceImpl service = new ServiceImpl();
        ATM atm = service.all();

        Scanner in = new Scanner(System.in);
        for (int i = 3; i > 0; i--) {
            System.out.println("Please enter the account");
            String tempAccount = in.next();
            System.out.println("Please enter the password");
            String tempPassword = in.next();
            if (atm.getUser().equals(tempAccount) && atm.getPassword().equals(tempPassword)) {
                break;
            } else {
                if ((i-1) != 0) {
                    System.out.println("you have " + (i - 1) + " chances left today.");
                    continue;
                } else {
                    System.out.println("you have no more chances today ,please contact with admin!");
                    System.exit(0); // 0：正常退出，1：强制退出
                }

            }
        }
        System.out.println("login successful");
        boolean flag = true;
        String isYes = "yes";
        while (flag) {
            showMenu();
            System.out.println("PLease enter your selection: ");
            String option = in.next();
            boolean difference = true;
            switch (option) {
                case "1" : {
                    service.getInfo();
                    System.out.println("do you want to continue ?(yes/no)");
                    isYes = in.next();
                    if (isYes.equals("yes")) {
                        flag  = true;
                    } else {
                        flag = false;
                    }
                    break;
                }
                case "2" : {
                    System.out.println("How much money do you want to deposit ?");
                    double balance = in.nextDouble();
                    service.save(balance);
                    System.out.println("do you want to continue ?(yes/no)");
                    isYes = in.next();
                    if (isYes.equals("yes")) {
                        flag  = true;
                    } else {
                        flag = false;
                    }
                    break;
                }
                case "3" : {
                    System.out.println("How much money do you want to withdraw ?");
                    double balance = in.nextDouble();
                    System.out.println("Notice : your balance is $" + service.get(balance));
                    System.out.println("do you want to continue ?(yes/no)");
                    isYes = in.next();
                    if (isYes.equals("yes")) {
                        flag  = true;
                    } else {
                        flag = false;
                    }
                    break;
                }
                case "4" : {
                    System.out.println("Input your old password");
                    String oldPws = in.next();
                    if (oldPws.equals(atm.getPassword())) {
                        while (difference) {
                            System.out.println("Input your new password");
                            String newPsw_1 = in.next();
                            System.out.println("Input your new password again");
                            String newPsw_2 = in.next();
                            if (newPsw_1.equals(newPsw_2)) {
                                difference = false;
                                service.modify(newPsw_1);
                            } else {
                                System.out.println("The input password is not the same, please re-enter");
                                difference = true;
                            }
                        }
                        // 修改成功后跳转到这儿来，说明用户的两次新密码输入是一致的
                        System.out.println("do you want to continue ?(yes/no)");
                        isYes = in.next();
                        if (isYes.equals("yes")) {
                            flag  = true;
                        } else {
                            flag = false;
                        }
                        break;
                    } else {
                        System.out.println("The password is wrong ,try it again");
                        flag = true;
                        break;
                    }
                }
                case "5" : {
                    flag  = false;
                    break;
                }
                default: {
                    flag  = true;
                    System.out.println("Illegal input ,please try again !");
                }
            }
        }
        System.out.println("thank you,bye bye!");
        System.exit(0); // if the user input is 5 ,then the system exit.
    }

    // 欢迎界面
    public static void welcome () {
        System.out.println("------------------------------------------");
        System.out.println("|--------- Welcome to use the ATM --------|");
        System.out.println("|------------- Version 1.0 ---------------|");
        System.out.println("|-- ©2019 Copyright belongs to Tapakkur --|");
        System.out.println("------------------------------------------");
    }

    //显示目录
    public static void showMenu () {
        System.out.println("1.check money，2.save money，3.get money，4.modify psw，5.logout");
    }
}


