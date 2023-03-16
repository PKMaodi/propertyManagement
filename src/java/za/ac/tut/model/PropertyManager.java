package za.ac.tut.model;

/**
 *
 * @author MemaniV
 */
public class PropertyManager implements PropertyManagerInterface {
    private static final String[] AREAS = {"GARANKUWA", "SOSHANGUVE", "MABOPANE"};
    private static final String[] AREA_CODES = {"GA", "SO", "MA"}; 
    private static final String[] MONTH_CODES = {"JAN", "FEB", "MAR"};
    private static final Double[][] MONTHLY_INCOME = {{120000.00, 100000.00, 110000.00}, {200000.00, 170000.00, 190000.00}, {150000.00, 180000.00, 100000.00}};

    @Override
    public String getLowestIncomeInfo(String areaCode) {
        String info, areaName;
        int index, monthIndex = 0;
        double lowest;
        
        index = getAreaIndex(areaCode);
        lowest  = MONTHLY_INCOME[index][0];
        
        for(int i = 1; i < 3; i++){
            if(lowest > MONTHLY_INCOME[index][i]){
                lowest = MONTHLY_INCOME[index][i];
                monthIndex = i;
            }
        }
        
        areaName = AREAS[index];
        
        info = "Area name: " + areaName + "<br>" +
               "Lowest income: " + lowest + "<br>" +
               "Month: " + MONTH_CODES[monthIndex];
        
        return info;
    }

    @Override
    public String getHighestIncomeInfo(String monthCode) {
        String info, areaName;
        int index, areaIndex = 0;
        double highest;
        
        index = getMonthIndex(monthCode);
        highest  = MONTHLY_INCOME[0][index];
        
        for(int i = 1; i < 3; i++){
            if(highest < MONTHLY_INCOME[i][index]){
                highest = MONTHLY_INCOME[i][index];
                areaIndex = i;
            }
        }
        
        areaName = AREAS[areaIndex];
        
        info = "Area code: " + areaName + "<br>" +
               "Highest income: " + highest + "<br>" +
               "Month: " + monthCode;
        
        return info;
    } 
    
    private Integer getMonthIndex(String monthCode) {
        Integer monthIndex;
        
        if(monthCode.compareToIgnoreCase(MONTH_CODES[0]) == 0){
            monthIndex = 0;
        } else if(monthCode.compareToIgnoreCase(MONTH_CODES[1]) == 0){
            monthIndex = 1;
        } else {
            monthIndex = 2;
        }
       
        return monthIndex;
    }

    private int getAreaIndex(String areaCode) {
        Integer areaIndex;
        
        if(areaCode.compareToIgnoreCase(AREA_CODES[0]) == 0){
            areaIndex = 0;
        } else if(areaCode.compareToIgnoreCase(AREA_CODES[1]) == 0){
            areaIndex = 1;
        } else {
            areaIndex = 2;
        }
       
        return areaIndex;
    }
  
}
