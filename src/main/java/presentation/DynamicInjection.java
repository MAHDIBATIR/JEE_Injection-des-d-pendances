package presentation;

import dao.DaoImpl;
import dao.IDao;
import metier.MetierImpl;

public class DynamicInjection {
    public static void main(String[] args) {
        IDao dao = createDao();
        MetierImpl metier = new MetierImpl();
        metier.setDao(dao);

        System.out.println("Result: " + metier.calcul());
    }

    private static IDao createDao() {
        return new DaoImpl();
    }
}