package com.poo.ecommerce;
import java.util.ArrayList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*; //JOption didnt worked
import java.io.IOException;
import java.io.*;
import java.util.List;

@SpringBootApplication
public class EcommerceApplication {
	public static void main(String[] args) throws IOException {
		SpringApplication.run(EcommerceApplication.class, args);
		//reading csv;
		String file = "src/bd.csv";
		String line;
		List<Item> items = new ArrayList<>();
		try (BufferedReader br =
					 new BufferedReader(new FileReader(file))) {
			while ((line = br.readLine()) != null) {

				String[] vector = line.split(",");
				int idItem = Integer.parseInt(vector[0]);
				String category = vector[1];
				String description = vector[2];
				int price = Integer.parseInt(vector[3]);
				int width = Integer.parseInt(vector[4]);
				int height = Integer.parseInt(vector[5]);
				int length = Integer.parseInt(vector[6]);
				int weight = Integer.parseInt(vector[7]);

				Item item = new Item(idItem, category, description, price, new Dimension(width, height, length), weight);
				items.add(item);

			}
		} catch (IOException e) {
			System.out.println(e);
		}
		//writing in csv
		int idItem;
		String category;
		String description;
		int price;
		int width;
		int height;
		int lenght;
		int weight;
		public static void saveItem(int idItem, String category, String description, int price, int width, int height, int length, int weight, String file){
			try{
				FileWriter fw
			}
			catch (Exception e){

			}
		}
	}
}