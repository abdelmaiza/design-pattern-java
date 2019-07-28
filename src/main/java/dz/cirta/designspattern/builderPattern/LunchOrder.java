package dz.cirta.designspattern.builderPattern;

public class LunchOrder {
    public static class LunchBuilder {
        private String bread;
        private String condiments;
        private String dressing;
        private String meat;

        public LunchBuilder() {
        }

        public LunchOrder build(){
            return new LunchOrder(this);
        }

        public LunchBuilder bread(String bread) {
            this.bread = bread;
            return this;
        }

        public LunchBuilder condiments(String condiments) {
            this.condiments = condiments;
            return this;
        }

        public LunchBuilder dressing(String dressing) {
            this.dressing = dressing;
            return this;
        }

        public LunchBuilder meat(String meat) {
            this.meat = meat;
            return this;
        }
    }

    private String bread;
    private String condiments;
    private String dressing;
    private String meat;

    public LunchOrder(LunchBuilder lunchBuilder) {
        this.bread = lunchBuilder.bread;
        this.condiments = lunchBuilder.condiments;
        this.dressing = lunchBuilder.dressing;
        this.meat = lunchBuilder.meat;
    }

    public String getBread() {
        return bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }
}
