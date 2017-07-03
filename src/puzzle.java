import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class puzzle{
	public static void main(String[] args) {
		MainFrame mf = new MainFrame();
		//메인클래스, 메인프레임을 불러와 실행
	}
}


class MainFrame extends JFrame implements MouseListener, Runnable{
	//메인프레임 클래스
	private JLabel lb_title = new JLabel();
	//게임 타이틀 표시용 라벨	
	private JLabel lb_time = new JLabel();
	//시간 표시용 라벨
	private JButton bt_start = new JButton("START");
	//게임 시작 버튼
	private JButton bt_reset = new JButton("RESET");
	//게임 리셋 버튼
	SimpleDateFormat time_format;
	//진행시간값을 받아들일 문자열
	long start_time
}
