/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

public class AtendenteRepository {
    private static List<Atendente> atendentes = new ArrayList<>();

    static {
        atendentes.add(new Atendente("Raphael", "000.000.000-00",
                "Araguari-MG", "34999999999", "admin", "1234"));
    }

    public static Atendente buscarPorLogin(String login) {
        for (Atendente a : atendentes) {
            if (a.getLogin().equals(login)) {
                return a;
            }
        }
        return null;
    }
}
