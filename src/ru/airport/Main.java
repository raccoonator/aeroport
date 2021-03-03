package ru.airport;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Bagadge> bagadge = new ArrayList<>();
        bagadge.add(new Bagadge("Slon", "economy", 10));
        bagadge.add(new Bagadge("Napoleon", "business", 30));
        bagadge.add(new Bagadge("Napoleon", "first", 50));
        bagadge.add(new Bagadge("Abdul", "economy", 20));
        bagadge.add(new Bagadge("Eduard", "business", 5));

        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (((Bagadge) o1).getMass() >((Bagadge) o2).getMass()) {
                    return 1;
                } else if (((Bagadge) o1).getMass() < ((Bagadge) o2).getMass()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        };
        bagadge.stream().sorted(comparator).forEach(x -> System.out.println(x));
        System.out.println(" ");
        comparator = (o1, o2) -> {
            if (((Bagadge) o1).getCarrierAndClass().length() >((Bagadge) o2).getCarrierAndClass().length()) {
                return 1;
            } else if (((Bagadge) o1).getCarrierAndClass().length() < ((Bagadge) o2).getCarrierAndClass().length()) {
                return -1;
            } else {
                return 0;
            }
        };
        bagadge.stream().sorted(comparator).forEach(x -> System.out.println(x));
    }
}
