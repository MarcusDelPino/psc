//import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JOptionPane;

    public class Eleicoes {
        public static void main (String[] args){
            double eleitores, vValidos, vBrancos, vNulos, vComputados;
            
            eleitores = Double.parseDouble(JOptionPane.showInputDialog("Quantos eleitores tem na sua cidade?"));
            //vComputados = Double.parseDouble(JOptionPane.showInputDialog("Quantos votos foram computados?"));
            vValidos = Double.parseDouble(JOptionPane.showInputDialog("Quantidade de votos válidos?"));
            vBrancos = Double.parseDouble(JOptionPane.showInputDialog("Quantos votos em branco?"));
            vNulos = Double.parseDouble(JOptionPane.showInputDialog("Quantos votos nulos?"));
            vComputados = vBrancos+vNulos+vValidos;
            
            if (vBrancos + vNulos + vValidos > eleitores) {
                
                JOptionPane.showMessageDialog(null, "Desculpe! Mas o valores não batem.");    

            } else {
                
                        //voto=30*100/60 = 50% 
                        
                vValidos = ((vValidos*100)/eleitores);
                    System.out.println(vValidos  + "% de votos válidos");
                vBrancos = ((vBrancos*100)/eleitores);
                    System.out.println(vBrancos  + "% de votos em branco");
                vNulos = ((vNulos*100)/eleitores);
                    System.out.println(vNulos + "% de votos nulos");
                
                vComputados = ((vComputados*100)/eleitores);
                    System.out.println(vComputados + "% de votos computados de um total de " + eleitores);
            }
            
        }
        
    }
    // int anoAniversario, mesAniversario, diaAniversario, res;

    // diaAniversario = Integer.parseInt(JOptionPane.showInputDialog("Qual dia você nasceu?"));
    // mesAniversario = Integer.parseInt(JOptionPane.showInputDialog("Qual mês do seu nascimente?"));
    // anoAniversario = Integer.parseInt(JOptionPane.showInputDialog("Qual ano você nasceu?"));

    // res = diaAniversario + ((mesAniversario * 30) + ((2022 - anoAniversario) * 365));

    // JOptionPane.showMessageDialog(null, "Você está vivo a " + res);
    // System.out.println(res);