package com.gmail.ll.ui.views;

import java.time.format.DateTimeFormatter;
import java.util.List;

import com.vaadin.flow.component.AttachEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.DetachEvent;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.grid.ColumnTextAlign;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.contextmenu.GridContextMenu;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.page.Page;
import com.vaadin.flow.component.splitlayout.SplitLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.provider.DataProvider;
import com.vaadin.flow.data.renderer.ComponentRenderer;
import com.vaadin.flow.data.renderer.LocalDateRenderer;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.StreamResource;
import com.vaadin.flow.shared.Registration;

import com.gmail.ll.ui.MainLayout;
import com.gmail.ll.ui.components.Badge;
import com.gmail.ll.ui.components.FlexBoxLayout;
import com.gmail.ll.ui.components.ListItem;
import com.gmail.ll.ui.layout.size.Horizontal;
import com.gmail.ll.ui.layout.size.Right;
import com.gmail.ll.ui.layout.size.Top;
import com.gmail.ll.ui.layout.size.Vertical;
import com.gmail.ll.ui.util.FontSize;
import com.gmail.ll.ui.util.LineHeight;
import com.gmail.ll.ui.util.LumoStyles;
import com.gmail.ll.ui.util.TextColor;
import com.gmail.ll.ui.util.UIUtils;
import com.gmail.ll.ui.util.css.BoxSizing;
import com.gmail.ll.ui.util.css.Overflow;
import com.gmail.ll.ui.util.css.PointerEvents;
import com.gmail.ll.ui.util.css.TextOverflow;
import com.gmail.ll.ui.util.css.lumo.BadgeColor;
import com.gmail.ll.ui.util.css.lumo.BadgeShape;
import com.gmail.ll.ui.util.css.lumo.BadgeSize;
import com.gmail.ll.ui.views.personnel.Temporal;


@Route(value = "Crear Usuarios", layout = MainLayout.class)
public class Accounts extends Div {


	  public Accounts() {
	     
  Dialog dialog = new Dialog();
       dialog.getElement().setAttribute("aria-label", "Ingreso de Usuarios");
			dialog.add(createHeaderLayout());
	        VerticalLayout dialogLayout = createDialogLayout();
			HorizontalLayout dialogLayout1 = createDialogLayout1();
			HorizontalLayout dialogLayout3 = createDialogLayout3();
			        dialog.add(dialogLayout,dialogLayout1,dialogLayout3);
			        dialog.setModal(false);
			        dialog.setDraggable(true);
        createFooter(dialog);
	        Button button = new Button("Nuevo Usuario", e -> dialog.open());
	        
		           add(dialog,button);	
	//////////////////////////////
		           //////////////////
		           /////////////////////////////
		           ////////////////////////
		         
		           Grid grid = new Grid();
		         //  diseño.addComponent(cuadrícula);
		           grid.setSizeFull();
		         //  diseño.setExpandRatio(cuadrícula, 1);
		           add(grid);
		           
	           
		        }
	  //Titulo del Dialogo
	  private static H2 createHeaderLayout() {
	        H2 headline = new H2("Crear Usuario");
	        headline.addClassName("draggable");
	        headline.getStyle().set("margin", "0").set("font-size", "1.5em")
	                .set("font-weight", "bold")
	                .set("cursor", "move")
	                .set("padding", "var(--lumo-space-m) 0")
	                .set("flex", "1");     
	        return headline;
    }
//Campos para agregar usuario
	    private static VerticalLayout createDialogLayout() {

	        TextField cedulaField = new TextField("Cédula");
	        VerticalLayout fieldLayout = new VerticalLayout(cedulaField);
	        fieldLayout.setSpacing(false);
	        fieldLayout.setPadding(false);
	        //fieldLayout.setAlignItems(FlexComponent.Alignment.STRETCH);
	        fieldLayout.getStyle().set("width", "300px").set("max-width", "100%");

	        return fieldLayout;
	    }
	    
	    private static HorizontalLayout createDialogLayout3() {
	    	TextField correoField = new TextField("Email");
	    	ComboBox<String> rolField = new ComboBox<>("--Perfil--");
	        rolField. setAllowCustomValue(true);
	        rolField.setItems("Administrador", "Asistente", "Reporteador");
	        rolField.setHelperText("Select or type a browser");
	 HorizontalLayout fieldLayout3 = new HorizontalLayout(correoField,
	        		rolField);
	       // fieldLayout3.setSpacing(false);
	      //  fieldLayout3.setPadding(false);
	        //fieldLayout.setAlignItems(FlexComponent.Alignment.STRETCH);
	        fieldLayout3.getStyle().set("width", "300px").set("max-width", "100%");

	        return fieldLayout3;
	    }
	    
	    private static HorizontalLayout createDialogLayout1() {
	    	TextField usuarioField = new TextField("Usuario");
	        TextField telefonoField = new TextField("Télefono");
	       HorizontalLayout fieldsLayout = new HorizontalLayout(usuarioField,telefonoField);
	        return fieldsLayout;

	    }
	    
	    
//creacion de los botones
	    private static void createFooter(Dialog dialog) {
	        Button cancelButton = new Button("Cancelar", e -> dialog.close());
	        Button saveButton = new Button("Agregar", e -> dialog.close());
	        saveButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

	       dialog.add(cancelButton);
	       dialog.add(saveButton);
	    }
	    
	    
}
		  