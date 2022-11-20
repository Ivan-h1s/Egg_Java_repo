package Entidad;

public class Persona {
    
    private String nombre;
    private int edad;
    private String sexo;
    private float peso;
    private float altura;
            
    public Persona() {
    }
    
    public Persona(String nombre, int edad, String sexo, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        if(sexo.equals("H") || sexo.equals("M") || sexo.equals("O")) {
            this.sexo = sexo;   
        }        
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    } 

    @Override
    public String toString() {
        String sex= "";
        switch (sexo) {
            case "H":
                sex = "Hombre";
                break;
            case "M":
                sex = "Mujer";
                break;
            case "O":
                sex = "Otro";
                break;
            default:
                break;
        }
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sex + ", peso=" + peso + ", altura=" + altura + '}';
    }      
}