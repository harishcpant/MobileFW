package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecuteResultHandler;
import org.apache.commons.exec.DefaultExecutor;

import java.io.IOException;

public class MobileStep {
    @Given("I open the website in chrome")
    public void i_open_the_website_in_chrome() {
        System.out.println("I open the website in chrome");
    }
    @Then("Website should load")
    public void website_should_load() {
        System.out.println("Website should load");
    }

    public void startServer() {
        CommandLine cmd = new CommandLine("C:\\Program Files (x86)\\Appium\\node.exe");
        cmd.addArgument("C:\\Program Files (x86)\\Appium\\node_modules\\appium\\bin\\Appium.js");
        cmd.addArgument("--address");
        cmd.addArgument("0.0.0.0");
        cmd.addArgument("--port");
        cmd.addArgument("4723");

        DefaultExecuteResultHandler handler = new DefaultExecuteResultHandler();
        DefaultExecutor executor = new DefaultExecutor();
        executor.setExitValue(1);
        try {
            executor.execute(cmd, handler);
            Thread.sleep(10000);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }


}
