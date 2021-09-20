package com.LoadAPIS.LoadAPIS.entities;




import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;
@Entity
@Table(name="payload")
public class Loads  implements Serializable {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	@Column(name="loadid")
	private int id;
	private String Loading_point;
	
	private String UnLoading_point;
	private String Product_Type;
	private String Truck_Type;
	private double Weight;
	private long NoOf_Truck;
	private String Comment;
	private long shipperId;
	private Date date;
	public Loads() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Loads(int id, String loading_point, String unLoading_point, String product_Type, String truck_Type,
			double weight, long noOf_Truck, String comment, long shipperId, Date date) {
		super();
		this.id = id;
		Loading_point = loading_point;
		UnLoading_point = unLoading_point;
		Product_Type = product_Type;
		Truck_Type = truck_Type;
		Weight = weight;
		NoOf_Truck = noOf_Truck;
		Comment = comment;
		this.shipperId = shipperId;
		this.date = date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLoading_point() {
		return Loading_point;
	}
	public void setLoading_point(String loading_point) {
		Loading_point = loading_point;
	}
	public String getUnLoading_point() {
		return UnLoading_point;
	}
	public void setUnLoading_point(String unLoading_point) {
		UnLoading_point = unLoading_point;
	}
	public String getProduct_Type() {
		return Product_Type;
	}
	public void setProduct_Type(String product_Type) {
		Product_Type = product_Type;
	}
	public String getTruck_Type() {
		return Truck_Type;
	}
	public void setTruck_Type(String truck_Type) {
		Truck_Type = truck_Type;
	}
	public double getWeight() {
		return Weight;
	}
	public void setWeight(double weight) {
		Weight = weight;
	}
	public long getNoOf_Truck() {
		return NoOf_Truck;
	}
	public void setNoOf_Truck(long noOf_Truck) {
		NoOf_Truck = noOf_Truck;
	}
	public String getComment() {
		return Comment;
	}
	public void setComment(String comment) {
		Comment = comment;
	}
	public long getShipperId() {
		return shipperId;
	}
	public void setShipperId(long shipperId) {
		this.shipperId = shipperId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	
}
