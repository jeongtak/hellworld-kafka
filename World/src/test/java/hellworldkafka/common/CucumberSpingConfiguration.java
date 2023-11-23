package hellworldkafka.common;

import hellworldkafka.WorldApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { WorldApplication.class })
public class CucumberSpingConfiguration {}
