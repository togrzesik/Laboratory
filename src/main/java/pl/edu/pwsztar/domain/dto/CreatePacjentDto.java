package pl.edu.pwsztar.domain.dto;

import java.io.Serializable;

public class CreatePacjentDto implements Serializable {
    private Integer id_pacjenta;
    private String imie;
    private String nazwisko;
    private Integer data_urodzenia;
    private String nr_telefonu;
    private String pesel;

    public CreatePacjentDto() {

    }

    public Integer getId_pacjenta() {
        return id_pacjenta;
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

    public String getNr_telefonu() {
        return nr_telefonu;
    }

    public String getPesel() {
        return pesel;
    }

    @Override
    public String toString() {
        return "CreatePacjentDto{" +
                "id_pacjenta=" + id_pacjenta +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", data_urodzenia=" + data_urodzenia +
                ", nr_telefonu='" + nr_telefonu + '\'' +
                ", pesel='" + pesel + '\'' +
                '}';
    }
}
