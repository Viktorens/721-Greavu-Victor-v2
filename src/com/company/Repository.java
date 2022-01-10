package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Repository {

    public List<Oferta> readFromFile(String fileName, String character) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String line = bufferedReader.readLine();
        String[] attributes;
        Oferta oferta;
        List<Oferta> listeOferte = new ArrayList<>();
        while (line != null) {
            attributes = line.split(character);
            oferta = new Oferta(attributes[0], attributes[1], attributes[2], attributes[3], attributes[4], Ort.valueOf(attributes[5]));
            listeOferte.add(oferta);

            line = bufferedReader.readLine();
        }

        return listeOferte;
    }

    public void writeToFile(String fileName, List<Oferta> liste, String character) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
        for (Oferta oferta : liste) {
            String line = oferta.getId() + character + oferta.getUnternehmensname() + character +
                    oferta.getPreis() + character + oferta.getProzent() + character + oferta.getAdresse() + character + oferta.getOrt();
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }

}
