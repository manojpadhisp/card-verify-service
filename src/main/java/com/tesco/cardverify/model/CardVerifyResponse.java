/**Bny Mellon Ldt we should not disclose
 * otherwise term and condtions will apply.
 */
package com.tesco.cardverify.model;

import lombok.Data;

/**
 * @Author Manoj by 17-Aug-2023
 */
@Data
public class CardVerifyResponse {
	private String respCode;
	private String respMsg;
	
	private String status;
	
	private String  cardNum;	
	private String  cvv;	
	private String  nameOnCard;	
	private String  expDate;

}
