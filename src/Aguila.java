class Aguila extends Ave {
    public Aguila(String color, String tamano, String especie, boolean vuela, boolean comeCarne) {
        super(color, tamano, especie, vuela, comeCarne);
    }

    @Override //Polimorfismo en clase Ave
    public void volar() {
        System.out.println("El águila vuela más alto que todos.");
    }

    @Override //Polimorfismo en clase Ave
    public void comeCarne() {
        System.out.println("El águila come más carne que todos.");
    }
}