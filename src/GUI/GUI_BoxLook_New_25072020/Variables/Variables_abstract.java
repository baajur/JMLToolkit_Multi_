package GUI.GUI_BoxLook_New_25072020.Variables;

public abstract class Variables_abstract extends Variables_declare_abstract {
    public void initializeGlobalVariables(Variables aVariables){
        this.dataSetDirectory = aVariables.dataSetDirectory;
        this.shapeletDirectory = aVariables.shapeletDirectory;
        this.dataSet = aVariables.dataSet;
        this.dataset_withCurrentLabel = aVariables.dataset_withCurrentLabel;
        this.Shapelet_toAllTS_distances = aVariables.Shapelet_toAllTS_distances;
        this.TSDataInstance = aVariables.TSDataInstance;
        this.TSDataInstance_bottomChart = aVariables.TSDataInstance_bottomChart;
        this.aTSLook = aVariables.aTSLook;
        this.aShapeletLook = aVariables.aShapeletLook;
        this.minMaxTimeSeriesDataset = aVariables.minMaxTimeSeriesDataset;
        this.minMaxShapeletDataset = aVariables.minMaxShapeletDataset;
        this.Shapelet_double = aVariables.Shapelet_double;
        this.Shapelet_withCurrentLabel = aVariables.Shapelet_withCurrentLabel;
        this.Shapelet_weight = aVariables.Shapelet_weight;
        this.currentShapelet = aVariables.currentShapelet;
        this.Shapelet_labelArrayList = aVariables.Shapelet_labelArrayList;
        this.Shapelet_labelCountArrayList = aVariables.Shapelet_labelCountArrayList;
        this.TS_labelArryList = aVariables.TS_labelArryList;
        this.centerChart = aVariables.centerChart;
        this.topRightChart = aVariables.topRightChart;
        this.bottomChart = aVariables.bottomChart;
        this.multiCharts = aVariables.multiCharts;
        this.TSMark_centerChart = aVariables.TSMark_centerChart;
        this.TSMark_bottomChart = aVariables.TSMark_bottomChart;
        this.TSTrace = aVariables.TSTrace;
        this.interpolatedTSMark_centerChart = aVariables.interpolatedTSMark_centerChart;
        this.interpolatedTimeSeriesTrace = aVariables.interpolatedTimeSeriesTrace;
        this.Shapelet_mark_centerChart = aVariables.Shapelet_mark_centerChart;
        this.Shapelet_mark_topRightChart = aVariables.Shapelet_mark_topRightChart;
        this.Shapelet_trace_centerChart = aVariables.Shapelet_trace_centerChart;
        this.Shapelet_trace_topRightChart = aVariables.Shapelet_trace_topRightChart;
        this.initializeTS = aVariables.initializeTS;
        this.load_Shapelet_YesOrNo = aVariables.load_Shapelet_YesOrNo;
        this.setting_TS_listModal = aVariables.setting_TS_listModal;
        this.firstTSDrawing = aVariables.firstTSDrawing;
        this.firstTSDrawing_linePlot = aVariables.firstTSDrawing_linePlot;
        this.stackModelOn = aVariables.stackModelOn;
        this.switchDot = aVariables.switchDot;
        this.centerChartXL = aVariables.centerChartXL;
        this.centerChartXR = aVariables.centerChartXR;
        this.centerChartYU = aVariables.centerChartYU;
        this.centerChartYD = aVariables.centerChartYD;
        this.oldScale = aVariables.oldScale;
        this.NewScale = aVariables.NewScale;
        this.centerChartWidth = aVariables.centerChartWidth;
        this.Shapelet_container = aVariables.Shapelet_container;
        this.globalStartPosition = aVariables.globalStartPosition;
        this.globalBestMatchSP = aVariables.globalBestMatchSP;
        this.globalBestMatchEP = aVariables.globalBestMatchEP;
        this.lastTSIndex = aVariables.lastTSIndex;
        this.lastShapeletIndex = aVariables.lastShapeletIndex;
        this.root = aVariables.root;
        this.shapeletSubroot = aVariables.shapeletSubroot;
    }
}
