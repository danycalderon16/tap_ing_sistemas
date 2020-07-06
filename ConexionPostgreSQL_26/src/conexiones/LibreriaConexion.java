package conexiones;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import static javax.swing.JOptionPane.showMessageDialog;

public class LibreriaConexion {
    
    //Atributos de clase
    private String url="";
    private Connection conexion;
    private Statement consulta;
    private boolean valido;
    private String host;
    private String port;
    private String basedatos;
    private String usuario;
    private String password;

    public LibreriaConexion(String host, String port, String basedatos, String usuario, String password) {
        url = "";
        conexion = null;
        consulta = null;
        valido = false;
        
        this.host = host;
        this.port = port;
        this.basedatos = basedatos;
        this.usuario = usuario;
        this.password = password;
    }
     
    public void conectarBaseDatos() {
        String url = "";
        try {
            try {
                Class.forName("org.postgresql.Driver");
            } catch (ClassNotFoundException ex) {
                showMessageDialog(null, "Error al registrar el drivernde PostgreSQL: ");
            }
            url = "jdbc:postgresql://" + host + ":" + port + "/" + basedatos;
            //Conectar base de datos
            conexion = DriverManager.getConnection(
                    url,
                    usuario,
                    password);
            valido = conexion.isValid(50000);
        } catch (java.sql.SQLException sqle) {
            showMessageDialog(null,"Error al conectar con la base de datoa de PostgreSQL (" + url + "):" + sqle.toString());
        }
    }
    
    public void insertarEntidad(int idIdentidad, String nombre, int idPais){
        try {
            if (valido) {
                consulta = (Statement) conexion.createStatement();                
                consulta.executeUpdate("INSERT INTO ENTIDAD VALUES ("+idIdentidad+",'"+nombre+"',"+idPais+")");
                showMessageDialog(null, "Se ha insertado Correctamente la editad: "+nombre);
            }
        } catch (SQLException sqle) {
            showMessageDialog(null, "Error al <INSERTAR> en <ENTIDAD> "+sqle);
        }
    }
    
    public void insertarLugarTuristio(int id, String nombre, char tipo, String descripcion,String codigo,int idMT){
        try {
            if (valido) {
                consulta = (Statement) conexion.createStatement();                
                consulta.executeUpdate("INSERT INTO LUGARTURISTICO VALUES ("+id+",'"+nombre+"','"+
                        tipo+"','"+descripcion+"',"+codigo+","+idMT+")");
                showMessageDialog(null, "Se ha insertado Correctamente el lugar: "+nombre);
            }
        } catch (SQLException sqle) {
            showMessageDialog(null, "Error al <INSERTAR> en <LUGARTURISTICO> "+sqle);
        }
    }
    
    public void insertarMarcaTuristia(int id, String nombre){
        try {
            if (valido) {
                consulta = (Statement) conexion.createStatement();                
                consulta.executeUpdate("INSERT INTO MARCATURISTICA VALUES ("+id+",'"+nombre+"');");
                showMessageDialog(null, "Se ha insertado Correctamente la marca: "+nombre);
            }
        } catch (SQLException sqle) {
            showMessageDialog(null, "Error al <INSERTAR> en <MARCATURISTICA> "+sqle);
        }
    }
    
    public void insertarPais(int idPais, String nombrePais){
        try{
            if(valido){
                consulta = (Statement) conexion.createStatement();
                consulta.executeUpdate("INSERT INTO PAIS VALUES ("+idPais+",'"+nombrePais+"')");
                showMessageDialog(null, "Se ha INSERTADO CORRECTAMNTE! <26 DANIEL ALJEANDRO CALDERÓN VIRGEN>");
            }else
                showMessageDialog(null, "Se ha perdido la conexión");
        }catch(SQLException sqle){
            showMessageDialog(null, "Error al <INSERTAR> en <PAIS> "+sqle);
        }
            
    }
    
