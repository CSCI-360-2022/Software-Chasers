package com.scticketing.ticketingwebsite.event;


import com.scticketing.ticketingwebsite.user.User;
import com.scticketing.ticketingwebsite.user.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class EventConfig {

//public Event(String foreGroundImageUrl,
//                 String backGroundImageUrl,
//                 int capacity, LocalDate startTime,
//                 String eventName,
//                 String eventDetails,
//                 double price) {
    @Bean
    CommandLineRunner eventCommandLineRunner(EventRepository repository){
        return args -> {
            ///public Event(String foreGroundImageUrl,
            //                 String backGroundImageUrl,
            //                 int capacity, LocalDate startTime,
            //                 String eventName,
            //                 String eventDetails,
            //                 double price) {
            Event basketball = new Event("https://i.imgur.com/p3PadEn.jpg",
                                        "https://i.imgur.com/AZTGv3N.png",
                                        10, LocalDate.now(),
                                        "Basketball",
                                        "Enjoy a classic women's basketball game at 7 PM vs. Coastal Carolina!\n" +
                                                "      Tickets are $10 and are open to all CofC Students and Families\n" +
                                                "        (NO ALCOHOL PERMITTED)\n" +
                                                "           The College of Charleston is not liable or\n" +
                                                "        responsible for any activities or events\n" +
                                                "        hosted by student organizations. The College\n" +
                                                "        views student organizations as private\n" +
                                                "        affiliations and does not endorse the\n" +
                                                "        mission, goals, or purpose of the organization.",
                                        10.00,
                                        "TD Arena");

            Event soccer = new Event("https://i.imgur.com/Rrljyr1.png",
                    "https://i.imgur.com/N6YFzCB.png",
                    10, LocalDate.now(),
                    "Soccer",
                    "Details here",
                    10.00,
                    "Hampton Park");

            Event singing = new Event("https://w7.pngwing.com/pngs/570/441/png-transparent-gray-and-black-condenser-microphone-microphone-karaoke-bar-night-singing-karaoke-light-fixture-electronics-nightlife-thumbnail.png",
                    "https://i.imgur.com/MmsVNO9.png",
                    10, LocalDate.now(),
                    "Karaoke",
                    "Details here",
                    10.00,
                    "TD Arena");
            Event dancing = new Event("https://i.imgur.com/KnJGSMk.png",
                    "https://4.bp.blogspot.com/-PAnHadogbCs/Xyqqs7Z8AwI/AAAAAAAAA8E/lqCuIcT8_TA7rRkDj0c_W8hY6EQyY4VRQCNcBGAsYHQ/w217/garena-free-fire-skin-dancing-uhdpaper.com-4K-3.2428-wp.thumbnail.jpg",
                    10, LocalDate.now(),
                    "Cougar Dance",
                    "Details here",
                    10.00,
                    "TD Arena");
            repository.saveAll(
                    List.of(basketball, soccer, singing, dancing)
            );
        };
    }

}
