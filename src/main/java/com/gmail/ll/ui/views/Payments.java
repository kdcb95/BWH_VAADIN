package com.gmail.ll.ui.views;

import com.vaadin.flow.component.AttachEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.grid.ColumnTextAlign;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.component.tabs.TabsVariant;
import com.vaadin.flow.data.provider.DataProvider;
import com.vaadin.flow.data.provider.ListDataProvider;
import com.vaadin.flow.data.renderer.ComponentRenderer;
import com.vaadin.flow.data.renderer.TemplateRenderer;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import com.gmail.ll.ui.MainLayout;
import com.gmail.ll.ui.components.Badge;
import com.gmail.ll.ui.components.FlexBoxLayout;
import com.gmail.ll.ui.components.ListItem;
import com.gmail.ll.ui.components.detailsdrawer.DetailsDrawer;
import com.gmail.ll.ui.components.detailsdrawer.DetailsDrawerHeader;
import com.gmail.ll.ui.components.navigation.bar.AppBar;
import com.gmail.ll.ui.layout.size.Bottom;
import com.gmail.ll.ui.layout.size.Horizontal;
import com.gmail.ll.ui.layout.size.Top;
import com.gmail.ll.ui.layout.size.Vertical;
import com.gmail.ll.ui.util.FontSize;
import com.gmail.ll.ui.util.LumoStyles;
import com.gmail.ll.ui.util.TextColor;
import com.gmail.ll.ui.util.UIUtils;
import com.gmail.ll.ui.util.css.BoxSizing;
import com.gmail.ll.ui.util.css.WhiteSpace;

@PageTitle("Payments")
@Route(value = "payments", layout = MainLayout.class)
public class Payments extends SplitViewFrame {

}
