package model;

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
    @GeneratedValue(strategy=GenerationType.IDENTITY)
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

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
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

}
