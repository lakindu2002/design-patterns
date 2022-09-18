package builder;

public abstract class Vehicle {
    private String tyres;
    private String engine;
    private String chassy;
    private String outerFramework;

    public String getTyres() {
        return tyres;
    }

    public void setTyres(String tyres) {
        this.tyres = tyres;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getChassy() {
        return chassy;
    }

    public void setChassy(String chassy) {
        this.chassy = chassy;
    }

    public String getOuterFramework() {
        return outerFramework;
    }

    public void setOuterFramework(String outerFramework) {
        this.outerFramework = outerFramework;
    }
}
