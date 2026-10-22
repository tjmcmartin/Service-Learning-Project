package team.taskapp.ui;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.layout.HBox;
import team.taskapp.utils.fileUtils;

public class ConfirmButtonBar extends ButtonBar {

    private Button btnConfirm;
    private Button btnCancel;

    public ConfirmButtonBar() {
        this("Confirm");
    }
    public ConfirmButtonBar(String confirmButtonText) {
        this(confirmButtonText, "Cancel");
    }
    public ConfirmButtonBar(String confirmBtnText, String cancelBtnText) {

        btnConfirm = new Button(confirmBtnText);
        ButtonBar.setButtonData(btnConfirm, ButtonData.YES);

        btnCancel = new Button(cancelBtnText);
        ButtonBar.setButtonData(btnCancel, ButtonData.CANCEL_CLOSE);

        //uncomment this if you ever want to link a stylesheet (you can use Ctrl+/)
//        this.getStylesheets().add( fileUtils.loadCSS(this.getClass()) );

        this.getButtons().addAll(btnConfirm, btnCancel);

    }

    public void setOnConfirm(EventHandler<ActionEvent> e) {
        btnConfirm.setOnAction(e);
    }

    public void setOnCancel(EventHandler<ActionEvent> e) {
        btnCancel.setOnAction(e);
    }

}
