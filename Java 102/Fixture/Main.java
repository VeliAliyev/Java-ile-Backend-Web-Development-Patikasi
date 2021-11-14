import java.util.ArrayList;
import java.util.Collections;

public class Main {


    public static ArrayList<String> combine(ArrayList<String> teamList){

        ArrayList<String> combinations = new ArrayList<>();

        for(String host:teamList){
            for(String guest:teamList){
                if(!host.equals(guest)){
                    combinations.add(host + " vs " + guest);
                }
            }
        }
        return combinations;
    }

    public static void main(String[] args) {

        ArrayList<String> teamList = new ArrayList<>();
        ArrayList<ArrayList<String>> fixture = new ArrayList<>();
        ArrayList<String> hostList = new ArrayList<>();
        ArrayList<String> guestList = new ArrayList<>();
        String[] match;
        String str, host,guest;

        teamList.add("Galatasaray");
        teamList.add("Bursaspor");
        teamList.add("Fenerbahçe");
        teamList.add("Beşiktaş");
        teamList.add("Başakşehir");
        teamList.add("Trabzonspor");

        if(teamList.size() % 2 != 0)
            teamList.add("Bay");


        Collections.shuffle(teamList);

        ArrayList<String> combinations = new ArrayList<>(combine(teamList));

        int counter;

        for(int round = 0; round < 2*(teamList.size()-1); round++) {

            fixture.add(round, new ArrayList<>());
            counter = 0;
            hostList.clear();
            guestList.clear();

            while (counter < (teamList.size()/2)) {

                str = combinations.remove(0);
                match = str.split(" ");
                host = match[0];
                guest = match[2];

                if(hostList.contains(host) || guestList.contains(guest) ||
                        hostList.contains(guest) || guestList.contains(host)) {
                    combinations.add(str);

                }
                else{
                    hostList.add(host);
                    guestList.add(guest);
                    fixture.get(round).add(str);
                    counter++;
                }
            }
        }

        for(int round  = 0; round < 2*(teamList.size()-1); round++ ){
            System.out.println("ROUND : " + (round+1));
            while (!fixture.get(round).isEmpty()){
                System.out.println(fixture.get(round).remove(0));
            }
        }
    }
}
