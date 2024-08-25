package co.edu.uniquindio.agendacitasfx.adendamiento_citasfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CitasApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CitasApplication.class.getResource("AgendaCitas.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Perfect Nails");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}