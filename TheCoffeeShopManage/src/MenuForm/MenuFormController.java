
package MenuForm;

import Bill.Bill;
import CoffeeClass.DrinksMenu;
import Controller.DAO;
import FullBill.FullBill;
import Employee.Employee;
import LoginForm.LoginFormController;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXDialogLayout;
import com.jfoenix.controls.events.JFXDialogEvent;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.SnapshotParameters;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.ValueAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.effect.BoxBlur;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.WritableImage;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.util.StringConverter;
import javax.imageio.ImageIO;
import sun.security.util.Cache;


/**
 * FXML Controller class
 *
 * @author Hida
 */
public class MenuFormController implements Initializable {


    @FXML private StackPane rootpane;
    @FXML private AnchorPane anchorPane;
    @FXML private AnchorPane paneBill;
    @FXML private ScrollPane scrollItem;
    @FXML private HBox scroll;
    @FXML private VBox boxBill0;
    @FXML private Label lblDate0;
    @FXML private Label lblUser0;
    @FXML private HBox boxCartItem00;
    @FXML private Label lblIdItem00;
    @FXML private Label lblNameItem00;
    @FXML private Label lblNumberItem00;
    @FXML private Label lblPriceItem00;
    @FXML private Label lblTotalItem00;
    @FXML private HBox boxCartItem01;
    @FXML private Label lblIdItem01;
    @FXML private Label lblNameItem01;
    @FXML private Label lblNumberItem01;
    @FXML private Label lblPriceItem01;
    @FXML private Label lblTotalItem01;
    @FXML private HBox boxCartItem02;
    @FXML private Label lblIdItem02;
    @FXML private Label lblNameItem02;
    @FXML private Label lblNumberItem02;
    @FXML private Label lblPriceItem02;
    @FXML public Label lblPosition;
    @FXML Label lblNameAccount;
    @FXML private Label lblTotalItem02;
    @FXML private HBox boxCartItem03;
    @FXML private Label lblIdItem03;
    @FXML private Label lblNameItem03;
    @FXML private Label lblNumberItem03;
    @FXML private Label lblPriceItem03;
    @FXML private Label lblTotalItem03;
    @FXML private HBox boxCartItem04;
    @FXML private Label lblIdItem04;
    @FXML private Label lblNameItem04;
    @FXML private Label lblNumberItem04;
    @FXML private Label lblPriceItem04;
    @FXML private Label lblTotalItem04;
    @FXML private HBox boxCartItem05;
    @FXML private Label lblIdItem05;
    @FXML private Label lblNameItem05;
    @FXML private Label lblNumberItem05;
    @FXML private Label lblPriceItem05;
    @FXML private Label lblTotalItem05;
    @FXML private HBox boxCartItem06;
    @FXML private Label lblIdItem06;
    @FXML private Label lblNameItem06;
    @FXML private Label lblNumberItem06;
    @FXML private Label lblPriceItem06;
    @FXML private Label lblTotalItem06;
    @FXML private Label lblAllTotal0;
    @FXML private Button btnConfirmBill0;
    @FXML private VBox boxBill1;
    @FXML private Label lblDate1;
    @FXML private Label lblUser1;
    @FXML private HBox boxCartItem10;
    @FXML private Label lblIdItem10;
    @FXML private Label lblNameItem10;
    @FXML private Label lblNumberItem10;
    @FXML private Label lblPriceItem10;
    @FXML private Label lblTotalItem10;
    @FXML private HBox boxCartItem11;
    @FXML private Label lblIdItem11;
    @FXML private Label lblNameItem11;
    @FXML private Label lblNumberItem11;
    @FXML private Label lblPriceItem11;
    @FXML private Label lblTotalItem11;
    @FXML private HBox boxCartItem12;
    @FXML private Label lblIdItem12;
    @FXML private Label lblNameItem12;
    @FXML private Label lblNumberItem12;
    @FXML private Label lblPriceItem12;
    @FXML private Label lblTotalItem12;
    @FXML private HBox boxCartItem13;
    @FXML private Label lblIdItem13;
    @FXML private Label lblNameItem13;
    @FXML private Label lblNumberItem13;
    @FXML private Label lblPriceItem13;
    @FXML private Label lblTotalItem13;
    @FXML private HBox boxCartItem14;
    @FXML private Label lblIdItem14;
    @FXML private Label lblNameItem14;
    @FXML private Label lblNumberItem14;
    @FXML private Label lblPriceItem14;
    @FXML private Label lblTotalItem14;
    @FXML private HBox boxCartItem15;
    @FXML private Label lblIdItem15;
    @FXML private Label lblNameItem15;
    @FXML private Label lblNumberItem15;
    @FXML private Label lblPriceItem15;
    @FXML private Label lblTotalItem15;
    @FXML private HBox boxCartItem16;
    @FXML private Label lblIdItem16;
    @FXML private Label lblNameItem16;
    @FXML private Label lblNumberItem16;
    @FXML private Label lblPriceItem16;
    @FXML private Label lblTotalItem16;
    @FXML private Label lblAllTotal1;
    @FXML private Button btnConfirmBill1;
    @FXML private VBox boxBill2;
    @FXML private Label lblDate2;
    @FXML private Label lblUser2;
    @FXML private HBox boxCartItem20;
    @FXML private Label lblIdItem20;
    @FXML private Label lblNameItem20;
    @FXML private Label lblNumberItem20;
    @FXML private Label lblPriceItem20;
    @FXML private Label lblTotalItem20;
    @FXML private HBox boxCartItem21;
    @FXML private Label lblIdItem21;
    @FXML private Label lblNameItem21;
    @FXML private Label lblNumberItem21;
    @FXML private Label lblPriceItem21;
    @FXML private Label lblTotalItem21;
    @FXML private HBox boxCartItem22;
    @FXML private Label lblIdItem22;
    @FXML private Label lblNameItem22;
    @FXML private Label lblNumberItem22;
    @FXML private Label lblPriceItem22;
    @FXML private Label lblTotalItem22;
    @FXML private HBox boxCartItem23;
    @FXML private Label lblIdItem23;
    @FXML private Label lblNameItem23;
    @FXML private Label lblNumberItem23;
    @FXML private Label lblPriceItem23;
    @FXML private Label lblTotalItem23;
    @FXML private HBox boxCartItem24;
    @FXML private Label lblIdItem24;
    @FXML private Label lblNameItem24;
    @FXML private Label lblNumberItem24;
    @FXML private Label lblPriceItem24;
    @FXML private Label lblTotalItem24;
    @FXML private HBox boxCartItem25;
    @FXML private Label lblIdItem25;
    @FXML private Label lblNameItem25;
    @FXML private Label lblNumberItem25;
    @FXML private Label lblPriceItem25;
    @FXML private Label lblTotalItem25;
    @FXML private HBox boxCartItem26;
    @FXML private Label lblIdItem26;
    @FXML private Label lblNameItem26;
    @FXML private Label lblNumberItem26;
    @FXML private Label lblPriceItem26;
    @FXML private Label lblTotalItem26;
    @FXML private Label lblAllTotal2;
    @FXML private Button btnConfirmBill2;
    @FXML private VBox boxBill3;
    @FXML private Label lblDate3;
    @FXML private Label lblUser3;
    @FXML private HBox boxCartItem30;
    @FXML private Label lblIdItem30;
    @FXML private Label lblNameItem30;
    @FXML private Label lblNumberItem30;
    @FXML private Label lblPriceItem30;
    @FXML private Label lblTotalItem30;
    @FXML private HBox boxCartItem31;
    @FXML private Label lblIdItem31;
    @FXML private Label lblNameItem31;
    @FXML private Label lblNumberItem31;
    @FXML private Label lblPriceItem31;
    @FXML private Label lblTotalItem31;
    @FXML private HBox boxCartItem32;
    @FXML private Label lblIdItem32;
    @FXML private Label lblNameItem32;
    @FXML private Label lblNumberItem32;
    @FXML private Label lblPriceItem32;
    @FXML private Label lblTotalItem32;
    @FXML private HBox boxCartItem33;
    @FXML private Label lblIdItem33;
    @FXML private Label lblNameItem33;
    @FXML private Label lblNumberItem33;
    @FXML private Label lblPriceItem33;
    @FXML private Label lblTotalItem33;
    @FXML private HBox boxCartItem34;
    @FXML private Label lblIdItem34;
    @FXML private Label lblNameItem34;
    @FXML private Label lblNumberItem34;
    @FXML private Label lblPriceItem34;
    @FXML private Label lblTotalItem34;
    @FXML private HBox boxCartItem35;
    @FXML private Label lblIdItem35;
    @FXML private Label lblNameItem35;
    @FXML private Label lblNumberItem35;
    @FXML private Label lblPriceItem35;
    @FXML private Label lblTotalItem35;
    @FXML private HBox boxCartItem36;
    @FXML private Label lblIdItem36;
    @FXML private Label lblNameItem36;
    @FXML private Label lblNumberItem36;
    @FXML private Label lblPriceItem36;
    @FXML private Label lblTotalItem36;
    @FXML private Label lblAllTotal3;
    @FXML private Button btnConfirmBill3;
    @FXML private VBox boxBill4;
    @FXML private Label lblDate4;
    @FXML private Label lblUser4;
    @FXML private HBox boxCartItem40;
    @FXML private Label lblIdItem40;
    @FXML private Label lblNameItem40;
    @FXML private Label lblNumberItem40;
    @FXML private Label lblPriceItem40;
    @FXML private Label lblTotalItem40;
    @FXML private HBox boxCartItem41;
    @FXML private Label lblIdItem41;
    @FXML private Label lblNameItem41;
    @FXML private Label lblNumberItem41;
    @FXML private Label lblPriceItem41;
    @FXML private Label lblTotalItem41;
    @FXML private HBox boxCartItem42;
    @FXML private Label lblIdItem42;
    @FXML private Label lblNameItem42;
    @FXML private Label lblNumberItem42;
    @FXML private Label lblPriceItem42;
    @FXML private Label lblTotalItem42;
    @FXML private HBox boxCartItem43;
    @FXML private Label lblIdItem43;
    @FXML private Label lblNameItem43;
    @FXML private Label lblNumberItem43;
    @FXML private Label lblPriceItem43;
    @FXML private Label lblTotalItem43;
    @FXML private HBox boxCartItem44;
    @FXML private Label lblIdItem44;
    @FXML private Label lblNameItem44;
    @FXML private Label lblNumberItem44;
    @FXML private Label lblPriceItem44;
    @FXML private Label lblTotalItem44;
    @FXML private HBox boxCartItem45;
    @FXML private Label lblIdItem45;
    @FXML private Label lblNameItem45;
    @FXML private Label lblNumberItem45;
    @FXML private Label lblPriceItem45;
    @FXML private Label lblTotalItem45;
    @FXML private HBox boxCartItem46;
    @FXML private Label lblIdItem46;
    @FXML private Label lblNameItem46;
    @FXML private Label lblNumberItem46;
    @FXML private Label lblPriceItem46;
    @FXML private Label lblTotalItem46;
    @FXML private Label lblAllTotal4;
    @FXML private Button btnConfirmBill4;
    @FXML private VBox boxBill5;
    @FXML private Label lblDate5;
    @FXML private Label lblUser5;
    @FXML private HBox boxCartItem50;
    @FXML private Label lblIdItem50;
    @FXML private Label lblNameItem50;
    @FXML private Label lblNumberItem50;
    @FXML private Label lblPriceItem50;
    @FXML private Label lblTotalItem50;
    @FXML private HBox boxCartItem51;
    @FXML private Label lblIdItem51;
    @FXML private Label lblNameItem51;
    @FXML private Label lblNumberItem51;
    @FXML private Label lblPriceItem51;
    @FXML private Label lblTotalItem51;
    @FXML private HBox boxCartItem52;
    @FXML private Label lblIdItem52;
    @FXML private Label lblNameItem52;
    @FXML private Label lblNumberItem52;
    @FXML private Label lblPriceItem52;
    @FXML private Label lblTotalItem52;
    @FXML private HBox boxCartItem53;
    @FXML private Label lblIdItem53;
    @FXML private Label lblNameItem53;
    @FXML private Label lblNumberItem53;
    @FXML private Label lblPriceItem53;
    @FXML private Label lblTotalItem53;
    @FXML private HBox boxCartItem54;
    @FXML private Label lblIdItem54;
    @FXML private Label lblNameItem54;
    @FXML private Label lblNumberItem54;
    @FXML private Label lblPriceItem54;
    @FXML private Label lblTotalItem54;
    @FXML private HBox boxCartItem55;
    @FXML private Label lblIdItem55;
    @FXML private Label lblNameItem55;
    @FXML private Label lblNumberItem55;
    @FXML private Label lblPriceItem55;
    @FXML private Label lblTotalItem55;
    @FXML private HBox boxCartItem56;
    @FXML private Label lblIdItem56;
    @FXML private Label lblNameItem56;
    @FXML private Label lblNumberItem56;
    @FXML private Label lblPriceItem56;
    @FXML private Label lblTotalItem56;
    @FXML private Label lblAllTotal5;
    @FXML private Button btnConfirmBill5;
    @FXML private VBox boxBill6;
    @FXML private Label lblDate6;
    @FXML private Label lblUser6;
    @FXML private HBox boxCartItem60;
    @FXML private Label lblIdItem60;
    @FXML private Label lblNameItem60;
    @FXML private Label lblNumberItem60;
    @FXML private Label lblPriceItem60;
    @FXML private Label lblTotalItem60;
    @FXML private HBox boxCartItem61;
    @FXML private Label lblIdItem61;
    @FXML private Label lblNameItem61;
    @FXML private Label lblNumberItem61;
    @FXML private Label lblPriceItem61;
    @FXML private Label lblTotalItem61;
    @FXML private HBox boxCartItem62;
    @FXML private Label lblIdItem62;
    @FXML private Label lblNameItem62;
    @FXML private Label lblNumberItem62;
    @FXML private Label lblPriceItem62;
    @FXML private Label lblTotalItem62;
    @FXML private HBox boxCartItem63;
    @FXML private Label lblIdItem63;
    @FXML private Label lblNameItem63;
    @FXML private Label lblNumberItem63;
    @FXML private Label lblPriceItem63;
    @FXML private Label lblTotalItem63;
    @FXML private HBox boxCartItem64;
    @FXML private Label lblIdItem64;
    @FXML private Label lblNameItem64;
    @FXML private Label lblNumberItem64;
    @FXML private Label lblPriceItem64;
    @FXML private Label lblTotalItem64;
    @FXML private HBox boxCartItem65;
    @FXML private Label lblIdItem65;
    @FXML private Label lblNameItem65;
    @FXML private Label lblNumberItem65;
    @FXML private Label lblPriceItem65;
    @FXML private Label lblTotalItem65;
    @FXML private HBox boxCartItem66;
    @FXML private Label lblIdItem66;
    @FXML private Label lblNameItem66;
    @FXML private Label lblNumberItem66;
    @FXML private Label lblPriceItem66;
    @FXML private Label lblTotalItem66;
    @FXML private Label lblAllTotal6;
    @FXML private Button btnConfirmBill6;
    @FXML private VBox boxBill7;
    @FXML private Label lblDate7;
    @FXML private Label lblUser7;
    @FXML private HBox boxCartItem70;
    @FXML private Label lblIdItem70;
    @FXML private Label lblNameItem70;
    @FXML private Label lblNumberItem70;
    @FXML private Label lblPriceItem70;
    @FXML private Label lblTotalItem70;
    @FXML private HBox boxCartItem71;
    @FXML private Label lblIdItem71;
    @FXML private Label lblNameItem71;
    @FXML private Label lblNumberItem71;
    @FXML private Label lblPriceItem71;
    @FXML private Label lblTotalItem71;
    @FXML private HBox boxCartItem72;
    @FXML private Label lblIdItem72;
    @FXML private Label lblNameItem72;
    @FXML private Label lblNumberItem72;
    @FXML private Label lblPriceItem72;
    @FXML private Label lblTotalItem72;
    @FXML private HBox boxCartItem73;
    @FXML private Label lblIdItem73;
    @FXML private Label lblNameItem73;
    @FXML private Label lblNumberItem73;
    @FXML private Label lblPriceItem73;
    @FXML private Label lblTotalItem73;
    @FXML private HBox boxCartItem74;
    @FXML private Label lblIdItem74;
    @FXML private Label lblNameItem74;
    @FXML private Label lblNumberItem74;
    @FXML private Label lblPriceItem74;
    @FXML private Label lblTotalItem74;
    @FXML private HBox boxCartItem75;
    @FXML private Label lblIdItem75;
    @FXML private Label lblNameItem75;
    @FXML private Label lblNumberItem75;
    @FXML private Label lblPriceItem75;
    @FXML private Label lblTotalItem75;
    @FXML private HBox boxCartItem76;
    @FXML private Label lblIdItem76;
    @FXML private Label lblNameItem76;
    @FXML private Label lblNumberItem76;
    @FXML private Label lblPriceItem76;
    @FXML private Label lblTotalItem76;
    @FXML private Label lblAllTotal7;
    @FXML private Button btnConfirmBill7;
    @FXML private ScrollPane scrollItem1;
    @FXML private HBox scroll1;
    @FXML private VBox boxBill01;
    @FXML private Label lblDate01;
    @FXML private Label lblUser01;
    @FXML private HBox boxCartItem001;
    @FXML private Label lblIdItem001;
    @FXML private Label lblNameItem001;
    @FXML private Label lblNumberItem001;
    @FXML private Label lblPriceItem001;
    @FXML private Label lblTotalItem001;
    @FXML private HBox boxCartItem011;
    @FXML private Label lblIdItem011;
    @FXML private Label lblNameItem011;
    @FXML private Label lblNumberItem011;
    @FXML private Label lblPriceItem011;
    @FXML private Label lblTotalItem011;
    @FXML private HBox boxCartItem021;
    @FXML private Label lblIdItem021;
    @FXML private Label lblNameItem021;
    @FXML private Label lblNumberItem021;
    @FXML private Label lblPriceItem021;
    @FXML private Label lblTotalItem021;
    @FXML private HBox boxCartItem031;
    @FXML private Label lblIdItem031;
    @FXML private Label lblNameItem031;
    @FXML private Label lblNumberItem031;
    @FXML private Label lblPriceItem031;
    @FXML private Label lblTotalItem031;
    @FXML private HBox boxCartItem041;
    @FXML private Label lblIdItem041;
    @FXML private Label lblNameItem041;
    @FXML private Label lblNumberItem041;
    @FXML private Label lblPriceItem041;
    @FXML private Label lblTotalItem041;
    @FXML private HBox boxCartItem051;
    @FXML private Label lblIdItem051;
    @FXML private Label lblNameItem051;
    @FXML private Label lblNumberItem051;
    @FXML private Label lblPriceItem051;
    @FXML private Label lblTotalItem051;
    @FXML private HBox boxCartItem061;
    @FXML private Label lblIdItem061;
    @FXML private Label lblNameItem061;
    @FXML private Label lblNumberItem061;
    @FXML private Label lblPriceItem061;
    @FXML private Label lblTotalItem061;
    @FXML private Label lblAllTotal01;
    @FXML private VBox boxBill11;
    @FXML private Label lblDate11;
    @FXML private Label lblUser11;
    @FXML private HBox boxCartItem101;
    @FXML private Label lblIdItem101;
    @FXML private Label lblNameItem101;
    @FXML private Label lblNumberItem101;
    @FXML private Label lblPriceItem101;
    @FXML private Label lblTotalItem101;
    @FXML private HBox boxCartItem111;
    @FXML private Label lblIdItem111;
    @FXML private Label lblNameItem111;
    @FXML private Label lblNumberItem111;
    @FXML private Label lblPriceItem111;
    @FXML private Label lblTotalItem111;
    @FXML private HBox boxCartItem121;
    @FXML private Label lblIdItem121;
    @FXML private Label lblNameItem121;
    @FXML private Label lblNumberItem121;
    @FXML private Label lblPriceItem121;
    @FXML private Label lblTotalItem121;
    @FXML private HBox boxCartItem131;
    @FXML private Label lblIdItem131;
    @FXML private Label lblNameItem131;
    @FXML private Label lblNumberItem131;
    @FXML private Label lblPriceItem131;
    @FXML private Label lblTotalItem131;
    @FXML private HBox boxCartItem141;
    @FXML private Label lblIdItem141;
    @FXML private Label lblNameItem141;
    @FXML private Label lblNumberItem141;
    @FXML private Label lblPriceItem141;
    @FXML private Label lblTotalItem141;
    @FXML private HBox boxCartItem151;
    @FXML private Label lblIdItem151;
    @FXML private Label lblNameItem151;
    @FXML private Label lblNumberItem151;
    @FXML private Label lblPriceItem151;
    @FXML private Label lblTotalItem151;
    @FXML private HBox boxCartItem161;
    @FXML private Label lblIdItem161;
    @FXML private Label lblNameItem161;
    @FXML private Label lblNumberItem161;
    @FXML private Label lblPriceItem161;
    @FXML private Label lblTotalItem161;
    @FXML private Label lblAllTotal11;
    @FXML private VBox boxBill21;
    @FXML private Label lblDate21;
    @FXML private Label lblUser21;
    @FXML private HBox boxCartItem201;
    @FXML private Label lblIdItem201;
    @FXML private Label lblNameItem201;
    @FXML private Label lblNumberItem201;
    @FXML private Label lblPriceItem201;
    @FXML private Label lblTotalItem201;
    @FXML private HBox boxCartItem211;
    @FXML private Label lblIdItem211;
    @FXML private Label lblNameItem211;
    @FXML private Label lblNumberItem211;
    @FXML private Label lblPriceItem211;
    @FXML private Label lblTotalItem211;
    @FXML private HBox boxCartItem221;
    @FXML private Label lblIdItem221;
    @FXML private Label lblNameItem221;
    @FXML private Label lblNumberItem221;
    @FXML private Label lblPriceItem221;
    @FXML private Label lblTotalItem221;
    @FXML private HBox boxCartItem231;
    @FXML private Label lblIdItem231;
    @FXML private Label lblNameItem231;
    @FXML private Label lblNumberItem231;
    @FXML private Label lblPriceItem231;
    @FXML private Label lblTotalItem231;
    @FXML private HBox boxCartItem241;
    @FXML private Label lblIdItem241;
    @FXML private Label lblNameItem241;
    @FXML private Label lblNumberItem241;
    @FXML private Label lblPriceItem241;
    @FXML private Label lblTotalItem241;
    @FXML private HBox boxCartItem251;
    @FXML private Label lblIdItem251;
    @FXML private Label lblNameItem251;
    @FXML private Label lblNumberItem251;
    @FXML private Label lblPriceItem251;
    @FXML private Label lblTotalItem251;
    @FXML private HBox boxCartItem261;
    @FXML private Label lblIdItem261;
    @FXML private Label lblNameItem261;
    @FXML private Label lblNumberItem261;
    @FXML private Label lblPriceItem261;
    @FXML private Label lblTotalItem261;
    @FXML private Label lblAllTotal21;
    @FXML private VBox boxBill31;
    @FXML private Label lblDate31;
    @FXML private Label lblUser31;
    @FXML private HBox boxCartItem301;
    @FXML private Label lblIdItem301;
    @FXML private Label lblNameItem301;
    @FXML private Label lblNumberItem301;
    @FXML private Label lblPriceItem301;
    @FXML private Label lblTotalItem301;
    @FXML private HBox boxCartItem311;
    @FXML private Label lblIdItem311;
    @FXML private Label lblNameItem311;
    @FXML private Label lblNumberItem311;
    @FXML private Label lblPriceItem311;
    @FXML private Label lblTotalItem311;
    @FXML private HBox boxCartItem321;
    @FXML private Label lblIdItem321;
    @FXML private Label lblNameItem321;
    @FXML private Label lblNumberItem321;
    @FXML private Label lblPriceItem321;
    @FXML private Label lblTotalItem321;
    @FXML private HBox boxCartItem331;
    @FXML private Label lblIdItem331;
    @FXML private Label lblNameItem331;
    @FXML private Label lblNumberItem331;
    @FXML private Label lblPriceItem331;
    @FXML private Label lblTotalItem331;
    @FXML private HBox boxCartItem341;
    @FXML private Label lblIdItem341;
    @FXML private Label lblNameItem341;
    @FXML private Label lblNumberItem341;
    @FXML private Label lblPriceItem341;
    @FXML private Label lblTotalItem341;
    @FXML private HBox boxCartItem351;
    @FXML private Label lblIdItem351;
    @FXML private Label lblNameItem351;
    @FXML private Label lblNumberItem351;
    @FXML private Label lblPriceItem351;
    @FXML private Label lblTotalItem351;
    @FXML private HBox boxCartItem361;
    @FXML private Label lblIdItem361;
    @FXML private Label lblNameItem361;
    @FXML private Label lblNumberItem361;
    @FXML private Label lblPriceItem361;
    @FXML private Label lblTotalItem361;
    @FXML private Label lblAllTotal31;
    @FXML private VBox boxBill41;
    @FXML private Label lblDate41;
    @FXML private Label lblUser41;
    @FXML private HBox boxCartItem401;
    @FXML private Label lblIdItem401;
    @FXML private Label lblNameItem401;
    @FXML private Label lblNumberItem401;
    @FXML private Label lblPriceItem401;
    @FXML private Label lblTotalItem401;
    @FXML private HBox boxCartItem411;
    @FXML private Label lblIdItem411;
    @FXML private Label lblNameItem411;
    @FXML private Label lblNumberItem411;
    @FXML private Label lblPriceItem411;
    @FXML private Label lblTotalItem411;
    @FXML private HBox boxCartItem421;
    @FXML private Label lblIdItem421;
    @FXML private Label lblNameItem421;
    @FXML private Label lblNumberItem421;
    @FXML private Label lblPriceItem421;
    @FXML private Label lblTotalItem421;
    @FXML private HBox boxCartItem431;
    @FXML private Label lblIdItem431;
    @FXML private Label lblNameItem431;
    @FXML private Label lblNumberItem431;
    @FXML private Label lblPriceItem431;
    @FXML private Label lblTotalItem431;
    @FXML private HBox boxCartItem441;
    @FXML private Label lblIdItem441;
    @FXML private Label lblNameItem441;
    @FXML private Label lblNumberItem441;
    @FXML private Label lblPriceItem441;
    @FXML private Label lblTotalItem441;
    @FXML private HBox boxCartItem451;
    @FXML private Label lblIdItem451;
    @FXML private Label lblNameItem451;
    @FXML private Label lblNumberItem451;
    @FXML private Label lblPriceItem451;
    @FXML private Label lblTotalItem451;
    @FXML private HBox boxCartItem461;
    @FXML private Label lblIdItem461;
    @FXML private Label lblNameItem461;
    @FXML private Label lblNumberItem461;
    @FXML private Label lblPriceItem461;
    @FXML private Label lblTotalItem461;
    @FXML private Label lblAllTotal41;
    @FXML private VBox boxBill51;
    @FXML private Label lblDate51;
    @FXML private Label lblUser51;
    @FXML private HBox boxCartItem501;
    @FXML private Label lblIdItem501;
    @FXML private Label lblNameItem501;
    @FXML private Label lblNumberItem501;
    @FXML private Label lblPriceItem501;
    @FXML private Label lblTotalItem501;
    @FXML private HBox boxCartItem511;
    @FXML private Label lblIdItem511;
    @FXML private Label lblNameItem511;
    @FXML private Label lblNumberItem511;
    @FXML private Label lblPriceItem511;
    @FXML private Label lblTotalItem511;
    @FXML private HBox boxCartItem521;
    @FXML private Label lblIdItem521;
    @FXML private Label lblNameItem521;
    @FXML private Label lblNumberItem521;
    @FXML private Label lblPriceItem521;
    @FXML private Label lblTotalItem521;
    @FXML private HBox boxCartItem531;
    @FXML private Label lblIdItem531;
    @FXML private Label lblNameItem531;
    @FXML private Label lblNumberItem531;
    @FXML private Label lblPriceItem531;
    @FXML private Label lblTotalItem531;
    @FXML private HBox boxCartItem541;
    @FXML private Label lblIdItem541;
    @FXML private Label lblNameItem541;
    @FXML private Label lblNumberItem541;
    @FXML private Label lblPriceItem541;
    @FXML private Label lblTotalItem541;
    @FXML private HBox boxCartItem551;
    @FXML private Label lblIdItem551;
    @FXML private Label lblNameItem551;
    @FXML private Label lblNumberItem551;
    @FXML private Label lblPriceItem551;
    @FXML private Label lblTotalItem551;
    @FXML private HBox boxCartItem561;
    @FXML private Label lblIdItem561;
    @FXML private Label lblNameItem561;
    @FXML private Label lblNumberItem561;
    @FXML private Label lblPriceItem561;
    @FXML private Label lblTotalItem561;
    @FXML private Label lblAllTotal51;
    @FXML private VBox boxBill61;
    @FXML private Label lblDate61;
    @FXML private Label lblUser61;
    @FXML private HBox boxCartItem601;
    @FXML private Label lblIdItem601;
    @FXML private Label lblNameItem601;
    @FXML private Label lblNumberItem601;
    @FXML private Label lblPriceItem601;
    @FXML private Label lblTotalItem601;
    @FXML private HBox boxCartItem611;
    @FXML private Label lblIdItem611;
    @FXML private Label lblNameItem611;
    @FXML private Label lblNumberItem611;
    @FXML private Label lblPriceItem611;
    @FXML private Label lblTotalItem611;
    @FXML private HBox boxCartItem621;
    @FXML private Label lblIdItem621;
    @FXML private Label lblNameItem621;
    @FXML private Label lblNumberItem621;
    @FXML private Label lblPriceItem621;
    @FXML private Label lblTotalItem621;
    @FXML private HBox boxCartItem631;
    @FXML private Label lblIdItem631;
    @FXML private Label lblNameItem631;
    @FXML private Label lblNumberItem631;
    @FXML private Label lblPriceItem631;
    @FXML private Label lblTotalItem631;
    @FXML private HBox boxCartItem641;
    @FXML private Label lblIdItem641;
    @FXML private Label lblNameItem641;
    @FXML private Label lblNumberItem641;
    @FXML private Label lblPriceItem641;
    @FXML private Label lblTotalItem641;
    @FXML private HBox boxCartItem651;
    @FXML private Label lblIdItem651;
    @FXML private Label lblNameItem651;
    @FXML private Label lblNumberItem651;
    @FXML private Label lblPriceItem651;
    @FXML private Label lblTotalItem651;
    @FXML private HBox boxCartItem661;
    @FXML private Label lblIdItem661;
    @FXML private Label lblNameItem661;
    @FXML private Label lblNumberItem661;
    @FXML private Label lblPriceItem661;
    @FXML private Label lblTotalItem661;
    @FXML private Label lblAllTotal61;
    @FXML private VBox boxBill71;
    @FXML private Label lblDate71;
    @FXML private Label lblUser71;
    @FXML private HBox boxCartItem701;
    @FXML private Label lblIdItem701;
    @FXML private Label lblNameItem701;
    @FXML private Label lblNumberItem701;
    @FXML private Label lblPriceItem701;
    @FXML private Label lblTotalItem701;
    @FXML private HBox boxCartItem711;
    @FXML private Label lblIdItem711;
    @FXML private Label lblNameItem711;
    @FXML private Label lblNumberItem711;
    @FXML private Label lblPriceItem711;
    @FXML private Label lblTotalItem711;
    @FXML private HBox boxCartItem721;
    @FXML private Label lblIdItem721;
    @FXML private Label lblNameItem721;
    @FXML private Label lblNumberItem721;
    @FXML private Label lblPriceItem721;
    @FXML private Label lblTotalItem721;
    @FXML private HBox boxCartItem731;
    @FXML private Label lblIdItem731;
    @FXML private Label lblNameItem731;
    @FXML private Label lblNumberItem731;
    @FXML private Label lblPriceItem731;
    @FXML private Label lblTotalItem731;
    @FXML private HBox boxCartItem741;
    @FXML private Label lblIdItem741;
    @FXML private Label lblNameItem741;
    @FXML private Label lblNumberItem741;
    @FXML private Label lblPriceItem741;
    @FXML private Label lblTotalItem741;
    @FXML private HBox boxCartItem751;
    @FXML private Label lblIdItem751;
    @FXML private Label lblNameItem751;
    @FXML private Label lblNumberItem751;
    @FXML private Label lblPriceItem751;
    @FXML private Label lblTotalItem751;
    @FXML private HBox boxCartItem761;
    @FXML private Label lblIdItem761;
    @FXML private Label lblNameItem761;
    @FXML private Label lblNumberItem761;
    @FXML private Label lblPriceItem761;
    @FXML private Label lblTotalItem761;
    @FXML private Label lblAllTotal71;
    @FXML private Tab tabEditBill;
    @FXML private TableView<FullBill> tableViewBill;
    @FXML private TableColumn<FullBill, Integer> BillID;
    @FXML private TableColumn<FullBill, String> Username_tb;
    @FXML private TableColumn<FullBill, String> Date_tb;
    @FXML private TableColumn<FullBill, String> Time_tb;
    @FXML private TableColumn<FullBill, Integer> Total_tb;
    @FXML private TableColumn<FullBill, String> Status_tb;
    @FXML private TableView<DrinksMenu> tableViewMenuBill;
    @FXML private TableColumn<DrinksMenu, String> DrinkID_tb;
    @FXML private TableColumn<DrinksMenu, String> DrinkName_tb;
    @FXML private TableColumn<DrinksMenu, Integer> MSize_tb;
    @FXML private TableColumn<DrinksMenu, Integer> LSize_tb;
    @FXML private TableColumn<DrinksMenu, String> Type_tb;
    @FXML private TableColumn<DrinksMenu, String> DrinkStatus_tb;
    @FXML private ChoiceBox<String> lblUsername_Checked;
    @FXML private DatePicker date_Checked;
    @FXML private Label txtDrinkID_Checked0;
    @FXML private Label txtDrinkID_Checked1;
    @FXML private Label txtDrinkID_Checked2;
    @FXML private Label txtDrinkID_Checked3;
    @FXML private Label txtDrinkID_Checked4;
    @FXML private Label txtDrinkID_Checked5;
    @FXML private Label txtDrinkID_Checked6;
    @FXML private Label txtDrinkName_Checked0;
    @FXML private Label txtDrinkName_Checked1;
    @FXML private Label txtDrinkName_Checked2;
    @FXML private Label txtDrinkName_Checked3;
    @FXML private Label txtDrinkName_Checked4;
    @FXML private Label txtDrinkName_Checked5;
    @FXML private Label txtDrinkName_Checked6;
    @FXML private ChoiceBox<?> lblSize_Checked0;
    @FXML private ChoiceBox<?> lblSize_Checked1;
    @FXML private ChoiceBox<?> lblSize_Checked2;
    @FXML private ChoiceBox<?> lblSize_Checked3;
    @FXML private ChoiceBox<?> lblSize_Checked4;
    @FXML private ChoiceBox<?> lblSize_Checked5;
    @FXML private ChoiceBox<?> lblSize_Checked6;
    @FXML private Label txtPrice_Checked0;
    @FXML private Label txtPrice_Checked1;
    @FXML private Label txtPrice_Checked2;
    @FXML private Label txtPrice_Checked3;
    @FXML private Label txtPrice_Checked4;
    @FXML private Label txtPrice_Checked5;
    @FXML private Label txtPrice_Checked6;
    @FXML private TextField txtQuantity_Checked0;
    @FXML private TextField txtQuantity_Checked1;
    @FXML private TextField txtQuantity_Checked2;
    @FXML private TextField txtQuantity_Checked3;
    @FXML private TextField txtQuantity_Checked4;
    @FXML private TextField txtQuantity_Checked5;
    @FXML private TextField txtQuantity_Checked6;
    @FXML private Label txtTotal_Checked0;
    @FXML private Label txtTotal_Checked1;
    @FXML private Label txtTotal_Checked2;
    @FXML private Label txtTotal_Checked3;
    @FXML private Label txtTotal_Checked4;
    @FXML private Label txtTotal_Checked5;
    @FXML private Label txtTotal_Checked6;
    @FXML private Button btnCancelEdit;
    @FXML private Button btnDeleteDrinksEdit0;
    @FXML private Button btnDeleteDrinksEdit1;
    @FXML private Button btnDeleteDrinksEdit2;
    @FXML private Button btnDeleteDrinksEdit3;
    @FXML private Button btnDeleteDrinksEdit4;
    @FXML private Button btnDeleteDrinksEdit5;
    @FXML private Button btnDeleteDrinksEdit6;
    @FXML private Label txtAllTotal_Checked;
    @FXML private Label lblBillID_Checked;
    @FXML private AnchorPane paneRevenue;
    @FXML private Label lblDateStartError;
    @FXML private Label lblDateEndError;
    @FXML private Label lblDateStart;
    @FXML private Label lblDateEnd;
    @FXML private Label lblNum;
    @FXML private Label lblTotalBill;
    @FXML private DatePicker datePickerStart;
    @FXML private DatePicker datePickerEnd;
    @FXML private LineChart<String, Double> lineChart;
    @FXML private CategoryAxis xAxis;
    @FXML private ValueAxis yAxis;
    @FXML private AnchorPane paneManage;
    @FXML private TableView<DrinksMenu> tableViewMenu;
    @FXML private TableColumn<DrinksMenu, String> col_id;
    @FXML private TableColumn<DrinksMenu, String> col_name;
    @FXML private TableColumn<DrinksMenu, Integer> col_priceM;
    @FXML private TableColumn<DrinksMenu, Integer> col_priceL;
    @FXML private TableColumn<DrinksMenu, String> col_type;
    @FXML private TableColumn<DrinksMenu, String> col_drinkStatus;
    @FXML private TextField txtMenuName;
    @FXML private TextField txtMenuLPrice;
    @FXML private TextField txtMenuMPrice;
    @FXML private TextField txtMenuBrowse;
    @FXML private Label lblMenuNameError;
    @FXML private Label lblMenuLPriceError;
    @FXML private Label lblMenuImageError;
    @FXML private Label lblMenuMPriceError;
    @FXML private ChoiceBox<String> choiceBox_Type;
    @FXML private Label lblMenuTypeError;
    @FXML private AnchorPane paneAccount;
    @FXML private TextField txtUsername;
    @FXML private TextField txtPassword;
    @FXML private TextField txtName;
    @FXML private TextField txtTel;
    @FXML private ChoiceBox<String> choiceBox_Position;
    @FXML private Label lblUsernameError;
    @FXML private Label lblPasswordError;
    @FXML private Label lblNameError;
    @FXML private Label lblTelError;
    @FXML private Label lblBirthError;
    @FXML private Label lblPositionError;
    @FXML private TableView<Employee> tableViewAccount;
    @FXML private TableColumn<Employee, String> col_username;
    @FXML private TableColumn<Employee, String> col_password;
    @FXML private TableColumn<Employee, String> col_accountName;
    @FXML private TableColumn<Employee, String> col_tel;
    @FXML private TableColumn<Employee, String> col_birth;
    @FXML private TableColumn<Employee, String> col_position;
    @FXML private TableColumn<Employee, String> col_status;
    @FXML private DatePicker datePickerBirth;
    @FXML private AnchorPane paneMenu;
    @FXML private VBox boxCf0;
    @FXML private Label lblIdCf0;
    @FXML private ImageView imageCf0;
    @FXML private Label lblNameCf0;
    @FXML private Label lblPriceCf0;
    @FXML private Label lblMinusCf0;
    @FXML private TextField txtNumberCf0;
    @FXML private Label lblPlusCf0;
    @FXML private ChoiceBox<?> choiceBoxCf0;
    @FXML private Button btnAddCf0;
    @FXML private VBox boxCf1;
    @FXML private Label lblIdCf1;
    @FXML private ImageView imageCf1;
    @FXML private Label lblNameCf1;
    @FXML private Label lblPriceCf1;
    @FXML private Label lblMinusCf1;
    @FXML private TextField txtNumberCf1;
    @FXML private Label lblPlusCf1;
    @FXML private ChoiceBox<?> choiceBoxCf1;
    @FXML private Button btnAddCf1;
    @FXML private VBox boxCf2;
    @FXML private Label lblIdCf2;
    @FXML private ImageView imageCf2;
    @FXML private Label lblNameCf2;
    @FXML private Label lblPriceCf2;
    @FXML private Label lblMinusCf2;
    @FXML private TextField txtNumberCf2;
    @FXML private Label lblPlusCf2;
    @FXML private ChoiceBox<?> choiceBoxCf2;
    @FXML private Button btnAddCf2;
    @FXML private VBox boxCf3;
    @FXML private Label lblIdCf3;
    @FXML private ImageView imageCf3;
    @FXML private Label lblNameCf3;
    @FXML private Label lblPriceCf3;
    @FXML private Label lblMinusCf3;
    @FXML private TextField txtNumberCf3;
    @FXML private Label lblPlusCf3;
    @FXML private ChoiceBox<?> choiceBoxCf3;
    @FXML private Button btnAddCf3;
    @FXML private VBox boxCf4;
    @FXML private Label lblIdCf4;
    @FXML private ImageView imageCf4;
    @FXML private Label lblNameCf4;
    @FXML private Label lblPriceCf4;
    @FXML private Label lblMinusCf4;
    @FXML private TextField txtNumberCf4;
    @FXML private Label lblPlusCf4;
    @FXML private ChoiceBox<?> choiceBoxCf4;
    @FXML private Button btnAddCf4;
    @FXML private VBox boxCf5;
    @FXML private Label lblIdCf5;
    @FXML private ImageView imageCf5;
    @FXML private Label lblNameCf5;
    @FXML private Label lblPriceCf5;
    @FXML private Label lblMinusCf5;
    @FXML private TextField txtNumberCf5;
    @FXML private Label lblPlusCf5;
    @FXML private ChoiceBox<?> choiceBoxCf5;
    @FXML private Button btnAddCf5;
    @FXML private VBox boxCf6;
    @FXML private Label lblIdCf6;
    @FXML private ImageView imageCf6;
    @FXML private Label lblNameCf6;
    @FXML private Label lblPriceCf6;
    @FXML private Label lblMinusCf6;
    @FXML private TextField txtNumberCf6;
    @FXML private Label lblPlusCf6;
    @FXML private ChoiceBox<?> choiceBoxCf6;
    @FXML private Button btnAddCf6;
    @FXML private VBox boxCf7;
    @FXML private Label lblIdCf7;
    @FXML private ImageView imageCf7;
    @FXML private Label lblNameCf7;
    @FXML private Label lblPriceCf7;
    @FXML private Label lblMinusCf7;
    @FXML private TextField txtNumberCf7;
    @FXML private Label lblPlusCf7;
    @FXML private ChoiceBox<?> choiceBoxCf7;
    @FXML private Button btnAddCf7;
    @FXML private VBox boxIce0;
    @FXML private Label lblIdIce0;
    @FXML private ImageView imageIce0;
    @FXML private Label lblNameIce0;
    @FXML private Label lblPriceIce0;
    @FXML private Label lblMinusIce0;
    @FXML private TextField txtNumberIce0;
    @FXML private Label lblPlusIce0;
    @FXML private ChoiceBox<?> choiceBoxIce0;
    @FXML private Button btnAddIce0;
    @FXML private VBox boxIce1;
    @FXML private Label lblIdIce1;
    @FXML private ImageView imageIce1;
    @FXML private Label lblNameIce1;
    @FXML private Label lblPriceIce1;
    @FXML private Label lblMinusIce1;
    @FXML private TextField txtNumberIce1;
    @FXML private Label lblPlusIce1;
    @FXML private ChoiceBox<?> choiceBoxIce1;
    @FXML private Button btnAddIce1;
    @FXML private VBox boxIce2;
    @FXML private Label lblIdIce2;
    @FXML private ImageView imageIce2;
    @FXML private Label lblNameIce2;
    @FXML private Label lblPriceIce2;
    @FXML private Label lblMinusIce2;
    @FXML private TextField txtNumberIce2;
    @FXML private Label lblPlusIce2;
    @FXML private ChoiceBox<?> choiceBoxIce2;
    @FXML private Button btnAddIce2;
    @FXML private VBox boxIce3;
    @FXML private Label lblIdIce3;
    @FXML private ImageView imageIce3;
    @FXML private Label lblNameIce3;
    @FXML private Label lblPriceIce3;
    @FXML private Label lblMinusIce3;
    @FXML private TextField txtNumberIce3;
    @FXML private Label lblPlusIce3;
    @FXML private ChoiceBox<?> choiceBoxIce3;
    @FXML private Button btnAddIce3;
    @FXML private VBox boxIce4;
    @FXML private Label lblIdIce4;
    @FXML private ImageView imageIce4;
    @FXML private Label lblNameIce4;
    @FXML private Label lblPriceIce4;
    @FXML private Label lblMinusIce4;
    @FXML private TextField txtNumberIce4;
    @FXML private Label lblPlusIce4;
    @FXML private ChoiceBox<?> choiceBoxIce4;
    @FXML private Button btnAddIce4;
    @FXML private VBox boxIce5;
    @FXML private Label lblIdIce5;
    @FXML private ImageView imageIce5;
    @FXML private Label lblNameIce5;
    @FXML private Label lblPriceIce5;
    @FXML private Label lblMinusIce5;
    @FXML private TextField txtNumberIce5;
    @FXML private Label lblPlusIce5;
    @FXML private ChoiceBox<?> choiceBoxIce5;
    @FXML private Button btnAddIce5;
    @FXML private VBox boxIce6;
    @FXML private Label lblIdIce6;
    @FXML private ImageView imageIce6;
    @FXML private Label lblNameIce6;
    @FXML private Label lblPriceIce6;
    @FXML private Label lblMinusIce6;
    @FXML private TextField txtNumberIce6;
    @FXML private Label lblPlusIce6;
    @FXML private ChoiceBox<?> choiceBoxIce6;
    @FXML private Button btnAddIce6;
    @FXML private VBox boxIce7;
    @FXML private Label lblIdIce7;
    @FXML private ImageView imageIce7;
    @FXML private Label lblNameIce7;
    @FXML private Label lblPriceIce7;
    @FXML private Label lblMinusIce7;
    @FXML private TextField txtNumberIce7;
    @FXML private Label lblPlusIce7;
    @FXML private ChoiceBox<?> choiceBoxIce7;
    @FXML private Button btnAddIce7;
    @FXML private VBox boxTea0;
    @FXML private Label lblIdTea0;
    @FXML private ImageView imageTea0;
    @FXML private Label lblNameTea0;
    @FXML private Label lblPriceTea0;
    @FXML private Label lblMinusTea0;
    @FXML private TextField txtNumberTea0;
    @FXML private Label lblPlusTea0;
    @FXML private ChoiceBox<?> choiceBoxTea0;
    @FXML private Button btnAddTea0;
    @FXML private VBox boxTea1;
    @FXML private Label lblIdTea1;
    @FXML private ImageView imageTea1;
    @FXML private Label lblNameTea1;
    @FXML private Label lblPriceTea1;
    @FXML private Label lblMinusTea1;
    @FXML private TextField txtNumberTea1;
    @FXML private Label lblPlusTea1;
    @FXML private ChoiceBox<?> choiceBoxTea1;
    @FXML private Button btnAddTea1;
    @FXML private VBox boxTea2;
    @FXML private Label lblIdTea2;
    @FXML private Button btnLogout;
    @FXML private ImageView imageTea2;
    @FXML private Label lblNameTea2;
    @FXML private Label lblPriceTea2;
    @FXML private Label lblMinusTea2;
    @FXML private TextField txtNumberTea2;
    @FXML private Label lblPlusTea2;
    @FXML private ChoiceBox<?> choiceBoxTea2;
    @FXML private Button btnAddTea2;
    @FXML private VBox boxTea3;
    @FXML private Label lblIdTea3;
    @FXML private ImageView imageTea3;
    @FXML private Label lblNameTea3;
    @FXML private Label lblPriceTea3;
    @FXML private Label lblMinusTea3;
    @FXML private TextField txtNumberTea3;
    @FXML private Label lblPlusTea3;
    @FXML private ChoiceBox<?> choiceBoxTea3;
    @FXML private Button btnAddTea3;
    @FXML private VBox boxTea4;
    @FXML private Label lblIdTea4;
    @FXML private ImageView imageTea4;
    @FXML private Label lblNameTea4;
    @FXML private Label lblPriceTea4;
    @FXML private Label lblMinusTea4;
    @FXML private TextField txtNumberTea4;
    @FXML private Label lblPlusTea4;
    @FXML private ChoiceBox<?> choiceBoxTea4;
    @FXML private Button btnAddTea4;
    @FXML private VBox boxTea5;
    @FXML private Label lblIdTea5;
    @FXML private ImageView imageTea5;
    @FXML private Label lblNameTea5;
    @FXML private Label lblPriceTea5;
    @FXML private Label lblMinusTea5;
    @FXML private TextField txtNumberTea5;
    @FXML private Label lblPlusTea5;
    @FXML private ChoiceBox<?> choiceBoxTea5;
    @FXML private Button btnAddTea5;
    @FXML private VBox boxTea6;
    @FXML private Label lblIdTea6;
    @FXML private ImageView imageTea6;
    @FXML private Label lblNameTea6;
    @FXML private Label lblPriceTea6;
    @FXML private Label lblMinusTea6;
    @FXML private TextField txtNumberTea6;
    @FXML private Label lblPlusTea6;
    @FXML private ChoiceBox<?> choiceBoxTea6;
    @FXML private Button btnAddTea6;
    @FXML private VBox boxTea7;
    @FXML private Label lblIdTea7;
    @FXML private ImageView imageTea7;
    @FXML private Label lblNameTea7;
    @FXML private Label lblPriceTea7;
    @FXML private Label lblMinusTea7;
    @FXML private TextField txtNumberTea7;
    @FXML private Label lblPlusTea7;
    @FXML private ChoiceBox<?> choiceBoxTea7;
    @FXML private Button btnAddTea7;
    @FXML private VBox boxSS0;
    @FXML private Label lblIdSS0;
    @FXML private ImageView imageSS0;
    @FXML private Label lblNameSS0;
    @FXML private Label lblPriceSS0;
    @FXML private Label lblMinusSS0;
    @FXML private TextField txtNumberSS0;
    @FXML private Label lblPlusSS0;
    @FXML private ChoiceBox<?> choiceBoxSS0;
    @FXML private Button btnAddSS0;
    @FXML private VBox boxSS1;
    @FXML private Label lblIdSS1;
    @FXML private ImageView imageSS1;
    @FXML private Label lblNameSS1;
    @FXML private Label lblPriceSS1;
    @FXML private Label lblMinusSS1;
    @FXML private TextField txtNumberSS1;
    @FXML private Label lblPlusSS1;
    @FXML private ChoiceBox<?> choiceBoxSS1;
    @FXML private Button btnAddSS1;
    @FXML private VBox boxSS2;
    @FXML private Label lblIdSS2;
    @FXML private ImageView imageSS2;
    @FXML private Label lblNameSS2;
    @FXML private Label lblPriceSS2;
    @FXML private Label lblMinusSS2;
    @FXML private TextField txtNumberSS2;
    @FXML private Label lblPlusSS2;
    @FXML private ChoiceBox<?> choiceBoxSS2;
    @FXML private Button btnAddSS2;
    @FXML private VBox boxSS3;
    @FXML private Label lblIdSS3;
    @FXML private ImageView imageSS3;
    @FXML private Label lblNameSS3;
    @FXML private Label lblPriceSS3;
    @FXML private Label lblMinusSS3;
    @FXML private TextField txtNumberSS3;
    @FXML private Label lblPlusSS3;
    @FXML private ChoiceBox<?> choiceBoxSS3;
    @FXML private Button btnAddSS3;
    @FXML private VBox boxSS4;
    @FXML private Label lblIdSS4;
    @FXML private ImageView imageSS4;
    @FXML private Label lblNameSS4;
    @FXML private Label lblPriceSS4;
    @FXML private Label lblMinusSS4;
    @FXML private TextField txtNumberSS4;
    @FXML private Label lblPlusSS4;
    @FXML private ChoiceBox<?> choiceBoxSS4;
    @FXML private Button btnAddSS4;
    @FXML private VBox boxSS5;
    @FXML private Label lblIdSS5;
    @FXML private ImageView imageSS5;
    @FXML private Label lblNameSS5;
    @FXML private Label lblPriceSS5;
    @FXML private Label lblMinusSS5;
    @FXML private TextField txtNumberSS5;
    @FXML private Label lblPlusSS5;
    @FXML private ChoiceBox<?> choiceBoxSS5;
    @FXML private Button btnAddSS5;
    @FXML private VBox boxSS6;
    @FXML private Label lblIdSS6;
    @FXML private ImageView imageSS6;
    @FXML private Label lblNameSS6;
    @FXML private Label lblPriceSS6;
    @FXML private Label lblMinusSS6;
    @FXML private TextField txtNumberSS6;
    @FXML private Label lblPlusSS6;
    @FXML private ChoiceBox<?> choiceBoxSS6;
    @FXML private Button btnAddSS6;
    @FXML private VBox boxSS7;
    @FXML private Label lblIdSS7;
    @FXML private ImageView imageSS7;
    @FXML private Label lblNameSS7;
    @FXML private Label lblPriceSS7;
    @FXML private Label lblMinusSS7;
    @FXML private TextField txtNumberSS7;
    @FXML private Label lblPlusSS7;
    @FXML private ChoiceBox<?> choiceBoxSS7;
    @FXML private Button btnAddSS7;
    @FXML private VBox boxCart0;
    @FXML private Label lblCartName0;
    @FXML private Label lblCartPrice0;
    @FXML private Label lblCartNumber0;
    @FXML private Label lblCartId0;
    @FXML private Label lblCartSize0;
    @FXML private Label lblDrinkId0;
    @FXML private Button btnDel0;
    @FXML private VBox boxCart1;
    @FXML private Label lblCartName1;
    @FXML private Label lblCartPrice1;
    @FXML private Label lblCartNumber1;
    @FXML private Label lblCartId1;
    @FXML private Label lblCartSize1;
    @FXML private Label lblDrinkId1;
    @FXML private Button btnDel1;
    @FXML private VBox boxCart2;
    @FXML private Label lblCartName2;
    @FXML private Label lblCartPrice2;
    @FXML private Label lblCartNumber2;
    @FXML private Label lblCartId2;
    @FXML private Label lblCartSize2;
    @FXML private Label lblDrinkId2;
    @FXML private Button btnDel2;
    @FXML private VBox boxCart3;
    @FXML private Label lblCartName3;
    @FXML private Label lblCartPrice3;
    @FXML private Label lblCartNumber3;
    @FXML private Label lblCartId3;
    @FXML private Label lblCartSize3;
    @FXML private Label lblDrinkId3;
    @FXML private Button btnDel3;
    @FXML private VBox boxCart4;
    @FXML private Label lblCartName4;
    @FXML private Label lblCartPrice4;
    @FXML private Label lblCartNumber4;
    @FXML private Label lblCartId4;
    @FXML private Label lblCartSize4;
    @FXML private Label lblDrinkId4;
    @FXML private Button btnDel4;
    @FXML private VBox boxCart5;
    @FXML private Label lblCartName5;
    @FXML private Label lblCartPrice5;
    @FXML private Label lblCartNumber5;
    @FXML private Label lblCartId5;
    @FXML private Label lblCartSize5;
    @FXML private Label lblDrinkId5;
    @FXML private Button btnDel5;
    @FXML private VBox boxCart6;
    @FXML private Label lblCartName6;
    @FXML private Label lblCartPrice6;
    @FXML private Label lblCartNumber6;
    @FXML private Label lblCartId6;
    @FXML private Label lblCartSize6;
    @FXML private Label lblDrinkId6;
    @FXML private Button btnDel6;
    @FXML private Label lblTotal;
    @FXML private Button btnConfirm;
    @FXML private Button btnMenu;
    @FXML private Button btnBill;
    @FXML private Button btnRevenue;
    @FXML private Button btnAccount;
    @FXML private Button btnManage;
    @FXML private Label lblUsername;
    @FXML private Label lblClock; 
    @FXML private AnchorPane pane;

    
    ObservableList<DrinksMenu> drinks = FXCollections.observableArrayList();
    ObservableList<DrinksMenu> drinks_bill = FXCollections.observableArrayList();
    ObservableList<Employee> employees = FXCollections.observableArrayList();
    ObservableList<FullBill> fullBill = FXCollections.observableArrayList();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Label[] arrDrinkId = {txtDrinkID_Checked0, txtDrinkID_Checked1, txtDrinkID_Checked2, txtDrinkID_Checked3, txtDrinkID_Checked4, txtDrinkID_Checked5, txtDrinkID_Checked6};
        Label[] arrDrinkName = {txtDrinkName_Checked0, txtDrinkName_Checked1, txtDrinkName_Checked2, txtDrinkName_Checked3, txtDrinkName_Checked4, txtDrinkName_Checked5, txtDrinkName_Checked6};
        ChoiceBox[] arrSize = {lblSize_Checked0, lblSize_Checked1, lblSize_Checked2, lblSize_Checked3, lblSize_Checked4, lblSize_Checked5, lblSize_Checked6};

