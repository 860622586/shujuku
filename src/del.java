import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class del extends JFrame {
    del() {
        setSize(300,290);//设计窗体的大小
        setTitle("删除");
        Container u = getContentPane();
        JLabel sno=new JLabel("请输入学号：");
        JTextField sno1=new JTextField(15);//实例化用户名文本框
        JButton del=new JButton("删除");
        u.add(sno);
        u.add(sno1);
        u.add(del);
        setBounds(300, 300, 300, 290);
        u.setLayout(null);
        sno.setBounds(10,100,100,30);
        sno1.setBounds(120,100,100,30);
        del.setBounds(110,180,60,30);
        setAlwaysOnTop(true);
        setVisible(true);
        del.addActionListener(new ActionListener() {//对确定按钮添加监听事件
            public void actionPerformed(ActionEvent arg0) {
                String n = sno1.getText();
                int x;
                x = Integer.parseInt(n);
                PreparedStatement ps = null;
                connect conn = new connect();
                conn.getConnection();
                String sql="delete from Vstudent where sno='"+x+"'";
                try {
                    ps = conn.getConnection().prepareStatement(sql);
                    ps.executeUpdate();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
    }
}