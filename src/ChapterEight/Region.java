package ChapterEight;

public enum Region {
    NE("Ajegunle", "Ikeja", "Abuja"),
    SE("VI", "BI"),
    SW("Mushin", "Ketu", "Okoko", "Ipaja"),
    NC("Ibadan", "Ekiti", "Ijubu"),
    SS("Sabo", "Bariga", "Somolu"),
    NW("Challenge", "Molette", "Mowe");
    private String[] states;

    Region(String... states) {
        this.states = states;
    }
}
