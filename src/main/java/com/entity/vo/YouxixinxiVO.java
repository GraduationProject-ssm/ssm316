package com.entity.vo;

import com.entity.YouxixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 游戏信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-27 11:47:54
 */
public class YouxixinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 游戏分类
	 */
	
	private String youxifenlei;
		
	/**
	 * 游戏封面
	 */
	
	private String youxifengmian;
		
	/**
	 * 游戏标签
	 */
	
	private String youxibiaoqian;
		
	/**
	 * 游戏视频
	 */
	
	private String youxishipin;
		
	/**
	 * 游戏厂商
	 */
	
	private String youxichangshang;
		
	/**
	 * 游戏详情
	 */
	
	private String youxixiangqing;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
		
	/**
	 * 价格
	 */
	
	private Float price;
				
	
	/**
	 * 设置：游戏分类
	 */
	 
	public void setYouxifenlei(String youxifenlei) {
		this.youxifenlei = youxifenlei;
	}
	
	/**
	 * 获取：游戏分类
	 */
	public String getYouxifenlei() {
		return youxifenlei;
	}
				
	
	/**
	 * 设置：游戏封面
	 */
	 
	public void setYouxifengmian(String youxifengmian) {
		this.youxifengmian = youxifengmian;
	}
	
	/**
	 * 获取：游戏封面
	 */
	public String getYouxifengmian() {
		return youxifengmian;
	}
				
	
	/**
	 * 设置：游戏标签
	 */
	 
	public void setYouxibiaoqian(String youxibiaoqian) {
		this.youxibiaoqian = youxibiaoqian;
	}
	
	/**
	 * 获取：游戏标签
	 */
	public String getYouxibiaoqian() {
		return youxibiaoqian;
	}
				
	
	/**
	 * 设置：游戏视频
	 */
	 
	public void setYouxishipin(String youxishipin) {
		this.youxishipin = youxishipin;
	}
	
	/**
	 * 获取：游戏视频
	 */
	public String getYouxishipin() {
		return youxishipin;
	}
				
	
	/**
	 * 设置：游戏厂商
	 */
	 
	public void setYouxichangshang(String youxichangshang) {
		this.youxichangshang = youxichangshang;
	}
	
	/**
	 * 获取：游戏厂商
	 */
	public String getYouxichangshang() {
		return youxichangshang;
	}
				
	
	/**
	 * 设置：游戏详情
	 */
	 
	public void setYouxixiangqing(String youxixiangqing) {
		this.youxixiangqing = youxixiangqing;
	}
	
	/**
	 * 获取：游戏详情
	 */
	public String getYouxixiangqing() {
		return youxixiangqing;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setPrice(Float price) {
		this.price = price;
	}
	
	/**
	 * 获取：价格
	 */
	public Float getPrice() {
		return price;
	}
			
}
