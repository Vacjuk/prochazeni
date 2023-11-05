/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.prochazeni;

/**
 *
 * @author Martin
 */
public class Lokace {
    /**
     * Lokace na severu
     */
    public Lokace sever;
    /**
     * Lokace na jihu
     */
    public Lokace jih;
    /**
     * Lokace na západě
     */
    public Lokace zapad;
    /**
     * Lokace na východě
     */
    public Lokace vychod;
    /**
     * Název lokace
     */
    private String nazev;
    /**
     * Dlouhý popis lokace
     */
    private String popis;

    /**
     * Inicializuje novou instanci
     * @param nazev Název lokace
     * @param popis Dlouhý popis
     */
    public Lokace(String nazev, String popis)
    {
        this.nazev = nazev;
        this.popis = popis;
    }

    /**
     * Vrátí textovou reprezentaci lokace
     * @return Textová reprezentaci lokace
     */
    @Override
    public String toString()
    {
        String vystup = nazev + "\n";
        vystup += popis + "\n\n";
        String smer = "";
        if (sever != null)
            smer += "sever ";
        if (jih != null)
            smer += "jih ";
        if (zapad != null)
            smer += "západ ";
        if (vychod != null)
            smer += "východ ";
        if (!smer.equals(""))
            vystup += "Můžeš jít na " + smer + "\n";
        return vystup;
    }
}
