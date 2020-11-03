package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Nota;

public class NotaC {

    Scanner sc = new Scanner(System.in);

    public List variables() {
        List x = new ArrayList();

        System.out.println("\n");
        System.out.println("Ingrese un Alumno");
        String alumno = sc.nextLine();

        if (alumno.isEmpty() || alumno.isBlank() || alumno == null || alumno.equals("")) {
            System.out.println("Adios");
            System.exit(0);
        } else {
            System.out.println("Ingresa nota de la practica");
            int practica = Integer.valueOf(sc.nextLine());

            System.out.println("Ingresa nota de la problema");
            int problema = Integer.valueOf(sc.nextLine());

            System.out.println("Ingresa nota de la teoria");
            int teoria = Integer.valueOf(sc.nextLine());

            x.add(alumno);
            x.add(practica);
            x.add(problema);
            x.add(teoria);
        }

        return x;
    }

    public void validar() {
        List x = variables();
        Nota n = new Nota();

        n.setNombre((String) x.get(0));
        n.setPractica((int) x.get(1));
        n.setProblema((int) x.get(2));
        n.setTeoria((int) x.get(3));

        if (n.getTeoria() > 20 || n.getPractica() > 20 || n.getProblema() > 20
                || n.getTeoria() < 0 || n.getPractica() < 0 || n.getProblema() < 0) {
            System.out.println("Una o todas las notas estan mal ingresadas,");
            System.out.println("por favor vuelve a ingresar los datos solicitados");
            validar();
        } else {
            calcular(n.getNombre(), n.getPractica(), n.getProblema(), n.getTeoria());
            validar();
        }

    }

    public void calcular(String alumno, double PT, double PB, double T) {
        double practica = ((PT * 10) / 100);
        double problema = ((PB * 50) / 100);
        double teoria = ((T * 40) / 100);
        String D_P = "";
        double resultado = practica + problema + teoria;

        if (resultado > 13) {
            D_P = "Aprobado";
        } else {
            D_P = "Desaprobado";
        }

        System.out.println("\n");
        System.out.println("Nombre del alumno: " + alumno);
        System.out.println("Nota de practica: " + PT + " = Vale el 10% de la nota final. => " + practica);
        System.out.println("Nota de problema: " + PB + " = Vale el 50% de la nota final. => " + problema);
        System.out.println("Nota de teoria: " + T + " = Vale el 40% de la nota final. => " + teoria);
        System.out.println("Resultado final: " + resultado + " => " + D_P);

    }

}
