package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)

public class JobTest {

    @Test
    public void testSettingJobId() {
        Job jobOne = new Job();
        int id;
        String name;
        Employer employer;
        Location location;
        PositionType positionType;
        CoreCompetency coreCompetency;

        Job jobTwo = new Job();
        int id2;
        String name2;
        Employer employer2;
        Location location2;
        PositionType positionType2;
        CoreCompetency coreCompetency2;

        assertNotEquals(jobOne.getId(), jobTwo.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {

        Job newJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(newJob.getName() instanceof String);
        assertEquals("Product tester",newJob.getName());

        assertTrue(newJob.getEmployer() instanceof Employer);
        assertEquals("ACME",newJob.getEmployer().getValue());

        assertTrue(newJob.getLocation() instanceof Location);
        assertEquals("Desert", newJob.getLocation().getValue());

        assertTrue(newJob.getPositionType() instanceof PositionType);
        assertEquals("Quality control", newJob.getPositionType().getValue());

        assertTrue(newJob.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Persistence", newJob.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        Job jobOne = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job jobTwo = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertFalse(jobOne.equals(jobTwo));
    }

//    ensures each field is on its own line
    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job jobOne = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        char firstChar = jobOne.toString().charAt(0);
        char lastChar = jobOne.toString().charAt(jobOne.toString().length() - 1);
        assertEquals(firstChar, '\n')
                assertEquals(lastChar, '\n');
    }

//    ensures the fields match up with the right values
    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job jobOne = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String expected = '\n' +
                "ID: " + jobOne.getId() + '\n' +
                "Name: " + jobOne.getName() + '\n' +
                "Employer: " + jobOne.getEmployer() + '\n' +
                "Location: " + jobOne.getLocation() + '\n' +
                "Position Type: " + jobOne.getPositionType() + '\n' +
                "Core Competency: " + jobOne.getCoreCompetency() + '\n';
    }

//how to handle when empty fields
    @Test
    public void testToStringHandlesEmptyField() {
        Job jobOne = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        String expected = "\n" +
                "ID: 1" + '\n' +
                "Name: Data not available" + '\n' +
                "Employer: Data not available" + '\n' +
                "Location: Data not available" + '\n' +
                "Position Type: Data not available" + '\n' +
                "Core Competency: Data not available" + '\n';
        String actual = jobOne.toString();
        assertEquals(expected, actual);
    }
}
