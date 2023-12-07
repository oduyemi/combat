package combat;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Attack Points of the Monster:");
        int monsterAttack = sc.nextInt();
        System.out.println("Defense Points of the Monster:");
        int monsterDefense = sc.nextInt();
        System.out.println("Damage of the Monster:");
        int monsterDamage = sc.nextInt();
        System.out.println("Life Points of the Monster:");
        int monsterLife = sc.nextInt();

        System.out.println("Your Attack Points:");
        int yourAttack = sc.nextInt();
        System.out.println("Your Defense Points:");
        int yourDefense = sc.nextInt();
        System.out.println("Your Damage:");
        int yourDamage = sc.nextInt();
        System.out.println("Your Life Points:");
        int yourLife = sc.nextInt();

        Random generator = new Random();
        boolean attacker = generator.nextBoolean();
        if (attacker){
            System.out.println("You attack!");
            int dice = generator.nextInt(6)+1 + generator.nextInt(6)+1;
            int attackValue = yourAttack + dice;
            System.out.println("Rolled values: "+dice);
            System.out.println("Your attack value: "+ attackValue);
            if (yourAttack > monsterDefense){
                System.out.println("Good attack!");
                monsterLife = monsterLife - yourDamage;
                System.out.println("Monster's life = "+monsterLife);
            }else{
                System.out.println("Your attack not successful");

            }
        }else{
            System.out.println("Monster attacks!");
            int dice = generator.nextInt(6)+1 + generator.nextInt(6)+1;
            int attackValue = monsterAttack + dice;
            System.out.println("Rolled values: "+dice);
            System.out.println("Monster's attack value: "+ attackValue);
            if (monsterAttack > yourDefense){
                System.out.println("Attack successful!");
                yourLife = yourLife - monsterDamage;
                System.out.println("Your life = "+yourLife);
            }else{
                System.out.println("Monster's attack not successful");
        }
    }
}}
