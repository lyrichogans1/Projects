public class Exam extends Assessment {
    private int totalQuestions;
    private int missedQuestions;
    private double pointsEach;

    public Exam(int totalQuestions, int missedQuestions) {
        this.totalQuestions = totalQuestions;
        this.missedQuestions = missedQuestions;
        this.pointsEach = 100.0 / totalQuestions;
        int score = (int) Math.round((totalQuestions - missedQuestions) * pointsEach);
        setScore(score);
    }

    public double getPointsEach() {
        return pointsEach;
    }
}
