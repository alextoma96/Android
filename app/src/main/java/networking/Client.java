package networking;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

/**
 * Created by intern on 9/11/2017.
 */

public class Client implements Parcelable {
    private String nume;
    private String cod;
    private String adresa;
    private String codInregistrare;
    private String codFiscal;
    private String banca;
    private String iban;
    private String memo;
    private Boolean extern;
    private Boolean acelasiGrup;
    private String persoanaContact;
    private String telefon;
    private String email;
    private String termenPlata;
    private String tara;
    private String grupCompanie;
    private String limba;
    private List<Factura> facturi;

    public Client(){
    }


    public String getCod() { return cod; }
    public Client setCod(String cod) { this.cod = cod; }

    public String getNume() { return nume; }
    public Client setNume(String nume) { this.nume = nume; }

    public String getCodInregistrare() { return codInregistrare; }
    public Client setCodInregistrare(String codInregistrare) { this.codInregistrare = codInregistrare; }

    public String getCodFiscal() { return codFiscal; }
    public Client setCodFiscal(String codFiscal) { this.codFiscal = codFiscal;}

    public String getAdresa() { return adresa; }
    public Client setAdresa(String adresa) { this.adresa = adresa; }

    public String getBanca() { return banca; }
    public Client setBanca(String banca) { this.banca = banca; }

    public String getIban() { return iban; }
    public Client setIban(String iban) { this.iban = iban; }

    public String getMemo() { return memo; }
    public Client setMemo(String memo) { this.memo = memo; return this;}

    public List<Factura> getFacturi() { return facturi; }
    public Client setFacturi(List<Factura> facturi) { this.facturi = facturi; }

    public Boolean getExtern() { return extern; }
    public Client setExtern(Boolean extern) { this.extern = extern; }

    public Boolean getAcelasiGrup() { return acelasiGrup; }
    public Client setAcelasiGrup(Boolean acelasiGrup) { this.acelasiGrup = acelasiGrup; }

    public String getPersoanaContact() { return persoanaContact; }
    public Client setPersoanaContact(String persoanaContact) { this.persoanaContact = persoanaContact; }

    public String getTelefon() { return telefon; }
    public Client setTelefon(String telefon) { this.telefon = telefon; }

    public String getEmail() { return email; }
    public Client setEmail(String email) { this.email = email; return this; }

    public String getTermenPlata() { return termenPlata; }
    public Client setTermenPlata(String termenPlata) { this.termenPlata = termenPlata; }

    public String getTara() { return tara; }
    public Client setTara(String tara) { this.tara = tara; return this; }

    public String getGrupCompanie() { return grupCompanie; }
    public Client setGrupCompanie(String grupCompanie) { this.grupCompanie = grupCompanie; }

    public String getLimba() { return limba; }
    public Client setLimba(String limba) { this.limba = limba; return this; }

    public static final Parcelable.Creator<Client> CREATOR = new Creator<Client>() {
        @Override
        public Client createFromParcel(Parcel source) {
            return new Client(source);
        }

        @Override
        public Client[] newArray(int size) {
            return new Client[][size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nume);
        dest.writeString(cod);
        dest.writeString(adresa);
        dest.writeString(codInregistrare);
        dest.writeString(codFiscal);
        dest.writeString(banca);
        dest.writeString(iban);
        dest.writeString(memo);
        dest.writeString(persoanaContact);
        dest.writeBooleanArray(extern);
        dest.writeBooleanArray(acelasiGrup);
        dest.writeString(persoanaContact);
        dest.writeString(telefon);
        dest.writeString(email);
        dest.writeString(termenPlata);
        dest.writeString(tara);
        dest.writeString(grupCompanie);
        dest.writeList(facturi);
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", cod=" + cod +
                ", adresa=" + adresa +
                ", codInregistrare=" + codInregistrare +
                ", codFiscal=" + codFiscal +
                ", banca=" + banca +
                ", iban=" + iban +
                ", memo=" + memo +
                ", extern=" + extern +
                ", acelasiGrup=" + acelasiGrup +
                ", persoanaContact=" + persoanaContact +
                ", telefon=" + telefon +
                ", email=" + email +
                ", termenPlata=" + termenPlata +
                ", tara=" + tara +
                ", grupCompanie=" + grupCompanie +
                ", limba=" + limba +
                ", facturi=" + facturi +

                '}';
    }

}
