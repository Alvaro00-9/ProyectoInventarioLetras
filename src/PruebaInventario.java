public class PruebaInventario {
    public static void main(String[] args) {

        System.out.println("PRUEBAS DEL DOCUMENTO");
        InventarioLetras inv = new InventarioLetras("Hola Mundo");

        System.out.println("size: " + inv.size());
        System.out.println("isEmpty: " + inv.isEmpty());
        System.out.println("get('o'): " + inv.get('o'));
        System.out.println("Letras guardadas en orden: " + inv);

        System.out.println("EncriptadoCesar: " + inv.encriptarCesar('a'));
        System.out.println("EncriptadoPalabra: " + inv.encriptarPalabra("play", 3));

        System.out.println("DesencriptadoCesar: " + inv.desencriptarCesar('d'));
        System.out.println("DesencriptadoPalabra: " + inv.desencriptarPalabra("sodb", 3));

        InventarioLetras inv1 = new InventarioLetras("Alan Turing");
        InventarioLetras inv2 = new InventarioLetras("Ada Lovelace");
        InventarioLetras suma = inv1.add(inv2);

        System.out.println("Suma de inventarios: " + suma);

        inv.set('h', 5);
        System.out.println("Set: " + inv);

        InventarioLetras resta = inv1.subtract(new InventarioLetras("Alan"));
        System.out.println("Resta: " + resta);

        InventarioLetras multi = inv2.amplifies(2);
        System.out.println("Multiplicar: " + multi);


        System.out.println("DEMOSTRACIÓN PROPIA ");
        InventarioLetras word = new InventarioLetras("Juan Perez");
        InventarioLetras word2 = new InventarioLetras("Maria Gonzalez");

        System.out.println("Inventario Juan: " + word);
        System.out.println("Inventario Maria: " + word2);

        InventarioLetras sumaGrupos = word.add(word2);
        System.out.println("Todos los caracteres reunidos: " + sumaGrupos);

        String palabradePrueba = "programacion";
        String palabraSecret = word.encriptarPalabra(palabradePrueba, 4);
        System.out.println("Palabra cifrada (desp. 4): " + palabraSecret);
        System.out.println("Palabra descifrada: " + word.desencriptarPalabra(palabraSecret, 4));
    }
}
///Inicio de Subida de Commits

//Primer Commit a Realizar (Dentro de las explicaciones)
//Segundo Comiit

