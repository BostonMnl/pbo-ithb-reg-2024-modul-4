package modul4.main;

import java.util.ArrayList;

import modul4.view.ViewAll;
import modul4.model.classes.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<User> user = Dummy.dummyData();

        ViewAll.showMenu(user);
    }
}
