
package generalstore;

import java.util.ArrayList;
import java.util.Random;

public class GeneralStore {

    public static void main(String[] args) {
    ArrayList<String> items = new ArrayList<>();
    items.add("Rope");
    items.add("Waterskin");
    items.add("Health Potion");
    items.add("Torch");
    items.add("Bottle");
    items.add("Ink");
    items.add("Clothes, Fine");
    items.add("Clothes, Traveler's");
    items.add("Candle");
    items.add("Holy Water");
    
    int rope = 0;
    int waterskin =0;
    int HP =0;
    int torch=0;
    int bottle=0;
    int ink=0;
    int fineClothes=0;
    int travClothes=0;
    int candle =0;
    int holywater=0;
    int roll = (int) (Math.random()*100)+1;
    
    for(int i=0; i<10; i++){
    Random picker = new Random();
    String randomi = items.get(picker.nextInt(items.size()));
    
    
    if(randomi == "Rope"){
        rope +=5;       
    }else if(randomi == "Waterskin"){
        waterskin +=3;
    }else if(randomi == "Health Potion"){
        HP +=3;
    }else if(randomi == "Torch"){
        torch +=5;
    }else if(randomi == "Bottle"){
        bottle+=5;
    }else if(randomi=="Ink"){
        ink+=3;
    }else if(randomi=="Clothes, Fine"){
        fineClothes++;
    }else if(randomi=="Clothes, Traveler's"){
        travClothes++;
    }else if(randomi=="Candle"){
        candle+=3;
    }else if(randomi=="Holy Water"){
        holywater++;
    }
        
    }if(rope > 0){
    System.out.printf("x%s  Rope, 50ft  (1 gp)\n", rope);
    }if(waterskin>0){
    System.out.printf("x%s  Waterskin (2 sp)\n", waterskin);    
    }if(HP>0){
        System.out.printf("x%s  Potion of Healing  (50 gp)\n", HP);
    }if(torch>0){
        System.out.printf("x%s  Torch  (1 cp)\n", torch);
    }if(bottle>0){
        System.out.printf("x%s  Bottle  (2 gp)\n", bottle);
    }if(ink>0){
        System.out.printf("x%s  Ink  (10 gp)\n", ink);
    }if(fineClothes>0){
        System.out.printf("x%s  Clothes, Fine  (15 gp)\n", fineClothes);
    }if(travClothes>0){
        System.out.printf("x%s  Clothes, Traveler's  (2 gp)\n", travClothes);
    }if(candle>0){
        System.out.printf("x%s  Candle  (1 cp)\n", candle);
    }if(holywater>0){
        System.out.printf("x%s  Holy Water  (25 gp)\n", holywater);
    }if(roll ==1){
        System.out.println("x1  Legendary Balmung   (1000 gp)\n");
    }
    }
}
