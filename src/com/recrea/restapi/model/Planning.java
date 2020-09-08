package com.recrea.restapi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the planning database table.
 * 
 */
@Entity
@Table(name = "planning")
@NamedQuery(name="Planning.findAll", query="SELECT p FROM Planning p")
public class Planning implements Serializable {
	private static final long serialVersionUID = 1L;
	private long id;
	private String addetto;
	private String archiviazionedigitale;
	private String aziendaprecedente;
	private String aziendasuccessiva;
	private int categoria;
	private int centrodicosto;
	private int chiamata;
	private String codiceutente;
	private double costostimato;
	private Date dataoraabilitazione;
	private Date dataoraapertura;
	private Date dataoraarchiviazionedigitale;
	private Date dataorachiusura;
	private Date dataoraelaborazione;
	private Date dataorainiziolavoro;
	private Date dataoramisuraprestazioni;
	private Date dataorascadenza;
	private Date dataorasospensione;
	private String descrizione;
	private String emailchiusura1;
	private String emailchiusura2;
	private String emailchiusura3;
	private String emailchiusura4;
	private String emailchiusura5;
	private String emailrichiedente;
	private int escalationclientitop;
	private String faxrichiedente;
	private int idcliente;
	private int idplanningcollaudo;
	private int idplanningsuccessivo;
	private int idprimoplanning;
	private int idprogettodettaglio;
	private int idprospect;
	private int idrigaordine;
	private String loginsospensione;
	private String messaggioalrichiedente;
	private String motivazionepriorita;
	private String nomecognomerichiedente;
	private String oggetto;
	private int priorita;
	private double punteggiostimato;
	private String ragionesocialerichiedente;
	private String richiestarevisione;
	private String soluzione;
	private String telefonorichiedente;
	

	public Planning() {
	}


