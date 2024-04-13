
package com.project.GUI;

import java.awt.Color;

import javax.swing.JFrame;

import org.jfree.chart.*;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.labels.ItemLabelAnchor;
import org.jfree.chart.labels.ItemLabelPosition;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.ui.TextAnchor;

class BarChart {

        public static ChartPanel createChart(String TitleChart) {
                JFreeChart barChart = ChartFactory.createBarChart(
                                TitleChart,
                                "Năm", "VNĐ",
                                createDataset(), PlotOrientation.VERTICAL, false, false, false);
                // Lấy Renderer của biểu đồ để thiết lập nhãn giá trị
                BarRenderer renderer = (BarRenderer) barChart.getCategoryPlot().getRenderer();
                renderer.setBaseItemLabelsVisible(true); // Cho phép hiển thị nhãn giá trị
                renderer.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator()); // Sử dụng định dạng mặc
                                                                                              // định

                // Tạo một vị trí mới để hiển thị nhãn
                ItemLabelPosition position = new ItemLabelPosition(
                                ItemLabelAnchor.OUTSIDE12,
                                TextAnchor.TOP_CENTER,
                                TextAnchor.TOP_CENTER,
                                Math.PI * 2);

                // Thiết lập vị trí cho nhãn giá trị
                renderer.setBasePositiveItemLabelPosition(position);

                ChartPanel chartPanel = new ChartPanel(barChart);
                return chartPanel;
        }

        public static CategoryDataset createDataset() {
                final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
                dataset.addValue(68000000, "VNĐ", "1990");
                dataset.addValue(80000000, "VNĐ", "2000");
                dataset.addValue(88000000, "VNĐ", "2010");
                dataset.addValue(95000000, "VNĐ", "2020");
                dataset.addValue(95000000, "VNĐ", "2021");
                dataset.addValue(95000000, "VNĐ", "2022");
                dataset.addValue(95000000, "VNĐ", "2023");
                dataset.addValue(95000000, "VNĐ", "2024");
                return dataset;
        }

}

class PieChart {

        public ChartPanel createChart() {
                // Create the chart
                JFreeChart chart = ChartFactory.createPieChart(
                                "Fruit Distribution", // chart title
                                createDataset(), // data
                                true, // include legend
                                true,
                                false);

                // Customize the appearance
                chart.setBackgroundPaint(Color.WHITE);

                // Create a panel to display the chart
                ChartPanel chartPanel = new ChartPanel(chart);
                // chartPanel.setPreferredSize(new Dimension(400, 300));

                return chartPanel;

        }

        public DefaultPieDataset createDataset() {
                DefaultPieDataset dataset = new DefaultPieDataset();
                dataset.setValue("Apples", 50);
                dataset.setValue("Oranges", 30);
                dataset.setValue("Bananas", 20);

                return dataset;
        }
}

public class Statistical extends javax.swing.JPanel {

        /**
         * Creates new form Chart
         */
        public Statistical() {
                initComponents();
                BarChart barChart = new BarChart();
                PieChart pieChart = new PieChart();
                BoxChartOverView.add(barChart.createChart("Doanh thu và lợi nhuận 30 gần nhất"));
                BoxChartProduct1.add(barChart.createChart("Số lượng bán ra theo sản phẩm"));
                BoxChartProduct2.add(barChart.createChart("số lượng còn lại hiện tại"));
                ChartIngredient1.add(barChart.createChart("Nguyên liệu nhập 30 gần nhất"));
                ChartIngredient2.add(barChart.createChart("số lượng nguyên liệu còn lại"));
                TotalOrderByChartDayOfWeek.add(barChart.createChart("Tổng số đơn hàng theo các ngày trong tuần"));
                ChartRevnueByProduct.add(barChart.createChart("Doanh thu theo sản phẩm"));

                // BoxChartProduct.add(barChart.createChart("Số lượng sản phẩm đã bán theo sản
                // phẩm"));
                // BoxChartTotalGredient.add(barChart.createChart("Số lượng nguyên liệu tồn
                // kho"));
                // BoxChartTotalImportWarehouse.add(pieChart.createChart());
        }

