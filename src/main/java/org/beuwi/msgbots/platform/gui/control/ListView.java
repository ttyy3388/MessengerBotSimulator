package org.beuwi.msgbots.platform.gui.control;

import javafx.collections.ObservableList;
import javafx.scene.control.SelectionMode;

public class ListView<T> extends javafx.scene.control.ListView<T>
{
	public ListView()
	{
		/* setCellFactory(param -> new ListCell<>()
		{
			{
				prefWidthProperty().bind(this.widthProperty());
				setMaxWidth(Control.USE_PREF_SIZE);
			}

			@Override
			protected void updateItem(T item, boolean empty)
			{
				super.updateItem(item, empty);

				if (item != null && !empty)
				{
					setGraphic(item);
				}
				else
				{
					setGraphic(null);
				}
			}
		}); */
	}

	public void clear()
	{
		getItems().clear();
	}

	public void delete(T item)
	{
		getItems().remove(item);
	}

	public void remove(T item)
	{
		getItems().remove(item);
	}

	public void select(T item)
	{
		getSelectionModel().select(item);
	}

	public void addItem(T item)
	{
		getItems().add(item);
		scrollTo(item);
	}

	public T getItem(int index)
	{
		return getItems().get(index);
	}

	public ObservableList<T> getSelectedItems()
	{
		return getSelectionModel().getSelectedItems();
	}

	public void setSelectionMode(SelectionMode mode)
	{
		getSelectionModel().setSelectionMode(mode);
	}
}