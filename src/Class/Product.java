package Class;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Product implements Updateable{
    private double price = 0;
    private int quantity;
    private String supplierid;
    private ArrayList<String> categoryids;
    private String categoryfordata;
    private String imagename;
    private Items item = new Items();

     public Product(){
        this.item.filename = "src/Database/Item.txt";
        this.item.tempname = "src/Database/TempItem.txt";
     }
    
    public Product(String Name, String Price, String Quantity, String SupplierID, ArrayList<String> CategoryIDS, String Image){
        this.item.filename = "src/Database/Item.txt";
        this.item.tempname = "src/Database/TempItem.txt";
        this.item.name = Name;
        this.price = Double.valueOf(Price);
        this.quantity = Integer.parseInt(Quantity);
        this.supplierid = SupplierID;
        this.categoryids = CategoryIDS;
        this.imagename = Image;
        categoryfordata = String.join(",", this.categoryids);
    }

    public Product(String Name){
        this.item.filename = "src/Database/Item.txt";
        this.item.tempname = "src/Database/TempItem.txt";
        this.item.name = Name;
    }

    @Override
    public boolean create() {
        this.item.id = UUID.randomUUID().toString();

        try(PrintWriter p = new PrintWriter(new FileWriter(this.item.filename, true))){
            this.item.data = String.join("|", this.item.id, this.item.name, String.valueOf(price), String.valueOf(quantity), this.supplierid, this.categoryfordata, this.imagename);
            p.println(this.item.data);
            
            return true;
        } catch(IOException e) {
            return false;
        }
    }

    @Override
    public boolean delete() {
        boolean search = false;
        try {
            File oriFile = new File(this.item.filename);
            File tempFile = new File(this.item.tempname);
            
            BufferedReader readFile = null;
            try {
                readFile = new BufferedReader(new FileReader(oriFile));
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
            }
            BufferedWriter writeFile = null;
            try {
                writeFile = new BufferedWriter(new FileWriter(tempFile));
            } catch (IOException ex) {
                Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
            
            this.item.data = this.item.line;
            String currentLine;
            
            while((currentLine = readFile.readLine()) != null) {
                if(currentLine.trim().equals(this.item.data)) {
                    search = true;
                    continue;
                }
                writeFile.write(currentLine + System.getProperty("line.separator"));
            }
            writeFile.close();
            readFile.close();
            if(search){
                oriFile.delete();
                return tempFile.renameTo(oriFile);
            }else{
                tempFile.delete();
                return false;
            }
            
        } catch (IOException ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean update() {
        boolean search = false;
        try {
            File oriFile = new File(this.item.filename);
            File tempFile = new File(this.item.tempname);
            
            BufferedReader readFile = null;
            try {
                readFile = new BufferedReader(new FileReader(oriFile));
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
            }
            BufferedWriter writeFile = null;
            try {
                writeFile = new BufferedWriter(new FileWriter(tempFile));
            } catch (IOException ex) {
                Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
            
            this.item.data = this.item.line;
            String currentLine;
            
            while((currentLine = readFile.readLine()) != null) {
                if(currentLine.trim().startsWith(this.item.id)){ 
                    String recordUpdated = this.item.line;
                    writeFile.write(recordUpdated + System.getProperty("line.separator"));
                    search = true;
                    continue;
                }
                writeFile.write(currentLine + System.getProperty("line.separator"));
            }
            writeFile.close();
            readFile.close();
            if(search){
                oriFile.delete();
                return tempFile.renameTo(oriFile);
            }else{
                tempFile.delete();
                return false;
            }
            
        } catch (IOException ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean read() {
        boolean search = false;
        ArrayList<ArrayList<String>> list = new ArrayList<>();
        try(Scanner read = new Scanner(new File(this.item.filename))){
            while (read.hasNextLine()) {
                this.item.data = read.nextLine();
                this.item.record = new  ArrayList<>(Arrays.asList(this.item.data.split("\\|")));
                list.add(this.item.record);
                if (this.item.name.equals(this.item.record.get(1))||this.item.id.equals(this.item.record.get(0))) {
                    this.item.id = this.item.record.get(0);
                    this.item.name = this.item.record.get(1);
                    this.price = Double.valueOf(this.item.record.get(2));
                    this.quantity = Integer.parseInt(this.item.record.get(3));
                    this.supplierid = this.item.record.get(4);
                    this.categoryfordata = this.item.record.get(5);
                    this.categoryids = new  ArrayList<>(Arrays.asList(this.categoryfordata.split("\\,")));
                    this.imagename = this.item.record.get(6);
                    this.item.line = this.item.data;
                    search = true;
                    break;
                }
                
                if(search){
                    break;
                }
            }
            read.close();
            return search;
        } catch(FileNotFoundException e) {
            return false;
        }
    }
	
    @Override
    public String toString() { 
        return String.format(this.item.id + "\n" + this.item.name + "\n" + String.valueOf(this.price) + "\n" + String.valueOf(this.quantity) + "\n" + this.supplierid  + "\n" + this.categoryids); 
    } 
    
    
    
    public ArrayList<String> getCategoryIDs(){
        return this.categoryids;
    }
    
    @Override
    public ArrayList<String> getData(){
        return this.item.record;
    }

    @Override
    public ArrayList<String> getAllName() {
        ArrayList<String> namelist = new ArrayList<>();
        try(Scanner read = new Scanner(new File(this.item.filename))){

            while (read.hasNextLine()) {

                this.item.data = read.nextLine();
                this.item.record = new  ArrayList<>(Arrays.asList(this.item.data.split("\\|")));
                try{
                    namelist.add(this.item.record.get(1));
                }catch(Exception e){
                    break;
                }
            }
            read.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Items.class.getName()).log(Level.SEVERE, null, ex);
        }
        return namelist;
    }
    
    public boolean setData(ArrayList<String> inputrecord, ArrayList<String> CategoryIDS){
        try{
            this.item.name = inputrecord.get(0);
            this.price = Double.valueOf(inputrecord.get(1));
            this.quantity = Integer.parseInt(inputrecord.get(2));
            this.supplierid = inputrecord.get(3);
            this.categoryids = CategoryIDS;
            this.categoryfordata = String.join(",", categoryids);
            this.imagename = inputrecord.get(4);
            
            this.item.line = String.join("|", this.item.id, this.item.name, String.valueOf(price), String.valueOf(quantity), this.supplierid, this.categoryfordata, this.imagename);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
        
    }
}
