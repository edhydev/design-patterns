package com.edgardev.behavioral.status;

public class MobileAlertStateContext {
    private MobileAlertState currentState;

    public MobileAlertStateContext() {
        currentState = new Sound();
    }

    public void setCurrentState(MobileAlertState state) {
        this.currentState = state;
    }

    public void alert() {
        currentState.alert(this);
    }
}
