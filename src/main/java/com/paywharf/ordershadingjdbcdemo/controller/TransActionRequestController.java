package com.paywharf.ordershadingjdbcdemo.controller;

import java.sql.Timestamp;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.paywharf.ordershadingjdbcdemo.algorithm.BeginAndEndDate;
import com.paywharf.ordershadingjdbcdemo.algorithm.SnowFlakeId;
import com.paywharf.ordershadingjdbcdemo.entity.Goods;
import com.paywharf.ordershadingjdbcdemo.entity.TransactionRequest;
import com.paywharf.ordershadingjdbcdemo.mapper.TransactionRequestMapper;
import com.paywharf.ordershadingjdbcdemo.service.IGoodsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author CodeGenerator
 * @since 2020-11-11
 */
@RestController
@Slf4j
@RequestMapping("/request")
public class TransActionRequestController {
	
	@Autowired
	private TransactionRequestMapper transactionRequestMapper;
	
	@GetMapping("/add")
	public int add() {
//		Date d = new Date("2021-10-18 10:00:00");
		TransactionRequest build = TransactionRequest.builder().reqInitiateDate(Timestamp.valueOf("2022-10-18 11:11:11")).build();
		return transactionRequestMapper.save(build);
	}

	@GetMapping ("/select")
	public List<TransactionRequest> select (){
		Date startTime, endTime = null;
		return transactionRequestMapper.findByInitTime(Timestamp.valueOf("2021-10-18 10:11:11"),Timestamp.valueOf("2022-10-18 10:11:11"));
	}

	@GetMapping("/id")
	public BeginAndEndDate getId (Long id ){

		BeginAndEndDate beginAndEndDate = SnowFlakeId.getBeginAndEndDate(id);
		log.info("beginAndEndDate 对象:{}",beginAndEndDate);
		return SnowFlakeId.getBeginAndEndDate(id);
	}


}