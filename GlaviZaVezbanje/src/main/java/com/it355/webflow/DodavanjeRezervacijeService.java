/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.webflow;

import java.util.Date;
import org.springframework.stereotype.Service;

/**
 *
 * @author Filip Wolve
 */
@Service
public class DodavanjeRezervacijeService {
    public String validateRezervacije(DodavanjeRezervacijeBean dodavanjeRezervacije) {
        Integer brOdraslih = dodavanjeRezervacije.getBrOdraslih();
        Integer brDece = dodavanjeRezervacije.getBrDece();
        Date datumDolaska = dodavanjeRezervacije.getDatumDolaska();
        Date datumOdlaska = dodavanjeRezervacije.getDatumOdlaska();
        String prezime = dodavanjeRezervacije.getPrezime();
        String ime = dodavanjeRezervacije.getIme();
        Double cena = dodavanjeRezervacije.getCena();
        String kartica = dodavanjeRezervacije.getKartica();
        Integer brKartice = dodavanjeRezervacije.getBrKartice();
        Double ukupnaCena = dodavanjeRezervacije.getCenaUkupna();
        if(!"".equals(kartica) && brOdraslih != 0 && datumDolaska != null && datumOdlaska != null && brKartice != 0) {
            //private Logger logger = LoggerFactory.getLogger(imekontrolera.class);
            return "true"; 
        } 
        else {
            System.out.println( "brOdraslih=" + brOdraslih + ", brDece=" + brDece + ", datumDolaska=" 
                + datumDolaska + ", datumOdlaska=" + datumOdlaska + ", prezime=" + prezime + ", ime=" + ime + ", cena=" + cena
            + ", kartica=" + kartica + ", brKartice=" + brKartice + ", ukupnaCena =" + ukupnaCena);
        return "false"; 
        }
    }
    
}