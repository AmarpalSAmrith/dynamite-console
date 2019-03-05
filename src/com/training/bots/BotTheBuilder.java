package com.training.bots;

import com.softwire.dynamite.bot.Bot;
import com.softwire.dynamite.game.Gamestate;
import com.softwire.dynamite.game.Move;
import com.softwire.dynamite.game.Round;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BotTheBuilder implements Bot {
    @Override
    public Move makeMove(Gamestate gamestate) {
        List<Round> rounds = gamestate.getRounds();
        if (rounds.size()== 0){
            return Move.W;
        }

        Round lastRound1 = rounds.get(rounds.size()-1);
        Round lastRound2 = rounds.get(rounds.size()-2);
        Round lastRound3 = rounds.get(rounds.size()-3);
        Move lastR1P1 = lastRound1.getP1();
        Move lastR2P1 = lastRound2.getP1();
        Move lastR3P1 = lastRound3.getP1();
        Move lastR1P2 = lastRound1.getP2();
        Move lastR2P2 = lastRound2.getP2();
        Move lastR3P2 = lastRound3.getP2();


        if (lastR1P2.equals(lastR1P1) && lastR2P2.equals(lastR2P2)) {
            return Move.D;
        }

        List <Move> possMoves = new ArrayList();
        possMoves.add(Move.R);
        possMoves.add(Move.P);
        possMoves.add(Move.S);
        possMoves.add(Move.W);
        return possMoves.get(rn);
    }
}
