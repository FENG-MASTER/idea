package org.fengmaster.agricola.actioncard;

import cn.hutool.core.util.StrUtil;
import org.fengmaster.agricola.base.BaseActionCard;
import org.fengmaster.agricola.base.Player;
import org.fengmaster.agricola.base.ResourceType;

public class ActionCardDef4 extends BaseActionCard {



    @Override
    public String getName() {
        return "广场";
    }

    @Override
    public String getDesc() {
        return "获得起始玩家/+打出1张次要发展卡(m)";
    }

    @Override
    public boolean done(Player player, String input) {
        if (StrUtil.isEmpty(input)){
            return true;
        }

        if (input.equals("1m")||input.equals("m")){
            player.addResource(ResourceType.MINOR_IMPROVEMENT,1);
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean undo(Player player) {
        player.subResource(ResourceType.MINOR_IMPROVEMENT,1);
        return true;
    }

    @Override
    public void innerNextRound(int nextRound) {

    }
}
