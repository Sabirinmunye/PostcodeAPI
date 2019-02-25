package com.postcode;
import java.util.Scanner;

public class PostcodeLookup {
    public static void main(String[] args) throws Exception{
        PostcodeAPI apiClient = new PostcodeAPI();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a postcode to lookup: ");
        String postcode = input.nextLine();
        apiClient.getPostcode(postcode);
        input.close();
    }

}
