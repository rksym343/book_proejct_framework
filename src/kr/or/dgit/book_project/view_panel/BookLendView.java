package kr.or.dgit.book_project.view_panel;

import java.awt.Rectangle;

import javax.swing.JPanel;

import kr.or.dgit.book_project.book_panel.AbsViewPanel;
import kr.or.dgit.book_project.book_panel.PaymentIo;
import kr.or.dgit.book_project.book_panel.BookLendMemberDetail;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.BoxLayout;

public class BookLendView extends AbsViewPanel {

	
	public BookLendView() {
		GridLayout gridLayout = (GridLayout) getLayout();
		gridLayout.setVgap(10);
		
		JPanel panel = new JPanel();
		add(panel);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		PaymentIo panel_3 = new PaymentIo();
		panel.add(panel_3);
		
		JPanel panel_5 = new JPanel();
		panel.add(panel_5);
		panel_5.setLayout(new BoxLayout(panel_5, BoxLayout.Y_AXIS));
		
		BookLendMemberDetail panel_4 = new BookLendMemberDetail();
		panel_5.add(panel_4);
		
		JPanel panel_2 = new JPanel();
		panel_5.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnLend = new JButton("대여");
		btnLend.setBounds(147, 20, 100, 50);
		panel_2.add(btnLend);
		
		JPanel panel_1 = new JPanel();
		add(panel_1);
	}

}
