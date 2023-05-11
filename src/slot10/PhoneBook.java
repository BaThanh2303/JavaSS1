package slot10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PhoneBook extends Phone{
    public ArrayList<PhoneNumber> PhoneList = new ArrayList<PhoneNumber>();
    @Override
    public void insertPhone(String name, String phone) {
        for(PhoneNumber o : PhoneList){
            if(o.getName().equals(name)){
                if (o.getPhone().contains(phone)){
                    return;
                }
                o.getPhone().add(phone);
                return;
            }
        }
        //ra ngoài for chắc chắn không có name trùng.
        PhoneNumber pn = new PhoneNumber(name, Collections.singletonList(phone));
        PhoneList.add(pn);
        return;
    }

    @Override
    public void removePhone(String name) {
        for(PhoneNumber o : PhoneList){
            if(o.getName().equals(name)){
                PhoneList.remove(o);
                return;
            }
        }
    }

    @Override
    public void updatePhone(String name, String oldPhone, String newPhone) {
        for(PhoneNumber o : PhoneList) {
            if (o.getName().equals(name)) {
                if (o.getPhone().contains(oldPhone)) {
                    o.getPhone().remove(oldPhone);
                    o.getPhone().add(newPhone);
                    return;
                }
                return;
            }
        }
        return;
    }

    @Override
    public PhoneNumber searchPhone(String name) {
        for(PhoneNumber o : PhoneList){
            if(o.getName().equals(name)){
                return o;
            }
        }
        return null;
    }

    @Override
    public void sort() {
        int size = PhoneList.size();
        for (int i = 0; i < size - i - 1; i++){
            for (int j = 0; j < size - i - 1; j++){
                String name_pj = PhoneList.get(j).getName();
                String name_pj1 = PhoneList.get(j+1).getName();
                if (name_pj.compareTo(name_pj1) > 0){
                    PhoneNumber tmp = PhoneList.get(j);
                    PhoneList.add(j,PhoneList.get(j+1));
                    PhoneList.add(j+1,tmp);
                }
            }
        }
        Collections.sort(PhoneList, new Comparator<PhoneNumber>() {
            @Override
            public int compare(PhoneNumber o1, PhoneNumber o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }
}
