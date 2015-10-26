package br.com.unipe.cc.gui;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import br.com.unipe.cc.modelo.Aluno;
import br.com.unipe.cc.modelo.Curso;
import br.com.unipe.cc.modelo.Prof;

public class Principall {

    private static Scanner scan = new Scanner(System.in);

    public static int menu(){
        int op=0;
        scan = new Scanner(System.in);
        System.out.println("              MENU                         ");
        System.out.println("\n\n1 - Incluir aluno");
        System.out.println("2 - Remover aluno (MATRICULA OU NOME )");
        System.out.println("3 - Verificar se aluno esta matriculado");
        System.out.println("4 - Alunos aprovados");
        System.out.println("5 - Alunos reprovados por falta(superior a 15)");
        System.out.println("6 - Listar alunos");
        System.out.println("0 - Sair");
        op = scan.nextInt();
        return op;
    }

    public static boolean verificarM (Curso c, int mat){
        for (Aluno al : c.getAlunos()) {
                if(al.getMatricula() == mat){
                    System.out.println("Matricula ja existe!");
                    return false;
                }
        }
        return true;
    }

    public static boolean remove (List<Aluno> set,String op){
        op = op.toUpperCase();
        for (Iterator<Aluno> it = set.iterator(); it.hasNext();) {
            Aluno t = it.next();
            if (t.getNome().equals(op)){
                System.out.println("Aluno removido com sucesso!");
                it.remove();
                return true;
            }
        }
        System.out.println("Aluno nao encontrado");
        return false;
    }
    public static boolean remove (List<Aluno> set,int op){
        for (Iterator<Aluno> it = set.iterator(); it.hasNext();) {
            Aluno t = it.next();
            if (t.getMatricula()== op ){
                System.out.println("Aluno removido com sucesso!");
                it.remove();
                return true;
            }
        }
        System.out.println("Aluno nao encontrado");
        return false;
    }

    public static void main(String[] args) {
        Curso c= new Curso();
        Prof prof = new Prof();
        int op;
        int falta = 15; // SUPERIOR A 15 REPROVA
        int media = 7;

        System.out.print("Nome do curso ");			// CADASTRO CURSO
        c.setNomeC(scan.nextLine());
        System.out.print("Numero de identificação ");
        c.setNumId(scan.nextInt());

        System.out.print("Nome do prof ");			// CADASTRO PROF
        scan.next();
        prof.setNomeP(scan.nextLine());
        System.out.print("Especialidade do prof ");
        prof.setEspec(scan.nextLine());
        System.out.print("Matricula do prof ");
        prof.setMatriculaP(scan.nextInt());
        c.setProf(prof);
        do{
            switch (op = menu()) {
                case 1:    Aluno a = new Aluno();
                        System.out.println("Nome ");
                        scan.next(); // LIMPAR O BUFFER
                        a.setNome(scan.nextLine().toUpperCase());
                        System.out.println("Matricula ");
                        a.setMatricula(scan.nextInt());
                        if(!(verificarM(c, a.getMatricula())))
                            break;
                        System.out.println("Falta ");
                        a.setFalta(scan.nextInt());
                        System.out.println("Nota1 ");
                        a.setN1(scan.nextDouble());
                        System.out.println("Nota2 ");
                        a.setN2(scan.nextDouble());
                        System.out.println("Nota3 ");
                        a.setN3(scan.nextDouble());
                        a.setMedia();
                        c.setAlunos(a);
                        System.out.println("Aluno cadastrado com sucesso\n");
                        break;
                case 2:    System.out.println("1 - Matricula ");
                        System.out.println("2 - Nome ");
                        op = scan.nextInt();
                        if(op == 1){
                            System.out.println("Informe matricula ");
                            remove(c.getAlunos(),scan.nextInt());
                        }else if (op == 2){
                            System.out.println("Informe nome ");
                            scan.nextLine();// LIMPAR BUFFER
                            remove(c.getAlunos(),scan.nextLine().toUpperCase());
                        }else System.out.println("Opção invalida\n");
                        break;
                case 3: System.out.println("Informe Matricula ");
                        if(verificarM(c, scan.nextInt()));
                        	
                            System.out.println("Matricula não existe!");
                        break;
                case 4: for (Aluno aluno : c.getAlunos())
                            if(aluno.getMedia() >= media && aluno.getFalta() < falta)
                                System.out.println(aluno);
                        break;
                case 5: for (Aluno aluno : c.getAlunos())
                            if(aluno.getFalta() >= falta)
                                System.out.println(aluno);
                        break;
                case 6: Collections.sort(c.getAlunos());
                        for (Aluno aluno : c.getAlunos())
                            System.out.println(aluno);
                        if(c.getAlunos().size() == 0)
                            System.out.println("Vazio!");
                        break;
                case 0: System.out.println("Saindo ...\n");
                        break;
                default:
                    System.out.println("Opção invalida\n");
            }
        }while(op != 0);
    }
}