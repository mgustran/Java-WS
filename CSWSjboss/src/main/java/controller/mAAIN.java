package controller;

/**
 * Created by mgustran on 20/05/2016.
 */

import model.SpeedUnit;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;



 // Created by mgustran on 13/05/2016.
 //  COMMENT OPEN

public class mAAIN {

    public static void main(String[] args) throws MalformedURLException {
//        System.out.println("escribe la unidad double a convertir");
//        Scanner sc = new Scanner(System.in);
//
//        SpeedBean speedBean=new SpeedBean();
//        FromUnitBean fromUnitBean = new FromUnitBean();
//        ToUnitBean toUnitBean = new ToUnitBean();
//
//
//        Controller cont = new Controller();
//        Double out = cont.convertSpeed();
//        System.out.println(out);
//        System.out.println();;
//        double scan = sc.nextDouble();
////        cont.setInputSpeed( scan);
////        cont.set(SpeedUnit.KNOTS);
////        cont.setToUn(SpeedUnit.KILOMETERS_PERHOUR);
////        System.out.println(cont.convert());
//
//
//    }
//}
//
//    //   COMMENT CLOSE
//

        Controller controller = new Controller();
        controller.convertSpeedTest();
    }
}




