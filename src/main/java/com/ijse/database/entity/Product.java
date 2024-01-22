package com.ijse.database.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;

     @Column(nullable = false) //(mekata nullable = false dammama, aniwaryenma ekata value ekk denna oni)
     private String name;

     private Integer qty;

     private Double price;

     @ManyToOne  //(cascade = CascadeType.ALL)
     @JoinColumn(name = "category_id") // mekta api aluthen joing coulmn ekk add kara ganne (one) paththe thiyena column ekk dala (category_id)
     private Category category;


}
