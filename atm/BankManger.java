package Week_2_DP5_CipherSchools.atm;

/**
 * @author amgarg
 */
public class BankManger {

    BankDatabase bankDatabase;
    ATMManager atmManager;

    public BankManger() {
        this.bankDatabase = new BankDatabase();
        atmManager = new ATMManager();
        atmManager.setBankDatabase(bankDatabase);
    }

    public void createCard() {
        bankDatabase.addCardInDataBase();
    }

}
