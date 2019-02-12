package pl.zlecenia.klienta.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="KLIENT")
public class Klient {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="CLIENT_ID")
	private long id;
	@Column(name="IMIE")
	private String imie;
	@Column(name="NAZWISKO")
	private String nazwisko;
	@Column(name="ADRES_ZAMIESZKANIA")
	private String adres;
	@Column(name="NUMER_TELEFONU")
	private String numertelefonu;
	
	public Klient() {}
	
	public Klient(String imie, String nazwisko, String adres, String numertelefonu) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.adres = adres;
		this.numertelefonu = numertelefonu;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
	public String getNumertelefonu() {
		return numertelefonu;
	}
	public void setNumertelefonu(String numertelefonu) {
		this.numertelefonu = numertelefonu;
	}
	
	@Override
	public String toString() {
		return "Klient {id=" + id + ", imie=" + imie + ", nazwisko=" + nazwisko + ", adres=" + adres
				+ ", numertelefonu=" + numertelefonu + "}";
	}
	
	
}
