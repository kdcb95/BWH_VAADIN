package com.gmail.ll.ui.views;

import com.vaadin.flow.component.AttachEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.charts.Chart;
import com.vaadin.flow.component.charts.model.ChartType;
import com.vaadin.flow.component.charts.model.Configuration;
import com.vaadin.flow.component.charts.model.ListSeries;
import com.vaadin.flow.component.charts.model.XAxis;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.router.BeforeEvent;
import com.vaadin.flow.router.HasUrlParameter;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import com.gmail.ll.ui.MainLayout;
import com.gmail.ll.ui.components.FlexBoxLayout;
import com.gmail.ll.ui.components.ListItem;
import com.gmail.ll.ui.components.navigation.bar.AppBar;
import com.gmail.ll.ui.layout.size.Bottom;
import com.gmail.ll.ui.layout.size.Horizontal;
import com.gmail.ll.ui.layout.size.Top;
import com.gmail.ll.ui.layout.size.Vertical;
import com.gmail.ll.ui.util.BoxShadowBorders;
import com.gmail.ll.ui.util.LumoStyles;
import com.gmail.ll.ui.util.TextColor;
import com.gmail.ll.ui.util.UIUtils;
import com.gmail.ll.ui.util.css.BorderRadius;
import com.gmail.ll.ui.util.css.WhiteSpace;
import com.vaadin.flow.component.orderedlayout.FlexLayout.FlexDirection;
import com.vaadin.flow.component.orderedlayout.FlexLayout.FlexWrap;

import java.time.LocalDate;

@PageTitle("Account Details")
@Route(value = "account-details", layout = MainLayout.class)
public class AccountDetails extends ViewFrame {

	}
