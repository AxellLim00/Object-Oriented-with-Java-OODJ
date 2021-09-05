package Class;

import User.Person;
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

public class Supplier extends Person implements Updateable{
    
    Items item = new Items();
    
    public Supplier(){
        this.item.filename = "src/Database/Supplier.txt";
        this.item.tempname = "src/Database/TempSup.txt";
    }
    
    public Supplier(String Name){
        this.item.filename = "src/Database/Supplier.txt";
        this.item.tempname = "src/Database/TempSup.txt";
        this.item.name = Name;
    }
    
    public Supplier(String Name, String Email, String Contactno){
        this.item.filename = "src/Database/Supplier.txt";
        this.item.tempname = "src/Database/TempSup.txt";
        this.item.name = Name;
        super.email = Email;
        super.contactNo = Contactno;
    }
    
    public Supplier(String ID, boolean flag){
        this.item.filename = "src/Database/Supplier.txt";
        this.item.tempname = "src/Database/TempSup.txt";
        this.item.id = ID;
    }
    
    @Override
    public boolean create() {
        this.item.id = UUID.randomUUID().toString();
        
        try(PrintWriter p = new PrintWriter(new FileWriter(this.item.filename, true))){
            this.item.data = String.join("|", this.item.id, this.item.name, super.email, super.contactNo);
            p.println(this.item.data);
            p.close();
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
                    System.out.println("found it");
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
                        super.email = this.item.record.get(2);
                        super.contactNo = this.item.record.get(3);
                    this.item.line = this.item.data;
                    search = true;
                    break;
                }
                
                if(search){
                    break;
                }
            }
            return search;
        } catch(FileNotFoundException e) {
            return false;
        }
    }
    
    @Override
    public String toString() { 
        String print = String.join("\n", this.item.id, this.item.name, super.email, super.contactNo);
        return print;
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
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Items.class.getName()).log(Level.SEVERE, null, ex);
        }
        return namelist;
    }

    public boolean setData(ArrayList<String> inputrecord){
        try{
            this.item.name = inputrecord.get(0);
            super.email = inputrecord.get(1);
            super.contactNo = inputrecord.get(2);
            this.item.line = String.join("|", this.item.id, this.item.name, super.email, super.contactNo);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }
}
