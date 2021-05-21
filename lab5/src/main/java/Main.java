//import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
//package com.javarush.test.level08.lesson11.bonus03;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Arrays;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Main {

        public static void sortMethod1() {
            int[] intArr = Arrays.stream(sArr).mapToInt(Integer::parseInt).toArray();
            Arrays.sort(intArr);
            System.out.println(Arrays.toString(intArr));



        private static String[] sArr = {"lena", "roma", "vika", "slava", "oleg", "dima", "rita", "sasha, "6"};

        public static void main(String[] args){
                sortMethod1(sArr);
                //sortMethod2(sArr);
            }}
}
