import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.io.File;
import java.io.FileInputStream;

public class Image_Operation {

    public static void operate(int key)
    {
        JFileChooser fileChooser=new JFileChooser();
        fileChooser.showOpenDialog(null);
        File file= fileChooser.getSelectedFile();
        //file InputInputStream
        try {

            FileInputStream fis=new FileInputStream(file);
            byte []data=new byte[fis.available()];
            fis.read(data);
            for(byte b:data)
            {
                System.out.println(b);
            }


        }catch (Exception e)
        {
            e.printStackTrace();
        }

    }


    public static void main(String[] args) {
        System.out.println("This is testing");

        JFrame f=new JFrame();
        f.setTitle("Image Operation");
        f.setSize(400,400);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font font=new Font("Roboto",Font.BOLD,25);
        //creating button
        JButton button=new JButton();
        button.setText("Open Image");
        button.setFont(font);



        // creating text field

        JTextField textField=new JTextField(10);
        textField.setFont(font);

        button.addActionListener(e->{
            System.out.println("button clicked");
            String text=textField.getText();
            int temp=Integer.parseInt(text);
            operate(temp);
        });

        f.setLayout(new FlowLayout());

        f.add(button);
        f.add(textField);
        f.setVisible(true);

    }
}
