package pl.edu.pwsztar.domain.dto;

public class PracownikDto {

    private Integer id_pracownika;
    private String imie;
    private String nazwisko;
    private Integer data_urodzenia;
    private String stanowisko;

    public PracownikDto() {

    }

    public PracownikDto(Integer id_pracownika, String imie, String nazwisko, Integer data_urodzenia, String stanowisko) {
        this.id_pracownika = id_pracownika;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.data_urodzenia = data_urodzenia;
        this.stanowisko = stanowisko;
    }

    public Integer getId_pracownika() {
        return id_pracownika;
    }

    public void setId_pracownika(Integer id_pracownika) {
        this.id_pracownika = id_pracownika;
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

    public String getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }
}
