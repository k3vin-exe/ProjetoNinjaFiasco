package dev.java10x.CadastroNinja.Missoes;

import jakarta.persistence.*;
import dev.java10x.CadastroNinja.Ninjas.NinjaModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private char dificuldade;

    // Uma missão para muitos ninjas
    @OneToMany(mappedBy = "missao")
    private List<NinjaModel> ninjas;

}
