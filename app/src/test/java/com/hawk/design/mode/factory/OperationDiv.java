package com.hawk.design.mode.factory;

/**
 * @author Jerry
 * @Description:
 * @date 2016/10/29 10:43
 * @copyright TCL-MIG
 */

public class OperationDiv implements Operation {
    @Override
    public double caculate(double num1, double num2) {
        return num1 / num2;
    }
}