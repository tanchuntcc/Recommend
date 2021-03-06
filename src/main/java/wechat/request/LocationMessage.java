package wechat.request;

/**
 * Created by magenta9 on 2017/3/5.
 */
public class LocationMessage extends BaseMessage {

    private String Location_X;  //地理位置纬度
    private String Location_Y;  //地理位置经度
    private String Scale;       //地图缩放大小
    private String Label;       //d地理位置信息

    public String getLocation_X() {
        return Location_X;
    }

    public void setLocation_X(String location_X) {
        Location_X = location_X;
    }

    public String getLocation_Y() {
        return Location_Y;
    }

    public void setLocation_Y(String location_Y) {
        Location_Y = location_Y;
    }

    public String getScale() {
        return Scale;
    }

    public void setScale(String scale) {
        Scale = scale;
    }

    public String getLabel() {
        return Label;
    }

    public void setLabel(String label) {
        Label = label;
    }
}
