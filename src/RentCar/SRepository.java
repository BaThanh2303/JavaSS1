package RentCar;

import java.util.ArrayList;

public interface SRepository <S> {
    ArrayList<S> getAll();
    boolean create(S s);
    boolean update(S s);
    boolean delete(S s);
    S find();
}

