package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 菜品订单
 *
 * @author 
 * @email
 */
@TableName("goods_order")
public class GoodsOrderEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public GoodsOrderEntity() {

	}

	public GoodsOrderEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 取餐码
     */
    @TableField(value = "goods_order_uuid_number")

    private String goodsOrderUuidNumber;


    /**
     * 菜品
     */
    @TableField(value = "goods_id")

    private Integer goodsId;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 购买的数量
     */
    @TableField(value = "buy_number")

    private Integer buyNumber;


    /**
     * 就餐类型
     */
    @TableField(value = "order_types")

    private Integer orderTypes;


    /**
     * 实付价格
     */
    @TableField(value = "goods_order_true_price")

    private Double goodsOrderTruePrice;


    /**
     * 订单类型
     */
    @TableField(value = "goods_order_types")

    private Integer goodsOrderTypes;


    /**
     * 支付类型
     */
    @TableField(value = "goods_order_payment_types")

    private Integer goodsOrderPaymentTypes;


    /**
     * 订单创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：取餐码
	 */
    public String getGoodsOrderUuidNumber() {
        return goodsOrderUuidNumber;
    }


    /**
	 * 获取：取餐码
	 */

    public void setGoodsOrderUuidNumber(String goodsOrderUuidNumber) {
        this.goodsOrderUuidNumber = goodsOrderUuidNumber;
    }
    /**
	 * 设置：菜品
	 */
    public Integer getGoodsId() {
        return goodsId;
    }


    /**
	 * 获取：菜品
	 */

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：购买的数量
	 */
    public Integer getBuyNumber() {
        return buyNumber;
    }


    /**
	 * 获取：购买的数量
	 */

    public void setBuyNumber(Integer buyNumber) {
        this.buyNumber = buyNumber;
    }
    /**
	 * 设置：就餐类型
	 */
    public Integer getOrderTypes() {
        return orderTypes;
    }


    /**
	 * 获取：就餐类型
	 */

    public void setOrderTypes(Integer orderTypes) {
        this.orderTypes = orderTypes;
    }
    /**
	 * 设置：实付价格
	 */
    public Double getGoodsOrderTruePrice() {
        return goodsOrderTruePrice;
    }


    /**
	 * 获取：实付价格
	 */

    public void setGoodsOrderTruePrice(Double goodsOrderTruePrice) {
        this.goodsOrderTruePrice = goodsOrderTruePrice;
    }
    /**
	 * 设置：订单类型
	 */
    public Integer getGoodsOrderTypes() {
        return goodsOrderTypes;
    }


    /**
	 * 获取：订单类型
	 */

    public void setGoodsOrderTypes(Integer goodsOrderTypes) {
        this.goodsOrderTypes = goodsOrderTypes;
    }
    /**
	 * 设置：支付类型
	 */
    public Integer getGoodsOrderPaymentTypes() {
        return goodsOrderPaymentTypes;
    }


    /**
	 * 获取：支付类型
	 */

    public void setGoodsOrderPaymentTypes(Integer goodsOrderPaymentTypes) {
        this.goodsOrderPaymentTypes = goodsOrderPaymentTypes;
    }
    /**
	 * 设置：订单创建时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：订单创建时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "GoodsOrder{" +
            "id=" + id +
            ", goodsOrderUuidNumber=" + goodsOrderUuidNumber +
            ", goodsId=" + goodsId +
            ", yonghuId=" + yonghuId +
            ", buyNumber=" + buyNumber +
            ", orderTypes=" + orderTypes +
            ", goodsOrderTruePrice=" + goodsOrderTruePrice +
            ", goodsOrderTypes=" + goodsOrderTypes +
            ", goodsOrderPaymentTypes=" + goodsOrderPaymentTypes +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
