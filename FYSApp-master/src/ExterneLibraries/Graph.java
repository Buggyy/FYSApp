package externelibraries;

import QueryManager.LuggageManager;
import java.awt.Dimension;
import java.awt.Paint;
import java.util.ArrayList;
import main.FYSApp;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

/**
 *
 * @author team 1 IS106
 */
public class Graph extends ApplicationFrame {

    private DefaultCategoryDataset dataset;
    private JFreeChart chart;

    /**
     *
     * @param windowTitle
     */
    public Graph(String windowTitle) {

        super(windowTitle);
        this.dataset = new DefaultCategoryDataset();
    }

    /**
     *
     * @param dateRange
     * @param list1
     * @param list2
     * @param list3
     * @param list4
     * @param listName1
     * @param listName2
     * @param listName3
     * @param listName4
     */
    public void addSeriesMonths(String dateType, int beginMonth,
            String[] dateRange, ArrayList<Integer> list1,
            ArrayList<Integer> list2, ArrayList<Integer> list3,
            ArrayList<Integer> list4, String listName1, String listName2,
            String listName3, String listName4) {

        LuggageManager luggageMgr = FYSApp.getLuggageManager();

        for (int i = 0; i < dateRange.length; i++) {

            list1.add(luggageMgr.FindNumberOfStatusByMonth(i + beginMonth,
                    listName1));
            list2.add(luggageMgr.FindNumberOfStatusByMonth(i + beginMonth,
                    listName2));
            list3.add(luggageMgr.FindNumberOfStatusByMonth(i + beginMonth,
                    listName3));
            list4.add(luggageMgr.FindNumberOfStatusByMonth(i + beginMonth,
                    listName4));
        }

        for (int i = 0; i < dateRange.length; i++) {

            this.dataset.addValue(list1.get(i), listName1, dateRange[i]);
            this.dataset.addValue(list2.get(i), listName2, dateRange[i]);
            this.dataset.addValue(list3.get(i), listName3, dateRange[i]);
            this.dataset.addValue(list4.get(i), listName4, dateRange[i]);
        }
    }

    public void addSeriesDays(String dateType, int beginMonth,
            String[] dateRange, ArrayList<Integer> list1,
            ArrayList<Integer> list2, ArrayList<Integer> list3,
            ArrayList<Integer> list4, String listName1, String listName2,
            String listName3, String listName4) {

        LuggageManager luggageMgr = FYSApp.getLuggageManager();

        for (int i = 0; i < dateRange.length; i++) {

            list1.add(luggageMgr.FindNumberOfStatusByDay(i, i + beginMonth,
                    listName1));
            list2.add(luggageMgr.FindNumberOfStatusByDay(i, i + beginMonth,
                    listName2));
            list3.add(luggageMgr.FindNumberOfStatusByDay(i, i + beginMonth,
                    listName3));
            list4.add(luggageMgr.FindNumberOfStatusByDay(i, i + beginMonth,
                    listName4));
        }

        for (int i = 0; i < dateRange.length; i++) {

            this.dataset.addValue(list1.get(i), listName1, dateRange[i]);
            this.dataset.addValue(list2.get(i), listName2, dateRange[i]);
            this.dataset.addValue(list3.get(i), listName3, dateRange[i]);
            this.dataset.addValue(list4.get(i), listName4, dateRange[i]);
        }
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
    public ChartPanel createChart(String title, String xAxisString,
            String yAxisString, int width, int height, Paint bgColor) {

        this.chart = ChartFactory.createLineChart(title, xAxisString,
                yAxisString, this.dataset, PlotOrientation.VERTICAL, true, true,
                false);

        chart.setBackgroundPaint(bgColor);
        ChartPanel chartPanel = new ChartPanel(this.chart);
        chartPanel.setPreferredSize(new Dimension(width, height));
        setContentPane(chartPanel);
        pack();

        return chartPanel;
    }
}
