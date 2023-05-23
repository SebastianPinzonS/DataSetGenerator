package generator;

import java.util.List;

public class Main {
    
        public static void main(String[] args) {
        System.out.println("Generating hotel names...");
        List<String> hotelNames = HotelNameGenerator.generateHotelNames(1000);
        System.out.println("Hotel names generated: " + hotelNames.size());
        System.out.println(hotelNames);
        }

}
