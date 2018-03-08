package backend.Containers.HandlerMapper;

public class Mapping {
    private String handle;
    private Class clazz;

    public Mapping() {
    }

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    public Class getClazz() {
        return clazz;
    }

    public void setClazz(Class clazz) {
        this.clazz = clazz;
    }
}
