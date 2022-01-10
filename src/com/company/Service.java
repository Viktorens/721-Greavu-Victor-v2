package com.company;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Service {

    public List<Oferta> sortListeOfertaByPreis(List<Oferta> liste) {
        return liste.stream()
                .sorted((oferta, otherOferta) ->  CharSequence.compare(otherOferta.getPreis(), oferta.getPreis()))
                .sorted((oferta, otherOferta) ->  CharSequence.compare(otherOferta.getProzent(), oferta.getProzent()))
                .collect(Collectors.toList());
    }
}
