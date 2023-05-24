package com.userinterface.drawing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class MyPanel extends JPanel {
    class MyMouseAdapter extends MouseAdapter{
        @Override
        public void mouseClicked(MouseEvent e) {
            super.mouseClicked(e);
            drawStar(e.getX(), e.getY());
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            super.mouseDragged(e);
            drawStar(e.getX(), e.getY());
        }
    }
    public MyPanel() {
        setBackground(Color.BLACK);
        //加鼠标事件监听器
//        addMouseListener(this);
        MyMouseAdapter listener = new MyMouseAdapter();
        addMouseListener(listener);
        addMouseMotionListener(listener);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //画月亮
        drawMoon(g);
        //画星星
//        drawStar(g);
        //每1s后重绘一次
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            repaint();
        }
    }

    private void drawMoon(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillOval(60, 60, 80, 80);
        g.setColor(Color.BLACK);
        g.fillOval(40, 40, 80, 80);
    }

    private void drawStar(int x, int y) {
        Graphics g = getGraphics();
        //随机颜色
        Random random = new Random();
        int red = random.nextInt(256);
        int green = random.nextInt(256);
        int blue = random.nextInt(256);
        Color color = new Color(red, green, blue);
        g.setColor(color);
        //随机位置
//            int x = random.nextInt(getWidth()-30);
//            int y = random.nextInt(getHeight()-30);
        //随机大小
        int size = random.nextInt(20) + 10;
        Font font = new Font("Times New Roman", Font.BOLD, size);
        g.setFont(font);//设置字体字号
        //绘制※
        g.drawString("*", x, y);

    }
}

