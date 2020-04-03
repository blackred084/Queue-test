import java.util.Comparator;

public class Compare implements Comparator<Patient> {

    @Override
    public int compare(Patient o1, Patient o2) {
       //Kowalski potem stopien 4 potem (3,2,1)*jakZly malejąco
        String nazwa="Kowalski";
        if(o1.getSurname().equals(nazwa)&&o2.getSurname().equals(nazwa))
            return 0;
        else if(o2.getSurname().equals(nazwa)||o1.getSurname().equals(nazwa))
            if(o1.getSurname().equals(nazwa))
            return -1;
            else
                return 1;
        else if(o1.getDisase()==Choroba.RAK)
            return -1;
        else if(o2.getDisase()==Choroba.RAK)
        return 1;
        else if((o1.getDisase().getZarazliwosc()*o1.getHow_Angry())>(o2.getDisase().getZarazliwosc()*o2.getHow_Angry())) {
            return -1;
        } else
            return 1;

    }
}
