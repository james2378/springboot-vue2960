package com.entity.view;

import com.entity.GoodsOrderEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 菜品订单
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("goods_order")
public class GoodsOrderView extends GoodsOrderEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 就餐类型的值
		*/
		private String orderValue;
		/**
		* 订单类型的值
		*/
		private String goodsOrderValue;
		/**
		* 支付类型的值
		*/
		private String goodsOrderPaymentValue;



		//级联表 goods
			/**
			* 菜品名称
			*/
			private String goodsName;
			/**
			* 菜品类型
			*/
			private Integer goodsTypes;
				/**
				* 菜品类型的值
				*/
				private String goodsValue;
			/**
			* 菜品照片
			*/
			private String goodsPhoto;
			/**
			* 菜品库存
			*/
			private Integer goodsKucunNumber;
			/**
			* 菜品原价
			*/
			private Double goodsOldMoney;
			/**
			* 现价
			*/
			private Double goodsNewMoney;
			/**
			* 购买获得积分
			*/
			private Integer goodsPrice;
			/**
			* 是否上架
			*/
			private Integer shangxiaTypes;
				/**
				* 是否上架的值
				*/
				private String shangxiaValue;
			/**
			* 逻辑删除
			*/
			private Integer goodsDelete;
			/**
			* 菜品简介
			*/
			private String goodsContent;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 邮箱
			*/
			private String yonghuEmail;
			/**
			* 总积分
			*/
			private Double yonghuSumJifen;
			/**
			* 会员等级
			*/
			private Integer huiyuandengjiTypes;
				/**
				* 会员等级的值
				*/
				private String huiyuandengjiValue;
			/**
			* 余额
			*/
			private Double newMoney;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public GoodsOrderView() {

	}

	public GoodsOrderView(GoodsOrderEntity goodsOrderEntity) {
		try {
			BeanUtils.copyProperties(this, goodsOrderEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 就餐类型的值
			*/
			public String getOrderValue() {
				return orderValue;
			}
			/**
			* 设置： 就餐类型的值
			*/
			public void setOrderValue(String orderValue) {
				this.orderValue = orderValue;
			}
			/**
			* 获取： 订单类型的值
			*/
			public String getGoodsOrderValue() {
				return goodsOrderValue;
			}
			/**
			* 设置： 订单类型的值
			*/
			public void setGoodsOrderValue(String goodsOrderValue) {
				this.goodsOrderValue = goodsOrderValue;
			}
			/**
			* 获取： 支付类型的值
			*/
			public String getGoodsOrderPaymentValue() {
				return goodsOrderPaymentValue;
			}
			/**
			* 设置： 支付类型的值
			*/
			public void setGoodsOrderPaymentValue(String goodsOrderPaymentValue) {
				this.goodsOrderPaymentValue = goodsOrderPaymentValue;
			}










				//级联表的get和set goods
					/**
					* 获取： 菜品名称
					*/
					public String getGoodsName() {
						return goodsName;
					}
					/**
					* 设置： 菜品名称
					*/
					public void setGoodsName(String goodsName) {
						this.goodsName = goodsName;
					}
					/**
					* 获取： 菜品类型
					*/
					public Integer getGoodsTypes() {
						return goodsTypes;
					}
					/**
					* 设置： 菜品类型
					*/
					public void setGoodsTypes(Integer goodsTypes) {
						this.goodsTypes = goodsTypes;
					}


						/**
						* 获取： 菜品类型的值
						*/
						public String getGoodsValue() {
							return goodsValue;
						}
						/**
						* 设置： 菜品类型的值
						*/
						public void setGoodsValue(String goodsValue) {
							this.goodsValue = goodsValue;
						}
					/**
					* 获取： 菜品照片
					*/
					public String getGoodsPhoto() {
						return goodsPhoto;
					}
					/**
					* 设置： 菜品照片
					*/
					public void setGoodsPhoto(String goodsPhoto) {
						this.goodsPhoto = goodsPhoto;
					}
					/**
					* 获取： 菜品库存
					*/
					public Integer getGoodsKucunNumber() {
						return goodsKucunNumber;
					}
					/**
					* 设置： 菜品库存
					*/
					public void setGoodsKucunNumber(Integer goodsKucunNumber) {
						this.goodsKucunNumber = goodsKucunNumber;
					}
					/**
					* 获取： 菜品原价
					*/
					public Double getGoodsOldMoney() {
						return goodsOldMoney;
					}
					/**
					* 设置： 菜品原价
					*/
					public void setGoodsOldMoney(Double goodsOldMoney) {
						this.goodsOldMoney = goodsOldMoney;
					}
					/**
					* 获取： 现价
					*/
					public Double getGoodsNewMoney() {
						return goodsNewMoney;
					}
					/**
					* 设置： 现价
					*/
					public void setGoodsNewMoney(Double goodsNewMoney) {
						this.goodsNewMoney = goodsNewMoney;
					}
					/**
					* 获取： 购买获得积分
					*/
					public Integer getGoodsPrice() {
						return goodsPrice;
					}
					/**
					* 设置： 购买获得积分
					*/
					public void setGoodsPrice(Integer goodsPrice) {
						this.goodsPrice = goodsPrice;
					}
					/**
					* 获取： 是否上架
					*/
					public Integer getShangxiaTypes() {
						return shangxiaTypes;
					}
					/**
					* 设置： 是否上架
					*/
					public void setShangxiaTypes(Integer shangxiaTypes) {
						this.shangxiaTypes = shangxiaTypes;
					}


						/**
						* 获取： 是否上架的值
						*/
						public String getShangxiaValue() {
							return shangxiaValue;
						}
						/**
						* 设置： 是否上架的值
						*/
						public void setShangxiaValue(String shangxiaValue) {
							this.shangxiaValue = shangxiaValue;
						}
					/**
					* 获取： 逻辑删除
					*/
					public Integer getGoodsDelete() {
						return goodsDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setGoodsDelete(Integer goodsDelete) {
						this.goodsDelete = goodsDelete;
					}
					/**
					* 获取： 菜品简介
					*/
					public String getGoodsContent() {
						return goodsContent;
					}
					/**
					* 设置： 菜品简介
					*/
					public void setGoodsContent(String goodsContent) {
						this.goodsContent = goodsContent;
					}













				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}
					/**
					* 获取： 总积分
					*/
					public Double getYonghuSumJifen() {
						return yonghuSumJifen;
					}
					/**
					* 设置： 总积分
					*/
					public void setYonghuSumJifen(Double yonghuSumJifen) {
						this.yonghuSumJifen = yonghuSumJifen;
					}
					/**
					* 获取： 会员等级
					*/
					public Integer getHuiyuandengjiTypes() {
						return huiyuandengjiTypes;
					}
					/**
					* 设置： 会员等级
					*/
					public void setHuiyuandengjiTypes(Integer huiyuandengjiTypes) {
						this.huiyuandengjiTypes = huiyuandengjiTypes;
					}


						/**
						* 获取： 会员等级的值
						*/
						public String getHuiyuandengjiValue() {
							return huiyuandengjiValue;
						}
						/**
						* 设置： 会员等级的值
						*/
						public void setHuiyuandengjiValue(String huiyuandengjiValue) {
							this.huiyuandengjiValue = huiyuandengjiValue;
						}
					/**
					* 获取： 余额
					*/
					public Double getNewMoney() {
						return newMoney;
					}
					/**
					* 设置： 余额
					*/
					public void setNewMoney(Double newMoney) {
						this.newMoney = newMoney;
					}
					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}



}
