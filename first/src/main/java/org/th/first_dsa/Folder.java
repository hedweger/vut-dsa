package org.th.first_dsa;

import java.util.Vector;

public class Folder {
    public String name;
    public Vector<Folder> subfolder;

    Folder(String name) {
        this.name = name;
        this.subfolder = new Vector<>(2);
    }

}
