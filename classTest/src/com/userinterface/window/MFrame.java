package com.userinterface.window;

import com.sun.deploy.panel.JSmartTextArea;
import com.userinterface.drawing.MyFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MFrame extends JFrame implements ActionListener {
    public MFrame(){
        super();
        setSize(800,400);
        setTitle("我的第一个窗口");
        // 屏幕居中显示
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JTextArea textArea = new JTextArea();
        textArea.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                // 修改窗口名
                getTitle();
            }
        });
        JScrollPane jScrollPane = new JScrollPane(textArea);
        jScrollPane.setViewportView(textArea);
        getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(jScrollPane);

        // 菜单栏
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        // 创建并添加菜单
        JMenu file = new JMenu("编辑");
        JMenuItem newFile = new JMenuItem(CONSTANT.ITEM_NEW_FILE);
        // 快捷键添加
        newFile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,ActionEvent.CTRL_MASK));
        JMenuItem openFile = new JMenuItem(CONSTANT.ITEM_OPEN_FILE);
        newFile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,ActionEvent.CTRL_MASK));
        JMenuItem saveFile = new JMenuItem(CONSTANT.ITEM_SAVE_FILE);
        newFile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,ActionEvent.CTRL_MASK));

        file.add(newFile);
        file.add(openFile);
        file.add(saveFile);
        menuBar.add(file);
        // 加事件监听
        newFile.addActionListener(this);
        openFile.addActionListener(this);
        saveFile.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JMenuItem item = (JMenuItem) e.getSource();
        switch (item.getText()){
            case CONSTANT.ITEM_NEW_FILE:
                System.out.println("新建文件");
                break;
            case CONSTANT.ITEM_OPEN_FILE:
                System.out.println("打开文件");
                break;
            case CONSTANT.ITEM_SAVE_FILE:
                System.out.println("保存文件");
                break;
        }
    }
}
