package datapackage;

import java.io.Serializable;

public class Data implements Serializable {

    int attack;
    byte[] img;


    public int getAttack() {
        return attack;
    }

    public void setAttack(int num) {
        this.attack = num;
    }

    public byte[] getImg() {
        return img;
    }


    public void setImg(byte[] img) {
        this.img = img;
    }


}