        Label[] arrPrice = {txtPrice_Checked0, txtPrice_Checked1, txtPrice_Checked2, txtPrice_Checked3, txtPrice_Checked4, txtPrice_Checked5, txtPrice_Checked6};
        TextField[] arrQuantity = {txtQuantity_Checked0, txtQuantity_Checked1, txtQuantity_Checked2, txtQuantity_Checked3, txtQuantity_Checked4, txtQuantity_Checked5, txtQuantity_Checked6};
        Label[] arrTotal = {txtTotal_Checked0, txtTotal_Checked1, txtTotal_Checked2, txtTotal_Checked3, txtTotal_Checked4, txtTotal_Checked5, txtTotal_Checked6};    
        Button[] arrDel = {btnDeleteDrinksEdit0, btnDeleteDrinksEdit1, btnDeleteDrinksEdit2, btnDeleteDrinksEdit3, btnDeleteDrinksEdit4, btnDeleteDrinksEdit5, btnDeleteDrinksEdit6};
        
       for(int i = 0 ; i< 7; i++){
                    arrDrinkId[i].setText("");
                    arrDrinkName[i].setText("");
                    arrPrice[i].setText("");
                    arrQuantity[i].setText("");
                    arrTotal[i].setText("");
                    arrDel[i].setVisible(false);
                    arrSize[i].setVisible(false);
                    arrQuantity[i].setVisible(false);
        }
       
