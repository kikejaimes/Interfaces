public abstract class Vehiculo {  //como si fuera una superclase por eso el abstract
    protected int id;
    protected String tipo;
    protected String marca;

    protected abstract void transporteEnTierra();
    protected abstract void transporteEnAgua();
    protected abstract void transporteEnAire();



}
