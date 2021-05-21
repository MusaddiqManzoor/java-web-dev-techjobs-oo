package org.launchcode.techjobs_oo.Tests;


import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    Job jobObj1;
    Job jobObj2;

    @Before
    public void createObjects() {
        jobObj1 = new Job();
        jobObj2 = new Job();
    }

    @Test
    public void testSettingJobId() {
         jobObj1 = new Job();
         jobObj2 = new Job();
         assertEquals(jobObj2.getId(), jobObj1.getId()+1);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job jobObj = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        assertEquals(true, jobObj.getName() instanceof String);
        assertEquals("Product tester", jobObj.getName());

        assertEquals(true, jobObj.getEmployer() instanceof Employer);
        assertEquals("ACME", jobObj.getEmployer().getValue());

        assertEquals(true, jobObj.getLocation() instanceof Location);
        assertEquals("Desert", jobObj.getLocation().getValue());

        assertEquals(true, jobObj.getPositionType() instanceof PositionType);
        assertEquals("Quality control", jobObj.getPositionType().getValue());

        assertEquals(true, jobObj.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Persistence", jobObj.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        jobObj1 = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        jobObj2 = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        assertFalse(jobObj1.equals(jobObj2));
    }

}
