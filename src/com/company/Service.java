package com.company;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Service {

    public List<Oferta> sortListeOfertaByPreis(List<Oferta> liste) {
        return liste.stream()
                .sorted((oferta, otherOferta) -> oferta.getPreis().compareTo(otherOferta.getPreis()))
                .sorted((oferta, otherOferta) -> oferta.getProzent().compareTo(otherOferta.getProzent()))
                .collect(Collectors.toList());
    }
}
