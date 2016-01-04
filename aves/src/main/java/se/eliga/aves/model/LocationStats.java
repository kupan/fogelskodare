package se.eliga.aves.model;

/**
 * Created by vagrant on 9/25/15.
 */
public class LocationStats {

    private String dyntaxaTaxonId;
    private String areaId;
    private String locality;
    private int count;

    public String getDyntaxaTaxonId() {
        return dyntaxaTaxonId;
    }

    public void setDyntaxaTaxonId(String dyntaxaTaxonId) {
        this.dyntaxaTaxonId = dyntaxaTaxonId;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
