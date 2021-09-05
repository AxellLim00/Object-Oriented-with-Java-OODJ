/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author Axell
 */
public class Run {
    public static void main(String[] args) {
        Category catname = new Category("460ce243-2fd6-4b34-826c-ce9df40a11c6");
        catname.read();
        System.out.println(catname.getData().get(1));
    }
}
