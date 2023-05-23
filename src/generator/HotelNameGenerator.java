package generator;

import java.util.ArrayList;
import java.util.List;

public class HotelNameGenerator {
  
    public static List<String> generateHotelNames(int count) {
        List<String> hotelNames = new ArrayList<>();
        
        // Palabras clave para generar nombres de hotel
        String[] adjectives = {"Arrayanes", "Palmas", "Palmeras","Cocos", "Cedros", "Robles", "Pinos", "Cerezos", "Naranjos", "Olivos", "Manza", "Albaricoque", "Olas", "Mar", "Playa", "Sol", "Arena", "Montaña", "Bosque", "Lago", "Río", "Cascada", "Volcán", "Cueva", "Coral", "Cristal", "Diamante", "Esmeralda", "Rubí", "Zafiro", "Perla", "Oro", "Plata", "Platino", "Bronce", "Hierro", "Acero", "Cobre", "Titanio", "Aluminio", "Níquel", "Mercurio", "Plomo", "Estaño", "Zinc", "Madera", "Piedra", "Ladrillo", "Cemento", "Cerámica", "Vidrio", "Plástico", "Tela", "Cuero", "Papel", "Cartón", "Caucho", "Hule", "Lana", "Seda", "Algodón", "Lino", "Coral", "Cristal", "Diamante", "Esmeralda", "Rubí", "Zafiro", "Perla", "Oro", "Plata", "Platino", "Lana", "Seda", "Algodón", "Alegria"};
        String[] nouns = {"Hotel", "Resort", "Posada", "Mansion", "Parador", "Hospedaje","Casa","Condominio","Villa","Campamento","Cabaña"};
        
        for (int i = 0; i < count; i++) {
            // Generar un nombre de hotel aleatorio
            String adjective = adjectives[(int) (Math.random() * adjectives.length)];
            String noun = nouns[(int) (Math.random() * nouns.length)];
            String hotelName = noun + " " + adjective;
            if (hotelNames.contains(hotelName)) {
                i--;
            } else{
                hotelNames.add(hotelName);
            }
            
        }
        
        return hotelNames;
    }
}
