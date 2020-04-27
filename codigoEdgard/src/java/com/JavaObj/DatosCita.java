package com.JavaObj;

public class DatosCita {
    private int idPaciente;
    private String doctor;
    private String sintomas;
    private String alergiasMedicamentos;
    private String consumoDeMedicamentos;
    private String padecimientosPrevios;
    private String fechaCita;
    private String horaCita;
    private String seguro;
    private String formaDePago;
    private String nombrePaciente;
    private String apellidoPaciente;
    private int contactoNumero;
    private String correo;
    private String fechaNacimiento;
    
    public DatosCita(int p_idPaciente, String p_doctor, String p_sintomas, String p_alerMedicamentos, String p_consuMedicamentos, String p_padeciPrevios, String p_fechaCita, String p_horaCita, String p_seguro, String p_fomaDePago, String p_NombrePaciente, String p_apellidoPaciente, int p_contactoNumero, String p_correo, String p_fechaNacimiento)
    {
        setIdPaciente(p_idPaciente);
        setSintomas(p_sintomas);
        setAlergiasMedicamentos(p_alerMedicamentos);
        setConsumoMedic(p_consuMedicamentos);
        setPadecimientosPrevios(p_padeciPrevios);
        setFechaCita(p_fechaCita);
        setHoraCita(p_horaCita);
        setSeguro(p_seguro);
        setFormaDePago(p_fomaDePago);
        setDoctor(p_doctor);
        setApellidoPaciente(p_apellidoPaciente);
        setNombrePaciente(p_NombrePaciente);
        setNumeroDeContacto(p_contactoNumero);
        setCorreo(p_correo);
        setFechaNacimiento(p_fechaNacimiento);
        
    }
     
    private void setIdPaciente(int p_idPaciente)
    {
        idPaciente = p_idPaciente;
    }
    public int getIdPaciente()
    {
        return idPaciente;
    }
     private void setDoctor(String p_doctor)
    {
        doctor = p_doctor;
    }
    public String getDoctor()
    {
        return doctor;
    }
    private void setSintomas(String p_sintomas)
    {
        sintomas = p_sintomas;
    }
    public String getSintomas()
    {
        return sintomas;
    }
    private void setAlergiasMedicamentos(String p_alerMedicamentos)
    {
        alergiasMedicamentos = p_alerMedicamentos;
    }
    public String getAlerMedicamentos()
    {
        return alergiasMedicamentos;
    }
    private void setConsumoMedic(String p_consuMedicamentos)
    {
        consumoDeMedicamentos = p_consuMedicamentos;
    }
    public String getConsumoMedoc()
    {
        return consumoDeMedicamentos;
    }
    private void setPadecimientosPrevios(String p_padeciPrevios)
    {
        padecimientosPrevios = p_padeciPrevios;
    }
    public String getPadecimientosPrevios()
    {
        return padecimientosPrevios;
    }
    private void setFechaCita(String p_fechaCita)
    {
        fechaCita = p_fechaCita;
    }
    public String getFechaCita()
    {
        return fechaCita;
    }
    private void setHoraCita(String p_horaCita)
    {
        horaCita = p_horaCita;
    }
    public String getHoraCita()
    {
        return horaCita;
    }
    private void setSeguro(String p_seguro)
    {
        seguro = p_seguro;
    }
    public String getSeguro()
    {
        return seguro;
    }
    private void setFormaDePago(String p_fomaDePago)
    {
        formaDePago = p_fomaDePago;
    }
    public String getFormaDePAgo()
    {
        return formaDePago;
    }
    private void setNombrePaciente(String p_NombrePaciente)
    {
        nombrePaciente = p_NombrePaciente;
    }
    public String getNombrePaciente()
    {
        return nombrePaciente;
    }
    private void setApellidoPaciente(String p_ApellidoPaciente)
    {
        apellidoPaciente = p_ApellidoPaciente;
    }
    public String getApellidoPaciente()
    {
        return apellidoPaciente;
    }
    private void setNumeroDeContacto(int p_contactoNumero)
    {
        contactoNumero = p_contactoNumero;
    }
    public int getContactoNumero()
    {
        return contactoNumero;
    }
    private void setCorreo(String p_correo)
    {
        correo = p_correo;
    }
    public String getCorreo()
    {
        return correo;
    }
    private void setFechaNacimiento(String p_fechaNacimiento)
    {
        fechaNacimiento = p_fechaNacimiento;
    }
    public String getfechaNacimeinto()
    {
        return fechaNacimiento;
    }
}