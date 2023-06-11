package RentCar;

public class RepoFactory {
    public static SRepository createRepositoryInstance(RepoType type){
        if (type == RepoType.Car){
            return CarRepository.getInstance();
        }
        return null;
    }
}
