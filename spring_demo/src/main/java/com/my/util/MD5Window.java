package com.my.util;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by simpletour_Jenkin on 2016/3/29.
 */
public class MD5Window {


    public static void main(String[] args){

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                SimpleFrame frame = new SimpleFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//                frame.checkImage()
                frame.setVisible(true);
            }
        });
    }
}

class SimpleFrame extends JFrame{
    /**
     * 宽度
     */
    private static final int DEFAULT_WIDTH = 800;
    /**
     * 高度
     */
    private static final int DEFAULT_HEIGHT = 450;

    private JPanel buttonPanel;

    public SimpleFrame(){
        /**
         * 设置窗口的大小
         */
        setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
        /**
         * 设置窗口的名字
         */
        setTitle("属于自己的站长工具");

        /**
         * 自己取名叫工具类
         */
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        /**
         * 设置窗口的位置（居中）
         */
        setLocation((screenSize.width-DEFAULT_WIDTH)/2,(screenSize.height-DEFAULT_HEIGHT)/2);

        /**
         * 获取我们工具的logo图片（项目的root目录）
         */
//        Path path = Paths.get("time.png");
        Image image = new ImageIcon("time.png").getImage();
        setIconImage(image);

        // 添加按钮
        add(buttonFrame(buttonPanel));
    }

    /**
     * 添加按钮
     * @param buttonPanel
     * @return
     */
    private JPanel buttonFrame(JPanel buttonPanel){
        JButton yellowButton = new JButton("yellow");
        JButton redButton = new JButton("red");
        JButton blueButton = new JButton("blue");

        buttonPanel = new JPanel();

        // add button
        buttonPanel.add(yellowButton);
        buttonPanel.add(redButton);
        buttonPanel.add(blueButton);

        // create button actions
        ColorAction yellowAction = new ColorAction(Color.yellow);
        ColorAction blueAction   = new ColorAction(Color.blue);
        ColorAction redAction    = new ColorAction(Color.red);
        // associate actions with buttons
        yellowButton.addActionListener(yellowAction);
        redButton.addActionListener(redAction);
        blueButton.addActionListener(blueAction);

        return buttonPanel;
    }

    /**
     * An action listener that sets the panel's background color.
     */
    private class ColorAction implements ActionListener{

        private Color backgroundColor;

        public ColorAction(Color color){
            backgroundColor = color;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            buttonPanel.setBackground(backgroundColor);
        }
    }

}
