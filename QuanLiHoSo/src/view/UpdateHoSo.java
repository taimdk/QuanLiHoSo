/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import dao.TaiChinhDAO;
import dao.YteDAO;
import java.awt.CardLayout;
import java.text.DecimalFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.HSTaiChinh;
import model.HSyte;

/**
 *
 * 
 */
public class UpdateHoSo extends javax.swing.JDialog {

    /**
     * Creates new form ThemSP
     */
    private HoSoForm owner;
    DecimalFormat formatterE = new DecimalFormat("0000000000");
    
    public UpdateHoSo(javax.swing.JInternalFrame parent, javax.swing.JFrame owner, boolean modal) {
        super(owner, modal);
        this.owner = (HoSoForm) parent;
        initComponents();
        setLocationRelativeTo(null);
        if (this.owner.checktaichinh()) {
            HSTaiChinh a = this.owner.getDetailTaiChinh();
            txtMaHoSo.setText(a.getMaHoSo());
            txtTenNguoi.setText(a.getTenNguoi());
            txtCMND.setText(formatterE.format(a.getCMND()));
            txtDiaChi.setText(a.getDiaChi());
            txtSDT.setText(a.getSdt());
            txtKinhNghiem.setText(a.getKinhNghiem());
            txtEmail.setText(a.getEmail());
            txtSoThich.setText(a.getSoThich());
            cbxloaihs.setSelectedIndex(0);
            txtThuNhap.setText(Double.toString(a.getThuNhap()));
            txtTaiSan.setText(a.getTaiSan());
            txtTuoi.setText(a.getTuoi() + "");
        } else {
            HSyte a = this.owner.getDetailYte();
            txtMaHoSo.setText(a.getMaHoSo());
            txtTenNguoi.setText(a.getTenNguoi());
            txtCMND.setText(Double.toString(a.getCMND()));
            txtDiaChi.setText(a.getDiaChi());
            txtSDT.setText(a.getSdt());
            txtKinhNghiem.setText(a.getKinhNghiem());
            txtEmail.setText(a.getEmail());
            txtSoThich.setText(a.getSoThich());
            cbxloaihs.setSelectedIndex(1);
            txtBenhLi.setText(a.getBenhLi());
            txtLieuLuong.setText(Integer.toString(a.getLieuLuong()));
            txtTuoi.setText(Integer.toString(a.getTuoi()));
        }
    }
    
    private UpdateHoSo(JFrame jFrame, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtMaHoSo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTenNguoi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCMND = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtKinhNghiem = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cbxloaihs = new javax.swing.JComboBox<>();
        btnAddProduct = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        taichinh = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtThuNhap = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtTaiSan = new javax.swing.JTextField();
        yte = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtBenhLi = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtLieuLuong = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtSoThich = new javax.swing.JTextField();
        txtTuoi = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Chỉnh sửa sản phẩm");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("SF Pro Display", 0, 16)); // NOI18N
        jLabel2.setText("Mã hồ sơ");

        txtMaHoSo.setEditable(false);
        txtMaHoSo.setFont(new java.awt.Font("SF Pro Display", 0, 16)); // NOI18N
        txtMaHoSo.setRequestFocusEnabled(false);

        jLabel3.setFont(new java.awt.Font("SF Pro Display", 0, 16)); // NOI18N
        jLabel3.setText("Tên người");

        txtTenNguoi.setFont(new java.awt.Font("SF Pro Display", 0, 16)); // NOI18N

        jLabel4.setFont(new java.awt.Font("SF Pro Display", 0, 16)); // NOI18N
        jLabel4.setText("Tuổi");

        txtCMND.setFont(new java.awt.Font("SF Pro Display", 0, 16)); // NOI18N

        jLabel6.setFont(new java.awt.Font("SF Pro Display", 0, 16)); // NOI18N
        jLabel6.setText("Địa chỉ");

        txtDiaChi.setFont(new java.awt.Font("SF Pro Display", 0, 16)); // NOI18N

        jLabel7.setFont(new java.awt.Font("SF Pro Display", 0, 16)); // NOI18N
        jLabel7.setText("SDT");

        txtSDT.setFont(new java.awt.Font("SF Pro Display", 0, 16)); // NOI18N

        jLabel8.setFont(new java.awt.Font("SF Pro Display", 0, 16)); // NOI18N
        jLabel8.setText("Kinh nghiệm làm việc");

        txtKinhNghiem.setFont(new java.awt.Font("SF Pro Display", 0, 16)); // NOI18N
        txtKinhNghiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKinhNghiemActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("SF Pro Display", 0, 16)); // NOI18N
        jLabel9.setText("Email");

