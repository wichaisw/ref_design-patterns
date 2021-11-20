package behavioral.strategy;

public class Chess {
    private ChessAlgorithm algorithm = new EasyChessAlgorithm();

    public int chooseNextStep() {
        return algorithm.calculateNextStep();
    }

    public void setAlgorithm(ChessAlgorithm algorithm) {
        this.algorithm = algorithm;
    }
}
