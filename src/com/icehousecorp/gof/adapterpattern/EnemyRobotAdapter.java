package com.icehousecorp.gof.adapterpattern;

/**
 * Created by mexanjuadha on 4/7/16.
 */
public class EnemyRobotAdapter implements EnemyAbility {

    EnemyRobot enemyRobot;

    public EnemyRobotAdapter(EnemyRobot enemyRobot) {
        this.enemyRobot = enemyRobot;
    }

    @Override
    public void fireWeapon() {
        enemyRobot.smashWithHand();
    }

    @Override
    public void shieldWeapon() {
        enemyRobot.shieldWithHand();
    }
}
