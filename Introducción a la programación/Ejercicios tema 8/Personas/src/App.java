public class App {
    public static void main(String[] args) throws Exception {
        Personas personas=new Personas();
        personas.setEdad(15);
        personas.setNombre("Angel");
        personas.setTelefono("2222-2222");
        System.out.println(personas.getEdad());
        System.out.println(personas.getNombre());
        System.out.println(personas.getTelefono());
    }
}


class Personas{
    private int edad;
    private String nombre;
    private String telefono;

    public void setEdad( int edad){
        this.edad=edad;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getNombre(){
        return this.nombre;
    }


    public void setTelefono(String telefono){
        this.telefono=telefono;
    }

    public String getTelefono(){
        return this.telefono;
    }

}
