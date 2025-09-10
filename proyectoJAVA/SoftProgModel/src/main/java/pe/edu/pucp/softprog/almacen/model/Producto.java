package pe.edu.pucp.softprog.almacen.model;

public class Producto {
    private int idProducto;
    private String nombre;
    private String unidadMedida;
    private double recio;
    private boolean activo;

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public double getRecio() {
        return recio;
    }

    public void setRecio(double recio) {
        this.recio = recio;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
}
