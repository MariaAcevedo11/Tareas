public class Main {
    public static void main(String[] args) {

        //Ave 1
        Ave gallina = new Ave("Negra", "Grande", "Gallina", false, false);

        System.out.println("\nCaracteristicas de la Gallina: ");
        System.out.println("Color: " + gallina.getColor());
        System.out.println("Tamaño: " + gallina.getTamano());
        System.out.println("Especie: " + gallina.getEspecie());
        gallina.volar();
        gallina.comeCarne();

        //Ave 2
        Ave halcon = new Ave("Blanca", "Enorme", "Pechirrojo", true, true);

        System.out.println("\nCarácteristicas del Halcón: ");
        System.out.println("Color: " + halcon.getColor());
        System.out.println("Tamaño: " + halcon.getTamano());
        System.out.println("Especie: " + halcon.getEspecie());
        halcon.volar();
        halcon.comeCarne();

        //Ave 3
        Ave colibri = new Ave("Azul", "Pequeño", "Zumbador", true, false);
        System.out.println("\nCarácteristicas del Colibrí: ");
        System.out.println("Color: " + colibri.getColor());
        System.out.println("Tamaño: " + colibri.getTamano());
        System.out.println("Especie: " + colibri.getEspecie());
        colibri.volar();
        colibri.comeCarne();

        //Ave 4
        Ave pato = new Ave("Blanco", "Muy Pequeño", "Anatinae", false, false);
        System.out.println("\nCaracteristicas del Pato");
        System.out.println("Color: " + pato.getColor());
        System.out.println("Tamaño: " + pato.getTamano());
        System.out.println("Especie: " + pato.getEspecie());
        pato.volar();
        pato.comeCarne();

        //Ave 5
        Ave guacamaya = new Ave("Multicolor", "Mediano", "Bandera", true, false);
        System.out.println("\nCaracteristicas de la Guacamaya: ");
        System.out.println("Color: " + guacamaya.getColor());
        System.out.println("Tamaño: " + guacamaya.getTamano());
        System.out.println("Especie: " + guacamaya.getEspecie());
        guacamaya.volar();
        guacamaya.comeCarne();

        //Herencia
        Aguila aguila = new Aguila("Negra y blanca", "Enorme", "Pico Amarillo", true, true);
        System.out.println("\nCaracteristicas del Aguila: ");
        System.out.println("Color: " + aguila.getColor());
        System.out.println("Tamaño: " + aguila.getTamano());
        System.out.println("Especie: " + aguila.getEspecie());
        //Polimorfismo
        aguila.volar();
        aguila.comeCarne();
    }
}