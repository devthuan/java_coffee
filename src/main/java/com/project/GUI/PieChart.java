package com.project.GUI;

import org.jfree.chart.*;

import java.awt.Color;

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

class PieChart {

    public static ChartPanel createChart() {
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

    public static DefaultPieDataset createDataset() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Apples", 50);
        dataset.setValue("Oranges", 30);
        dataset.setValue("Bananas", 20);

        return dataset;
    }
}