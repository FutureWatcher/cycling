package bike.cycling.model;

/**
 * 地点组件
 */

import com.sun.istack.internal.NotNull;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Created by DELL on 2017/4/25.
 */
@Embeddable
public class Place {
    @NotNull
    protected String placeName;//地点名称

    @NotNull
    protected  String longitude;//经度

    @NotNull
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
