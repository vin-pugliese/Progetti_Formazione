package deposito_contenitori;

public class L extends C {

    private String name;
    private int qta;

    public L(){}

    public L(String id_code, Toxic_index index, String name, int qta) {
        super(id_code, index);
        this.name = name;
        this.qta = qta;
    }

    public L(String id_code, String name, int qta) {
        super(id_code);
        this.name = name;
        this.qta = qta;
    }

    //-------------------------------------------confronta
    @Override
    public boolean confronta(C x) {
        if (x.equals(null)) return false;
        if ((x instanceof L) && (this.qta > ((L) x).getQta())) return true;

        return false;
    }

    //-------------------------------------------toString
    @Override
    public String toString() {
        return super.toString() +"L{" +
                "name='" + name + '\'' +
                ", qta=" + qta +
                '}';
    }

    //-------------------------------------------Getters & Setters
    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    /**
     *
     * @param qta
     */
    public void setQta(int qta) {
        this.qta = qta;
    }
    public int getQta() {
        return qta;
    }



}
