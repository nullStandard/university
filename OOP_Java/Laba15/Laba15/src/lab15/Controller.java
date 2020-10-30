package lab15;

import javafx.application.Application; 
import javafx.beans.property.SimpleStringProperty; 
import javafx.collections.FXCollections; 
import javafx.collections.ObservableList; 
import javafx.event.ActionEvent; 
import javafx.geometry.Insets; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.scene.control.Button; 
import javafx.scene.control.Label; 
import javafx.scene.control.TableColumn; 
import javafx.scene.control.TableView; 
import javafx.scene.control.TextField; 
import javafx.scene.control.cell.PropertyValueFactory; 
import javafx.scene.layout.HBox; 
import javafx.scene.layout.VBox; 
import javafx.scene.text.Font; 
import javafx.stage.Stage; 
 
public class Controller extends Application { 
 
    private final TableView<TradePoint> table = new TableView<>(); 
    private final ObservableList<TradePoint> data =      FXCollections.observableArrayList( 
                    new TradePoint( "Bruce", "1SalmanelaStreet","vdsvsdv", "Rich", 
"Tuesday", "17:00"),                     
                    new TradePoint( "Jason", "2SalmanelaStreet","iyx553535", "Cook", 
"Tuesday", "11:00"), 
                    new TradePoint( "Steve", "3SalmanelaStreet","d880553535", 
"Soldier", "Tuesday", "16:00"), 
                    new TradePoint( "Thor", "4SalmanelaStreet","fg880553535", 
"Superhero", "Tuesday", "14:00"), 
                    new TradePoint( "Joe", "5SalmanelaStreet","qwadfggfhhn", "Cook", 
"Tuesday", "17:00")); 
    final HBox hb = new HBox(); 
 
    public static void main(String[] args) { 
        launch(args); 
    } 
 
    @Override 
    public void start(Stage stage) { 
        Scene scene = new Scene(new Group()); 
        stage.setTitle("Trade Points");         
        stage.setWidth(650); 
        stage.setHeight(550); 
 
        final Label label = new Label("Trade Point");         
        label.setFont(new Font("Arial", 20)); 
 
        table.setEditable(true); 
 
        TableColumn nameCol = new TableColumn("Name"); 
        nameCol.setMinWidth(100);         
        nameCol.setCellValueFactory( 
                new PropertyValueFactory<>("name")); 
 
        TableColumn adressCol = new TableColumn("Adress"); 
        adressCol.setMinWidth(100);         
        adressCol.setCellValueFactory( 
                new PropertyValueFactory<>("adress")); 
 
        TableColumn numberCol = new TableColumn("Number"); 
        numberCol.setMinWidth(100);         numberCol.setCellValueFactory( 
                new PropertyValueFactory<>("number")); 
 
        TableColumn specializationCol = new TableColumn("Specialization");         
        specializationCol.setMinWidth(100);         
        specializationCol.setCellValueFactory( 
                new PropertyValueFactory<>("specialization")); 
 
        TableColumn dayCol = new TableColumn("Day"); 
        dayCol.setMinWidth(100);         dayCol.setCellValueFactory( 
                new PropertyValueFactory<>("day")); 
 
        TableColumn timeCol = new TableColumn("Time"); 
        timeCol.setMinWidth(100);         timeCol.setCellValueFactory( 
                new PropertyValueFactory<>("time")); 
 
        table.setItems(data); 
        table.getColumns().addAll(nameCol, adressCol, numberCol, specializationCol, dayCol, timeCol); 
 
        final TextField addName = new TextField();         
        addName.setPromptText("Name"); 
        addName.setMaxWidth(nameCol.getPrefWidth()); 
 
        final TextField addAdress = new TextField();         
        addAdress.setMaxWidth(adressCol.getPrefWidth());         
        addAdress.setPromptText("Adress"); 
 
        final TextField addNumbers = new TextField();         
        addNumbers.setMaxWidth(numberCol.getPrefWidth());         
        addNumbers.setPromptText("Number"); 
 
        final TextField addSpecialization = new TextField();         
        addSpecialization.setMaxWidth(specializationCol.getPrefWidth());         
        addSpecialization.setPromptText("Specialization"); 
 
        final TextField addDay = new TextField();         
        addDay.setMaxWidth(dayCol.getPrefWidth());         
        addDay.setPromptText("Day"); 
 
        final TextField addTime = new TextField();         
        addTime.setMaxWidth(timeCol.getPrefWidth());         
        addTime.setPromptText("Time"); 
 
        final Button addButton = new Button("Add");         
        addButton.setOnAction((ActionEvent e) -> { 
            data.add(new TradePoint(addName.getText(),                     
            		addAdress.getText(),                     
            		addNumbers.getText(),                     
            		addSpecialization.getText(),                    
            		addDay.getText(),                    
            		addTime.getText()));            
            addName.clear();             
            addAdress.clear();             
            addNumbers.clear();             
            addSpecialization.clear();             
            addDay.clear(); 
            addTime.clear(); 
        }); 
 
        hb.getChildren().addAll(addName, addAdress, addNumbers, addSpecialization, addDay, addTime, addButton);        
        hb.setSpacing(10); 
 
        final VBox vbox = new VBox(); 
        vbox.setSpacing(10);         
        vbox.setPadding(new Insets(10, 0, 0, 10));         
        vbox.getChildren().addAll(label, table, hb); 
 
        ((Group) scene.getRoot()).getChildren().addAll(vbox); 
 
        stage.setScene(scene);         
        stage.show(); 
    } 
