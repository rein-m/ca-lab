package use_case.logout;

/**
 * The Logout Interactor.
 */
public class LogoutInteractor implements LogoutInputBoundary {
    private LogoutUserDataAccessInterface userDataAccessObject;
    private LogoutOutputBoundary logoutPresenter;

    public LogoutInteractor(LogoutUserDataAccessInterface userDataAccessInterface,
                            LogoutOutputBoundary logoutOutputBoundary) {
        this.userDataAccessObject = userDataAccessInterface;
        this.logoutPresenter = logoutOutputBoundary;
    }

    @Override
    public void execute() {
        // * set the current username to null in the DAO
        final String username = null;
        // * instantiate the `LogoutOutputData`, which needs to contain the username.
        LogoutOutputData lg = new  LogoutOutputData(username);
        // * tell the presenter to prepare a success view.
        logoutPresenter.prepareSuccessView(lg);
    }
}

