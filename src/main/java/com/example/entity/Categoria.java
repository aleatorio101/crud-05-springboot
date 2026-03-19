
package com.example.entity;

import jakarta.persistence.*;

@Entity
@Table(name="tb_categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
private String descricao;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
}