        txtEmail.setFont(new java.awt.Font("SF Pro Display", 0, 16)); // NOI18N

        jLabel10.setFont(new java.awt.Font("SF Pro Display", 0, 16)); // NOI18N
        jLabel10.setText("Loại hồ sơ");

        cbxloaihs.setFont(new java.awt.Font("SF Pro Display", 0, 16)); // NOI18N
        cbxloaihs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tài chính", "Y tế" }));
        cbxloaihs.setEnabled(false);
        cbxloaihs.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxloaihsItemStateChanged(evt);
            }
        });
        cbxloaihs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxloaihsActionPerformed(evt);
            }
        });

        btnAddProduct.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));
        btnAddProduct.setFont(new java.awt.Font("SF Pro Display", 0, 16)); // NOI18N
        btnAddProduct.setForeground(new java.awt.Color(255, 255, 255));
        btnAddProduct.setText("Lưu thay đổi");
        btnAddProduct.setBorder(null);
        btnAddProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProductActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(255, 0, 0));
        btnCancel.setFont(new java.awt.Font("SF Pro Display", 0, 16)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Huỷ bỏ");
        btnCancel.setBorder(null);
        btnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        jPanel3.setLayout(new java.awt.CardLayout());

        taichinh.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("SF Pro Display", 0, 16)); // NOI18N
        jLabel11.setText("Thu nhập");

        txtThuNhap.setFont(new java.awt.Font("SF Pro Display", 0, 16)); // NOI18N

        jLabel12.setFont(new java.awt.Font("SF Pro Display", 0, 16)); // NOI18N
        jLabel12.setText("Tài sản");

        txtTaiSan.setFont(new java.awt.Font("SF Pro Display", 0, 16)); // NOI18N

        javax.swing.GroupLayout taichinhLayout = new javax.swing.GroupLayout(taichinh);
        taichinh.setLayout(taichinhLayout);
        taichinhLayout.setHorizontalGroup(
            taichinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtThuNhap)
            .addGroup(taichinhLayout.createSequentialGroup()
                .addGroup(taichinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 75, Short.MAX_VALUE))
            .addComponent(txtTaiSan)
        );
        taichinhLayout.setVerticalGroup(
            taichinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(taichinhLayout.createSequentialGroup()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtThuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTaiSan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(taichinh, "card2");

        yte.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("SF Pro Display", 0, 16)); // NOI18N
        jLabel13.setText("Tiền sử bệnh lí");

        jLabel14.setFont(new java.awt.Font("SF Pro Display", 0, 16)); // NOI18N
        jLabel14.setText("Liều lượng dùng");

        javax.swing.GroupLayout yteLayout = new javax.swing.GroupLayout(yte);
        yte.setLayout(yteLayout);
        yteLayout.setHorizontalGroup(
            yteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtBenhLi)
            .addComponent(txtLieuLuong)
            .addGroup(yteLayout.createSequentialGroup()
                .addGroup(yteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 45, Short.MAX_VALUE))
        );
        yteLayout.setVerticalGroup(
            yteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(yteLayout.createSequentialGroup()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBenhLi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtLieuLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(yte, "card2");

        jLabel15.setFont(new java.awt.Font("SF Pro Display", 0, 16)); // NOI18N
        jLabel15.setText("Sở thích");

        txtSoThich.setFont(new java.awt.Font("SF Pro Display", 0, 16)); // NOI18N

        txtTuoi.setFont(new java.awt.Font("SF Pro Display", 0, 16)); // NOI18N

        jLabel16.setFont(new java.awt.Font("SF Pro Display", 0, 16)); // NOI18N
        jLabel16.setText("CMND");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(198, 198, 198)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtCMND, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                                .addComponent(txtTuoi))
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(91, 91, 91)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtKinhNghiem, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTenNguoi, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(91, 91, 91)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtMaHoSo, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addComponent(jLabel2))
                .addGap(124, 124, 124)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbxloaihs, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSoThich)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel15))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(43, 43, 43))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(242, 242, 242)
                .addComponent(btnAddProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMaHoSo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxloaihs, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSoThich, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTenNguoi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel8))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtKinhNghiem, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCMND, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAddProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 880, 400));

        jPanel2.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));

        jLabel1.setFont(new java.awt.Font("SF Pro Display", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CẬP NHẬT THÔNG TIN HỒ SƠ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(267, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(265, 265, 265))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxloaihsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxloaihsItemStateChanged
        // TODO add your handling code here:
        if (cbxloaihs.getSelectedItem().equals("Tài chính")) {
            CardLayout productCategory = (CardLayout) jPanel3.getLayout();
            productCategory.first(jPanel3);           
        }
        
        if (cbxloaihs.getSelectedItem().equals("Y tế")) {
            CardLayout productCategory = (CardLayout) jPanel3.getLayout();
            productCategory.last(jPanel3);
        }
    }//GEN-LAST:event_cbxloaihsItemStateChanged

    private void cbxloaihsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxloaihsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxloaihsActionPerformed

    private void btnAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProductActionPerformed
        // TODO add your handling code here:
        String maHoSo = txtMaHoSo.getText();
        String tenNguoi = txtTenNguoi.getText();
        int tuoi = 0;
        double CMND = 0;
        try {
            tuoi = Integer.parseInt(txtTuoi.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập tuổi ở dạng số !");
        }
        try {
            CMND = Double.parseDouble(txtCMND.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập CMND ở dạng số !");
        }
        String diaChi = txtDiaChi.getText();
        String sdt = txtSDT.getText();
        String kinhNghiem = txtKinhNghiem.getText();
        String email = txtEmail.getText();
        String soThich = txtSoThich.getText();
        if (cbxloaihs.getSelectedItem().equals("Tài chính")) {
            double thuNhap = 0;
            try {
                thuNhap = Double.parseDouble(txtThuNhap.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập thu nhập ở dạng số !");
            }
            String taiSan = txtTaiSan.getText();
            if (maHoSo.equals("") || tenNguoi.equals("") || diaChi.equals("") || sdt.equals("") || kinhNghiem.equals("") || email.equals("") || soThich.equals("") || taiSan.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin !");
            } else {
                HSTaiChinh lp = new HSTaiChinh(thuNhap, taiSan, maHoSo, tenNguoi, tuoi, CMND, diaChi, sdt, soThich, email, kinhNghiem,1);
                try {
                    TaiChinhDAO.getInstance().update(lp);
                    this.dispose();
                    JOptionPane.showMessageDialog(this, "Sửa hồ sơ thành công !");
                    owner.loadDataToTable();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Sửa hồ sơ thất bại !");
                }
            }
        }
        if (cbxloaihs.getSelectedItem().equals("Y tế")) {
            String benhLi = txtBenhLi.getText();
            int lieuLuong = 0;
            try {
                lieuLuong = Integer.parseInt(txtLieuLuong.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập liều lượng thuốc ở dạng số !");
            }
            if (maHoSo.equals("") || tenNguoi.equals("") || diaChi.equals("") || sdt.equals("") || kinhNghiem.equals("") || email.equals("") || soThich.equals("") || benhLi.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin !");
            } else {
                HSyte pc = new HSyte(benhLi, lieuLuong, maHoSo, tenNguoi, tuoi, CMND, diaChi, sdt, soThich, email, kinhNghiem,1);
                System.out.println(pc);
                YteDAO.getInstance().update(pc);
                this.dispose();
                JOptionPane.showMessageDialog(this, "Sửa hồ sơ thành công !");
                owner.loadDataToTable();
            }
        }
    }//GEN-LAST:event_btnAddProductActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtKinhNghiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKinhNghiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKinhNghiemActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(UpdateHoSo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateHoSo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateHoSo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateHoSo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UpdateHoSo dialog = new UpdateHoSo(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddProduct;
    private javax.swing.JButton btnCancel;
    private javax.swing.JComboBox<String> cbxloaihs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel taichinh;
    private javax.swing.JTextField txtBenhLi;
    private javax.swing.JTextField txtCMND;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtKinhNghiem;
    private javax.swing.JTextField txtLieuLuong;
    private javax.swing.JTextField txtMaHoSo;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtSoThich;
    private javax.swing.JTextField txtTaiSan;
    private javax.swing.JTextField txtTenNguoi;
    private javax.swing.JTextField txtThuNhap;
    private javax.swing.JTextField txtTuoi;
    private javax.swing.JPanel yte;
    // End of variables declaration//GEN-END:variables
}
