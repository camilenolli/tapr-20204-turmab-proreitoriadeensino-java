package br.univille.microservproreitoriadeensino.criacao_cursos.entity;
import org.springframework.data.annotation.Id;
import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.GeneratedValue;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;

@Container(containerName = "disciplina", autoCreateContainer = true)
public class Disciplina {
    @Id
    @PartitionKey
    @GeneratedValue
    private String idDisciplina;
    private int cargaHoraria;
    private String disciplina;
    private int frequencia;

    public Disciplina(String idDisciplina, int cargaHoraria, String disciplina, int frequencia) {
        this.idDisciplina = idDisciplina;
        this.cargaHoraria = cargaHoraria;
        this.disciplina = disciplina;
        this.frequencia = frequencia;
    }

    public String getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(String idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public int getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }
    
}
