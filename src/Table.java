/**
 * Created by Lenovo on 17.07.2017.
 */
public class Table {
    private int legs;
    private int height;
    private int area;

    private String tableInfo;

    public Table(int startLegs, int startHeight, int startArea){
        legs = startLegs;
        height = startHeight;
        area = startArea;

        tableInfo = legs + " : " + height + " : " + area;
    }

    public Table( int startHeight, int startArea){
        this(0, startHeight, startArea);
    }


    public String getTableInfo() {
        return tableInfo;
    }

    public int getLegs(){
        return legs;
    }

    public int getHeight() {
        return height;
    }

    public int getArea(){
        return area;
    }

    public void setLegs(int startLegs){
        legs = startLegs;
    }

    public void setArea(int startArea){
        area = startArea;
    }

    public void setHeight(int startHeight){
        height = startHeight;
    }

    public int getVolume(){
        return height * area;
    }

    public void makeVoice(){
        System.out.println("Zgrzyyyyyyyyyyyt");
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Table table = (Table) o;

        if (legs != table.legs) return false;
        if (height != table.height) return false;
        if (area != table.area) return false;
        return tableInfo != null ? tableInfo.equals(table.tableInfo) : table.tableInfo == null;
    }

    @Override
    public int hashCode() {
        int result = legs;
        result = 31 * result + height;
        result = 31 * result + area;
        result = 31 * result + (tableInfo != null ? tableInfo.hashCode() : 0);
        return result;
    }
}