    public void insertarPoblacion(int idpoblacion, String nombre, int idPais,int idMT){
        try {
            if (valido) {
                consulta = (Statement) conexion.createStatement();                
                consulta.executeUpdate("INSERT INTO POBLACION VALUES ("+idpoblacion+",'"+nombre+"',"+idPais+","+idMT+")");
                showMessageDialog(null, "Se ha insertado Correctamente la población: "+nombre);
            }
        } catch (SQLException sqle) {
            showMessageDialog(null, "Error al <INSERTAR> en <POBLACION> "+sqle);
        }
    }
    
    public void insertarRol(int idRol, String rol){
         try{
             if(valido){
                 consulta = (Statement) conexion.createStatement();
                 consulta.executeUpdate("INSERT INTO ROL VALUES ("+idRol+",'"+rol+"')");
                 showMessageDialog(null, "Se ha INSERTADO CORRECTAMNTE el ROL"+rol);
             }else
                 showMessageDialog(null, "Se ha perdido la conexión");
         }catch(SQLException sqle){
             showMessageDialog(null, "Error al <INSERTAR> en <ROL> "+sqle);
         }

    }
    
    public void insertarTurista(int id, String nombre, String correoE, String pass,int idPais){
        try{
            if(valido){
                consulta = (Statement) conexion.createStatement();
                consulta.executeUpdate("INSERT INTO TURISTA VALUES ("+id+",'"+nombre+"','"+correoE+
                        "','"+pass+"',"+idPais+");");
                showMessageDialog(null, "Se ha INSERTADO correctamente el Turista: "+nombre);
            }else
                showMessageDialog(null, "Se ha perdido la conexión");
        }catch(SQLException sqle){
            showMessageDialog(null, "Error al <INSERTAR> EN <TURISTA> "+sqle);
        }
    }
    
    public void insertarUsuarioSistema(int id, String nombreU, String nombreCompleto, char vigente, String contrato,int idRol){
        try{
            if(valido){
                consulta = (Statement) conexion.createStatement();
                consulta.executeUpdate("INSERT INTO USUARIOSISTEMA VALUES ("+id+",'"+nombreU+"','"+nombreCompleto+
                        "','"+vigente+"','"+contrato+"',"+idRol+");");
                showMessageDialog(null, "Se ha INSERTADO correctamente el USUARIOSISTEMA: "+nombreU);
            }else
                showMessageDialog(null, "Se ha perdido la conexión");
        }catch(SQLException sqle){
            showMessageDialog(null, "Error al <INSERTAR> EN <USUARIOSISTEMA> "+sqle);
        }
    }
    
    public void insertarVisita(String fecha,String comentarios, int idTurista, int idLT){
        try{
            if(valido){
                consulta = (Statement) conexion.createStatement();
                consulta.executeUpdate("INSERT INTO VISITA VALUES ('"+fecha+"','"+comentarios+"',"+idTurista+
                        ","+idLT+");");
                showMessageDialog(null, "Se ha INSERTADO correctamente el VISITA : "+fecha);
            }else
                showMessageDialog(null, "Se ha perdido la conexión");
        }catch(SQLException sqle){
            showMessageDialog(null, "Error al <INSERTAR> EN <VISITA> "+sqle);
        }
    }
    
    public ResultSet getTablaPais(String consulta){
        Statement sentencia;
        ResultSet datos = null;
        if(valido){
            try{
                sentencia = conexion.createStatement();
                datos = sentencia.executeQuery(consulta);
            }catch(SQLException sql){
                showMessageDialog(null,"Erroe en la consulta: "+ sql.toString());
            }        
        }else
             showMessageDialog(null, "Se ha perdido la conexion. Verifique con el administrador");
        return datos;
    }
    
    public ArrayList<LlavesForaneas> obtenerLlavesForaneas(String fk,String nombre,String table) {
        try {
            consulta = conexion.createStatement();
            String sql = "Select * From "+table+";";
            ResultSet datoSelect;
            datoSelect = consulta.executeQuery(sql);
            ArrayList<LlavesForaneas> listaConsulta = new ArrayList<>();
            while (datoSelect.next()) {
                listaConsulta.add(new LlavesForaneas(datoSelect.getInt(fk), datoSelect.getString(nombre)));
            }
            return listaConsulta;
        } catch (SQLException sQLException) {
            showMessageDialog(null, "ERRROR: "+sQLException);
        }
        return null;
    }
    
}
    
    