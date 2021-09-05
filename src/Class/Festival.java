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

 public class Festival implements Updateable{
     
    Items item = new Items();
    private String date;
    
     
    public Festival (){
        this.item.filename = "src/Database/Festival.txt";
        this.item.tempname = "src/Database/TempFest.txt";
    }
    
    public Festival (String Name){
        this.item.filename = "src/Database/Festival.txt";
        this.item.tempname = "src/Database/TempFest.txt";
        this.item.name = Name;
    }
    
    
    public Festival (String ID, boolean flag){
        this.item.filename = "src/Database/Category.txt";
        this.item.tempname = "src/Database/TempCategory.txt";
        this.item.id = ID;
    }
    
    public Festival (String Name, String Date){
        this.item.filename = "src/Database/Festival.txt";
        this.item.tempname = "src/Database/TempFest.txt";
        this.item.name = Name;
        this.date = Date;
    }
     
    @Override
    public boolean create() {
        this.item.id = UUID.randomUUID().toString();

        try(PrintWriter p = new PrintWriter(new FileWriter(this.item.filename, true))){
            this.item.data = String.join("|", this.item.id, this.item.name, this.date);
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
                    this.date = this.item.record.get(2);
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
            this.date = inputrecord.get(1);
            this.item.line = String.join("|", this.item.id, this.item.name, this.date);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }
	
	
}
