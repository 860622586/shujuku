import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class choose extends JFrame {
    choose() {
        setSize(300,290);//设计窗体的大小
        setTitle("请选择操作");
        Container t = getContentPane();
        JButton add=new JButton("添加");
        JButton del=new JButton("删除");
        JButton mod=new JButton("修改");
        JButton sel=new JButton("查询");
        t.add(add);
        t.add(del);
        t.add(mod);
        t.add(sel);
        setBounds(300, 300, 300, 290);
        t.setLayout(null);
        add.setBounds(120,30,60,30);
        del.setBounds(120,70,60,30);
        mod.setBounds(120,110,60,30);
        sel.setBounds(120,150,60,30);
        setAlwaysOnTop(true);
        setVisible(true);

        add.addActionListener(new ActionListener() {//对添加按钮添加监听事件
            public void actionPerformed(ActionEvent arg0) {
                new add();
            }
        });
        del.addActionListener(new ActionListener() {//对删除按钮添加监听事件
            public void actionPerformed(ActionEvent arg0) {
                new del();
            }
        });
        mod.addActionListener(new ActionListener() {//对修改按钮添加监听事件
            public void actionPerformed(ActionEvent arg0) {
                new mod();
            }
        });
        sel.addActionListener(new ActionListener() {//对查询按钮添加监听事件
            public void actionPerformed(ActionEvent arg0) {
                new sel();
            }
        });
    }

}
