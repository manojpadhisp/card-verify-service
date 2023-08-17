/**Bny Mellon Ldt we should not disclose
 * otherwise term and condtions will apply.
 */
package com.tesco.cardverify.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tesco.cardverify.model.CardVerifyRequest;
import com.tesco.cardverify.model.CardVerifyResponse;

/**
 * @Author Manoj by 17-Aug-2023
 */
@RestController
@RequestMapping("/v1")
public class CardVerifyController {
	
	@GetMapping("/card/{cardnumber}")
   public CardVerifyResponse verifyCard(@PathVariable("cardnumber") String cardnumber,
		   								@RequestHeader("client_id") String clientId,
		   								@RequestHeader("channel_id") String channelId,
		   								@RequestHeader("message_ts") String messageId,
		   								@RequestHeader("request_id") String requestid)
   {
		CardVerifyResponse cardVerifyResponse= new CardVerifyResponse();
		cardVerifyResponse.setCardNum(cardnumber);
		cardVerifyResponse.setCvv("123");
		cardVerifyResponse.setNameOnCard("Manoj");
		cardVerifyResponse.setExpDate("10-2027");
		
		cardVerifyResponse.setRespCode("0");
		cardVerifyResponse.setRespMsg("success");		
		cardVerifyResponse.setStatus("active");
		
	   return cardVerifyResponse;
   }
}
