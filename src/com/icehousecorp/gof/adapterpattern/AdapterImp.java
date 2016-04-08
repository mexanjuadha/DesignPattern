package com.icehousecorp.gof.adapterpattern;

/**
 * Created by mexanjuadha on 4/7/16.
 */
public class AdapterImp {

    public AdapterImp() {
        createEnemyPlane();
        createEnemyRobotWithAdapter();
    }

    public void createEnemyPlane() {
        EnemyPlane enemyPlane = new EnemyPlane();
        enemyPlane.fireWeapon();
        enemyPlane.shieldWeapon();
    }

    public void createEnemyRobotWithAdapter() {
        EnemyRobot enemyRobot = new EnemyRobot();
        enemyRobot.smashWithHand();
        enemyRobot.shieldWithHand();

        EnemyAbility enemyRobotAdapter = new EnemyRobotAdapter(enemyRobot);
        enemyRobotAdapter.fireWeapon();
        enemyRobotAdapter.shieldWeapon();
    }
}
