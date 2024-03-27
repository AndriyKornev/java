package lab4;

import controllerLab4.UniversityCreator;
import modelLab4.University;

import org.junit.Test;
import org.junit.Assert;

public class JsonTest {
    @Test
    public void testFileWriteJsonToFile() {

        String filePath = "./src/PackageTest/JSON.json";

        JsonManager jsonManager = new JsonManager();
        UniversityCreator universityCreator = new UniversityCreator();

        University originalUniversity = universityCreator.createTypicalUniversity();

        jsonManager.writeToJson(originalUniversity, filePath);
        University readUniversity = (University) jsonManager.readFromJson(filePath);

        Assert.assertEquals(readUniversity, originalUniversity);
    }
}
