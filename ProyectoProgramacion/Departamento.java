import java.util.ArrayList;

class Departamento extends Hospital {
    String nombreDepartamento;
    ArrayList<String> nm = new ArrayList<>();

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public ArrayList<String> getNm() {
        return nm;
    }

    public void setNm(ArrayList<String> nm) {
        this.nm = nm;
    }

    public void agregarNombreStaff(String nombreStaff) {
        nm.add(nombreStaff);
    }

    public void eliminarNombreStaff(String nombreStaff) {
        nm.remove(nombreStaff);
    }
}