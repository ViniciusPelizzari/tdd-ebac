package br.com.vpelizzarisilva.domain;

public class Client {

    private Long id;
    private String name;
    private Long cpf;
    private String profission;
    private int yearsOld;

    public Client(){

    }

    public Client(Long id, String name, Long cpf, String profission, int yearsOld) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.profission = profission;
        this.yearsOld = yearsOld;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getProfission() {
        return profission;
    }

    public void setProfission(String profission) {
        this.profission = profission;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }
}
