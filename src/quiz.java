import java.util.ArrayList;

import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {
        ArrayList<String> verbos = new ArrayList<>();
        ArrayList<String> passados = new ArrayList<>();
        Scanner answers = new Scanner(System.in);

        verbos.add("go");
        verbos.add("write");
        verbos.add("eat");
        verbos.add("break");
        verbos.add("see");
        verbos.add("have");
        verbos.add("do");
        verbos.add("buy");

        passados.add("went");
        passados.add("wrote");
        passados.add("ate");
        passados.add("broke");
        passados.add("saw");
        passados.add("had");
        passados.add("did");
        passados.add("bought");

        int points = 0;
        for (int i = 0; i < verbos.size(); i++) {

        System.out.println("WHAT'S THE PAST TENSE OF WORD '" + verbos.get(i) + "' ?");
        String respostas = answers.nextLine().toLowerCase();


        if (respostas.equals(passados.get(i))) {
            System.out.println("YOUR ANSWERS IS CORRECT!");
            points++;

        } else {
            System.out.println("ANSWERS IS WRONG!");

        }


        }
        System.out.println("YOU GOT IT RIGHT " + points + " OF " + verbos.size() + " WORDS!");





    }

}
