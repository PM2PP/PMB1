import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class VideospielTest

{
	private static final String KOMMENTAR = "Kommentar";
	private static final String TITEL = "Titel";
	private static final String VIDEOSPIEL_BEZEICHNUNG = "Videospiel";
	private static final String SYSTEM = "System";
	private Videospiel _game1;
	private Videospiel _game2;

	public VideospielTest()
	{
		_game1 = getMedium();
		_game2 = getMedium();
	}

	@Test
	public void testGetMedienBezeichnung()
	{
		String gameBezeichnung = VIDEOSPIEL_BEZEICHNUNG;
		assertEquals(gameBezeichnung, _game1.getMedienBezeichnung());
	}

	@Test
	public void testKonstruktor()
	{
		assertEquals(TITEL, _game1.getTitel());
		assertEquals(KOMMENTAR, _game1.getKommentar());
		assertEquals(SYSTEM, _game1.getSystem());
	}

	@Test
	/*
	 * Von einem und dem selben Videospiel kann es mehrere Exemplare geben, die von
	 * unterschiedlichen Personen ausgeliehen werden können.
	 */
	public void testEquals()
	{
		assertFalse("Mehrere Exemplare des gleichen Videospiels sind ungleich", _game1.equals(_game2));
		assertTrue("Dasselbe Exemplare des gleichen Videospiels ist gleich", _game1.equals(_game1));
	}

	private Videospiel getMedium()
	{
		return new Videospiel(TITEL, KOMMENTAR, SYSTEM);
	}

}
