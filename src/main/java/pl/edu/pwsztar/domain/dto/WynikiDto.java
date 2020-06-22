package pl.edu.pwsztar.domain.dto;

import java.io.Serializable;

public class WynikiDto implements Serializable {

    private Integer id_wynikow;
    private String choroby;
    private Integer pracownik_id;
    private Integer pacjent_id;

    public WynikiDto() {
    }

    public WynikiDto(Integer id_wynikow, String choroby, Integer pracownik_id, Integer pacjent_id) {
        this.id_wynikow = id_wynikow;
        this.choroby = choroby;
        this.pracownik_id = pracownik_id;
        this.pacjent_id = pacjent_id;
    }

    public Integer getId_wynikow() {
        return id_wynikow;
    }

    public void setId_wynikow(Integer id_wynikow) {
        this.id_wynikow = id_wynikow;
    }

    public String getChoroby() {
        return choroby;
    }

    public void setChoroby(String choroby) {
        this.choroby = choroby;
    }

    public Integer getPracownik_id() {
        return pracownik_id;
    }

    public void setPracownik_id(Integer pracownik_id) {
        this.pracownik_id = pracownik_id;
    }

    public Integer getPacjent_id() {
        return pacjent_id;
    }

    public void setPacjent_id(Integer pacjent_id) {
        this.pacjent_id = pacjent_id;
    }
}
