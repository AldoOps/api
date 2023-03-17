package med.voll.api.dto;

import med.voll.api.entity.Paciente;

public record DadosListagemPaciente(String nome, String email, String cpf) {
    public DadosListagemPaciente(Paciente paciente) {
        this(paciente.getNome(), paciente.getEmail(), paciente.getCpf());
    }
}