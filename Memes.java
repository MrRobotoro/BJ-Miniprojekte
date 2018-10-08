//Dieses Programm wurde von MrRobotoro und Error. geschrieben.
//Wir bitten darum, dieses nicht ohne unsere Kenntniss auf externen Seiten hochzuladen und als eigenes Werk auszugeben.
//~MrRobotoro|Jonas & Error|Mert
public class Memes
{
    private double zufall;
    private int zuf;
    private String aus1;
    private String aus2;
    private String aus3;
    private String lz;
    private String[] memes;
    private String[] verb;
    private String[] zusatz;
    private int arraylaenge;
    public Memes()
    { 
        lz = " ";
        //Ab hier kommen unsere Memes
        memes = new String[12];
        arraylaenge = memes.length;
        memes[0] = "Johnny";
        memes[1] = "Angela Merkel";
        memes[2] = "Hillary Clinton";
        memes[3] = "Stalin";
        memes[4] = "Kermit the frog";
        memes[5] = "Donald Trump";
        memes[6] = "Rick Astley";
        memes[7] = "Alexa";
        memes[8] = "Mark Zuckerberg";
        memes[9] = "Spongebob";
        memes[10] = "Ninja";
        memes[11] = "Pepe";

        //Ab hier kommen dann die Verben
        verb = new String[arraylaenge];
        verb[0] = "isst";
        verb[1] = "tanzt";
        verb[2] = "mag";
        verb[3] = "bekämpft";
        verb[4] = "ist";
        verb[5] = "regiert";
        verb[6] = "singt";
        verb[7] = "spielt";
        verb[8] = "verkauft meine persönlichen Daten an";
        verb[9] = "macht Burger für";
        verb[10] = "hatted";
        verb[11] = "heult wegen";

        //Und hier kommt dann noch der Zusatz
        zusatz = new String[arraylaenge];
        zusatz[0] = "Zucker";
        zusatz[1] = "den Harlem Shake";
        zusatz[2] = "Deutschland";
        zusatz[3] = "Russland";
        zusatz[4] = "Elmos Liebling.";
        zusatz[5] = "die USA";
        zusatz[6] = "die besten Hits aus den 80ern";
        zusatz[7] = "Despacito";
        zusatz[8] = "McDonalds";
        zusatz[9] = "die krosse Krabbe";
        zusatz[10] = "Fortnite";
        zusatz[11] = "Gulag";

    }

    public void generateMeme()
    {
        zufall();
        aus1 = memes[zuf];
        zufall();
        aus2 = verb[zuf];
        zufall();
        aus3 = zusatz[zuf];

        System.out.println("Hier ist dein gewünschter Meme:");
        System.out.println(aus1+lz+aus2+lz+aus3);
    }

    public void filter(String eingabe)
    {
        boolean pruef = false;
        for(int i=0;i<memes.length;i++)
            if(memes[i].equals(eingabe))
            {
                aus1 = memes[i];
                zufall();
                aus2 = verb[zuf];
                zufall();
                aus3 = zusatz[zuf];
                System.out.println("Hier ist dein gewünschter Meme:");
                System.out.println(aus1+lz+aus2+lz+aus3);
                pruef = true;}

        for(int i=0; i<verb.length;i++)
            if(verb[i].equals(eingabe))
            {zufall();
                aus1 = memes[zuf];
                aus2 = verb[i];
                zufall();
                aus3 = zusatz[zuf];
                System.out.println("Hier ist dein gewünschter Meme:");
                System.out.println(aus1+lz+aus2+lz+aus3);
                pruef = true;}

        for(int i=0;i<zusatz.length;i++)
            if(zusatz[i].equals(eingabe))
            {zufall();
                aus1 = memes[zuf];
                zufall();
                aus2 = verb[zuf];
                aus3 = zusatz[i];
                System.out.println("Hier ist dein gewünschter Meme:");
                System.out.println(aus1+lz+aus2+lz+aus3);}
            else if(pruef == false)
            {System.err.println("Ich konnte diesen Begriff nicht finden");}

    }

    private void zufall()
    {
        zuf = 0;
        zufall = Math.random() * arraylaenge;
        zuf = (int) zufall;
    }
}
