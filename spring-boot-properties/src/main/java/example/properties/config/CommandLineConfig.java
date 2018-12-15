package example.properties.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author xiaokui
 * @Description:
 * @date 2018-04-24 22:17
 */
@Component
public class CommandLineConfig {

    @Value("${command-line-arg}")
    private String commandLineArg;

    public String getCommandLineArg() {
        return commandLineArg;
    }

    public void setCommandLineArg(String commandLineArg) {
        this.commandLineArg = commandLineArg;
    }

    @Override
    public String toString() {
        return "CommandLineConfig{" +
                "commandLineArg='" + commandLineArg + '\'' +
                '}';
    }
}
