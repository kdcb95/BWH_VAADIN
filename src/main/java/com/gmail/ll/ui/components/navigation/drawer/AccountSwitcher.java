package com.gmail.ll.ui.components.navigation.drawer;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.contextmenu.ContextMenu;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.gmail.ll.ui.util.UIUtils;

import static com.gmail.ll.ui.util.UIUtils.IMG_PATH;

@CssImport("./styles/components/account-switcher.css")
public class AccountSwitcher extends Div {

	private String CLASS_NAME = "account-switcher";

	private Image avatar;
	private H4 username;
	private Label email;
	private Button dropdown;
	private ContextMenu menu;

	public AccountSwitcher() {
		setClassName(CLASS_NAME);

		initAvatar();
		initUsername();
		initEmail();
	}

	private void initAvatar() {
		avatar = new Image();
		avatar.addClassName(CLASS_NAME + "__avatar");
		avatar.setSrc(IMG_PATH + "avatar.png");
		add(avatar);
	}

	private void initUsername() {
		username = new H4("Kevin Cabrera");
		username.addClassName(CLASS_NAME + "__title");
		add(username);
	}

	private void initEmail() {
		email = new Label("correo_prueba@gmail.com");
		email.addClassName(CLASS_NAME + "__email");

		dropdown = UIUtils.createButton(VaadinIcon.ANGLE_DOWN, ButtonVariant.LUMO_SMALL, ButtonVariant.LUMO_TERTIARY);
		email.add(dropdown);

		menu = new ContextMenu(dropdown);
		menu.setOpenOnClick(true);
		menu.addItem("correo_prueba@google.com", e -> System.out.println("Testing..."));
		menu.addItem("correo_prueba@apple.com", e -> System.out.println("Testing..."));

		add(email);
	}
}
