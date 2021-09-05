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
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.net.URL;

public class Catalouge extends Items implements Updateable{
    Items item = new Items();
    String festid;
    ArrayList<ArrayList<String>> productlist = new ArrayList<>();
    String productlistfordata = "";
    
    public Catalouge(){
        this.item.filename = "src/Database/Catalouge.txt";
        this.item.tempname = "src/Database/TempCatal.txt";
    }
    
    public Catalouge(String Name){
        this.item.filename = "src/Database/Catalouge.txt";
        this.item.tempname = "src/Database/TempCatal.txt";
        this.item.name = Name;
    }
    
    public Catalouge(String Name, String FestID, ArrayList<ArrayList<String>> Products){
        this.item.filename = "src/Database/Catalouge.txt";
        this.item.tempname = "src/Database/TempCatal.txt";
        this.item.name = Name;
        this.festid = FestID;
        this.productlist = Products;
        for(int x=0;x<this.productlist.size();x++){
            String productinfo;
            productinfo = String.join("*", productlist.get(x).get(0), productlist.get(x).get(1));
            if (x == 0){
                this.productlistfordata = productinfo;
            }else{
                this.productlistfordata = String.join(",", this.productlistfordata, productinfo );
            }
        }
	
    }
    
    public boolean exportCatalouge() {
        Document document = new Document();
      try
      {
        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("src/PDF/"+this.item.name+".pdf"));
        document.open();
        Festival fest = new Festival(this.festid, true);
        fest.read();
        ArrayList<String> festinfo = fest.getData();
        String festname = festinfo.get(1);
        String date = festinfo.get(2);
         
         
        for(int i=0; i<this.productlist.size(); i++){
            Product product = new Product(this.productlist.get(i).get(0));
            product.read();
            ArrayList<String> prodinfo = product.getData();
            String prodname = prodinfo.get(1);
            Double price = Double.parseDouble(prodinfo.get(2));
            String image = prodinfo.get(6);
            Double discount = Double.parseDouble(this.productlist.get(i).get(1));
             
            if(i%3==0){
                document.add(new Paragraph(festname + " Catalouge", FontFactory.getFont(FontFactory.COURIER_BOLD, 24)));
                document.add(new Paragraph("Don't miss the " + festname + "Special on " + date, FontFactory.getFont(FontFactory.COURIER_OBLIQUE, 15)));
                Image imagelogo = Image.getInstance(new URL("https://www.multichannel.com/.image/t_share/MTU0NTMzNjYyODQ5NzcwOTIz/spacex-logo.png"));
                imagelogo.setAbsolutePosition(432f, 750f);
                imagelogo.scaleAbsolute(133, 75);
                document.add(imagelogo);
                document.add(new Paragraph(" "));
                document.add(new Paragraph(" "));

                Image Product = Image.getInstance(new URL(image));
                Product.scaleAbsolute(100, 100);
                document.add(Product);
                document.add(new Paragraph(prodname, FontFactory.getFont(FontFactory.HELVETICA, 13, Font.ITALIC)));
                document.add(new Paragraph("Original Price : " + price, FontFactory.getFont(FontFactory.HELVETICA, 8, Font.STRIKETHRU)));
                document.add(new Paragraph("NEW Price : " + (price*(1-discount)), FontFactory.getFont(FontFactory.HELVETICA, 12, Font.BOLD)));
                document.add(new Paragraph(" "));
                document.add(new Paragraph(" "));
                document.add(new Paragraph(" "));
            }
            if(i%3==1){
                Image Product = Image.getInstance(new URL(image));
                Product.scaleAbsolute(100, 100);
                document.add(Product);
                document.add(new Paragraph(prodname, FontFactory.getFont(FontFactory.HELVETICA, 13, Font.ITALIC)));
                document.add(new Paragraph("Original Price : " + price, FontFactory.getFont(FontFactory.HELVETICA, 8, Font.STRIKETHRU)));
                document.add(new Paragraph("NEW Price : " + (price*(1-discount)), FontFactory.getFont(FontFactory.HELVETICA, 12, Font.BOLD)));
                document.add(new Paragraph(" "));
                document.add(new Paragraph(" "));
                document.add(new Paragraph(" "));
            }
            if(i%3==2){
                Image Product = Image.getInstance(new URL(image));
                Product.scaleAbsolute(100, 100);
                document.add(Product);
                document.add(new Paragraph(prodname, FontFactory.getFont(FontFactory.HELVETICA, 13, Font.ITALIC)));
                document.add(new Paragraph("Original Price : " + price, FontFactory.getFont(FontFactory.HELVETICA, 8, Font.STRIKETHRU)));
                document.add(new Paragraph("NEW Price : " + (price*(1-discount)), FontFactory.getFont(FontFactory.HELVETICA, 12, Font.BOLD)));
                document.add(new Paragraph(" "));
                document.add(new Paragraph(" "));
                document.add(new Paragraph(" "));
                document.add(new Paragraph("\t\t\t\t\t\t\t\t\t\t\t"+(i/3)));
            }
        }
         
        writer.close();
        return true;
    }catch (DocumentException | IOException e)
    {
        return false;
    }
}

    @Override
    public boolean create() {
        this.item.id = UUID.randomUUID().toString();
        
        try(PrintWriter p = new PrintWriter(new FileWriter(this.item.filename, true))){
            this.item.data = String.join("|", this.item.id, this.item.name, this.festid, this.productlistfordata);
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
                    System.out.println("got it");
                    this.item.id = this.item.record.get(0);
                    this.item.name = this.item.record.get(1);
                    this.festid = this.item.record.get(2);
                    this.productlistfordata = this.item.record.get(3);
                    ArrayList<String> outer = new  ArrayList<>(Arrays.asList(this.productlistfordata.split("\\,")));
                    for(int i=0; i<outer.size(); i++){
                        ArrayList<String> inner = new  ArrayList<>(Arrays.asList(outer.get(i).split("\\*")));
                        productlist.add(inner);
                    }
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
    
    public ArrayList<ArrayList<String>> getProduct(){
        return this.productlist;
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
                    read.close();
                    break;
                }
            }
            read.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Items.class.getName()).log(Level.SEVERE, null, ex);
        }
        return namelist;
    }
	
    public boolean setData(ArrayList<String> inputrecord, ArrayList<ArrayList<String>> Products){
        try{
            this.item.name = inputrecord.get(0);
            this.festid = inputrecord.get(1);
            this.productlist = Products;
            this.productlistfordata = "";
            for(int x=0;x<this.productlist.size();x++){
                String productinfo;
                productinfo = String.join("*", productlist.get(x).get(0), productlist.get(x).get(1));
                if (x == 0){
                    this.productlistfordata = productinfo;
                }else{
                    this.productlistfordata = String.join(",", this.productlistfordata, productinfo );
                }
            }
            this.item.line = String.join("|", this.item.id, this.item.name, this.festid,this.productlistfordata);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }
}
