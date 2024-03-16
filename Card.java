public class Card {
    private final String Name;
    private int Atk;
    private int Def;
    private final String Desc;
    private final String Attr;
    private final String[] Type;
    private int Level;
    public Card(String Name, int Atk, int Def, String Desc, String Attr, String[] Type, int Level) {
        this.Name=Name;
        this.Atk=Atk;
        this.Def=Def;
        this.Desc=Desc;
        this.Attr=Attr;
        this.Type=Type;
        this.Level=Level;
    }

    public void setAtk(int newAtk) {
        Atk=newAtk;
    }

    public void setDef(int newDef) {
        Def=newDef;
    }

    public void setLevel(int newLevel) {
        Level=newLevel;
    }
    public String getName() {return Name;}
    public int getAtk() {return Atk;}
    public int getDef() {return Def;}
    public String getDesc() {return Desc;}
    public String getAttr() {return Attr;}
    public String[] getType() {return Type;}
    public int getLevel() {return Level;}
}
