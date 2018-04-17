
import java.util.List;

import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;

/**
 * Ein MedienDetailAnzeigerWerkzeug ist ein Werkzeug um die Details von Medien
 * anzuzeigen.
 * 
 * @author SE2-Team, PM2-Team
 * @version SoSe 2018
 */
class MedienDetailAnzeigerWerkzeug
{
	private MedienDetailAnzeigerUI _ui;

	/**
	 * Initialisiert ein neues MedienDetailAnzeigerWerkzeug.
	 */
	public MedienDetailAnzeigerWerkzeug()
	{
		_ui = new MedienDetailAnzeigerUI();
	}

	/**
	 * Setzt die Liste der Medien deren Details angezeigt werden sollen.
	 * 
	 * @param medien
	 *            Eine Liste von Medien.
	 * 
	 * @require (medien != null)
	 */
	// public void setMedien(List<Medium> medien)
	// {
	// assert medien != null : "Vorbedingung verletzt: (medien != null)";
	//
	// for (Medium medium : medien)
	// {
	// if (medium instanceof CD)
	// {
	// CD cd1 = (CD) medium;
	// String cd = cd1.getInterpret() + " " + cd1.getTitel() + " " +
	// cd1.getKommentar() + " "
	// + cd1.getSpiellaenge();
	// TextArea selectedMedienTextArea = _ui.getMedienAnzeigerTextArea();
	// selectedMedienTextArea.setText(cd);
	// }
	//
	// else if (medium instanceof DVD)
	// {
	// DVD dvd1 = (DVD) medium;
	// String dvd = dvd1.getRegisseur() + " " + dvd1.getTitel() + " " +
	// dvd1.getKommentar() + " "
	// + dvd1.getLaufzeit();
	// TextArea selectedMedienTextArea = _ui.getMedienAnzeigerTextArea();
	// selectedMedienTextArea.setText(dvd);
	// }
	//
	// else if (medium instanceof Videospiel)
	// {
	// Videospiel game1 = (Videospiel) medium;
	// String game = game1.getTitel() + " " + game1.getKommentar() + " " +
	// game1.getSystem();
	// TextArea selectedMedienTextArea = _ui.getMedienAnzeigerTextArea();
	// selectedMedienTextArea.setText(game);
	// }
	//
	// }
	//
	// }

	/**
	 * Setzt die Liste der Medien deren Details angezeigt werden sollen.
	 * 
	 * @param medien
	 *            Eine Liste von Medien.
	 * 
	 * @require (medien != null)
	 */
	public void setMedien(List<Medium> medien)
	{
		assert medien != null : "Vorbedingung verletzt: (medien != null)";
		
		for (Medium medium : medien)
		{
			TextArea selectedMedienTextArea = _ui.getMedienAnzeigerTextArea();
			selectedMedienTextArea.setText(medium.getFormatiertenString());
		}

	}

	/**
	 * Gibt das Panel dieses Subwerkzeugs zurück.
	 * 
	 * @ensure result != null
	 */
	public Pane getUIPane()
	{
		return _ui.getUIPane();
	}
}
