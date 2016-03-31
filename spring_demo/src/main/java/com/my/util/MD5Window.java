package com.my.util;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by simpletour_Jenkin on 2016/3/29.
 */
public class MD5Window {


    public static void main(String[] args){

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                SimpleFrame simpleFrame = new SimpleFrame();
                simpleFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//                frame.checkImage()
                simpleFrame.setVisible(true);

                TimeFrame timeFrame = new TimeFrame();
                timeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                timeFrame.setVisible(true);
            }
        });
    }
}

class SimpleFrame extends JFrame{
    /**
     * 宽度
     */
    private static final int DEFAULT_WIDTH = 430;
    /**
     * 高度
     */
    private static final int DEFAULT_HEIGHT = 300;

    private JTextArea inputTextArea;
    private JTextArea outputTextArea;
    private JTextField jTextField = new JTextField();

    private JPanel northPanel = new JPanel();
    private JPanel centerPanel = new JPanel();
    private JPanel southPanel = new JPanel();

    public SimpleFrame(){

        styleFrame();

        // 添加按钮
        centerPanel = this.buttonFrame(centerPanel);
        // 添加输入文本域
        northPanel = this.doInputTextArea(northPanel,10,36,false,"输入框");
        // 添加输出文本域
        southPanel = this.doOutputTextArea(southPanel,2,36,true);


        add(northPanel,BorderLayout.NORTH);
        add(centerPanel,BorderLayout.CENTER);
        add(southPanel,BorderLayout.SOUTH);
    }

    /**
     * 添加样式和位置什么的
     * @return
     */
    private void styleFrame(){
        /**
         * 设置窗口的大小
         */
        setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
        /**
         * 设置窗口的名字
         */
        setTitle("站长工具之MD5");

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

        Image image = new ImageIcon("time.png").getImage();
        setIconImage(image);

        /**
         * 设置不可设置大小
         */
        setResizable(false);

    }

    private JPanel doOutputTextArea(JPanel jPanel, int width, int height, Boolean isReadOnly){

        outputTextArea = new JTextArea("/**只能用于MD5(32位)**/",width,height);
//        textArea.setEnabled(false);
//        textArea.setDragEnabled(false);
        outputTextArea.setEditable(!isReadOnly);
        // 自动换行
        outputTextArea.setLineWrap(true);
        jPanel.add(outputTextArea);

        return jPanel;
    }

    /**
     * 添加文本域
     * @param jPanel
     * @param width
     * @param height
     * @param isReadOnly
     * @return
     */
    private JPanel doInputTextArea(JPanel jPanel, int width, int height, Boolean isReadOnly, String showMessage){
        if (showMessage==null){
            showMessage="";
        }
        inputTextArea = new JTextArea(showMessage,width,height);
//        textArea.setEnabled(false);
//        textArea.setDragEnabled(false);
        inputTextArea.setEditable(!isReadOnly);
        // 自动换行
        inputTextArea.setLineWrap(true);
        jPanel.add(inputTextArea);

        return jPanel;
    }




    /**
     * 添加按钮
     * @param buttonPanel
     * @return
     */
    private JPanel buttonFrame(JPanel buttonPanel){
//        JButton yellowButton = new JButton("yellow");
//        JButton redButton = new JButton("red");

        JButton md5Button = new JButton("MD5");
//        blueButton.setSize(new Dimension(10,10));

        // add button
//        buttonPanel.add(yellowButton);
//        buttonPanel.add(redButton);
        buttonPanel.add(md5Button);

        // create button actions
//        ColorAction yellowAction = new ColorAction(Color.yellow);
        ColorAction md5Action   = new ColorAction(Color.green);
//        ColorAction redAction    = new ColorAction(Color.red);
        // associate actions with buttons
//        yellowButton.addActionListener(yellowAction);
//        redButton.addActionListener(redAction);
        md5Button.addActionListener(md5Action);

        return buttonPanel;
    }

    /**
     * An action listener that sets the panel's background color.
     */
    private class ColorAction implements ActionListener{

        private Color backgroundColor;

        public ColorAction(Color color){
            this.backgroundColor = color;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            southPanel.setBackground(this.backgroundColor);

            outputTextArea.setText(Md5.messageDigest(inputTextArea.getText()));
        }
    }

}

class TimeFrame extends JFrame{

    /**
     * 宽度
     */
    private static final int DEFAULT_WIDTH = 470;
    /**
     * 高度
     */
    private static final int DEFAULT_HEIGHT = 300;

    /**
     * 输入/出框的长度
     */
    private static final int INPUT_WIDTH = 10;

    /**
     * 输入/出框的高度
     */
    private static final int INPUT_HEIGHT = 1;


    /**
     * 输入的 年/月/日 时:分:秒
     */
    private JTextField inputDateTextArea = new JTextField("年-月-日 时:分:秒",13);

    /**
     * 输出的时间戳(10位)
     */
    private JTextField outputTimestampTextArea = new JTextField(13);

