package ch.tbz;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileWriter;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Ranking {

    File file;
    LinkedHashMap<String,Integer> score = new LinkedHashMap<>();


    public Ranking(){
        readFile();
    }
    private void readFile() {
        try {
            file = new File("ranking.json");
            Scanner s = new Scanner(file);
            String  scoreString = "";
            while (s.hasNextLine()){
                scoreString  += s.nextLine();
            }
            ObjectMapper mapper = new ObjectMapper();
            // parse String to Map
            score = mapper.readValue(scoreString.toString(), LinkedHashMap.class);
            s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void printScore() {
        for (Map.Entry<String,Integer> entry: score.entrySet()){
            System.out.println("Player: " + entry.getKey() + "   Score: " + entry.getValue());
        }
    }

    public void addNewScore(String player, int newScore){
        this.score.put(player,newScore);
        LinkedHashMap<String, Integer> newList = new LinkedHashMap<>();
        score.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEachOrdered(x -> newList.put(x.getKey(),x.getValue()));
        score = newList;
    }
    public void saveScore(){
        try{
            FileWriter fileWriter = new FileWriter("ranking.json");
            String writeTo = "{";

            for(Map.Entry<String,Integer> entry :score.entrySet()){
                writeTo += "\""+entry.getKey() + "\":" +entry.getValue()+ ",";
            }
            writeTo=  writeTo.substring(0,writeTo.length()-1);
            writeTo += "}";
            fileWriter.write(writeTo);
            fileWriter.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}