package inheritance;

public class SuperHero extends Person {

    private String alterEgo;

    public SuperHero(String name, String alterEgo) {
        super(name);
        this.alterEgo = alterEgo;
    }

    @Override
    public String getName(){
        return this.alterEgo;
    }

    public String getSecretIdentity() {
        return super.getName();
    }

}