	@Id
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}


	public String getAddetto() {
		return this.addetto;
	}

	public void setAddetto(String addetto) {
		this.addetto = addetto;
	}


	public String getArchiviazionedigitale() {
		return this.archiviazionedigitale;
	}

	public void setArchiviazionedigitale(String archiviazionedigitale) {
		this.archiviazionedigitale = archiviazionedigitale;
	}


	public String getAziendaprecedente() {
		return this.aziendaprecedente;
	}

	public void setAziendaprecedente(String aziendaprecedente) {
		this.aziendaprecedente = aziendaprecedente;
	}


	public String getAziendasuccessiva() {
		return this.aziendasuccessiva;
	}

	public void setAziendasuccessiva(String aziendasuccessiva) {
		this.aziendasuccessiva = aziendasuccessiva;
	}


	public int getCategoria() {
		return this.categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}


	public int getCentrodicosto() {
		return this.centrodicosto;
	}

	public void setCentrodicosto(int centrodicosto) {
		this.centrodicosto = centrodicosto;
	}


	public int getChiamata() {
		return this.chiamata;
	}

	public void setChiamata(int chiamata) {
		this.chiamata = chiamata;
	}


	public String getCodiceutente() {
		return this.codiceutente;
	}

	public void setCodiceutente(String codiceutente) {
		this.codiceutente = codiceutente;
	}


	public double getCostostimato() {
		return this.costostimato;
	}

	public void setCostostimato(double costostimato) {
		this.costostimato = costostimato;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getDataoraabilitazione() {
		return this.dataoraabilitazione;
	}

	public void setDataoraabilitazione(Date dataoraabilitazione) {
		this.dataoraabilitazione = dataoraabilitazione;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getDataoraapertura() {
		return this.dataoraapertura;
	}

	public void setDataoraapertura(Date dataoraapertura) {
		this.dataoraapertura = dataoraapertura;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getDataoraarchiviazionedigitale() {
		return this.dataoraarchiviazionedigitale;
	}

	public void setDataoraarchiviazionedigitale(Date dataoraarchiviazionedigitale) {
		this.dataoraarchiviazionedigitale = dataoraarchiviazionedigitale;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getDataorachiusura() {
		return this.dataorachiusura;
	}

	public void setDataorachiusura(Date dataorachiusura) {
		this.dataorachiusura = dataorachiusura;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getDataoraelaborazione() {
		return this.dataoraelaborazione;
	}

	public void setDataoraelaborazione(Date dataoraelaborazione) {
		this.dataoraelaborazione = dataoraelaborazione;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getDataorainiziolavoro() {
		return this.dataorainiziolavoro;
	}

	public void setDataorainiziolavoro(Date dataorainiziolavoro) {
		this.dataorainiziolavoro = dataorainiziolavoro;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getDataoramisuraprestazioni() {
		return this.dataoramisuraprestazioni;
	}

	public void setDataoramisuraprestazioni(Date dataoramisuraprestazioni) {
		this.dataoramisuraprestazioni = dataoramisuraprestazioni;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getDataorascadenza() {
		return this.dataorascadenza;
	}

	public void setDataorascadenza(Date dataorascadenza) {
		this.dataorascadenza = dataorascadenza;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getDataorasospensione() {
		return this.dataorasospensione;
	}

	public void setDataorasospensione(Date dataorasospensione) {
		this.dataorasospensione = dataorasospensione;
	}


	@Lob
	public String getDescrizione() {
		return this.descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}


	public String getEmailchiusura1() {
		return this.emailchiusura1;
	}

	public void setEmailchiusura1(String emailchiusura1) {
		this.emailchiusura1 = emailchiusura1;
	}


	public String getEmailchiusura2() {
		return this.emailchiusura2;
	}

	public void setEmailchiusura2(String emailchiusura2) {
		this.emailchiusura2 = emailchiusura2;
	}


	public String getEmailchiusura3() {
		return this.emailchiusura3;
	}

	public void setEmailchiusura3(String emailchiusura3) {
		this.emailchiusura3 = emailchiusura3;
	}


	public String getEmailchiusura4() {
		return this.emailchiusura4;
	}

	public void setEmailchiusura4(String emailchiusura4) {
		this.emailchiusura4 = emailchiusura4;
	}


	public String getEmailchiusura5() {
		return this.emailchiusura5;
	}

	public void setEmailchiusura5(String emailchiusura5) {
		this.emailchiusura5 = emailchiusura5;
	}


	public String getEmailrichiedente() {
		return this.emailrichiedente;
	}

	public void setEmailrichiedente(String emailrichiedente) {
		this.emailrichiedente = emailrichiedente;
	}


	public int getEscalationclientitop() {
		return this.escalationclientitop;
	}

	public void setEscalationclientitop(int escalationclientitop) {
		this.escalationclientitop = escalationclientitop;
	}


	public String getFaxrichiedente() {
		return this.faxrichiedente;
	}

	public void setFaxrichiedente(String faxrichiedente) {
		this.faxrichiedente = faxrichiedente;
	}


	public int getIdcliente() {
		return this.idcliente;
	}

	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}


	public int getIdplanningcollaudo() {
		return this.idplanningcollaudo;
	}

	public void setIdplanningcollaudo(int idplanningcollaudo) {
		this.idplanningcollaudo = idplanningcollaudo;
	}


	public int getIdplanningsuccessivo() {
		return this.idplanningsuccessivo;
	}

	public void setIdplanningsuccessivo(int idplanningsuccessivo) {
		this.idplanningsuccessivo = idplanningsuccessivo;
	}


	public int getIdprimoplanning() {
		return this.idprimoplanning;
	}

	public void setIdprimoplanning(int idprimoplanning) {
		this.idprimoplanning = idprimoplanning;
	}


	public int getIdprogettodettaglio() {
		return this.idprogettodettaglio;
	}

	public void setIdprogettodettaglio(int idprogettodettaglio) {
		this.idprogettodettaglio = idprogettodettaglio;
	}


	public int getIdprospect() {
		return this.idprospect;
	}

	public void setIdprospect(int idprospect) {
		this.idprospect = idprospect;
	}


	public int getIdrigaordine() {
		return this.idrigaordine;
	}

	public void setIdrigaordine(int idrigaordine) {
		this.idrigaordine = idrigaordine;
	}


	public String getLoginsospensione() {
		return this.loginsospensione;
	}

	public void setLoginsospensione(String loginsospensione) {
		this.loginsospensione = loginsospensione;
	}


	@Lob
	public String getMessaggioalrichiedente() {
		return this.messaggioalrichiedente;
	}

	public void setMessaggioalrichiedente(String messaggioalrichiedente) {
		this.messaggioalrichiedente = messaggioalrichiedente;
	}


	public String getMotivazionepriorita() {
		return this.motivazionepriorita;
	}

	public void setMotivazionepriorita(String motivazionepriorita) {
		this.motivazionepriorita = motivazionepriorita;
	}


	public String getNomecognomerichiedente() {
		return this.nomecognomerichiedente;
	}

	public void setNomecognomerichiedente(String nomecognomerichiedente) {
		this.nomecognomerichiedente = nomecognomerichiedente;
	}


	public String getOggetto() {
		return this.oggetto;
	}

	public void setOggetto(String oggetto) {
		this.oggetto = oggetto;
	}


	public int getPriorita() {
		return this.priorita;
	}

	public void setPriorita(int priorita) {
		this.priorita = priorita;
	}


	public double getPunteggiostimato() {
		return this.punteggiostimato;
	}

	public void setPunteggiostimato(double punteggiostimato) {
		this.punteggiostimato = punteggiostimato;
	}


	public String getRagionesocialerichiedente() {
		return this.ragionesocialerichiedente;
	}

	public void setRagionesocialerichiedente(String ragionesocialerichiedente) {
		this.ragionesocialerichiedente = ragionesocialerichiedente;
	}


	public String getRichiestarevisione() {
		return this.richiestarevisione;
	}

	public void setRichiestarevisione(String richiestarevisione) {
		this.richiestarevisione = richiestarevisione;
	}


	@Lob
	public String getSoluzione() {
		return this.soluzione;
	}

	public void setSoluzione(String soluzione) {
		this.soluzione = soluzione;
	}


	public String getTelefonorichiedente() {
		return this.telefonorichiedente;
	}

	public void setTelefonorichiedente(String telefonorichiedente) {
		this.telefonorichiedente = telefonorichiedente;
	}


	//bi-directional one-to-one association to Progetti
	

}