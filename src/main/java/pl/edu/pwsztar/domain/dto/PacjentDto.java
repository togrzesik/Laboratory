package pl.edu.pwsztar.domain.dto;

public class PacjentDto {

    private Integer id_pacjenta;
    private String imie;
    private String nazwisko;
    private Integer data_urodzenia;
    private String nr_telefonu;
    private String pesel;

    public PacjentDto() {

    }

    public PacjentDto(Integer id_pacjenta, String imie, String nazwisko, Integer data_urodzenia, String nr_telefonu, String pesel) {
        this.id_pacjenta = id_pacjenta;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.data_urodzenia = data_urodzenia;
        this.nr_telefonu = nr_telefonu;
        this.pesel = pesel;
    }

    public Integer getId_pacjenta() {
        return id_pacjenta;
    }

    public void setId_pacjenta(Integer id_pacjenta) {
        this.id_pacjenta = id_pacjenta;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public Integer getData_urodzenia() {
        return data_urodzenia;
    }

    public void setData_urodzenia(Integer data_urodzenia) {
        this.data_urodzenia = data_urodzenia;
    }

    public String getNr_telefonu() {
        return nr_telefonu;
    }

    public void setNr_telefonu(String nr_telefonu) {
        this.nr_telefonu = nr_telefonu;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }
}
