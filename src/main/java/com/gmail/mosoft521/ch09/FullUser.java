package com.gmail.mosoft521.ch09;

public class FullUser implements Comparable {
    public static final int TYPE = 1;

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) throws IllegalStateException {
        try {
            this.id = id;
        } catch (IllegalStateException e) {
            System.out.println(e.toString());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        Comparable c = this;
        c.compareTo(o);
        return 0;
    }
}
