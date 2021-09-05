package Sample;

import Class.Catalouge;
import Class.Category;
import Class.Festival;
import Class.Product;
import Class.Supplier;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

public class ProductM extends javax.swing.JFrame {
    ArrayList<String> category = new ArrayList<>();
    CardLayout cardlayout;
    public ProductM() {
        initComponents();
        cardlayout = (CardLayout)(MainCard.getLayout());
        Product prod = new Product();
        ArrayList<String> prodnames = prod.getAllName();
        for(int i=0; i<prodnames.size(); i++){
            ItemName.addItem(prodnames.get(i));
            jComboBox8.addItem(prodnames.get(i));
            jComboBox6.addItem(prodnames.get(i));
        }
        Supplier sup = new Supplier();
        ArrayList<String> supnames = sup.getAllName();
        for(int i=0; i<supnames.size(); i++){
            jComboBox1.addItem(supnames.get(i));
            jComboBox2.addItem(supnames.get(i));
            jComboBox5.addItem(supnames.get(i));
        }
        
        Festival fest = new Festival();
        ArrayList<String> festname = fest.getAllName();
        for(int i=0; i<festname.size();i++){
            jComboBox3.addItem(festname.get(i));
            jComboBox7.addItem(festname.get(i));
            jComboBox4.addItem(festname.get(i));
        }
        
        Catalouge cata = new Catalouge();
        ArrayList<String> cataname = cata.getAllName();
        for(int i=0; i<cataname.size();i++){
            jComboBox9.addItem(cataname.get(i));
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
        HomePanel = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        FestivalPane = new javax.swing.JTabbedPane();
        ManageFestival = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        Update2 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        CreateFestival = new javax.swing.JPanel();
        jTextField11 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        Update4 = new javax.swing.JButton();
        SupplierPane = new javax.swing.JTabbedPane();
        ManageSupplier = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        Update6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        CreateSupplier = new javax.swing.JPanel();
        jTextField17 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        Update5 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        CataloguePanel = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox<>();
        jComboBox8 = new javax.swing.JComboBox<>();
        jLabel40 = new javax.swing.JLabel();
        jTextField27 = new javax.swing.JTextField();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jComboBox9 = new javax.swing.JComboBox<>();
        jLabel41 = new javax.swing.JLabel();
        jTextField26 = new javax.swing.JTextField();
        jButton16 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        jTextField25 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        ProfilePanel = new javax.swing.JPanel();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        ProductPanel = new javax.swing.JTabbedPane();
        ManageProduct = new javax.swing.JPanel();
        ItemID = new javax.swing.JLabel();
        ItemName = new javax.swing.JComboBox<>();
        Image2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
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
        jButton17 = new javax.swing.JButton();
        CreateProduct = new javax.swing.JPanel();
        checkbox11 = new java.awt.Checkbox();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        checkbox12 = new java.awt.Checkbox();
        jTextField5 = new javax.swing.JTextField();
        checkbox13 = new java.awt.Checkbox();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        checkbox14 = new java.awt.Checkbox();
        checkbox15 = new java.awt.Checkbox();
        checkbox16 = new java.awt.Checkbox();
        checkbox17 = new java.awt.Checkbox();
        Image1 = new javax.swing.JLabel();
        checkbox18 = new java.awt.Checkbox();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        checkbox19 = new java.awt.Checkbox();
        jLabel10 = new javax.swing.JLabel();
        checkbox20 = new java.awt.Checkbox();
        jLabel11 = new javax.swing.JLabel();
        Create = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jButton18 = new javax.swing.JButton();
        viewprofile = new javax.swing.JLabel();
        logoutbutton = new javax.swing.JButton();
        Close = new javax.swing.JLabel();
        Mini = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Product Manager");
        setUndecorated(true);

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
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homepage(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        MainCard.setBackground(new java.awt.Color(255, 255, 255));
        MainCard.setLayout(new java.awt.CardLayout());

        HomePanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/c.png"))); // NOI18N

        javax.swing.GroupLayout HomePanelLayout = new javax.swing.GroupLayout(HomePanel);
        HomePanel.setLayout(HomePanelLayout);
        HomePanelLayout.setHorizontalGroup(
            HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomePanelLayout.createSequentialGroup()
                .addContainerGap(545, Short.MAX_VALUE)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
        );
        HomePanelLayout.setVerticalGroup(
            HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomePanelLayout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(285, Short.MAX_VALUE))
        );

        MainCard.add(HomePanel, "HomeCard");

        ManageFestival.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setText("Festival ID: ");

        jLabel14.setText("Name");

        jLabel16.setText("Date (dd/MM)");

        jComboBox3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox3ItemStateChanged(evt);
            }
        });

        Update2.setText("Update");
        Update2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Update2MouseClicked(evt);
            }
        });

        jButton7.setText("Delete");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ManageFestivalLayout = new javax.swing.GroupLayout(ManageFestival);
        ManageFestival.setLayout(ManageFestivalLayout);
        ManageFestivalLayout.setHorizontalGroup(
            ManageFestivalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageFestivalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ManageFestivalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ManageFestivalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(ManageFestivalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12)
                            .addComponent(jTextField9, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(jLabel14)
                            .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel16))
                .addContainerGap(726, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ManageFestivalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ManageFestivalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Update2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        ManageFestivalLayout.setVerticalGroup(
            ManageFestivalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageFestivalLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(jLabel16)
                .addGap(7, 7, 7)
                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 232, Short.MAX_VALUE)
                .addComponent(Update2)
                .addGap(12, 12, 12)
                .addComponent(jButton7)
                .addContainerGap())
        );

        FestivalPane.addTab("Manage", ManageFestival);

        CreateFestival.setBackground(new java.awt.Color(255, 255, 255));

        jTextField11.setToolTipText("");

        jLabel17.setText("Name");

        jLabel18.setText("Date (dd/MM)");

        Update4.setText("Add");
        Update4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Update4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout CreateFestivalLayout = new javax.swing.GroupLayout(CreateFestival);
        CreateFestival.setLayout(CreateFestivalLayout);
        CreateFestivalLayout.setHorizontalGroup(
            CreateFestivalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreateFestivalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CreateFestivalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CreateFestivalLayout.createSequentialGroup()
                        .addGroup(CreateFestivalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(CreateFestivalLayout.createSequentialGroup()
                        .addGroup(CreateFestivalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 637, Short.MAX_VALUE)
                        .addComponent(Update4)
                        .addGap(37, 37, 37))))
        );
        CreateFestivalLayout.setVerticalGroup(
            CreateFestivalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreateFestivalLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addGroup(CreateFestivalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Update4)
                    .addGroup(CreateFestivalLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18)
                        .addGap(7, 7, 7)
                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(315, Short.MAX_VALUE))
        );

        FestivalPane.addTab("Create", CreateFestival);

        MainCard.add(FestivalPane, "FestivalCard");

        ManageSupplier.setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setText("Supplier ID:");

        jLabel27.setText("Name");

        jLabel28.setText("Email");

        jComboBox5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox5ItemStateChanged(evt);
            }
        });

        Update6.setText("Update");
        Update6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Update6MouseClicked(evt);
            }
        });

        jButton8.setText("Delete");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });

        jLabel19.setText("Contact Number");

        javax.swing.GroupLayout ManageSupplierLayout = new javax.swing.GroupLayout(ManageSupplier);
        ManageSupplier.setLayout(ManageSupplierLayout);
        ManageSupplierLayout.setHorizontalGroup(
            ManageSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageSupplierLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ManageSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28)
                    .addComponent(jLabel19)
                    .addGroup(ManageSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextField13, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jComboBox5, javax.swing.GroupLayout.Alignment.LEADING, 0, 300, Short.MAX_VALUE)
                        .addComponent(jTextField20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)))
                .addContainerGap(726, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ManageSupplierLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ManageSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Update6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        ManageSupplierLayout.setVerticalGroup(
            ManageSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageSupplierLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel28)
                .addGap(7, 7, 7)
                .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                .addComponent(Update6)
                .addGap(12, 12, 12)
                .addComponent(jButton8)
                .addContainerGap())
        );

        SupplierPane.addTab("Manage", ManageSupplier);

        CreateSupplier.setBackground(new java.awt.Color(255, 255, 255));

        jLabel25.setText("Name");

        jLabel26.setText("Email");

        Update5.setText("Add");
        Update5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Update5MouseClicked(evt);
            }
        });

        jLabel29.setText("Contact Number");

        javax.swing.GroupLayout CreateSupplierLayout = new javax.swing.GroupLayout(CreateSupplier);
        CreateSupplier.setLayout(CreateSupplierLayout);
        CreateSupplierLayout.setHorizontalGroup(
            CreateSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreateSupplierLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CreateSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CreateSupplierLayout.createSequentialGroup()
                        .addGroup(CreateSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25)
                            .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26))
                        .addContainerGap(726, Short.MAX_VALUE))
                    .addGroup(CreateSupplierLayout.createSequentialGroup()
                        .addGroup(CreateSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29)
                            .addComponent(Update5))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        CreateSupplierLayout.setVerticalGroup(
            CreateSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreateSupplierLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26)
                .addGap(7, 7, 7)
                .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel29)
                .addGap(7, 7, 7)
                .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Update5)
                .addContainerGap(212, Short.MAX_VALUE))
        );

        SupplierPane.addTab("Create", CreateSupplier);

        MainCard.add(SupplierPane, "SupplierCard");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Discount (%)"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel36.setText("Manage");

        jLabel37.setText("Catalouge ID: ");

        jLabel38.setText("Festival / Holiday");

        jLabel39.setText("Item Name");

        jLabel40.setText("Discount (in %)");

        jButton13.setText("Add");
        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton13MouseClicked(evt);
            }
        });

        jButton14.setText("Update");
        jButton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton14MouseClicked(evt);
            }
        });

        jButton15.setText("Delete");
        jButton15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton15MouseClicked(evt);
            }
        });
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jComboBox9.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox9ItemStateChanged(evt);
            }
        });

        jLabel41.setText("Name");

        jButton16.setText("Remove Item");
        jButton16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton16MouseClicked(evt);
            }
        });

        jButton19.setText("Export to PDF");
        jButton19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton19MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel38)
                            .addComponent(jLabel41)
                            .addComponent(jLabel40)
                            .addComponent(jLabel39)
                            .addComponent(jButton13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField27, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox8, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox7, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField26, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
                            .addComponent(jComboBox9, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel36)
                                    .addComponent(jLabel37))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jButton19, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton16)
                        .addGap(18, 18, 18)
                        .addComponent(jButton15)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel38)
                        .addGap(7, 7, 7)
                        .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton19)
                        .addGap(9, 9, 9)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton14)
                    .addComponent(jButton15)
                    .addComponent(jButton16))
                .addContainerGap())
        );

        CataloguePanel.addTab("Manage", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Discount (%)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jTable1);

        jLabel31.setText("Create");

        jLabel32.setText("Name");

        jLabel33.setText("Festival / Holiday");

        jLabel34.setText("Item Name");

        jLabel35.setText("Discount (in %)");
        jLabel35.setToolTipText("");

        jButton10.setText("Add");
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });

        jButton11.setText("Create");
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton11MouseClicked(evt);
            }
        });

        jButton12.setText("Remove Item");
        jButton12.setToolTipText("");
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton12MouseClicked(evt);
            }
        });
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField24, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35)
                            .addComponent(jButton10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField25, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel33)
                        .addGap(7, 7, 7)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton10)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11)
                    .addComponent(jButton12))
                .addContainerGap())
        );

        CataloguePanel.addTab("Create", jPanel3);

        MainCard.add(CataloguePanel, "CatalogueCard");

        ProfilePanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel20.setText("USERNAME");

        jLabel21.setText("PASSWORD");

        jLabel22.setText("FULL NAME");

        jLabel23.setText("EMAIL");

        jLabel24.setText("CONTACT NUMBER");

        jButton5.setText("Save");

        jButton9.setText("Cancel");
        jButton9.setToolTipText("");

        javax.swing.GroupLayout ProfilePanelLayout = new javax.swing.GroupLayout(ProfilePanel);
        ProfilePanel.setLayout(ProfilePanelLayout);
        ProfilePanelLayout.setHorizontalGroup(
            ProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProfilePanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(ProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProfilePanelLayout.createSequentialGroup()
                        .addGroup(ProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel23)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(ProfilePanelLayout.createSequentialGroup()
                        .addGroup(ProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField23, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(jTextField22)
                            .addComponent(jTextField15, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField14, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField16, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 454, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton9)
                        .addGap(81, 81, 81))
                    .addGroup(ProfilePanelLayout.createSequentialGroup()
                        .addGroup(ProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel20))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        ProfilePanelLayout.setVerticalGroup(
            ProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProfilePanelLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(ProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ProfilePanelLayout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel21)
                        .addGap(10, 10, 10)
                        .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel23)
                        .addGap(9, 9, 9)
                        .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel24)
                        .addGap(10, 10, 10)
                        .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton5)
                        .addComponent(jButton9)))
                .addContainerGap(163, Short.MAX_VALUE))
        );

        MainCard.add(ProfilePanel, "ProfileCard");

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

        jButton17.setText("View");
        jButton17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton17MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ManageProductLayout = new javax.swing.GroupLayout(ManageProduct);
        ManageProduct.setLayout(ManageProductLayout);
        ManageProductLayout.setHorizontalGroup(
            ManageProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageProductLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ManageProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                .addComponent(jTextField1)
                                .addComponent(jLabel3)
                                .addComponent(jTextField2)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField3)
                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addComponent(jTextField4)))
                        .addGroup(ManageProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ManageProductLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(ManageProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Update)
                                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(ManageProductLayout.createSequentialGroup()
                                .addGroup(ManageProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ManageProductLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Image2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ManageProductLayout.createSequentialGroup()
                                        .addGap(118, 118, 118)
                                        .addGroup(ManageProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(checkbox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(checkbox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(ManageProductLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton17)))
                                .addGap(0, 406, Short.MAX_VALUE))))
                    .addComponent(ItemID))
                .addContainerGap())
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
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ManageProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton17)))
                    .addComponent(Image2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
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
                        .addComponent(checkbox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ManageProductLayout.createSequentialGroup()
                        .addComponent(Update)
                        .addGap(12, 12, 12)
                        .addComponent(jButton6)))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        ProductPanel.addTab("Manage", ManageProduct);

        CreateProduct.setBackground(new java.awt.Color(255, 255, 255));

        checkbox11.setLabel("checkbox4");

        jLabel7.setText("Quantity");

        checkbox12.setLabel("checkbox1");

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

        jButton18.setText("View");
        jButton18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton18MouseClicked(evt);
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
                                .addComponent(checkbox11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(checkbox13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(checkbox12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(checkbox14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(132, 132, 132)
                            .addGroup(CreateProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(checkbox18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(checkbox16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(checkbox17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(checkbox15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(CreateProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10)
                            .addComponent(jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(jLabel9)
                            .addComponent(jTextField6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField7)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11)
                            .addComponent(jTextField5)))
                    .addComponent(jLabel13))
                .addGroup(CreateProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CreateProductLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CreateProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton18)
                            .addComponent(Image1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CreateProductLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(Create, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CreateProductLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addGroup(CreateProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkbox20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkbox19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(412, Short.MAX_VALUE))
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
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CreateProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton18)))
                    .addComponent(Image1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(CreateProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CreateProductLayout.createSequentialGroup()
                        .addComponent(checkbox11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkbox12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkbox13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkbox14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CreateProductLayout.createSequentialGroup()
                        .addGroup(CreateProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(CreateProductLayout.createSequentialGroup()
                                .addComponent(checkbox15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkbox17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CreateProductLayout.createSequentialGroup()
                                .addComponent(checkbox19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkbox20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkbox16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkbox18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Create, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        ProductPanel.addTab("Create", CreateProduct);

        MainCard.add(ProductPanel, "ProductCard");

        viewprofile.setForeground(new java.awt.Color(0, 102, 153));
        viewprofile.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        viewprofile.setText("View Profile");
        viewprofile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickProfile(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                entprofile(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                extprofile(evt);
            }
        });

        logoutbutton.setText("LogOut");

        Close.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        Close.setForeground(new java.awt.Color(0, 102, 153));
        Close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Close.setText("X");
        Close.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CloseMouseExited(evt);
            }
        });

        Mini.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        Mini.setForeground(new java.awt.Color(0, 102, 153));
        Mini.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Mini.setText("-");
        Mini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MiniMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MiniMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MiniMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainCard, javax.swing.GroupLayout.DEFAULT_SIZE, 1034, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(logoutbutton)
                            .addContainerGap())
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(viewprofile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGap(20, 20, 20)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Mini, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MainCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Mini, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                        .addComponent(logoutbutton)))
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
        cardlayout.show(MainCard, "CatalogueCard");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        cardlayout.show(MainCard, "SupplierCard");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void ClickProfile(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickProfile
        cardlayout.show(MainCard, "ProfileCard");
    }//GEN-LAST:event_ClickProfile

    private void entprofile(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entprofile
        if (evt.getSource() == viewprofile){
            Border border = BorderFactory.createLineBorder(Color.BLUE, 1);
            viewprofile.setBorder(border);
        }        
    }//GEN-LAST:event_entprofile

    private void extprofile(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_extprofile
        if (evt.getSource() == viewprofile){
            Border border = BorderFactory.createLineBorder(Color.WHITE, 1);
            viewprofile.setBorder(border);
        }
    }//GEN-LAST:event_extprofile

    private void homepage(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homepage
        cardlayout.show(MainCard, "HomeCard");
    }//GEN-LAST:event_homepage

    private void MiniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MiniMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_MiniMouseClicked

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CloseMouseClicked

    private void CloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseEntered
        if (evt.getSource() == Close){
            Close.setForeground(new Color(211,211,211));
        }
    }//GEN-LAST:event_CloseMouseEntered

    private void CloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseExited
         if (evt.getSource() == Close){
             Close.setForeground(new Color(0,102,153));
         }
    }//GEN-LAST:event_CloseMouseExited

    private void MiniMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MiniMouseEntered
        if (evt.getSource() == Mini){
            Mini.setForeground(new Color(211,211,211));
        }
    }//GEN-LAST:event_MiniMouseEntered

    private void MiniMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MiniMouseExited
        if (evt.getSource() == Mini){
             Mini.setForeground(new Color(0,102,153));
         }
    }//GEN-LAST:event_MiniMouseExited

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton17MouseClicked
        String url = jTextField4.getText();
        try {
            URL urls = new URL(url);
            BufferedImage image;
            image = (BufferedImage) ImageIO.read(urls);
            Image img = image.getScaledInstance(Image2.getWidth(), Image2.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageicon = new ImageIcon(img);
            Image2.setIcon(imageicon);
        } catch (MalformedURLException ex) {
            JOptionPane.showMessageDialog(null, "Image not Found e1");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Image not Found e2");
        }
    }//GEN-LAST:event_jButton17MouseClicked

    private void jButton18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton18MouseClicked
        String url = jTextField5.getText();
        try {
            URL urls = new URL(url);
            BufferedImage image;
            image = (BufferedImage) ImageIO.read(urls);
            Image img = image.getScaledInstance(Image1.getWidth(), Image1.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageicon = new ImageIcon(img);
            Image1.setIcon(imageicon);
        } catch (MalformedURLException ex) {
            JOptionPane.showMessageDialog(null, "Image not Found e1");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Image not Found e2");
        }
    }//GEN-LAST:event_jButton18MouseClicked

    private void ItemNameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ItemNameItemStateChanged
        try{
            Product prod = new Product(ItemName.getSelectedItem().toString());
            prod.read();
            ItemID.setText("Item ID: " + prod.getData().get(0));
            jTextField1.setText(prod.getData().get(1));
            jTextField2.setText(prod.getData().get(2));
            jTextField3.setText(prod.getData().get(3));
            jTextField4.setText(prod.getData().get(6));

            Supplier sup = new Supplier(prod.getData().get(4), true);
            sup.read();
            jComboBox1.setSelectedItem(sup.getData().get(1));

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
        }catch(NullPointerException e){
            System.out.print("Caught NullPointerException"); 
        }
    }//GEN-LAST:event_ItemNameItemStateChanged

    private void UpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateMouseClicked
        if(jTextField1.getText().isBlank()||jTextField2.getText().isBlank()||jTextField3.getText().isBlank()||jTextField4.getText().isBlank()){
            JOptionPane.showMessageDialog(null, "Please fill All Field");
        }else{
            category.clear();
            boolean input = false;
            try{
                Double.parseDouble(jTextField2.getText()); 
                input = true;
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Please input Price as numbers");
                input = false;
            }
            try{
                Integer.parseInt(jTextField3.getText());
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
            if(prod.getAllName().contains(jTextField1.getText())){
                if(!jTextField1.getText().equals(ItemName.getSelectedItem().toString())){
                    JOptionPane.showMessageDialog(null, "Name is already taken");
                    input = false;
                }
            }
            prod.read();

            ArrayList<String> inputs = new ArrayList<>();
            inputs.add(0, jTextField1.getText());
            inputs.add(1, jTextField2.getText());
            inputs.add(2, jTextField3.getText());
            inputs.add(3, jComboBox1.getSelectedItem().toString());
            inputs.add(4, jTextField4.getText());

            prod.setData(inputs, category);
            if(input && prod.update()){
                JOptionPane.showMessageDialog(null, "Product Updated");
                ItemName.removeAllItems();
                jComboBox8.removeAllItems();
                jComboBox6.removeAllItems();
                ArrayList<String> prodnames = prod.getAllName();
                for(int i=0; i<prodnames.size(); i++){
                    ItemName.addItem(prodnames.get(i));
                    jComboBox8.addItem(prodnames.get(i));
                    jComboBox6.addItem(prodnames.get(i));
                }
            }else{
                JOptionPane.showMessageDialog(null, "Product Fail to Update");
            }
        }
    }//GEN-LAST:event_UpdateMouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        Product prod = new Product(ItemName.getSelectedItem().toString());
        prod.read();
        if(prod.delete()){
            JOptionPane.showMessageDialog(null, "Product Deleted");
            ItemName.removeAllItems();
            jComboBox8.removeAllItems();
            jComboBox6.removeAllItems();
            ArrayList<String> prodnames = prod.getAllName();
            for(int i=0; i<prodnames.size(); i++){
                ItemName.addItem(prodnames.get(i));
                jComboBox8.addItem(prodnames.get(i));
                jComboBox6.addItem(prodnames.get(i));
            }
        }else{
            JOptionPane.showMessageDialog(null, "Product Fail to delete");
        }
    }//GEN-LAST:event_jButton6MouseClicked

    private void CreateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateMouseClicked
        if(jTextField8.getText().isBlank()||jTextField6.getText().isBlank()||jTextField7.getText().isBlank()||jTextField5.getText().isBlank()){
            JOptionPane.showMessageDialog(null, "Please fill All Field");
        }else{
            category.clear();
            boolean input = false;
            try{
                Double.parseDouble(jTextField6.getText());
                input = true;
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Please input Price as numbers");
                input = false;
            }

            try{
                Integer.parseInt(jTextField7.getText());
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
            Product productcreated = new Product(jTextField8.getText(),jTextField6.getText(), jTextField7.getText(), supid, category, jTextField5.getText());
            if(productcreated.getAllName().contains(jTextField8.getText())){
                JOptionPane.showMessageDialog(null, "Name is already taken");
                input = false;
            }
            if(input && productcreated.create()){
                JOptionPane.showMessageDialog(null, "Product Saved/Created");
                
            }else{
                JOptionPane.showMessageDialog(null, "Product FAIL to Saved/Created");
            }
            ItemName.removeAllItems();
            jComboBox8.removeAllItems();
            jComboBox6.removeAllItems();
            ArrayList<String> prodnames = productcreated.getAllName();
            for(int i=0; i<prodnames.size(); i++){
                ItemName.addItem(prodnames.get(i));
                jComboBox8.addItem(prodnames.get(i));
                jComboBox6.addItem(prodnames.get(i));
            }
            jTextField8.setText("");
            jTextField6.setText("");
            jTextField7.setText("");
            jTextField5.setText("");
            checkbox11.setState(false);
            checkbox12.setState(false);
            checkbox13.setState(false);
            checkbox14.setState(false);
            checkbox15.setState(false);
            checkbox16.setState(false);
            checkbox17.setState(false);
            checkbox18.setState(false);
            checkbox19.setState(false);
            checkbox20.setState(false);
        }
    }//GEN-LAST:event_CreateMouseClicked

    private void Update4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Update4MouseClicked
        if(jTextField11.getText().isBlank()||jTextField12.getText().isBlank()){
            JOptionPane.showMessageDialog(null, "Please fill All Field");
        }else{
            boolean input = false;
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM");
            dateFormat.setLenient(false);
            try {
                dateFormat.parse(jTextField12.getText().trim());
                input = true;
            }catch(ParseException pe){
                JOptionPane.showMessageDialog(null, "Date Format is Wrong");
                input = false;
            }
            Festival fest = new Festival(jTextField11.getText(), jTextField12.getText());
            if(fest.getAllName().contains(jTextField11.getText())){
                JOptionPane.showMessageDialog(null, "Name is already taken");
                input = false;
            }
            if(input&&fest.create()){
                JOptionPane.showMessageDialog(null, "Festival Saved/Created");
                jComboBox3.removeAllItems();
                jComboBox7.removeAllItems();
                jComboBox4.removeAllItems();
                ArrayList<String> festname = fest.getAllName();
                for(int i=0; i<festname.size();i++){
                    jComboBox3.addItem(festname.get(i));
                    jComboBox7.addItem(festname.get(i));
                    jComboBox4.addItem(festname.get(i));
                }
                jTextField11.setText("");
                jTextField12.setText("");
            }else{
                JOptionPane.showMessageDialog(null, "Festival Fail to Saved/Created");
            }
        }
    }//GEN-LAST:event_Update4MouseClicked

    private void Update2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Update2MouseClicked
        if(jTextField9.getText().isBlank()||jTextField10.getText().isBlank()){
            JOptionPane.showMessageDialog(null, "Please fill All Field");
        }else{
            boolean input;
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM");
            dateFormat.setLenient(false);
            try {
                dateFormat.parse(jTextField10.getText().trim());
                input = true;
            }catch(ParseException pe){
                JOptionPane.showMessageDialog(null, "Date Format is Wrong");
                input = false;
            }
            Festival fest = new Festival(jComboBox3.getSelectedItem().toString());
            if(fest.getAllName().contains(jTextField9.getText())){
                if(!jTextField9.getText().equals(jComboBox3.getSelectedItem().toString())){
                    JOptionPane.showMessageDialog(null, "Name is already taken");
                    input = false;
                }
            }
            fest.read();
            ArrayList<String> inputs = new ArrayList<>();
            inputs.add(0, jTextField9.getText());
            inputs.add(1, jTextField10.getText());

            fest.setData(inputs);
            if(input&&fest.update()){
                JOptionPane.showMessageDialog(null, "Festival Updated");
                jComboBox3.removeAllItems();
                jComboBox7.removeAllItems();
                jComboBox4.removeAllItems();
                ArrayList<String> festname = fest.getAllName();
                for(int i=0; i<festname.size();i++){
                    jComboBox3.addItem(festname.get(i));
                    jComboBox7.addItem(festname.get(i));
                    jComboBox4.addItem(festname.get(i));
                }
            }else{
                JOptionPane.showMessageDialog(null, "Festival Fail to Update");
            }
        }
    }//GEN-LAST:event_Update2MouseClicked

    private void jComboBox3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox3ItemStateChanged
        try{
            Festival fest = new Festival(jComboBox3.getSelectedItem().toString());
            fest.read();
            jLabel12.setText("Festival ID: "+fest.getData().get(0));
            jTextField9.setText(fest.getData().get(1));
            jTextField10.setText(fest.getData().get(2));
        }catch(NullPointerException e){
            System.out.print("Caught NullPointerException"); 
        }
    }//GEN-LAST:event_jComboBox3ItemStateChanged

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        Festival fest = new Festival(jComboBox3.getSelectedItem().toString());
        fest.read();
        if(fest.delete()){
            JOptionPane.showMessageDialog(null, "Festival Deleted");
            jComboBox3.removeAllItems();
            jComboBox7.removeAllItems();
            jComboBox4.removeAllItems();
            ArrayList<String> festname = fest.getAllName();
            for(int i=0; i<festname.size();i++){
                jComboBox3.addItem(festname.get(i));
                jComboBox7.addItem(festname.get(i));
                jComboBox4.addItem(festname.get(i));
            }
        }else{
            JOptionPane.showMessageDialog(null, "Festival fail to Deleted");
        }
    }//GEN-LAST:event_jButton7MouseClicked

    private void Update5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Update5MouseClicked
        if(jTextField17.getText().isBlank()||jTextField18.getText().isBlank()||jTextField21.getText().isBlank()){
            JOptionPane.showMessageDialog(null, "Please fill All Field");
        }else{
            boolean input = false;
            Supplier sup = new Supplier(jTextField17.getText(), jTextField18.getText(), jTextField21.getText());
            if(sup.getAllName().contains(jTextField17.getText())){
                JOptionPane.showMessageDialog(null, "Name is already taken");
                input = false;
            }else{
                input = true;
            }
            if (!jTextField21.getText().matches("[0-9]+")){
                JOptionPane.showMessageDialog(null, "Please fill in the Contact Number in Digits");
                input = false;
            }
            if(input&&sup.create()){
                JOptionPane.showMessageDialog(null, "Supplier Saved/Created");
                jComboBox1.removeAllItems();
                jComboBox2.removeAllItems();
                jComboBox5.removeAllItems();
                ArrayList<String> supnames = sup.getAllName();
                for(int i=0; i<supnames.size(); i++){
                    jComboBox1.addItem(supnames.get(i));
                    jComboBox2.addItem(supnames.get(i));
                    jComboBox5.addItem(supnames.get(i));
                }
                jTextField17.setText("");
                jTextField18.setText("");
                jTextField21.setText("");
            }else{
                JOptionPane.showMessageDialog(null, "Supplier Fail to Save/Create");
            }
        }
    }//GEN-LAST:event_Update5MouseClicked

    private void jComboBox5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox5ItemStateChanged
        try{
            Supplier sup = new Supplier(jComboBox5.getSelectedItem().toString());
            sup.read();
            jLabel15.setText("Supplier ID: "+sup.getData().get(0));
            jTextField19.setText(sup.getData().get(1));
            jTextField20.setText(sup.getData().get(2));
            jTextField13.setText(sup.getData().get(3));
        }catch(NullPointerException e){
            System.out.print("Caught NullPointerException"); 
        }
    }//GEN-LAST:event_jComboBox5ItemStateChanged

    private void Update6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Update6MouseClicked
        if(jTextField19.getText().isBlank()||jTextField20.getText().isBlank()||jTextField13.getText().isBlank()){
            JOptionPane.showMessageDialog(null, "Please fill All Field");
        }else{
            boolean input = false;
            if (!jTextField13.getText().matches("[0-9]+")){
                JOptionPane.showMessageDialog(null, "Please fill in the Contact Number in Digits"); 
                input = false;
            }
            Supplier sup = new Supplier(jComboBox5.getSelectedItem().toString());
            if(sup.getAllName().contains(jTextField19.getText())){
                if(!jTextField19.getText().equals(jComboBox5.getSelectedItem().toString())){
                    JOptionPane.showMessageDialog(null, "Name is already taken");
                    input = false;
                }
            }
            sup.read();
            ArrayList<String> info = new ArrayList<>();
            info.add(0, jTextField19.getText());
            info.add(1, jTextField20.getText());
            info.add(2, jTextField13.getText());
            sup.setData(info);
            if(input&&sup.update()){
                JOptionPane.showMessageDialog(null, "Supplier Updated");
                jComboBox1.removeAllItems();
                jComboBox2.removeAllItems();
                jComboBox5.removeAllItems();
                ArrayList<String> supnames = sup.getAllName();
                for(int i=0; i<supnames.size(); i++){
                    jComboBox1.addItem(supnames.get(i));
                    jComboBox2.addItem(supnames.get(i));
                    jComboBox5.addItem(supnames.get(i));
                }
            }else{
                JOptionPane.showMessageDialog(null, "Supplier Fail to Update");
            }
        }
        
    }//GEN-LAST:event_Update6MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        Supplier sup = new Supplier(jComboBox5.getSelectedItem().toString());
        sup.read();
        if(sup.delete()){
            JOptionPane.showMessageDialog(null, "Supplier Deleted");
            jComboBox1.removeAllItems();
            jComboBox2.removeAllItems();
            jComboBox5.removeAllItems();
            ArrayList<String> supnames = sup.getAllName();
            for(int i=0; i<supnames.size(); i++){
                jComboBox1.addItem(supnames.get(i));
                jComboBox2.addItem(supnames.get(i));
                jComboBox5.addItem(supnames.get(i));
            }
        }else{
            JOptionPane.showMessageDialog(null, "Supplier Fail to delete");
        }
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
 
        try{
            Double d = Double.parseDouble(jTextField25.getText());
            Object[] row = { jComboBox6.getSelectedItem().toString(), d };
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.addRow(row);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Discount must be in Number Format");
        }
        
        
    }//GEN-LAST:event_jButton10MouseClicked

    private void jButton13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseClicked
        try{
            Double d = Double.parseDouble(jTextField27.getText());
            Object[] row = { jComboBox8.getSelectedItem().toString(), d };
            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            model.addRow(row);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Discount must be in Number Format");
        }
    }//GEN-LAST:event_jButton13MouseClicked

    private void jComboBox9ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox9ItemStateChanged
        try{
            DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
            dtm.setRowCount(0);
            Catalouge cata = new Catalouge(jComboBox9.getSelectedItem().toString());
            cata.read();
            jLabel37.setText("Catalouge ID: " + cata.getData().get(0));
            jTextField26.setText(cata.getData().get(1));
            jComboBox7.setSelectedItem(cata.getData().get(2));
            ArrayList<ArrayList<String>> itemlist = cata.getProduct();
            for(int i=0;i<itemlist.size(); i++){
                double disc = (Double.parseDouble(itemlist.get(i).get(1)))*100;
                Object[] row = { itemlist.get(i).get(0), disc };
                DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
                model.addRow(row);
            }
        }catch(NullPointerException e){
            System.out.println("Caught NullPointerException"); 
        }
    }//GEN-LAST:event_jComboBox9ItemStateChanged

    private void jButton12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseClicked
        DefaultTableModel model = (DefaultTableModel) this.jTable1.getModel();
        int[] rows = jTable1.getSelectedRows();
        for(int i=0;i<rows.length;i++){
            model.removeRow(rows[i]-i);
        }
    }//GEN-LAST:event_jButton12MouseClicked

    private void jButton16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton16MouseClicked
        DefaultTableModel model = (DefaultTableModel) this.jTable2.getModel();
        int[] rows = jTable2.getSelectedRows();
        for(int i=0;i<rows.length;i++){
            model.removeRow(rows[i]-i);
        }
    }//GEN-LAST:event_jButton16MouseClicked

    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked
        if(jTextField24.getText().isBlank()){
            JOptionPane.showMessageDialog(null, "Please fill All Field");
        }else{
            boolean input = false;
            DefaultTableModel model = (DefaultTableModel) this.jTable1.getModel();
            ArrayList<ArrayList<String>> outer = new ArrayList<>();
            for (int count = 0; count < model.getRowCount(); count++){
                ArrayList<String> inner = new ArrayList<>();
                inner.add(model.getValueAt(count, 0).toString());
                Double disc = (Double.parseDouble(model.getValueAt(count, 1).toString()))*0.01;
                inner.add(String.valueOf(disc));
                outer.add(inner);
            }
            Catalouge cata = new Catalouge(jTextField24.getText(), jComboBox4.getSelectedItem().toString(), outer);
            if(cata.getAllName().contains(jTextField24.getText())){
                JOptionPane.showMessageDialog(null, "Name is already taken");
                input = false;
            }else{
                input = true;
            }
            if(jTable1.getRowCount()<3){
                JOptionPane.showMessageDialog(null, "Please input more than 3 Item/Product");
                input = false;
            }
            if(input&&cata.create()){
                JOptionPane.showMessageDialog(null, "Catalouge Saved/Created");
                jComboBox9.removeAllItems();
                ArrayList<String> cataname = cata.getAllName();
                for(int i=0; i<cataname.size();i++){
                    jComboBox9.addItem(cataname.get(i));
                }
                jTextField24.setText("");
                jTextField25.setText("");
                DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                dtm.setRowCount(0);
            }else{
                JOptionPane.showMessageDialog(null, "Catalouge fail to Save/Create");
            }
        }
        
    }//GEN-LAST:event_jButton11MouseClicked

    private void jButton15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton15MouseClicked
        Catalouge cata = new Catalouge(jComboBox9.getSelectedItem().toString());
        cata.read();
        if(cata.delete()){
            JOptionPane.showMessageDialog(null, "Catalouge Deleted");
            jComboBox9.removeAllItems();
            ArrayList<String> cataname = cata.getAllName();
            for(int i=0; i<cataname.size();i++){
                jComboBox9.addItem(cataname.get(i));
            }
        }else{
            JOptionPane.showMessageDialog(null, "Catalouge fail to Delete");
        }
    }//GEN-LAST:event_jButton15MouseClicked

    private void jButton14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton14MouseClicked
        if(jTextField26.getText().isBlank()){
            JOptionPane.showMessageDialog(null, "Please fill All Field");
        }else{
            boolean input = false;
            if(jTable2.getRowCount()<3){
                JOptionPane.showMessageDialog(null, "Please input more than 3 Item/Product");
                input = false;
            }else{
                input = true;
            }
            DefaultTableModel model = (DefaultTableModel) this.jTable2.getModel();
            ArrayList<ArrayList<String>> outer = new ArrayList<>();
            for (int count = 0; count < model.getRowCount(); count++){
                  ArrayList<String> inner = new ArrayList<>();
                  inner.add(model.getValueAt(count, 0).toString());
                  Double disc = (Double.parseDouble(model.getValueAt(count, 1).toString()))*0.01;
                  inner.add(String.valueOf(disc));
                  outer.add(inner);
            }
            Catalouge cata = new Catalouge(jComboBox9.getSelectedItem().toString());
            if(cata.getAllName().contains(jTextField26.getText())){
                if(!jTextField26.getText().equals(jComboBox9.getSelectedItem().toString())){
                    JOptionPane.showMessageDialog(null, "Name is already taken");
                    input = false;
                }
            }
            cata.read();
            ArrayList<String> newinfo = new ArrayList<>();
            newinfo.add(0, jTextField26.getText());
            newinfo.add(1, jComboBox7.getSelectedItem().toString());
            cata.setData(newinfo, outer);
            if(input&&cata.update()){
                JOptionPane.showMessageDialog(null, "Catalouge Updated");
                jComboBox9.removeAllItems();
                ArrayList<String> cataname = cata.getAllName();
                for(int i=0; i<cataname.size();i++){
                    jComboBox9.addItem(cataname.get(i));
                }
            }else{
                JOptionPane.showMessageDialog(null, "Catalouge fail to Update");
            }
        }
    }//GEN-LAST:event_jButton14MouseClicked

    private void jButton19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton19MouseClicked
        Catalouge cata = new Catalouge(jComboBox9.getSelectedItem().toString());
        cata.read();
        if(cata.exportCatalouge()){
            JOptionPane.showMessageDialog(null, "PDF has Successfully Created\nThe file is located in this software's PDF folder (src/PDF/[catalouge's name])");
        }else{
            JOptionPane.showMessageDialog(null, "PDF fail to create");
        }
    }//GEN-LAST:event_jButton19MouseClicked

    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane CataloguePanel;
    private javax.swing.JLabel Close;
    private javax.swing.JButton Create;
    private javax.swing.JPanel CreateFestival;
    private javax.swing.JPanel CreateProduct;
    private javax.swing.JPanel CreateSupplier;
    private javax.swing.JTabbedPane FestivalPane;
    private javax.swing.JPanel HomePanel;
    private javax.swing.JLabel Image1;
    private javax.swing.JLabel Image2;
    private javax.swing.JLabel ItemID;
    private javax.swing.JComboBox<String> ItemName;
    private javax.swing.JPanel MainCard;
    private javax.swing.JPanel ManageFestival;
    private javax.swing.JPanel ManageProduct;
    private javax.swing.JPanel ManageSupplier;
    private javax.swing.JLabel Mini;
    private javax.swing.JTabbedPane ProductPanel;
    private javax.swing.JPanel ProfilePanel;
    private javax.swing.JTabbedPane SupplierPane;
    private javax.swing.JButton Update;
    private javax.swing.JButton Update2;
    private javax.swing.JButton Update4;
    private javax.swing.JButton Update5;
    private javax.swing.JButton Update6;
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
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JButton logoutbutton;
    private javax.swing.JLabel viewprofile;
    // End of variables declaration//GEN-END:variables
}
