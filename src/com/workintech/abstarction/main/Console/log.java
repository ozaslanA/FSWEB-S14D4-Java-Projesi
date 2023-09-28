package com.workintech.abstarction.main.Console;

import com.workintech.abstarction.rpg.Monster;
import com.workintech.abstarction.rpg.Werewolf;

public class log {
    public class Console {

        public static void main(String[] args) {


            Monster werewolf = new Werewolf("Buckbeak", 350, 40);
            System.out.println(werewolf.attack());
        }
}
}

