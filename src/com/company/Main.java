package com.company;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Repository repo = new Repository();
        Service service = new Service();

        try {
            List<Oferta> listeOferta = repo.readFromFile("D:\\Documents\\facultate\\Java\\MAP\\712-Greavu-Victor-v2\\src\\com\\company\\offerten.txt", "&");

            System.out.println(service.sortListeOfertaByPreis(listeOferta));

            repo.writeToFile("D:\\Documents\\facultate\\Java\\MAP\\712-Greavu-Victor-v2\\src\\com\\company\\offertensortiert.txt", listeOferta, "&");

            System.out.println(service.getMostFrequentPlace(listeOferta));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
