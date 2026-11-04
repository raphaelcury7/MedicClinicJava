/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

public class ClienteRepository {
    private static List<Cliente> clientes = new ArrayList<>();

    public static void adicionar(Cliente cliente) {
        clientes.add(cliente);
    }

    public static List<Cliente> listarTodos() {
        return clientes;
    }
}