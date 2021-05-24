package org.launchcode.techjobs_oo.Tests;


import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    Job jobObj1;
    Job jobObj2;
    Job emptyJobObj;

    @Before
    public void createObjects() {

        jobObj1 = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));;
        jobObj2 = new Job("Some job", new Employer("Some employer"),
                new Location("Some location"), new PositionType("Some pos"),
                new CoreCompetency("Some cc"));
        emptyJobObj  = new Job("", new Employer(""),
                new Location(""), new PositionType(""),
                new CoreCompetency(""));
    }

    @Test
    public void testSettingJobId() {

         assertEquals(jobObj2.getId(), jobObj1.getId()+1);
    }

    @Test
    public void testJobConstructorSetsAllFields() {

        assertEquals(true, jobObj1.getName() instanceof String);
        assertEquals("Product tester", jobObj1.getName());

        assertEquals(true, jobObj1.getEmployer() instanceof Employer);
        assertEquals("ACME", jobObj1.getEmployer().getValue());

        assertEquals(true, jobObj1.getLocation() instanceof Location);
        assertEquals("Desert", jobObj1.getLocation().getValue());

        assertEquals(true, jobObj1.getPositionType() instanceof PositionType);
        assertEquals("Quality control", jobObj1.getPositionType().getValue());

        assertEquals(true, jobObj1.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Persistence", jobObj1.getCoreCompetency().getValue());
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

    @Test
    public void testToStringWithStartingAndEndingBlankSpace() {

        assertEquals('\n', jobObj1.toString().charAt(0));
        assertEquals('\n', jobObj1.toString().charAt(jobObj1.toString().length()-1));
    }

    @Test
    public void testToStringWithFieldLabels() {

        assertEquals(true, jobObj1.toString().contains("\n" + "ID:"));
        assertEquals(true, jobObj1.toString().contains("\n" + "Name:"));
        assertEquals(true, jobObj1.toString().contains("\n" + "Employer:"));
        assertEquals(true, jobObj1.toString().contains("\n" + "Location:"));
        assertEquals(true, jobObj1.toString().contains("\n" + "Position Type:"));
        assertEquals(true, jobObj1.toString().contains("\n" + "Core Competency"));
    }
    @Test
    public void testToStringWithEmptyFields() {

       // assertTrue(emptyJobObj.toString().contains("\n" + "ID: " + "Data Not Available: "));
        assertTrue(emptyJobObj.toString().contains("\n" + "Name: " + "Data Not Available: "));
        assertTrue(emptyJobObj.toString().contains("\n" + "Employer: " + "Data Not Available: "));
        assertTrue(emptyJobObj.toString().contains("\n" + "Location: " + "Data Not Available: "));
        assertTrue(emptyJobObj.toString().contains("\n" + "Position Type: " + "Data Not Available: "));
        assertTrue(emptyJobObj.toString().contains("\n" + "Core Competency: " + "Data Not Available: "));

    }

}



