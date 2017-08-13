/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gittestproject;

/**
 *
 * @author isaac
 */
public class GitTestProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] names = {"Isaac", "Alejandra", "Mayra", "Miguel", "Mauro", "David", "Nadia", "Ania", "Axel", "Jacobo", "Alejandra", "Daniela"};
        for (String name : names){
            System.out.println(name);
            System.out.println(GitTestProject.lettersCounter(name));
        }
        System.out.println("Listo!!");
    }
    
    private static int lettersCounter(String name){
        return name.length();
    }
    
}
