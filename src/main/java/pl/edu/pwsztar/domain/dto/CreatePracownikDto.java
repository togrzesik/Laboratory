package pl.edu.pwsztar.domain.dto;

import java.io.Serializable;

public class CreatePracownikDto implements Serializable {

    private Integer id_pracownika;
    private String imie;
    private String nazwisko;
    private Integer data_urodzenia;
    private String stanowisko;

    public CreatePracownikDto() {
    }

    public Integer getId_pracownika() {
        return id_pracownika;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public Integer getData_urodzenia() {
        return data_urodzenia;
    }

    public String getStanowisko() {
        return stanowisko;
    }

    @Override
    public String toString() {
        return "CreatePracownikDto{" +
                "id_pracownika=" + id_pracownika +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", data_urodzenia=" + data_urodzenia + '\'' +
                ", stanowisko='" + stanowisko + '\'' +
                '}';
    }
}