       lblBillID_Checked.setText("");
       clock();
       loadForm();
       setCellValueFromTableBilltoTextField();
       String sql2 = "Select Username from Account where AccountStatus = 'Active'";
        try {
            preparedStatement = con.prepareStatement(sql2);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                lblUsername_Checked.getItems().add(resultSet.getString("Username"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(MenuFormController.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(int i=0 ; i<7 ;i++){    
            arrSize[i].getItems().addAll("size M", "size L");
            arrSize[i].setValue("size M");
        }
    }
    
    public void loadForm(){
        Label[] arrNameCf = {lblNameCf0, lblNameCf1, lblNameCf2, lblNameCf3, lblNameCf4, lblNameCf5, lblNameCf6, lblNameCf7};
        ImageView[] arrImageCf = {imageCf0,imageCf1,imageCf2,imageCf3,imageCf4,imageCf5,imageCf6,imageCf7};
        Pane[] arrBoxCf = {boxCf0, boxCf1, boxCf2, boxCf3, boxCf4, boxCf5, boxCf6, boxCf7};
        ChoiceBox[] arrChoiceBoxCf = {choiceBoxCf0, choiceBoxCf1, choiceBoxCf2, choiceBoxCf3, choiceBoxCf4, choiceBoxCf5 , choiceBoxCf6, choiceBoxCf7};
        Label[] arrPriceCf = {lblPriceCf0, lblPriceCf1, lblPriceCf2, lblPriceCf3, lblPriceCf4, lblPriceCf5, lblPriceCf6, lblPriceCf7};
        TextField[] arrNumberCf = {txtNumberCf0, txtNumberCf1, txtNumberCf2, txtNumberCf3, txtNumberCf4, txtNumberCf5, txtNumberCf6, txtNumberCf7};
        String[] arrIdCf = null;
        Label[] arrLblIdCf = {lblIdCf0, lblIdCf1, lblIdCf2, lblIdCf3, lblIdCf4, lblIdCf5, lblIdCf6, lblIdCf7};
        
        Label[] arrNameIce = {lblNameIce0, lblNameIce1, lblNameIce2, lblNameIce3, lblNameIce4, lblNameIce5, lblNameIce6, lblNameIce7};
        ImageView[] arrImageIce = {imageIce0, imageIce1, imageIce2, imageIce3, imageIce4, imageIce5, imageIce6, imageIce7};
        Pane[] arrBoxIce = {boxIce0, boxIce1, boxIce2, boxIce3, boxIce4, boxIce5, boxIce6, boxIce7};
        ChoiceBox[] arrChoiceBoxIce = {choiceBoxIce0, choiceBoxIce1, choiceBoxIce2, choiceBoxIce3, choiceBoxIce4, choiceBoxIce5, choiceBoxIce6, choiceBoxIce7};
        Label[] arrPriceIce = {lblPriceIce0, lblPriceIce1, lblPriceIce2, lblPriceIce3, lblPriceIce4, lblPriceIce5, lblPriceIce6, lblPriceIce7};
        TextField[] arrNumberIce = {txtNumberIce0, txtNumberIce1, txtNumberIce2, txtNumberIce3, txtNumberIce4, txtNumberIce5, txtNumberIce6, txtNumberIce7};
        String[] arrIdIce = null;
        Label[] arrLblIdIce = {lblIdIce0, lblIdIce1, lblIdIce2, lblIdIce3, lblIdIce4, lblIdIce5, lblIdIce6, lblIdIce7};
        
        Label[] arrNameTea = {lblNameTea0, lblNameTea1, lblNameTea2, lblNameTea3, lblNameTea4, lblNameTea5, lblNameTea6, lblNameTea7};
        ImageView[] arrImageTea = {imageTea0,imageTea1,imageTea2,imageTea3,imageTea4,imageTea5,imageTea6,imageTea7};
        Pane[] arrBoxTea = {boxTea0, boxTea1, boxTea2, boxTea3, boxTea4, boxTea5, boxTea6, boxTea7};
        ChoiceBox[] arrChoiceBoxTea = {choiceBoxTea0, choiceBoxTea1, choiceBoxTea2, choiceBoxTea3, choiceBoxTea4, choiceBoxTea5, choiceBoxTea6, choiceBoxTea7};
        Label[] arrPriceTea = {lblPriceTea0, lblPriceTea1, lblPriceTea2, lblPriceTea3, lblPriceTea4, lblPriceTea5, lblPriceTea6, lblPriceTea7};
        TextField[] arrNumberTea = {txtNumberTea0, txtNumberTea1, txtNumberTea2, txtNumberTea3, txtNumberTea4, txtNumberTea5, txtNumberTea6, txtNumberTea7};
        String[] arrIdTea = null;
        Label[] arrLblIdTea = {lblIdTea0, lblIdTea1, lblIdTea2, lblIdTea3, lblIdTea4, lblIdTea5, lblIdTea6, lblIdTea7};
        
        Label[] arrNameSS = {lblNameSS0, lblNameSS1, lblNameSS2, lblNameSS3, lblNameSS4, lblNameSS5, lblNameSS6, lblNameSS7};
        ImageView[] arrImageSS = {imageSS0,imageSS1,imageSS2,imageSS3,imageSS4,imageSS5,imageSS6,imageSS7};
        Pane[] arrBoxSS = {boxSS0, boxSS1, boxSS2, boxSS3, boxSS4, boxSS5, boxSS6, boxSS7};
        ChoiceBox[] arrChoiceBoxSS = {choiceBoxSS0, choiceBoxSS1, choiceBoxSS2, choiceBoxSS3, choiceBoxSS4, choiceBoxSS5, choiceBoxSS6, choiceBoxSS7};
        Label[] arrPriceSS = {lblPriceSS0, lblPriceSS1, lblPriceSS2, lblPriceSS3, lblPriceSS4, lblPriceSS5, lblPriceSS6, lblPriceSS7};
        TextField[] arrNumberSS = {txtNumberSS0, txtNumberSS1, txtNumberSS2, txtNumberSS3, txtNumberSS4, txtNumberSS5, txtNumberSS6, txtNumberSS7};
        String[] arrIdSS = null;
        Label[] arrLblIdSS = {lblIdSS0, lblIdSS1, lblIdSS2, lblIdSS3, lblIdSS4, lblIdSS5, lblIdSS6, lblIdSS7};
        
        con = DAO.Connect();
        
        arrIdCf =  readData("CF","/Images/cf/", arrNameCf, arrBoxCf, arrChoiceBoxCf,arrImageCf, arrNumberCf, arrPriceCf);
        arrIdIce = readData("ICE","/Images/ice/", arrNameIce, arrBoxIce, arrChoiceBoxIce, arrImageIce, arrNumberIce, arrPriceIce);
        arrIdTea =  readData("TEA","/Images/tea/",arrNameTea, arrBoxTea, arrChoiceBoxTea, arrImageTea, arrNumberTea, arrPriceTea);
        arrIdSS = readData("SS", "/Images/ss/", arrNameSS, arrBoxSS, arrChoiceBoxSS, arrImageSS, arrNumberSS, arrPriceSS);
        
        printBill();
        
        for(int i=0 ; i<8 ;i++){
            returnPrice(arrIdCf[i], arrPriceCf[i] , arrChoiceBoxCf[i]);
            returnPrice(arrIdIce[i], arrPriceIce[i], arrChoiceBoxIce[i]);
            returnPrice(arrIdTea[i], arrPriceTea[i], arrChoiceBoxTea[i]);
            returnPrice(arrIdSS[i], arrPriceSS[i], arrChoiceBoxSS[i]);
            arrLblIdCf[i].setText(arrIdCf[i]);
            arrLblIdIce[i].setText(arrIdIce[i]);
            arrLblIdTea[i].setText(arrIdTea[i]);
            arrLblIdSS[i].setText(arrIdSS[i]);
        }
        
        //Nạp dữ liệu choicebox chức vụ
        if(choiceBox_Position.getValue()==null){
            choiceBox_Position.getItems().add("Nhân viên");
            choiceBox_Position.getItems().add("Quản lý");
            choiceBox_Position.setValue("Nhân viên");
        }
        
        //Nạp dữ liệu choicebox loại nước
        if(choiceBox_Type.getValue()==null){
            choiceBox_Type.getItems().add("Coffee");
            choiceBox_Type.getItems().add("Ice-Blended");
            choiceBox_Type.getItems().add("Smoothie");
            choiceBox_Type.getItems().add("Tea");
            choiceBox_Type.setValue("Coffee");
        }
        
        //Khởi tạo datePickerStart theo format dd/mm/yyyy;
        datePickerStart.setConverter(new StringConverter<LocalDate>() {
        String pattern = "dd/MM/yyyy";
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern(pattern);

        @Override 
        public String toString(LocalDate date) {
            if (date != null) {
                return dateFormatter.format(date);
            } else {
                return "";
            }
        }

        @Override 
        public LocalDate fromString(String string) {
            if (string != null && !string.isEmpty()) {
                return LocalDate.parse(string, dateFormatter);
            } else {
                return null;
            }
        }
        });
        
        //Khởi tạo datePickerEnd theo format dd/mm/yyyy;
        datePickerEnd.setConverter(new StringConverter<LocalDate>() {
        String pattern = "dd/MM/yyyy";
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern(pattern);

        @Override 
        public String toString(LocalDate date) {
            if (date != null) {
                return dateFormatter.format(date);
            } else {
                return "";
            }
        }

        @Override 
        public LocalDate fromString(String string) {
            if (string != null && !string.isEmpty()) {
                return LocalDate.parse(string, dateFormatter);
            } else {
                return null;
            }
        }
        }); 
        
        //Khởi tạo datePickerBirth theo format dd/mm/yyyy;
        datePickerBirth.setConverter(new StringConverter<LocalDate>() {
        String pattern = "dd/MM/yyyy";
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern(pattern);

        @Override 
        public String toString(LocalDate date) {
            if (date != null) {
                return dateFormatter.format(date);
            } else {
                return "";
            }
        }

        @Override 
        public LocalDate fromString(String string) {
            if (string != null && !string.isEmpty()) {
                return LocalDate.parse(string, dateFormatter);
            } else {
                return null;
            }
        }
        }); 
        
        //Khởi tạo date_Checked theo format dd/mm/yyyy;
        date_Checked.setConverter(new StringConverter<LocalDate>() {
        String pattern = "dd/MM/yyyy";
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern(pattern);

        @Override 
        public String toString(LocalDate date) {
            if (date != null) {
                return dateFormatter.format(date);
            } else {
                return "";
            }
        }

        @Override 
        public LocalDate fromString(String string) {
            if (string != null && !string.isEmpty()) {
                return LocalDate.parse(string, dateFormatter);
            } else {
                return null;
            }
        }
        }); 
        
        datePickerStart.setValue(null);
        datePickerEnd.setValue(null);
        datePickerBirth.setValue(null);
        date_Checked.setValue(null);
        
        //Khởi tạo tableViewMenu
        tableViewMenuInitialize();
        
        //Khởi tạo tableViewAccount
        tableViewAccountInitialize();
        
        //Khởi tạo tableViewMenuBill
        tableViewMenuBillInitialize();
        
        //Khởi tạo tableViewEditBill
        tableViewEditBillInitialize();
        
        //Khởi tạo lineChart
        statisticChart();
    }
    
    Connection con = null;
    PreparedStatement preparedStatement = null;    
    ResultSet resultSet = null;
        
    public String[] readData(String type, String url, Label[] lbl_1, Pane[] box, ChoiceBox[] cb, ImageView[] iv, TextField[] tf,  Label[] price){
        
        String[] arrID = new String[8];
        List<DrinksMenu> DrinksList = new ArrayList<>();
        String sql = "select * from Drink where (TypeID = '" + type + "' and Status = 'Active')"  ;
        try {
            preparedStatement = con.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                
                    DrinksMenu dm = new DrinksMenu();
                    dm.id = resultSet.getString("DrinkID");
                    dm.name = resultSet.getString("drinkName");
                    dm.priceM = resultSet.getInt("MSizePrice");
                    dm.priceL = resultSet.getInt("LSizePrice");
                    dm.type = type;
                    DrinksList.add(dm);
            }
            
            try{
                for(int i = 0; i < DrinksList.size(); i++){
                    box[i].setVisible(true);
                    arrID[i] = DrinksList.get(i).id;
                    tf[i].setText("0");
                        String urlImage =System.getProperty("user.dir")+"\\src\\"+ url + DrinksList.get(i).id + ".jpg";
                        
                        File file=new File(urlImage);
                        BufferedImage image2=ImageIO.read(file);
                        Image image=SwingFXUtils.toFXImage(image2, null);
                        //Rectangle clip = new Rectangle(iv[i].getFitWidth(), iv[i].getFitHeight());
                       iv[i].setImage(image);

                    if(cb[i].getValue() == null){
                        cb[i].getItems().add("size M");
                        cb[i].getItems().add("size L");
                        cb[i].setValue("size M");
                    }
                    price[i].setText(String.valueOf(DrinksList.get(i).priceM));
                    lbl_1[i].setText(DrinksList.get(i).name);    
                }
                for(int i = DrinksList.size(); i < 8; i++){
                    box[i].setVisible(false);
                    arrID[i] = null;
                }
            }
            catch(Exception e){
                e.printStackTrace();
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(MenuFormController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrID;
    }
        
    public void  Clicked( MouseEvent event){
        
 
        TextField[] arrNumberCf = {txtNumberCf0, txtNumberCf1, txtNumberCf2, txtNumberCf3, txtNumberCf4, txtNumberCf5, txtNumberCf6, txtNumberCf7};
        Label[] arrMinusCf = {lblMinusCf0, lblMinusCf1, lblMinusCf2, lblMinusCf3, lblMinusCf4, lblMinusCf5, lblMinusCf6, lblMinusCf7};
        Label[] arrPlusCf = {lblPlusCf0, lblPlusCf1, lblPlusCf2, lblPlusCf3, lblPlusCf4, lblPlusCf5, lblPlusCf6, lblPlusCf7};
        int[] arrCf = new int[8];
        
        TextField[] arrNumberIce = {txtNumberIce0, txtNumberIce1, txtNumberIce2, txtNumberIce3, txtNumberIce4, txtNumberIce5, txtNumberIce6, txtNumberIce7};
        Label[] arrMinusIce = {lblMinusIce0, lblMinusIce1, lblMinusIce2, lblMinusIce3, lblMinusIce4, lblMinusIce5, lblMinusIce6, lblMinusIce7};
        Label[] arrPlusIce = {lblPlusIce0, lblPlusIce1, lblPlusIce2, lblPlusIce3, lblPlusIce4, lblPlusIce5, lblPlusIce6, lblPlusIce7};
        int[] arrIce = new int[8];
                                                                                                                                            
        TextField[] arrNumberTea = {txtNumberTea0, txtNumberTea1, txtNumberTea2, txtNumberTea3, txtNumberTea4, txtNumberTea5, txtNumberTea6, txtNumberTea7};
        Label[] arrMinusTea = {lblMinusTea0, lblMinusTea1, lblMinusTea2, lblMinusTea3, lblMinusTea4, lblMinusTea5, lblMinusTea6, lblMinusTea7};
        Label[] arrPlusTea = {lblPlusTea0, lblPlusTea1, lblPlusTea2, lblPlusTea3, lblPlusTea4, lblPlusTea5, lblPlusTea6, lblPlusTea7};
        int[] arrTea = new int[8];
        
        TextField[] arrNumberSS = {txtNumberSS0, txtNumberSS1, txtNumberSS2, txtNumberSS3, txtNumberSS4, txtNumberSS5, txtNumberSS6, txtNumberSS7};
        Label[] arrMinusSS = {lblMinusSS0, lblMinusSS1, lblMinusSS2, lblMinusSS3, lblMinusSS4, lblMinusSS5, lblMinusSS6, lblMinusSS7};
        Label[] arrPlusSS = {lblPlusSS0, lblPlusSS1, lblPlusSS2, lblPlusSS3, lblPlusSS4, lblPlusSS5, lblPlusSS6, lblPlusSS7};
        int[] arrSS = new int[8];
        
        for(int i = 0; i<8;i++){
            
            // number cf
            arrCf[i] = Integer.parseInt(arrNumberCf[i].getText());
            if(event.getSource() == arrMinusCf[i]){
                if(arrCf[i] != 0){
                    arrCf[i] --;
                    arrNumberCf[i].setText(String.valueOf(arrCf[i]));
                }
                else{
                    arrNumberCf[i].setText(String.valueOf(arrCf[i]));
                }
            }
            if(event.getSource() == arrPlusCf[i]){
                arrCf[i] ++;
                arrNumberCf[i].setText(String.valueOf(arrCf[i]));
            }
            
            // Number Ice
            arrIce[i] = Integer.parseInt(arrNumberIce[i].getText());
            if(event.getSource() == arrMinusIce[i]){
                if(arrIce[i] != 0){
                    arrIce[i] --;
                    arrNumberIce[i].setText(String.valueOf(arrIce[i]));
                }
                else{
                    arrNumberIce[i].setText(String.valueOf(arrIce[i]));
                }
            }
            if(event.getSource() == arrPlusIce[i]){
                arrIce[i] ++;
                arrNumberIce[i].setText(String.valueOf(arrIce[i]));
            }
            
            //Number tea
            arrTea[i] = Integer.parseInt(arrNumberTea[i].getText());
            if(event.getSource() == arrMinusTea[i]){
                if(arrTea[i] != 0){
                    arrTea[i] --;
                    arrNumberTea[i].setText(String.valueOf(arrTea[i]));
                }
                else{
                    arrNumberTea[i].setText(String.valueOf(arrTea[i]));
                }
            }
            if(event.getSource() == arrPlusTea[i]){
                arrTea[i] ++;
                arrNumberTea[i].setText(String.valueOf(arrTea[i]));
            }
            
            //Number ss
            arrSS[i] = Integer.parseInt(arrNumberSS[i].getText());
            if(event.getSource() == arrMinusSS[i]){
                if(arrSS[i] != 0){
                    arrSS[i] --;
                    arrNumberSS[i].setText(String.valueOf(arrSS[i]));
                }
                else{
                    arrNumberSS[i].setText(String.valueOf(arrSS[i]));
                }
            }
            if(event.getSource() == arrPlusSS[i]){
                arrSS[i] ++;
                arrNumberSS[i].setText(String.valueOf(arrSS[i]));
            }
        }
    }
    
    public void btnTab(MouseEvent event){
        if(event.getSource() == btnMenu){
            /*btnMenu.setStyle("-fx-background-color:  #F7E039;");
            btnBill.setStyle("-fx-background-color:  transparent;");
            btnRevenue.setStyle("-fx-background-color:  transparent;");
            btnAccount.setStyle("-fx-background-color:  transparent;");
            btnManage.setStyle("-fx-background-color:  transparent;");*/
            
            paneMenu.setVisible(true);
            paneBill.setVisible(false);
            paneRevenue.setVisible(false);
            paneAccount.setVisible(false);
            paneManage.setVisible(false);
        }
        if(event.getSource() == btnBill){
            /*btnBill.setStyle("-fx-background-color:  #F7E039;");
            btnMenu.setStyle("-fx-background-color:  transparent;");
            btnRevenue.setStyle("-fx-background-color:  transparent;");
            btnAccount.setStyle("-fx-background-color:  transparent;");
            btnManage.setStyle("-fx-background-color:  transparent;");*/
            
            paneBill.setVisible(true);
            paneMenu.setVisible(false);
            paneRevenue.setVisible(false);
            paneAccount.setVisible(false);
            paneManage.setVisible(false);
        }
        if(event.getSource() == btnRevenue){
           /* btnRevenue.setStyle("-fx-background-color:  #F7E039;");
            btnMenu.setStyle("-fx-background-color:  transparent;");
            btnBill.setStyle("-fx-background-color:  transparent;");
            btnAccount.setStyle("-fx-background-color:  transparent;");
            btnManage.setStyle("-fx-background-color:  transparent;");*/
            
            paneBill.setVisible(false);
            paneMenu.setVisible(false);
            paneRevenue.setVisible(true);
            paneAccount.setVisible(false);
            paneManage.setVisible(false);
        }
        if(event.getSource() == btnAccount){
            /*btnAccount.setStyle("-fx-background-color:  #F7E039;");
            btnMenu.setStyle("-fx-background-color:  transparent;");
            btnBill.setStyle("-fx-background-color:  transparent;");
            btnRevenue.setStyle("-fx-background-color:  transparent;");
            btnManage.setStyle("-fx-background-color:  transparent;");*/
            
            paneAccount.setVisible(true);
            paneMenu.setVisible(false);
            paneRevenue.setVisible(false);
            paneBill.setVisible(false);
            paneManage.setVisible(false);
        }
        if(event.getSource() == btnManage){
            /*btnManage.setStyle("-fx-background-color:  #F7E039;");
            btnAccount.setStyle("-fx-background-color:  transparent;");
            btnMenu.setStyle("-fx-background-color:  transparent;");
            btnBill.setStyle("-fx-background-color:  transparent;");
            btnRevenue.setStyle("-fx-background-color:  transparent;");*/
            
            paneAccount.setVisible(false);
            paneMenu.setVisible(false);
            paneRevenue.setVisible(false);
            paneBill.setVisible(false);
            paneManage.setVisible(true);
        }
    }
    
    public void ClickedAdd(MouseEvent event){
        Label[] arrCartName = {lblCartName0, lblCartName1, lblCartName2, lblCartName3, lblCartName4, lblCartName5, lblCartName6};
        Label[] arrCartSize = {lblCartSize0, lblCartSize1, lblCartSize2, lblCartSize3, lblCartSize4, lblCartSize5, lblCartSize6};
        Label[] arrCartNumber = {lblCartNumber0, lblCartNumber1, lblCartNumber2, lblCartNumber3, lblCartNumber4, lblCartNumber5, lblCartNumber6};
        VBox[] arrBoxCart = {boxCart0, boxCart1, boxCart2, boxCart3, boxCart4, boxCart5, boxCart6};
        Label[] arrCartId = {lblCartId0, lblCartId1, lblCartId2, lblCartId3, lblCartId4, lblCartId5, lblCartId6};
        Label[] arrCartPrice = {lblCartPrice0, lblCartPrice1, lblCartPrice2, lblCartPrice3, lblCartPrice4, lblCartPrice5, lblCartPrice6};
        Label[] arrCartIdItem = {lblDrinkId0, lblDrinkId1, lblDrinkId2, lblDrinkId3, lblDrinkId4, lblDrinkId5,lblDrinkId6};
        
        Button[] arrBtnAddCf = {btnAddCf0, btnAddCf1, btnAddCf2, btnAddCf3, btnAddCf4, btnAddCf5, btnAddCf6, btnAddCf7};
        TextField[] arrNumberCf = {txtNumberCf0, txtNumberCf1, txtNumberCf2, txtNumberCf3, txtNumberCf4, txtNumberCf5, txtNumberCf6, txtNumberCf7};
        Label[] arrNameCf = {lblNameCf0, lblNameCf1, lblNameCf2, lblNameCf3, lblNameCf4, lblNameCf5, lblNameCf6, lblNameCf7};
        ChoiceBox[] arrChoiceBoxCf = {choiceBoxCf0, choiceBoxCf1, choiceBoxCf2, choiceBoxCf3, choiceBoxCf4, choiceBoxCf5, choiceBoxCf6, choiceBoxCf7};
        Label[] arrPriceCf = {lblPriceCf0, lblPriceCf1, lblPriceCf2, lblPriceCf3, lblPriceCf4, lblPriceCf5, lblPriceCf6, lblPriceCf7};
        Label[] arrLblIdCf = {lblIdCf0, lblIdCf1, lblIdCf2, lblIdCf3, lblIdCf4, lblIdCf5, lblIdCf6, lblIdCf7};
        
        Button[] arrBtnAddIce = {btnAddIce0, btnAddIce1, btnAddIce2, btnAddIce3, btnAddIce4, btnAddIce5, btnAddIce6, btnAddIce7};
        TextField[] arrNumberIce = {txtNumberIce0, txtNumberIce1, txtNumberIce2, txtNumberIce3, txtNumberIce4, txtNumberIce5, txtNumberIce6, txtNumberIce7};
        Label[] arrNameIce = {lblNameIce0, lblNameIce1, lblNameIce2, lblNameIce3, lblNameIce4, lblNameIce5, lblNameIce6, lblNameIce7};
        ChoiceBox[] arrChoiceBoxIce = {choiceBoxIce0, choiceBoxIce1, choiceBoxIce2, choiceBoxIce3, choiceBoxIce4, choiceBoxIce5, choiceBoxIce6, choiceBoxIce7};
        Label[] arrPriceIce = {lblPriceIce0, lblPriceIce1, lblPriceIce2, lblPriceIce3, lblPriceIce4, lblPriceIce5, lblPriceIce6, lblPriceIce7};
        Label[] arrLblIdIce = {lblIdIce0, lblIdIce1, lblIdIce2, lblIdIce3, lblIdIce4, lblIdIce5, lblIdIce6, lblIdIce7};
        
        Button[] arrBtnAddTea = {btnAddTea0, btnAddTea1, btnAddTea2, btnAddTea3, btnAddTea4, btnAddTea5, btnAddTea6, btnAddTea7};
        TextField[] arrNumberTea = {txtNumberTea0, txtNumberTea1, txtNumberTea2, txtNumberTea3, txtNumberTea4, txtNumberTea5, txtNumberTea6, txtNumberTea7};
        Label[] arrNameTea = {lblNameTea0, lblNameTea1, lblNameTea2, lblNameTea3, lblNameTea4, lblNameTea5, lblNameTea6, lblNameTea7};
        ChoiceBox[] arrChoiceBoxTea = {choiceBoxTea0, choiceBoxTea1, choiceBoxTea2, choiceBoxTea3, choiceBoxTea4, choiceBoxTea5, choiceBoxTea6, choiceBoxTea7};
        Label[] arrPriceTea = {lblPriceTea0, lblPriceTea1, lblPriceTea2, lblPriceTea3, lblPriceTea4, lblPriceTea5, lblPriceTea6, lblPriceTea7};
        Label[] arrLblIdTea = {lblIdTea0, lblIdTea1, lblIdTea2, lblIdTea3, lblIdTea4, lblIdTea5, lblIdTea6, lblIdTea7};
        
        Button[] arrBtnAddSS = {btnAddSS0, btnAddSS1, btnAddSS2, btnAddSS3, btnAddSS4, btnAddSS5, btnAddSS6, btnAddSS7};
        TextField[] arrNumberSS = {txtNumberSS0, txtNumberSS1, txtNumberSS2, txtNumberSS3, txtNumberSS4, txtNumberSS5, txtNumberSS6, txtNumberSS7};
        Label[] arrNameSS = {lblNameSS0, lblNameSS1, lblNameSS2, lblNameSS3, lblNameSS4, lblNameSS5, lblNameSS6, lblNameSS7};
        ChoiceBox[] arrChoiceBoxSS = {choiceBoxSS0, choiceBoxSS1, choiceBoxSS2, choiceBoxSS3, choiceBoxSS4, choiceBoxSS5, choiceBoxSS6, choiceBoxSS7};
        Label[] arrPriceSS = {lblPriceSS0, lblPriceSS1, lblPriceSS2, lblPriceSS3, lblPriceSS4, lblPriceSS5, lblPriceSS6, lblPriceSS7};
        Label[] arrLblIdSS = {lblIdSS0, lblIdSS1, lblIdSS2, lblIdSS3, lblIdSS4, lblIdSS5, lblIdSS6, lblIdSS7};
        
        ArrayList<Bill> listBill = new ArrayList<>();
        int total = 0;
        for(int i = 0; i < 7; i++){
            if(!arrCartName[i].getText().equals("")){
                listBill.add(addBill(arrCartId[i],arrCartIdItem[i], arrCartName[i], arrCartPrice[i], arrCartNumber[i], arrCartSize[i]));
            }
        }
        
        for(int i = 0 ;i < 8 ; i++){
            
            //coffee
            String stt = null;
            
            if(event.getSource() == arrBtnAddCf[i]){
                if(arrNumberCf[i].getText().equalsIgnoreCase("0")){
                    alert("Chưa có số lượng cần mua !!!");
                }
                else{
                    if(!listBill.isEmpty()){
                        for(Bill b : listBill){
                            if(b.idDrink.equals(arrLblIdCf[i].getText()) && b.size.equals((String) arrChoiceBoxCf[i].getValue()) ){
                                stt = "1";
                                System.out.println("th1");
                                break;
                            }
                            else{
                                stt= "2";
                                System.out.println("th2");
                            }
                        }
                    }
                    else{
                        stt = "4";
                        System.out.println("th4");
                    }
                    if(stt.equals("2") || stt.equals("3")|| stt.equals("4")){
                        System.out.println("2 va 3");
                        Bill newBill = new Bill();
                        newBill.idDrink = arrLblIdCf[i].getText();
                        newBill.name = arrNameCf[i].getText();
                        newBill.number = Integer.parseInt(arrNumberCf[i].getText());
                        newBill.size = (String) arrChoiceBoxCf[i].getValue();
                        newBill.price = Integer.parseInt(arrPriceCf[i].getText());
                        listBill.add(newBill);
                        arrNumberCf[i].setText("0");
                    }
                    else if(stt.equals("1")){
                        for(Bill b : listBill){
                            if(b.idDrink.equals(arrLblIdCf[i].getText()) && b.size.equals((String) arrChoiceBoxCf[i].getValue()) ){
                                b.number = b.number + Integer.parseInt(arrNumberCf[i].getText());  
                                arrNumberCf[i].setText("0"); 
                            }
                        }      
                    }
                }  
            }
            
            //ice
            if(event.getSource() == arrBtnAddIce[i]){
                if(arrNumberIce[i].getText().equalsIgnoreCase("0")){
                    alert("Chưa có số lượng cần mua !!!");
                }
                else{
                    if(!listBill.isEmpty()){
                        for(Bill b : listBill){
                            if(b.idDrink.equals(arrLblIdIce[i].getText()) && b.size.equals((String) arrChoiceBoxIce[i].getValue()) ){
                                stt = "1";
                                System.out.println("th1");
                                break;
                            }
                            else{
                                stt= "2";
                                System.out.println("th2");
                            }
                        }
                    }
                    else{
                        stt = "4";
                        System.out.println("th4");
                    }
                    if(stt.equals("2") || stt.equals("3")|| stt.equals("4")){
                        System.out.println("2 va 3");
                        Bill newBill = new Bill();
                        newBill.idDrink = arrLblIdIce[i].getText();
                        newBill.name = arrNameIce[i].getText();
                        newBill.number = Integer.parseInt(arrNumberIce[i].getText());
                        newBill.size = (String) arrChoiceBoxIce[i].getValue();
                        newBill.price = Integer.parseInt(arrPriceIce[i].getText());
                        listBill.add(newBill);
                        arrNumberIce[i].setText("0");
                    }
                    else if(stt.equals("1")){
                        for(Bill b : listBill){
                            if(b.idDrink.equals(arrLblIdIce[i].getText()) && b.size.equals((String) arrChoiceBoxIce[i].getValue()) ){
                                b.number = b.number + Integer.parseInt(arrNumberIce[i].getText());  
                                arrNumberIce[i].setText("0"); 
                            }
                        }      
                    }
                }  
            }
            
            //tea
            if(event.getSource() == arrBtnAddTea[i]){
                if(arrNumberTea[i].getText().equalsIgnoreCase("0")){
                    alert("Chưa có số lượng cần mua !!!");
                }
                else{
                    if(!listBill.isEmpty()){
                        for(Bill b : listBill){
                            if(b.idDrink.equals(arrLblIdTea[i].getText()) && b.size.equals((String) arrChoiceBoxTea[i].getValue()) ){
                                stt = "1";
                                System.out.println("th1");
                                break;
                            }
                            else{
                                stt= "2";
                                System.out.println("th2");
                            }
                        }
                    }
                    else{
                        stt = "4";
                        System.out.println("th4");
                    }
                    if(stt.equals("2") || stt.equals("3")|| stt.equals("4")){
                        System.out.println("2 va 3");
                        Bill newBill = new Bill();
                        newBill.idDrink = arrLblIdTea[i].getText();
                        newBill.name = arrNameTea[i].getText();
                        newBill.number = Integer.parseInt(arrNumberTea[i].getText());
                        newBill.size = (String) arrChoiceBoxTea[i].getValue();
                        newBill.price = Integer.parseInt(arrPriceTea[i].getText());
                        listBill.add(newBill);
                        arrNumberTea[i].setText("0");
                    }
                    else if(stt.equals("1")){
                        for(Bill b : listBill){
                            if(b.idDrink.equals(arrLblIdTea[i].getText()) && b.size.equals((String) arrChoiceBoxTea[i].getValue()) ){
                                b.number = b.number + Integer.parseInt(arrNumberTea[i].getText());  
                                arrNumberTea[i].setText("0"); 
                            }
                        }      
                    }
                }  
            }
            
            //ss
            if(event.getSource() == arrBtnAddSS[i]){
                if(arrNumberSS[i].getText().equalsIgnoreCase("0")){
                    alert("Chưa có số lượng cần mua !!!");
                }
                else{
                    if(!listBill.isEmpty()){
                        for(Bill b : listBill){
                            if(b.idDrink.equals(arrLblIdSS[i].getText()) && b.size.equals((String) arrChoiceBoxSS[i].getValue()) ){
                                stt = "1";
                                System.out.println("th1");
                                break;
                            }
                            else{
                                stt= "2";
                                System.out.println("th2");
                            }
                        }
                    }
                    else{
                        stt = "4";
                        System.out.println("th4");
                    }
                    if(stt.equals("2") || stt.equals("3")|| stt.equals("4")){
                        System.out.println("2 va 3");
                        Bill newBill = new Bill();
                        newBill.idDrink = arrLblIdSS[i].getText();
                        newBill.name = arrNameSS[i].getText();
                        newBill.number = Integer.parseInt(arrNumberSS[i].getText());
                        newBill.size = (String) arrChoiceBoxSS[i].getValue();
                        newBill.price = Integer.parseInt(arrPriceSS[i].getText());
                        listBill.add(newBill);
                        arrNumberSS[i].setText("0");
                    }
                    else if(stt.equals("1")){
                        for(Bill b : listBill){
                            if(b.idDrink.equals(arrLblIdSS[i].getText()) && b.size.equals((String) arrChoiceBoxSS[i].getValue()) ){
                                b.number = b.number + Integer.parseInt(arrNumberSS[i].getText());  
                                arrNumberSS[i].setText("0");
                            }
                        }      
                    }
                }
            }   
        }

        
        for(int i = 0; i < 7; i++){   
            arrCartIdItem[i].setText("");
            arrCartId[i].setText("");
            arrBoxCart[i].setVisible(false);
            arrCartName[i].setText("");
            arrCartSize[i].setText("");
            arrCartPrice[i].setText("");
            arrCartNumber[i].setText(""); 
        }         
        
        if(listBill.size() <= 7){
            for(int i = 0; i < listBill.size(); i++){
                if(arrCartName[i].getText().equals("")){
                    listBill.get(i).idBill = i;
                    arrCartIdItem[i].setText(listBill.get(i).idDrink);
                    arrCartId[i].setText(String.valueOf(i));
                    arrBoxCart[i].setVisible(true);
                    arrCartName[i].setText(listBill.get(i).name);
                    arrCartSize[i].setText(listBill.get(i).size);
                    arrCartPrice[i].setText(String.valueOf(listBill.get(i).price));
                    arrCartNumber[i].setText(String.valueOf(listBill.get(i).number));
                }
            }
        }
        else{
            BoxBlur blur = new BoxBlur(3,3,3);
            JFXDialogLayout layout = new JFXDialogLayout();
            JFXButton button1 = new JFXButton("Có");
            JFXButton button2 = new JFXButton("Hủy");
            button2.getStyleClass().add("dialog1-button");
            JFXDialog alert = new JFXDialog(rootpane, layout, JFXDialog.DialogTransition.CENTER);
            button1.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent event1)-> {
                int count = 0;
                Bill bill = new Bill();
                bill = listBill.get(7);
                listBill.remove(7);
                for(Bill x : listBill){
                    count = count + x.price * x.number;
                }
                alert.close();
                lblTotal.setText(String.valueOf(count));
                confirm(listBill);
                arrCartIdItem[0].setText(bill.idDrink);
                arrCartId[0].setText(String.valueOf(7));
                arrBoxCart[0].setVisible(true);
                arrCartName[0].setText(bill.name);
                arrCartSize[0].setText(bill.size);
                arrCartPrice[0].setText(String.valueOf(bill.price));
                arrCartNumber[0].setText(String.valueOf(bill.number));
                lblTotal.setText(String.valueOf(bill.number * bill.price));
            });
            button2.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent event1) -> {
                alert.close();
                int count = 0;
                for(int i = 0; i < 7; i++){
                    if(arrCartName[i].getText().equals("")){
                        listBill.get(i).idBill = i;
                        arrCartIdItem[i].setText(listBill.get(i).idDrink);
                        arrCartId[i].setText(String.valueOf(i));
                        arrBoxCart[i].setVisible(true);
                        arrCartName[i].setText(listBill.get(i).name);
                        arrCartSize[i].setText(listBill.get(i).size);
                        arrCartPrice[i].setText(String.valueOf(listBill.get(i).price));
                        arrCartNumber[i].setText(String.valueOf(listBill.get(i).number));
                    }
                    if(!arrCartName[i].getText().equals("")){
                        count+= Integer.parseInt(arrCartNumber[i].getText()) * Integer.parseInt(arrCartPrice[i].getText()) ;
                    }
                }
                lblTotal.setText(String.valueOf(count));
                
            });        
            layout.setBody(new Text("Quá số lượng 1 bill, bạn có muốn thêm bill mới ?"));
            layout.setActions(button1,button2);
            alert.show();
            alert.setOnDialogClosed((JFXDialogEvent event1) -> {
                anchorPane.setEffect(null);
            });
            anchorPane.setEffect(blur);
        }
        for(int i = 0; i < 7; i++){
            if(!arrCartName[i].getText().equals("")){
                total+= Integer.parseInt(arrCartNumber[i].getText()) * Integer.parseInt(arrCartPrice[i].getText()) ;
            }
        }
        lblTotal.setText(String.valueOf(total));

    }
    
    public void btnDeleteCart(MouseEvent event){
        Label[] arrCartName = {lblCartName0, lblCartName1, lblCartName2, lblCartName3, lblCartName4, lblCartName5, lblCartName6};
        Label[] arrCartSize = {lblCartSize0, lblCartSize1, lblCartSize2, lblCartSize3, lblCartSize4, lblCartSize5, lblCartSize6};
        Label[] arrCartNumber = {lblCartNumber0, lblCartNumber1, lblCartNumber2, lblCartNumber3, lblCartNumber4, lblCartNumber5, lblCartNumber6};
        VBox[] arrBoxCart = {boxCart0, boxCart1, boxCart2, boxCart3, boxCart4, boxCart5, boxCart6};
        Button[] arrBtnDel = {btnDel0, btnDel1, btnDel2, btnDel3, btnDel4, btnDel5, btnDel6};
        Label[] arrCartId = {lblCartId0, lblCartId1, lblCartId2, lblCartId3, lblCartId4, lblCartId5, lblCartId6};
        Label[] arrCartPrice = {lblCartPrice0, lblCartPrice1, lblCartPrice2, lblCartPrice3, lblCartPrice4, lblCartPrice5, lblCartPrice6};
        Label[] arrCartIdItem = {lblDrinkId0, lblDrinkId1, lblDrinkId2, lblDrinkId3, lblDrinkId4, lblDrinkId5,lblDrinkId6};
        
        ArrayList<Bill> listBill = new ArrayList<>();
        int total = 0;
        for(int i = 0; i < 7; i++){
            if(!arrCartName[i].getText().equals("")){
                listBill.add(addBill(arrCartId[i],arrCartIdItem[i], arrCartName[i], arrCartPrice[i], arrCartNumber[i], arrCartSize[i]));
            }
        }
        
        for(int i = 0 ; i<7 ; i++ ){
            if(event.getSource() == arrBtnDel[i]){
                for(int j = 0 ;j < listBill.size() ; j++){
                    if(listBill.get(j).idBill == Integer.parseInt(arrCartId[i].getText())){
                        listBill.remove(j);
                    }
                }
            }
        }
        
        for(int i = 0; i < listBill.size(); i++){   
            arrCartIdItem[i].setText("");
            arrCartId[i].setText("");
            arrBoxCart[i].setVisible(false);
            arrCartName[i].setText("");
            arrCartSize[i].setText("");
            arrCartPrice[i].setText("");
            arrCartNumber[i].setText(""); 
        }  
        
        listBill.forEach(n -> {
            for(int i = 0; i < listBill.size(); i++){
                
                if(arrCartName[i].getText().equals("")){
                    n.idBill = i;
                    arrCartId[i].setText(String.valueOf(n.idBill));
                    arrCartIdItem[i].setText(n.idDrink);
                    arrBoxCart[i].setVisible(true);
                    arrCartName[i].setText(n.name);
                    arrCartSize[i].setText(n.size);
                    arrCartPrice[i].setText(String.valueOf(n.price));
                    arrCartNumber[i].setText(String.valueOf(n.number));
                    break;
                }
            }             
        });
        arrCartIdItem[listBill.size()].setText("");
        arrCartId[listBill.size()].setText("");
        arrBoxCart[listBill.size()].setVisible(false);
        arrCartName[listBill.size()].setText("");
        arrCartSize[listBill.size()].setText("");
        arrCartPrice[listBill.size()].setText("");
        arrCartNumber[listBill.size()].setText("");       
    
        for(int i = 0; i < 7; i++){
            if(!arrCartName[i].getText().equals("")){
                total+= Integer.parseInt(arrCartNumber[i].getText()) * Integer.parseInt(arrCartPrice[i].getText()) ;
            }
        }
        lblTotal.setText(String.valueOf(total));     
    }
    
    public Bill addBill( Label id,Label idDrink, Label name, Label Price, Label Number, Label Size){
        Bill newbill = new Bill();
        if(!name.getText().equals("")){
            newbill.idBill = Integer.parseInt(id.getText());
            newbill.idDrink = idDrink.getText();
            newbill.name = name.getText();
            newbill.number = Integer.parseInt(Number.getText());
            newbill.price = Integer.parseInt(Price.getText());
            newbill.size = Size.getText();
        }
        return newbill;
    }
    
    public void returnPrice(String id, Label lb, ChoiceBox cb){
        String[] arrReturnPrice = new String[6];
        String sql = "select * from Drink where DrinkID = '" + id +"'";
        
        try {
            preparedStatement = con.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                arrReturnPrice[1] = String.valueOf(resultSet.getInt("MSizePrice"));
                arrReturnPrice[2] = String.valueOf(resultSet.getInt("LSizePrice"));
                
            }
            cb.getSelectionModel().selectedItemProperty().addListener(((observable, oldValue, newValue) -> {
                if(cb.getValue().equals("size M")){
                    lb.setText(arrReturnPrice[1]);
                }
                else{
                    lb.setText(arrReturnPrice[2]);
                }
            }));
                    
        } catch (SQLException ex) {
            Logger.getLogger(MenuFormController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public ArrayList<FullBill> loadBill(String status ){
        ArrayList<FullBill> fullBill = new ArrayList<>();
        //câu truy vấn 1 lấy tt bill
        String sql = "select * from Bill where Status = '" + status + "'";
        try {
            preparedStatement = con.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                FullBill fb = new FullBill();
                fb.billID = resultSet.getInt("BillID");
                fb.username = resultSet.getString("Username");
                fb.date = resultSet.getString("Date");
                fb.time = resultSet.getString("Time");
                fb.status = status;
                fb.total = resultSet.getInt("Total");
                //câu truy vấn 2 lấy bill detail theo id (bữa m viết ko có id nên ko ra)
                String sql1 = "select * from BillDetail where BillID = '" + fb.billID + "'";
                PreparedStatement preparedStatement1 = con.prepareStatement(sql1);    
                ResultSet resultSet1 = preparedStatement1.executeQuery();
                int i = 0;
                while(resultSet1.next()){
                    fb.amount[i] = resultSet1.getString("Quantity");
                    fb.size[i] = resultSet1.getString("Size");
                    String sql2 = "select * from Drink where DrinkID = '" + resultSet1.getString("DrinkID") +"'";
                   
                    PreparedStatement preparedStatement2 = con.prepareStatement(sql2);
                    ResultSet resultSet2 = preparedStatement2.executeQuery();
                    while(resultSet2.next()){
                        DrinksMenu dm = new DrinksMenu();
                        dm.id = resultSet2.getString("DrinkID");
                        dm.name = resultSet2.getString("drinkName");
                        dm.priceM = resultSet2.getInt("MSizePrice");
                        dm.priceL = resultSet2.getInt("LSizePrice");
                        fb.menuDrink.add(dm);
                    }
                    i++;
                }
                fullBill.add(fb);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MenuFormController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fullBill;
    }
    
    public ArrayList<Integer> arrBillID(){
        ArrayList<Integer> arrBillID = new ArrayList<>();
        try {
            String sql = "select BillID from Bill";
            preparedStatement = con.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                int a = Integer.parseUnsignedInt(resultSet.getString("BillID"));
                arrBillID.add(a);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MenuFormController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrBillID;
    }
    
    //hàm này là hàm confirm cũ đã sửa lại
    public void confirmToWaiting(MouseEvent event) throws SQLException{
        Label[] arrCartName = {lblCartName0, lblCartName1, lblCartName2, lblCartName3, lblCartName4, lblCartName5, lblCartName6};
        Label[] arrCartSize = {lblCartSize0, lblCartSize1, lblCartSize2, lblCartSize3, lblCartSize4, lblCartSize5, lblCartSize6};
        Label[] arrCartNumber = {lblCartNumber0, lblCartNumber1, lblCartNumber2, lblCartNumber3, lblCartNumber4, lblCartNumber5, lblCartNumber6};
        VBox[] arrBoxCart = {boxCart0, boxCart1, boxCart2, boxCart3, boxCart4, boxCart5, boxCart6};
        Label[] arrCartId = {lblCartId0, lblCartId1, lblCartId2, lblCartId3, lblCartId4, lblCartId5, lblCartId6};
        Label[] arrCartPrice = {lblCartPrice0, lblCartPrice1, lblCartPrice2, lblCartPrice3, lblCartPrice4, lblCartPrice5, lblCartPrice6};
        Label[] arrCartIdItem = {lblDrinkId0, lblDrinkId1, lblDrinkId2, lblDrinkId3, lblDrinkId4, lblDrinkId5, lblDrinkId6};
        ArrayList<Integer> count = new ArrayList<>();
        ArrayList<Bill> listBill = new ArrayList<>();
        int total = 0;
        for(int i = 0; i < 7; i++){
            if(!arrCartName[i].getText().equals("")){
                listBill.add(addBill(arrCartId[i],arrCartIdItem[i], arrCartName[i], arrCartPrice[i], arrCartNumber[i], arrCartSize[i]));
            }
        }
        
        String date = "";
        String time = "";
        
       
        //cái định dạng này t đã sửa do ban đầu để ngược ko đc vô sql đc nên lỗi
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat dt = new SimpleDateFormat("hh:mm:ss");
        date = df.format(new Date());
        time = dt.format(new Date());
        if(event.getSource() == btnConfirm ){
            if(lblCartName0.getText().equals("")){
                alert("Chưa có hàng trong giỏ? !!!");
            }
            else{
                //id tao để random vì nếu để id++ thì vd như xóa lúc load ra sẽ lỗi :D
                String t = "select * from Bill";
                PreparedStatement pst = con.prepareStatement(t);
                ResultSet rst = pst.executeQuery();
                if(!rst.next()){
                    count.add(0);
                }
                else{
                    while(rst.next()){
                        count.add(rst.getInt("BillID"));
                    }
                }
                int max = count.get(0);
                for(int max_x : count){
                    if(max <= max_x){
                        max = max_x;
                    }
                }
                System.out.println(max);
                int newBillID = ++max;
                String sql = "insert into Bill(BillID,Username,Date,Time,Status,Total)"      
                        + "values(?,?,?,?,?,?)";
                String sql1 = "insert into BillDetail(BillID,DrinkID,Size,Quantity)"
                        + "values(?,?,?,?)";
                try {
                    preparedStatement = con.prepareStatement(sql);
                    preparedStatement.setString(1, String.valueOf(newBillID));
                    preparedStatement.setString(2, lblUsername.getText());
                    preparedStatement.setDate(3, java.sql.Date.valueOf(date));
                    preparedStatement.setTime(4, Time.valueOf(time));
                    preparedStatement.setString(5, "waiting");
                    preparedStatement.setString(6, lblTotal.getText());
                    preparedStatement.execute();
                    for(Bill x : listBill){
                        PreparedStatement ps = con.prepareStatement(sql1);
                        ps.setString(1, String.valueOf(newBillID));
                        ps.setString(2, x.idDrink);
                        ps.setString(3, x.size);
                        ps.setString(4, String.valueOf(x.number));
                        ps.execute();
                    }
                    
                    alert("Lập hóa đơn thành công");
                        
                    for(int i = 0; i< 7 ; i++){
                        arrCartIdItem[i].setText("");
                        arrCartName[i].setText("");
                        arrCartSize[i].setText("");
                        arrCartId[i].setText("");
                        arrCartNumber[i].setText("");
                        arrBoxCart[i].setVisible(false);
                        arrCartPrice[i].setText("");
                        lblTotal.setText("");
                    }
                    
                } catch (SQLException ex) {
                    Logger.getLogger(MenuFormController.class.getName()).log(Level.SEVERE, null, ex);
                }
                printBill();
                tableViewEditBillInitialize();
            }
        }
       

    }
    
    //hàm này đã sửa có in bill done
    public void printBill(){
        VBox[] arrBoxBill = {boxBill0, boxBill1, boxBill2, boxBill3, boxBill4, boxBill5, boxBill6,boxBill7};
        Label[] arrTime = {lblDate0, lblDate1, lblDate2, lblDate3, lblDate4, lblDate5, lblDate6, lblDate7};
        Label[] arrUser = {lblUser0, lblUser1, lblUser2, lblUser3, lblUser4, lblUser5, lblUser6, lblUser7};
        Label[] arrAllTotal = {lblAllTotal0, lblAllTotal1, lblAllTotal2, lblAllTotal3, lblAllTotal4, lblAllTotal5, lblAllTotal6, lblAllTotal7};
        
        HBox[] arrBoxCartItem0 = {boxCartItem00, boxCartItem01, boxCartItem02, boxCartItem03, boxCartItem04, boxCartItem05, boxCartItem06};
        Label[] arrCountBill0 = {lblIdItem00, lblIdItem01, lblIdItem02, lblIdItem03, lblIdItem04, lblIdItem05, lblIdItem06};
        Label[] arrNameBill0 = {lblNameItem00, lblNameItem01, lblNameItem02, lblNameItem03, lblNameItem04, lblNameItem05, lblNameItem06};
        Label[] arrNumberBill0 = {lblNumberItem00, lblNumberItem01, lblNumberItem02, lblNumberItem03, lblNumberItem04, lblNumberItem05, lblNumberItem06};
        Label[] arrPriceBill0 = {lblPriceItem00, lblPriceItem01, lblPriceItem02, lblPriceItem03, lblPriceItem04, lblPriceItem05, lblPriceItem06};
        Label[] arrTotalItem0 = {lblTotalItem00, lblTotalItem01, lblTotalItem02, lblTotalItem03, lblTotalItem04, lblTotalItem05, lblTotalItem06};

        HBox[] arrBoxCartItem1 = {boxCartItem10, boxCartItem11, boxCartItem12, boxCartItem13, boxCartItem14, boxCartItem15, boxCartItem16};
        Label[] arrCountBill1 = {lblIdItem10, lblIdItem11, lblIdItem12, lblIdItem13, lblIdItem14, lblIdItem15, lblIdItem16};
        Label[] arrNameBill1 = {lblNameItem10, lblNameItem11, lblNameItem12, lblNameItem13, lblNameItem14, lblNameItem15, lblNameItem16};
        Label[] arrNumberBill1 = {lblNumberItem10, lblNumberItem11, lblNumberItem12, lblNumberItem13, lblNumberItem14, lblNumberItem15, lblNumberItem16};
        Label[] arrPriceBill1 = {lblPriceItem10, lblPriceItem11, lblPriceItem12, lblPriceItem13, lblPriceItem14, lblPriceItem15, lblPriceItem16};
        Label[] arrTotalItem1 = {lblTotalItem10, lblTotalItem11, lblTotalItem12, lblTotalItem13, lblTotalItem14, lblTotalItem15, lblTotalItem16};

        HBox[] arrBoxCartItem2 = {boxCartItem20, boxCartItem21, boxCartItem22, boxCartItem23, boxCartItem24, boxCartItem25, boxCartItem26};
        Label[] arrCountBill2 = {lblIdItem20, lblIdItem21, lblIdItem22, lblIdItem23, lblIdItem24, lblIdItem25, lblIdItem26};
        Label[] arrNameBill2 = {lblNameItem20, lblNameItem21, lblNameItem22, lblNameItem23, lblNameItem24, lblNameItem25, lblNameItem26};
        Label[] arrNumberBill2 = {lblNumberItem20, lblNumberItem21, lblNumberItem22, lblNumberItem23, lblNumberItem24, lblNumberItem25, lblNumberItem26};
        Label[] arrPriceBill2 = {lblPriceItem20, lblPriceItem21, lblPriceItem22, lblPriceItem23, lblPriceItem24, lblPriceItem25, lblPriceItem26};
        Label[] arrTotalItem2 = {lblTotalItem20, lblTotalItem21, lblTotalItem22, lblTotalItem23, lblTotalItem24, lblTotalItem25, lblTotalItem26};

        HBox[] arrBoxCartItem3 = {boxCartItem30, boxCartItem31, boxCartItem32, boxCartItem33, boxCartItem34, boxCartItem35, boxCartItem36};
        Label[] arrCountBill3 = {lblIdItem30, lblIdItem31, lblIdItem32, lblIdItem33, lblIdItem34, lblIdItem35, lblIdItem36};
        Label[] arrNameBill3 = {lblNameItem30, lblNameItem31, lblNameItem32, lblNameItem33, lblNameItem34, lblNameItem35, lblNameItem36};
        Label[] arrNumberBill3 = {lblNumberItem30, lblNumberItem31, lblNumberItem32, lblNumberItem33, lblNumberItem34, lblNumberItem35, lblNumberItem36};
        Label[] arrPriceBill3 = {lblPriceItem30, lblPriceItem31, lblPriceItem32, lblPriceItem33, lblPriceItem34, lblPriceItem35, lblPriceItem36};
        Label[] arrTotalItem3 = {lblTotalItem30, lblTotalItem31, lblTotalItem32, lblTotalItem33, lblTotalItem34, lblTotalItem35, lblTotalItem36};

        HBox[] arrBoxCartItem4 = {boxCartItem40, boxCartItem41, boxCartItem42, boxCartItem43, boxCartItem44, boxCartItem45, boxCartItem46};
        Label[] arrCountBill4 = {lblIdItem40, lblIdItem41, lblIdItem42, lblIdItem43, lblIdItem44, lblIdItem45, lblIdItem46};
        Label[] arrNameBill4 = {lblNameItem40, lblNameItem41, lblNameItem42, lblNameItem43, lblNameItem44, lblNameItem45, lblNameItem46};
        Label[] arrNumberBill4 = {lblNumberItem40, lblNumberItem41, lblNumberItem42, lblNumberItem43, lblNumberItem44, lblNumberItem45, lblNumberItem46};
        Label[] arrPriceBill4 = {lblPriceItem40, lblPriceItem41, lblPriceItem42, lblPriceItem43, lblPriceItem44, lblPriceItem45, lblPriceItem46};
        Label[] arrTotalItem4 = {lblTotalItem40, lblTotalItem41, lblTotalItem42, lblTotalItem43, lblTotalItem44, lblTotalItem45, lblTotalItem46};

        HBox[] arrBoxCartItem5 = {boxCartItem50, boxCartItem51, boxCartItem52, boxCartItem53, boxCartItem54, boxCartItem55, boxCartItem56};
        Label[] arrCountBill5 = {lblIdItem50, lblIdItem51, lblIdItem52, lblIdItem53, lblIdItem54, lblIdItem55, lblIdItem56};
        Label[] arrNameBill5 = {lblNameItem50, lblNameItem51, lblNameItem52, lblNameItem53, lblNameItem54, lblNameItem55, lblNameItem56};
        Label[] arrNumberBill5 = {lblNumberItem50, lblNumberItem51, lblNumberItem52, lblNumberItem53, lblNumberItem54, lblNumberItem55, lblNumberItem56};
        Label[] arrPriceBill5 = {lblPriceItem50, lblPriceItem51, lblPriceItem52, lblPriceItem53, lblPriceItem54, lblPriceItem55, lblPriceItem56};
        Label[] arrTotalItem5 = {lblTotalItem50, lblTotalItem51, lblTotalItem52, lblTotalItem53, lblTotalItem54, lblTotalItem55, lblTotalItem56};

        HBox[] arrBoxCartItem6 = {boxCartItem60, boxCartItem61, boxCartItem62, boxCartItem63, boxCartItem64, boxCartItem65, boxCartItem66};
        Label[] arrCountBill6 = {lblIdItem60, lblIdItem61, lblIdItem62, lblIdItem63, lblIdItem64, lblIdItem65, lblIdItem66};
        Label[] arrNameBill6 = {lblNameItem60, lblNameItem61, lblNameItem62, lblNameItem63, lblNameItem64, lblNameItem65, lblNameItem66};
        Label[] arrNumberBill6 = {lblNumberItem60, lblNumberItem61, lblNumberItem62, lblNumberItem63, lblNumberItem64, lblNumberItem65, lblNumberItem66};
        Label[] arrPriceBill6 = {lblPriceItem60, lblPriceItem61, lblPriceItem62, lblPriceItem63, lblPriceItem64, lblPriceItem65, lblPriceItem66};
        Label[] arrTotalItem6 = {lblTotalItem60, lblTotalItem61, lblTotalItem62, lblTotalItem63, lblTotalItem64, lblTotalItem65, lblTotalItem66};

        HBox[] arrBoxCartItem7 = {boxCartItem70, boxCartItem71, boxCartItem72, boxCartItem73, boxCartItem74, boxCartItem75, boxCartItem76};
        Label[] arrCountBill7 = {lblIdItem70, lblIdItem71, lblIdItem72, lblIdItem73, lblIdItem74, lblIdItem75, lblIdItem76};
        Label[] arrNameBill7 = {lblNameItem70, lblNameItem71, lblNameItem72, lblNameItem73, lblNameItem74, lblNameItem75, lblNameItem76};
        Label[] arrNumberBill7 = {lblNumberItem70, lblNumberItem71, lblNumberItem72, lblNumberItem73, lblNumberItem74, lblNumberItem75, lblNumberItem76};
        Label[] arrPriceBill7 = {lblPriceItem70, lblPriceItem71, lblPriceItem72, lblPriceItem73, lblPriceItem74, lblPriceItem75, lblPriceItem76};
        Label[] arrTotalItem7 = {lblTotalItem70, lblTotalItem71, lblTotalItem72, lblTotalItem73, lblTotalItem74, lblTotalItem75, lblTotalItem76};

        HBox[][] ListBoxCartItem = {arrBoxCartItem0, arrBoxCartItem1, arrBoxCartItem2, arrBoxCartItem3, arrBoxCartItem4, arrBoxCartItem5, arrBoxCartItem6, arrBoxCartItem7}; 
        Label[][] ListCountBill = {arrCountBill0, arrCountBill1, arrCountBill2, arrCountBill3, arrCountBill4, arrCountBill5, arrCountBill6, arrCountBill7 };
        Label[][] ListNameBill = {arrNameBill0, arrNameBill1, arrNameBill2, arrNameBill3, arrNameBill4, arrNameBill5, arrNameBill6, arrNameBill7};
        Label[][] ListNumberBill = {arrNumberBill0, arrNumberBill1, arrNumberBill2, arrNumberBill3, arrNumberBill4, arrNumberBill5, arrNumberBill6, arrNumberBill7};
        Label[][] ListPriceBill = {arrPriceBill0, arrPriceBill1, arrPriceBill2, arrPriceBill3, arrPriceBill4, arrPriceBill5, arrPriceBill6, arrPriceBill7};
        Label[][] ListTotalItem = {arrTotalItem0, arrTotalItem1, arrTotalItem2, arrTotalItem3, arrTotalItem4, arrTotalItem5, arrTotalItem6, arrTotalItem7};
        
        //finished
        VBox[] arrBoxBill_= {boxBill01, boxBill11, boxBill21, boxBill31, boxBill41, boxBill51, boxBill61,boxBill71};
        Label[] arrTime_ = {lblDate01, lblDate11, lblDate21, lblDate31, lblDate41, lblDate51, lblDate61, lblDate71};
        Label[] arrUser_= {lblUser01, lblUser11, lblUser21, lblUser31, lblUser41, lblUser51, lblUser61, lblUser71};
        Label[] arrAllTotal_= {lblAllTotal01, lblAllTotal11, lblAllTotal21, lblAllTotal31, lblAllTotal41, lblAllTotal51, lblAllTotal61, lblAllTotal71};
        
        HBox[] arrBoxCartItem0_= {boxCartItem001, boxCartItem011, boxCartItem021, boxCartItem031, boxCartItem041, boxCartItem051, boxCartItem061};
        Label[] arrCountBill0_ = {lblIdItem001, lblIdItem011, lblIdItem021, lblIdItem031, lblIdItem041, lblIdItem051, lblIdItem061};
        Label[] arrNameBill0_ = {lblNameItem001, lblNameItem011, lblNameItem021, lblNameItem031, lblNameItem041, lblNameItem051, lblNameItem061};
        Label[] arrNumberBill0_ = {lblNumberItem001, lblNumberItem011, lblNumberItem021, lblNumberItem031, lblNumberItem041, lblNumberItem051, lblNumberItem061};
        Label[] arrPriceBill0_ = {lblPriceItem001, lblPriceItem011, lblPriceItem021, lblPriceItem031, lblPriceItem041, lblPriceItem051, lblPriceItem061};
        Label[] arrTotalItem0_= {lblTotalItem001, lblTotalItem011, lblTotalItem021, lblTotalItem031, lblTotalItem041, lblTotalItem051, lblTotalItem061};

        HBox[] arrBoxCartItem1_= {boxCartItem101, boxCartItem111, boxCartItem121, boxCartItem131, boxCartItem141, boxCartItem151, boxCartItem161};
        Label[] arrCountBill1_ = {lblIdItem101, lblIdItem111, lblIdItem121, lblIdItem131, lblIdItem141, lblIdItem151, lblIdItem161};
        Label[] arrNameBill1_ = {lblNameItem101, lblNameItem111, lblNameItem121, lblNameItem131, lblNameItem141, lblNameItem151, lblNameItem161};
        Label[] arrNumberBill1_ = {lblNumberItem101, lblNumberItem111, lblNumberItem121, lblNumberItem131, lblNumberItem141, lblNumberItem151, lblNumberItem161};
        Label[] arrPriceBill1_ = {lblPriceItem101, lblPriceItem111, lblPriceItem121, lblPriceItem131, lblPriceItem141, lblPriceItem151, lblPriceItem161};
        Label[] arrTotalItem1_= {lblTotalItem101, lblTotalItem111, lblTotalItem121, lblTotalItem131, lblTotalItem141, lblTotalItem151, lblTotalItem161};

        HBox[] arrBoxCartItem2_= {boxCartItem201, boxCartItem211, boxCartItem221, boxCartItem231, boxCartItem241, boxCartItem251, boxCartItem261};
        Label[] arrCountBill2_ = {lblIdItem201, lblIdItem211, lblIdItem221, lblIdItem231, lblIdItem241, lblIdItem251, lblIdItem261};
        Label[] arrNameBill2_ = {lblNameItem201, lblNameItem211, lblNameItem221, lblNameItem231, lblNameItem241, lblNameItem251, lblNameItem261};
        Label[] arrNumberBill2_ = {lblNumberItem201, lblNumberItem211, lblNumberItem221, lblNumberItem231, lblNumberItem241, lblNumberItem251, lblNumberItem261};
        Label[] arrPriceBill2_ = {lblPriceItem201, lblPriceItem211, lblPriceItem221, lblPriceItem231, lblPriceItem241, lblPriceItem251, lblPriceItem261};
        Label[] arrTotalItem2_= {lblTotalItem201, lblTotalItem211, lblTotalItem221, lblTotalItem231, lblTotalItem241, lblTotalItem251, lblTotalItem261};

        HBox[] arrBoxCartItem3_= {boxCartItem301, boxCartItem311, boxCartItem321, boxCartItem331, boxCartItem341, boxCartItem351, boxCartItem361};
        Label[] arrCountBill3_ = {lblIdItem301, lblIdItem311, lblIdItem321, lblIdItem331, lblIdItem341, lblIdItem351, lblIdItem361};
        Label[] arrNameBill3_ = {lblNameItem301, lblNameItem311, lblNameItem321, lblNameItem331, lblNameItem341, lblNameItem351, lblNameItem361};
        Label[] arrNumberBill3_ = {lblNumberItem301, lblNumberItem311, lblNumberItem321, lblNumberItem331, lblNumberItem341, lblNumberItem351, lblNumberItem361};
        Label[] arrPriceBill3_ = {lblPriceItem301, lblPriceItem311, lblPriceItem321, lblPriceItem331, lblPriceItem341, lblPriceItem351, lblPriceItem361};
        Label[] arrTotalItem3_= {lblTotalItem301, lblTotalItem311, lblTotalItem321, lblTotalItem331, lblTotalItem341, lblTotalItem351, lblTotalItem361};

        HBox[] arrBoxCartItem4_= {boxCartItem401, boxCartItem411, boxCartItem421, boxCartItem431, boxCartItem441, boxCartItem451, boxCartItem461};
        Label[] arrCountBill4_ = {lblIdItem401, lblIdItem411, lblIdItem421, lblIdItem431, lblIdItem441, lblIdItem451, lblIdItem461};
        Label[] arrNameBill4_ = {lblNameItem401, lblNameItem411, lblNameItem421, lblNameItem431, lblNameItem441, lblNameItem451, lblNameItem461};
        Label[] arrNumberBill4_ = {lblNumberItem401, lblNumberItem411, lblNumberItem421, lblNumberItem431, lblNumberItem441, lblNumberItem451, lblNumberItem461};
        Label[] arrPriceBill4_ = {lblPriceItem401, lblPriceItem411, lblPriceItem421, lblPriceItem431, lblPriceItem441, lblPriceItem451, lblPriceItem461};
        Label[] arrTotalItem4_= {lblTotalItem401, lblTotalItem411, lblTotalItem421, lblTotalItem431, lblTotalItem441, lblTotalItem451, lblTotalItem461};

        HBox[] arrBoxCartItem5_= {boxCartItem501, boxCartItem511, boxCartItem521, boxCartItem531, boxCartItem541, boxCartItem551, boxCartItem561};
        Label[] arrCountBill5_ = {lblIdItem501, lblIdItem511, lblIdItem521, lblIdItem531, lblIdItem541, lblIdItem551, lblIdItem561};
        Label[] arrNameBill5_ = {lblNameItem501, lblNameItem511, lblNameItem521, lblNameItem531, lblNameItem541, lblNameItem551, lblNameItem561};
        Label[] arrNumberBill5_ = {lblNumberItem501, lblNumberItem511, lblNumberItem521, lblNumberItem531, lblNumberItem541, lblNumberItem551, lblNumberItem561};
        Label[] arrPriceBill5_ = {lblPriceItem501, lblPriceItem511, lblPriceItem521, lblPriceItem531, lblPriceItem541, lblPriceItem551, lblPriceItem561};
        Label[] arrTotalItem5_= {lblTotalItem501, lblTotalItem511, lblTotalItem521, lblTotalItem531, lblTotalItem541, lblTotalItem551, lblTotalItem561};

        HBox[] arrBoxCartItem6_= {boxCartItem601, boxCartItem611, boxCartItem621, boxCartItem631, boxCartItem641, boxCartItem651, boxCartItem661};
        Label[] arrCountBill6_ = {lblIdItem601, lblIdItem611, lblIdItem621, lblIdItem631, lblIdItem641, lblIdItem651, lblIdItem661};
        Label[] arrNameBill6_ = {lblNameItem601, lblNameItem611, lblNameItem621, lblNameItem631, lblNameItem641, lblNameItem651, lblNameItem661};
        Label[] arrNumberBill6_ = {lblNumberItem601, lblNumberItem611, lblNumberItem621, lblNumberItem631, lblNumberItem641, lblNumberItem651, lblNumberItem661};
        Label[] arrPriceBill6_ = {lblPriceItem601, lblPriceItem611, lblPriceItem621, lblPriceItem631, lblPriceItem641, lblPriceItem651, lblPriceItem661};
        Label[] arrTotalItem6_= {lblTotalItem601, lblTotalItem611, lblTotalItem621, lblTotalItem631, lblTotalItem641, lblTotalItem651, lblTotalItem661};

        HBox[] arrBoxCartItem7_= {boxCartItem701, boxCartItem711, boxCartItem721, boxCartItem731, boxCartItem741, boxCartItem751, boxCartItem761};
        Label[] arrCountBill7_ = {lblIdItem701, lblIdItem711, lblIdItem721, lblIdItem731, lblIdItem741, lblIdItem751, lblIdItem761};
        Label[] arrNameBill7_ = {lblNameItem701, lblNameItem711, lblNameItem721, lblNameItem731, lblNameItem741, lblNameItem751, lblNameItem761};
        Label[] arrNumberBill7_ = {lblNumberItem701, lblNumberItem711, lblNumberItem721, lblNumberItem731, lblNumberItem741, lblNumberItem751, lblNumberItem761};
        Label[] arrPriceBill7_ = {lblPriceItem701, lblPriceItem711, lblPriceItem721, lblPriceItem731, lblPriceItem741, lblPriceItem751, lblPriceItem761};
        Label[] arrTotalItem7_= {lblTotalItem701, lblTotalItem711, lblTotalItem721, lblTotalItem731, lblTotalItem741, lblTotalItem751, lblTotalItem761};

        HBox[][] ListBoxCartItem_ = {arrBoxCartItem0_, arrBoxCartItem1_, arrBoxCartItem2_, arrBoxCartItem3_, arrBoxCartItem4_, arrBoxCartItem5_, arrBoxCartItem6_, arrBoxCartItem7_}; 
        Label[][] ListCountBill_ = {arrCountBill0_, arrCountBill1_, arrCountBill2_, arrCountBill3_, arrCountBill4_, arrCountBill5_, arrCountBill6_, arrCountBill7_ };
        Label[][] ListNameBill_ = {arrNameBill0_, arrNameBill1_, arrNameBill2_, arrNameBill3_, arrNameBill4_, arrNameBill5_, arrNameBill6_, arrNameBill7_};
        Label[][] ListNumberBill_ = {arrNumberBill0_, arrNumberBill1_, arrNumberBill2_, arrNumberBill3_, arrNumberBill4_, arrNumberBill5_, arrNumberBill6_, arrNumberBill7_};
        Label[][] ListPriceBill_ = {arrPriceBill0_, arrPriceBill1_, arrPriceBill2_, arrPriceBill3_, arrPriceBill4_, arrPriceBill5_, arrPriceBill6_, arrPriceBill7_};
        Label[][] ListTotalItem_ = {arrTotalItem0_, arrTotalItem1_, arrTotalItem2_, arrTotalItem3_, arrTotalItem4_, arrTotalItem5_, arrTotalItem6_, arrTotalItem7_};
        
        for(int i = 0; i< 8;i++){
            arrBoxBill[i].setVisible(false);
            arrUser[i].setText("");
            arrTime[i].setText("");
            
            arrBoxBill_[i].setVisible(false);
            arrUser_[i].setText("");
            arrTime_[i].setText("");
            
            arrAllTotal[i].setText("");
            for(int j=0;j< 6; j++){
                ListCountBill_[i][j].setText("");
                ListNameBill_[i][j].setText("");
                ListNumberBill_[i][j].setText("");
                ListPriceBill_[i][j].setText("");
                ListTotalItem_[i][j].setText("");
            }
        } 
        
        ArrayList<FullBill> fullBillWaiting = new ArrayList<>();
        ArrayList<FullBill> fullBillFinished = new ArrayList<>();
        fullBillWaiting = loadBill("waiting");
        fullBillFinished = loadBill("done");
        
        for(FullBill fb : fullBillWaiting){
            for(int i = 0; i< 8; i++){
                if(arrTime[i].getText().equals("")){
                    int allTotal = 0;
                    int total = 0;
                    arrBoxBill[i].setVisible(true);
                    arrTime[i].setText(fb.date + " " + fb.time);
                    arrUser[i].setText(fb.username);
                    for(int j=0;j< fb.menuDrink.size(); j++){
                        ListBoxCartItem[i][j].setVisible(true);
                        ListCountBill[i][j].setText(String.valueOf(j+1));
                        ListNameBill[i][j].setText(fb.menuDrink.get(j).name + "("+fb.size[j] + ")");
                        ListNumberBill[i][j].setText(fb.amount[j]);
                        if(fb.size[j].equals("size M")){
                            ListPriceBill[i][j].setText(String.valueOf(fb.menuDrink.get(j).priceM));
                            total = fb.menuDrink.get(j).priceM * Integer.parseInt(fb.amount[j]);
                            ListTotalItem[i][j].setText(String.valueOf(total));
                            allTotal = allTotal + total ;
                        }
                        else{
                            ListPriceBill[i][j].setText(String.valueOf(fb.menuDrink.get(j).priceL));;
                            total = fb.menuDrink.get(j).priceL * Integer.parseInt(fb.amount[j]);
                            ListTotalItem[i][j].setText(String.valueOf(total));
                            allTotal = allTotal + total;
                        }

                    }
                    arrAllTotal[i].setText(String.valueOf(allTotal));
                    break; 
                }      
            }
        }
        
        for(FullBill fb : fullBillFinished){
            for(int i = 0; i< 8; i++){
                if(arrTime_[i].getText().equals("")){
                    int allTotal = 0;
                    int total = 0;
                    arrBoxBill_[i].setVisible(true);
                    arrTime_[i].setText(fb.date + " " + fb.time);
                    arrUser_[i].setText(fb.username);
                    for(int j=0;j< fb.menuDrink.size(); j++){
                        ListBoxCartItem_[i][j].setVisible(true);
                        ListCountBill_[i][j].setText(String.valueOf(j+1));
                        ListNameBill_[i][j].setText(fb.menuDrink.get(j).name + "("+fb.size[j] + ")");
                        ListNumberBill_[i][j].setText(fb.amount[j]);
                        if(fb.size[j].equals("size M")){
                            ListPriceBill_[i][j].setText(String.valueOf(fb.menuDrink.get(j).priceM));
                            total = fb.menuDrink.get(j).priceM * Integer.parseInt(fb.amount[j]);
                            ListTotalItem_[i][j].setText(String.valueOf(total));
                            allTotal = allTotal + total ;
                        }
                        else{
                            ListPriceBill_[i][j].setText(String.valueOf(fb.menuDrink.get(j).priceL));;
                            total = fb.menuDrink.get(j).priceL * Integer.parseInt(fb.amount[j]);
                            ListTotalItem_[i][j].setText(String.valueOf(total));
                            allTotal = allTotal + total;
                        }

                    }
                    arrAllTotal_[i].setText(String.valueOf(allTotal));
                    break; 
                }
            }
        }
        
    }
    
    //hàm này dùng để chuyển từ waiting sang finished
    public void confirmToFinished(MouseEvent event){
        
        
        Button[] arrConfirm = {btnConfirmBill0, btnConfirmBill1, btnConfirmBill2, btnConfirmBill3, btnConfirmBill4, btnConfirmBill5, btnConfirmBill6, btnConfirmBill7};
        
        for(int i = 0 ; i< 8 ; i++){
            if(event.getSource() == arrConfirm[i]){
                try {
                    ArrayList<FullBill> fullBill = new ArrayList<>();
                    fullBill = loadBill("waiting");
                    int id = fullBill.get(i).billID;
                    String sql = "update Bill set Status = ? where BillID = '" + id + "'";
                    preparedStatement = con.prepareStatement(sql);
                    preparedStatement.setString(1, "done");
                    preparedStatement.executeUpdate();
                    preparedStatement.close();
                    printBill();
                    tableViewEditBillInitialize();
                } catch (SQLException ex) {
                    Logger.getLogger(MenuFormController.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        }
        statisticChart();
    }

    public void alert(String info){
        BoxBlur blur = new BoxBlur(3,3,3);
        JFXDialogLayout layout = new JFXDialogLayout();
        JFXButton button = new JFXButton("Đã xem");
        JFXDialog alert = new JFXDialog(rootpane, layout, JFXDialog.DialogTransition.CENTER);
        button.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent event) -> {
            
            alert.close();
        });
        
        layout.setBody(new Text(info));
        layout.setActions(button);
        alert.show();
        alert.setOnDialogClosed((JFXDialogEvent event) -> {
            anchorPane.setEffect(null);
        });
        anchorPane.setEffect(blur);
    }
    
    //hàm này dùng để lấy tên tài khoản
    public void getUsername (String user, String pos, String name){
        lblNameAccount.setText(user);
        lblPosition.setText(pos);
        lblUsername.setText(name);
    }

    //Hàm này tạo alert để xác nhận xóa account
    public void confirmDeleteAccount(String username){
        BoxBlur blur = new BoxBlur(3,3,3);
        JFXDialogLayout layout = new JFXDialogLayout();
        JFXButton button1 = new JFXButton("Xóa");
        JFXButton button2 = new JFXButton("Hủy");
        JFXDialog alert = new JFXDialog(rootpane, layout, JFXDialog.DialogTransition.CENTER);
        button1.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent event)-> {
            alert.close();
            deleteAccount(username);
        });
        button2.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent event) -> {
            alert.close();
        });        
        layout.setBody(new Text("Bạn có chắc chắn muốn xóa tài khoản này?"));
        layout.setActions(button1,button2);
        alert.show();
        alert.setOnDialogClosed((JFXDialogEvent event) -> {
            anchorPane.setEffect(null);
        });
        anchorPane.setEffect(blur);
    }
    
    //Hàm này tạo alert xác nhận xóa món menu
    public void confirmDeleteMenu(String name){
        BoxBlur blur = new BoxBlur(3,3,3);
        JFXDialogLayout layout = new JFXDialogLayout();
        JFXButton button1 = new JFXButton("Xóa");
        JFXButton button2 = new JFXButton("Hủy");
        JFXDialog alert = new JFXDialog(rootpane, layout, JFXDialog.DialogTransition.CENTER);
        button1.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent event)-> {
            alert.close();
            deleteDrink(name);
        });
        button2.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent event) -> {
            alert.close();
        });        
        layout.setBody(new Text("Bạn có chắc chắn muốn xóa món này?"));
        layout.setActions(button1,button2);
        alert.show();
        alert.setOnDialogClosed((JFXDialogEvent event) -> {
            anchorPane.setEffect(null);
        });
        anchorPane.setEffect(blur);
    }
    
    //Hàm này để tìm kiếm tài khoản (Button Search)
    public void searchAccount(){
        String username=txtUsername.getText().trim();
        if(username.isEmpty()){
            resetAccountLabelField();
            lblUsernameError.setText("Chưa nhập tên tài khoản");
        }
        else if(username.length()<2||username.length()>30){
            resetAccountLabelField();
            lblUsernameError.setText("Tên tài khoản có độ dài 2-30 kí tự");
        }
        else if(username.contains(" ")){
            resetAccountLabelField();
            lblUsernameError.setText("Tên tài khoản không đúng định dạng");
        }
        else{
            if (search(username)==true){
                String sql="select * from Account where Username='"+username+"'";
                try{
                    PreparedStatement ps = con.prepareStatement(sql);
                    ResultSet rs = ps.executeQuery();
                    employees.clear();
                    while(rs.next()){
                        txtPassword.setText(rs.getString("Password"));
                        txtName.setText(rs.getString("Name"));
                        txtTel.setText(rs.getString("Tel"));
                        DateFormat date=new SimpleDateFormat("yyyy-MM-dd");
                        Date newDate=new Date();
                        newDate=date.parse(rs.getString("Birth"));
                        LocalDate local=newDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                        datePickerBirth.setValue(local);
                        choiceBox_Position.setValue(rs.getString("Position"));
                        employees.add(new Employee(rs.getString("Username"),rs.getString("Password"),rs.getString("Name"),
                            rs.getString("Tel"),dateToString(rs.getString("Birth")),rs.getString("Position"),
                            rs.getString("AccountStatus")));
                        resetAccountLabelField();
                    }
                }
                catch(Exception e){
                    e.printStackTrace();
                    System.out.println("Lỗi tìm kiếm tài khoản");
                }
            }
            else {
                resetAccountLabelField();
                employees.clear();
                lblUsernameError.setText("Tài khoản không tồn tại");
            }
        }
    }
    
    //Hàm này trả vô tài khoản có tồn tại hay không
    public boolean search(String username){
        String sql="select * from Account where Username='"+username+"'";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                if(rs.getString("AccountStatus").equals("Active")){
                    return true;
                }
                else return false;
            }
            else return false;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
    
    //Hàm này để thêm tài khoản (Button Add)
    public void addAccount(){
        String username=txtUsername.getText().trim();
        System.out.println(username);
        String password=null,name=null,tel=null,birth=null,position=null;
        
        //Check Username
        if(username.isEmpty()){
            resetAccountLabelField();
            lblUsernameError.setText("Chưa nhập tên tài khoản");
        }
        else if(username.length()<2||username.length()>30){
            resetAccountLabelField();
            lblUsernameError.setText("Tên tài khoản có độ dài 2-30 kí tự");
        }
        else if(username.contains(" ")){
            resetAccountLabelField();
            lblUsernameError.setText("Tên tài khoản không đúng định dạng");
        }
        else if(search(username)==false){
            try{
                String sql="select * from Account where Username='"+username+"' and AccountStatus='Disable'";
                PreparedStatement ps=con.prepareStatement(sql);
                ResultSet rs=ps.executeQuery();
                if(rs.next()){
                    lblUsernameError.setText("Tài khoản đã bị vô hiệu hóa");
                }
                else{
                    password=txtPassword.getText().trim();
                    name=txtName.getText().trim();
                    tel=txtTel.getText().trim();
                    birth=datePickerBirth.getValue().toString().trim();
                    String birth_con=dateToString(birth);
                    position=String.valueOf(choiceBox_Position.getValue());
                    System.out.println("Checking Account");
                    int check=detailCheck(password,name,tel,birth_con);
                    if(check==4){
                        try{
                            con.prepareStatement("insert into Account(Username,Password,Name,Birth,Tel,Position,AccountStatus) "
                                    + "values ('"+username+"','"+password+"', N'"+name+"','"+birth+"',"
                                    +"'"+tel+"', N'"+position+"','Active')").execute();
                            alert("Thêm tài khoản thành công");
                            resetAllAccountField();
                            tableViewAccountInitialize();
                        }
                        catch(Exception e){
                            System.out.println("Thêm tài khoản thất bại");
                            e.printStackTrace();
                        }
                    }
                }
            }
            catch(Exception e){
                lblBirthError.setText("Ngày tháng năm sinh không được bỏ trống");
                birth="";
                detailCheck(password,name,tel,birth);
            }
        }
        else{
            resetAccountLabelField();
            lblUsernameError.setText("Tài khoản đã tồn tại");
        }
    }            
    
    //Hàm này để kiểm tra các chi tiết của tài khoản
    public int detailCheck(String password, String name, String tel, String birth){
        resetAccountLabelField();
        int temp=0;
        
        //Check password
        if (password.isEmpty()){
            lblPasswordError.setText("Mật khẩu không được để trống");
        }
        else {
            if(password.length()<8||password.length()>30){
                    lblPasswordError.setText("Mật khẩu có độ dài 8-30 kí tự");
                }
            else temp++;
        }
        
        //Check Tel
        if (tel.isEmpty()){
            lblTelError.setText("Số điện thoại không được để trống");
        }
        else{
            int telCheck=0;
            try{
                telCheck=Integer.parseInt(tel);
                if(tel.length()!=10){
                    lblTelError.setText("Số điện thoại có 10 số");
                }
                else if(tel.startsWith("0")==false){
                    lblTelError.setText("Số điện thoại không đúng định dạng");
                }
                else temp++;
            }
            catch(Exception e){
                    lblTelError.setText("Số điện thoại không đúng định dạng");
            }
            
        }
        
        //Check 
        boolean check=false;
        
//        Pattern pattern = Pattern.compile("^[\\p{L}]+[\\s]?[\\p{L}]+[\\s]?[\\p{L}]+[\\s]?[\\p{L}]*$");
        if (name.isEmpty()){
            lblNameError.setText("Tên không được để trống");
        }
        else if(name.length()>1&&name.length()<31){
            int temp2=0;
            for(int i=0;i<name.length()-1;i++){
                if (String.valueOf(name.charAt(i)).equals(" ")&&String.valueOf(name.charAt(i+1)).equals(" ")){
                    temp2=1;
                    lblNameError.setText("Tên không đúng định dạng");
                    break;
                }   
            }
            if(temp2==0){
                Pattern pattern = Pattern.compile("^[\\p{L}\\s]*$");
                Matcher match = pattern.matcher(name);
                check = match.find();
                if (check==true) temp++;
                else lblNameError.setText("Tên không đúng định dạng");
            }
        }
        else{
            Pattern pattern = Pattern.compile("^[\\p{L}\\s]*$");
            Matcher match = pattern.matcher(name);
            boolean check2=match.find();
            if (check2==true){
                lblNameError.setText("Tên có độ dài 2-30 kí tự");
            }
            else{
                lblNameError.setText("Tên không đúng định dạng");
            }
        }
        
        //Check birth
        if(birth.isEmpty()){
            lblBirthError.setText("Ngày tháng năm sinh không được để trống");
        }
        else if (birth.length()!=10){
            System.out.println("1 "+birth);
            lblBirthError.setText("Ngày tháng năm sinh không đúng định dạng");
        }
        else{
            try{
                System.out.println("birth "+birth);
                int birthCheck=dateCheckFormat(birth);
                if(birthCheck==4){
                    temp++;
                }
                else{
                    System.out.println("2 "+birth);
                    lblBirthError.setText("Ngày tháng năm sinh không đúng định dạng");
                }
            }
            catch(Exception e){
                System.out.println("3 "+birth);
                lblBirthError.setText("Ngày tháng năm sinh không đúng định dạng");
            }
        }
        
        return temp;
    }
    
    //Hàm này để edit thông tin tài khoản (Button Edit)
    public void editDetail(){
        String username=txtUsername.getText().trim();
        String password=txtPassword.getText().trim();
        String name=txtName.getText().trim();
        String tel=txtTel.getText().trim();
        String position=String.valueOf(choiceBox_Position.getValue());
        int check=0;
        if (username.isEmpty()){
            Employee em=tableViewAccount.getSelectionModel().getSelectedItem();
            if(em==null){
                lblUsernameError.setText("Chưa nhập tên tài khoản/Chưa chọn tài khoản ");
            }
            else if(em.status.equals("Disable")){
                alert("Tài khoản này đã bị vô hiệu hóa");
            }
            else{
                try{
                    resetAccountLabelField();
                    String sql="select * from Account where Username='"+em.username+"' and AccountStatus='Active'";
                    PreparedStatement ps=con.prepareStatement(sql);
                    ResultSet rs=ps.executeQuery();
                    while (rs.next()){
                        txtUsername.setText(rs.getString("Username"));
                        txtPassword.setText(rs.getString("Password"));
                        txtName.setText(rs.getString("Name"));
                        txtTel.setText(rs.getString("Tel"));
                        DateFormat date=new SimpleDateFormat("yyyy-MM-dd");
                        Date newDate=new Date();
                        newDate=date.parse(rs.getString("Birth"));
                        LocalDate local=newDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                        datePickerBirth.setValue(local);
                        choiceBox_Position.setValue(rs.getString("Position"));
                    }
                }
                catch(Exception e){
                    e.printStackTrace();
                    System.out.println("Không thể load thông tin tài khoản");
                }
            }
        }
        else if(username.length()<2||username.length()>30){
            resetAccountLabelField();
            lblUsernameError.setText("Tên tài khoản có độ dài 2-30 kí tự");
        }
        else if(username.contains(" ")){
            resetAccountLabelField();
            lblUsernameError.setText("Tên tài khoản không đúng định dạng");
        }
        else{
            if(search(username)==true){
                try{
                    String birth=datePickerBirth.getValue().toString().trim();
                    String birth_con=dateToString(birth);
                    check=detailCheck(password,name,tel,birth_con);
                    if(check==4){
                    try{
                        String sql2="update Account "
                                + "set Password='"+password+"', Name=N'"+name+"', Birth='"+birth
                                +"', Tel='"+tel+"', Position=N'"+position+"'"
                                + "where Username='"+username+"'";
                        PreparedStatement ps2=con.prepareStatement(sql2);
                        ps2.executeUpdate();
                        alert("Update thông tin thành công");
                        resetAllAccountField();
                    }
                    catch(Exception e){
                        System.out.println("Không thể update thông tin");
                        e.printStackTrace();
                        }
                    }
                }
                catch(Exception e){
                    lblBirthError.setText("Ngày tháng năm sinh không được bỏ trống");
                    String birth="";
                    detailCheck(password,name,tel,birth);
                }
            }
            else {
                resetAccountLabelField();
                lblUsernameError.setText("Tài khoản không tồn tại");
            }
        }
    }
    
    //Hàm kiểm tra tài khoản có tồn tại hay không trước khi xóa (Button Delete)
    public void deleteCheck(){
        String username=txtUsername.getText().trim();
        if (username.isEmpty()){
            Employee em=tableViewAccount.getSelectionModel().getSelectedItem();
            if(em==null){
                lblUsernameError.setText("Chưa nhập tên tài khoản/Chưa chọn tài khoản");
            }
            else if(em.status.equals("Disable")){
                alert("Tài khoản này đã bị vô hiệu hóa");
            }
            else{
                confirmDeleteAccount(em.username);
            }
        }
        else if(username.length()<2||username.length()>30){
            resetAccountLabelField();
            lblUsernameError.setText("Tên tài khoản có độ dài 2-30 kí tự");
        }
        else if(username.contains(" ")){
            resetAccountLabelField();
            lblUsernameError.setText("Tên tài khoản không đúng định dạng");
        }
        else{
            boolean check=search(username);
            if (check==true){
                confirmDeleteAccount(username);
            }
            else lblUsernameError.setText("Tài khoản không tồn tại");
        }
    }
    
    //Hàm SQL xóa tài khoản
    public void deleteAccount(String username){
        String sql="update Account set AccountStatus='Disable' where Username='"+username+"'";
        try{
            PreparedStatement ps=con.prepareStatement(sql);
            ps.executeUpdate();
            alert("Xóa tài khoản thành công");
            resetAllAccountField();
            if(username.equals(lblUsername.getText())){
                try{
                    String info="Phiên đăng nhập đã hết hạn";
                    BoxBlur blur = new BoxBlur(3,3,3);
                    JFXDialogLayout layout = new JFXDialogLayout();
                    JFXButton button = new JFXButton("Đã xem");
                    JFXDialog alert = new JFXDialog(rootpane, layout, JFXDialog.DialogTransition.CENTER);
                    button.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent event) -> {
                        alert.close();
                        btnLogout();
                    });

                    layout.setBody(new Text(info));
                    layout.setActions(button);
                    alert.show();
                    alert.setOnDialogClosed((JFXDialogEvent event) -> {
                        anchorPane.setEffect(null);
                    });
                    anchorPane.setEffect(blur);
                }
                catch(Exception e){
                    e.printStackTrace();
                    System.out.println("Lỗi auto logout");
                }
            }
        }
        catch(Exception e){
            alert("Xảy ra lỗi. Xóa tài khoản thất bại");
            e.printStackTrace();
        }
    }
    
    public void confirmLogout(){
        String info="Bạn có chắc chắn muốn đăng xuất";
        BoxBlur blur = new BoxBlur(3,3,3);
        JFXDialogLayout layout = new JFXDialogLayout();
        JFXButton button1 = new JFXButton("OK");
        JFXButton button2 = new JFXButton("Hủy");
        JFXDialog alert = new JFXDialog(rootpane, layout, JFXDialog.DialogTransition.CENTER);
        button1.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent event)-> {
            alert.close();
            Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            stage.close();
            btnLogout();
        });
        button2.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent event) -> {
            alert.close();
        });        
        layout.setBody(new Text(info));
        layout.setActions(button1,button2);
        alert.show();
        alert.setOnDialogClosed((JFXDialogEvent event) -> {
            anchorPane.setEffect(null);
        });
        anchorPane.setEffect(blur);
    }
    
    public void tableViewAccountInitialize(){
        tableViewAccount.getItems().clear();
        String sql="select * from Account";
        try{
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                employees.add(new Employee(rs.getString("Username"),rs.getString("Password"),rs.getString("Name"),
                                rs.getString("Tel"),dateToString(rs.getString("Birth")),rs.getString("Position"),
                                rs.getString("AccountStatus")));
            }
            
            col_username.setCellValueFactory(new PropertyValueFactory<Employee, String>("username"));
            col_password.setCellValueFactory(new PropertyValueFactory<Employee, String>("password"));
            col_accountName.setCellValueFactory(new PropertyValueFactory<Employee, String>("name"));
            col_tel.setCellValueFactory(new PropertyValueFactory<Employee, String>("tel"));
            col_birth.setCellValueFactory(new PropertyValueFactory<Employee, String>("birth"));
            col_position.setCellValueFactory(new PropertyValueFactory<Employee, String>("position"));
            col_status.setCellValueFactory(new PropertyValueFactory<Employee, String>("status"));
            
            tableViewAccount.setItems(employees);
        }
        catch(Exception e){
            e.printStackTrace();
            System.out.println("Không thể load dữ liệu vào table view account");
        }
    }
    
    //Hàm xóa các textfield của tài khoản
    public void resetAccountTextField(){
        txtUsername.setText("");
        txtPassword.setText("");
        txtName.setText("");
        txtTel.setText("");
        datePickerBirth.setValue(null);
        choiceBox_Position.setValue("Nhân viên");
    }
    
    //Hàm xóa các textfield của tài khoản
    public void resetAccountLabelField(){
        lblUsernameError.setText("");
        lblPasswordError.setText("");
        lblNameError.setText("");
        lblTelError.setText("");
        lblBirthError.setText("");
        lblPositionError.setText("");
    }
    
    //Hàm xóa all field tài khoản
    public void resetAllAccountField(){
        resetAccountLabelField();
        resetAccountTextField();
        employees.clear();
        tableViewAccountInitialize();
    }
    
    //Hàm xóa label lỗi của phần chọn ngày tháng thống kê
    public void resetDatePickerField(){
        lblDateStartError.setText("");
        lblDateEndError.setText("");
    }
    
    //Hàm xóa label thông tin doanh thu nếu có lỗi
    public void resetDateStatistic(){
        lblDateStart.setText("");
        lblDateEnd.setText("");
        lblNum.setText("");
        lblTotalBill.setText("");
    }
    
    //Hàm thống kê (Button OK)
    public void statistic(){
        resetDatePickerField();
        if (datePickerStart.getValue() == null){
            lblDateStartError.setText("Chưa chọn ngày tháng năm bắt đầu");
        }
        if (datePickerEnd.getValue() == null){
            lblDateEndError.setText("Chưa chọn ngày tháng năm kết thúc");
        }
        if(datePickerStart.getValue()!=null && datePickerEnd.getValue()!=null){
            boolean check = dateCheck(datePickerStart.getValue().toString(),datePickerEnd.getValue().toString());
            if(check==true){
                try{
                    int num=0,total=0;
                    String start=String.valueOf(datePickerStart.getValue());
                    String end=String.valueOf(datePickerEnd.getValue());
                    String sql = "select * from BILL where Date between '"+start+"' and '"+end+"'";
                    PreparedStatement ps=con.prepareStatement(sql);
                    ResultSet rs=ps.executeQuery();
                    while(rs.next()){
                        num++;
                        total=total+Integer.parseInt(rs.getString("Total"));
                    }
                    lblDateStart.setText("Ngày bắt đầu: "+dateToString(start));
                    lblDateEnd.setText("Ngày kết thúc: "+dateToString(end));
                    lblNum.setText(String.valueOf("Số hóa đơn: "+num));
                    lblTotalBill.setText("Tổng doanh thu: "+String.valueOf(total));
                    resetDatePickerField();
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
    
    //Hàm kiểm tra ngày bắt đầu luôn nhỏ hơn hoặc bằng ngày kết thúc
    public boolean dateCheck(String dateStart, String dateEnd){
        int yearStart,yearEnd,monthStart,monthEnd,dayStart,dayEnd;
        
        yearStart=Integer.parseInt(dateStart.substring(0,4));
        monthStart=Integer.parseInt(dateStart.substring(5,7));
        System.out.println(monthStart);
        dayStart=Integer.parseInt(dateStart.substring(8));
        System.out.println(dayStart);
        
        yearEnd=Integer.parseInt(dateEnd.substring(0,4));
        monthEnd=Integer.parseInt(dateEnd.substring(5,7));
        System.out.println(monthEnd);
        dayEnd=Integer.parseInt(dateEnd.substring(8));
        System.out.println(dateEnd);
        
        if (yearStart<=yearEnd){
            if(monthStart==monthEnd){
                if (dayStart<=dayEnd){
                    return true;
                }
                else{
                    lblDateStartError.setText("Ngày tháng năm lỗi");
                    lblDateEndError.setText("Ngày tháng năm lỗi");
                    resetDateStatistic();
                    return false;
                }
            }
            else if(monthStart<monthEnd){
                return true;
            }
            else{
                lblDateStartError.setText("Ngày tháng năm lỗi");
                lblDateEndError.setText("Ngày tháng năm lỗi");
                resetDateStatistic();
                return false;
            }
        }
        else{
            lblDateStartError.setText("Ngày tháng năm lỗi");
            lblDateEndError.setText("Ngày tháng năm lỗi");
            resetDateStatistic();
            return false;
        }
    }
    
    //Hàm reset statistic
    public void resetStatistic(){
        datePickerStart.setValue(null);
        datePickerEnd.setValue(null);
        resetDateStatistic();
        resetDatePickerField();
    }
    
    //Hàm kiểm tra ngày tháng năm nhập vào có đúng dạng hay không
    public int dateCheckFormat(String date){
        int dateCheck=0;
        if (Integer.parseInt(date.substring(0,2))>0 && Integer.parseInt(date.substring(0,2))<32) dateCheck++;
        if (Integer.parseInt(date.substring(3,5))>0 && Integer.parseInt(date.substring(3,5))<13) dateCheck++;
        if (Integer.parseInt(date.substring(6))>1900 && Integer.parseInt(date.substring(6))<2050) dateCheck++;
        if (date.substring(2,3).equals("/") && date.substring(5,6).equals("/")) dateCheck++;
        return dateCheck;
    }
    
    //Hàm chuyển từ dạng ngày tháng // sang --
    public String stringToDate(String s){
        String result=s.substring(6)+"-"+s.substring(3,5)+"-"+s.substring(0,2);
        return result;
    }
    
    //Hàm chuyển từ dạng ngày tháng -- sang //
    public String dateToString(String d){
        String result=d.substring(8)+"/"+d.substring(5,7)+"/"+d.substring(0,4);
        return result;
    }
    
    //Hàm chạy dữ liệu của tableview menu
    public void tableViewMenuInitialize(){
        tableViewMenu.getItems().clear();
        String sql = "select * from Drink,Type where Drink.TypeID=Type.TypeID";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                    drinks.add(new DrinksMenu(rs.getString("DrinkID"),rs.getString("DrinkName"),
                        rs.getInt("MSizePrice"), rs.getInt("LSizePrice"),rs.getString("TypeName"),rs.getString("Status")));
            }   
            
            col_id.setCellValueFactory(new PropertyValueFactory<DrinksMenu, String>("id"));
            col_name.setCellValueFactory(new PropertyValueFactory<DrinksMenu, String>("name"));
            col_priceM.setCellValueFactory(new PropertyValueFactory<DrinksMenu, Integer>("priceM"));
            col_priceL.setCellValueFactory(new PropertyValueFactory<DrinksMenu, Integer>("priceL"));
            col_type.setCellValueFactory(new PropertyValueFactory<DrinksMenu, String>("type"));
            col_drinkStatus.setCellValueFactory(new PropertyValueFactory<DrinksMenu, String>("status"));

            tableViewMenu.setItems(drinks);

        }
        catch(Exception e){
            System.out.println("Không thể load dữ liệu vào table menu");
            e.printStackTrace();
        }
    }
    
    //Hàm tableViewMenuBill
    public void tableViewMenuBillInitialize(){
        tableViewMenuBill.getItems().clear();
        String sql = "select * from Drink,Type where Drink.TypeID=Type.TypeID";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                    drinks_bill.add(new DrinksMenu(rs.getString("DrinkID"),rs.getString("DrinkName"),
                        rs.getInt("MSizePrice"), rs.getInt("LSizePrice"),rs.getString("TypeName"),rs.getString("Status")));
            }
                        
            DrinkID_tb.setCellValueFactory(new PropertyValueFactory<DrinksMenu, String>("id"));
            DrinkName_tb.setCellValueFactory(new PropertyValueFactory<DrinksMenu, String>("name"));
            MSize_tb.setCellValueFactory(new PropertyValueFactory<DrinksMenu, Integer>("priceM"));
            LSize_tb.setCellValueFactory(new PropertyValueFactory<DrinksMenu, Integer>("priceL"));
            Type_tb.setCellValueFactory(new PropertyValueFactory<DrinksMenu, String>("type"));
            DrinkStatus_tb.setCellValueFactory(new PropertyValueFactory<DrinksMenu, String>("status"));
            
            tableViewMenuBill.setItems(drinks_bill);

        }
        catch(Exception e){
            System.out.println("Không thể load dữ liệu vào table menu");
            e.printStackTrace();
        }
    }
    
    //Hàm tableViewEditBill
    public void tableViewEditBillInitialize(){
        tableViewBill.getItems().clear();
        String sql1 = "select * from Bill ";
        try {
            preparedStatement = con.prepareStatement(sql1);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                FullBill fb = new FullBill();
                fb.billID = resultSet.getInt("BillID");
                fb.username = resultSet.getString("Username");
                fb.date = dateToString(resultSet.getString("Date"));
                fb.time = resultSet.getString("Time");
                fb.status = resultSet.getString("Status");
                fb.total = resultSet.getInt("Total");
                //câu truy vấn 2 lấy bill detail theo id (bữa m viết ko có id nên ko ra)
                String sql2 = "select * from BillDetail where BillID = '" + fb.billID + "'";
                PreparedStatement preparedStatement1 = con.prepareStatement(sql2);    
                ResultSet resultSet1 = preparedStatement1.executeQuery();
                int i = 0;
                while(resultSet1.next()){
                    fb.amount[i] = resultSet1.getString("Quantity");
                    fb.size[i] = resultSet1.getString("Size");
                    String sql3 = "select * from Drink where DrinkID = '" + resultSet1.getString("DrinkID") +"'";
                    PreparedStatement preparedStatement2 = con.prepareStatement(sql3);
                    ResultSet resultSet2 = preparedStatement2.executeQuery();
                    while(resultSet2.next()){
                        DrinksMenu dm = new DrinksMenu();
                        dm.id = resultSet2.getString("DrinkID");
                        dm.name = resultSet2.getString("drinkName");
                        dm.priceM = resultSet2.getInt("MSizePrice");
                        dm.priceL = resultSet2.getInt("LSizePrice");
                        fb.menuDrink.add(dm);
                    }
                    i++;
                }
                fullBill.add(fb);   
            }
            System.out.print("\n");
            for(FullBill x : fullBill){
                System.out.print(x.billID + ". ");
            }
            BillID.setCellValueFactory(new PropertyValueFactory<FullBill, Integer>("billID"));
            Username_tb.setCellValueFactory(new PropertyValueFactory<FullBill, String>("username"));
            Date_tb.setCellValueFactory(new PropertyValueFactory<FullBill, String>("date"));
            Time_tb.setCellValueFactory(new PropertyValueFactory<FullBill, String>("time"));
            Total_tb.setCellValueFactory(new PropertyValueFactory<FullBill, Integer>("total"));
            Status_tb.setCellValueFactory(new PropertyValueFactory<FullBill, String>("status"));

            tableViewBill.setItems(fullBill);
        } catch (SQLException ex) {
            Logger.getLogger(MenuFormController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Hàm search tên món có tồn tại hay không
    public boolean drinkNameSearch(String name){
        try{
            String sql="select * from Drink where DrinkName=N'"+name+"' and Status='Active'";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                return true;
            }
        }
        catch(Exception e){
            System.out.println("Lỗi tìm kiếm tên nước");
            e.printStackTrace();
        }
        return false;
    }
    
    //Hàm tìm kiếm món theo tên nhập vào (Button Search)
    public void drinkSearch(){
        String name=txtMenuName.getText().trim();
        boolean check2=false;
        if(name.isEmpty()){
            lblMenuNameError.setText("Chưa nhập tên món");
        }
        else{
            if (name.length()>1 && name.length()<31){
                int temp2=0;
                for(int i=0;i<name.length()-1;i++){
                    if (String.valueOf(name.charAt(i)).equals(" ")&&String.valueOf(name.charAt(i+1)).equals(" ")){
                        temp2=1;
                        lblMenuNameError.setText("Tên không đúng định dạng");
                        break;
                    }   
                }
                if(temp2==0){
                    Pattern pattern = Pattern.compile("^[\\p{L}\\s]*$");
                    Matcher match = pattern.matcher(name);
                    check2 = match.find();
                }
                if(check2==true){
                    try{
                        String sql="select * from Drink,Type where Drink.TypeID=Type.TypeID and DrinkName=N'"+name+"'";
                        PreparedStatement ps=con.prepareStatement(sql);
                        ResultSet rs=ps.executeQuery();
                        drinks.clear();
                        if(rs.next()){
                            txtMenuName.setText(rs.getString("DrinkName"));
                            txtMenuLPrice.setText(rs.getString("LSizePrice"));
                            txtMenuMPrice.setText(rs.getString("MSizePrice"));
                            choiceBox_Type.setValue(rs.getString("TypeName"));
                            String url=System.getProperty("user.dir");
                            txtMenuBrowse.setText(url+"\\src\\Images\\"+rs.getString("TypeID").toLowerCase()
                                    +"\\"+rs.getString("DrinkID")+".jpg");
                            drinks.add(new DrinksMenu(rs.getString("DrinkID"),rs.getString("drinkName"),
                                rs.getInt("MSizePrice"), rs.getInt("LSizePrice"),rs.getString("TypeName"),
                                    rs.getString("Status")));
                            manageLabelFieldReset();
                        }
                        else{
                            lblMenuNameError.setText("Món nước không tồn tại");
                        }
                    }
                    catch(Exception e){
                        System.out.println("Không thể tìm món nước");
                        e.printStackTrace();
                    }
                }
                else{
                    lblMenuNameError.setText("Tên không đúng định dạng");
                }
            }
            else{
            Pattern pattern = Pattern.compile("^[\\p{L}\\s]*$");
            Matcher match = pattern.matcher(name);
            check2 = match.find();
                if(check2==true){
                    lblMenuNameError.setText("Tên có độ dài từ 2-30 kí tự");
                }
                else lblMenuNameError.setText("Tên không đúng định dạng");
            }
        }
    }
    
    //Hàm check thông tin món nhập vào
    public int drinkCheck(String priceM, String priceL){
        int check=0;
        int pm,pl,min=0;
        
        //Check gia size M
        if(priceM.isEmpty()){
            lblMenuMPriceError.setText("Giá không được để trống");
        }
        else{
            try{
                pm=Integer.parseInt(priceM);
                if(pm>9999){
                    if(pm<150001){
                        min=pm;
                        check++;
                    }
                    else lblMenuMPriceError.setText("Giá không được lớn hơn 150000");
                }
                else{
                    lblMenuMPriceError.setText("Giá không được bé hơn 10000");
                }
            }
            catch(Exception e){
                lblMenuMPriceError.setText("Giá không đúng định dạng");
            }
        }
        
        //Check gia size L
        if(priceL.isEmpty()){
            lblMenuLPriceError.setText("Giá không được để trống");
        }
        else{
            try{
                pl=Integer.parseInt(priceL);
                if(pl>9999){
                    if (pl<150001){
                        if(pl>min){
                            check++;
                        }
                        else{
                            lblMenuMPriceError.setText("Giá size M phải bé hơn giá size L");
                            lblMenuLPriceError.setText("Giá size L phải lớn hơn giá size M");
                        }
                    }
                    else lblMenuLPriceError.setText("Giá không được lớn hơn 150000");
                }
                else lblMenuLPriceError.setText("Giá không được bé hơn 10000");
            }
            catch(Exception e){
                lblMenuLPriceError.setText("Giá không đúng định dạng");
            }
        }
        return check;
    }
    
     //Check max moi loai
    public boolean maxCheck(String type){      
        try{
            String sql="Select * from Drink,Type where Drink.TypeID=Type.TypeID and TypeName='"+type+"' and Status='Active'";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            int count=0;
            while (rs.next()){
                count++;
            }
            if(count<8){
                return true;
            }
            else{
                return false;
            }
        }
        catch(Exception e){
            e.printStackTrace();
            System.out.println("Lỗi check số lượng loại nước");
            return false;
        }
    }
    
    //Hàm edit thông tin món (Button Edit)
    public void menuEdit(){
        manageLabelFieldReset();
        String name=txtMenuName.getText().trim();
        String priceM=txtMenuMPrice.getText().trim();
        String priceL=txtMenuLPrice.getText().trim();
        String type=String.valueOf(choiceBox_Type.getValue());
        String url=txtMenuBrowse.getText().trim();
        System.out.println(url);
        String ID="";
        boolean check=false;
        boolean check2=false;
        
        if (name.isEmpty()){
            DrinksMenu dm=tableViewMenu.getSelectionModel().getSelectedItem();
            if(dm==null){
                lblMenuNameError.setText("Chưa nhập tên món/Chưa chọn món");
            }
            else{
                try{
                    String sql="select * from Type where TypeName='"+dm.type+"'";
                    PreparedStatement ps=con.prepareStatement(sql);
                    ResultSet rs=ps.executeQuery();
                    String tID="";
                    if (rs.next()){
                        tID=rs.getString("TypeID");
                    }
                    txtMenuName.setText(dm.name);
                    txtMenuMPrice.setText(String.valueOf(dm.priceM));
                    txtMenuLPrice.setText(String.valueOf(dm.priceL));
                    choiceBox_Type.setValue(dm.type);
                    String string=System.getProperty("user.dir");
                    txtMenuBrowse.setText(string+"\\src\\Images\\"+tID.toLowerCase()
                                +"\\"+dm.id+".jpg");
                    System.out.println(txtMenuBrowse.getText());
                    ID=dm.id;
                    System.out.println(ID);
                }
                catch(Exception e){
                    System.out.println("Không thể load thông tin món");
                    e.printStackTrace();
                }
            }
        }
        else{
            if(name.length()>1&&name.length()<31){
                int temp2=0;
                for(int i=0;i<name.length()-1;i++){
                    if (String.valueOf(name.charAt(i)).equals(" ")&&String.valueOf(name.charAt(i+1)).equals(" ")){
                        temp2=1;
                        lblNameError.setText("Tên không đúng định dạng");
                        break;
                    }   
                }
                if(temp2==0){
                    Pattern pattern = Pattern.compile("^[\\p{L}\\s]*$");
                    Matcher match = pattern.matcher(name);
                    check2 = match.find();
                }
                if(check2==true){
                    check=drinkNameSearch(name);
                    if(check==true){
                        //Kiem tra thong tin
                        int temp=drinkCheck(priceM, priceL);
                        if (url.isEmpty()){
                           lblMenuImageError.setText("Chưa chọn hình ảnh");
                        }
                        else{
                            if(temp==2){
                                if(corruptCheck(name, priceM, priceL ,type)==true){
                                    try{
                                        boolean check3=false;
                                        String sql="select * from Drink where DrinkName=N'"+name+"'"
                                                + "and Status='Active'";
                                        PreparedStatement ps=con.prepareStatement(sql);
                                        ResultSet rs=ps.executeQuery();
                                        if (rs.next()){
                                            check=true;
                                        }
                                        
                                        if(check==false){
                                            String typeID="";
                                            String sqlA="select * from Drink,Type where Drink.TypeID=Type.TypeID "
                                                    + "and TypeName='"+type+"'";
                                            PreparedStatement psA=con.prepareStatement(sqlA);
                                            ResultSet rsA=psA.executeQuery();
                                            while (rsA.next()){
                                                typeID=rsA.getString("TypeID");
                                            }

                                            String sqlB="update Drink "
                                                    + "set Status='Disable' where DrinkName=N'"+name+"'";
                                            PreparedStatement psB=con.prepareStatement(sqlB);
                                            psB.executeUpdate();

                                            String sqlC="update Drink "
                                                    + "set Status='Active' where DrinkName=N'"+name+"' and TypeID='"+typeID+"'";
                                            PreparedStatement psC=con.prepareStatement(sqlC);
                                            psC.executeUpdate();

                                            typeID=""; 
                                            String DID="";
                                            String sqlD="select * from Drink,Type where DrinkName=N'"+name+"' and Status='Active'";
                                            PreparedStatement psD=con.prepareStatement(sqlD);
                                            ResultSet rsD=psD.executeQuery();
                                            while(rsD.next()){
                                                typeID=rsD.getString("TypeID");
                                                DID=rsD.getString("DrinkID");
                                            }
                                            String string=System.getProperty("user.dir");
                                            String filePath=string+"\\src\\Images\\"+typeID.toLowerCase()
                                                            +"\\"+DID+".jpg";
                                            System.out.println(filePath);
                                            System.out.println("file Path "+filePath);
                                            File input=new File(url);
                                            File output=new File(filePath);
                                            output.getParentFile().mkdirs();
                                            output.createNewFile();
                                            System.out.println("url "+url);
                                            BufferedImage image=ImageIO.read(input);
                                            ImageIO.write(image,"jpg",output);
                                            manageMenuReset();
                                            loadForm();
                                            alert("Cập nhật thông tin món thành công");
                                        }
                                        else lblMenuNameError.setText("Món đã tồn tại");
                                    }
                                    catch(Exception e){
                                        e.printStackTrace();
                                        System.out.println("Lỗi thêm món trùng");
                                        alert("Cập nhật thông tin món thất bại");
                                    }
                                }
                                else{
                                    try{
                                        String sql="select * from Type where TypeName='"+type+"'";
                                        PreparedStatement ps=con.prepareStatement(sql);
                                        ResultSet rs=ps.executeQuery();
                                        String typeID=null;
                                        while(rs.next()){
                                            typeID=rs.getString("TypeID").toLowerCase();
                                        }

                                        String sql1="select * from Drink where TypeID='"+typeID+"'";
                                        PreparedStatement ps1=con.prepareStatement(sql1);
                                        ResultSet rs1=ps1.executeQuery();
                                        String id=null;
                                        while(rs1.next()){
                                            id=rs1.getString("DrinkID");
                                        }

                                        String sql3="select * from Drink where DrinkName=N'"+name+"' and Status='Active'";
                                        PreparedStatement ps3=con.prepareStatement(sql3);
                                        ResultSet rs3=ps3.executeQuery();
                                        String oldType=null;
                                        String oldID=null;
                                        while(rs3.next()){
                                            oldID=rs3.getString("DrinkID");
                                            oldType=rs3.getString("TypeID").toLowerCase();
                                        }
                                        System.out.println(typeID);
                                        System.out.println(oldType);

                                        String DID=null;
                                        if(typeID.equals(oldType)){
                                            DID=oldID;
                                            System.out.println(DID);
                                            try{
                                                String sql4="update Drink "
                                                + "set MSizePrice='"+priceM+"', LSizePrice='"+priceL+"'"
                                                        + " where DrinkID='"+DID+"'";
                                                System.out.println(sql4);
                                                PreparedStatement ps4=con.prepareStatement(sql4);
                                                ps4.executeUpdate();
                                                String string=System.getProperty("user.dir");
                                                String filePath=string+"\\src\\Images\\"+typeID.toLowerCase()
                                                        +"\\"+DID+".jpg";
                                                System.out.println("Type ID "+typeID);
                                                System.out.println(filePath);
                                                System.out.println("file Path "+filePath);
                                                File input=new File(url);
                                                File output=new File(filePath);
                                                output.getParentFile().mkdirs();
                                                output.createNewFile();
                                                System.out.println("url "+url);
                                                BufferedImage image=ImageIO.read(input);
                                                ImageIO.write(image,"jpg",output);

                                                manageMenuReset();
                                                loadForm();
                                                alert("Cập nhật thông tin món thành công");
                                            }
                                            catch(Exception e){
                                                e.printStackTrace();
                                                System.out.println("Không thể đổi hình ảnh");
                                                alert("Cập nhật thông tin thất bại");
                                            }   
                                        }
                                        else{
                                            if(maxCheck(type)==true){
                                                int num=Integer.parseInt(id.substring(3));
                                                num++;
                                                String n;
                                                if(num<10) n="0"+String.valueOf(num);
                                                else n=String.valueOf(num);
                                                DID=typeID+n;
                                                System.out.println(DID);
                                            try{
                                                String sql5="update Drink set Status='Disable' where DrinkName='"+name+"'";
                                                PreparedStatement ps5=con.prepareStatement(sql5);
                                                ps5.executeUpdate();

                                                String sql2="insert into Drink (DrinkID,DrinkName,MSizePrice,LSizePrice,TypeID,Status)"
                                                + "values ('"+DID+"',N'"+name+"','"+priceM+"','"+priceL+"','"+typeID.toUpperCase()+"','Active')";
                                                PreparedStatement ps2=con.prepareStatement(sql2);
                                                ps2.executeUpdate();
                                                String string=System.getProperty("user.dir");
                                                String filePath=string+"\\src\\Images\\"+typeID.toLowerCase()
                                                            +"\\"+DID+".jpg";
                                                System.out.println("Type ID "+typeID);
                                                System.out.println("file Path "+filePath);
                                                File input=new File(url);
                                                File output=new File(filePath);
                                                output.getParentFile().mkdirs();
                                                output.createNewFile();
                                                System.out.println("url "+url);
                                                BufferedImage image=ImageIO.read(input);
                                                ImageIO.write(image,"jpg",output);
                                                manageMenuReset();
                                                loadForm();
                                                alert("Cập nhật thông tin món thành công");
                                            }
                                            catch(Exception e){
                                                e.printStackTrace();
                                                System.out.println("Không thể đổi hình ảnh");
                                                alert("Cập nhật thông tin thất bại");
                                            }
                                            }
                                            else{
                                                lblMenuTypeError.setText("Số lượng của loại đã đến giới hạn");
                                            }
                                        }

                                    }
                                    catch(Exception e){
                                        e.printStackTrace();
                                        System.out.println("Không thể edit món");
                                        alert("Cập nhật thông tin thất bại");
                                    }
                                }
                            }
                        }
                    }
                    else{
                        if(corruptCheck(name, priceM, priceL ,type)==true){
                            String sqlC="update Drink "
                                        + "set Status='Active' where DrinkName=N'"+name+"'";
                            try{
                                PreparedStatement psC=con.prepareStatement(sqlC);
                                psC.executeUpdate();

                                String typeID="",DID="";
                                String sqlD="select * from Drink,Type where DrinkName=N'"+name+"' and Status='Active'";
                                PreparedStatement psD=con.prepareStatement(sqlD);
                                ResultSet rsD=psD.executeQuery();
                                while(rsD.next()){
                                    typeID=rsD.getString("TypeID");
                                    DID=rsD.getString("DrinkID");
                                }
                                String string=System.getProperty("user.dir");
                                String filePath=string+"\\src\\Images\\"+typeID.toLowerCase()
                                                +"\\"+DID+".jpg";
                                System.out.println(filePath);
                                System.out.println("file Path "+filePath);
                                File input=new File(url);
                                File output=new File(filePath);
                                output.getParentFile().mkdirs();
                                output.createNewFile();
                                System.out.println("url "+url);
                                BufferedImage image=ImageIO.read(input);
                                ImageIO.write(image,"jpg",output);
                                manageMenuReset();
                                loadForm();
                                alert("Cập nhật thông tin món thành công 3");
                            }
                            catch(Exception e){
                                e.printStackTrace();
                                System.out.println("Lỗi thêm món trùng");
                                alert("Cập nhật thông tin món thất bại");
                            }
                        }
                        else lblMenuNameError.setText("Món không tồn tại hoặc đã bị vô hiệu hóa");
                    }
                }
                else lblMenuNameError.setText("Tên món không đúng định dạng");
            }
            else{
                Pattern pattern = Pattern.compile("^[\\p{L}\\s]*$");
                Matcher match = pattern.matcher(name);
                check2 = match.find();
                if(check2==true){
                    lblMenuNameError.setText("Tên có độ dài từ 2-30 kí tự");
                }
                else lblMenuNameError.setText("Tên không đúng định dạng");
            }
        }
    }
    
    //Hàm add món mới (Button Add)
    public void addMenu(){
        manageLabelFieldReset();
        String name=txtMenuName.getText().trim();
        String priceM=txtMenuMPrice.getText().trim();
        String priceL=txtMenuLPrice.getText().trim();
        String type=String.valueOf(choiceBox_Type.getValue());
        String url=txtMenuBrowse.getText().trim();
        int temp=0;
        boolean check=false;
        boolean check2=false;
        
//            Pattern pattern = Pattern.compile("^[\\p{L}]+[\\s]?[\\p{L}]+[\\s]?[\\p{L}]+[\\s]?[\\p{L}]*$");
        if(name.isEmpty()){
            lblMenuNameError.setText("Chưa nhập tên món");
        }
        else if(name.length()>1&&name.length()<31){
            int temp2=0;
            for(int i=0;i<name.length()-1;i++){
                if (String.valueOf(name.charAt(i)).equals(" ")&&String.valueOf(name.charAt(i+1)).equals(" ")){
                    temp2=1;
                    lblNameError.setText("Tên không đúng định dạng");
                    break;
                }   
            }
            if(temp2==0){
                Pattern pattern = Pattern.compile("^[\\p{L}\\s]*$");
                Matcher match = pattern.matcher(name);
                check = match.find();
            }
            
            if(check==true){
                if(drinkNameSearch(name)==true){
                    lblMenuNameError.setText("Món đã tồn tại");
                }
                else{
                    temp=temp+drinkCheck(priceM,priceL);

                    if (url.isEmpty()){
                        lblMenuImageError.setText("Chưa chọn hình ảnh");
                    }
                    else if(url!=null){
                        try{
                            BufferedImage image=ImageIO.read(new File(url));
                            temp++;
                        }
                        catch(Exception e){
                            lblMenuImageError.setText("Hình ảnh không đúng");
                        }
                    }
                    
                    if(temp==3 && maxCheck(type)==true){
                        System.out.println("Hello");
                        if(corruptCheck(name, priceM, priceL, type)==true){
                            String sqlC="update Drink "
                                    + "set Status='Active' where DrinkName=N'"+name+"'";
                            try{
                                PreparedStatement psC=con.prepareStatement(sqlC);
                                psC.executeUpdate();
                                
                                String typeID="",DID="";
                                String sqlD="select * from Drink,Type where DrinkName=N'"+name+"' and Status='Active'";
                                PreparedStatement psD=con.prepareStatement(sqlD);
                                ResultSet rsD=psD.executeQuery();
                                while(rsD.next()){
                                    typeID=rsD.getString("TypeID");
                                    DID=rsD.getString("DrinkID");
                                }
                                String string=System.getProperty("user.dir");
                                String filePath=string+"\\src\\Images\\"+typeID.toLowerCase()+"\\"+DID+".jpg";
                                System.out.println(filePath);
                                File input=new File(url);
                                File output=new File(filePath);
                                output.getParentFile().mkdirs();
                                output.createNewFile();
                                BufferedImage image=ImageIO.read(input);
                                ImageIO.write(image,"jpg",output);
                                manageMenuReset();
                                loadForm();
                                alert("Thêm món thành công");
                            }
                            catch(Exception e){
                                e.printStackTrace();
                                System.out.println("Lỗi thêm món trùng");
                                alert("Thêm món thất bại");
                            }
                        }
                        else{
                            try{
                                String typeID=null;
                                String sql="select * from Type where TypeName='"+type+"'";
                                PreparedStatement ps=con.prepareStatement(sql);
                                ResultSet rs=ps.executeQuery();
                                while(rs.next()){
                                    typeID=rs.getString("TypeID").toLowerCase();
                                    System.out.println(typeID);
                                }

                                String id=null;
                                System.out.println(type);
                                String sql1="select DrinkID from Drink,Type where Drink.TypeID=Type.TypeID and TypeName='"+type+"'";
                                PreparedStatement ps1=con.prepareStatement(sql1);
                                ResultSet rs1=ps1.executeQuery();
                                while(rs1.next()){
                                    id=rs1.getString("DrinkID");
                                    System.out.println(rs1.getString("DrinkID"));
                                }

                                int num=Integer.parseInt(id.substring(3));
                                num++;
                                String n;
                                if(num<10) n="0"+String.valueOf(num);
                                else n=String.valueOf(num);
                                String DID=typeID+n;
                                System.out.println(DID);

                                String sql2="insert into Drink(DrinkID,drinkName,MSizePrice,LSizePrice,TypeID,Status) "
                                + "values ('"+DID+"',N'"+name+"','"+priceM+"','"+priceL+"','"+typeID.toUpperCase()+"','Active')";
                                System.out.println(sql2);
                                PreparedStatement ps2=con.prepareStatement(sql2);

                                try{
                                    String string=System.getProperty("user.dir");
                                    String filePath=string+"\\src\\Images\\"+typeID.toLowerCase()+"\\"+DID+".jpg";
                                    System.out.println(filePath);
                                    File input=new File(url);
                                    File output=new File(filePath);
                                    output.getParentFile().mkdirs();
                                    output.createNewFile();
                                    BufferedImage image=ImageIO.read(input);
                                    ImageIO.write(image,"jpg",output);
                                    ps2.execute();
                                    manageMenuReset();
                                    loadForm();
                                    alert("Thêm món thành công");
                                }
                                catch(Exception e){
                                    alert("Thêm món thất bại");
                                    System.out.println("Lỗi hình ảnh");
                                    e.printStackTrace();
                                }
                            }
                            catch(Exception e){
                                e.printStackTrace();
                                alert("Thêm món thất bại");
                            }
                        }
                    }
                    else if(maxCheck(type)==false){
                        lblMenuTypeError.setText("Số lượng của loại đã đến giới hạn");
                    }
                }
            }
            else lblMenuNameError.setText("Tên không đúng định dạng");
        }
        else{
            Pattern pattern = Pattern.compile("^[\\p{L}\\s]*$");
            Matcher match = pattern.matcher(name);
            check2 = match.find();
            if(check2==true){
                lblMenuNameError.setText("Tên món có độ dài từ 2-30 kí tự");
            }
            else lblMenuNameError.setText("Tên món không đúng định dạng");
        }
    }
    
    public boolean corruptCheck(String name, String priceM, String priceL, String typeName){
        String sql="select * from Drink,Type where "
                + " Drink.TypeID=Type.TypeID and DrinkName=N'"+name+"' and TypeName='"+typeName+"' and Status='Disable'";
        System.out.println(typeName);
        try{
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                if(rs.getString("MSizePrice").equals(priceM)){
                    System.out.println("2");
                    if(rs.getString("LSizePrice").equals(priceL)){
                        System.out.println("3");
                        if(rs.getString("TypeName").equals(typeName)){
                            System.out.println("4");
                            return true;
                        }
                    }
                }
                else return false;
            }
        }
        catch(Exception e){
            System.out.println("Lỗi check trùng");
            e.printStackTrace();
        }
        return false;
    }
    
    //Hàm xóa món (Button Delete)
    public void deleteMenu(){
        manageLabelFieldReset();
        String name=txtMenuName.getText().trim();
        boolean check=false;
        boolean check2=false;
        if (name.isEmpty()){
            DrinksMenu dm=tableViewMenu.getSelectionModel().getSelectedItem();
            if(dm==null){
                lblMenuNameError.setText("Chưa nhập tên món");
            }
            else if(dm.status.equals("Disable")){
                alert("Món đã bị vô hiệu hóa");
            }
            else{
                name=dm.name;
                check=drinkNameSearch(name);
                if (check==false){
                    lblMenuNameError.setText("Món không tồn tại");
                }
                else{
                    confirmDeleteMenu(name);
                    manageMenuReset();
                }
            }
        }
        else{
            if(name.length()>1&&name.length()<31){
                Pattern pattern = Pattern.compile("^[\\p{L}\\s]*$");
                Matcher match = pattern.matcher(name);
                check = match.find();
                if(check==true){
                    check=drinkNameSearch(name);
                    if (check==false){
                        lblMenuNameError.setText("Món không tồn tại");
                    }
                    else{
                        confirmDeleteMenu(name);
                        manageMenuReset();
                    }
                }
                else lblMenuNameError.setText("Tên món không đúng định dạng");
            }
            else{
                Pattern pattern = Pattern.compile("^[\\p{L}\\s]*$");
                Matcher match = pattern.matcher(name);
                check2 = match.find();
                if(check2==true){
                    lblMenuNameError.setText("Tên món có độ dài từ 2-30 kí tự");
                }
                else lblMenuNameError.setText("Tên món không đúng định dạng");
            }
        }
    }
    
    //Hàm SQL xóa món
    public void deleteDrink(String name){
        try{          
            String sql="select * from Drink,Type where DrinkName=N'"+name+"' and Status='Active'";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            String drinkID="",typeID="";
            while(rs.next()){
                drinkID=rs.getString("DrinkID");
                typeID=rs.getString("TypeID");
            }
            
            String sql2="update Drink set Status='Disable' where DrinkID='"+drinkID+"'";
            PreparedStatement ps2=con.prepareStatement(sql2);
            ps2.execute();
            manageMenuReset();
            loadForm();
            alert("Xóa món thành công");  
        }
        catch(Exception e){
            e.printStackTrace();
            alert("Không thể xóa món");
            System.out.println("Không thể xóa món");
        }
    }
    
    //Hàm chọn file hình ảnh
    public void browseImage(){
        FileChooser fileDialog=new FileChooser();
        File selectedFile=fileDialog.showOpenDialog(null);
        
        if(selectedFile!=null){
            String url=selectedFile.getAbsolutePath();
            txtMenuBrowse.setText(url);
        }
    }
    
    //Hàm reset thông tin đã nhập vào của menu và reload dữ liệu tableview
    public void manageMenuReset(){
        manageResetAll();
        tableViewMenuInitialize();
    }
    
    //Hàm reset label của Menu
    public void manageLabelFieldReset(){
        lblMenuNameError.setText("");
        lblMenuMPriceError.setText("");
        lblMenuLPriceError.setText("");
        lblMenuImageError.setText("");
        lblMenuTypeError.setText("");
    }
    
    //Hàm reset textfield của menu
    public void manageTextFieldReset(){
        txtMenuName.setText("");
        txtMenuMPrice.setText("");
        txtMenuLPrice.setText("");
        choiceBox_Type.setValue("Coffee");
        txtMenuBrowse.setText("");
    }
    
    //Hàm reset label và textfield của menu
    public void manageResetAll(){
        manageTextFieldReset();
        manageLabelFieldReset();
    }
    
    //Hàm phân quyền
    public void authorize(){
        String username=lblUsername.getText();
        String position=null;
        try{
            String sql="select * from Account where Username='"+username+"'";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                position=rs.getString("Position");
            }
            if (position.equals("Nhân viên")){
                btnRevenue.setVisible(false);
                btnAccount.setVisible(false);
                btnManage.setVisible(false);
                tabEditBill.setDisable(true);
            }
        }
        catch(Exception e){
            System.out.println("Lỗi phân quyền");
            e.printStackTrace();
        }
    }     
    public void confirm(ArrayList<Bill> listBill){
        Label[] arrCartName = {lblCartName0, lblCartName1, lblCartName2, lblCartName3, lblCartName4, lblCartName5, lblCartName6};
        Label[] arrCartSize = {lblCartSize0, lblCartSize1, lblCartSize2, lblCartSize3, lblCartSize4, lblCartSize5, lblCartSize6};
        Label[] arrCartNumber = {lblCartNumber0, lblCartNumber1, lblCartNumber2, lblCartNumber3, lblCartNumber4, lblCartNumber5, lblCartNumber6};
        VBox[] arrBoxCart = {boxCart0, boxCart1, boxCart2, boxCart3, boxCart4, boxCart5, boxCart6};
        Label[] arrCartId = {lblCartId0, lblCartId1, lblCartId2, lblCartId3, lblCartId4, lblCartId5, lblCartId6};
        Label[] arrCartPrice = {lblCartPrice0, lblCartPrice1, lblCartPrice2, lblCartPrice3, lblCartPrice4, lblCartPrice5, lblCartPrice6};
        Label[] arrCartIdItem = {lblDrinkId0, lblDrinkId1, lblDrinkId2, lblDrinkId3, lblDrinkId4, lblDrinkId5, lblDrinkId6};
        ArrayList<Integer> arrBillID = new ArrayList<>();
        int total = 0;

        String date = "";
        String time = "";
        Random random = new Random();
        int ID = 0;
        System.out.print(ID);
        //cái định dạng này t đã sửa do ban đầu để ngược ko đc vô sql đc nên lỗi
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat dt = new SimpleDateFormat("hh:mm:ss");
        date = df.format(new Date());
        time = dt.format(new Date());
        arrBillID = arrBillID();
        boolean check = false;
        do{
            ID = random.nextInt(100);
            for(int x: arrBillID){
                if(ID == x) check = true;
            }
        }
        while(check == true);

        String sql = "insert into Bill(BillID,Username,Date,Time,Status,Total)"      
                + "values(?,?,?,?,?,?)";
        String sql1 = "insert into BillDetail(BillID,DrinkID,Size,Quantity)"
                + "values(?,?,?,?)";
        try {
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, String.valueOf(ID));
            preparedStatement.setString(2, lblUsername.getText());
            preparedStatement.setDate(3, java.sql.Date.valueOf(date));
            preparedStatement.setTime(4, Time.valueOf(time));
            preparedStatement.setString(5, "waiting");
            preparedStatement.setString(6, lblTotal.getText());
            preparedStatement.execute();
            for(Bill x : listBill){
                PreparedStatement ps = con.prepareStatement(sql1);
                ps.setString(1, String.valueOf(ID));
                ps.setString(2, x.idDrink);
                ps.setString(3, x.size);
                ps.setString(4, String.valueOf(x.number));
                ps.execute();
            }

            alert("Lập hóa đơn thành công");

            for(int i = 0; i< 7 ; i++){
                arrCartIdItem[i].setText("");
                arrCartName[i].setText("");
                arrCartSize[i].setText("");
                arrCartId[i].setText("");
                arrCartNumber[i].setText("");
                arrBoxCart[i].setVisible(false);
                arrCartPrice[i].setText("");
                lblTotal.setText("");
            }

        } catch (SQLException ex) {
            Logger.getLogger(MenuFormController.class.getName()).log(Level.SEVERE, null, ex);
        }
        printBill();
        tableViewEditBillInitialize();
        
        
    }
    //hàm load table edit
    public void setCellValueFromTableBilltoTextField(){
        Label[] arrDrinkId = {txtDrinkID_Checked0, txtDrinkID_Checked1, txtDrinkID_Checked2, txtDrinkID_Checked3, txtDrinkID_Checked4, txtDrinkID_Checked5, txtDrinkID_Checked6};
        Label[] arrDrinkName = {txtDrinkName_Checked0, txtDrinkName_Checked1, txtDrinkName_Checked2, txtDrinkName_Checked3, txtDrinkName_Checked4, txtDrinkName_Checked5, txtDrinkName_Checked6};
        ChoiceBox[] arrSize = {lblSize_Checked0, lblSize_Checked1, lblSize_Checked2, lblSize_Checked3, lblSize_Checked4, lblSize_Checked5, lblSize_Checked6};
      
        Label[] arrPrice = {txtPrice_Checked0, txtPrice_Checked1, txtPrice_Checked2, txtPrice_Checked3, txtPrice_Checked4, txtPrice_Checked5, txtPrice_Checked6};
        TextField[] arrQuantity = {txtQuantity_Checked0, txtQuantity_Checked1, txtQuantity_Checked2, txtQuantity_Checked3, txtQuantity_Checked4, txtQuantity_Checked5, txtQuantity_Checked6};
        Label[] arrTotal = {txtTotal_Checked0, txtTotal_Checked1, txtTotal_Checked2, txtTotal_Checked3, txtTotal_Checked4, txtTotal_Checked5, txtTotal_Checked6};    
        Button[] arrDel = {btnDeleteDrinksEdit0, btnDeleteDrinksEdit1, btnDeleteDrinksEdit2, btnDeleteDrinksEdit3, btnDeleteDrinksEdit4, btnDeleteDrinksEdit5, btnDeleteDrinksEdit6};
        for(int i = 0 ; i< 7; i++){
            arrDrinkId[i].setText("");
            arrDrinkName[i].setText("");
            arrPrice[i].setText("");
            arrQuantity[i].clear();
            arrTotal[i].setText("");
            arrDel[i].setVisible(false);
        }
        tableViewBill.setOnMouseClicked((MouseEvent event) -> {
            for(int i = 0 ; i< 7; i++){
                arrDrinkId[i].setText("");
                arrDrinkName[i].setText("");
                arrPrice[i].setText("");
                arrQuantity[i].clear();
                arrTotal[i].setText("");
                arrDel[i].setVisible(false);
                arrSize[i].setVisible(false);
                arrQuantity[i].setVisible(false);
            }
            FullBill fb = tableViewBill.getItems().get(tableViewBill.getSelectionModel().getSelectedIndex());
            for(int i = 0; i< lblUsername_Checked.getItems().size(); i++){
                if(fb.username.equals(lblUsername_Checked.getItems().get(i))){
                    lblUsername_Checked.setValue(lblUsername_Checked.getItems().get(i));
                }
            }
            try{
                DateFormat date=new SimpleDateFormat("yyyy-MM-dd");
                Date newDate=new Date();
                newDate=date.parse(stringToDate(fb.date));
                LocalDate local=newDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                date_Checked.setValue(local);
            }
            catch(Exception e){
                e.printStackTrace();
                System.out.println("Lỗi convert date bill");
            }
            lblBillID_Checked.setText(String.valueOf(fb.billID));
            int count = 0;
            
            int total = 0;
            for(DrinksMenu dm : fb.menuDrink){
                for(int i = count ; i< 7; i++){
                    arrDrinkId[i].setText(dm.id);
                    arrDrinkName[i].setText(dm.name);
                    arrSize[i].setValue("size M");
                    int[] arrReturnPrice = new int[6];
                    
                    arrReturnPrice[1] = dm.priceM;
                    arrReturnPrice[2] = dm.priceL;
                    
                    arrSize[i].setValue(fb.size[i]);
                    arrQuantity[i].setText(fb.amount[i]);
                    if(fb.size[i].equals("size M") ){
                        arrTotal[i].setText(String.valueOf(dm.priceM * Integer.parseInt(fb.amount[i]) ));          
                        arrPrice[i].setText(String.valueOf(arrReturnPrice[1]));
                        total = total + dm.priceM * Integer.parseInt(fb.amount[i]);
                    }
                    else if(fb.size[i].equals("size L")){
                        arrTotal[i].setText(String.valueOf(dm.priceL * Integer.parseInt(fb.amount[i]) ));
                        arrPrice[i].setText(String.valueOf(arrReturnPrice[2]));
                        total = total + dm.priceL * Integer.parseInt(fb.amount[i]);
                    }
                    arrSize[i].setVisible(true);
                    arrQuantity[i].setVisible(true);
                    arrDel[i].setVisible(true);
                    count ++;
                    arrSize[i].getSelectionModel().selectedItemProperty().addListener(((observable, oldValue, newValue) -> {
                        if(arrSize[i].getValue().equals("size M")&& !arrQuantity[i].getText().equals("")){
                            int tot = 0;
                            arrPrice[i].setText(String.valueOf(arrReturnPrice[1]));
                            arrTotal[i].setText(String.valueOf(dm.priceM * Integer.parseInt(fb.amount[i]) ));
                            for(int j = 0; j<7; j++){
                                if(!arrDrinkId[j].getText().equals("") && !arrQuantity[j].getText().equals("") ){
                                    Bill bill = new Bill();
                                    bill.price = arrReturnPrice[1];
                                    bill.number = Integer.parseInt(arrQuantity[j].getText());
                                    tot = tot + bill.price * bill.number;
                                }
                            }
                            txtAllTotal_Checked.setText(String.valueOf(tot));
                        }
                        else if(arrSize[i].getValue().equals("size L")&& !arrQuantity[i].getText().equals("")){
                            int tot = 0;
                            arrPrice[i].setText(String.valueOf(arrReturnPrice[2]));
                            arrTotal[i].setText(String.valueOf(dm.priceL * Integer.parseInt(fb.amount[i]) ));
                            for(int j = 0; j<7; j++){
                                if(!arrDrinkId[j].getText().equals("") && !arrQuantity[j].getText().equals("")){
                                    Bill bill = new Bill();
                                    bill.price = arrReturnPrice[2];
                                    bill.number = Integer.parseInt(arrQuantity[j].getText());
                                    tot = tot + bill.price * bill.number;
                                }
                            }
                            txtAllTotal_Checked.setText(String.valueOf(tot));
                        }
                    }));  
                    arrQuantity[i].textProperty().addListener((obs, oldText, newText) -> {
                        int tot = 0;
                        for(int j = 0; j<7; j++){
                            if(!arrDrinkId[j].getText().equals("")){
                                if(!arrQuantity[j].getText().equals("")){
                                    Bill bill = new Bill();
                                    
                                    if(arrPrice[j].getText().equals("")){
                                        bill.price = 0;
                                    }
                                    else{
                                        bill.price = Integer.parseInt(arrPrice[j].getText());
                                    }
                                    bill.number = Integer.parseInt(arrQuantity[j].getText());
                                    arrTotal[j].setText(String.valueOf(bill.price * bill.number));
                                    tot = tot + bill.price * bill.number; 
                                }
                                
                            }
                            
                        }
                        txtAllTotal_Checked.setText(String.valueOf(tot));
                    });
                    
                    fb.total = total;
                    break;
                }
                
            }
            
            txtAllTotal_Checked.setText(String.valueOf(total));
        });
       
        tableViewMenuBill.setOnMouseClicked(new EventHandler<MouseEvent>(){
            
            @Override
            public void handle(MouseEvent event) {
                String var = "";
                DrinksMenu dm = tableViewMenuBill.getItems().get(tableViewMenuBill.getSelectionModel().getSelectedIndex());
                if(txtDrinkID_Checked0.getText().equals("")){
                    alert("chưa chọn bill");
                }
                else{
                    String stt = null;
                    FullBill fb = new FullBill();
                    for(FullBill a : fullBill){
                        if(a.billID == Integer.parseInt(lblBillID_Checked.getText()) ){
                            fb = a;
                        }
                    }
                    for(DrinksMenu x : fb.menuDrink){
                        if(dm.id.equals(x.id)){
                            
                            stt = "1";
                            break;
                        }
                        else{
                            stt = "2";
                        }
                    }
                    
                    if(stt.equals("1")){
                        BoxBlur blur = new BoxBlur(3,3,3);
                        JFXDialogLayout layout = new JFXDialogLayout();
                        JFXButton button1 = new JFXButton("Có");
                        JFXButton button2 = new JFXButton("Không");
                        JFXDialog alert = new JFXDialog(rootpane, layout, JFXDialog.DialogTransition.CENTER);
                        button1.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent event1)-> {
                            alert.close();
                            for(int i = 0; i < 7; i++){
                                if(arrDrinkId[i].getText().equals("")){
                                    arrDrinkId[i].setText(dm.id);
                                    arrDrinkName[i].setText(dm.name);
                                    int[] arrReturnPrice = new int[6];
                                    arrReturnPrice[1] = dm.priceM;
                                    arrReturnPrice[2] = dm.priceL;
                                    returnPrice(dm.id,arrPrice[i], arrSize[i]);
                                    arrSize[i].setValue("size M");
                                    arrPrice[i].setText(String.valueOf(dm.priceM));
                                    arrDel[i].setVisible(true);
                                    arrSize[i].setVisible(true);
                                    arrQuantity[i].setVisible(true);
                                    arrQuantity[i].textProperty().addListener((obs, oldText, newText) -> {
                                        int tot = 0;
                                        Label[] arrTotal = {txtTotal_Checked0, txtTotal_Checked1, txtTotal_Checked2, txtTotal_Checked3, txtTotal_Checked4, txtTotal_Checked5, txtTotal_Checked6};    
                                        for(int j = 0; j<7; j++){
                                            if(!arrDrinkId[j].getText().equals("") && !arrQuantity[j].getText().equals("")){
                                                Bill bill = new Bill();
                                                if(arrPrice[j].getText().equals("")){
                                                    bill.price = 0;
                                                }
                                                else{
                                                    bill.price = Integer.parseInt(arrPrice[j].getText());
                                                }
                                                bill.number = Integer.parseInt(arrQuantity[j].getText());
                                                arrTotal[j].setText(String.valueOf(bill.price * bill.number));
                                                tot = tot + bill.price * bill.number;
                                            }
                                        }
                                        txtAllTotal_Checked.setText(String.valueOf(tot));
                                    });

                                    break;
                                }
                            }
                        });
                        button2.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent event1) -> {
                            alert.close();
                        });        
                        layout.setBody(new Text(dm.name + " đã có trong list, bạn có muốn thêm?"));
                        layout.setActions(button1,button2);
                        alert.show();
                        alert.setOnDialogClosed((JFXDialogEvent event1) -> {
                            anchorPane.setEffect(null);
                        });
                        anchorPane.setEffect(blur);
                    }
                    else if(stt.equals("2")){
                        BoxBlur blur = new BoxBlur(3,3,3);
                        JFXDialogLayout layout = new JFXDialogLayout();
                        JFXButton button1 = new JFXButton("Có");
                        JFXButton button2 = new JFXButton("Không");
                        JFXDialog alert = new JFXDialog(rootpane, layout, JFXDialog.DialogTransition.CENTER);
                        button1.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent event1)-> {
                            alert.close();
                            for(int i = 0; i < 7; i++){
                                if(arrDrinkId[i].getText().equals("")){
                                    arrDrinkId[i].setText(dm.id);
                                    arrDrinkName[i].setText(dm.name);
                                    int[] arrReturnPrice = new int[6];
                                    arrReturnPrice[1] = dm.priceM;
                                    arrReturnPrice[2] = dm.priceL;
                                    returnPrice(dm.id,arrPrice[i], arrSize[i]);
                                    arrSize[i].setValue("size M");
                                    arrPrice[i].setText(String.valueOf(dm.priceM));
                                    arrDel[i].setVisible(true);
                                     arrSize[i].setVisible(true);
                                    arrQuantity[i].setVisible(true);

                                    arrQuantity[i].textProperty().addListener((obs, oldText, newText) -> {
                                        int tot = 0;
                                        Label[] arrTotal = {txtTotal_Checked0, txtTotal_Checked1, txtTotal_Checked2, txtTotal_Checked3, txtTotal_Checked4, txtTotal_Checked5, txtTotal_Checked6};    
                                        for(int j = 0; j<7; j++){
                                            if(!arrDrinkId[j].getText().equals("") && !arrQuantity[j].getText().equals("")){
                                                Bill bill = new Bill();
                                                if(arrPrice[j].getText().equals("")){
                                                    bill.price = 0;
                                                }
                                                else{
                                                    bill.price = Integer.parseInt(arrPrice[j].getText());
                                                }
                                                bill.number = Integer.parseInt(arrQuantity[j].getText());
                                                arrTotal[j].setText(String.valueOf(bill.price * bill.number));
                                                tot = tot + bill.price * bill.number;
                                            }
                                        }
                                        txtAllTotal_Checked.setText(String.valueOf(tot));
                                    });

                                    break;
                                }
                            }
                        });
                        button2.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent event1) -> {
                            alert.close();
                        });        
                        layout.setBody(new Text("Có muốn thêm "+ dm.name + " vô list?"));
                        layout.setActions(button1,button2);
                        alert.show();
                        alert.setOnDialogClosed((JFXDialogEvent event1) -> {
                            anchorPane.setEffect(null);
                        });
                        anchorPane.setEffect(blur);
                    }
                    else{
                        System.out.println("sai cmn add");
                    }
                }
            }
            
        });
    }
	//Hàm hủy edit menu
    public void cancelEditBill(MouseEvent event){
        Label[] arrDrinkId = {txtDrinkID_Checked0, txtDrinkID_Checked1, txtDrinkID_Checked2, txtDrinkID_Checked3, txtDrinkID_Checked4, txtDrinkID_Checked5, txtDrinkID_Checked6};
        Label[] arrDrinkName = {txtDrinkName_Checked0, txtDrinkName_Checked1, txtDrinkName_Checked2, txtDrinkName_Checked3, txtDrinkName_Checked4, txtDrinkName_Checked5, txtDrinkName_Checked6};
        ChoiceBox[] arrSize = {lblSize_Checked0, lblSize_Checked1, lblSize_Checked2, lblSize_Checked3, lblSize_Checked4, lblSize_Checked5, lblSize_Checked6};
      
        Label[] arrPrice = {txtPrice_Checked0, txtPrice_Checked1, txtPrice_Checked2, txtPrice_Checked3, txtPrice_Checked4, txtPrice_Checked5, txtPrice_Checked6};
        TextField[] arrQuantity = {txtQuantity_Checked0, txtQuantity_Checked1, txtQuantity_Checked2, txtQuantity_Checked3, txtQuantity_Checked4, txtQuantity_Checked5, txtQuantity_Checked6};
        Label[] arrTotal = {txtTotal_Checked0, txtTotal_Checked1, txtTotal_Checked2, txtTotal_Checked3, txtTotal_Checked4, txtTotal_Checked5, txtTotal_Checked6};    
        Button[] arrDel = {btnDeleteDrinksEdit0, btnDeleteDrinksEdit1, btnDeleteDrinksEdit2, btnDeleteDrinksEdit3, btnDeleteDrinksEdit4, btnDeleteDrinksEdit5, btnDeleteDrinksEdit6};
        
        if(event.getSource() == btnCancelEdit ){
            lblBillID_Checked.setText("");
            lblUsername_Checked.setValue("");
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            date_Checked.setValue(LocalDate.now());
            for(int i = 0 ; i< 7; i++){
                arrDrinkId[i].setText("");
                arrDrinkName[i].setText("");
                arrPrice[i].setText("");
                arrQuantity[i].setText("");
                arrTotal[i].setText("");
                arrDel[i].setVisible(false);
            }
        }
    }
    //Nút del form edit bill
    public void btnDelEditBill(MouseEvent event){
        Button[]  arrBtnDel = {btnDeleteDrinksEdit0, btnDeleteDrinksEdit1, btnDeleteDrinksEdit2, btnDeleteDrinksEdit3, btnDeleteDrinksEdit4, btnDeleteDrinksEdit5, btnDeleteDrinksEdit6}; 
        Label[] arrDrinkId = {txtDrinkID_Checked0, txtDrinkID_Checked1, txtDrinkID_Checked2, txtDrinkID_Checked3, txtDrinkID_Checked4, txtDrinkID_Checked5, txtDrinkID_Checked6};
        Label[] arrDrinkName = {txtDrinkName_Checked0, txtDrinkName_Checked1, txtDrinkName_Checked2, txtDrinkName_Checked3, txtDrinkName_Checked4, txtDrinkName_Checked5, txtDrinkName_Checked6};
        ChoiceBox[] arrSize = {lblSize_Checked0, lblSize_Checked1, lblSize_Checked2, lblSize_Checked3, lblSize_Checked4, lblSize_Checked5, lblSize_Checked6};
        Button[] arrDel = {btnDeleteDrinksEdit0, btnDeleteDrinksEdit1, btnDeleteDrinksEdit2, btnDeleteDrinksEdit3, btnDeleteDrinksEdit4, btnDeleteDrinksEdit5, btnDeleteDrinksEdit6};
        Label[] arrPrice = {txtPrice_Checked0, txtPrice_Checked1, txtPrice_Checked2, txtPrice_Checked3, txtPrice_Checked4, txtPrice_Checked5, txtPrice_Checked6};
        TextField[] arrQuantity = {txtQuantity_Checked0, txtQuantity_Checked1, txtQuantity_Checked2, txtQuantity_Checked3, txtQuantity_Checked4, txtQuantity_Checked5, txtQuantity_Checked6};
        Label[] arrTotal = {txtTotal_Checked0, txtTotal_Checked1, txtTotal_Checked2, txtTotal_Checked3, txtTotal_Checked4, txtTotal_Checked5, txtTotal_Checked6};    
        ArrayList <Bill> listBill = new ArrayList<Bill>();
        for(int i = 0; i<7; i++){
            if(!arrDrinkId[i].getText().equals("")){
                Bill bill = new Bill();
                bill.idDrink = arrDrinkId[i].getText();
                bill.name = arrDrinkName[i].getText();
                bill.price = Integer.parseInt(arrPrice[i].getText());
                bill.size = (String) arrSize[i].getValue();
                if(arrQuantity[i].getText().equals("")){
                    bill.number = 0;
                }
                else{
                    bill.number = Integer.parseInt(arrQuantity[i].getText());
                }
                arrDrinkId[i].setText("");
                arrDrinkName[i].setText("");
                arrPrice[i].setText("");
                arrQuantity[i].setText("");
                arrTotal[i].setText("");
                arrDel[i].setVisible(false);
                arrSize[i].setVisible(false);
                arrQuantity[i].setVisible(false);
                listBill.add(bill);
            }
        }
        for(int i = 0;i< 7;i++){
            if(event.getSource() == arrBtnDel[i]){
                listBill.remove(i);
            }
        }
        int count = 0;
        int total = 0;
        for(Bill bill : listBill){
            for(int i = count; i<7; i++){
                arrDel[i].setVisible(true);
                arrSize[i].setVisible(true);
                arrQuantity[i].setVisible(true);
                arrDrinkId[i].setText(bill.idDrink);
                arrDrinkName[i].setText(bill.name);
                returnPrice(bill.idDrink, arrPrice[i], arrSize[i]);
                arrSize[i].setValue(bill.size);
                arrPrice[i].setText(String.valueOf(bill.price));
                if(bill.number == 0){
                    arrQuantity[i].setText("");
                }
                else{
                    arrQuantity[i].setText(String.valueOf(bill.number));
                }
                arrTotal[i].setText(String.valueOf(bill.price * bill.number));
                total = total + bill.number*bill.price;
                count++;
                break;
            }
        }
        txtAllTotal_Checked.setText(String.valueOf(total));
    }
    //nut edit bill
    public void confirmEditBill(MouseEvent event){
        Label[] arrDrinkId = {txtDrinkID_Checked0, txtDrinkID_Checked1, txtDrinkID_Checked2, txtDrinkID_Checked3, txtDrinkID_Checked4, txtDrinkID_Checked5, txtDrinkID_Checked6};
        Label[] arrDrinkName = {txtDrinkName_Checked0, txtDrinkName_Checked1, txtDrinkName_Checked2, txtDrinkName_Checked3, txtDrinkName_Checked4, txtDrinkName_Checked5, txtDrinkName_Checked6};
        ChoiceBox[] arrSize = {lblSize_Checked0, lblSize_Checked1, lblSize_Checked2, lblSize_Checked3, lblSize_Checked4, lblSize_Checked5, lblSize_Checked6};
      
        Label[] arrPrice = {txtPrice_Checked0, txtPrice_Checked1, txtPrice_Checked2, txtPrice_Checked3, txtPrice_Checked4, txtPrice_Checked5, txtPrice_Checked6};
        TextField[] arrQuantity = {txtQuantity_Checked0, txtQuantity_Checked1, txtQuantity_Checked2, txtQuantity_Checked3, txtQuantity_Checked4, txtQuantity_Checked5, txtQuantity_Checked6};
        Label[] arrTotal = {txtTotal_Checked0, txtTotal_Checked1, txtTotal_Checked2, txtTotal_Checked3, txtTotal_Checked4, txtTotal_Checked5, txtTotal_Checked6};    
        Button[] arrDel = {btnDeleteDrinksEdit0, btnDeleteDrinksEdit1, btnDeleteDrinksEdit2, btnDeleteDrinksEdit3, btnDeleteDrinksEdit4, btnDeleteDrinksEdit5, btnDeleteDrinksEdit6};
        if(!txtDrinkID_Checked0.getText().equals("")){
            
        }
        if(arrDrinkId[0].getText().equals("")){
            BoxBlur blur = new BoxBlur(3,3,3);
            JFXDialogLayout layout = new JFXDialogLayout();
            JFXButton button = new JFXButton("Đã xem");
            JFXDialog alert = new JFXDialog(rootpane, layout, JFXDialog.DialogTransition.CENTER);
            button.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent event1)-> {
                alert.close();

                lblBillID_Checked.setText("");
                lblUsername_Checked.setValue("");
                DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                date_Checked.setValue(LocalDate.now());
                for(int i = 0 ; i< 7; i++){
                    arrDrinkId[i].setText("");
                    arrDrinkName[i].setText("");
                    arrPrice[i].setText("");
                    arrQuantity[i].setText("");
                    arrTotal[i].setText("");
                    arrDel[i].setVisible(false);
                    arrSize[i].setVisible(false);
                    arrQuantity[i].setVisible(false);
                }
                
               
            });
                  
            layout.setBody(new Text("Chưa có thông tin món"));
            layout.setActions(button);
            alert.show();
            alert.setOnDialogClosed((JFXDialogEvent event1) -> {
                anchorPane.setEffect(null);
            });
            anchorPane.setEffect(blur);
        }
        else{
            boolean check = true;
            for(int i= 0;i<6;i++){
                for(int j =i+1; j<7;j++){
                    if(!arrDrinkId[i].getText().equals("") && arrDrinkId[i].getText().equals(arrDrinkId[j].getText())){
                        if(arrSize[i].getValue().equals(arrSize[j].getValue())){
                            System.out.println( " trung size "+ i +":" + arrSize[i].getValue() + j + " :" + arrSize[j].getValue());
                            check  = false;
                            BoxBlur blur = new BoxBlur(3,3,3);
                            JFXDialogLayout layout = new JFXDialogLayout();
                            JFXButton button = new JFXButton("Đã xem");
                            JFXDialog alert = new JFXDialog(rootpane, layout, JFXDialog.DialogTransition.CENTER);
                            button.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent event1)-> {
                                alert.close();
                            });

                            layout.setBody(new Text("Món " + arrDrinkName[i].getText() +" Bị trùng size"));
                            layout.setActions(button);
                            alert.show();
                            alert.setOnDialogClosed((JFXDialogEvent event1) -> {
                                anchorPane.setEffect(null);
                            });
                            anchorPane.setEffect(blur);
                            
                        }
                        
                    }
                    if(check == false){
                        break;
                    }
                }
                if(check == false){
                    break;
                }
            }
            if(check == true){
                try {
                    String sql = "update Bill"
                            + " set Username = '" + lblUsername_Checked.getValue() +"', Date = '" + date_Checked.getValue()
                            +"', Total = '" + txtAllTotal_Checked.getText() + "' where BillID = '" + lblBillID_Checked.getText()+ "'";

                    preparedStatement = con.prepareStatement(sql);
                    preparedStatement.executeUpdate();
                    String sql1 = "delete from BillDetail where BillID = '" +lblBillID_Checked.getText() + "'";
                    PreparedStatement ps1 = con.prepareStatement(sql1);
                    ps1.execute();
                    for(int i = 0; i < 7; i++){
                        String sql2 = "insert into BillDetail(BillID,DrinkID,Size,Quantity)"
                                + "values(?,?,?,?)";
                        if(!arrDrinkId[i].getText().equals("") && !arrQuantity[i].getText().equals("")){
                            PreparedStatement ps2 = con.prepareStatement(sql2);
                            ps2.setInt(1, Integer.parseInt(lblBillID_Checked.getText()));
                            ps2.setString(2, arrDrinkId[i].getText());
                            ps2.setString(3, (String) arrSize[i].getValue());
                            ps2.setString(4, arrQuantity[i].getText());
                            ps2.execute();
                            arrDrinkId[i].setText("");
                            arrDrinkName[i].setText("");
                            arrPrice[i].setText("");
                            arrQuantity[i].setText("");
                            arrTotal[i].setText("");
                            arrDel[i].setVisible(false);
                        }
                    }
                    tableViewEditBillInitialize();
                    statisticChart();
                } catch (SQLException ex) {
                    System.out.println("Sai add bill");
                    Logger.getLogger(MenuFormController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        }
        
    }

    public void statisticChart(){
        XYChart.Series<String,Double> series=new XYChart.Series<>();
        TreeMap<Date,Double> treeMap=new TreeMap<Date,Double>();
        String sql="select * from Bill where Status='done'";
        Date date=new Date();
        Double total,temp;
        try{
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                date=rs.getDate("Date");
                total=rs.getDouble("Total");
                if (treeMap.isEmpty()){
                    treeMap.put(date,total);
                }
                else{
                    if (treeMap.containsKey(date)){
                        temp=treeMap.get(date);
                        temp+=total;
                        treeMap.replace(date, temp);
                    }
                    else{
                        treeMap.put(date,total);
                    }
                }
            }
            for (Date i : treeMap.keySet()){
                series.getData().add(new XYChart.Data(dateToString(String.valueOf(i)),treeMap.get(i)));
            }
            
            xAxis.setLabel("Ngày tháng năm");
            yAxis.setLabel("Doanh thu");
            lineChart.getData().add(series);
            series.getNode().setStyle("-fx-stroke: red;");
            lineChart.setLegendVisible(false);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void clock(){
        Thread clock = new Thread(){
            @Override
            public void run(){
                while(true){
                                    
                    Platform.runLater(() -> {
                        DateFormat df = new SimpleDateFormat("dd/MM/yyyy  hh : mm : ss aa");
                        String dateString = df.format(new Date());
                        lblClock.setText(dateString);
                    });
                    try{
                        Thread.sleep(1);
                    }
                    catch(Exception e){
                    
                    }
                }
            }
        };
        clock.start();
    }   
     public void logout(MouseEvent event){
        if(event.getSource() == btnLogout ){ 
            confirmLogout();
        }
    }
    public void btnLogout(){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/LoginForm/LoginForm.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setTitle("1900s Cofé");
            //primaryStage.initStyle(StageStyle.UTILITY);
            stage.getIcons().add(new Image("/Images/icon.png"));
            stage.setScene(new Scene(root));
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
