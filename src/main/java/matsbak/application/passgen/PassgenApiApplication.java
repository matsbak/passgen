package matsbak.application.passgen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;

/**
 * The PassgenApiApplication class represents the application runner class.
 * 
 * @author Mats Bakketeig
 * @version v1.0.0 (2025.01.06)
 */
@SpringBootApplication
public class PassgenApiApplication {
	/**
   * Serves as the main starting point of the application. The operating system on the computer
	 * expects to find a publicly available method it can call without having to create an instance
	 * of a class first.
   * 
   * <p>This method is standardized across programming languages and operating systems and must
   * have the method signature given below.</p>
   *
   * @param args A fixed sized array of strings holding arguments provided from the command line
   *             during the startup of the application
   */
	public static void main(String[] args) {
		// Adds a listener to a PID file
		SpringApplication springApplication = new SpringApplication(PassgenApiApplication.class);
		springApplication.addListeners(new ApplicationPidFileWriter("passgen.pid"));
		// Runs the backend application
		SpringApplication.run(PassgenApiApplication.class, args);
	}
}
