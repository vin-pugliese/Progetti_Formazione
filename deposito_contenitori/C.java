package deposito_contenitori;

enum Toxic_index{
    LOW, MEDIUM, HIGH
}

public abstract class C implements CMP, TI {

    private String id_code;
    private Toxic_index index;


    public C(){}

    public C(String id_code, Toxic_index index) {
        this.id_code = id_code;
        this.index = index;
    }

    public C(String id_code) {
        this.id_code = id_code;
    }

    public abstract String getName();

    @Override
    public String toString() {
        return "C{" +
                "id_code='" + id_code + '\'' +
                ", index=" + index +
                '}';
    }


    //Getters & Setters
    /**
     *
     * @param id_code
     */
    public void setId_code(String id_code) {
        this.id_code = id_code;
    }

    public String getId_code() {
        return id_code;
    }

    /**
     *
     * @param index
     */
    public void setIndex(Toxic_index index) {
        this.index = index;
    }
    public Toxic_index getIndex(){
        return index;
    }

    @Override
    public boolean toxic(C y){
        if(this.getIndex().equals(y.getIndex())) {
            System.out.println("I liquidi hanno eguale tossicità");
            return false;
        }
        if(this.getIndex().equals(Toxic_index.LOW)){
            System.out.println("Liquido 2 è più tossico");
            return true;
        }

        if((this.getIndex().equals(Toxic_index.MEDIUM)) && ((y.getIndex().equals(Toxic_index.HIGH)))) {
            System.out.println("Liquido 2 è più tossico");
            return true;
        }
        else {
            System.out.println("Liquido 1 è più tossico");
            return false;
        }
    }



}
