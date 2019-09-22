 package Entidades;

public class Empresa {
    int idEmpresa,idGiroComercial;
    String nombre, acronimo,descripcion, departamento,direccion,telefono,correo,
            contraseña;
    byte imPerfil;

    public int getIdEmpresa() {
        return idEmpresa; 
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public int getIdGiroComercial() {
        return idGiroComercial;
    }

    public void setIdGiroComercial(int idGiroComercial) {
        this.idGiroComercial = idGiroComercial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAcronimo() {
        return acronimo;
    }

    public void setAcronimo(String acronimo) {
        this.acronimo = acronimo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public byte getImPerfil() {
        return imPerfil;
    }

    public void setImPerfil(byte imPerfil) {
        this.imPerfil = imPerfil;
    }
    
    
}
