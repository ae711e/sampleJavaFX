package sample;
/*
 Обработка нажатия кнопок
 by novel http://devcolibri.com/3226
 для правильного отображения русских букв, придерживаюсь win1251
 */

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller {
  @FXML
  private Button but_Cancel; // link to maket
  @FXML
  private Label label_Comment; // link to maket
  @FXML
  private TextField txt_Login; // link to maket
  @FXML
  private TextField txt_Password; // link to maket
  
  @FXML
  public void initialize()
  {
    // 1-способ обработки нажатий, запрограммировать обработчик
    but_Cancel.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
      @Override
      public void handle(MouseEvent event) {
        label_Comment.setText("Press Cancel Go Away!");
      }
    });
    //
  }
  
  // 2-ой способ привязки, через указание имени функции в макете
  @FXML
  public void handle_but_Login_onClick()
  {
    String str;
    str=txt_Login.getText()+"/"+txt_Password.getText();
    label_Comment.setText("Press Login логинимся! "+str);
  }
  
}
