package com.userinterface.drawing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener{
    public MyFrame(){
        super();
        setSize(800,600);
        setTitle("我的第一个窗口");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

       /* MyPanel panel = new MyPanel();
        add(panel);*/

        JButton button = new JButton("点我");
        /*button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);//关闭窗口
            }
        });*/
        button.addActionListener(this);
        JButton cancel = new JButton("点他");
        cancel.addActionListener(this);
        //获取JFrame自带的JPanel
        Container panel = this.getContentPane();
        panel.setLayout(new FlowLayout());
        //控件要放到panel里，panel在Frame里
        panel.add(button);
        panel.add(cancel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        switch (button.getText()){
            case "点我":
                System.exit(0);//关闭窗口
                break;
            case "点他":
                System.out.println("点我没用，<----点它");
                break;
        }
    }
}