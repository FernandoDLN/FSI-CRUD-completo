
import java.sql.*;

public class bitacora {

    static String todos = "SELECT * FROM bitacora ORDER BY folio DESC";
    String folio, tiempo, tipo, observaciones, infante_curp, responsables_curpr, educadores_curp;

    public bitacora() {

    }

    public bitacora(String folio, String tiempo, String tipo, String observaciones, String infante_curp, String responsables_curpr, String educadores_curp) {
        this.folio = folio;
        this.tiempo = tiempo;
        this.tipo = tipo;
        this.observaciones = observaciones;
        this.infante_curp = infante_curp;
        this.responsables_curpr = responsables_curpr;
        this.educadores_curp = educadores_curp;
    }

public int insertar(Connection con) {
    int resultado = 0;
    try {
       
        String sql = "INSERT INTO bitacora VALUES(null, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, tiempo);
        ps.setString(2, tipo);
        ps.setString(3, observaciones);
        ps.setString(4, infante_curp);
        ps.setString(5, responsables_curpr);
        ps.setString(6, educadores_curp);

        return ps.executeUpdate();
    } catch (Exception e) {
        System.out.println("ERROR: " + e.getMessage());
        return resultado;
    }
}

    public int borrar(Connection con) {
        int resultado = 0;
        try {
            String sql = "DELETE FROM bitacora WHERE folio = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, folio);
            return ps.executeUpdate();

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            return resultado;
        }

    }

    public int actualizar(Connection con) {
        int resultado = 0;
        try {
            String sql = "UPDATE bitacora SET tiempo = ?, tipo = ?, observaciones = ?, infantes_curp = ?, responsables_curpr = ?, educadores_curp = ? WHERE folio = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, tiempo);
            ps.setString(2, tipo);
            ps.setString(3, observaciones);
            ps.setString(4, infante_curp);
            ps.setString(5, responsables_curpr);
            ps.setString(6, educadores_curp);
            ps.setString(7, folio);

            return ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            return resultado;
        }
    }

}
