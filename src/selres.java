import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class selres extends JFrame {
    selres(String x) {
        String y;
        int z;
        y = x;
        z = Integer.parseInt(y);
        setSize(300, 290);//设计窗体的大小
        setTitle("查询结果");
        Container t = getContentPane();
        JLabel sno = new JLabel("学号：");
        JLabel sname = new JLabel("姓名：");
        JLabel age = new JLabel("年龄：");
        JLabel sex = new JLabel("性别：");
        JLabel sdept = new JLabel("专业：");
        JTextField text1 = new JTextField(15);//实例化用户名文本框
        JTextField text2 = new JTextField(15);
        JTextField text3 = new JTextField(15);
        JTextField text4 = new JTextField(15);
        JTextField text5 = new JTextField(15);
        t.add(sno);
        t.add(sname);
        t.add(age);
        t.add(sex);
        t.add(sdept);
        t.add(text1);
        t.add(text2);
        t.add(text3);
        t.add(text4);
        t.add(text5);
        setBounds(300, 300, 300, 290);
        t.setLayout(null);
        sno.setBounds(10, 30, 60, 18);
        sname.setBounds(10, 70, 60, 18);
        age.setBounds(10, 110, 60, 18);
        sex.setBounds(10, 150, 60, 18);
        sdept.setBounds(10, 190, 60, 18);
        text1.setBounds(100, 30, 60, 18);
        text2.setBounds(100, 70, 60, 18);
        text3.setBounds(100, 110, 60, 18);
        text4.setBounds(100, 150, 60, 18);
        text5.setBounds(100, 190, 60, 18);
        setAlwaysOnTop(true);
        setVisible(true);

        connect conn = new connect();
        conn.getConnection();
        String sql = "select * from Vstudent where sno='"+z+"'";
        PreparedStatement ps = null;
        ResultSet rs = null;
        String a = null;
        String b = null;
        String c = null;
        String d = null;
        String f = null;
        try {
            ps = conn.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                a = rs.getString(1);
                b = rs.getString(2);
                c = rs.getString(3);
                d = rs.getString(4);
                f = rs.getString(5);
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        text1.setText(a);
        text2.setText(b);
        text3.setText(c);
        text4.setText(d);
        text5.setText(f);
    }

}

