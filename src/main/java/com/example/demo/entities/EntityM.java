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
 public class EntityM {

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
     @OneToMany(mappedBy = "entityM")
     private List<EntityN> entityNS;
     @OneToMany(mappedBy = "entityM")
     private List<EntityO> entityOS;
     @OneToMany(mappedBy = "entityM")
     private List<EntityP> entityPS;
     @OneToMany(mappedBy = "entityM")
     private List<EntityQ> entityQS;
     @ManyToOne
     @JoinColumn(name = "entity_L_id")
     private EntityL entityL;
     @ManyToOne
     @JoinColumn(name = "entity_K_id")
     private EntityK entityK;
     @ManyToOne
     @JoinColumn(name = "entity_J_id")
     private EntityJ entityJ;
     @ManyToOne
     @JoinColumn(name = "entity_I_id")
     private EntityI entityI;
     
 }


