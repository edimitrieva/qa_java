package com.example;

import java.util.List;

public class Alex extends Lion{


    public Alex(Feline feline) throws Exception {
        super("Самец", feline);
    }

    @Override
    public int getKittens(){
        return 0;
    }

    public List<String> getFriends(){
        List<String> friends = List.of("Марти", "Глория", "Мелман");
        return friends;
    }

   public String getPlaceOfLiving(){
        return "Нью-Йоркский зоопарк";
   }
}
