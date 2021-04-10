package Data_czas;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DC_Exercises {
    public void aktualnyCzas (){
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime czas = LocalTime.now();
        System.out.println(timeFormatter.format(czas));
    }

    public void aktualnaData (){
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate data = LocalDate.now();
        System.out.println(dateFormatter.format(data));
    }

    public void aktualnaDataGodzina (){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        LocalDateTime dataCzas = LocalDateTime.now();
        System.out.println(dateTimeFormatter.format(dataCzas));
    }

    /*
Utwórz obiekt typu LocalDate przechowujący datę 01.01.2017 oraz obiekt typu
LocalDate przechowujący datę 05.05.2017. Wykorzystując obiekt typu Period
Wyświetl ile czasu minęło pomiędzy datami.
     */

    public void dateDifference(){
        //należy pamiętać że standardowo należy podać datę zaczynając od roku i odzielając ją średnikiem
        LocalDate data1 = LocalDate.parse("2017-01-01");
        LocalDate data2 = LocalDate.parse("2017-05-05");
        Period difference = Period.between(data2,data1);
        System.out.println("Pomiędzy datą "+data1+" a datą "+data2+" minęło:");
        System.out.println(difference);

    }

    /*
Utwórz obiekt typu LocalTime przechowujący godzinę 14:11 oraz obiekt typu
LocalTime przechowujący godzinę 18:41. Wykorzystując klasę Duration oblicz ile
czasu upłynęło pomiędzy godzinami.
     */

    public void timeDifference(){
        LocalTime czas1 = LocalTime.parse("14:11");
        LocalTime czas2 = LocalTime.parse("18:41");
        Duration difference = Duration.between(czas2,czas1);
        System.out.println("Pomiędzy godziną "+czas1+" a godziną "+czas2+" minęło:");
        System.out.println(difference);
    }

    public void timeInTokyo(){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm");
        ZonedDateTime tokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));

        System.out.println("Aktualny czas w Tokyo: "+dateTimeFormatter.format(tokyo));
    }

    /*
Wyświetla bieżącą godzinę w Bydgoszczy. Wykorzystaj DateTimeFormatter aby
wyświetlić datę w następującym formacie
3 lutego 2018 roku, sobota 22:12:27
     */

    public void timeInBydgoszcz(){
        ZonedDateTime bydgoszcz = ZonedDateTime.now(ZoneId.of("Europe/Warsaw"));
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("d MMMM yyyy 'roku,' EEEE HH:mm");
        System.out.println("Aktualny czas w Bydgoszczy: "+dateTimeFormatter.format(bydgoszcz));
    }

}
