
package modelo;

public class vehiculo {
    
    private String placa;
    private String fechaI;
    private String horasI;
    private String fechaS;
    private String horasS;
    private String horas;
    private String valorP;
    

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getFechaI() {
        return fechaI;
    }

    public void setFechaI(String fechaI) {
        this.fechaI = fechaI;
    }

    public String getHorasI() {
        return horasI;
    }

    public void setHorasI(String horasI) {
        this.horasI = horasI;
    }

    public String getHorasS() {
        return horasS;
    }

    public void setHorasS(String horasS) {
        this.horasS = horasS;
    }

   

    public String getValorP() {
        return valorP;
    }

    public void setValorP(String valorP) {
        this.valorP = valorP;
    }

    public String getFechaS() {
        return fechaS;
    }

    public void setFechaS(String fechaS) {
        this.fechaS = fechaS;
    }

    public vehiculo() {
    }

    public vehiculo(String placa, String fechaI, String horasI, String fechaS, String horasS, String horas, String valorP) {
        this.placa = placa;
        this.fechaI = fechaI;
        this.horasI = horasI;
        this.fechaS = fechaS;
        this.horasS = horasS;
        this.horas = horas;
        this.valorP = valorP;
    }

    @Override
    public String toString() {
        return "vehiculo{" + "placa=" + placa + ", fechaI=" + fechaI + ", horasI=" + horasI + ", fechaS=" + fechaS + ", horasS=" + horasS + ", horas=" + horas + ", valorP=" + valorP + '}';
    }

   
    
   
   
    
    
  
    
}
