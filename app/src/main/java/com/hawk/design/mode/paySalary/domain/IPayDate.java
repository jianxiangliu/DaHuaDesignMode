package com.hawk.design.mode.paySalary.domain;

import java.util.Date;
/**
 * 支付日期接口
 * @author tery
 *
 */
public interface IPayDate {
	 boolean isPayDate(Date date);
	 Date getPayPeriodStartDate(Date endDate);
}
