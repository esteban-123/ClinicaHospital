/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clinicahospital.models;

import com.mycompany.clinicahospital.models.Hospital;

/**
 *
 * @author ESTUDIANTE
 */
public class ClinicaHospital {

    public static void main(String[] args) {
        
        Hospital hospital = new Hospital("Clinica Santa Maria", "Cartagena");

        Medico medico1 = new Medico("Cardiologia", "TP123", "Carlos Perez", 45, "123");
        medico1.setTelefono("3001234567");
        medico1.setConsultorio(101);

        Medico medico2 = new Medico("Pediatria", "TP456", "Ana Gomez", 38, "456");
        medico2.setTelefono("3007654321");
        medico2.setConsultorio(202);

        Consulta c1 = new Consulta("2026-03-30", "Dolor de pecho", "Posible angina");
        c1.setDuracionMinutos(30);

        Consulta c2 = new Consulta("2026-03-29", "Fiebre", "Infeccion viral");
        c2.setDuracionMinutos(20);

        Consulta c3 = new Consulta("2026-03-28", "Dolor abdominal", "Gastritis");
        c3.setDuracionMinutos(25);

        //registrar consultas en el hospital
        hospital.registrarConsulta(c1);
        hospital.registrarConsulta(c2);
        hospital.registrarConsulta(c3);

        //‍ Médicos atienden consultas
        medico1.atender(c1);
        medico2.atender(c2);
        medico1.atender(c3);

        // resultados
        System.out.println("\n--- HOSPITAL ---");
        System.out.println(hospital);

        System.out.println("\n--- MEDICOS ---");
        System.out.println(medico1);
        System.out.println(medico2);

        System.out.println("\n--- CONSULTAS ---");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        
        
        
    }
    
    
}
