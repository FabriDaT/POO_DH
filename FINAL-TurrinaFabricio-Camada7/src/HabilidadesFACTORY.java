public class HabilidadesFACTORY {
    private static HabilidadesFACTORY instancia;
    public static final String HABILIDAD_SIMPLE="HS";
    public static final String HABILIDAD_COMBINADA="HC";
    private HabilidadesFACTORY(){}

    public static HabilidadesFACTORY getInstancia()
    {
        if (instancia==null)
            instancia= new HabilidadesFACTORY();
        return instancia;
    }
    public Habilidades crearHabilidades(String tipo, String nombre, String descripcion)
    {
        switch (tipo)
        {
            case "HS":
                return new Simple(nombre,descripcion);
            case "HC":
                return new Combinada(nombre,descripcion);
        }
        throw new RuntimeException();
    }
}
