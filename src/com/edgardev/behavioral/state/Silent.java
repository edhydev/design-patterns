package com.edgardev.behavioral.state;

public class Silent implements MobileAlertState {
    @Override
    public void alert(MobileAlertStateContext context) {
        System.out.println("Silencio... Pantalla Iluminada...");
    }
}
