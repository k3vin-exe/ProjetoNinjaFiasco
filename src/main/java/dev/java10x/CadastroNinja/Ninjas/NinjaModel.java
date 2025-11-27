package dev.java10x.CadastroNinja.Ninjas;

//import jakarta.persistence.*;
import dev.java10x.CadastroNinja.Missoes.MissoesModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// o que está comentado está relacionado a jpa
//@Entity
//@Table (name = "tb_cadastro")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;

    private int idade;

    // Muitos ninjas para uma missão
//    @ManyToOne
//    @JoinColumn(name = "missoes_id")
    private MissoesModel missoes;

    private String corDoOlho;

}
