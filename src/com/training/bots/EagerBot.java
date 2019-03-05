package com.training.bots;
import com.softwire.dynamite.bot.Bot;
import com.softwire.dynamite.game.Gamestate;
import com.softwire.dynamite.game.Move;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EagerBot implements Bot {

    private int remainingDynamites;

    public EagerBot() {
        remainingDynamites = 100;
    }

    public Move makeMove(Gamestate gamestate) {
        Random randNo = new Random();
        int rn = randNo.nextInt(3);
        List <Move> possMoves = new ArrayList();

        if (remainingDynamites > 0) {
            remainingDynamites--;
            return  Move.D;
        }

        possMoves.add(Move.R);
        possMoves.add(Move.P);
        possMoves.add(Move.S);
        possMoves.add(Move.W);
        return possMoves.get(rn);
    }
}