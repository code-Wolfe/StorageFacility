import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {

    private final HashMap<String, ArrayList<String>> store;

    public StorageFacility(){
        store = new HashMap<>();
    }

    public void add(String unit, String item){
        store.putIfAbsent(unit, new ArrayList<>());

        if(store.containsKey(unit)){
            store.get(unit).add(item);
        }

    }

    public ArrayList<String> contents(String storageUnit){
        if(store.containsKey(storageUnit)){
            return store.get(storageUnit);
        } else{
            return new ArrayList<>();
        }
    }

    public void remove(String storageUnit, String item){


        store.get(storageUnit).remove(item);
        if (store.get(storageUnit).isEmpty()){
            store.remove(storageUnit);
        }


    }
    public ArrayList<String> storageUnits(){
        ArrayList<String> rList = new ArrayList<>();
        for(String s : store.keySet()){
            if(!(store.get(s).isEmpty())){
                rList.add(s);
            }
        }

        return rList;

    }


}