
package DAO;

import Clases.Evento;
import Clases.Individuo;
import java.util.List;

public interface IndividuoDAO {
    
    public int insertarIndividuo(Individuo pIndividuo);

    public int insertarCompetidor(Individuo pIndividuo);
    
    /*public void seleccionarDetallesEvento(int pId, javax.swing.JTextField pTxtNombre,
            javax.swing.JComboBox pCmbTipo, javax.swing.JComboBox pCmbGenero, 
            com.toedter.calendar.JDateChooser pCalendarFechaInicio, 
            com.toedter.calendar.JDateChooser pCalendarFechaFin,
            javax.swing.JTextField pTxtRangoInicial, javax.swing.JTextField pTxtRangoFinal,
            javax.swing.JTextField pTxtLimiteSerie, javax.swing.JComboBox pCmbMetrica,
            javax.swing.JComboBox pCmbInstalacion, javax.swing.JComboBox pCmbClasificacion);*/
}