package mypackage;

import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Date;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.*;
//import static javafx.scene.input.KeyCode.BEGIN;
//import static javax.swing.JFormattedTextField.COMMIT;
/*import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
*/
/**
 *
 * @author Ankit Limone
 * @author Mahak Gupta
 */
public class InsertFrame extends javax.swing.JFrame {

    private static final String username= "root";
    private static final String password= "Ankit@1516";
    private static final String dataConn= "jdbc:mysql://localhost:3306/posting_register";

    Connection sqlConn = null;
    PreparedStatement pst  =null;
    PreparedStatement pst1  =null;
    PreparedStatement pst2  =null;
    ResultSet rs = null;
    int q , i, id, deleteItem;
    private Object stmt;
    
     

    public InsertFrame() {
        initComponents();
        
     jScrollPane1.getVerticalScrollBar().setUnitIncrement(16);
  
    }
    
      public void close(){
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
//==========================================================================Functions====================================================================


     public void upDateDB()
    {
        try
        {
           Class.forName("com.mysql.cj.jdbc.Driver");
           sqlConn = DriverManager.getConnection(dataConn,username,password);
           pst = sqlConn.prepareStatement("Select * from posting_register.personal_details");
           pst1 = sqlConn.prepareStatement("Select * from posting_register.training_details");
           pst2 = sqlConn.prepareStatement("Select * from posting_register.successors_details");

           rs = pst.executeQuery();
           //rs = pst1.executeQuery();
           //rs = pst2.executeQuery();
           ResultSetMetaData  stData = rs.getMetaData();


           q = stData.getColumnCount();

          // DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
         //  RecordTable.setRowCount(0);

           while(rs.next()){
            Vector columnData = new Vector();

            for(i=1;i<=q;i++)
             {
               
               columnData.add(rs.getShort("यूनिक_कोड"));
               columnData.add(rs.getShort("पद"));
               columnData.add(rs.getShort("बैज_क्रमांक"));
               columnData.add(rs.getShort("नाम"));
               columnData.add(rs.getShort("पिता_का_नाम"));
               columnData.add(rs.getShort("वर्ग"));
               columnData.add(rs.getShort("आधार_क्रमांक"));
               columnData.add(rs.getShort("पैन_कार्ड_क्रमांक"));
               columnData.add(rs.getShort("GPF_DPF_NPS_no"));
               columnData.add(rs.getShort("बैंक_खाता_क्र"));
               columnData.add(rs.getShort("आईएफएससी_कोड"));
               columnData.add(rs.getShort("ग्रह_जिला"));
               columnData.add(rs.getShort("जन्म_दिनांक"));
               columnData.add(rs.getShort("स्थायी_पता"));
               columnData.add(rs.getShort("वर्तमान_पता"));
               columnData.add(rs.getShort("ब्लड_ग्रुप"));
               columnData.add(rs.getShort("PRAN_क्रमांक"));
            
               
               columnData.add(rs.getShort("बुनियादी_प्रक्षिक्षण"));
               columnData.add(rs.getShort("यदि_अनुत्तीर्ण_हैं_तो"));
               columnData.add(rs.getShort("भर्ती_की_दिनांक"));
               columnData.add(rs.getShort("प्रथम_नियुक्ति_इकाई"));
               columnData.add(rs.getShort("पूर्व_इकाई"));
               columnData.add(rs.getShort("वर्तमान_पदोन्नति_दिनांक"));
               columnData.add(rs.getShort("मान_उ_न्याया_इंदौर_में_तैनाती_दिनांक"));
               columnData.add(rs.getShort("बुनियादी_प्रक्षिक्षण_उत्तीर्ण_दिनांक"));
               columnData.add(rs.getShort("शिक्षा"));
               columnData.add(rs.getShort("कोर्स"));
               

               
               columnData.add(rs.getShort("जीवनसाथी_का_नाम"));
               columnData.add(rs.getShort("लिंग"));
               columnData.add(rs.getShort("मोबाइल_नं"));
               columnData.add(rs.getShort("व्यवसाय"));
               columnData.add(rs.getShort("जीवनसाथी_का_आधार_क्रमांक"));
               columnData.add(rs.getShort("पिता_का_आधार_क्रमांक"));
               columnData.add(rs.getShort("माता_का_नाम"));
               columnData.add(rs.getShort("माता_का_आधार_क्रमांक"));
               columnData.add(rs.getShort("बच्चे"));           
               columnData.add(rs.getShort("बच्चो_का_व्यवसाय"));
               columnData.add(rs.getShort("उत्तराधिकारी_का_पता"));
               columnData.add(rs.getShort("उत्तराधिकारी_का_खाता_क्रमांक"));
               columnData.add(rs.getShort("उत्तराधिकारी_का_बैंक_IFSC_कोड"));
               
            }

            //  RecordTable.addRow(columnData);

            }
        }
        catch(Exception ex){
         JOptionPane.showMessageDialog(null, ex);
          }
    }




//========================================================================END FUNCTION===================================================================

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtfieldUC = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtfieldbadgeno = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtfieldname = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtfieldfname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        CBcategory = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtfieldaadhar = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtfieldpan = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtfieldgpfdpf = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtfieldbankacc = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtfieldifsc = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtfieldhd = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtareapadd = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtarealadd = new javax.swing.JTextArea();
        jLabel19 = new javax.swing.JLabel();
        CBblood = new javax.swing.JComboBox<>();
        jLabel49 = new javax.swing.JLabel();
        txtfieldpran = new javax.swing.JTextField();
        DCbirth = new com.toedter.calendar.JDateChooser();
        CBpost = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        ubtn = new javax.swing.JButton();
        sbtn = new javax.swing.JButton();
        ebtn = new javax.swing.JButton();
        resetbtn = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        CBbasict = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        txtfieldiffail = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        txtfieldcourse = new javax.swing.JTextField();
        DCrecruit = new com.toedter.calendar.JDateChooser();
        previousunit = new javax.swing.JTextField();
        txtfieldedu = new javax.swing.JTextField();
        txtdatefirstdeployunit = new javax.swing.JTextField();
        DCpromotion = new javax.swing.JTextField();
        DChighcourtdeploy = new javax.swing.JTextField();
        DCbasictpass = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        txtfieldspname = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        CBgender = new javax.swing.JComboBox<>();
        jLabel39 = new javax.swing.JLabel();
        txtfieldmobno = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        txtfieldstatus = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        txtfieldspaadhar = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        txtfieldfaadhar = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        txtfieldmname = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        txtfieldmaadhar = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        CBchild = new javax.swing.JComboBox<>();
        jLabel45 = new javax.swing.JLabel();
        txtfieldcstatus = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        txtfieldsbankacc = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        txtfieldsifsc = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtareasadd = new javax.swing.JTextArea();
        jPanel11 = new javax.swing.JPanel();
        subbtn = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("पद स्थापना पंजी");

        jPanel1.setBackground(new java.awt.Color(188, 208, 255));

        jPanel2.setBackground(new java.awt.Color(254, 0, 0));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LOGO/police.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Kokila", 1, 55)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("प्रथम   वाहिनी   विशेष   सशस्त्र   बल");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(748, 748, 748))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 129));

        jLabel50.setFont(new java.awt.Font("Kokila", 1, 58)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("पदस्थापना पंजी उच्च न्यायालय सुरक्षा, इंदौर ( मध्यप्रदेश )");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(467, 467, 467)
                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 963, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel50)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(188, 208, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setFont(new java.awt.Font("Kokila", 0, 36)); // NOI18N
        jLabel6.setText("यूनिक कोड :");

        txtfieldUC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtfieldUC.setForeground(new java.awt.Color(153, 153, 153));
        txtfieldUC.setText("123456789");
        txtfieldUC.setToolTipText("यूनिक कोड दर्ज करें");
        txtfieldUC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtfieldUCFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtfieldUCFocusLost(evt);
            }
        });
        txtfieldUC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfieldUCActionPerformed(evt);
            }
        });
        txtfieldUC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtfieldUCKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel6)
                .addGap(77, 77, 77)
                .addComponent(txtfieldUC, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtfieldUC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        jPanel5.setBackground(new java.awt.Color(235, 250, 242));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "व्यक्तिगत विवरण", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Kokila", 0, 36))); // NOI18N
        jPanel5.setFont(new java.awt.Font("Kokila", 0, 36)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel4.setText("पद :");

        jLabel5.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel5.setText("बैज क्र. :");

        txtfieldbadgeno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtfieldbadgeno.setForeground(new java.awt.Color(153, 153, 153));
        txtfieldbadgeno.setText("12345");
        txtfieldbadgeno.setToolTipText("बैज क्रमांक दर्ज करें");
        txtfieldbadgeno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtfieldbadgenoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtfieldbadgenoFocusLost(evt);
            }
        });
        txtfieldbadgeno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfieldbadgenoActionPerformed(evt);
            }
        });
        txtfieldbadgeno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtfieldbadgenoKeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel7.setText("नाम :");

        txtfieldname.setFont(new java.awt.Font("Kruti Dev 010", 1, 24)); // NOI18N
        txtfieldname.setForeground(new java.awt.Color(153, 153, 153));
        txtfieldname.setText("uke ntZ djsa");
        txtfieldname.setToolTipText("नाम दर्ज करें");
        txtfieldname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtfieldnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtfieldnameFocusLost(evt);
            }
        });
        txtfieldname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfieldnameActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel8.setText("पिता का नाम :");

        txtfieldfname.setFont(new java.awt.Font("Kruti Dev 010", 1, 24)); // NOI18N
        txtfieldfname.setForeground(new java.awt.Color(153, 153, 153));
        txtfieldfname.setText("firk dk uke ntZ djsa");
        txtfieldfname.setToolTipText("पिता का नाम दर्ज करें");
        txtfieldfname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtfieldfnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtfieldfnameFocusLost(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel9.setText("वर्ग :");

        CBcategory.setFont(new java.awt.Font("Kruti Dev 010", 0, 24)); // NOI18N
        CBcategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "lkekU;", "vU; fiNM+k oxZ", "vtk", "våtåtk" }));
        CBcategory.setToolTipText("वर्ग का चयन करें");

        jLabel10.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel10.setText("आधार क्र. :");

        txtfieldaadhar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtfieldaadhar.setForeground(new java.awt.Color(153, 153, 153));
        txtfieldaadhar.setText("XXXX12345678");
        txtfieldaadhar.setToolTipText("आधार क्रमांक दर्ज करें");
        txtfieldaadhar.setName(""); // NOI18N
        txtfieldaadhar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtfieldaadharFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtfieldaadharFocusLost(evt);
            }
        });
        txtfieldaadhar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfieldaadharActionPerformed(evt);
            }
        });
        txtfieldaadhar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtfieldaadharKeyPressed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel11.setText("पैन क्र. :");

        txtfieldpan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtfieldpan.setForeground(new java.awt.Color(153, 153, 153));
        txtfieldpan.setText("ABCDE1234F");
        txtfieldpan.setToolTipText("पेन क्रमांक दर्ज करें");
        txtfieldpan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtfieldpanFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtfieldpanFocusLost(evt);
            }
        });
        txtfieldpan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtfieldpanKeyReleased(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel12.setText("GPF/DPF/NPS NO.");

        txtfieldgpfdpf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtfieldgpfdpf.setForeground(new java.awt.Color(153, 153, 153));
        txtfieldgpfdpf.setText("ABCDE12345");
        txtfieldgpfdpf.setToolTipText("जीपीएफ या डीपीएफ नंबर दर्ज करें");
        txtfieldgpfdpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtfieldgpfdpfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtfieldgpfdpfFocusLost(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel13.setText("बैंक खाता क्र.");

        txtfieldbankacc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtfieldbankacc.setForeground(new java.awt.Color(153, 153, 153));
        txtfieldbankacc.setText("1234567890X");
        txtfieldbankacc.setToolTipText("बैंक खाता क्रमांक दर्ज करें");
        txtfieldbankacc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtfieldbankaccFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtfieldbankaccFocusLost(evt);
            }
        });
        txtfieldbankacc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfieldbankaccActionPerformed(evt);
            }
        });
        txtfieldbankacc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtfieldbankaccKeyPressed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Kokila", 0, 30)); // NOI18N
        jLabel14.setText("IFSC  कोड:");

        txtfieldifsc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtfieldifsc.setForeground(new java.awt.Color(153, 153, 153));
        txtfieldifsc.setText("ABCDXXXXXXX");
        txtfieldifsc.setToolTipText("IFSC कोड दर्ज करें");
        txtfieldifsc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtfieldifscFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtfieldifscFocusLost(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel15.setText("गृह ज़िला :");

        txtfieldhd.setFont(new java.awt.Font("Kruti Dev 010", 1, 24)); // NOI18N
        txtfieldhd.setForeground(new java.awt.Color(153, 153, 153));
        txtfieldhd.setText("xzg ftyk ntZ djsa");
        txtfieldhd.setToolTipText("ग्रह जिला दर्ज करें");
        txtfieldhd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtfieldhdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtfieldhdFocusLost(evt);
            }
        });
        txtfieldhd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfieldhdActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel16.setText("जन्म दिनांक :");

        jLabel17.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel17.setText("स्थायी पता :");

        txtareapadd.setColumns(20);
        txtareapadd.setFont(new java.awt.Font("Kruti Dev 010", 1, 24)); // NOI18N
        txtareapadd.setForeground(new java.awt.Color(153, 153, 153));
        txtareapadd.setRows(5);
        txtareapadd.setText("LFkk;h irk ntZ djsa");
        txtareapadd.setToolTipText("स्थाई पता दर्ज करें");
        txtareapadd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtareapaddFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtareapaddFocusLost(evt);
            }
        });
        jScrollPane2.setViewportView(txtareapadd);

        jLabel18.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel18.setText("वर्तमान पता :");

        txtarealadd.setColumns(20);
        txtarealadd.setFont(new java.awt.Font("Kruti Dev 010", 1, 24)); // NOI18N
        txtarealadd.setForeground(new java.awt.Color(153, 153, 153));
        txtarealadd.setRows(5);
        txtarealadd.setText("orZeku irk ntZ djsa");
        txtarealadd.setToolTipText("वर्तमान पता दर्ज करें");
        txtarealadd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtarealaddFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtarealaddFocusLost(evt);
            }
        });
        jScrollPane3.setViewportView(txtarealadd);

        jLabel19.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel19.setText("ब्लड ग्रुप :");

        CBblood.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CBblood.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" }));
        CBblood.setToolTipText("ब्लड ग्रुप दर्ज करें");

        jLabel49.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel49.setText("PRAN क्रमांक :");

        txtfieldpran.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtfieldpran.setForeground(new java.awt.Color(153, 153, 153));
        txtfieldpran.setText("XXXXXX567890");
        txtfieldpran.setToolTipText("पीआरऐन नंबर दर्ज करें");
        txtfieldpran.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtfieldpranFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtfieldpranFocusLost(evt);
            }
        });
        txtfieldpran.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtfieldpranKeyPressed(evt);
            }
        });

        DCbirth.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        CBpost.setFont(new java.awt.Font("Kruti Dev 010", 0, 24)); // NOI18N
        CBpost.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "vfr- iqfyl vèkh{kd", "iqfyl mi vèkh{kd", "fujh{kd", "fujh{kd ¼efgyk½", "m-fu- ¼iq#\"k½", "m-fu- ¼efgyk½", "lmfu ¼iq#\"k½", "dk- lmfu- ¼iq#\"k½", "lmfu ¼efgyk½", "dk-e-lmfu-", "ç-vkj-", "dk-ç- vkj-", "ç-vkj- ¼efgyk½", "dk-e-ç-vkj-", "vkj{kd", "vkj{kd ¼efgyk½", "vkj{kd VªsMesu", "'kh?kzys[kd ¼LVsuks½", "mfu- ¼v½", "lmfu- ¼v½", "m-fu- ¼jsfM;ksa½", "ç-vkj-¼jsfM;ksa½", "vkj{kd ¼jsfM;ksa½", "ç-vkj- ¼vkElZ½", "vkj{kd ¼vkElZ½", "vkj{kd ¼M‚x gS.Myj½", "vkj{kd ¼pkyd½" }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11)
                    .addComponent(jLabel14)
                    .addComponent(jLabel17))
                .addGap(90, 90, 90)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtfieldfname)
                    .addComponent(txtfieldpan)
                    .addComponent(txtfieldifsc)
                    .addComponent(jScrollPane2)
                    .addComponent(CBpost, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(jLabel12)
                    .addComponent(jLabel15)
                    .addComponent(jLabel18))
                .addGap(91, 91, 91)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtfieldbadgeno)
                    .addComponent(CBcategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtfieldgpfdpf)
                    .addComponent(txtfieldhd)
                    .addComponent(jScrollPane3))
                .addGap(46, 46, 46)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10)
                    .addComponent(jLabel13)
                    .addComponent(jLabel16)
                    .addComponent(jLabel19)
                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CBblood, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtfieldpran)
                    .addComponent(DCbirth, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtfieldname, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfieldaadhar)
                    .addComponent(txtfieldbankacc))
                .addGap(35, 35, 35))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(CBcategory, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtfieldbadgeno, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(31, 31, 31))
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addComponent(CBpost, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(32, 32, 32)))
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtfieldfname, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel8)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(70, 70, 70))))
                            .addComponent(txtfieldname, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(txtfieldaadhar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtfieldpan, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(txtfieldbankacc, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtfieldgpfdpf, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtfieldifsc, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txtfieldhd, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(DCbirth, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(CBblood, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtfieldpran)))
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(188, 208, 255));

        ubtn.setBackground(new java.awt.Color(254, 0, 0));
        ubtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ubtn.setForeground(new java.awt.Color(255, 255, 255));
        ubtn.setText("UPDATE");
        ubtn.setBorder(null);
        ubtn.setBorderPainted(false);
        ubtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubtnActionPerformed(evt);
            }
        });

        sbtn.setBackground(new java.awt.Color(254, 0, 0));
        sbtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sbtn.setForeground(new java.awt.Color(255, 255, 255));
        sbtn.setText("SEARCH");
        sbtn.setBorder(null);
        sbtn.setBorderPainted(false);
        sbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbtnActionPerformed(evt);
            }
        });

        ebtn.setBackground(new java.awt.Color(254, 0, 0));
        ebtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ebtn.setForeground(new java.awt.Color(255, 255, 255));
        ebtn.setText("EXIT");
        ebtn.setBorder(null);
        ebtn.setBorderPainted(false);
        ebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ebtnActionPerformed(evt);
            }
        });

        resetbtn.setBackground(new java.awt.Color(254, 0, 0));
        resetbtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        resetbtn.setForeground(new java.awt.Color(255, 255, 255));
        resetbtn.setText("RESET");
        resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ubtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(resetbtn)
                .addGap(51, 51, 51)
                .addComponent(sbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ubtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(resetbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(235, 250, 242));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "प्रशिक्षण विवरण", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Kokila", 0, 36))); // NOI18N

        jLabel20.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel20.setText("बुनियादी प्रशिक्षण :");

        CBbasict.setFont(new java.awt.Font("Kruti Dev 010", 0, 24)); // NOI18N
        CBbasict.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "mÙkh.kZ", "vuqÙkh.kZ" }));
        CBbasict.setToolTipText("बुनियादी प्रशिक्षण का चयन करें");

        jLabel21.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel21.setText("यदि अनुत्तीर्ण हैं तो :");

        txtfieldiffail.setFont(new java.awt.Font("Kruti Dev 010", 1, 24)); // NOI18N
        txtfieldiffail.setForeground(new java.awt.Color(153, 153, 153));
        txtfieldiffail.setText("fooj.k ntZ djsa");
        txtfieldiffail.setToolTipText("यदि अनुतीर्ण हैं तो विषय दर्ज करें");
        txtfieldiffail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtfieldiffailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtfieldiffailFocusLost(evt);
            }
        });
        txtfieldiffail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfieldiffailActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel22.setText("भर्ती की दिनांक :");

        jLabel23.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel23.setText("प्रथम नियुक्ति इकाई :");

        jLabel24.setFont(new java.awt.Font("Kokila", 0, 35)); // NOI18N
        jLabel24.setText("पूर्व इकाई :");

        jLabel25.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel25.setText("वर्तमान पदोन्नति दिनांक :");

        jLabel26.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel26.setText("मान.उ. न्याया. इंदौर में तैनाती दिनांक :");

        jLabel27.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel27.setText("बुनियादी प्रक्षिक्षण उत्तीर्ण दिनांक :");

        jLabel36.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel36.setText("शिक्षा:");

        jLabel37.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel37.setText("कोर्स :");

        txtfieldcourse.setFont(new java.awt.Font("Kruti Dev 010", 1, 24)); // NOI18N
        txtfieldcourse.setForeground(new java.awt.Color(153, 153, 153));
        txtfieldcourse.setText("dkslZ ntZ djsa");
        txtfieldcourse.setToolTipText("कोर्स दर्ज करें");
        txtfieldcourse.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtfieldcourseFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtfieldcourseFocusLost(evt);
            }
        });

        DCrecruit.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        previousunit.setFont(new java.awt.Font("Kruti Dev 010", 1, 24)); // NOI18N
        previousunit.setForeground(new java.awt.Color(153, 153, 153));
        previousunit.setText("iwoZ bdkbZ ntZ djsa");
        previousunit.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                previousunitFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                previousunitFocusLost(evt);
            }
        });

        txtfieldedu.setFont(new java.awt.Font("Kruti Dev 010", 1, 24)); // NOI18N
        txtfieldedu.setForeground(new java.awt.Color(153, 153, 153));
        txtfieldedu.setText("f'k{kk ntZ djsa");
        txtfieldedu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtfieldeduFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtfieldeduFocusLost(evt);
            }
        });

        txtdatefirstdeployunit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtdatefirstdeployunit.setForeground(new java.awt.Color(153, 153, 153));
        txtdatefirstdeployunit.setText("YYYY-MM-DD");
        txtdatefirstdeployunit.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtdatefirstdeployunitFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtdatefirstdeployunitFocusLost(evt);
            }
        });

        DCpromotion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DCpromotion.setForeground(new java.awt.Color(153, 153, 153));
        DCpromotion.setText("YYYY-MM-DD");
        DCpromotion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                DCpromotionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                DCpromotionFocusLost(evt);
            }
        });

        DChighcourtdeploy.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DChighcourtdeploy.setForeground(new java.awt.Color(153, 153, 153));
        DChighcourtdeploy.setText("YYYY-MM-DD");
        DChighcourtdeploy.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                DChighcourtdeployFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                DChighcourtdeployFocusLost(evt);
            }
        });

        DCbasictpass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DCbasictpass.setForeground(new java.awt.Color(153, 153, 153));
        DCbasictpass.setText("YYYY-MM-DD");
        DCbasictpass.setPreferredSize(new java.awt.Dimension(90, 29));
        DCbasictpass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                DCbasictpassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                DCbasictpassFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel23))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CBbasict, 0, 295, Short.MAX_VALUE)
                            .addComponent(txtdatefirstdeployunit))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel21))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(previousunit, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtfieldiffail, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DChighcourtdeploy, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DCbasictpass, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel36)))
                .addGap(44, 44, 44)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(DCrecruit, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel25)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(txtfieldedu, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel37)))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(txtfieldcourse, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(DCpromotion, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(43, 43, 43))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                        .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CBbasict)
                        .addComponent(jLabel21)
                        .addComponent(txtfieldiffail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel22))
                    .addComponent(DCrecruit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(previousunit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel25)
                        .addComponent(DCpromotion, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtdatefirstdeployunit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtfieldcourse, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37)
                            .addComponent(txtfieldedu, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36))
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(DCbasictpass, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(DChighcourtdeploy, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        jPanel9.setBackground(new java.awt.Color(235, 250, 242));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "उत्तराधिकारी विवरण", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Kokila", 0, 36))); // NOI18N

        jLabel35.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel35.setText("जीवनसाथी का नाम :");

        txtfieldspname.setFont(new java.awt.Font("Kruti Dev 010", 1, 24)); // NOI18N
        txtfieldspname.setForeground(new java.awt.Color(153, 153, 153));
        txtfieldspname.setText("thoulkFkh dk uke ntZ djsa");
        txtfieldspname.setToolTipText("जीवन साथी का नाम दर्ज करें");
        txtfieldspname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtfieldspnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtfieldspnameFocusLost(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel38.setText("लिंग :");

        CBgender.setFont(new java.awt.Font("Kruti Dev 010", 0, 24)); // NOI18N
        CBgender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "iq:\"k", "efgyk", "vU;" }));
        CBgender.setToolTipText("लिंग का चयन करें");

        jLabel39.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel39.setText("मोबाइल नं :");

        txtfieldmobno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtfieldmobno.setForeground(new java.awt.Color(153, 153, 153));
        txtfieldmobno.setText("123456789");
        txtfieldmobno.setToolTipText("मोबाइल नम्बर दर्ज करें");
        txtfieldmobno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtfieldmobnoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtfieldmobnoFocusLost(evt);
            }
        });
        txtfieldmobno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfieldmobnoActionPerformed(evt);
            }
        });
        txtfieldmobno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtfieldmobnoKeyPressed(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel40.setText("व्यवसाय :");

        txtfieldstatus.setFont(new java.awt.Font("Kruti Dev 010", 1, 24)); // NOI18N
        txtfieldstatus.setForeground(new java.awt.Color(153, 153, 153));
        txtfieldstatus.setText("O;olk; ntZ djsa");
        txtfieldstatus.setToolTipText("जीवन साथी का व्यवसाय दर्ज करें");
        txtfieldstatus.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtfieldstatusFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtfieldstatusFocusLost(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel41.setText("जीवनसाथी का आधार क्रमांक :");

        txtfieldspaadhar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtfieldspaadhar.setForeground(new java.awt.Color(153, 153, 153));
        txtfieldspaadhar.setText("XXXXXX123456");
        txtfieldspaadhar.setToolTipText("जीवन साथी का आधार क्रमांक दर्ज करें");
        txtfieldspaadhar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtfieldspaadharFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtfieldspaadharFocusLost(evt);
            }
        });
        txtfieldspaadhar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtfieldspaadharKeyPressed(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel42.setText("पिता का आधार क्रमांक :");

        txtfieldfaadhar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtfieldfaadhar.setForeground(new java.awt.Color(153, 153, 153));
        txtfieldfaadhar.setText("XXXXXX123456");
        txtfieldfaadhar.setToolTipText("पिता का आधार क्रमांक दर्ज करें");
        txtfieldfaadhar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtfieldfaadharFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtfieldfaadharFocusLost(evt);
            }
        });
        txtfieldfaadhar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtfieldfaadharKeyPressed(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel43.setText("माता का नाम :");

        txtfieldmname.setFont(new java.awt.Font("Kruti Dev 010", 1, 24)); // NOI18N
        txtfieldmname.setForeground(new java.awt.Color(153, 153, 153));
        txtfieldmname.setText("ekrk dk uke ntZ djsa");
        txtfieldmname.setToolTipText("माता का नाम दर्ज करें");
        txtfieldmname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtfieldmnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtfieldmnameFocusLost(evt);
            }
        });

        jLabel44.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel44.setText("माता का आधार क्रमांक :");

        txtfieldmaadhar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtfieldmaadhar.setForeground(new java.awt.Color(153, 153, 153));
        txtfieldmaadhar.setText("XXXXXX123456");
        txtfieldmaadhar.setToolTipText("माता का आधार  क्रमांक दर्ज करें");
        txtfieldmaadhar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtfieldmaadharFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtfieldmaadharFocusLost(evt);
            }
        });
        txtfieldmaadhar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtfieldmaadharKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35)
                    .addComponent(jLabel40)
                    .addComponent(jLabel43))
                .addGap(35, 35, 35)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtfieldspname, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtfieldmname)
                        .addComponent(txtfieldstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(80, 80, 80)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addGap(79, 79, 79)
                        .addComponent(txtfieldmobno, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel41)
                            .addComponent(jLabel44))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtfieldspaadhar, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtfieldmaadhar, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(43, 43, 43)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel42)
                    .addComponent(jLabel38))
                .addGap(36, 36, 36)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtfieldfaadhar, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                    .addComponent(CBgender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtfieldspname, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel39)
                            .addComponent(txtfieldmobno, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38)
                            .addComponent(CBgender, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addComponent(txtfieldstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtfieldmname, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel35)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel41, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel40)
                                .addComponent(jLabel42)
                                .addComponent(txtfieldfaadhar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtfieldspaadhar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel43)
                            .addComponent(jLabel44)
                            .addComponent(txtfieldmaadhar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(235, 250, 242));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "बच्चों का विवरण", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Kokila", 0, 36))); // NOI18N

        jLabel34.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel34.setText("बच्चे :");

        CBchild.setFont(new java.awt.Font("Kruti Dev 010", 0, 24)); // NOI18N
        CBchild.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "iq=", "iq=h" }));
        CBchild.setToolTipText("बेटा या बेटी का चयन करें");

        jLabel45.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel45.setText("व्यवसाय :");

        txtfieldcstatus.setFont(new java.awt.Font("Kruti Dev 010", 1, 24)); // NOI18N
        txtfieldcstatus.setForeground(new java.awt.Color(153, 153, 153));
        txtfieldcstatus.setText("O;olk; ntZ djsa");
        txtfieldcstatus.setToolTipText("बच्चे का व्यवसाय दर्ज करें");
        txtfieldcstatus.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtfieldcstatusFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtfieldcstatusFocusLost(evt);
            }
        });

        jLabel46.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel46.setText("उत्तराधिकारी का पता :");

        jLabel47.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel47.setText("उत्तराधिकारी का खाता क्रमांक :");

        txtfieldsbankacc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtfieldsbankacc.setForeground(new java.awt.Color(153, 153, 153));
        txtfieldsbankacc.setText("XXXXXX123456");
        txtfieldsbankacc.setToolTipText("उत्तराधिकारी का खाता क्रमांक दर्ज करें");
        txtfieldsbankacc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtfieldsbankaccFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtfieldsbankaccFocusLost(evt);
            }
        });
        txtfieldsbankacc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtfieldsbankaccKeyPressed(evt);
            }
        });

        jLabel48.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel48.setText("उत्तराधिकारी का बैंक IFSC कोड :");

        txtfieldsifsc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtfieldsifsc.setForeground(new java.awt.Color(153, 153, 153));
        txtfieldsifsc.setText("ABCDXXXXXXXX");
        txtfieldsifsc.setToolTipText("IFSC कोड दर्ज करें");
        txtfieldsifsc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtfieldsifscFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtfieldsifscFocusLost(evt);
            }
        });

        txtareasadd.setColumns(20);
        txtareasadd.setFont(new java.awt.Font("Kruti Dev 010", 1, 24)); // NOI18N
        txtareasadd.setForeground(new java.awt.Color(153, 153, 153));
        txtareasadd.setRows(5);
        txtareasadd.setText("mÙkjkfèkdkjh dk irk ntZ djsa");
        txtareasadd.setToolTipText("उत्तराधिकारी का पता दर्ज करें");
        txtareasadd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtareasaddFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtareasaddFocusLost(evt);
            }
        });
        jScrollPane4.setViewportView(txtareasadd);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel47)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addGap(60, 60, 60)
                        .addComponent(CBchild, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(txtfieldsbankacc, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(jLabel48)
                        .addGap(49, 49, 49)
                        .addComponent(txtfieldsifsc, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel45)
                        .addGap(57, 57, 57)
                        .addComponent(txtfieldcstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(272, 272, 272)
                        .addComponent(jLabel46)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(CBchild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45)
                    .addComponent(txtfieldcstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46))
                .addGap(34, 34, 34)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(txtfieldsifsc, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfieldsbankacc, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137))
        );

        jPanel11.setBackground(new java.awt.Color(188, 208, 255));

        subbtn.setBackground(new java.awt.Color(0, 0, 129));
        subbtn.setFont(new java.awt.Font("Kokila", 0, 36)); // NOI18N
        subbtn.setForeground(new java.awt.Color(255, 255, 255));
        subbtn.setText("दर्ज करें");
        subbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(subbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subbtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(0, 0, 129));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Developed & Designed By Ankit Limone & Mahak Gupta ( students of ) International Institute of Professional Studies, Devi Ailya Vishwavidyalaya, Indore");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(286, 286, 286)
                .addComponent(jLabel1)
                .addContainerGap(377, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        pack();
    }// </editor-fold>                        

    private void ubtnActionPerformed(java.awt.event.ActionEvent evt) {                                     
        close();
        UpdateFrame IF = new UpdateFrame();
        IF.setVisible(true);
    }                                    

    private void sbtnActionPerformed(java.awt.event.ActionEvent evt) {                                     
        close();
        SearchFrame IF = new SearchFrame();
        IF.setVisible(true);
    }                                    
    private JFrame frame;
    private void ebtnActionPerformed(java.awt.event.ActionEvent evt) {                                     
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"पुष्टि करें कि क्या आप बाहर निकलना चाहते हैं","POSTING REGISTER",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
        { 
           System.exit(0);
        }
        
    }                                    

    private void resetbtnActionPerformed(java.awt.event.ActionEvent evt) {                                         
        txtfieldUC.setText("");
        CBpost.setSelectedIndex(0);
        txtfieldspaadhar.setText("");
        CBcategory.setSelectedIndex(0);
        txtfieldaadhar.setText("");
        DCbirth.setCalendar(null);
        CBblood.setSelectedIndex(0);
        DCrecruit.setCalendar(null);
        txtfieldbadgeno.setText("");
        CBbasict.setSelectedIndex(0);
        
        txtfieldbankacc.setText("");
        txtfieldedu.setText("");
        
        previousunit.setText("");
        CBgender.setSelectedIndex(0);
        DCpromotion.setText("");
        CBchild.setSelectedIndex(0);
        txtfieldcourse.setText("");
        DChighcourtdeploy.setText("");
        txtfieldcstatus.setText("");
        DCbasictpass.setText("");
        txtfieldfaadhar.setText("");
        txtfieldfname.setText("");
        txtfieldgpfdpf.setText("");
        txtfieldhd.setText("");
        txtfieldiffail.setText("");
        txtfieldifsc.setText("");
        txtfieldmaadhar.setText("");
        txtfieldmname.setText("");
        txtfieldmobno.setText("");
        txtfieldname.setText("");
        txtfieldpan.setText("");
        txtfieldsbankacc.setText("");
        txtfieldsifsc.setText("");
        txtfieldspname.setText("");
        txtfieldstatus.setText("");
        txtarealadd.setText("");
        txtareapadd.setText("");
        txtareasadd.setText("");
        txtfieldpran.setText("");
        txtdatefirstdeployunit.setText("");
    }                                        

    private void subbtnActionPerformed(java.awt.event.ActionEvent evt) {                                       
        try{
             Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConn = DriverManager.getConnection(dataConn,username,password);
           
            sqlConn.setAutoCommit(false);
            String insertintopersonal = "INSERT into `personal_details`(यूनिक_कोड,पद,बैज_क्रमांक,नाम,पिता_का_नाम,वर्ग,आधार_क्रमांक,पैन_कार्ड_क्रमांक,GPF_DPF_NPS_no,बैंक_खाता_क्र,आईएफएससी_कोड,ग्रह_जिला,जन्म_दिनांक,स्थायी_पता,वर्तमान_पता,ब्लड_ग्रुप,PRAN_क्रमांक)value(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst = sqlConn.prepareStatement(insertintopersonal);
 
            pst.setString(1, txtfieldUC.getText());
            String post;
            post =CBpost.getSelectedItem().toString();
            pst.setString(2, post);
            pst.setString(3, txtfieldbadgeno.getText());
            pst.setString(4, txtfieldname.getText());
            pst.setString(5, txtfieldfname.getText());
            String category;
            category = CBcategory.getSelectedItem().toString();
            pst.setString(6, category);
            pst.setString(7, txtfieldaadhar.getText());
            pst.setString(8, txtfieldpan.getText());
            pst.setString(9, txtfieldgpfdpf.getText());
            pst.setString(10, txtfieldbankacc.getText());
            pst.setString(11, txtfieldifsc.getText());
            pst.setString(12, txtfieldhd.getText());

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

            String Birthdate = sdf.format(DCbirth.getDate());
            pst.setString(13, Birthdate);

            pst.setString(14, txtareapadd.getText());
            pst.setString(15, txtareapadd.getText());
            String bloodgroup;
            bloodgroup = CBblood.getSelectedItem().toString();
            pst.setString(16, bloodgroup);
            pst.setString(17, txtfieldpran.getText());

            pst.execute();

            String insertintotraining = "INSERT into `training_details`(यूनिक_कोड,बुनियादी_प्रक्षिक्षण,यदि_अनुत्तीर्ण_हैं_तो,भर्ती_की_दिनांक,प्रथम_नियुक्ति_इकाई,पूर्व_इकाई,वर्तमान_पदोन्नति_दिनांक,मान_उ_न्याया_इंदौर_में_तैनाती_दिनांक,बुनियादी_प्रक्षिक्षण_उत्तीर्ण_दिनांक,शिक्षा,कोर्स)value(?,?,?,?,?,?,?,?,?,?,?)";
            pst = sqlConn.prepareStatement(insertintotraining);

            pst.setString(1, txtfieldUC.getText());
            String basictraining;
            basictraining = CBbasict.getSelectedItem().toString();
            pst.setString(2, basictraining);
            pst.setString(3, txtfieldiffail.getText());

            String Recruitdate = sdf.format(DCrecruit.getDate());
            pst.setString(4, Recruitdate);
            
            
            //String firstjoiningunitdate = sdf.format(DCfirstjoiningunit.getDate());
            //pst.setString(5, firstjoiningunitdate);
            
            pst.setString(5, txtdatefirstdeployunit.getText());

            pst.setString(6, previousunit.getText());
            
            //String promotiondate = sdf.format(DCpromotion.getDate());
            //pst.setString(7, promotiondate);
            
            pst.setString(7, DCpromotion.getText());

            //String highcourtdeploydate = sdf.format(DChighcourtdeploy.getDate());
            //pst.setString(8, highcourtdeploydate);

            pst.setString(8, DChighcourtdeploy.getText());
            
            //String basictpassdate = sdf.format(DCbasictpass.getDate());
            //pst.setString(9, basictpassdate);

            pst.setString(9, DCbasictpass.getText());
            
            pst.setString(10,txtfieldedu.getText());
            pst.setString(11, txtfieldcourse.getText());
            pst.execute();

            String insertintosuccesor = "INSERT into `successors_details`(यूनिक_कोड,जीवनसाथी_का_नाम,लिंग,मोबाइल_नं,व्यवसाय,जीवनसाथी_का_आधार_क्रमांक,पिता_का_आधार_क्रमांक,माता_का_नाम,माता_का_आधार_क्रमांक,बच्चे,बच्चो_का_व्यवसाय,उत्तराधिकारी_का_पता,उत्तराधिकारी_का_खाता_क्रमांक,उत्तराधिकारी_का_बैंक_IFSC_कोड)value(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst = sqlConn.prepareStatement(insertintosuccesor);

            pst.setString(1, txtfieldUC.getText());
            pst.setString(2, txtfieldspname.getText());
            String gender;
            gender = CBgender.getSelectedItem().toString();
            pst.setString(3, gender);
            pst.setString(4, txtfieldmobno.getText());
            pst.setString(5, txtfieldstatus.getText());
            pst.setString(6, txtfieldspaadhar.getText());
            pst.setString(7, txtfieldfaadhar.getText());
            pst.setString(8, txtfieldmname.getText());
            pst.setString(9, txtfieldmaadhar.getText());
            String child;
            child = CBchild.getSelectedItem().toString();
            pst.setString(10, child);
            pst.setString(11, txtfieldcstatus.getText());
            pst.setString(12, txtareasadd.getText());
            pst.setString(13, txtfieldsbankacc.getText());
            pst.setString(14, txtfieldsifsc.getText());
 
            pst.execute();
            JOptionPane.showMessageDialog(this, "रिकॉर्ड सफलतापूर्वक जोड़ा गया");
            sqlConn.commit();
            upDateDB();


            } catch (ClassNotFoundException ex) {
                
            try {
                sqlConn.rollback();
            } catch (SQLException ex1) {
                JOptionPane.showMessageDialog(null, ex1,"SQL Error",JOptionPane.ERROR_MESSAGE);
                
                Logger.getLogger(InsertFrame.class.getName()).log(Level.SEVERE, null, ex1);
            }
            
            Logger.getLogger(InsertFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            
            try {
                sqlConn.rollback();
            } catch (SQLException ex1) {
                JOptionPane.showMessageDialog(null, ex1,"SQL Error",JOptionPane.ERROR_MESSAGE);
                
                Logger.getLogger(InsertFrame.class.getName()).log(Level.SEVERE, null, ex1);
            }
            
            Logger.getLogger(InsertFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
           

    }                                      

    private void txtfieldUCActionPerformed(java.awt.event.ActionEvent evt) {                                           
        
    }                                          

    private void txtfieldmobnoActionPerformed(java.awt.event.ActionEvent evt) {                                              
      

    }                                             

    private void txtfieldmobnoKeyPressed(java.awt.event.KeyEvent evt) {                                         
        String phoneNumber = txtfieldmobno.getText();
           int length = phoneNumber.length();

           char c = evt.getKeyChar();

           if(evt.getKeyChar()>='0'&&evt.getKeyChar()<='9'){ 
                  if(length<10){
                        txtfieldmobno.setEditable(true);
                    }else{
                        txtfieldmobno.setEditable(false);
                     }      
               }else{
                   if(evt.getExtendedKeyCode()==KeyEvent.VK_BACKSPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                      txtfieldmobno.setEditable(true);
               }else{
                      txtfieldmobno.setEditable(false);
             } 
            }
    }                                        

    private void txtfieldUCKeyPressed(java.awt.event.KeyEvent evt) {                                      
                String uniqueCode = txtfieldUC.getText();
           int length = uniqueCode.length();

           char c = evt.getKeyChar();

           if(evt.getKeyChar()>='0'&&evt.getKeyChar()<='9'){ 
                  if(length<9){
                        txtfieldUC.setEditable(true);
                    }else{
                        txtfieldUC.setEditable(false);
                     }      
               }else{
                   if(evt.getExtendedKeyCode()==KeyEvent.VK_BACKSPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                      txtfieldUC.setEditable(true);
               }else{
                      txtfieldUC.setEditable(false);
             } 
            }
    }                                     

    private void txtfieldaadharKeyPressed(java.awt.event.KeyEvent evt) {                                          
        String aadharNumber = txtfieldaadhar.getText();
           int length = aadharNumber.length();

           char c = evt.getKeyChar();

           if(evt.getKeyChar()>='0'&&evt.getKeyChar()<='9'){ 
                  if(length<12){
                        txtfieldaadhar.setEditable(true);
                    }else{
                        txtfieldaadhar.setEditable(false);
                     }      
               }else{
                   if(evt.getExtendedKeyCode()==KeyEvent.VK_BACKSPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                      txtfieldaadhar.setEditable(true);
               }else{
                      txtfieldaadhar.setEditable(false);
             } 
            }
    }                                         

    private void txtfieldbankaccKeyPressed(java.awt.event.KeyEvent evt) {                                           
        String bankAccountNumber = txtfieldbankacc.getText();
           int length = bankAccountNumber.length();

           char c = evt.getKeyChar();

           if(evt.getKeyChar()>='0'&&evt.getKeyChar()<='9'){ 
                  if(length<19){
                        txtfieldbankacc.setEditable(true);
                    }else{
                        txtfieldbankacc.setEditable(false);
                     }      
               }else{
                   if(evt.getExtendedKeyCode()==KeyEvent.VK_BACKSPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                      txtfieldbankacc.setEditable(true);
               }else{
                      txtfieldbankacc.setEditable(false);
             } 
            }
    }                                          

    private void txtfieldpranKeyPressed(java.awt.event.KeyEvent evt) {                                        
        String PRANNumber = txtfieldpran.getText();
           int length = PRANNumber.length();

           char c = evt.getKeyChar();

           if(evt.getKeyChar()>='0'&&evt.getKeyChar()<='9'){ 
                  if(length<13){
                        txtfieldpran.setEditable(true);
                    }else{
                        txtfieldpran.setEditable(false);
                     }      
               }else{
                   if(evt.getExtendedKeyCode()==KeyEvent.VK_BACKSPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                      txtfieldpran.setEditable(true);
               }else{
                      txtfieldpran.setEditable(false);
             } 
            }
    }                                       

    private void txtfieldbadgenoKeyPressed(java.awt.event.KeyEvent evt) {                                           
        String BadgeNumber = txtfieldbadgeno.getText();
           int length = BadgeNumber.length();

           char c = evt.getKeyChar();

           if(evt.getKeyChar()>='0'&&evt.getKeyChar()<='9'){ 
                  if(length<5){
                        txtfieldbadgeno.setEditable(true);
                    }else{
                        txtfieldbadgeno.setEditable(false);
                     }      
               }else{
                   if(evt.getExtendedKeyCode()==KeyEvent.VK_BACKSPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                      txtfieldbadgeno.setEditable(true);
               }else{
                      txtfieldbadgeno.setEditable(false);
             } 
            }
    }                                          

    private void txtfieldspaadharKeyPressed(java.awt.event.KeyEvent evt) {                                            
        String SpouseAADHAR = txtfieldspaadhar.getText();
           int length = SpouseAADHAR.length();

           char c = evt.getKeyChar();

           if(evt.getKeyChar()>='0'&&evt.getKeyChar()<='9'){ 
                  if(length<12){
                        txtfieldspaadhar.setEditable(true);
                    }else{
                        txtfieldspaadhar.setEditable(false);
                     }      
               }else{
                   if(evt.getExtendedKeyCode()==KeyEvent.VK_BACKSPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                      txtfieldspaadhar.setEditable(true);
               }else{
                      txtfieldspaadhar.setEditable(false);
             } 
            }
    }                                           

    private void txtfieldfaadharKeyPressed(java.awt.event.KeyEvent evt) {                                           
        String FatherAadharnumber = txtfieldfaadhar.getText();
           int length = FatherAadharnumber.length();

           char c = evt.getKeyChar();

           if(evt.getKeyChar()>='0'&&evt.getKeyChar()<='9'){ 
                  if(length<12){
                        txtfieldfaadhar.setEditable(true);
                    }else{
                        txtfieldfaadhar.setEditable(false);
                     }      
               }else{
                   if(evt.getExtendedKeyCode()==KeyEvent.VK_BACKSPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                      txtfieldfaadhar.setEditable(true);
               }else{
                      txtfieldfaadhar.setEditable(false);
             } 
            }
    }                                          

    private void txtfieldmaadharKeyPressed(java.awt.event.KeyEvent evt) {                                           
        String Motheraadharnumber = txtfieldmaadhar.getText();
           int length = Motheraadharnumber.length();

           char c = evt.getKeyChar();

           if(evt.getKeyChar()>='0'&&evt.getKeyChar()<='9'){ 
                  if(length<12){
                        txtfieldmaadhar.setEditable(true);
                    }else{
                        txtfieldmaadhar.setEditable(false);
                     }      
               }else{
                   if(evt.getExtendedKeyCode()==KeyEvent.VK_BACKSPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                      txtfieldmaadhar.setEditable(true);
               }else{
                      txtfieldmaadhar.setEditable(false);
             } 
            }
    }                                          

    private void txtfieldsbankaccKeyPressed(java.awt.event.KeyEvent evt) {                                            
        String Successorsbankdetail = txtfieldsbankacc.getText();
           int length = Successorsbankdetail.length();

           char c = evt.getKeyChar();

           if(evt.getKeyChar()>='0'&&evt.getKeyChar()<='9'){ 
                  if(length<19){
                        txtfieldsbankacc.setEditable(true);
                    }else{
                        txtfieldsbankacc.setEditable(false);
                     }      
               }else{
                   if(evt.getExtendedKeyCode()==KeyEvent.VK_BACKSPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                      txtfieldsbankacc.setEditable(true);
               }else{
                      txtfieldsbankacc.setEditable(false);
             } 
            }
    }                                           

    private void txtfieldpanKeyReleased(java.awt.event.KeyEvent evt) {                                        
        //String Successorsbankdetail = txtfieldpan.getText();
        //String regex = "[A-Z]{5}[0-9]{4}[A-Z]{1}";
 
        Pattern p = Pattern.compile("^[A-Z]{5}[0-9]{4}[A-Z]{1}$");
        Matcher m = p.matcher(txtfieldpan.getText());
    }                                       

    private void txtfieldhdActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void txtfieldUCFocusLost(java.awt.event.FocusEvent evt) {                                     
        if(txtfieldUC.getText().equals("")){
            txtfieldUC.setText("123456789");
            txtfieldUC.setForeground(new Color(153,153,153));
        }
    }                                    

    private void txtfieldUCFocusGained(java.awt.event.FocusEvent evt) {                                       
        if(txtfieldUC.getText().equals("123456789")){
            txtfieldUC.setText("");
            txtfieldUC.setForeground(new Color(0,0,0));
        }
    }                                      

    private void txtfieldbadgenoActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void txtfieldbadgenoFocusGained(java.awt.event.FocusEvent evt) {                                            
         if(
            txtfieldbadgeno.getText().equals("12345")){
            txtfieldbadgeno.setText("");
            txtfieldbadgeno.setForeground(new Color(0,0,0));
        }
    }                                           

    private void txtfieldbadgenoFocusLost(java.awt.event.FocusEvent evt) {                                          
        if(
            txtfieldbadgeno.getText().equals("")){
            txtfieldbadgeno.setText("12345");
            txtfieldbadgeno.setForeground(new Color(153,153,153));
        }
    }                                         

    private void txtfieldnameFocusGained(java.awt.event.FocusEvent evt) {                                         
        if(
            txtfieldname.getText().equals("uke ntZ djsa")){
            txtfieldname.setText("");
            txtfieldname.setForeground(new Color(0,0,0));
        }
    }                                        

    private void txtfieldnameFocusLost(java.awt.event.FocusEvent evt) {                                       
        if(
            txtfieldname.getText().equals("")){
            txtfieldname.setText("uke ntZ djsa");
            txtfieldname.setForeground(new Color(153,153,153));
        }
    }                                      

    private void txtfieldnameActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void txtfieldfnameFocusGained(java.awt.event.FocusEvent evt) {                                          
        if(
            txtfieldfname.getText().equals("firk dk uke ntZ djsa")){
            txtfieldfname.setText("");
            txtfieldfname.setForeground(new Color(0,0,0));
        }
    }                                         

    private void txtfieldfnameFocusLost(java.awt.event.FocusEvent evt) {                                        
        if(
            txtfieldfname.getText().equals("")){
            txtfieldfname.setText("firk dk uke ntZ djsa");
            txtfieldfname.setForeground(new Color(153,153,153));
        }
    }                                       

    private void txtfieldaadharActionPerformed(java.awt.event.ActionEvent evt) {                                               
        
    }                                              

    private void txtfieldaadharFocusGained(java.awt.event.FocusEvent evt) {                                           
        if(
            txtfieldaadhar.getText().equals("XXXX12345678")){
            txtfieldaadhar.setText("");
            txtfieldaadhar.setForeground(new Color(0,0,0));
        }
    }                                          

    private void txtfieldaadharFocusLost(java.awt.event.FocusEvent evt) {                                         
       if(
            txtfieldaadhar.getText().equals("")){
            txtfieldaadhar.setText("XXXX12345678");
            txtfieldaadhar.setForeground(new Color(153,153,153));
        }
    }                                        

    private void txtfieldpanFocusGained(java.awt.event.FocusEvent evt) {                                        
        if(
            txtfieldpan.getText().equals("ABCDE1234F")){
            txtfieldpan.setText("");
            txtfieldpan.setForeground(new Color(0,0,0));
        }
    }                                       

    private void txtfieldpanFocusLost(java.awt.event.FocusEvent evt) {                                      
         if(
            txtfieldpan.getText().equals("")){
            txtfieldpan.setText("ABCDE1234F");
            txtfieldpan.setForeground(new Color(153,153,153));
        }
    }                                     

    private void txtfieldgpfdpfFocusGained(java.awt.event.FocusEvent evt) {                                           
            if(
            txtfieldgpfdpf.getText().equals("ABCDE12345")){
            txtfieldgpfdpf.setText("");
            txtfieldgpfdpf.setForeground(new Color(0,0,0));
        }
    }                                          

    private void txtfieldgpfdpfFocusLost(java.awt.event.FocusEvent evt) {                                         
        if(
            txtfieldgpfdpf.getText().equals("")){
            txtfieldgpfdpf.setText("ABCDE12345");
            txtfieldgpfdpf.setForeground(new Color(153,153,153));
        }
    }                                        

    private void txtfieldbankaccActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void txtfieldbankaccFocusGained(java.awt.event.FocusEvent evt) {                                            
         if(
            txtfieldbankacc.getText().equals("1234567890X")){
            txtfieldbankacc.setText("");
            txtfieldbankacc.setForeground(new Color(0,0,0));
        }
    }                                           

    private void txtfieldbankaccFocusLost(java.awt.event.FocusEvent evt) {                                          
         if(
            txtfieldbankacc.getText().equals("")){
            txtfieldbankacc.setText("1234567890X");
            txtfieldbankacc.setForeground(new Color(153,153,153));
        }
    }                                         

    private void txtfieldifscFocusGained(java.awt.event.FocusEvent evt) {                                         
        if(
            txtfieldifsc.getText().equals("ABCDXXXXXXX")){
            txtfieldifsc.setText("");
            txtfieldifsc.setForeground(new Color(0,0,0));
        }
    }                                        

    private void txtfieldifscFocusLost(java.awt.event.FocusEvent evt) {                                       
        if(
            txtfieldifsc.getText().equals("")){
            txtfieldifsc.setText("ABCDXXXXXXX");
            txtfieldifsc.setForeground(new Color(153,153,153));
        }
    }                                      

    private void txtfieldhdFocusGained(java.awt.event.FocusEvent evt) {                                       
        if(
            txtfieldhd.getText().equals("xzg ftyk ntZ djsa")){
            txtfieldhd.setText("");
            txtfieldhd.setForeground(new Color(0,0,0));
        }
    }                                      

    private void txtfieldhdFocusLost(java.awt.event.FocusEvent evt) {                                     
        if(
            txtfieldhd.getText().equals("")){
            txtfieldhd.setText("xzg ftyk ntZ djsa");
            txtfieldhd.setForeground(new Color(153,153,153));
        }
    }                                    

    private void txtareapaddFocusGained(java.awt.event.FocusEvent evt) {                                        
        if(
            txtareapadd.getText().equals("LFkk;h irk ntZ djsa")){
            txtareapadd.setText("");
            txtareapadd.setForeground(new Color(0,0,0));
        }
    }                                       

    private void txtareapaddFocusLost(java.awt.event.FocusEvent evt) {                                      
        if(
            txtareapadd.getText().equals("")){
            txtareapadd.setText("LFkk;h irk ntZ djsa");
            txtareapadd.setForeground(new Color(153,153,153));
        }
    }                                     

    private void txtarealaddFocusGained(java.awt.event.FocusEvent evt) {                                        
        if(
            txtarealadd.getText().equals("orZeku irk ntZ djsa")){
            txtarealadd.setText("");
            txtarealadd.setForeground(new Color(0,0,0));
        }
    }                                       

    private void txtarealaddFocusLost(java.awt.event.FocusEvent evt) {                                      
        if(
            txtarealadd.getText().equals("")){
            txtarealadd.setText("orZeku irk ntZ djsa");
            txtarealadd.setForeground(new Color(153,153,153));
        }
    }                                     

    private void txtfieldpranFocusGained(java.awt.event.FocusEvent evt) {                                         
        if(
            txtfieldpran.getText().equals("XXXXXX567890")){
            txtfieldpran.setText("");
            txtfieldpran.setForeground(new Color(0,0,0));
        }
    }                                        

    private void txtfieldpranFocusLost(java.awt.event.FocusEvent evt) {                                       
        if(
            txtfieldpran.getText().equals("")){
            txtfieldpran.setText("XXXXXX567890");
            txtfieldpran.setForeground(new Color(153,153,153));
        }
    }                                      

    private void txtfieldiffailFocusGained(java.awt.event.FocusEvent evt) {                                           
        if(
            txtfieldiffail.getText().equals("fooj.k ntZ djsa")){
            txtfieldiffail.setText("");
            txtfieldiffail.setForeground(new Color(0,0,0));
        }
    }                                          

    private void txtfieldiffailFocusLost(java.awt.event.FocusEvent evt) {                                         
        if(
            txtfieldiffail.getText().equals("")){
            txtfieldiffail.setText("fooj.k ntZ djsa");
            txtfieldiffail.setForeground(new Color(153,153,153));
        }
    }                                        

    private void txtfieldiffailActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void txtfieldcourseFocusGained(java.awt.event.FocusEvent evt) {                                           
        if(
            txtfieldcourse.getText().equals("dkslZ ntZ djsa")){
            txtfieldcourse.setText("");
            txtfieldcourse.setForeground(new Color(0,0,0));
        }
    }                                          

    private void txtfieldcourseFocusLost(java.awt.event.FocusEvent evt) {                                         
        if(
            txtfieldcourse.getText().equals("")){
            txtfieldcourse.setText("dkslZ ntZ djsa");
            txtfieldcourse.setForeground(new Color(153,153,153));
        }
    }                                        

    private void txtfieldspnameFocusGained(java.awt.event.FocusEvent evt) {                                           
        if(
            txtfieldspname.getText().equals("thoulkFkh dk uke ntZ djsa")){
            txtfieldspname.setText("");
            txtfieldspname.setForeground(new Color(0,0,0));
        }
    }                                          

    private void txtfieldspnameFocusLost(java.awt.event.FocusEvent evt) {                                         
        if(
            txtfieldspname.getText().equals("")){
            txtfieldspname.setText("thoulkFkh dk uke ntZ djsa");
            txtfieldspname.setForeground(new Color(153,153,153));
        }
    }                                        

    private void txtfieldmobnoFocusGained(java.awt.event.FocusEvent evt) {                                          
        if(
            txtfieldmobno.getText().equals("123456789")){
            txtfieldmobno.setText("");
            txtfieldmobno.setForeground(new Color(0,0,0));
        }
    }                                         

    private void txtfieldmobnoFocusLost(java.awt.event.FocusEvent evt) {                                        
       if(
            txtfieldmobno.getText().equals("")){
            txtfieldmobno.setText("123456789");
            txtfieldmobno.setForeground(new Color(153,153,153));
        }
    }                                       

    private void txtfieldstatusFocusGained(java.awt.event.FocusEvent evt) {                                           
        if(
            txtfieldstatus.getText().equals("O;olk; ntZ djsa")){
            txtfieldstatus.setText("");
            txtfieldstatus.setForeground(new Color(0,0,0));
        }
    }                                          

    private void txtfieldstatusFocusLost(java.awt.event.FocusEvent evt) {                                         
        if(
            txtfieldstatus.getText().equals("")){
            txtfieldstatus.setText("O;olk; ntZ djsa");
            txtfieldstatus.setForeground(new Color(153,153,153));
        }    
    }                                        

    private void txtfieldspaadharFocusGained(java.awt.event.FocusEvent evt) {                                             
        if(
            txtfieldspaadhar.getText().equals("XXXXXX123456")){
            txtfieldspaadhar.setText("");
            txtfieldspaadhar.setForeground(new Color(0,0,0));
        }
    }                                            

    private void txtfieldspaadharFocusLost(java.awt.event.FocusEvent evt) {                                           
        if(
            txtfieldspaadhar.getText().equals("")){
            txtfieldspaadhar.setText("XXXXXX123456");
            txtfieldspaadhar.setForeground(new Color(153,153,153));
        }
    }                                          

    private void txtfieldfaadharFocusGained(java.awt.event.FocusEvent evt) {                                            
        if(
            txtfieldfaadhar.getText().equals("XXXXXX123456")){
            txtfieldfaadhar.setText("");
            txtfieldfaadhar.setForeground(new Color(0,0,0));
        }
    }                                           

    private void txtfieldfaadharFocusLost(java.awt.event.FocusEvent evt) {                                          
        if(
            txtfieldfaadhar.getText().equals("")){
            txtfieldfaadhar.setText("XXXXXX123456");
            txtfieldfaadhar.setForeground(new Color(153,153,153));
        }
    }                                         

    private void txtfieldmnameFocusGained(java.awt.event.FocusEvent evt) {                                          
        if(
            txtfieldmname.getText().equals("ekrk dk uke ntZ djsa")){
            txtfieldmname.setText("");
            txtfieldmname.setForeground(new Color(0,0,0));
        }
    }                                         

    private void txtfieldmnameFocusLost(java.awt.event.FocusEvent evt) {                                        
        if(
            txtfieldmname.getText().equals("")){
            txtfieldmname.setText("ekrk dk uke ntZ djsa");
            txtfieldmname.setForeground(new Color(153,153,153));
        }
    }                                       

    private void txtfieldmaadharFocusGained(java.awt.event.FocusEvent evt) {                                            
        if(
            txtfieldmaadhar.getText().equals("XXXXXX123456")){
            txtfieldmaadhar.setText("");
            txtfieldmaadhar.setForeground(new Color(0,0,0));
        }
    }                                           

    private void txtfieldmaadharFocusLost(java.awt.event.FocusEvent evt) {                                          
        if(
            txtfieldmaadhar.getText().equals("")){
            txtfieldmaadhar.setText("XXXXXX123456");
            txtfieldmaadhar.setForeground(new Color(153,153,153));
        }
    }                                         

    private void txtfieldcstatusFocusGained(java.awt.event.FocusEvent evt) {                                            
        if(
            txtfieldcstatus.getText().equals("O;olk; ntZ djsa")){
            txtfieldcstatus.setText("");
            txtfieldcstatus.setForeground(new Color(0,0,0));
        }
    }                                           

    private void txtfieldcstatusFocusLost(java.awt.event.FocusEvent evt) {                                          
         if(
            txtfieldmaadhar.getText().equals("")){
            txtfieldmaadhar.setText("O;olk; ntZ djsa");
            txtfieldmaadhar.setForeground(new Color(153,153,153));
        }
    }                                         

    private void txtareasaddFocusGained(java.awt.event.FocusEvent evt) {                                        
        if(
            txtareasadd.getText().equals("mÙkjkfèkdkjh dk irk ntZ djsa")){
            txtareasadd.setText("");
            txtareasadd.setForeground(new Color(0,0,0));
        }
    }                                       

    private void txtareasaddFocusLost(java.awt.event.FocusEvent evt) {                                      
        if(
            txtareasadd.getText().equals("")){
            txtareasadd.setText("mÙkjkfèkdkjh dk irk ntZ djsa");
            txtareasadd.setForeground(new Color(153,153,153));
        }
    }                                     

    private void txtfieldsbankaccFocusGained(java.awt.event.FocusEvent evt) {                                             
        if(
            txtfieldsbankacc.getText().equals("XXXXXX123456")){
            txtfieldsbankacc.setText("");
            txtfieldsbankacc.setForeground(new Color(0,0,0));
        }
    }                                            

    private void txtfieldsbankaccFocusLost(java.awt.event.FocusEvent evt) {                                           
        if(
            txtfieldsbankacc.getText().equals("")){
            txtfieldsbankacc.setText("XXXXXX123456");
            txtfieldsbankacc.setForeground(new Color(153,153,153));
        }
    }                                          

    private void txtfieldsifscFocusGained(java.awt.event.FocusEvent evt) {                                          
        if(
            txtfieldsifsc.getText().equals("ABCDXXXXXXXX")){
            txtfieldsifsc.setText("");
            txtfieldsifsc.setForeground(new Color(0,0,0));
        }
    }                                         

    private void txtfieldsifscFocusLost(java.awt.event.FocusEvent evt) {                                        
        if(
            txtfieldsifsc.getText().equals("")){
            txtfieldsifsc.setText("ABCDXXXXXXXX");
            txtfieldsifsc.setForeground(new Color(153,153,153));
        }
    }                                       

    private void previousunitFocusGained(java.awt.event.FocusEvent evt) {                                         
        if(
            previousunit.getText().equals("iwoZ bdkbZ ntZ djsa")){
            previousunit.setText("");
            previousunit.setForeground(new Color(0,0,0));
        }
    }                                        

    private void previousunitFocusLost(java.awt.event.FocusEvent evt) {                                       
        if(
            previousunit.getText().equals("")){
            previousunit.setText("iwoZ bdkbZ ntZ djsa");
            previousunit.setForeground(new Color(153,153,153));
        }
    }                                      

    private void txtfieldeduFocusGained(java.awt.event.FocusEvent evt) {                                        
        if(
            txtfieldedu.getText().equals("f'k{kk ntZ djsa")){
            txtfieldedu.setText("");
            txtfieldedu.setForeground(new Color(0,0,0));
        }
    }                                       

    private void txtfieldeduFocusLost(java.awt.event.FocusEvent evt) {                                      
        if(
            txtfieldedu.getText().equals("")){
            txtfieldedu.setText("f'k{kk ntZ djsa");
            txtfieldedu.setForeground(new Color(153,153,153));
        }
    }                                     

    private void txtdatefirstdeployunitFocusLost(java.awt.event.FocusEvent evt) {                                                 
            if(txtdatefirstdeployunit.getText().equals("")){
            txtdatefirstdeployunit.setText("YYYY-MM-DD");
            txtdatefirstdeployunit.setForeground(new Color(153,153,153));}
    }                                                

    private void txtdatefirstdeployunitFocusGained(java.awt.event.FocusEvent evt) {                                                   
        if(
            txtdatefirstdeployunit.getText().equals("YYYY-MM-DD")){
            txtdatefirstdeployunit.setText("");
            txtdatefirstdeployunit.setForeground(new Color(0,0,0));
        }
    }                                                  

    private void DCpromotionFocusGained(java.awt.event.FocusEvent evt) {                                        
       if(
            DCpromotion.getText().equals("YYYY-MM-DD")){
            DCpromotion.setText("");
            DCpromotion.setForeground(new Color(0,0,0));
        }
    }                                       

    private void DCpromotionFocusLost(java.awt.event.FocusEvent evt) {                                      
      if(
            DCpromotion.getText().equals("")){
            DCpromotion.setText("YYYY-MM-DD");
            DCpromotion.setForeground(new Color(153,153,153));
        }
    }                                     

    private void DChighcourtdeployFocusGained(java.awt.event.FocusEvent evt) {                                              
       if(
            DChighcourtdeploy.getText().equals("YYYY-MM-DD")){
            DChighcourtdeploy.setText("");
            DChighcourtdeploy.setForeground(new Color(0,0,0));
        }
    }                                             

    private void DChighcourtdeployFocusLost(java.awt.event.FocusEvent evt) {                                            
       if(
            DChighcourtdeploy.getText().equals("")){
            DChighcourtdeploy.setText("YYYY-MM-DD");
            DChighcourtdeploy.setForeground(new Color(153,153,153));
        }
    }                                           

    private void DCbasictpassFocusGained(java.awt.event.FocusEvent evt) {                                         
      if(
            DCbasictpass.getText().equals("YYYY-MM-DD")){
            DCbasictpass.setText("");
            DCbasictpass.setForeground(new Color(0,0,0));
        }
    }                                        

    private void DCbasictpassFocusLost(java.awt.event.FocusEvent evt) {                                       
      if(
            DCbasictpass.getText().equals("")){
            DCbasictpass.setText("YYYY-MM-DD");
            DCbasictpass.setForeground(new Color(153,153,153));
        }
    }                                      

    
    
    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InsertFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

LocalDate localDate = LocalDate.now();
java.sql.Date.valueOf( localDate );
Date sqlDate = Date.valueOf(localDate);
sqlDate.toLocalDate();


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JComboBox<String> CBbasict;
    private javax.swing.JComboBox<String> CBblood;
    private javax.swing.JComboBox<String> CBcategory;
    private javax.swing.JComboBox<String> CBchild;
    private javax.swing.JComboBox<String> CBgender;
    private javax.swing.JComboBox<String> CBpost;
    private javax.swing.JTextField DCbasictpass;
    private com.toedter.calendar.JDateChooser DCbirth;
    private javax.swing.JTextField DChighcourtdeploy;
    private javax.swing.JTextField DCpromotion;
    private com.toedter.calendar.JDateChooser DCrecruit;
    private javax.swing.JButton ebtn;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField previousunit;
    private javax.swing.JButton resetbtn;
    private javax.swing.JButton sbtn;
    private javax.swing.JButton subbtn;
    private javax.swing.JTextArea txtarealadd;
    private javax.swing.JTextArea txtareapadd;
    private javax.swing.JTextArea txtareasadd;
    private javax.swing.JTextField txtdatefirstdeployunit;
    private javax.swing.JTextField txtfieldUC;
    private javax.swing.JTextField txtfieldaadhar;
    private javax.swing.JTextField txtfieldbadgeno;
    private javax.swing.JTextField txtfieldbankacc;
    private javax.swing.JTextField txtfieldcourse;
    private javax.swing.JTextField txtfieldcstatus;
    private javax.swing.JTextField txtfieldedu;
    private javax.swing.JTextField txtfieldfaadhar;
    private javax.swing.JTextField txtfieldfname;
    private javax.swing.JTextField txtfieldgpfdpf;
    private javax.swing.JTextField txtfieldhd;
    private javax.swing.JTextField txtfieldiffail;
    private javax.swing.JTextField txtfieldifsc;
    private javax.swing.JTextField txtfieldmaadhar;
    private javax.swing.JTextField txtfieldmname;
    private javax.swing.JTextField txtfieldmobno;
    private javax.swing.JTextField txtfieldname;
    private javax.swing.JTextField txtfieldpan;
    private javax.swing.JTextField txtfieldpran;
    private javax.swing.JTextField txtfieldsbankacc;
    private javax.swing.JTextField txtfieldsifsc;
    private javax.swing.JTextField txtfieldspaadhar;
    private javax.swing.JTextField txtfieldspname;
    private javax.swing.JTextField txtfieldstatus;
    private javax.swing.JButton ubtn;
    // End of variables declaration                   

    
}
