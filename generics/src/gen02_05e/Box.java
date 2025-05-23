package gen02_05e;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Boxable> {
    private List<T> items;

    public Box(){
        this.items = new ArrayList<>();
    }

    public void addItem(T t){
        this.items.add(t);
    }

    public T getLatestItem(){
        return this.items.get(items.size()-1);
    }

    public List<T> getItems() {
        return items;
    }

    public double getTotalWeight(){
        //return items.stream().mapToDouble(Boxable::getWeight).sum();
    	
    	double totalWeight = 0.0;
    	
    	for (T item:items) {
    		totalWeight += item.getWeight();
    	}
    	
    	return totalWeight;
    	
    }

    @Override
    public String toString() {
        return "Box{" +
                "items=" + items +
                '}';
    }
}
