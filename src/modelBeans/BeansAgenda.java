
package modelBeans;

import java.util.Date;

/**
 *
 * @author Belmiro-Mungoi
 */
public class BeansAgenda {
    private int agendaCod;
    private String nomePac;
    private String nomeMed;
    private String turno;
    private String motivo;
    private Date data;
    private String status;
    private String pacNasc;

    public String getPacNasc() {
        return pacNasc;
    }

    public void setPacNasc(String pacNasc) {
        this.pacNasc = pacNasc;
    }

    public int getAgendaCod() {
        return agendaCod;
    }

    public void setAgendaCod(int agendaCod) {
        this.agendaCod = agendaCod;
    }

    public String getNomePac() {
        return nomePac;
    }

    public void setNomePac(String nomePac) {
        this.nomePac = nomePac;
    }

    public String getNomeMed() {
        return nomeMed;
    }

    public void setNomeMed(String nomeMed) {
        this.nomeMed = nomeMed;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
