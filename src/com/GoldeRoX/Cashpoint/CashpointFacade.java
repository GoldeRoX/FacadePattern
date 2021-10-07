package com.GoldeRoX.Cashpoint;

public class CashpointFacade {

    private final Cashpoint cashpoint;
    private final CashpointSystem cashpointSystem;

    public CashpointFacade(){
        cashpoint = new Cashpoint();
        cashpointSystem = new CashpointSystem();
    }

    public void pickupMoney(){
        cashpoint.getUserData();
        if(cashpointSystem.isUserDataValidated() && cashpointSystem.isMoneySecured()){
            cashpoint.sendSpecificAmountOfMoney();
        }
    }

}