        /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">
        private void initComponents() {

                TabbedPaneStatistical = new javax.swing.JTabbedPane();
                BoxOverview = new javax.swing.JPanel();
                BoxItem = new javax.swing.JPanel();
                ItemProfit = new javax.swing.JPanel();
                ProfitIcon = new javax.swing.JButton();
                jPanel5 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                ValueProfit = new javax.swing.JLabel();
                ItemProduct = new javax.swing.JPanel();
                ProductIcon = new javax.swing.JButton();
                jPanel9 = new javax.swing.JPanel();
                jLabel3 = new javax.swing.JLabel();
                ValueProduct = new javax.swing.JLabel();
                ItemOrder = new javax.swing.JPanel();
                IconOrder = new javax.swing.JButton();
                jPanel11 = new javax.swing.JPanel();
                jLabel5 = new javax.swing.JLabel();
                ValueOrder = new javax.swing.JLabel();
                jPanel22 = new javax.swing.JPanel();
                jButton7 = new javax.swing.JButton();
                jPanel23 = new javax.swing.JPanel();
                jLabel13 = new javax.swing.JLabel();
                ValueSupplier = new javax.swing.JLabel();
                jPanel24 = new javax.swing.JPanel();
                IconEmployee = new javax.swing.JButton();
                jPanel25 = new javax.swing.JPanel();
                jLabel15 = new javax.swing.JLabel();
                ValueEmployee = new javax.swing.JLabel();
                jPanel26 = new javax.swing.JPanel();
                IconIngredient = new javax.swing.JButton();
                jPanel27 = new javax.swing.JPanel();
                jLabel17 = new javax.swing.JLabel();
                ValueIngredient = new javax.swing.JLabel();
                BoxChartOverView = new javax.swing.JPanel();
                BoxRevenue = new javax.swing.JPanel();
                jPanel12 = new javax.swing.JPanel();
                ItemRevenue = new javax.swing.JPanel();
                IconRenvenue = new javax.swing.JButton();
                jPanel16 = new javax.swing.JPanel();
                jLabel9 = new javax.swing.JLabel();
                ValueRevenue = new javax.swing.JLabel();
                ItemTotalSellProduct = new javax.swing.JPanel();
                IconSellProduct = new javax.swing.JButton();
                jPanel18 = new javax.swing.JPanel();
                jLabel11 = new javax.swing.JLabel();
                ValueSellProduct = new javax.swing.JLabel();
                jPanel19 = new javax.swing.JPanel();
                TotalOrderByChartDayOfWeek = new javax.swing.JPanel();
                ChartRevnueByProduct = new javax.swing.JPanel();
                BoxProduct = new javax.swing.JPanel();
                jPanel13 = new javax.swing.JPanel();
                BoxBestSeller = new javax.swing.JPanel();
                IconProduct = new javax.swing.JButton();
                jPanel32 = new javax.swing.JPanel();
                jLabel23 = new javax.swing.JLabel();
                nameProduct = new javax.swing.JLabel();
                PriceProduct = new javax.swing.JLabel();
                BoxBestSeller1 = new javax.swing.JPanel();
                IconBestSell = new javax.swing.JButton();
                jPanel33 = new javax.swing.JPanel();
                jLabel24 = new javax.swing.JLabel();
                nameProductBestSell = new javax.swing.JLabel();
                PriceProductBestSell = new javax.swing.JLabel();
                jPanel38 = new javax.swing.JPanel();
                BoxChartProduct1 = new javax.swing.JPanel();
                BoxChartProduct2 = new javax.swing.JPanel();
                BoxProduct1 = new javax.swing.JPanel();
                jPanel35 = new javax.swing.JPanel();
                ChartIngredient1 = new javax.swing.JPanel();
                ChartIngredient2 = new javax.swing.JPanel();

                setMinimumSize(new java.awt.Dimension(1085, 768));
                setPreferredSize(new java.awt.Dimension(1085, 768));
                setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

                TabbedPaneStatistical.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
                TabbedPaneStatistical.setMinimumSize(new java.awt.Dimension(1085, 768));
                TabbedPaneStatistical.setPreferredSize(new java.awt.Dimension(1085, 768));

                BoxOverview.setLayout(new java.awt.BorderLayout());

                BoxItem.setMinimumSize(new java.awt.Dimension(1083, 100));
                BoxItem.setPreferredSize(new java.awt.Dimension(1400, 230));
                BoxItem.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 40, 10));

                ItemProfit.setBackground(new java.awt.Color(255, 255, 255));
                ItemProfit.setMinimumSize(new java.awt.Dimension(300, 100));
                ItemProfit.setPreferredSize(new java.awt.Dimension(300, 100));
                ItemProfit.setRequestFocusEnabled(false);
                ItemProfit.setLayout(new java.awt.BorderLayout());

                ProfitIcon.setIcon(new javax.swing.ImageIcon("./src/assets/icon/money-64.png")); // NOI18N
                ProfitIcon.setBorder(
                                javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(0, 0, 0)));
                ProfitIcon.setFocusPainted(false);
                ProfitIcon.setFocusable(false);
                ProfitIcon.setPreferredSize(new java.awt.Dimension(100, 22));
                ProfitIcon.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                ProfitIconActionPerformed(evt);
                        }
                });
                ItemProfit.add(ProfitIcon, java.awt.BorderLayout.LINE_END);

                jPanel5.setBackground(new java.awt.Color(255, 255, 255));
                jPanel5.setLayout(new java.awt.BorderLayout());

                jLabel1.setBackground(new java.awt.Color(255, 255, 255));
                jLabel1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
                jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel1.setText("Tổng lợi nhuận");
                jLabel1.setIconTextGap(20);
                jLabel1.setPreferredSize(new java.awt.Dimension(37, 35));
                jPanel5.add(jLabel1, java.awt.BorderLayout.PAGE_START);

                ValueProfit.setBackground(new java.awt.Color(255, 255, 255));
                ValueProfit.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
                ValueProfit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                ValueProfit.setText("0 VNĐ");
                ValueProfit.setFocusable(false);
                ValueProfit.setIconTextGap(0);
                jPanel5.add(ValueProfit, java.awt.BorderLayout.CENTER);

                ItemProfit.add(jPanel5, java.awt.BorderLayout.CENTER);

                BoxItem.add(ItemProfit);

                ItemProduct.setBackground(new java.awt.Color(255, 255, 255));
                ItemProduct.setMinimumSize(new java.awt.Dimension(300, 100));
                ItemProduct.setPreferredSize(new java.awt.Dimension(300, 100));
                ItemProduct.setLayout(new java.awt.BorderLayout());

                ProductIcon.setIcon(new javax.swing.ImageIcon("./src/assets/icon/products-64.png")); // NOI18N
                ProductIcon.setBorder(
                                javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(0, 0, 0)));
                ProductIcon.setFocusPainted(false);
                ProductIcon.setFocusable(false);
                ProductIcon.setPreferredSize(new java.awt.Dimension(100, 22));
                ItemProduct.add(ProductIcon, java.awt.BorderLayout.LINE_END);

                jPanel9.setBackground(new java.awt.Color(255, 255, 255));
                jPanel9.setLayout(new java.awt.BorderLayout());

                jLabel3.setBackground(new java.awt.Color(255, 255, 255));
                jLabel3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
                jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel3.setText("Tổng sản phẩm");
                jLabel3.setIconTextGap(20);
                jLabel3.setPreferredSize(new java.awt.Dimension(37, 35));
                jPanel9.add(jLabel3, java.awt.BorderLayout.PAGE_START);

                ValueProduct.setBackground(new java.awt.Color(255, 255, 255));
                ValueProduct.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
                ValueProduct.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                ValueProduct.setText("0 VNĐ");
                ValueProduct.setFocusable(false);
                ValueProduct.setIconTextGap(0);
                jPanel9.add(ValueProduct, java.awt.BorderLayout.CENTER);

                ItemProduct.add(jPanel9, java.awt.BorderLayout.CENTER);

                BoxItem.add(ItemProduct);

                ItemOrder.setBackground(new java.awt.Color(255, 255, 255));
                ItemOrder.setMinimumSize(new java.awt.Dimension(300, 100));
                ItemOrder.setPreferredSize(new java.awt.Dimension(300, 100));
                ItemOrder.setLayout(new java.awt.BorderLayout());

                IconOrder.setIcon(new javax.swing.ImageIcon("./src/assets/icon/bill-64.png")); // NOI18N
                IconOrder.setBorder(
                                javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(0, 0, 0)));
                IconOrder.setFocusPainted(false);
                IconOrder.setFocusable(false);
                IconOrder.setPreferredSize(new java.awt.Dimension(100, 22));
                ItemOrder.add(IconOrder, java.awt.BorderLayout.LINE_END);

                jPanel11.setBackground(new java.awt.Color(255, 255, 255));
                jPanel11.setLayout(new java.awt.BorderLayout());

                jLabel5.setBackground(new java.awt.Color(255, 255, 255));
                jLabel5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
                jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel5.setText("Tổng số đơn hàng");
                jLabel5.setIconTextGap(20);
                jLabel5.setPreferredSize(new java.awt.Dimension(37, 35));
                jPanel11.add(jLabel5, java.awt.BorderLayout.PAGE_START);

                ValueOrder.setBackground(new java.awt.Color(255, 255, 255));
                ValueOrder.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
                ValueOrder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                ValueOrder.setText("0 VNĐ");
                ValueOrder.setFocusable(false);
                ValueOrder.setIconTextGap(0);
                jPanel11.add(ValueOrder, java.awt.BorderLayout.CENTER);

                ItemOrder.add(jPanel11, java.awt.BorderLayout.CENTER);

                BoxItem.add(ItemOrder);

                jPanel22.setBackground(new java.awt.Color(255, 255, 255));
                jPanel22.setMinimumSize(new java.awt.Dimension(300, 100));
                jPanel22.setPreferredSize(new java.awt.Dimension(300, 100));
                jPanel22.setLayout(new java.awt.BorderLayout());

                jButton7.setIcon(new javax.swing.ImageIcon("./src/assets/icon/supplier-64.png")); // NOI18N
                jButton7.setBorder(
                                javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(0, 0, 0)));
                jButton7.setFocusPainted(false);
                jButton7.setFocusable(false);
                jButton7.setPreferredSize(new java.awt.Dimension(100, 22));
                jPanel22.add(jButton7, java.awt.BorderLayout.LINE_END);

                jPanel23.setBackground(new java.awt.Color(255, 255, 255));
                jPanel23.setLayout(new java.awt.BorderLayout());

                jLabel13.setBackground(new java.awt.Color(255, 255, 255));
                jLabel13.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
                jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel13.setText("Tổng số nhà cung cấp");
                jLabel13.setIconTextGap(20);
                jLabel13.setPreferredSize(new java.awt.Dimension(37, 35));
                jPanel23.add(jLabel13, java.awt.BorderLayout.PAGE_START);

                ValueSupplier.setBackground(new java.awt.Color(255, 255, 255));
                ValueSupplier.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
                ValueSupplier.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                ValueSupplier.setText("0 VNĐ");
                ValueSupplier.setFocusable(false);
                ValueSupplier.setIconTextGap(0);
                jPanel23.add(ValueSupplier, java.awt.BorderLayout.CENTER);

                jPanel22.add(jPanel23, java.awt.BorderLayout.CENTER);

                BoxItem.add(jPanel22);

                jPanel24.setBackground(new java.awt.Color(255, 255, 255));
                jPanel24.setMinimumSize(new java.awt.Dimension(300, 100));
                jPanel24.setPreferredSize(new java.awt.Dimension(300, 100));
                jPanel24.setLayout(new java.awt.BorderLayout());

                IconEmployee.setIcon(new javax.swing.ImageIcon("./src/assets/icon/employee-64.png")); // NOI18N
                IconEmployee.setBorder(
                                javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(0, 0, 0)));
                IconEmployee.setFocusPainted(false);
                IconEmployee.setFocusable(false);
                IconEmployee.setPreferredSize(new java.awt.Dimension(100, 22));
                jPanel24.add(IconEmployee, java.awt.BorderLayout.LINE_END);

                jPanel25.setBackground(new java.awt.Color(255, 255, 255));
                jPanel25.setLayout(new java.awt.BorderLayout());

                jLabel15.setBackground(new java.awt.Color(255, 255, 255));
                jLabel15.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
                jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel15.setText("Tổng số nhân viên");
                jLabel15.setIconTextGap(20);
                jLabel15.setPreferredSize(new java.awt.Dimension(37, 35));
                jPanel25.add(jLabel15, java.awt.BorderLayout.PAGE_START);

                ValueEmployee.setBackground(new java.awt.Color(255, 255, 255));
                ValueEmployee.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
                ValueEmployee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                ValueEmployee.setText("0 VNĐ");
                ValueEmployee.setFocusable(false);
                ValueEmployee.setIconTextGap(0);
                jPanel25.add(ValueEmployee, java.awt.BorderLayout.CENTER);

                jPanel24.add(jPanel25, java.awt.BorderLayout.CENTER);

                BoxItem.add(jPanel24);

                jPanel26.setBackground(new java.awt.Color(255, 255, 255));
                jPanel26.setMinimumSize(new java.awt.Dimension(300, 100));
                jPanel26.setPreferredSize(new java.awt.Dimension(300, 100));
                jPanel26.setLayout(new java.awt.BorderLayout());

                IconIngredient.setIcon(new javax.swing.ImageIcon("./src/assets/icon/flour.png")); // NOI18N
                IconIngredient.setBorder(
                                javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(0, 0, 0)));
                IconIngredient.setFocusPainted(false);
                IconIngredient.setFocusable(false);
                IconIngredient.setPreferredSize(new java.awt.Dimension(100, 22));
                jPanel26.add(IconIngredient, java.awt.BorderLayout.LINE_END);

                jPanel27.setBackground(new java.awt.Color(255, 255, 255));
                jPanel27.setLayout(new java.awt.BorderLayout());

                jLabel17.setBackground(new java.awt.Color(255, 255, 255));
                jLabel17.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
                jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel17.setText("Tổng số loại nguyên liệu");
                jLabel17.setIconTextGap(20);
                jLabel17.setPreferredSize(new java.awt.Dimension(37, 35));
                jPanel27.add(jLabel17, java.awt.BorderLayout.PAGE_START);

                ValueIngredient.setBackground(new java.awt.Color(255, 255, 255));
                ValueIngredient.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
                ValueIngredient.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                ValueIngredient.setText("0 VNĐ");
                ValueIngredient.setFocusable(false);
                ValueIngredient.setIconTextGap(0);
                jPanel27.add(ValueIngredient, java.awt.BorderLayout.CENTER);

                jPanel26.add(jPanel27, java.awt.BorderLayout.CENTER);

                BoxItem.add(jPanel26);

                BoxOverview.add(BoxItem, java.awt.BorderLayout.PAGE_START);

                BoxChartOverView.setBackground(new java.awt.Color(255, 255, 255));
                BoxChartOverView.setFocusable(false);
                BoxChartOverView.setOpaque(false);
                BoxChartOverView.setLayout(
                                new javax.swing.BoxLayout(BoxChartOverView, javax.swing.BoxLayout.LINE_AXIS));
                BoxOverview.add(BoxChartOverView, java.awt.BorderLayout.CENTER);

                TabbedPaneStatistical.addTab("Tổng quan", BoxOverview);

                BoxRevenue.setLayout(new java.awt.BorderLayout());

                jPanel12.setMinimumSize(new java.awt.Dimension(1083, 100));
                jPanel12.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 40, 5));

                ItemRevenue.setBackground(new java.awt.Color(255, 255, 255));
                ItemRevenue.setMinimumSize(new java.awt.Dimension(300, 100));
                ItemRevenue.setPreferredSize(new java.awt.Dimension(300, 100));
                ItemRevenue.setLayout(new java.awt.BorderLayout());

                IconRenvenue.setIcon(new javax.swing.ImageIcon("./src/assets/icon/money-total.png")); // NOI18N
                IconRenvenue.setBorder(
                                javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(0, 0, 0)));
                IconRenvenue.setFocusPainted(false);
                IconRenvenue.setFocusable(false);
                IconRenvenue.setPreferredSize(new java.awt.Dimension(100, 22));
                ItemRevenue.add(IconRenvenue, java.awt.BorderLayout.LINE_END);

                jPanel16.setBackground(new java.awt.Color(255, 255, 255));
                jPanel16.setLayout(new java.awt.BorderLayout());

                jLabel9.setBackground(new java.awt.Color(255, 255, 255));
                jLabel9.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
                jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel9.setText("Tổng doanh thu bán hàng");
                jLabel9.setIconTextGap(20);
                jLabel9.setPreferredSize(new java.awt.Dimension(37, 35));
                jPanel16.add(jLabel9, java.awt.BorderLayout.PAGE_START);

                ValueRevenue.setBackground(new java.awt.Color(255, 255, 255));
                ValueRevenue.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
                ValueRevenue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                ValueRevenue.setText("0 VNĐ");
                ValueRevenue.setFocusable(false);
                ValueRevenue.setIconTextGap(0);
                jPanel16.add(ValueRevenue, java.awt.BorderLayout.CENTER);

                ItemRevenue.add(jPanel16, java.awt.BorderLayout.CENTER);

                jPanel12.add(ItemRevenue);

                ItemTotalSellProduct.setBackground(new java.awt.Color(255, 255, 255));
                ItemTotalSellProduct.setMinimumSize(new java.awt.Dimension(300, 100));
                ItemTotalSellProduct.setPreferredSize(new java.awt.Dimension(300, 100));
                ItemTotalSellProduct.setLayout(new java.awt.BorderLayout());

                IconSellProduct.setIcon(new javax.swing.ImageIcon("./src/assets/icon/trade.png")); // NOI18N
                IconSellProduct.setBorder(
                                javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(0, 0, 0)));
                IconSellProduct.setFocusPainted(false);
                IconSellProduct.setFocusable(false);
                IconSellProduct.setPreferredSize(new java.awt.Dimension(100, 22));
                ItemTotalSellProduct.add(IconSellProduct, java.awt.BorderLayout.LINE_END);

                jPanel18.setBackground(new java.awt.Color(255, 255, 255));
                jPanel18.setLayout(new java.awt.BorderLayout());

                jLabel11.setBackground(new java.awt.Color(255, 255, 255));
                jLabel11.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
                jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel11.setText("Tổng số sản phẩm bán ra");
                jLabel11.setIconTextGap(20);
                jLabel11.setPreferredSize(new java.awt.Dimension(37, 35));
                jPanel18.add(jLabel11, java.awt.BorderLayout.PAGE_START);

                ValueSellProduct.setBackground(new java.awt.Color(255, 255, 255));
                ValueSellProduct.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
                ValueSellProduct.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                ValueSellProduct.setText("0 VNĐ");
                ValueSellProduct.setFocusable(false);
                ValueSellProduct.setIconTextGap(0);
                jPanel18.add(ValueSellProduct, java.awt.BorderLayout.CENTER);

                ItemTotalSellProduct.add(jPanel18, java.awt.BorderLayout.CENTER);

                jPanel12.add(ItemTotalSellProduct);

                BoxRevenue.add(jPanel12, java.awt.BorderLayout.PAGE_START);

                jPanel19.setFocusable(false);
                jPanel19.setOpaque(false);
                jPanel19.setLayout(new java.awt.GridLayout(2, 0, 0, 10));

                TotalOrderByChartDayOfWeek.setLayout(
                                new javax.swing.BoxLayout(TotalOrderByChartDayOfWeek, javax.swing.BoxLayout.LINE_AXIS));
                jPanel19.add(TotalOrderByChartDayOfWeek);

                ChartRevnueByProduct.setLayout(
                                new javax.swing.BoxLayout(ChartRevnueByProduct, javax.swing.BoxLayout.LINE_AXIS));
                jPanel19.add(ChartRevnueByProduct);

                BoxRevenue.add(jPanel19, java.awt.BorderLayout.CENTER);

                TabbedPaneStatistical.addTab("Doanh thu", BoxRevenue);

                BoxProduct.setLayout(new java.awt.BorderLayout());

                jPanel13.setMinimumSize(new java.awt.Dimension(1083, 100));
                jPanel13.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 40, 5));

                BoxBestSeller.setBackground(new java.awt.Color(255, 255, 255));
                BoxBestSeller.setMinimumSize(new java.awt.Dimension(300, 100));
                BoxBestSeller.setPreferredSize(new java.awt.Dimension(320, 100));
                BoxBestSeller.setLayout(new java.awt.BorderLayout());

                IconProduct.setIcon(new javax.swing.ImageIcon("./src/assets/icon/best-product-64.png")); // NOI18N
                IconProduct.setBorder(
                                javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(0, 0, 0)));
                IconProduct.setFocusPainted(false);
                IconProduct.setFocusable(false);
                IconProduct.setPreferredSize(new java.awt.Dimension(100, 22));
                BoxBestSeller.add(IconProduct, java.awt.BorderLayout.LINE_END);

                jPanel32.setBackground(new java.awt.Color(255, 255, 255));
                jPanel32.setLayout(new java.awt.BorderLayout());

                jLabel23.setBackground(new java.awt.Color(255, 255, 255));
                jLabel23.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
                jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel23.setText("Sản phẩm bán chạy nhất");
                jLabel23.setIconTextGap(20);
                jLabel23.setPreferredSize(new java.awt.Dimension(37, 35));
                jPanel32.add(jLabel23, java.awt.BorderLayout.PAGE_START);

                nameProduct.setBackground(new java.awt.Color(255, 255, 255));
                nameProduct.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
                nameProduct.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                nameProduct.setText("0 VNĐ");
                nameProduct.setFocusable(false);
                nameProduct.setIconTextGap(0);
                jPanel32.add(nameProduct, java.awt.BorderLayout.CENTER);

                PriceProduct.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
                PriceProduct.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                PriceProduct.setText("jLabel2");
                PriceProduct.setPreferredSize(new java.awt.Dimension(46, 25));
                jPanel32.add(PriceProduct, java.awt.BorderLayout.PAGE_END);

                BoxBestSeller.add(jPanel32, java.awt.BorderLayout.CENTER);

                jPanel13.add(BoxBestSeller);

                BoxBestSeller1.setBackground(new java.awt.Color(255, 255, 255));
                BoxBestSeller1.setMinimumSize(new java.awt.Dimension(300, 100));
                BoxBestSeller1.setPreferredSize(new java.awt.Dimension(320, 100));
                BoxBestSeller1.setLayout(new java.awt.BorderLayout());

                IconBestSell.setIcon(new javax.swing.ImageIcon("./src/assets/icon/products-64.png")); // NOI18N
                IconBestSell.setBorder(
                                javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(0, 0, 0)));
                IconBestSell.setFocusPainted(false);
                IconBestSell.setFocusable(false);
                IconBestSell.setPreferredSize(new java.awt.Dimension(100, 22));
                BoxBestSeller1.add(IconBestSell, java.awt.BorderLayout.LINE_END);

                jPanel33.setBackground(new java.awt.Color(255, 255, 255));
                jPanel33.setLayout(new java.awt.BorderLayout());

                jLabel24.setBackground(new java.awt.Color(255, 255, 255));
                jLabel24.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
                jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel24.setText("Sản phẩm doanh thu cao nhất");
                jLabel24.setIconTextGap(20);
                jLabel24.setPreferredSize(new java.awt.Dimension(37, 35));
                jPanel33.add(jLabel24, java.awt.BorderLayout.PAGE_START);

                nameProductBestSell.setBackground(new java.awt.Color(255, 255, 255));
                nameProductBestSell.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
                nameProductBestSell.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                nameProductBestSell.setText("0 VNĐ");
                nameProductBestSell.setFocusable(false);
                nameProductBestSell.setIconTextGap(0);
                jPanel33.add(nameProductBestSell, java.awt.BorderLayout.CENTER);

                PriceProductBestSell.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
                PriceProductBestSell.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                PriceProductBestSell.setText("jLabel2");
                PriceProductBestSell.setPreferredSize(new java.awt.Dimension(46, 25));
                jPanel33.add(PriceProductBestSell, java.awt.BorderLayout.PAGE_END);

                BoxBestSeller1.add(jPanel33, java.awt.BorderLayout.CENTER);

                jPanel13.add(BoxBestSeller1);

                BoxProduct.add(jPanel13, java.awt.BorderLayout.PAGE_START);

                jPanel38.setFocusable(false);
                jPanel38.setOpaque(false);
                jPanel38.setLayout(new java.awt.GridLayout(2, 0, 0, 10));

                BoxChartProduct1.setLayout(
                                new javax.swing.BoxLayout(BoxChartProduct1, javax.swing.BoxLayout.LINE_AXIS));
                jPanel38.add(BoxChartProduct1);

                BoxChartProduct2.setLayout(
                                new javax.swing.BoxLayout(BoxChartProduct2, javax.swing.BoxLayout.LINE_AXIS));
                jPanel38.add(BoxChartProduct2);

                BoxProduct.add(jPanel38, java.awt.BorderLayout.CENTER);

                TabbedPaneStatistical.addTab("Sản phẩm", BoxProduct);

                BoxProduct1.setLayout(new java.awt.BorderLayout());

                jPanel35.setFocusable(false);
                jPanel35.setOpaque(false);
                jPanel35.setLayout(new java.awt.GridLayout(2, 0, 0, 10));

                ChartIngredient1.setLayout(
                                new javax.swing.BoxLayout(ChartIngredient1, javax.swing.BoxLayout.LINE_AXIS));
                jPanel35.add(ChartIngredient1);

                ChartIngredient2.setLayout(
                                new javax.swing.BoxLayout(ChartIngredient2, javax.swing.BoxLayout.LINE_AXIS));
                jPanel35.add(ChartIngredient2);

                BoxProduct1.add(jPanel35, java.awt.BorderLayout.CENTER);

                TabbedPaneStatistical.addTab(" Kho", BoxProduct1);

                add(TabbedPaneStatistical);
        }// </editor-fold>

        private void ProfitIconActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here:
        }

        // Variables declaration - do not modify
        private javax.swing.JPanel BoxBestSeller;
        private javax.swing.JPanel BoxBestSeller1;
        private javax.swing.JPanel BoxChartOverView;
        private javax.swing.JPanel BoxChartProduct1;
        private javax.swing.JPanel BoxChartProduct2;
        private javax.swing.JPanel BoxItem;
        private javax.swing.JPanel BoxOverview;
        private javax.swing.JPanel BoxProduct;
        private javax.swing.JPanel BoxProduct1;
        private javax.swing.JPanel BoxRevenue;
        private javax.swing.JPanel ChartIngredient1;
        private javax.swing.JPanel ChartIngredient2;
        private javax.swing.JPanel ChartRevnueByProduct;
        private javax.swing.JButton IconBestSell;
        private javax.swing.JButton IconEmployee;
        private javax.swing.JButton IconIngredient;
        private javax.swing.JButton IconOrder;
        private javax.swing.JButton IconProduct;
        private javax.swing.JButton IconRenvenue;
        private javax.swing.JButton IconSellProduct;
        private javax.swing.JPanel ItemOrder;
        private javax.swing.JPanel ItemProduct;
        private javax.swing.JPanel ItemProfit;
        private javax.swing.JPanel ItemRevenue;
        private javax.swing.JPanel ItemTotalSellProduct;
        private javax.swing.JLabel PriceProduct;
        private javax.swing.JLabel PriceProductBestSell;
        private javax.swing.JButton ProductIcon;
        private javax.swing.JButton ProfitIcon;
        private javax.swing.JTabbedPane TabbedPaneStatistical;
        private javax.swing.JPanel TotalOrderByChartDayOfWeek;
        private javax.swing.JLabel ValueEmployee;
        private javax.swing.JLabel ValueIngredient;
        private javax.swing.JLabel ValueOrder;
        private javax.swing.JLabel ValueProduct;
        private javax.swing.JLabel ValueProfit;
        private javax.swing.JLabel ValueRevenue;
        private javax.swing.JLabel ValueSellProduct;
        private javax.swing.JLabel ValueSupplier;
        private javax.swing.JButton jButton7;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel11;
        private javax.swing.JLabel jLabel13;
        private javax.swing.JLabel jLabel15;
        private javax.swing.JLabel jLabel17;
        private javax.swing.JLabel jLabel23;
        private javax.swing.JLabel jLabel24;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel9;
        private javax.swing.JPanel jPanel11;
        private javax.swing.JPanel jPanel12;
        private javax.swing.JPanel jPanel13;
        private javax.swing.JPanel jPanel16;
        private javax.swing.JPanel jPanel18;
        private javax.swing.JPanel jPanel19;
        private javax.swing.JPanel jPanel22;
        private javax.swing.JPanel jPanel23;
        private javax.swing.JPanel jPanel24;
        private javax.swing.JPanel jPanel25;
        private javax.swing.JPanel jPanel26;
        private javax.swing.JPanel jPanel27;
        private javax.swing.JPanel jPanel32;
        private javax.swing.JPanel jPanel33;
        private javax.swing.JPanel jPanel35;
        private javax.swing.JPanel jPanel38;
        private javax.swing.JPanel jPanel5;
        private javax.swing.JPanel jPanel9;
        private javax.swing.JLabel nameProduct;
        private javax.swing.JLabel nameProductBestSell;
        // End of variables declaration
}
