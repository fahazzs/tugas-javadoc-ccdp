/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

 package com.mycompany.menghitungjarakjelajahcahaya;

 /**
  * The MenghitungJarakJelajahCahaya class calculates the distance that light
  * would travel in a specified number of days.
  * 
  * This program assumes the speed of light in this context is 340,000 km/s
  * (an approximate value used for example purposes).
  * 
  * @author ACER ASPIRE 5
  */
 public class MenghitungJarakJelajahCahaya {
 
     /**
      * The main method that initializes values for the speed of light and the
      * number of days, then calculates and displays the distance light travels
      * over the specified period.
      *
      * @param args Command-line arguments (not used).
      */
     public static void main(String[] args) {
 
         int kecepatan_cahaya; // Speed of light in km/s (example value)
         long hari, detik, jarak; // Variables for days, seconds, and distance
 
         kecepatan_cahaya = 340000;
         hari = 1000;
 
         // Calculate the total seconds in the given number of days
         detik = hari * 24 * 60 * 60;
 
         // Calculate the distance traveled by light in the specified number of days
         jarak = detik * kecepatan_cahaya;
 
         // Display the result
         System.out.println("Dalam " + hari + " hari, cahaya menjelajah berkisar " + jarak + " km.");
     }
 }
 