package virtualPet;

import org.junit.Assert;
import org.junit.Test;

public class VirtualPetTest {

	@Test
	public void shouldHaveDefaultMalaise() {
		VirtualPet underTest = new VirtualPet("Poopy the Puppy", "1", "1", "1");
		String defaultMalaiseLevel = underTest.getMalaiseLevel();
		Assert.assertEquals("1", defaultMalaiseLevel);
	}

	@Test
	public void shouldHaveDefaultPoop() {
		VirtualPet underTest = new VirtualPet("Poopy the Puppy", "1", "1", "1");
		String defaultPoopLevel = underTest.getPoopLevel();
		Assert.assertEquals("1", defaultPoopLevel);
	}

	@Test
	public void shouldHaveDefaultWillPower() {
		VirtualPet underTest = new VirtualPet("Poopy the Puppy", "1", "1", "1");
		String defaultWillPowerLevel = underTest.getWillPowerLevel();
		Assert.assertEquals("1", defaultWillPowerLevel);
	}

	@Test
	public void shouldHaveDefaultName() {
		VirtualPet underTest = new VirtualPet("Poopy the Puppy", "1", "1", "1");
		String defaultName = underTest.getName();
		Assert.assertEquals("Poopy the Puppy", defaultName);
	}

	@Test
	public void shouldHaveTickActivity
	{
		VirtualPet underTest = new VirtualPet("Poopy the Puppy", "1", "1", "1");

	}
}
