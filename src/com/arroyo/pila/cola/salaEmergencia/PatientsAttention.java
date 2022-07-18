package com.arroyo.pila.cola.salaEmergencia;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class PatientsAttention {
    public static List<Patients> listOfPatients(){
        return Arrays.asList(
                new Patients("Juan",Gravity.MINOR),
                new Patients("Andres",Gravity.MODERATE),
                new Patients("Carlos",Gravity.SERVERE),
                new Patients("Felipe",Gravity.VERY_SERVERE),
                new Patients("Arroyo",Gravity.MINOR),
                new Patients("Caren",Gravity.MODERATE),
                new Patients("Moncho",Gravity.SERVERE),
                new Patients("Yirleza",Gravity.VERY_SERVERE)
        );
    }

    public static void main(String[] args) {
        Queue<Patients> attentionPriority = new PriorityQueue<>(listOfPatients());
        int numOfPatients = attentionPriority.size();

        for (int i=0; i<numOfPatients; i++){
            Patients attendingPatient = attentionPriority.poll();
            String patientName = attendingPatient.getNombre();
            String gravity = attendingPatient.getGravity().getDescripcion();
            System.out.println("Atendiendo al paciente " + patientName +
                    " con gravedad " + gravity);
        }
    }
}
