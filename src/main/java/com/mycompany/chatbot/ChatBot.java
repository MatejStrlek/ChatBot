 
package com.mycompany.chatbot;
import java.util.Scanner;
import java.util.Random;
import java.io.IOException;

/**
 *
 * @author Matej Galic
 */
public class ChatBot {
    public static void main(String []args){
        
        Scanner s = new Scanner(System.in);
        
        String ime;
        String odabir;
        
        System.out.println("Ucitavanje Chatbota...");
        
        loading();
        
        pozdrav();
       
        ime = s.nextLine();
        
        System.out.print("\n");
        System.out.println("Ahaaa, " + ime + ", ocemo li odigrati neku igru?\n");
        System.out.println("Ako zelis, upisi DA, a ako ne upisi NE.\n");
        
        odabir = s.nextLine();
        
        if(odabir.equals("DA") || odabir.equals("da") || odabir.equals("Da")){
            System.out.print("\n");
            System.out.println("Odlicno, ajmo se zabavit!\n");     
            odabirIgre();
        }else{
            System.out.print("\n--------------------------------------------------------------------------\n");
            System.out.println("O nee, mozda drugi put!\n");
            gasi();
        }     
} 
    
    static void loading(){
        
        try {
        Thread.sleep(500);
    } 
        catch (InterruptedException e) {}
        
        System.out.println("Ucitavanje Chatbota...5%");
            
        try {
        Thread.sleep(1000);
    } 
        catch (InterruptedException e) {}
        
        //pokusaj cleara
        System.out.flush();
        
        System.out.println("Ucitavanje Chatbota...15%");
               
        try {
        Thread.sleep(600);
    } 
        catch (InterruptedException e) {}
        
        //pokusaj cleara
        System.out.flush();
        
        System.out.println("Ucitavanje Chatbota...45%");
        
        try {
        Thread.sleep(250);
    } 
        catch (InterruptedException e) {}
        
        //pokusaj cleara
        System.out.flush();
        
        System.out.println("Ucitavanje Chatbota...80%");
        
        try {
        Thread.sleep(200);
    } 
        catch (InterruptedException e) {}
        
        //pokusaj cleara
        System.out.flush();
        
        System.out.println("Ucitavanje Chatbota...99%");
        
        try {
        Thread.sleep(1500);    
    } 
        catch (InterruptedException e) {}
        
        System.out.println("CHatbot ucitan, uzivajte!");
         
    }
    
    static void pozdrav(){
        System.out.println("Pozdraaaav korisnice, mogu li znati tvoje ime...");
    }
    
    static void odabirIgre(){    
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Zelis li cuti nekakav vic, ili bi radje igrao pogadjanje broja od 1 do 100?\n");
        System.out.println("VIC - 1\nPOGADJANJE BROJA - 2\nKVIZ O JAVI - 3");
        
        int igra = s.nextInt();
        
        if(igra == 1){
           vic();
           System.out.print("\n--------------------------------------------------------------------------\n");
        }else if(igra == 2){
            pogadjanjeBroja();
            System.out.print("\n--------------------------------------------------------------------------\n");
        }else if(igra == 3){
            kvizJava();
            System.out.print("\n--------------------------------------------------------------------------\n");
        }else{
            System.out.println("Pogresan upis!");
            System.out.print("\n--------------------------------------------------------------------------\n");
            odabirIgre();
            System.out.print("\n\n");
        }
        
    }
    
    static void odabirJelOcesPonovoBrojeve(){
        
        String upis;
        Scanner tipk = new Scanner(System.in);
    
        System.out.println("Zelite li jos jednom odigrati pogadjanje?");
        System.out.println("Ako zelite upisite DA, ako ne zelite upisite NE.");
            
        upis = tipk.nextLine();
        
        System.out.print("\n--------------------------------------------------------------------------\n");
            
            if(upis.equals("DA") || upis.equals("Da") || upis.equals("da")){
                pogadjanjeBroja();
            }else if(upis.equals("NE") || upis.equals("Ne") || upis.equals("ne")){
                odabir();
            }else{
               System.out.println("Pogresan upis!\nAjde onda jos jednom pogadjaj, zabavno jee, bar meni...");
               System.out.print("\n--------------------------------------------------------------------------\n");
               pogadjanjeBroja();
               System.out.print("\n\n"); 
            }
        
}
    
