package daopattern;

import database.Connector;
import javafx.Student;
import javafx.scene.control.Alert;
import quanlylophoc.LopHoc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ClassRepository implements IRepository<LopHoc>{
    private static ClassRepository instance;
    private ClassRepository(){

    }
    public static ClassRepository getInstance(){
        if(instance == null){
            instance = new ClassRepository();
        }
        return instance;
    }
    @Override
    public ArrayList<LopHoc> getAll() {
        ArrayList<LopHoc> lopHocs = new ArrayList<>();
        try {
            Connection conn = Connector.getInstance().getConn();
            Statement stt = conn.createStatement();
            String sql = "select * from classrooms";
            ResultSet rs = stt.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String room = rs.getString("room");
                LopHoc lp = new LopHoc(id, name, room);
                lopHocs.add(lp);
            }
        } catch (Exception e) {
            System.out.println("error" + e.getMessage());
        }
        return lopHocs;
    }

    @Override
    public Boolean create(LopHoc lp) {
        try {
            Connection conn = Connector.getInstance().getConn();
            String sql = "insert into classrooms(name,room) values(?,?)";
            PreparedStatement stt = conn.prepareStatement(sql);
            stt.setString(1,lp.getTenLop());
            stt.setString(2,lp.getPhongHoc());
            stt.executeUpdate();
        }catch (Exception e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText(e.getMessage());
            alert.show();
        }
        return false;
    }

    @Override
    public Boolean update(LopHoc lopHoc) {
        try {
            Connection conn = Connector.getInstance().getConn();
            String sql = "update classrooms set name=?,room=? where id=?";
            PreparedStatement stt = conn.prepareStatement(sql);
            stt.setInt(1,lopHoc.getId());
            stt.setString(2,lopHoc.getTenLop());
            stt.setString(3,lopHoc.getPhongHoc());
            stt.executeUpdate();
            return true;
        }catch (Exception e){

        }
        return false;
    }

    @Override
    public Boolean delete(LopHoc lp) {
        try {
            Connection conn = Connector.getInstance().getConn();
            String sql = "delete from classrooms where id=?";
            PreparedStatement stt = conn.prepareStatement(sql);
            stt.setInt(1,lp.getId());
            stt.executeUpdate();
            return true;
        }catch (Exception e){

        }
        return false;
    }

    @Override
    public LopHoc find(Integer id) {
        ArrayList<LopHoc> lopHocs = new ArrayList<>();
        try {
            Connection conn = Connector.getInstance().getConn();
            Statement stt = conn.createStatement();
            String sql = "select * from classrooms where id=?";
            ResultSet rs = stt.executeQuery(sql);

            while (rs.next()) {
                int lp_id = rs.getInt("id");
                String name = rs.getString("name");
                String room = rs.getString("room");
                LopHoc lp = new LopHoc(lp_id, name, room);
                lopHocs.add(lp);
            }
        } catch (Exception e) {
            System.out.println("error" + e.getMessage());
        }
        return null;
    }


}
