package org.beuwi.msgbots.platform.app.view.parts;

import javafx.collections.ObservableMap;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import org.beuwi.msgbots.platform.app.impl.View;
import org.beuwi.msgbots.platform.util.ResourceUtils;

public class MenuBarPart implements View
{
    private static ObservableMap<String, Object> nameSpace;

    private static Pane root;

    @Override
    public void init() throws Exception
    {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(ResourceUtils.getForm("MenuBarPart"));
        loader.setController(null);
        loader.load();

        nameSpace = loader.getNamespace();

        root = loader.getRoot();
    }

    public static Pane getRoot()
    {
        return root;
    }

    public static HBox getComponent()
    {
        return (HBox) root.getChildren().get(0);
    }

    public static ObservableMap<String, Object> getNameSpace()
    {
        return nameSpace;
    }
}