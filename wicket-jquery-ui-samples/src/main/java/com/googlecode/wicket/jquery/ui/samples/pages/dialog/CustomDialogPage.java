package com.googlecode.wicket.jquery.ui.samples.pages.dialog;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.Model;

import com.googlecode.wicket.jquery.ui.dialog.DialogButton;
import com.googlecode.wicket.jquery.ui.form.button.AjaxButton;
import com.googlecode.wicket.jquery.ui.panel.JQueryFeedbackPanel;
import com.googlecode.wicket.jquery.ui.samples.component.SimpleDialog;

public class CustomDialogPage extends AbstractDialogPage
{
	private static final long serialVersionUID = 1L;

	public CustomDialogPage()
	{
		this.init();
	}

	private void init()
	{
		final Form<Void> form = new Form<Void>("form");
		this.add(form);

		// FeedbackPanel //
		final FeedbackPanel feedbackPanel = new JQueryFeedbackPanel("feedback");
		form.add(feedbackPanel.setOutputMarkupId(true));

		// Dialog //
		final SimpleDialog dialog = new SimpleDialog("dialog", "Simple dialog box", new Model<String>("I am the widget dialog model")) {

			private static final long serialVersionUID = 1L;

			@Override
			protected void onClose(AjaxRequestTarget target, DialogButton button)
			{
				this.info(button + " has been clicked");

				/* Warning: 1.2.2-SNAPSHOT syntax */
				/* TODO: 1.2.2 - comment to be removed */
				if (this.btnOk.equals(button))
				{
					this.info(String.format("The model object is: '%s'", this.getModelObject()));
				}

				target.add(feedbackPanel);
			}
		};

		this.add(dialog);

		// Buttons //
		form.add(new AjaxButton("open") {

			private static final long serialVersionUID = 1L;

			@Override
			protected void onSubmit(AjaxRequestTarget target, Form<?> form)
			{
				dialog.open(target);
			}
		});
	}
}