    /**
     * 输入的时间戳(10位)
     */
    private JTextField inputTimestampTextArea = new JTextField(13);

    /**
     * 输出的 年/月/日 时:分:秒
     */
    private JTextField outputDateTextArea = new JTextField("年-月-日 时:分:秒",13);

    private JPanel fatherPanel = new JPanel(new BorderLayout());
    /**
     * 时间 -----> 时间戳
     */
    private JPanel date2TimestampPanel = new JPanel();

    /**
     * 时间戳 -----> 时间
     */
    private JPanel timestamp2DatePanel = new JPanel();

    public TimeFrame(){

        styleFrame();


        date2TimestampPanel = buttonFrameFirst(date2TimestampPanel,"==>>1");

        JTextArea textAreaTemp = new JTextArea(3,100);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("第一个是 时间 ----> 时间戳");
        textAreaTemp.setText(stringBuffer.toString());
        textAreaTemp.setEditable(false);
        textAreaTemp.setFont(new Font("serif", Font.PLAIN, 20));
        fatherPanel.add(textAreaTemp, BorderLayout.NORTH);
        fatherPanel.add(date2TimestampPanel, BorderLayout.CENTER);

        timestamp2DatePanel = buttonFrameSecond(timestamp2DatePanel,"==>>2");

        fatherPanel.add(timestamp2DatePanel,BorderLayout.SOUTH);

        add(fatherPanel,BorderLayout.CENTER);

        JTextArea textAreaTemp2 = new JTextArea(3,100);
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("第二个是 时间戳 ----> 时间");
        textAreaTemp2.setText(stringBuffer2.toString());
        textAreaTemp2.setEditable(false);
        textAreaTemp2.setFont(new Font("serif", Font.PLAIN, 20));

        add(textAreaTemp2,BorderLayout.SOUTH);

    }

    /**
     * 添加样式和位置什么的
     * @return
     */
    private void styleFrame(){
        /**
         * 设置窗口的大小
         */
        setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
        /**
         * 设置窗口的名字
         */
        setTitle("站长工具之时间戳的转换");

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

        Image image = new ImageIcon("time.png").getImage();
        setIconImage(image);

        /**
         * 设置不可设置大小
         */
        setResizable(false);

    }

    /**
     * 添加按钮
     * @param buttonPanel
     * @param message
     * @return
     */
    private JPanel buttonFrameFirst(JPanel buttonPanel, String message){

        JButton md5Button = new JButton(message);
        inputDateTextArea.setFont(new Font("serif", Font.PLAIN, 20));
        buttonPanel.add(inputDateTextArea);
        buttonPanel.add(md5Button);
        outputTimestampTextArea.setFont(new Font("serif", Font.PLAIN, 20));
        outputTimestampTextArea.setEditable(false);
        buttonPanel.add(outputTimestampTextArea);

        // create button actions
        ColorAction md5Action   = new ColorAction(Color.green,1);

        // associate actions with buttons
        md5Button.addActionListener(md5Action);

        return buttonPanel;
    }

    /**
     * 添加按钮
     * @param buttonPanel
     * @param message
     * @return
     */
    private JPanel buttonFrameSecond(JPanel buttonPanel, String message){

        JButton md5Button = new JButton(message);
        inputTimestampTextArea.setFont(new Font("serif", Font.PLAIN, 20));
        buttonPanel.add(inputTimestampTextArea);
        buttonPanel.add(md5Button);
        outputDateTextArea.setFont(new Font("serif", Font.PLAIN, 20));
        outputDateTextArea.setEditable(false);
        buttonPanel.add(outputDateTextArea);

        // create button actions
        ColorAction md5Action   = new ColorAction(Color.GREEN,2);

        // associate actions with buttons
        md5Button.addActionListener(md5Action);

        return buttonPanel;
    }
    /**
     * An action listener that sets the panel's background color.
     */
    private class ColorAction implements ActionListener {

        private Color backgroundColor;
        private int info;

        public ColorAction(Color color, int info){
            this.backgroundColor = color;
            this.info = info;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            if (info == 1) {
                try {
                    Date date = sdf.parse(inputDateTextArea.getText());
                    outputTimestampTextArea.setBackground(this.backgroundColor);
                    outputTimestampTextArea.setText(date.getTime()/1000 + "");
                    inputDateTextArea.setForeground(Color.BLACK);
                }catch (Exception exception){
                    inputDateTextArea.setForeground(Color.RED);
                }

            }else {
                try {
                    inputTimestampTextArea.setForeground(this.backgroundColor);
                    Date date = new Date(Long.parseLong(inputTimestampTextArea.getText()) * 1000L);
                    outputDateTextArea.setText(sdf.format(date));
                    inputTimestampTextArea.setForeground(Color.BLACK);
                    outputDateTextArea.setBackground(this.backgroundColor);
                }catch (Exception exception){
                    inputTimestampTextArea.setForeground(Color.RED);
                }

            }
        }


    }

}
