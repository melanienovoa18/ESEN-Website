package com.Logics;

import balcorpfw.database.DatabaseX;
import balcorpfw.logic.Logic;
import com.JavaObj.DatosCita;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CitaLogic extends Logic
{
    public List<DatosCita> getAllCitasInfo(int p_idUser)
    {
        ArrayList<DatosCita> listaCitas = null;
        DatabaseX database = getDatabase();
         int idPaciente =0;
         String nombrePaciente="";
         String apellidoPaciente="";
         int numeroContacto = 0 ;
         String correo ="" ;
         String fechaNacimiento ="" ;
         
        ResultSet DResult = database.executeQuery("SELECT * FROM registromedicodb.pacientes where idpacientes = "+p_idUser+";");
        if(DResult != null){
            
               
                
            try {
                while(DResult.next())
                {
                    idPaciente = DResult.getInt("idpacientes");
                    nombrePaciente = DResult.getString("nombres");
                    apellidoPaciente = DResult.getString("apellidos");
                    numeroContacto = DResult.getInt("numeroContacto");
                    correo = DResult.getString("correo");
                    fechaNacimiento = DResult.getString("fechaNacimiento");
                }
            } catch (SQLException ex) {
                Logger.getLogger(CitaLogic.class.getName()).log(Level.SEVERE, null, ex);
            }
         }       
        
        
        ResultSet CResult = database.executeQuery("SELECT * FROM registromedicodb.citas where idPaciente = "+p_idUser+";");
    
        
        if(CResult != null)
        {
            try {
                
                String nombreDoctor;
                String fechaCita;
                String sintomas;
                String alergias;
                String medicamentosConsumo;
                String padecimientosPrevios;
                String seguro;
                String formaDePago;
                String horaCita;
                
                DatosCita TDatos;
                listaCitas = new ArrayList<>();
                
                while(CResult.next())
                {
                   
                    nombreDoctor = CResult.getString("doctor");
                    fechaCita = CResult.getString("fechaCita");
                    sintomas = CResult.getString("sintomas");
                    alergias = CResult.getString("alergiasmedicamentos");
                    medicamentosConsumo = CResult.getString("consumodemedicamentos");
                    padecimientosPrevios = CResult.getString("padecimientosPrevios");
                    seguro = CResult.getString("seguro");
                    formaDePago = CResult.getString("formaDePago");
                    horaCita = CResult.getString("horaCita");
                    
                    TDatos = new DatosCita(idPaciente, nombreDoctor, sintomas, alergias, medicamentosConsumo, padecimientosPrevios, fechaCita, horaCita, seguro, formaDePago, nombrePaciente, apellidoPaciente, numeroContacto, correo, fechaNacimiento);
                    listaCitas.add(TDatos);
                }
            } catch (SQLException ex) {
                Logger.getLogger(CitaLogic.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return listaCitas;
    }
}
