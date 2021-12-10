package uaslp.objetos.escuela;

import java.time.LocalDate;

public class Alumno{
    private String nombre;
    private String clave;
    private String claveDeCarrera;
    private int anioDeIngreso;
    private LocalDate fechaNacimiento;

    public static AlumnoBuilder builder(){
        AlumnoBuilder alumnoBuilder=new AlumnoBuilder();
        return alumnoBuilder;
    }

    public String getNombre() {
        return nombre;
    }

    public String getClave() {
        return clave;
    }

    public String getClaveDeCarrera() {
        return claveDeCarrera;
    }

    public int getAnioDeIngreso() {
        return anioDeIngreso;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public Alumno build(){
        AlumnoBuilder alumnoBuilder = builder();
        Alumno alumno = new Alumno();
        alumno.nombre= alumnoBuilder.nombre;
        alumno.clave= alumnoBuilder.clave;
        alumno.claveDeCarrera= alumnoBuilder.claveDeCarrera;
        alumno.anioDeIngreso= alumnoBuilder.anioDeIngreso;
        alumno.fechaNacimiento= alumnoBuilder.fechaNacimiento;
        return alumno;
    }

    public static class AlumnoBuilder implements Builder{
        private String nombre;
        private String clave;
        private String claveDeCarrera;
        private int anioDeIngreso;
        private LocalDate fechaNacimiento;


        public AlumnoBuilder nombre(String nombre){
            this.nombre=nombre;
            return this;
        }

        public AlumnoBuilder clave(String clave){
            this.clave=clave;
            return this;
        }

        public AlumnoBuilder claveDeCarrera(String claveDeCarrera){
            this.claveDeCarrera=claveDeCarrera;
            return this;
        }

        public AlumnoBuilder anioDeIngreso(int anioDeIngreso){
            this.anioDeIngreso=anioDeIngreso;
            return this;
        }

        public AlumnoBuilder fechaNacimiento(LocalDate fechaNacimiento){
            this.fechaNacimiento=fechaNacimiento;
            return this;
        }
        public Alumno build(){
            Alumno alumno = new Alumno();
            alumno.nombre= this.nombre;
            alumno.clave= this.clave;
            alumno.claveDeCarrera= this.claveDeCarrera;
            alumno.anioDeIngreso= this.anioDeIngreso;
            alumno.fechaNacimiento= this.fechaNacimiento;
            return alumno;
        }
    }
}
