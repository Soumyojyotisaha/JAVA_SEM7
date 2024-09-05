class Game {
    public void type() {
        System.out.println("Indoor & outdoor");
    }
}

class cricket extends Game {
    @Override
    public void type() {
        System.out.println("Outdoor game");
    }

    public static void main(String[] args) {
        Game gm = new Game();
        cricket ck = new cricket();
        gm.type(); // Calls Game's type method
        ck.type(); // Calls Cricket's type method
        gm = ck; // gm refers to Cricket object
        gm.type(); // Calls Cricket's type method due to polymorphism
    }
}
