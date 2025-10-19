package dev.spring.ProjetoNinjaFiasco.Missoes;

import dev.spring.ProjetoNinjaFiasco.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table (name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private char dificuldade;

    // Uma missão para muitos ninjas
    @OneToMany (mappedBy = "missoes")
    private List<NinjaModel > ninjas;

}
