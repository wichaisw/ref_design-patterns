package behavioral.strategy;

public class Client {
    public static void main(String[] args) {
        Chess chess = new Chess();

        System.out.println("Calculate next step: " + chess.chooseNextStep());

        chess.setAlgorithm(new HardChessAlgorithm());
        System.out.println("Calculate next step: " + chess.chooseNextStep());
    }
}
