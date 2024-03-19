import javax.swing.*;
import java.awt.*;

class VerticalFlowLayoutExample extends JFrame {
    public VerticalFlowLayoutExample() {
        super("Vertical FlowLayout Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);

        // Tạo một JPanel với FlowLayout và thêm một số thành phần vào
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10)); // Canh giữa, khoảng cách 10px
        for (int i = 0; i < 10; i++) {
            panel.add(new JButton("Button " + (i + 1)));
        }

        // Tạo một JScrollPane và đặt panel vào bên trong nó
        JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS); // Hiển thị thanh cuộn theo y

        // Đặt JScrollPane vào JFrame
        getContentPane().add(scrollPane);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new VerticalFlowLayoutExample());
    }
}
