// Created by islam elhady on 7/4/18.

import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 Scanner teclado = new Scanner(System.in);

        int ver,grem,inter,gremGanho,interGanho,empate,grenais;
        grenais = grem = inter = interGanho = empate = gremGanho = 0;

        ver=1;

        while(ver == 1){
            inter = teclado.nextInt();
            grem = teclado.nextInt();
            

            if(grem == inter)
                empate++;
            else if(grem>inter) 
                gremGanho++;
            else if(grem<inter) 
                interGanho++;

            System.out.println("Novo grenal (1-sim 2-nao)");
            ver = teclado.nextInt();
            grenais++;

        }

        System.out.println(grenais+" grenais\nInter:"+interGanho+"\nGremio:"+gremGanho+"\nEmpates:"+empate);

        if(gremGanho>interGanho)
            System.out.println("Gremio venceu mais");
        else if(gremGanho<interGanho)
            System.out.println("Inter venceu mais");
        else if(gremGanho==interGanho)
            System.out.println("Nao houve vencedor");


    }
 
}