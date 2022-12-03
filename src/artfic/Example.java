package artfic;


public class Example  {

    private Double color;
    private Double hardness;
    private Integer month;
    private Integer catagory;

    public Example(Double color, Double hardness, Integer month, Integer catagory) {
        this.color = color;
        this.hardness = hardness;
        this.month = month;
        this.catagory = catagory;
    }

    public Example(Double color, Double hardness, Integer month) {
        this.color = color;
        this.hardness = hardness;
        this.month = month;
    }

    public Double getColor() {
        return color;
    }

    public void setColor(Double color) {
        this.color = color;
    }

    public Double getHardness() {
        return hardness;
    }

    public void setHardness(Double hardness) {
        this.hardness = hardness;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getCatagory() {
        return catagory;
    }

    public void setCatagory(Integer catagory) {
        this.catagory = catagory;
    }

}
