package com.recrea.restapi.resources;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.recrea.restapi.dao.PlanningDAO;
import com.recrea.restapi.model.Planning;


@RequestScoped
@Path("plan")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PlanningResource {
	
	@Inject
    PlanningDAO planningDAO;
	
	
	
	@GET
    public Response getAll() {
		return Response.ok(planningDAO.getAll()).build();
    }
	
	
    @GET
    @Path("{id}")
    public Response getPlan(@PathParam("id") Long id) {
        Planning plan= planningDAO.findById(id);

        return Response.ok(plan).build();
    }

    /*
    @POST
    public Response create(Planning planning) {
    	planningDAO.create(planning);
        return Response.ok().build();
    }
    
    @POST
    @Path("/new")
    public Response create() {
    	Planning planning = new Planning();
    	planning.setDataoraapertura(null);
    	planning.setPriorita(0);
    	planning.setDivisione(0);
    	planning.setCategoria(0);
    	planning.setOggetto(null);
    	planning.setRichiestarevisione(null);
    	planning.setCostostimato(0);
    	planning.setPunteggiostimato(0);
    	planning.setDescrizione(null);
    	planning.setSoluzione(null);
    	planning.setMessaggioalrichiedente(null);
    	planning.setDataoraelaborazione(null);
    	planning.setDataorachiusura(null);
    	planning.setDataorascadenza(null);
    	planning.setAddetto(null);
    	planning.setCodiceutente(null);
    	planning.setIdcliente(0);
    	planning.setRagionesocialerichiedente(null);
    	planning.setNomecognomerichiedente(null);
    	planning.setEmailrichiedente(null);
    	planning.setTelefonorichiedente(null);
    	planning.setFaxrichiedente(null);
    	planning.setIdplanningsuccessivo(0);
    	planning.setIdprogettodettaglio(0);
    	planning.setCentrodicosto(0);
    	planning.setIdrigaordine(0);
    	planning.setDataoramisuraprestazioni(null);
    	planning.setIdplanningcollaudo(0);
    	planning.setChiamata(0);
    	planning.setIdprimoplanning(0);
    	planning.setDataoraabilitazione(null);
    	planning.setAziendaprecedente(null);
    	planning.setMotivazionepriorita(null);
    	planning.setAziendasuccessiva(null);
    	planning.setEmailchiusura1(null);
    	planning.setEmailchiusura2(null);
    	planning.setEmailchiusura3(null);
    	planning.setEmailchiusura4(null);
    	planning.setEmailchiusura5(null);
    	planning.setDataorainiziolavoro(null);
    	planning.setEscalationclientitop(0);
    	planning.setArchiviazionedigitale(null);
    	planning.setDataoraarchiviazionedigitale(null);
    	planning.setIdprospect(0);
    	planning.setDataorasospensione(null);
    	planning.setLoginsospensione(null);
    	
    	planningDAO.create(planning);
        return Response.ok().build();
    }*/
}
