package com.hawk.design.mode.notifypush.push;

import com.hawk.design.mode.permission.IAction;
import com.hawk.design.mode.util.NLog;

import java.util.Random;

/**
 * @author Jerry
 * @Description:
 * @date 2016/12/7 11:04
 * @copyright TCL-MIG
 */

public class Con04 extends AConditionAction {

    public Con04(IAction parent) {
        super(parent);
    }

    @Override
    public boolean checkCondition() {
        boolean interrupt = new Random().nextInt(10) >= 5;
        if (interrupt) {
            NLog.e(TAG,"Con04 interupt------");
        }else {
            NLog.d(TAG,"Con04 not interupt" );
        }

        return interrupt;
    }

}
