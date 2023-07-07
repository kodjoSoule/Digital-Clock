package ml.digitalClock.Clock;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.Timer;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class DigitalClock extends JFrame {
	JLabel dateLabel ;
	JLabel timeLabel ;
	private int count ; 
	public DigitalClock() {
		dateLabel = new JLabel("DKKDKD");
        timeLabel = new JLabel("DKDKDKD");
        count = 0 ;
        
        //frame
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.setSize(500, 200);
        this.setTitle("Clock");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setAlwaysOnTop(true);
        //panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2,1));
        
        //Time Label
        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Arial", Font.PLAIN, 60));
        timeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        timeLabel.setVerticalAlignment(SwingConstants.CENTER);
        timeLabel.setForeground(Color.RED);
        
        //date Time
        dateLabel = new JLabel();
        dateLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        dateLabel.setHorizontalAlignment(SwingConstants.CENTER);
        dateLabel.setVerticalAlignment(SwingConstants.CENTER);
        dateLabel.setForeground(Color.WHITE);
        
        //
        panel.setBackground(Color.BLACK);
        panel.add(timeLabel);
        panel.add(dateLabel);
        updateTimeDate();
        this.add(panel, BorderLayout.CENTER);
        //
     // Use a Timer to update the time and date labels every second
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	updateTimeDate();
            }
        });
        timer.start();
        
        
        
	}
	
	protected void updateTimeDate2() {
		this.count += 1 ;
		this.dateLabel.setText("Count "+ count);
		
	}
	protected void updateTimeDate() {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat timeFormatter = new SimpleDateFormat("HH:mm:ss");
		String time = timeFormatter.format(calendar.getTime());
		//
		SimpleDateFormat dateFormatter = new SimpleDateFormat("EEE, MMM dd, yyyy");
        String date = dateFormatter.format(calendar.getTime());
        
        //
        timeLabel.setText(time);
        dateLabel.setText(date);
    }
		

	
	public void start() {
		this.setVisible(true);
	}
}
