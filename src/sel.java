import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class sel extends JFrame {
    sel() {
        setSize(300,290);//设计窗体的大小
        setTitle("查询");
        Container u = getContentPane();
        JLabel sno=new JLabel("请输入学号：");
        JTextField sno1=new JTextField(15);//实例化用户名文本框
        JButton sel=new JButton("查询");
        u.add(sno);
        u.add(sno1);
        u.add(sel);
        setBounds(300, 300, 300, 290);
        u.setLayout(null);
        sno.setBounds(10,100,100,30);
        sno1.setBounds(120,100,100,30);
        sel.setBounds(110,180,60,30);
        setAlwaysOnTop(true);
        setVisible(true);
        sel.addActionListener(new ActionListener() {//对确定按钮添加监听事件
            public void actionPerformed(ActionEvent arg0) {
                String n = sno1.getText();
                new selres(n);
            }
        });
    }
}
