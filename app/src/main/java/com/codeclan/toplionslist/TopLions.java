package com.codeclan.toplionslist;


import java.util.ArrayList;

public class TopLions {

    private ArrayList<Lion> list;

    public TopLions() {
        list = new ArrayList<Lion>();
        list.add(new Lion(1, "Mako Vunipola", 1994));
        list.add(new Lion(2, "Rory Best", 1980));
        list.add(new Lion(3, "Jamie George", 1974));
        list.add(new Lion(4, "Alun Wyn Jones", 1988));
        list.add(new Lion(5, "Courtney Lawes", 1987));
        list.add(new Lion(6, "CJ Stander", 1993));
        list.add(new Lion(7, "Sam Warburton", 1994));
        list.add(new Lion(8, "Billy Vunipola", 1993));
        list.add(new Lion(9, "Conor Murray", 1976));
        list.add(new Lion(10, "Jonathan Sexton", 1989));
        list.add(new Lion(11, "Elliot Daly", 1999));
        list.add(new Lion(12, "Owen Farrell", 1980));
        list.add(new Lion(13, "Robbie Henshaw", 1994));
        list.add(new Lion(14, "Jack Nowell ", 1990));
        list.add(new Lion(15, "Liam Williams", 1992));
        list.add(new Lion(16, "Dan Cole", 1985));
        list.add(new Lion(17, "George Kruis", 1980));
        list.add(new Lion(18, "Peter O'Mahony", 1989));
        list.add(new Lion(19, "Jonathan Joseph ", 1984));
        list.add(new Lion(20, "Stuart Hogg", 1987));
    }

    public ArrayList<Lion> getList() {
        return new ArrayList<Lion>(list);
    }

}
