package com.seniv.main;

import com.seniv.steps.FileReaderBL;

public class Main {
    public static void main(String[] args) {
        FileReaderBL fileReaderBL = new FileReaderBL();
        fileReaderBL.fileReader();
        fileReaderBL.printTask();
        fileReaderBL.multiplyParameter();
        fileReaderBL.sumArrayListElements();
        fileReaderBL.getBiggestValueInArrayListSum();
        fileReaderBL.printFinishTable();
    }
}
