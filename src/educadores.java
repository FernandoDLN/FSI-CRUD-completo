
import java.sql.*;

public class educadores {

    static String todos = "SELECT * FROM educadores ORDER BY nombree";
    static String curps = "SELECT curp FROM educadores ORDER BY curp";
    String curpe, nombree, sexoe, telefonoe, direccione, estadoe;

    public educadores() {

    }

    public educadores(String curpe, String nombree, String sexoe, String telefonoe, String direccion, String estadoe) {
        this.curpe = curpe;
        this.nombree = nombree;
        this.sexoe = sexoe;
        this.telefonoe = telefonoe;
        this.direccione = direccion;
        this.estadoe = estadoe;
    }

    public int insertar(Connection con) {
        int resultado = 0;
        try {
            String sql = "INSERT INTO educadores VALUES(?, ?, ?, ?, ?, ?)"; // 6 signos '?'
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, curpe);
            ps.setString(2, nombree);
            ps.setString(3, sexoe);
            ps.setString(4, telefonoe);
            ps.setString(5, direccione);
            ps.setString(6, estadoe);

            return ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            return resultado;
        }
    }

    public int borrar(Connection con) {
        int resultado = 0;
        try {
            String sql = "DELETE FROM educadores WHERE curp = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, curpe);
            return ps.executeUpdate();

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            return resultado;
        }
    }

    public int actualizar(Connection con) {
        int resultado = 0;
        try {
            String sql = "UPDATE educadores SET nombree = ?, sexoe = ?, telefonoe = ?, direccion = ?, estadoe = ? WHERE curp = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombree);
            ps.setString(2, sexoe);
            ps.setString(3, telefonoe);
            ps.setString(4, direccione);
            ps.setString(5, estadoe);
            ps.setString(6, curpe);

            return ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            return resultado;
        }
    }

}
