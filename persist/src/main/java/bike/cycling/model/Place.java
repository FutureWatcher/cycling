package bike.cycling.model;

/**
 * 地点组件
 */

/**
 * Created by DELL on 2017/4/25.
 */
public class Place {
    protected String placeName;//地点名称
    protected  String longitude;//经度
    protected String dimension;//纬度

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }
}
