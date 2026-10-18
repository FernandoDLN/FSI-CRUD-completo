
import java.sql.*;

public class responsables {

    static String todos = "SELECT * FROM responsables ORDER BY nombrer";
    static String curps = "SELECT curpr FROM responsables ORDER BY curpr";
    String curpr, nombrer, sexor, telefono, parentesco, estador;

    public responsables() {

    }

    public responsables(String curpr, String nombrer, String sexor, String telefono, String parentesco, String estador) {
        this.curpr = curpr;
        this.nombrer = nombrer;
        this.sexor = sexor;
        this.telefono = telefono;
        this.parentesco = parentesco;
        this.estador = estador;
    }

    public int insertar(Connection con) {
        int resultado = 0;
        try {
            String sql = "INSERT INTO responsables VALUES(?, ?, ?, ?, ?, ?)"; // 6 signos '?'
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, curpr);
            ps.setString(2, nombrer);
            ps.setString(3, sexor);
            ps.setString(4, telefono);
            ps.setString(5, parentesco);
            ps.setString(6, estador);

            return ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            return resultado;
        }
    }

    public int borrar(Connection con) {
        int resultado = 0;
        try {
            String sql = "DELETE FROM responsables WHERE curpr = ?"; // Corregido 'curp' por 'curpr'
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, curpr);
            return ps.executeUpdate();

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            return resultado;
        }
    }

    public int actualizar(Connection con) {
        int resultado = 0;
        try {
            String sql = "UPDATE responsables SET nombrer = ?, sexor = ?, telefono = ?, parentesco = ?, estador = ? WHERE curpr = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombrer);
            ps.setString(2, sexor);
            ps.setString(3, telefono);
            ps.setString(4, parentesco);
            ps.setString(5, estador);
            ps.setString(6, curpr); // El parámetro 6 corresponde al WHERE curpr = ?

            return ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            return resultado;
        }
    }

}
