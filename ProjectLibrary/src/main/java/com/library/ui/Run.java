package com.library.ui;

import com.library.domain.ControllerInterfaces.PersonControllerInterface;
import com.library.domain.Controllers.PersonController;
import com.library.domain.models.Messages;

import java.util.Scanner;

public class Run {
    RunInterface runBookInterface = new RunBook();
    PersonControllerInterface personControllerInterface = new PersonController();
    Scanner sc = new Scanner(System.in);

    void run(){
        System.out.println(Messages.CONTENT);
        while (true) {
            System.out.println(Messages.CONTENT);
            String s = sc.nextLine();
            switch (s) {
                case "1":
                    runBookInterface.show();
                    break;
            }
        }


}
    }



