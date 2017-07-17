/**
 * Created by Lenovo on 17.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        Table oskarsTable = new Table(4, 2, 5);
        Table ireksTable = new Table(4, 1, 5);


        if(oskarsTable.equals(ireksTable)){
            System.out.println("Są takie same stoły!");
        }


        oskarsTable.makeVoice();
        System.out.println(ireksTable.getVolume());


    }


}
