package com.gmail.ll.ui.views.personnel;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.charts.model.Label;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.formlayout.FormLayout.ResponsiveStep;
import com.vaadin.flow.component.grid.ColumnTextAlign;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.radiobutton.RadioButtonGroup;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.timepicker.TimePicker;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.data.provider.DataProvider;
import com.vaadin.flow.data.provider.ListDataProvider;
import com.vaadin.flow.data.renderer.ComponentRenderer;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import com.gmail.ll.ui.MainLayout;
import com.gmail.ll.ui.components.FlexBoxLayout;
import com.gmail.ll.ui.components.Initials;
import com.gmail.ll.ui.components.ListItem;
import com.gmail.ll.ui.components.detailsdrawer.DetailsDrawer;
import com.gmail.ll.ui.components.detailsdrawer.DetailsDrawerFooter;
import com.gmail.ll.ui.components.detailsdrawer.DetailsDrawerHeader;
import com.gmail.ll.ui.layout.size.Horizontal;
import com.gmail.ll.ui.layout.size.Right;
import com.gmail.ll.ui.layout.size.Top;
import com.gmail.ll.ui.layout.size.Vertical;
import com.gmail.ll.ui.util.LumoStyles;
import com.gmail.ll.ui.util.UIUtils;
import com.gmail.ll.ui.util.css.BoxSizing;
import com.gmail.ll.ui.views.SplitViewFrame;

@Route(value = "managers", layout = MainLayout.class)
@PageTitle("Managers")
public class Temporal extends VerticalLayout   {

	public Temporal() {
		//Visualizacion de Barra de deslizar
		setAlignItems(Alignment.STRETCH);
	    setHeight("400px");
	    setMaxWidth("400%");
	    setPadding(false);
	    setSpacing(true);
	    setWidth("1260px");
	    getStyle().set("border", "1px solid var(--lumo-contrast-20pct)");

	    //creacion de formulario
	    
		add(createHeaderLayout());
	    TextField user = new TextField("Usuario");
	    DatePicker datefrom = new DatePicker("Fecha de Inicio");
	    DatePicker dateto = new DatePicker("Fecha de Inicio");

	    TimePicker timefrom = new TimePicker("desde");
	    TimePicker timeto = new TimePicker("hasta");

	    FormLayout formLayout = new FormLayout();
	    formLayout.add(user, datefrom, dateto, timefrom, timeto);
	    formLayout.setColspan(user, 3);
	    formLayout.setResponsiveSteps(
	            new ResponsiveStep("0", 1),
	            new ResponsiveStep("500px", 3)
	    );
	  //  add(formLayout);
	    //Creación de Barra de deslizamiento
	    Scroller scroller = new Scroller(new Div(formLayout));
		  scroller.setScrollDirection(Scroller.ScrollDirection.VERTICAL);
		  scroller.getStyle()
		          .set("border-bottom", "1px solid var(--lumo-contrast-20pct)")
		          .set("padding", "var(--lumo-space-m)");
		  add(scroller); 
	    	  }
	//Titulo del Form
	  private static H2 createHeaderLayout() {
	        H2 headline = new H2("Crear Usuario Temporal");
	        headline.addClassName("draggable");
	        headline.getStyle().set("margin", "3").set("font-size", "1.5em")
	                .set("font-weight", "bold")
	                .set("cursor", "move")
	                .set("padding", "var(--lumo-space-m) 0")
	                .set("flex", "1");

	        return headline;
	    }
	  
}
