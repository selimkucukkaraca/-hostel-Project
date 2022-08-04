package services;

import entity.Rooms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RoomsServiceImpl implements RoomsService {

    @Override
    public List<Rooms> createAndShowAll() {
        Rooms rooms1 = new Rooms("1", "1", "var", "bos");
        Rooms rooms2 = new Rooms("3", "2", "var", " 1 kiz");
        Rooms rooms3 = new Rooms("4", "3", "yok", " 2 erkek");
        Rooms rooms4 = new Rooms("6", "4", "var", " 1 kiz , 1 erkek");
        Rooms rooms5 = new Rooms("2", "5", "yok", " 2 kiz , 1 erkek");
        Rooms rooms6 = new Rooms("5", "5", "var", " 1 kiz , 3 erkek");

        ArrayList<Rooms> rooms = new ArrayList<>();
        rooms.add(rooms1);
        rooms.add(rooms2);
        rooms.add(rooms3);
        rooms.add(rooms4);
        rooms.add(rooms5);
        rooms.add(rooms6);


        return rooms;
    }

    public List<Rooms> rentRoom(String roomNumber) {

        List<Rooms> rooms = createAndShowAll();

        for (Rooms room : rooms) {
            if (room.getNumberOfPeople().equals(roomNumber)) {
                return Arrays.asList(room);

            }
        }
        return null;

    }


    public Rooms chooseRoom(String roomNumber) {
        Scanner scanner = new Scanner(System.in);
        List<Rooms> rooms = rentRoom(roomNumber);


        for (Rooms rooms1 : rooms) {
            System.out.println(rooms1.getFloor() + rooms1);

        }
        System.out.println("------------------------");
        System.out.println("odanin bulundugu floor'u secin : ");
        String room = scanner.nextLine();

        for (Rooms rooms1 : rooms) {
            if (room.equals(rooms1.getFloor())){
                System.out.println("odaniz hazirlaniyor iyi gunler dileriz...");
                return rooms1;
            }
        }
        System.out.println("secmis oldugunuz oda kriterlere uymamaktadir");
        return null;
    }
}
