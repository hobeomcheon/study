import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class puzzle{
	public static void main(String[] args) {
		MainFrame mf = new MainFrame();
		//����Ŭ����, ������������ �ҷ��� ����
	}
}


class MainFrame extends JFrame implements MouseListener, Runnable{
	//���������� Ŭ����
	private JLabel lb_title = new JLabel();
	//���� Ÿ��Ʋ ǥ�ÿ� ��	
	private JLabel lb_time = new JLabel();
	//�ð� ǥ�ÿ� ��
	private JButton bt_start = new JButton("START");
	//���� ���� ��ư
	private JButton bt_reset = new JButton("RESET");
	//���� ���� ��ư
	SimpleDateFormat time_format;
	//����ð����� �޾Ƶ��� ���ڿ�
	long start_time
}
