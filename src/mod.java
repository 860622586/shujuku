import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class mod extends JFrame {
    mod() {
        setSize(300,290);//设计窗体的大小
        setTitle("修改");
        Container u = getContentPane();
        JLabel sno=new JLabel("请输入学号：");
        JLabel sname=new JLabel("请输入姓名：");
        JLabel age=new JLabel("请输入年龄：");
        JLabel sex=new JLabel("请输入性别：");
        JLabel sdept=new JLabel("请输入专业：");
        JTextField sno1=new JTextField(15);//实例化用户名文本框
        JTextField sname1=new JTextField(15);
        JTextField age1=new JTextField(15);
        JTextField sex1=new JTextField(15);
        JTextField sdept1=new JTextField(15);
        JButton mod=new JButton("修改");
        u.add(sno);
        u.add(sname);
        u.add(age);
        u.add(sex);
        u.add(sdept);
        u.add(sno1);
        u.add(sname1);
        u.add(age1);
        u.add(sex1);
        u.add(sdept1);
        u.add(sno);
        u.add(sname);
        u.add(age);
        u.add(sex);
        u.add(mod);
        setBounds(300, 300, 300, 290);
        u.setLayout(null);
        sno.setBounds(10,30,100,30);
        sname.setBounds(10,70,100,30);
        age.setBounds(10,110,100,30);
        sex.setBounds(10,150,100,30);
        sdept.setBounds(10,190,100,30);
        sno1.setBounds(100,30,100,30);
        sname1.setBounds(100,70,100,30);
        age1.setBounds(100,110,100,30);
        sex1.setBounds(100,150,100,30);
        sdept1.setBounds(100,190,100,30);
        mod.setBounds(210,100,60,30);
        setAlwaysOnTop(true);
        setVisible(true);
        mod.addActionListener(new ActionListener() { //对修改按钮添加监听事件
            public void actionPerformed(ActionEvent arg0) {
                String n1 = sno1.getText();
                String n2 = sname1.getText();
                String n3 = age1.getText();
                String n4 = sex1.getText();
                String n5 = sdept1.getText();
                int x,y;
                x = Integer.parseInt(n1);
                y = Integer.parseInt(n3);
                PreparedStatement ps = null;
                connect conn = new connect();
                conn.getConnection();
                String sql="Update Vstudent set sno='"+x+"',sname='"+n2+"',age='"+y+"',sex='"+n4+"',sdept='"+n5+"' where sno='"+n1+"'";
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