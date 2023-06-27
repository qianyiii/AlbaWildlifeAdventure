package com.qianyi.albawildlifeadventure;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.io.IOException;

public class AdventureGame extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        // Create a BorderPane
        BorderPane borderPane = new BorderPane();

        // Set the background image
        Image image = new Image(AdventureGame.class.getResource("Alba a Wildlife Adventure.png").toString());
        ImageView backgroundImageView = new ImageView(image);
        backgroundImageView.fitWidthProperty().bind(stage.widthProperty());
        backgroundImageView.fitHeightProperty().bind(stage.heightProperty());
        borderPane.getChildren().add(backgroundImageView);

        // Game Name
        Label gameNameLabel = new Label("Alba Wildlife Adventure");
        gameNameLabel.setStyle("-fx-font-weight: bold");
        gameNameLabel.setFont(Font.font("Times New Roman", 17));
        gameNameLabel.setTextFill(Color.WHITE);
        BorderPane.setMargin(gameNameLabel, new Insets(5));
        borderPane.setLeft(gameNameLabel);

        //Menu Bar
        MenuBar menuBar = new MenuBar();

        //customize the style of menu bar
        menuBar.setStyle("-fx-background-color: #3d3d3d; -fx-color: #000000; -fx-alignment: center;");

        Menu menuMenu = new Menu("Menu");
        Menu menuDocs = new Menu("Docs");
        Menu menuWhitepaper = new Menu("Whitepaper");

        menuBar.getMenus().addAll(menuMenu, menuDocs, menuWhitepaper);

        BorderPane.setAlignment(menuBar, Pos.TOP_CENTER);
        borderPane.setTop(menuBar);

        // Social Media Icons
        ImageView facebookIcon = new ImageView(new Image(AdventureGame.class.getResource("facebook.png").toString()));
        facebookIcon.setFitWidth(25);
        facebookIcon.setFitHeight(25);

        ImageView instagramIcon = new ImageView(new Image(AdventureGame.class.getResource("Instagram.png").toString()));
        instagramIcon.setFitWidth(25);
        instagramIcon.setFitHeight(25);

        ImageView twitterIcon = new ImageView(new Image(AdventureGame.class.getResource("twitter.png").toString()));
        twitterIcon.setFitWidth(25);
        twitterIcon.setFitHeight(25);

        HBox socialMediaIcons = new HBox(facebookIcon, instagramIcon, twitterIcon);
        socialMediaIcons.setSpacing(10);
        socialMediaIcons.setAlignment(Pos.TOP_RIGHT);
        borderPane.setRight(socialMediaIcons);

        // Grid Pane for game name, menu bar, and social media icons
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.TOP_CENTER);
        gridPane.setPadding(new Insets(5));
        gridPane.setHgap(100);
        gridPane.add(gameNameLabel, 0, 0);
        gridPane.add(menuBar, 1, 0);
        gridPane.add(socialMediaIcons, 2, 0);

        // Set the GridPane at the top of the BorderPane
        borderPane.setTop(gridPane);

        // Tagline
        Text taglineLabel = new Text("Fun. Wonderful. Exploring.");
        taglineLabel.setFont(Font.font("Comic Sans MS", 35));
        taglineLabel.setStyle("-fx-font-weight: bold");
        taglineLabel.setFill(Color.WHITE);
        taglineLabel.setWrappingWidth(220); // Set the desired width for wrapping

        // Compelling Message
        Text messageLabel = new Text("A fun adventure game where take action to protect wildlife while exploring the world.");
        messageLabel.setFont(Font.font("Arial", FontPosture.ITALIC, 15));
        messageLabel.setFill(Color.YELLOW);
        messageLabel.setWrappingWidth(250); // Set the desired width for wrapping

        // Play Button
        Button playButton = new Button("Play");
        playButton.setFont(Font.font("Arial", 14));
        playButton.setPrefWidth(100);

        VBox centerContainer = new VBox(taglineLabel, messageLabel, playButton);
        centerContainer.setAlignment(Pos.CENTER);
        centerContainer.setSpacing(17);
        BorderPane.setMargin(centerContainer, new Insets(10));
        borderPane.setCenter(centerContainer);

        Scene scene = new Scene(borderPane, 700, 700);

        stage.setTitle("Alba - a Wildlife Adventure Game");

        stage.setScene(scene);

        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }
}