    static void odabirJelOcesPonovoVic(){
        
        String upis;
        Scanner tipk = new Scanner(System.in);
    
        System.out.println("Zelite li cuti jos jedan vic?");
        System.out.println("Ako zelite upisite DA, ako ne zelite upisite NE.");
            
        upis = tipk.nextLine();
        
        System.out.print("\n--------------------------------------------------------------------------\n");
            
            if(upis.equals("DA") || upis.equals("Da") || upis.equals("da")){
                vic();
            }else if(upis.equals("NE") || upis.equals("ne") || upis.equals("Ne")){
                odabir();
            }else{
                System.out.println("Pogresan upis!\nEvo jedan dobar svejedno haha!");
                System.out.print("\n--------------------------------------------------------------------------\n");
                vic();
                System.out.print("\n\n");
            }
            
    }
    
    static void odabirJelOcesPonovoKviz(){
        
        String upis;
        Scanner tipk = new Scanner(System.in);
    
        System.out.println("Zelite li ponoviti kviz?");
        System.out.println("Ako zelite upisite DA, ako ne zelite upisite NE.");
            
        upis = tipk.nextLine();
        
        System.out.print("\n--------------------------------------------------------------------------\n");
            
            if(upis.equals("DA") || upis.equals("Da") || upis.equals("da")){
                kvizJava();
            }else if(upis.equals("NE") || upis.equals("ne") || upis.equals("Ne")){
                odabir();
            }else{
                System.out.println("Pogresan upis!\nEvo kad vec neznas napisat da ili ne ponovi kviz!");
                System.out.print("\n--------------------------------------------------------------------------\n");
                kvizJava();
                System.out.print("\n\n");
            }
    }
    
    static void gasi(){
        System.out.println("Uredu, uzivajte pa se cujemo neki drugi put ;)");
        System.exit(0);
    }
    
    static void vic(){
        
        Scanner tipk = new Scanner(System.in);
        Random generator = new Random();
        
        String randomString;
        String upis;
        
        String[] vicevi = {
            
            "Bako, opet vi? Pa juče smo vas spasili od trovanja gljivama, što vam je danas?\nMa isto sine, ostalo od juče pa reko' da se ne baci.",
        
            "Zovem prijatelja i pitam ga kako je i što radi. Kaže:\nRadim na vodeno termičkom tretmanu keramike, aluminija i čelika pod otežanim okolnostima.\nKasnije saznam da je prao suđe toplom vodom pod nadzorom žene.",
        
            "Susjed, jel možeš za večeras da mi posudiš svoju bušilicu?\nNaravno, što planiraš raditi?\nPlaniram spavati!",
        
            "Pokaže žena mužu svoje dlanove pa kaže:\nVidiš dragi, ovo su žuljevi od metle.\nA što da ti kažem draga, drugi put idi pješke.",
        
            "Vozi se dječak biciklom pored rijeke i pukne mu guma. Padne u rijeku i utopi se. Na pogrebnom govoru mu majka govori:\nEhh što ti je život. Rodio se zbog puknute gume, zbog nje je i umro.",
            
            "Presretne pljačkaš čovjeka u skupom odijelu, izvadi pištolj i zaprijeti:\nDaj mi sav svoj novac!\nAli, ja sam političar.\nDobro onda, daj mi sav MOJ novac!",
            
            "Razgovaraju Mujo i Haso:\nKupio sam onoj mojoj rastrošnoj Fati knjigu Umjetnost štednje.\nI? Ima li kakvih rezultata?'\nDa, više ne pijem i ne pušim.",
            
            "Razgovaraju dvojica prijatelja i jedan kaže:\nNajbolje je biti dužan!\nZašto?\nNedužni uvijek stradaju!",
            
            "Došao Bernardić u IT tvrtku na razogvor za posao i pita ga poslodavac:\nImate li kakvih iskustva u IT sektoru?\nA Bernardić mu odgovori:\nImam! Bio sam CEO Restart koalicije!",
            
            "Idu dvije palacinke ulicom jedna padne druga kaze jesi smotana.",
            
            "Idu dvije vate ulicom jednu zgazi auto druga kaze vata fuck",
            
            "Sretnu se Mujo i Haso na cesti pa kaže Mujo:\nŠta ti bolan mene ne pitaš šta ima?\nPa šta ima?\nMa šuti čovječe, ne pitaj me ništa!",
            
            "Odbrojava sudac boksaču koji u knockoutu leži na podu pa u to vrijeme viče baba iz publike:\nNeće vam taj ustat, znam ga ja iz autobusa."
    };
        
            int idx = new Random().nextInt(vicevi.length);
            String random = (vicevi [idx]);
            
            System.out.print(random);
            System.out.print("\n--------------------------------------------------------------------------\n\n");
            
            odabirJelOcesPonovoVic();       
    }
    
