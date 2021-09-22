package base;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

public class baseAPI
{
    FileReaderManager fileReaderManager;

    @BeforeClass
    public void base() throws IOException {
        fileReaderManager = new FileReaderManager();
        RestAssured.baseURI = fileReaderManager.getProperties("baseURI");
    }
}
