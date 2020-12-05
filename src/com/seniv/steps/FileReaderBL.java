package com.seniv.steps;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class FileReaderBL {
    double sumDell;
    public ArrayList<String> arrayListWithNames = new ArrayList<>();
    public ArrayList<String> arrayListWithMemory = new ArrayList<>();
    public ArrayList<String> arrayListWithPrice = new ArrayList<>();
    public ArrayList<String> arrayListWithBatteryCapacity = new ArrayList<>();
    public ArrayList<String> arrayListWithVideoGraphics = new ArrayList<>();
    public ArrayList<String> arrayListWithCpuSpeed = new ArrayList<>();
    public ArrayList<Double> arrayListWithNewMemory = new ArrayList<>();
    public ArrayList<Double> arrayListWithNewPrice = new ArrayList<>();
    public ArrayList<Double> arrayListWithNewBatteryCapacity = new ArrayList<>();
    public ArrayList<Double> arrayListWithNewVideoGraphics = new ArrayList<>();
    public ArrayList<Double> arrayListWithNewCpuSpeed = new ArrayList<>();
    public ArrayList<Double> arrayListSumParameter = new ArrayList<>();



    public void fileReader() {
        try {
            File file = new File("C:\\Users\\Grisha\\Desktop\\Ну ЛП\\4 курс\\1 семестр\\Decision Theory\\Lab4\\Method of expert evaluation\\src\\resources\\seniv_23variant.txt");
            //Create Object FileReader for Object File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();
            String[] words;

            while (line != null) {
                if (line.contains("Parameter:")) {
                    words = line.split(" ");
                    for (String word : words) {
                        arrayListWithNames.add(word);
                    }
                } else if (line.contains("Memory_capacity:")) {
                    words = line.split(" ");
                    for (String word : words) {
                        arrayListWithMemory.add(word);
                    }
                } else if (line.contains("Price:")) {
                    words = line.split(" ");
                    for (String word : words) {
                        arrayListWithPrice.add(word);
                    }
                } else if (line.contains("Battery_capacity:")) {
                    words = line.split(" ");
                    for (String word : words) {
                        arrayListWithBatteryCapacity.add(word);
                    }
                } else if (line.contains("Video_graphics:")) {
                    words = line.split(" ");
                    for (String word : words) {
                        arrayListWithVideoGraphics.add(word);
                    }
                } else if (line.contains("CPU_speed:")) {
                    words = line.split(" ");
                    for (String word : words) {
                        arrayListWithCpuSpeed.add(word);
                    }
                }
                // считываем остальные строки в цикле
                line = reader.readLine();
            }
        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

    public void printTask() {
        System.out.printf("TASK TABLE(Read From File seniv_23.variant)\nLab4\nHryhorii Seniv\n\n");

        for (int i = 1; i <= 125; i++){
            System.out.print("-");
        }
        System.out.println();

        System.out.print("|PARAMETER:       |");
        for (int i = 1; i <= arrayListWithNames.size() - 1; i++) {
            System.out.printf("| %13s |", arrayListWithNames.get(i));
        }
        System.out.println();

        for (int i = 1; i <= 125; i++){
            System.out.print("-");
        }
        System.out.println();

        System.out.print("|Memory_capacity: |");
        for (int i = 1; i <= arrayListWithMemory.size() - 1; i++) {
            System.out.printf("| %13s |", arrayListWithMemory.get(i));
        }
        System.out.println();

        System.out.print("|Price:           |");
        for (int i = 1; i <= arrayListWithPrice.size() - 1; i++) {
            System.out.printf("| %13s |", arrayListWithPrice.get(i));
        }
        System.out.println();

        System.out.print("|Battery_capacity:|");
        for (int i = 1; i <= arrayListWithBatteryCapacity.size() - 1; i++) {
            System.out.printf("| %13s |", arrayListWithBatteryCapacity.get(i));
        }
        System.out.println();

        System.out.print("|Video_graphics:  |");
        for (int i = 1; i <= arrayListWithVideoGraphics.size() - 1; i++) {
            System.out.printf("| %13s |", arrayListWithVideoGraphics.get(i));
        }
        System.out.println();

        System.out.print("|CPU_speed:       |");
        for (int i = 1; i <= arrayListWithCpuSpeed.size() - 1; i++) {
            System.out.printf("| %13s |", arrayListWithCpuSpeed.get(i));
        }
        System.out.println();

    }

    public void multiplyParameter() {
        for (int i = 2; i <= arrayListWithMemory.size() - 1; i++) {
            double multiplyParameter = Double.parseDouble(arrayListWithMemory.get(1)) * Double.parseDouble(arrayListWithMemory.get(i));
            arrayListWithNewMemory.add(multiplyParameter);
        }

        for (int i = 2; i <= arrayListWithPrice.size() - 1; i++) {
            double multiplyParameter = Double.parseDouble(arrayListWithPrice.get(1)) * Double.parseDouble(arrayListWithPrice.get(i));
            arrayListWithNewPrice.add(multiplyParameter);
        }

        for (int i = 2; i <= arrayListWithBatteryCapacity.size() - 1; i++) {
            double multiplyParameter = Double.parseDouble(arrayListWithBatteryCapacity.get(1)) * Double.parseDouble(arrayListWithBatteryCapacity.get(i));
            arrayListWithNewBatteryCapacity.add(multiplyParameter);
        }

        for (int i = 2; i <= arrayListWithVideoGraphics.size() - 1; i++) {
            double multiplyParameter = Double.parseDouble(arrayListWithVideoGraphics.get(1)) * Double.parseDouble(arrayListWithVideoGraphics.get(i));
            arrayListWithNewVideoGraphics.add(multiplyParameter);
        }

        for (int i = 2; i <= arrayListWithCpuSpeed.size() - 1; i++) {
            double multiplyParameter = Double.parseDouble(arrayListWithCpuSpeed.get(1)) * Double.parseDouble(arrayListWithCpuSpeed.get(i));
            arrayListWithNewCpuSpeed.add(multiplyParameter);
        }
    }

    public double sumArrayListElements(){
        for (int i = 0; i <= 4; i++){
            sumDell = arrayListWithNewMemory.get(i) + arrayListWithNewPrice.get(i) + arrayListWithNewBatteryCapacity.get(i)+
                    arrayListWithNewVideoGraphics.get(i) + arrayListWithNewCpuSpeed.get(i);
            arrayListSumParameter.add(sumDell);
        }

        return sumDell;
    }

    public void getBiggestValueInArrayListSum(){
        double value = Collections.max(arrayListSumParameter);
    }

    public void printFinishTable() {
        System.out.println();
        System.out.println();
        System.out.println("FINISH TABLE AFTER MULTIPLY PARAMETER");

        for (int i = 1; i <= 125; i++){
            System.out.print("-");
        }
        System.out.println();

        System.out.print("|PARAMETER:       |");
        for (int i = 1; i <= arrayListWithNames.size() - 1; i++) {
            System.out.printf("| %13s |", arrayListWithNames.get(i));
        }
        System.out.println();

        for (int i = 1; i <= 125; i++){
            System.out.print("-");
        }
        System.out.println();

        System.out.print("|Memory_capacity: |");
        System.out.printf("| %13s |", arrayListWithMemory.get(1));
        for (int i = 0; i <= arrayListWithNewMemory.size() - 1; i++) {
            System.out.printf("| %13s |", arrayListWithNewMemory.get(i));
        }
        System.out.println();

        System.out.print("|Price:           |");
        System.out.printf("| %13s |", arrayListWithPrice.get(1));
        for (int i = 0; i <= arrayListWithNewPrice.size() - 1; i++) {
            System.out.printf("| %13s |", arrayListWithNewPrice.get(i));
        }
        System.out.println();

        System.out.print("|Battery_capacity:|");
        System.out.printf("| %13s |", arrayListWithBatteryCapacity.get(1));
        for (int i = 0; i <= arrayListWithNewBatteryCapacity.size() - 1; i++) {
            System.out.printf("| %13s |", arrayListWithNewBatteryCapacity.get(i));
        }
        System.out.println();

        System.out.print("|Video_graphics:  |");
        System.out.printf("| %13s |", arrayListWithVideoGraphics.get(1));
        for (int i = 0; i <= arrayListWithNewVideoGraphics.size() - 1; i++) {
            System.out.printf("| %13s |", arrayListWithNewVideoGraphics.get(i));
        }
        System.out.println();

        System.out.print("|CPU_speed:       |");
        System.out.printf("| %13s |", arrayListWithCpuSpeed.get(1));
        for (int i = 0; i <= arrayListWithNewCpuSpeed.size() - 1; i++) {
            System.out.printf("| %13s |", arrayListWithNewCpuSpeed.get(i));
        }
        System.out.println();

        for (int i = 1; i <= 125; i++){
            System.out.print("-");
        }
        System.out.println();

        System.out.print("|SUM Parameter:   |");
        System.out.printf("| %13s |", "    ");
        for (int i = 0; i <= arrayListSumParameter.size() - 1; i++) {
            System.out.printf("| %13s |", arrayListSumParameter.get(i));
        }
        System.out.println();

        for (int i = 1; i <= 125; i++){
            System.out.print("-");
        }
        System.out.println();

        System.out.println("Biggest sum parameter = " + sumDell);
    }
}
