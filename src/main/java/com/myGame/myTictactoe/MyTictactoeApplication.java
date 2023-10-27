package com.myGame.myTictactoe;
import MainController.MainController;
import javafx.application.Application;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyTictactoeApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(MyTictactoeApplication.class, args);
	}

	/**
	 * MainController is the entryway into the game; includes the overridden fx Start() method and everything else that comes with it
	 */
	@Override
	public void run(String... args){ Application.launch(MainController.class, args); }

}
