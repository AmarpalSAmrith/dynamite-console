package com.training.bots;
import com.softwire.dynamite.bot.Bot;
import com.softwire.dynamite.game.Gamestate;
import com.softwire.dynamite.game.Move;
import com.softwire.dynamite.game.Round;

import java.util.List;

public class CleverBot implements Bot{

    @Override
    public Move makeMove(Gamestate gamestate) {
        List <Round> rounds = gamestate.getRounds();
        if (rounds.size()== 0){
            return Move.W;
        }

        Round lastRound = rounds.get(rounds.size()-1);

        switch (lastRound.getP2()){
            case D: return Move.W;
            case R: return Move.P;
            case S: return Move.R;
            case P: return Move.S;
            case W: return Move.P;
            default: return null;
        }
    }
}
