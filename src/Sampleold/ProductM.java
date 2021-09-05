package Sampleold;

import Class.Category;
import Class.Product;
import Class.Supplier;
import java.awt.CardLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ProductM extends javax.swing.JFrame {
    ArrayList<String> category = new ArrayList<String>();    
    CardLayout cardlayout;
    public ProductM() {
        initComponents();
        cardlayout = (CardLayout)(MainCard.getLayout());
        Product prod = new Product();
        ArrayList<String> prodnames = prod.getAllName();
            for(int i=0; i<prodnames.size(); i++){
                System.out.println(prodnames.get(i));
                ItemName.addItem(prodnames.get(i));
            }
        Supplier sup = new Supplier();
            ArrayList<String> supnames = sup.getAllName();
            for(int i=0; i<supnames.size(); i++){
                suppliertextbox.addItem(supnames.get(i));
                jComboBox2.addItem(supnames.get(i));
            }
        
        Category cat = new Category();
            ArrayList<String> catnames = cat.getAllName();
            checkbox1.setLabel(catnames.get(0));
            checkbox2.setLabel(catnames.get(1));
            checkbox3.setLabel(catnames.get(2));
            checkbox4.setLabel(catnames.get(3));
            checkbox5.setLabel(catnames.get(4));
            checkbox6.setLabel(catnames.get(5));
            checkbox7.setLabel(catnames.get(6));
            checkbox8.setLabel(catnames.get(7));
            checkbox9.setLabel(catnames.get(8));
            checkbox10.setLabel(catnames.get(9));
            checkbox11.setLabel(catnames.get(0));
            checkbox12.setLabel(catnames.get(1));
            checkbox13.setLabel(catnames.get(2));
            checkbox14.setLabel(catnames.get(3));
            checkbox15.setLabel(catnames.get(4));
            checkbox16.setLabel(catnames.get(5));
            checkbox17.setLabel(catnames.get(6));
            checkbox18.setLabel(catnames.get(7));
            checkbox19.setLabel(catnames.get(8));
            checkbox20.setLabel(catnames.get(9));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        MainCard = new javax.swing.JPanel();
        ProductPanel = new javax.swing.JTabbedPane();
        CreateProduct = new javax.swing.JPanel();
        checkbox11 = new java.awt.Checkbox();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        checkbox12 = new java.awt.Checkbox();
        urltext = new javax.swing.JTextField();
        checkbox13 = new java.awt.Checkbox();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        checkbox14 = new java.awt.Checkbox();
        checkbox15 = new java.awt.Checkbox();
        checkbox16 = new java.awt.Checkbox();
        checkbox17 = new java.awt.Checkbox();
        Image1 = new javax.swing.JLabel();
        checkbox18 = new java.awt.Checkbox();
        quantity = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        checkbox19 = new java.awt.Checkbox();
        jLabel10 = new javax.swing.JLabel();
        checkbox20 = new java.awt.Checkbox();
        jLabel11 = new javax.swing.JLabel();
        Create = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        view = new javax.swing.JButton();
        ManageProduct = new javax.swing.JPanel();
        ItemID = new javax.swing.JLabel();
        ItemName = new javax.swing.JComboBox<>();
        Image2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nametextbox = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        pricetextbox = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        quantitytextbox = new javax.swing.JTextField();
        suppliertextbox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        urltextbox = new javax.swing.JTextField();
        checkbox1 = new java.awt.Checkbox();
        checkbox2 = new java.awt.Checkbox();
        checkbox3 = new java.awt.Checkbox();
        checkbox4 = new java.awt.Checkbox();
        checkbox5 = new java.awt.Checkbox();
        checkbox6 = new java.awt.Checkbox();
        checkbox7 = new java.awt.Checkbox();
        checkbox8 = new java.awt.Checkbox();
        checkbox9 = new java.awt.Checkbox();
        checkbox10 = new java.awt.Checkbox();
        Update = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        FestivalPanel = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        CatalogPanel = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        SupplierPanel = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        viewprofile = new javax.swing.JLabel();
        logoutbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Product Manager");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setText("Product");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Festival");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Catalog");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Supplier");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SmallSize.png"))); // NOI18N

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        MainCard.setBackground(new java.awt.Color(255, 255, 255));
        MainCard.setLayout(new java.awt.CardLayout());

        CreateProduct.setBackground(new java.awt.Color(255, 255, 255));

        checkbox11.setLabel("checkbox4");

        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });

        jLabel7.setText("Quantity");

        checkbox12.setLabel("checkbox1");

        urltext.setToolTipText("");

        checkbox13.setLabel("checkbox1");

        jLabel8.setText("Supplier");

        jLabel9.setText("Price");

        checkbox14.setLabel("checkbox5");

        checkbox15.setLabel("checkbox9");

        checkbox16.setLabel("checkbox7");

        checkbox17.setLabel("checkbox6");

        Image1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 153)));

        checkbox18.setLabel("checkbox8");

        checkbox19.setLabel("checkbox10");

        jLabel10.setText("Item Name");

        checkbox20.setLabel("checkbox3");

        jLabel11.setText("Insert Image");

        Create.setText("Create");
        Create.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CreateMouseClicked(evt);
            }
        });

        jLabel13.setText("Create New Product");

        view.setText("View");
        view.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout CreateProductLayout = new javax.swing.GroupLayout(CreateProduct);
        CreateProduct.setLayout(CreateProductLayout);
        CreateProductLayout.setHorizontalGroup(
            CreateProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreateProductLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CreateProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CreateProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(CreateProductLayout.createSequentialGroup()
                            .addGroup(CreateProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(checkbox13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(checkbox12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(checkbox11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(checkbox14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                            .addGroup(CreateProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(checkbox18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(checkbox17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(checkbox15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(checkbox16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(CreateProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10)
                            .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(jLabel9)
                            .addComponent(price)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(quantity)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11)
                            .addComponent(urltext)))
                    .addComponent(jLabel13))
                .addGroup(CreateProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CreateProductLayout.createSequentialGroup()
                        .addGroup(CreateProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CreateProductLayout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addGroup(CreateProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(checkbox20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(checkbox19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(CreateProductLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(CreateProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(view)
                                    .addComponent(Image1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(86, 86, 86))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CreateProductLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Create, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        CreateProductLayout.setVerticalGroup(
            CreateProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreateProductLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(CreateProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CreateProductLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CreateProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(urltext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(view, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Image1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(CreateProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CreateProductLayout.createSequentialGroup()
                        .addGroup(CreateProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(CreateProductLayout.createSequentialGroup()
                                .addGroup(CreateProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(CreateProductLayout.createSequentialGroup()
                                        .addComponent(checkbox15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(checkbox16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(CreateProductLayout.createSequentialGroup()
                                        .addComponent(checkbox19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30))
                                    .addComponent(checkbox20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkbox17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CreateProductLayout.createSequentialGroup()
                                .addComponent(checkbox11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkbox12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkbox13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CreateProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(checkbox18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkbox14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Create, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        ProductPanel.addTab("Create", CreateProduct);

        ManageProduct.setBackground(new java.awt.Color(255, 255, 255));

        ItemID.setText("Item ID: ");

        ItemName.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ItemNameItemStateChanged(evt);
            }
        });

        Image2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 153)));

        jLabel1.setText("Item Name");

        jLabel3.setText("Price");

        jLabel4.setText("Quantity");

        jLabel5.setText("Supplier");

        jLabel6.setText("Insert Image");

        checkbox1.setLabel("checkbox1");

        checkbox2.setLabel("checkbox1");

        checkbox3.setLabel("checkbox3");

        checkbox4.setLabel("checkbox4");

        checkbox5.setLabel("checkbox5");

        checkbox6.setLabel("checkbox6");

        checkbox7.setLabel("checkbox7");

        checkbox8.setLabel("checkbox8");

        checkbox9.setLabel("checkbox9");

        checkbox10.setLabel("checkbox10");

        Update.setText("Update");
        Update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateMouseClicked(evt);
            }
        });

        jButton6.setText("Delete");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        jButton5.setText("View");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ManageProductLayout = new javax.swing.GroupLayout(ManageProduct);
        ManageProduct.setLayout(ManageProductLayout);
        ManageProductLayout.setHorizontalGroup(
            ManageProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageProductLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ManageProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ItemID)
                    .addGroup(ManageProductLayout.createSequentialGroup()
                        .addGroup(ManageProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(ManageProductLayout.createSequentialGroup()
                                .addGroup(ManageProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(checkbox4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(checkbox3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(checkbox2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(checkbox1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(132, 132, 132)
                                .addGroup(ManageProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(checkbox8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(checkbox7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(checkbox6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(checkbox5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(ManageProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ItemName, 0, 300, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addComponent(nametextbox)
                                .addComponent(jLabel3)
                                .addComponent(pricetextbox)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(quantitytextbox)
                                .addComponent(suppliertextbox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addComponent(urltextbox)))
                        .addGroup(ManageProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ManageProductLayout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addGroup(ManageProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkbox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(ManageProductLayout.createSequentialGroup()
                                        .addComponent(checkbox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                        .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ManageProductLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ManageProductLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ManageProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Image2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton5))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(69, 69, 69))
        );
        ManageProductLayout.setVerticalGroup(
            ManageProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageProductLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ItemID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ManageProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ManageProductLayout.createSequentialGroup()
                        .addComponent(ItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nametextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pricetextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(quantitytextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(suppliertextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ManageProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(urltextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5)))
                    .addComponent(Image2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(ManageProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ManageProductLayout.createSequentialGroup()
                        .addComponent(Update)
                        .addGap(12, 12, 12)
                        .addComponent(jButton6))
                    .addGroup(ManageProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ManageProductLayout.createSequentialGroup()
                            .addComponent(checkbox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(checkbox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(checkbox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(checkbox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(ManageProductLayout.createSequentialGroup()
                            .addGroup(ManageProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(ManageProductLayout.createSequentialGroup()
                                    .addComponent(checkbox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(checkbox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(ManageProductLayout.createSequentialGroup()
                                    .addComponent(checkbox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(checkbox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(checkbox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(checkbox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        ProductPanel.addTab("Manage", ManageProduct);

        MainCard.add(ProductPanel, "ProductCard");

        FestivalPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setText("Fes");

        javax.swing.GroupLayout FestivalPanelLayout = new javax.swing.GroupLayout(FestivalPanel);
        FestivalPanel.setLayout(FestivalPanelLayout);
        FestivalPanelLayout.setHorizontalGroup(
            FestivalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FestivalPanelLayout.createSequentialGroup()
                .addGap(287, 287, 287)
                .addComponent(jLabel12)
                .addContainerGap(406, Short.MAX_VALUE))
        );
        FestivalPanelLayout.setVerticalGroup(
            FestivalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FestivalPanelLayout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(jLabel12)
                .addContainerGap(342, Short.MAX_VALUE))
        );

        MainCard.add(FestivalPanel, "FestivalCard");

        CatalogPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setText("Cata");

        javax.swing.GroupLayout CatalogPanelLayout = new javax.swing.GroupLayout(CatalogPanel);
        CatalogPanel.setLayout(CatalogPanelLayout);
        CatalogPanelLayout.setHorizontalGroup(
            CatalogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CatalogPanelLayout.createSequentialGroup()
                .addGap(272, 272, 272)
                .addComponent(jLabel14)
                .addContainerGap(413, Short.MAX_VALUE))
        );
        CatalogPanelLayout.setVerticalGroup(
            CatalogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CatalogPanelLayout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addComponent(jLabel14)
                .addContainerGap(334, Short.MAX_VALUE))
        );

        MainCard.add(CatalogPanel, "CatalogCard");

        SupplierPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setText("Supply");

        javax.swing.GroupLayout SupplierPanelLayout = new javax.swing.GroupLayout(SupplierPanel);
        SupplierPanel.setLayout(SupplierPanelLayout);
        SupplierPanelLayout.setHorizontalGroup(
            SupplierPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SupplierPanelLayout.createSequentialGroup()
                .addContainerGap(386, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(282, 282, 282))
        );
        SupplierPanelLayout.setVerticalGroup(
            SupplierPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SupplierPanelLayout.createSequentialGroup()
                .addContainerGap(402, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(168, 168, 168))
        );

        MainCard.add(SupplierPanel, "SupplierCard");

        viewprofile.setForeground(new java.awt.Color(0, 102, 153));
        viewprofile.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        viewprofile.setText("View Profile");

        logoutbutton.setText("LogOut");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(viewprofile, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logoutbutton)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(viewprofile)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logoutbutton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MainCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cardlayout.show(MainCard, "ProductCard");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        cardlayout.show(MainCard, "FestivalCard");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        cardlayout.show(MainCard, "CatalogCard");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        cardlayout.show(MainCard, "SupplierCard");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
        
    }//GEN-LAST:event_jComboBox2ItemStateChanged

    private void ItemNameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ItemNameItemStateChanged
        Product prod = new Product(ItemName.getSelectedItem().toString());
        prod.read();
        ItemID.setText("Item ID: " + prod.getData().get(0));
        nametextbox.setText(prod.getData().get(1));
        pricetextbox.setText(prod.getData().get(2));
        quantitytextbox.setText(prod.getData().get(3));
        urltextbox.setText(prod.getData().get(6));
        
        Supplier sup = new Supplier(prod.getData().get(4), true);
        sup.read();
        suppliertextbox.setSelectedItem(sup.getData().get(1));
        
        ArrayList<String> cat = new ArrayList<>();
        for(int i=0; i<prod.getCategoryIDs().size(); i++){
            Category catname = new Category(prod.getCategoryIDs().get(i), true);
            catname.read();
            cat.add(catname.getData().get(1));
        }
        
        if(cat.contains(checkbox1.getLabel())){
            checkbox1.setState(true);
        }else{
            checkbox1.setState(false);
        }
        
        if(cat.contains(checkbox2.getLabel())){
            checkbox2.setState(true);
        }else{
            checkbox2.setState(false);
        }
        if(cat.contains(checkbox4.getLabel())){
            checkbox4.setState(true);
        }else{
            checkbox4.setState(false);
        }
        if(cat.contains(checkbox5.getLabel())){
            checkbox5.setState(true);
        }else{
            checkbox5.setState(false);
        }
        if(cat.contains(checkbox6.getLabel())){
            checkbox6.setState(true);
        }else{
            checkbox6.setState(false);
        }
        if(cat.contains(checkbox7.getLabel())){
            checkbox7.setState(true);
        }else{
            checkbox7.setState(false);
        }
        if(cat.contains(checkbox8.getLabel())){
            checkbox8.setState(true);
        }else{
            checkbox8.setState(false);
        }
        if(cat.contains(checkbox9.getLabel())){
            checkbox9.setState(true);
        }else{
            checkbox9.setState(false);
        }
        if(cat.contains(checkbox10.getLabel())){
            checkbox10.setState(true);
        }else{
            checkbox10.setState(false);
        }
        if(cat.contains(checkbox3.getLabel())){
            checkbox3.setState(true);
        }else{
            checkbox3.setState(false);
        }
    }//GEN-LAST:event_ItemNameItemStateChanged

    private void UpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateMouseClicked
        category.clear();
        boolean input = false;
        try{
            Double.parseDouble(pricetextbox.getText()); 
            input = true;
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Please input Price as numbers");
            input = false;
        }
        try{
            Integer.parseInt(quantitytextbox.getText());
            input = true;
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Please input Quantity as numbers");
            input = false;
        }
        
        if(checkbox1.getState()){
            Category cat = new Category(checkbox1.getLabel());
            cat.read();
            category.add(cat.getData().get(0));
        }
        if(checkbox3.getState()){
            Category cat = new Category(checkbox3.getLabel());
            cat.read();
            category.add(cat.getData().get(0));
        }
        if(checkbox4.getState()){
            Category cat = new Category(checkbox4.getLabel());
            cat.read();
            category.add(cat.getData().get(0));
        }
        if(checkbox5.getState()){
            Category cat = new Category(checkbox5.getLabel());
            cat.read();
            category.add(cat.getData().get(0));
        }
        if(checkbox6.getState()){
            Category cat = new Category(checkbox6.getLabel());
            cat.read();
            category.add(cat.getData().get(0));
        }
        if(checkbox7.getState()){
            Category cat = new Category(checkbox7.getLabel());
            cat.read();
            category.add(cat.getData().get(0));
        }
        if(checkbox8.getState()){
            Category cat = new Category(checkbox8.getLabel());
            cat.read();
            category.add(cat.getData().get(0));
        }
        if(checkbox9.getState()){
            Category cat = new Category(checkbox9.getLabel());
            cat.read();
            category.add(cat.getData().get(0));
        }
        if(checkbox10.getState()){
            Category cat = new Category(checkbox10.getLabel());
            cat.read();
            category.add(cat.getData().get(0));
        }
        if(checkbox11.getState()){
            Category cat = new Category(checkbox11.getLabel());
            cat.read();
            category.add(cat.getData().get(0));
        }
        
        Product prod = new Product(ItemName.getSelectedItem().toString());
        prod.read();
        
        ArrayList<String> inputs;
        inputs = new ArrayList<>();
        inputs.add(0, nametextbox.getText());
        inputs.add(1, pricetextbox.getText());
        inputs.add(2, quantitytextbox.getText());
        inputs.add(3, suppliertextbox.getSelectedItem().toString());
        inputs.add(4, urltextbox.getText());
        
        prod.setData(inputs, category);
        if(prod.update() || input){
            JOptionPane.showMessageDialog(null, "Product Updated");
        }else{
            JOptionPane.showMessageDialog(null, "Product Fail to Update");
        }
    }//GEN-LAST:event_UpdateMouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        Product prod = new Product(ItemName.getSelectedItem().toString());
        prod.read();
        if(prod.delete()){
            JOptionPane.showMessageDialog(null, "Product Deleted");
        }else{
            JOptionPane.showMessageDialog(null, "Product Fail to delete");
        }
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        String url = urltextbox.getText();
        try {
            URL urls = new URL(url);
            BufferedImage image;
            image = (BufferedImage) ImageIO.read(new URL(url));
            Image img = image.getScaledInstance(Image2.getWidth(), Image2.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageicon = new ImageIcon(img);
            Image2.setIcon(imageicon);
        } catch (MalformedURLException ex) {
            JOptionPane.showMessageDialog(null, "Image not Found e1");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Image not Found e2");
        }
    }//GEN-LAST:event_jButton5MouseClicked

    private void viewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewMouseClicked
        String url = urltext.getText();
        try {
            URL urls = new URL(url);
            BufferedImage image;
            image = (BufferedImage) ImageIO.read(new URL(url));
            Image img = image.getScaledInstance(Image1.getWidth(), Image1.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageicon = new ImageIcon(img);
            Image1.setIcon(imageicon);
        } catch (MalformedURLException ex) {
            JOptionPane.showMessageDialog(null, "Image not Found e1");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Image not Found e2");
        }
    }//GEN-LAST:event_viewMouseClicked

    private void CreateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateMouseClicked
        category.clear();
        boolean input = false;
        try{
            Double.parseDouble(price.getText());
            input = true;
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Please input Price as numbers");
            input = false;
        }

        try{
            Integer.parseInt(quantity.getText());
            input = true;
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Please input Quantity as numbers");
            input = false;
        }

        if(checkbox11.getState()){
            Category cat = new Category(checkbox11.getLabel());
            cat.read();
            category.add(cat.getData().get(0));
        }
        if(checkbox12.getState()){
            Category cat = new Category(checkbox12.getLabel());
            cat.read();
            category.add(cat.getData().get(0));
        }
        if(checkbox13.getState()){
            Category cat = new Category(checkbox13.getLabel());
            cat.read();
            category.add(cat.getData().get(0));
        }
        if(checkbox14.getState()){
            Category cat = new Category(checkbox14.getLabel());
            cat.read();
            category.add(cat.getData().get(0));
        }
        if(checkbox15.getState()){
            Category cat = new Category(checkbox15.getLabel());
            cat.read();
            category.add(cat.getData().get(0));
        }
        if(checkbox16.getState()){
            Category cat = new Category(checkbox16.getLabel());
            cat.read();
            category.add(cat.getData().get(0));
        }
        if(checkbox17.getState()){
            Category cat = new Category(checkbox17.getLabel());
            cat.read();
            category.add(cat.getData().get(0));
        }
        if(checkbox18.getState()){
            Category cat = new Category(checkbox18.getLabel());
            cat.read();
            category.add(cat.getData().get(0));
        }
        if(checkbox19.getState()){
            Category cat = new Category(checkbox19.getLabel());
            cat.read();
            category.add(cat.getData().get(0));
        }
        if(checkbox20.getState()){
            Category cat = new Category(checkbox20.getLabel());
            cat.read();
            category.add(cat.getData().get(0));
        }

        Supplier sup = new Supplier(jComboBox2.getSelectedItem().toString());
        sup.read();
        String supid = sup.getData().get(0);
        Product productcreated;
        productcreated = new Product(name.getText(),price.getText(), quantity.getText(), supid, category, urltext.getText());
        if(productcreated.create() && input){
            JOptionPane.showMessageDialog(null, "Product Saved/Created");
        }else{
            JOptionPane.showMessageDialog(null, "Product FAIL to Saved/Created");
        }
    }//GEN-LAST:event_CreateMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CatalogPanel;
    private javax.swing.JButton Create;
    private javax.swing.JPanel CreateProduct;
    private javax.swing.JPanel FestivalPanel;
    private javax.swing.JLabel Image1;
    private javax.swing.JLabel Image2;
    private javax.swing.JLabel ItemID;
    private javax.swing.JComboBox<String> ItemName;
    private javax.swing.JPanel MainCard;
    private javax.swing.JPanel ManageProduct;
    private javax.swing.JTabbedPane ProductPanel;
    private javax.swing.JPanel SupplierPanel;
    private javax.swing.JButton Update;
    private java.awt.Checkbox checkbox1;
    private java.awt.Checkbox checkbox10;
    private java.awt.Checkbox checkbox11;
    private java.awt.Checkbox checkbox12;
    private java.awt.Checkbox checkbox13;
    private java.awt.Checkbox checkbox14;
    private java.awt.Checkbox checkbox15;
    private java.awt.Checkbox checkbox16;
    private java.awt.Checkbox checkbox17;
    private java.awt.Checkbox checkbox18;
    private java.awt.Checkbox checkbox19;
    private java.awt.Checkbox checkbox2;
    private java.awt.Checkbox checkbox20;
    private java.awt.Checkbox checkbox3;
    private java.awt.Checkbox checkbox4;
    private java.awt.Checkbox checkbox5;
    private java.awt.Checkbox checkbox6;
    private java.awt.Checkbox checkbox7;
    private java.awt.Checkbox checkbox8;
    private java.awt.Checkbox checkbox9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton logoutbutton;
    private javax.swing.JTextField name;
    private javax.swing.JTextField nametextbox;
    private javax.swing.JTextField price;
    private javax.swing.JTextField pricetextbox;
    private javax.swing.JTextField quantity;
    private javax.swing.JTextField quantitytextbox;
    private javax.swing.JComboBox<String> suppliertextbox;
    private javax.swing.JTextField urltext;
    private javax.swing.JTextField urltextbox;
    private javax.swing.JButton view;
    private javax.swing.JLabel viewprofile;
    // End of variables declaration//GEN-END:variables
}
