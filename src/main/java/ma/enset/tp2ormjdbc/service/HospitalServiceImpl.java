package ma.enset.tp2ormjdbc.service;

import jakarta.transaction.Transactional;
import ma.enset.tp2ormjdbc.entities.Consultation;
import ma.enset.tp2ormjdbc.entities.Medecin;
import ma.enset.tp2ormjdbc.entities.Patient;
import ma.enset.tp2ormjdbc.entities.RendezVous;
import ma.enset.tp2ormjdbc.repositories.ConsultationRepository;
import ma.enset.tp2ormjdbc.repositories.MedecinRepository;
import ma.enset.tp2ormjdbc.repositories.PatientRepository;
import ma.enset.tp2ormjdbc.repositories.RendezVousRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class HospitalServiceImpl implements IHospitalService {
    private PatientRepository patientRepository;
    private MedecinRepository medecinRepository;
    private RendezVousRepository rendezVousRepository;
    private ConsultationRepository consultationRepository;

    public HospitalServiceImpl(PatientRepository patientRepository, MedecinRepository medecinRepository, RendezVousRepository rendezVousRepository, ConsultationRepository consultationRepository) {
        this.patientRepository = patientRepository;
        this.medecinRepository = medecinRepository;
        this.rendezVousRepository = rendezVousRepository;
        this.consultationRepository = consultationRepository;
    }

    @Override
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public List<Patient> getAllPatient() {
        return patientRepository.findAll();
    }

    @Override
    public Patient findPatientByNom(String name) {
        return patientRepository.findByNom(name);
    }

    @Override
    public Patient findPatientById(Long id) {
        return patientRepository.findById(id).orElse(null);
    }

    @Override
    public void deletePatient(Patient patient) {
        patientRepository.delete(patient);
    }

    @Override
    public Medecin saveMedcine(Medecin medecin) {
        return medecinRepository.save(medecin);
    }

    @Override
    public List<Medecin> getAllMedecin() {
        return medecinRepository.findAll();
    }

    @Override
    public Medecin findMedecinByNom(String name) {
        return medecinRepository.findByNom(name);
    }

    @Override
    public void deleteMedecin(Medecin medecin) {
        medecinRepository.delete(medecin);
    }

    @Override
    public RendezVous saveRendezVous(RendezVous rendezVous) {
        rendezVous.setId(UUID.randomUUID().toString());
        return rendezVousRepository.save(rendezVous);
    }

    @Override
    public List<RendezVous> getAllRendezVous() {
        return rendezVousRepository.findAll();
    }

    @Override
    public void deleteRendezVous(RendezVous rendezVous) {
        rendezVousRepository.delete(rendezVous);
    }

    @Override
    public Consultation saveConsultation(Consultation consultation) {
        return consultationRepository.save(consultation);
    }

    @Override
    public List<Consultation> getAllConsultation() {
        return consultationRepository.findAll();
    }

    @Override
    public void deleteConsultation(Consultation consultation) {
        consultationRepository.delete(consultation);
    }
}
