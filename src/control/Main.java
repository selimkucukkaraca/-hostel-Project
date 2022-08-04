package control;

import entity.Customer;
import entity.Rooms;
import services.CustomerServiceImpl;
import services.RoomsServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        Customer customer = new Customer();
        Scanner scanner = new Scanner(System.in);

        System.out.println("adinizi girin : ");
        String name = scanner.nextLine();

        System.out.println("soyadinizi girin : ");
        String lastName = scanner.nextLine();

        System.out.println("yasinizi girin : ");
        int age = scanner.nextInt();

        customer.setAge(age);
        customer.setFirstName(name);
        customer.setLastName(lastName);

        customerService.add(customer);


        RoomsServiceImpl roomsService = new RoomsServiceImpl();
        Rooms rooms = new Rooms();
        ArrayList<Rooms> rooms1 = new ArrayList<Rooms>();


        System.out.println(roomsService.createAndShowAll());

        //System.out.println("kacinci odayi secemek istiyorsunuz ? : ");
        //String roomNumber = scanner.nextLine(roomsService.chooseRoom());
        // choseRoom icine paramtetre bekledigi icin patladim RoomServiceImpl ten degistirmeye kalkinca karisti


        roomsService.chooseRoom("5");
        // buraya  5 yazdigim icin kullaniciya oda sayinisi sectiremiyorum direkt bastan 5.yi seciyo
        // sonra o 5. ekrana yazdiriliyo kiyaslama yaptiramiyorum









    }
}
