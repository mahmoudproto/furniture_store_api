package com.proto_inc.furniture_store;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Item")
public class Item {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column(name="name")
    private String name;
    
    @Column(name="imgurl")
    private String imgurl;
      
    
	@Column(name="description")
    private String description;
    
    @Column(name="price")
    private float price;
    
    @Column(name="quentity")
    private int quentity;
    
    String category;

    public Item() {
        super();
    }

    public Item(String name, String imgurl, String description, float price, int quentity, String category) {
        this.name = name;
        this.imgurl = imgurl;
        this.description = description;
        this.price = price;
        this.quentity = quentity;
        this.category = category;
    }

  

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", imgurl='" + imgurl + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", quentity=" + quentity +
                ", category='" + category + '\'' +
                '}';
    }
    
    public void setId(Long id) {
        this.id=id;
    }

    @Id
    public Long getId() {
        return id;
    }
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImgurl() {
		return imgurl;
	}

	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getQuentity() {
		return quentity;
	}

	public void setQuentity(int quentity) {
		this.quentity = quentity;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}


}
