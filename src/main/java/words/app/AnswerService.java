package words.app;

public class AnswerService {

    private CreateSetForUser createSetForUser;

    public AnswerService(CreateSetForUser createSetForUser) {
        this.createSetForUser = createSetForUser;
    }

    public CreateSetForUser getCreateSetForUser() {
        return createSetForUser;
    }

    public void setCreateSetForUser(CreateSetForUser createSetForUser) {
        this.createSetForUser = createSetForUser;
    }

    public boolean checkAnswer(String answer){
        boolean test = createSetForUser.findWord(answer);
        System.out.println(test);
        return test;
    }

}
