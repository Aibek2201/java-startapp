package com.javastart.inheritance;

public class British extends Cat {

    private String name;

    public British(int age, String owner, String name) {
        super(age, owner);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cat name: " + name + " Age: " + getAge() + " Owner: " + getOwner();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (getClass() == o.getClass()) {
            British outsideBritish = (British) o;
            return name.equals(outsideBritish.getName())
                    && getAge() == outsideBritish.getAge()
                    && getOwner().equals(outsideBritish.getOwner());
        }
        return false;
    }
}
