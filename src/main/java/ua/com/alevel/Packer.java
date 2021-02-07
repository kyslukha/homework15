package ua.com.alevel;

import java.util.List;

public class Packer {


    public static void main(String[] args) {

        Packer packer = new Packer();
        Box<Food> foodBox = new Box<>();
        Box<Cake> cakeBox = new Box<>();
        Box<Pie> pieBox = new Box<>();
        Box<Tart> tartBox = new Box<>();
        packer.repackage(foodBox, cakeBox);
        packer.repackage(foodBox, pieBox);
        packer.repackage(foodBox, tartBox);
    }

    public static <T extends Food> void repackage(Box<? super T> to, Box<? extends T> from) {
        to.put(from.get());
    }

}







