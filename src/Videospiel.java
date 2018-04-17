/**
 * Ein Videospiel ist ein Medium. Zusätzlich zu den Eigenschaften eines Mediums erfasst
 * sie Informationen zum Spielsystem.
 * 
 * @author JP.Ritter
 * @version SoSe 2018
 */
 
public class Videospiel implements Medium 
{
	
    /**
     * Die Spielsystem/system des Videospiels 
     */
    private String _system;

    /**
     * Ein Kommentar zum Medium
     */
    private String _kommentar;

    /**
     * Der Titel des Mediums
     * 
     */
    private String _titel;
    /**
     * Das Videospiel als String
     */
    private Videospiel _videospiel; 

    /**
     * Initialisiert ein neues Exemplar.
     * 
     * @param titel Der Titel des Videospiels
     * @param kommentar Ein Kommentar zu dem Videospiel
     * @param system das Spielsystem des Videospiels
     * 
     * @require titel != null
     * @require kommentar != null
     * @require system != null
     * 
     * @ensure getTitel() == titel
     * @ensure getKommentar() == kommentar
     * @ensure getSystem() == system
     * @ensure getFormatiertenString() == titel + kommentar + system; 
     */
    public Videospiel(String titel, String kommentar, String system)
    {
        assert titel != null : "Vorbedingung verletzt: titel != null";
        assert kommentar != null : "Vorbedingung verletzt: kommentar != null";
        assert system != null : "Vorbedingung verletzt: system != null";
        _titel = titel;
        _kommentar = kommentar; 
        	_system = system; 
        	_videospiel = this; 
    }

    @Override
    public String getMedienBezeichnung()
    {
        return "Videospiel";
    }

    /**
     * Gibt den Typen/Spielsystem des Videospiels zurück.
     * 
     * @return system des Videospiels.
     * 
     * @ensure result != null.
     */
    public String getSystem()
    {
        return _system;
    }

    @Override
    public String getKommentar()
    {
        return _kommentar;
    }

    @Override
    public String getTitel()
    {
        return _titel;
    }

	@Override
	public String getFormatiertenString()
	{
		return 	_videospiel.getTitel() + " " + 
				_videospiel.getKommentar() + " " +
				_videospiel.getSystem();
	}


}
