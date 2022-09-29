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
        Job job1 = new Job();
        int id;
        String name;
        Employer employer;
        Location location;
        PositionType positionType;
        CoreCompetency coreCompetency;

        Job job2 = new Job();
        int id2;
        String name2;
        Employer employer2;
        Location location2;
        PositionType positionType2;
        CoreCompetency coreCompetency2;

        assertNotEquals(job1.getId(), job2.getId());
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
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertFalse(job1.equals(job2));
    }

//    @Test
//    public void testToStringStartsAndEndsWithNewLine() {
//        int indexLength = Job1.toString().length();
//
//    }
}
