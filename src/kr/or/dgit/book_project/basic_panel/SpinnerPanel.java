package kr.or.dgit.book_project.basic_panel;

import java.awt.GridLayout;

import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

@SuppressWarnings("serial")
public class SpinnerPanel extends CompPanel {

	private JSpinner spinner;

	public SpinnerPanel() {
		pContent.setLayout(new GridLayout(1, 0, 0, 0));

		spinner = new JSpinner();
		pContent.add(spinner);

	}

	public void setValues(double value, double minValue, double maxValue, double stepSize) {
		spinner.setModel(new SpinnerNumberModel(value, minValue, maxValue, stepSize));
	}
	
	public void setValue(double value){
		spinner.setValue(value);
	}
	
	public double getValue(){
		return (double) spinner.getValue();
	}
	
	
}
