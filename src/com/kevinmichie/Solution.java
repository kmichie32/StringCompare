package com.kevinmichie;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public String[] wordIndexer(String fromUser, int substringCount){
        String[] wordIndexHolder = new String[fromUser.length()-substringCount+1];

        for(int i = 0; i+substringCount<= fromUser.length(); i++){
            wordIndexHolder[i] = fromUser.substring(i, i+substringCount);
        }
        return wordIndexHolder;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        String fromUser = scanner.nextLine();
        int substringCount = scanner.nextInt();

        String[] wordIndexHolder = solution.wordIndexer(fromUser,substringCount);

        Arrays.sort(wordIndexHolder);

        System.out.println(wordIndexHolder[0]);
        System.out.println(wordIndexHolder[wordIndexHolder.length -1]);
    }
}

