

import demain.Advertisement;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AdvertisementService {

    public Advertisement getAdvertisement() {
        Advertisement advertisement = new Advertisement(1L, "Pardod māju", "Pārdod lielu māju", "Jānis");
        return advertisement;
    }

    public ArrayList<Advertisement> getAdvertisementList() {
        ArrayList<Advertisement> advertisements = new ArrayList<>();
        Advertisement advertisement = new Advertisement(1L, "Pardod māju", "Pārdod lielu māju", "Jānis");


        advertisements.add(advertisement);

        return advertisements;
    }
    public Advertisement AdvertisementService(){
        Advertisement advertisementservise = new Advertisement(1L, "V", "I","T","A","L","I","J","S");
        return advertisementservise;
    }
    
    public void getAdvertisementService(){
        AdvertisementService();
        for(int i = advertisementservise.lenght - 1; i >= 0 ; i--) {
            System.out.println(advertisementservice[i]);
        }
    }
    public void getname(){
        AdvertisementService();
        
       
    }
        
    
}