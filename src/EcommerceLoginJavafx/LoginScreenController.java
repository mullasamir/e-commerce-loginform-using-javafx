package EcommerceLoginJavafx;

import java.sql.ResultSet;
import java.sql.SQLException;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class LoginScreenController {
	@FXML
	TextField uname;
	@FXML
	TextField upass;
	@FXML
	Label msg;

	public void loginButtonMsg() throws SQLException {

		String usernm = uname.getText();
		String userpass = upass.getText();

		if (loginValidate(usernm, userpass)) {

			System.out.println("Login successfully..");
			msg.setText("Login successfully..");
			msg.setTextFill(Color.GREEN);
		} else {
			msg.setText("Login Failed..");
			msg.setTextFill(Color.RED);
		}

	}

	public boolean loginValidate(String username, String userpass) throws SQLException {

		String query = "select fname , pass from e_user where fname = '" + username + "' and pass = '" + userpass + "'";
		ResultSet resultSet = DbValidation.selectQuery(query);
		return resultSet.next();
	}

}