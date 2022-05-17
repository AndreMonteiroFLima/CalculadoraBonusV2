package preseter;

import view.BonusView;

public class BonusPresenter {

    private BonusView bonusView;

    public BonusPresenter(BonusView bonusView) {
        this.bonusView = bonusView;
    }

    public void mostraTela() {
        bonusView.exibir();
    }



}