    static void odabir(){
        
        Scanner s = new Scanner(System.in);

        System.out.println("Hocemo li se jos zabavljat ili je dosta za danas?");
        System.out.println("Upisi DA ako si za jos zabave, a NE ako ti je dosadilo samnom.");   
        
        String odabir = s.nextLine();
        
        if(odabir.equals("DA") || odabir.equals("da") || odabir.equals("Da")){
            System.out.print("\n--------------------------------------------------------------------------\n");
            System.out.println("Odlicno, ajmoo jos!");
            odabirIgre();
        }else if(odabir.equals("NE") || odabir.equals("ne") || odabir.equals("Ne")){
            gasi();
        }
    }
  
    static void pogadjanjeBroja(){
        
        String upis;
        int random, guess, pokusaji;
            
        Scanner tipk = new Scanner(System.in);
        
        Random generator = new Random();
        random = generator.nextInt(100) + 1;
        pokusaji = 1; 

        System.out.println("Mislim na broj od 1 do 100, sta mislis koji je?"); 
        
        do{
            guess = tipk.nextInt();
                      
            if (guess > random) {
                System.out.println("Nize!");
                pokusaji += 1; 
            }
            else if(guess < random){
                System.out.println("Vise!");
                pokusaji += 1;
            }else{
                continue;
            }
        }while(guess != random);

        System.out.println(random + " je tocan odgovor i trebalo ti je " + pokusaji + " pokusaja da pogodis!\n");
        System.out.println("--------------------------------------------------------------------------\n");
        
        odabirJelOcesPonovoBrojeve();

    }
    
    static void kvizJava(){
       
        String pitanje1 = "Tko je razvio Javu programski jezik?\n" +
                 "(a)Teddy Fox i Carl Ortega\n(b)James Gosling i Patrick Naughton\n(c)Mustafa Holder i Iyla Spencer\n";
                
        String pitanje2 = "Razvoj je poceo.. koje godine?\n" +
                 "(a)1991. godine\n(b)1993. godine\n(c)1995. godine\n";
        
        String pitanje3 = "Koliko uredjaja sadrze Javu u sebi na svijetu danas?\n" +
                 "(a)Otprilike 10 milijardi\n(b)Otprilike 12 milijardi\n(c)Otprilike 15 milijardi\n";
        
        
        Pitanje [] pitanja = {
            new Pitanje(pitanje1, "b"),
            new Pitanje(pitanje2, "a"),
            new Pitanje(pitanje3, "c")
        };
        
        provjeriOdgovor(pitanja);
        
    }
    
    static void provjeriOdgovor(Pitanje [] pitanja){
        int bodovi = 0;
        
        Scanner s = new Scanner(System.in);
        
        for(int i = 0; i < pitanja.length; i++){
            System.out.println(pitanja[i].sadrzaj);
            String odgovor = s.nextLine();
            
            System.out.println("\n--------------------------------------------------------------------------");
            
            if(odgovor.equals(pitanja[i].odgovor)){
                bodovi++;
            }
        }    
        System.out.println("Vas rezultat je " + bodovi + "/" + pitanja.length);
        
        if(bodovi == 0){
            System.out.println("Ufff lose lose malo vise ucit i bit ce bolje sljedeci put.\n");
        }else if(bodovi == 1){
            System.out.println("Ahh ajde barem nije 0, malo vise ucenja i bit ce bolje sljedeci put.\n");
        }else if(bodovi == 2){
            System.out.println("Oo pa cak je i dobro ali uvijek moze bolje, zar ne.\n");
        }else if(bodovi == 3){
            System.out.println("Odlicnooo, sve znas, svaka cast.\n");
        }
        
        odabirJelOcesPonovoKviz();
        
    }
}
