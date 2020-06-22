package pl.edu.pwsztar.domain.dto;

public class CreateWynikiDto {

    private Integer id_wynikow;
    private String choroby;
    private Integer pracownik_id;
    private Integer pacjent_id;

    public CreateWynikiDto(){

    }

    public Integer getId_wynikow() {
        return id_wynikow;
    }

    public String getChoroby() {
        return choroby;
    }

    public Integer getPracownik_id() {
        return pracownik_id;
    }

    public Integer getPacjent_id() {
        return pacjent_id;
    }

    @Override
    public String toString() {
        return "CreateWynikiDto{" +
                "id_wynikow=" + id_wynikow +
                ", choroby='" + choroby + '\'' +
                ", pracownik_id=" + pracownik_id +
                ", pacjent_id=" + pacjent_id +
                '}';
    }
}
