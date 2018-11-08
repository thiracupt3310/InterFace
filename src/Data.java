import java.util.Collection;

public class Data {

    public double avarage(Collection<Measurable> collection){
        double sum = 0;
        for (Measurable data : collection ) {
            sum += data.getMeasure();
        }
        return sum/collection.size();
    }
    public double average(Collection<?> collection, Measuror measuror){
        double sum = 0;
        for (Object obj : collection){
            sum += measuror.measure(obj);
        }
        return sum / collection.size();
    }
}
