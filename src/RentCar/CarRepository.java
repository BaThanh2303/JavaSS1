package RentCar;

import database.Connector;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class CarRepository implements SRepository{
    private static CarRepository instance;
    private CarRepository(){

    }
    public static CarRepository getInstance(){
        if (instance == null){
            instance = new CarRepository();
        }
        return instance;
    }
    @Override
    public ArrayList<Car> getAll() {
        ArrayList<Car> cars = new ArrayList<>();
        try {
            Connection conn = Connector.getInstance().getConn();
            String sql = "select * from car";
            Statement stt = conn.createStatement();
            ResultSet rs = stt.executeQuery(sql);
            while (rs.next()){
                int id = rs.getInt("car_id");
                String brand = rs.getString("brand");
                String model = rs.getString("model");
                Double price = rs.getDouble("price");
                String status = rs.getString("status");
                Date date = rs.getDate("date");
                Car car = new Car(id,brand,model,price,status,date);
                cars.add(car);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return cars;
    }

    @Override
    public boolean create(Object o) {
        return false;
    }

    @Override
    public boolean update(Object o) {
        return false;
    }

    @Override
    public boolean delete(Object o) {
        return false;
    }

    @Override
    public Object find() {
        return null;
    }
}
