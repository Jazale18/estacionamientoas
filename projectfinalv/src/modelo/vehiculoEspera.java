
package modelo;

public class vehiculoEspera {
    
    private String placa;
    private String horaLlegada;
    private String horaSalida;

    public vehiculoEspera() {
    }

    public vehiculoEspera(String placa, String horaLlegada, String horaSalida) {
        this.placa = placa;
        this.horaLlegada = horaLlegada;
        this.horaSalida = horaSalida;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(String horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    @Override
    public String toString() {
        return "vehiculoEspera{" + "placa=" + placa + ", horaLlegada=" + horaLlegada + ", horaSalida=" + horaSalida + '}';
    }
    
    
    
}
