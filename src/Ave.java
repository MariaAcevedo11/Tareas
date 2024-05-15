public class Ave {

    //Atributos
    //Encapsulamiento
    private static String color, tamano, especie;
    private static boolean vuela, comeCarne;

    //Constructor
    public Ave (String color, String tamano, String especie, boolean vuela, boolean comeCarne){

        this.color = color;
        this.tamano = tamano;
        this.especie = especie;
        this.vuela = vuela;
        this.comeCarne = comeCarne;
    }
    public void volar() {
        if (vuela) System.out.println("Vuela");
        else System.out.println("No vuela");
    }
    public void comeCarne(){

        if (comeCarne){
            System.out.println("Si come carne");
        } else {
            System.out.println("No come carne");
        }
    }

    //Getter´s

    public static String getColor() {
        return color;
    }

    public static String getTamano() {
        return tamano;
    }

    public static String getEspecie() {
        return especie;
    }

    public static boolean getComeCarne() {
        return comeCarne;
    }

    public static boolean getVuela() {
        return vuela;
    }
    //Setter´s


    public static void setColor(String color) {
        Ave.color = color;
    }

    public static void setTamano(String tamano) {
        Ave.tamano = tamano;
    }

    public static void setEspecie(String especie) {
        Ave.especie = especie;
    }

    public static boolean setVuela() {
        return vuela;
    }

    public static void setComeCarne(boolean comeCarne) {
        Ave.comeCarne = comeCarne;
    }
}