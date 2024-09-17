package odev9;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

public class odev9 extends JFrame {


    private JPanel panel;
    private JTable table1;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;

    DefaultTableModel model1 = new DefaultTableModel();



    odev9()
    {
        add(panel);
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);



        model1.setRowCount(5);
        model1.setColumnCount(5);
        table1.setModel(model1);
        table1.setRowHeight(60);

        int[][] m1= Matris.uret(5,5);
        ArrayList<Integer> arrayList = matrisToList(m1);
        Collections.sort(arrayList);
        int[][] m2 = listToMatris(arrayList, 5, 5);
        Collections.reverse(arrayList);
        int[][] m3 = listToMatris(arrayList, 5, 5);
        Collections.shuffle(arrayList);
        int[][] m4 = listToMatris(arrayList, 5, 5);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                model1.setRowCount(0);
                model1.setColumnCount(0);
                table1.setModel(model1);
                table1.setTableHeader(null);

                model1.setRowCount(5);
                model1.setColumnCount(5);
                table1.setModel(model1);
                table1.setRowHeight(60);

                int[][] m1= Matris.uret(5,5);
                ArrayList<Integer> arrayList = matrisToList(m1);

                Collections.sort(arrayList);






                int i,j;
                for(i=0;i<5;i++)
                {
                    for (j=0;j<5;j++)
                    {
                        table1.setValueAt(m1[i][j],i,j);


                    }

                }



            }
        });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                model1.setRowCount(0);
                model1.setColumnCount(0);
                table1.setModel(model1);
                table1.setTableHeader(null);

                model1.setRowCount(5);
                model1.setColumnCount(5);
                table1.setModel(model1);
                table1.setRowHeight(60);







                int i,j;
                for(i=0;i<5;i++)
                {
                    for (j=0;j<5;j++)
                    {
                        table1.setValueAt(m2[i][j],i,j);


                    }

                }



            }
        });

        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                model1.setRowCount(0);
                model1.setColumnCount(0);
                table1.setModel(model1);
                table1.setTableHeader(null);

                model1.setRowCount(5);
                model1.setColumnCount(5);
                table1.setModel(model1);
                table1.setRowHeight(60);






                int i,j;
                for(i=0;i<5;i++)
                {
                    for (j=0;j<5;j++)
                    {
                        table1.setValueAt(m3[i][j],i,j);


                    }

                }


            }
        });


        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                model1.setRowCount(0);
                model1.setColumnCount(0);
                table1.setModel(model1);
                table1.setTableHeader(null);

                model1.setRowCount(5);
                model1.setColumnCount(5);
                table1.setModel(model1);
                table1.setRowHeight(60);







                int i,j;
                for(i=0;i<5;i++)
                {
                    for (j=0;j<5;j++)
                    {
                        table1.setValueAt(m4[i][j],i,j);


                    }

                }

            }
        });
    }


    static int[][] listToMatris(ArrayList<Integer> arrayList, int row, int col) {
        int[][] matris = new int[row][col];
        int index = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matris[i][j] = arrayList.get(index);
                index++;
            }
        }
        return matris;
    }

    static ArrayList<Integer> matrisToList(int[][] matris) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int[] satir : matris) {
            for (int eleman : satir) {
                arrayList.add(eleman);
            }
        }
        return arrayList;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                odev9 odevim = new odev9();
                odevim.setVisible(true);
            }
        });
    }
}
