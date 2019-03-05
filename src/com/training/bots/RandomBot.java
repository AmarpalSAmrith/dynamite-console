package com.training.bots;

import com.softwire.dynamite.bot.Bot;
import com.softwire.dynamite.game.Gamestate;
import com.softwire.dynamite.game.Move;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomBot implements Bot{

        public Move makeMove (Gamestate gamestate) {
            Random randNo = new Random();
            int rn = randNo.nextInt(4);
            //System.out.println(rn);
            List <Move> possMoves = new ArrayList();
            possMoves.add(Move.R);
            possMoves.add(Move.P);
            possMoves.add(Move.S);
            possMoves.add(Move.W);
            possMoves.add(Move.D);
            return possMoves.get(rn);
        }
}
