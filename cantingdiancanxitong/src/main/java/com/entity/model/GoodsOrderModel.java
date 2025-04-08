package com.entity.model;

import com.entity.GoodsOrderEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 菜品订单
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class GoodsOrderModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 取餐码
     */
    private String goodsOrderUuidNumber;


    /**
     * 菜品
     */
    private Integer goodsId;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 购买的数量
     */
    private Integer buyNumber;


    /**
     * 就餐类型
     */
    private Integer orderTypes;


    /**
     * 实付价格
     */
    private Double goodsOrderTruePrice;


    /**
     * 订单类型
     */
    private Integer goodsOrderTypes;


    /**
     * 支付类型
     */
    private Integer goodsOrderPaymentTypes;


    /**
     * 订单创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show3
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：取餐码
	 */
    public String getGoodsOrderUuidNumber() {
        return goodsOrderUuidNumber;
    }


    /**
	 * 设置：取餐码
	 */
    public void setGoodsOrderUuidNumber(String goodsOrderUuidNumber) {
        this.goodsOrderUuidNumber = goodsOrderUuidNumber;
    }
    /**
	 * 获取：菜品
	 */
    public Integer getGoodsId() {
        return goodsId;
    }


    /**
	 * 设置：菜品
	 */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：购买的数量
	 */
    public Integer getBuyNumber() {
        return buyNumber;
    }


    /**
	 * 设置：购买的数量
	 */
    public void setBuyNumber(Integer buyNumber) {
        this.buyNumber = buyNumber;
    }
    /**
	 * 获取：就餐类型
	 */
    public Integer getOrderTypes() {
        return orderTypes;
    }


    /**
	 * 设置：就餐类型
	 */
    public void setOrderTypes(Integer orderTypes) {
        this.orderTypes = orderTypes;
    }
    /**
	 * 获取：实付价格
	 */
    public Double getGoodsOrderTruePrice() {
        return goodsOrderTruePrice;
    }


    /**
	 * 设置：实付价格
	 */
    public void setGoodsOrderTruePrice(Double goodsOrderTruePrice) {
        this.goodsOrderTruePrice = goodsOrderTruePrice;
    }
    /**
	 * 获取：订单类型
	 */
    public Integer getGoodsOrderTypes() {
        return goodsOrderTypes;
    }


    /**
	 * 设置：订单类型
	 */
    public void setGoodsOrderTypes(Integer goodsOrderTypes) {
        this.goodsOrderTypes = goodsOrderTypes;
    }
    /**
	 * 获取：支付类型
	 */
    public Integer getGoodsOrderPaymentTypes() {
        return goodsOrderPaymentTypes;
    }


    /**
	 * 设置：支付类型
	 */
    public void setGoodsOrderPaymentTypes(Integer goodsOrderPaymentTypes) {
        this.goodsOrderPaymentTypes = goodsOrderPaymentTypes;
    }
    /**
	 * 获取：订单创建时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：订单创建时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间 show3
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show3
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
