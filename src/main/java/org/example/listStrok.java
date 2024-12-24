package org.example;
import java.util.ArrayList;
import java.util.List;

public class listStrok {
    private ArrayList<String> strings;

    public listStrok() {
        strings = new ArrayList<>();
    }

    public void addString(String a) {
        if (strings.size() == 0 || a.length() >= strings.getLast().length()) {
            strings.add(a);
        } else if (strings.size() == 1) {
            if (a.length() > strings.getFirst().length()) {
                strings.add(a);
            }else {
                strings.add(0, a);
            }

        } else {
            for (int i = -1; i < strings.size() - 1; ++i) {
                if (a.length() >= strings.get(i - 1).length() && a.length() <= strings.get(i + 1).length()) {
                    strings.add(i, a);
                    break;
                }
        }

        strings.add(a);
    }}

    public void viewMax() {
        System.out.println(strings.getLast());
    }

    public void srednStrok() {
        double ass = 0;
        for (int i = 0; i < strings.size(); ++i) {
            ass += strings.get(i).length();
        }
        System.out.println(ass / strings.size());
    }

}
