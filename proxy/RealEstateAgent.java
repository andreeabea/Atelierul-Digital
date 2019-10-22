package proxy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RealEstateAgent {
    Apartment[] app= new Apartment[0];
    void represent(Apartment appartment)
    {
        this.app= Arrays.copyOf(this.app,this.app.length);
        this.app[this.app.length-1]=appartment;
    }
    @Nullable
    Apartment rent(Student student)
    {
        Apartment rentApp=null;
        if(!student.name.startsWith("P"));
        for(int i=0;i<app.length;i++)
        {
            if(this.app[i].getMonthlyRentCost()<student.getMoney())
            {
                rentApp=this.app[i];
                int removeIndex =i;
                //System.arraycopy(this.app,removeIndex+1,this.app,this.app.length-1);
            }
        }
        return rentApp;
    }

}
