package com.icehousecorp.gof.adapterpattern;

/**
 * Created by mexanjuadha on 4/7/16.
 */
public class EnemyPlane implements EnemyAbility {

    private static final String TAG = EnemyPlane.class.getSimpleName();

    @Override
    public void fireWeapon() {
        System.out.println("FireWeapon() called with: " + "");
    }

    @Override
    public void shieldWeapon() {
        System.out.println("ShieldWeapon() called with: " + "");
    }
}
