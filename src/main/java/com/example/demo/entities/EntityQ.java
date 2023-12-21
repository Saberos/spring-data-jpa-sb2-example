package com.example.demo.entities;

 import javax.persistence.Entity;
 import javax.persistence.Id;
 import javax.persistence.JoinColumn;
 import javax.persistence.ManyToMany;
 import javax.persistence.ManyToOne;
 import javax.persistence.OneToMany;
 import lombok.Getter;
 import lombok.Setter;

 import java.util.List;

 @Entity
 @Getter
 @Setter
 public class EntityQ {

     @Id
     private Long id;

     private String a1;
     private String a2;
     private String a3;
     private String a4;
     private String a5;
     private String a6;
     private String a7;
     private String a8;
     private String a9;
     private String a10;
     private String a11;
     private String a12;
     private String a13;
     private String a14;
     private String a15;
     private String a16;
     private String a17;
     private String a18;
     private String a19;
     private String a20;
     private String a21;
     private String a22;
     private String a23;
     private String a24;
     private String a25;
     private String a26;
     private String a27;
     private String a28;
     private String a29;
     private String a30;
     @OneToMany(mappedBy = "entityQ")
     private List<EntityR> entityRS;
     @OneToMany(mappedBy = "entityQ")
     private List<EntityS> entitySS;
     @OneToMany(mappedBy = "entityQ")
     private List<EntityT> entityTS;
     @OneToMany(mappedBy = "entityQ")
     private List<EntityU> entityUS;
     @ManyToOne
     @JoinColumn(name = "entity_P_id")
     private EntityP entityP;
     @ManyToOne
     @JoinColumn(name = "entity_O_id")
     private EntityO entityO;
     @ManyToOne
     @JoinColumn(name = "entity_N_id")
     private EntityN entityN;
     @ManyToOne
     @JoinColumn(name = "entity_M_id")
     private EntityM entityM;
     
 }


