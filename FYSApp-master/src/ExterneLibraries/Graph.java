package externelibraries;

import java.awt.Dimension;
import java.awt.Paint;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

/**
 *
 * @author team 1
 */
public class Graph extends ApplicationFrame {

    private DefaultCategoryDataset dataset;
    private JFreeChart chart;

    public Graph(String windowTitle) {
        super(windowTitle);
        this.dataset = new DefaultCategoryDataset();
    }

    /**
     * Adds values of an array to the dataset
     *
     * @param rowValue Array containing the values (one per column)
     * @param seriesName Name of the series
     * @param colName Names of the columns
     */
    public void addSeries(int[] rowValue, String seriesName, String[] colName) {

        for (int i = 0; i < rowValue.length; i++) {
            this.dataset.addValue(rowValue[i], seriesName, colName[i]);
        }

// See http://www.java2s.com/Code/Java/Chart/JFreeChartLineChartDemo1.htm
        // See http://www.java2s.com/Code/Java/Chart/CatalogChart.htm
        // See http://www.jfree.org/jfreechart/api/javadoc/index.html?overview-summary.html
        // TODO 1: add series to dataset
        // hier komt de code van opracht 5
    }

    /**
     * Creates a chart.
     *
     * @param title Title of the Chart
     * @param xAxisString Title of the x Axis
     * @param yAxisString Title of the y Axis
     * @param width width of the graph
     * @param height height of the graph
     * @param bgColor background color of the graph
     */
    public void createChart(String title, String xAxisString, String yAxisString, int width, int height, Paint bgColor) {

        this.chart = ChartFactory.createLineChart(title, xAxisString, yAxisString, this.dataset,
                PlotOrientation.VERTICAL, true, true, false);
        chart.setBackgroundPaint(bgColor);
        ChartPanel chartPanel = new ChartPanel(this.chart);
        chartPanel.setPreferredSize(new Dimension(width, height));
        setContentPane(chartPanel);
        pack();
        RefineryUtilities.centerFrameOnScreen(this);

// See http://www.java2s.com/Code/Java/Chart/JFreeChartLineChartDemo1.htm
        // See http://www.java2s.com/Code/Java/Chart/CatalogChart.htm
        // See http://www.jfree.org/jfreechart/api/javadoc/index.html?overview-summary.html
        // TODO 2: create chart (this can be a line chart or a stacked bar chart)
        // hier komt de code van opdracht 6
    }

    /**
     * Changes thickness of series line
     *
     * @param seriesIndex index of series
     * @param thickness thickness of line
     */
    public void setSeriesThickness(int seriesIndex, int thickness) {
        // See http://www.jfree.org/jfreechart/api/javadoc/org/jfree/chart/renderer/category/CategoryItemRenderer.html
        // TODO 3: minor changes: change thickness of series
        // hint a: use chart.getPlot() to get the CategoryPlot.
        // hint b: then use plot.getRenderer to get the CategoryItemRenderer
        // hint c: then use the correct method of the renderer

        // hier komt de code van opdracht 7
    }

    /**
     * Changes color of series
     *
     * @param seriesIndex index of series
     * @param color the chosen color
     */
    public void setSeriesColor(int seriesIndex, Paint color) {
        // See http://www.jfree.org/jfreechart/api/javadoc/org/jfree/chart/renderer/category/CategoryItemRenderer.html
        // TODO 4: minor changes: change color of series
        // hint a: use chart.getPlot() to get the CategoryPlot.
        // hint b: then use plot.getRenderer to get the CategoryItemRenderer
        // hint c: then use the correct method of the renderer

        // hier komt de code van opdracht 8
    }

    /**
     * Changes colors of the plot
     *
     * @param bgColor the wanted background color
     * @param gridlineColor the color if the horizontal grid lines
     */
    public void setGraphBackgroundColors(Paint bgColor, Paint gridlineColor) {
        // See http://www.jfree.org/jfreechart/api/javadoc/org/jfree/chart/plot/CategoryPlot.html
        // TODO 5: minor changes: change background color of the plot
        // hint a: use chart.getPlot() to get the CategoryPlot.
        // hint b: then use the correct methods of the plot

        // hier komt de code van opdracht 9
    }
}
