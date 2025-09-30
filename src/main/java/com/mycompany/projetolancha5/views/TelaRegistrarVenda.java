/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projetolancha5.views;

import com.mycompany.projetolancha5.DataAcessObject.dao.ItensVendaDAO;
import com.mycompany.projetolancha5.DataAcessObject.dao.ProdutoDAO;
import com.mycompany.projetolancha5.DataAcessObject.dao.ProdutoInfoDAO;
import com.mycompany.projetolancha5.DataAcessObject.dao.VendaDAO;
import com.mycompany.projetolancha5.DataAcessObject.dao.VendaInfoDAO;
import com.mycompany.projetolancha5.modelos.Carrinho;
import com.mycompany.projetolancha5.modelos.Pagamento;
import com.mycompany.projetolancha5.modelos.Produto;
import com.mycompany.projetolancha5.modelos.ProdutoInfo;
import com.mycompany.projetolancha5.modelos.Venda;
import com.mycompany.projetolancha5.modelos.VendaInfo;
import com.mycompany.projetolancha5.modelos.enums.CategoriaProduto;
import com.mycompany.projetolancha5.modelos.enums.CategoriaVenda;
import com.mycompany.projetolancha5.modelos.enums.Status;
import com.mycompany.projetolancha5.modelos.enums.TipoTransacao;
import com.mycompany.projetolancha5.util.Configuracoes;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raul_
 */
public class TelaRegistrarVenda extends javax.swing.JFrame {

    private List<Produto> listaProdutos;
    private List<Produto> listaCarrinho;
    private ProdutoInfoDAO produtoInfoDAO;
    private ProdutoDAO produtoDAO;
    private VendaDAO vendaDAO;
    private VendaInfoDAO vendaInfoDAO;
    private ItensVendaDAO carrinhoDAO;
    
    private TelaMenu telaMenu;
    private TelaPagamentoMultiplo telaPagamentoMultiplo;
    
    private DefaultTableModel tableModelCima;
    private DefaultTableModel tableModelBaixo;

    Venda venda;
    Carrinho carrinho;
    VendaInfo vendaInfo;
    Pagamento pagamento;

    private double total;
    private String modoVenda;
    private final String[] colunas = {"ID", "Nome", "Valor", "Descricao", "Categoria"};
    private Double totalPagamentoMultiplo;

    public TelaRegistrarVenda(TelaMenu telaMenu) {
        initComponents();
        
        this.pagamento = new Pagamento();

        this.produtoInfoDAO = new ProdutoInfoDAO();
        this.produtoDAO = new ProdutoDAO();
        this.vendaDAO = new VendaDAO();
        this.vendaInfoDAO  = new VendaInfoDAO();
        this.carrinhoDAO = new ItensVendaDAO();
        
        this.listaCarrinho = new ArrayList<>();
        
        this.tableModelCima = new DefaultTableModel(colunas, 0);
        this.tableModelBaixo = new DefaultTableModel(colunas, 0);
        this.telaMenu = telaMenu;
        
        jRadioButton2.setSelected(true);
        
        
        


        this.gridCIMA.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                ListSelectionModel lsm = (ListSelectionModel) e.getSource();
                //altera os botoes para ativados somente se houver linha selecionada
                btnAdicionar.setEnabled(!lsm.isSelectionEmpty());
            }
        });

        this.gridBAIXO.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                ListSelectionModel lsm = (ListSelectionModel) e.getSource();
                //altera os botoes para ativados somente se houver linha selecionada
                btnRemover.setEnabled(!lsm.isSelectionEmpty());
            }
        });
        
        inicializaCampoValorEntrega();
        
        if(cmbPagamento.getSelectedItem().toString() != "DINHEIRO"){
            campoValorPago.setEnabled(false);
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        campoCliente = new javax.swing.JTextField();
        campoEndereco = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campoValorEntrega = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmbPagamento = new javax.swing.JComboBox<>();
        campoTroco = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblValorTotal = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnFinalizar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        campoValorPago = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        gridBAIXO = new javax.swing.JTable();
        btnRemover = new javax.swing.JButton();
        btnAdicionar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        gridCIMA = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 103, 75));
        jPanel2.setForeground(new java.awt.Color(255, 103, 75));

        jPanel1.setBackground(new java.awt.Color(255, 255, 234));
        jPanel1.setForeground(new java.awt.Color(30, 62, 98));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("JetBrains Mono", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 103, 75));
        jLabel2.setText("ENDERECO");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("JetBrains Mono", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 103, 75));
        jLabel3.setText("VALOR ENTREGA");

        campoValorEntrega.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoValorEntregaKeyPressed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("JetBrains Mono", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 103, 75));
        jLabel4.setText("PAGAMENTO");

        cmbPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PIX", "DINHEIRO", "CREDITO", "DEBITO", " " }));
        cmbPagamento.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbPagamentoItemStateChanged(evt);
            }
        });

        campoTroco.setEnabled(false);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("JetBrains Mono", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 103, 75));
        jLabel5.setText("TOTAL: ");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("JetBrains Mono", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 103, 75));
        jLabel6.setText("TROCO");

        lblValorTotal.setBackground(new java.awt.Color(255, 255, 255));
        lblValorTotal.setFont(new java.awt.Font("JetBrains Mono", 1, 28)); // NOI18N
        lblValorTotal.setForeground(new java.awt.Color(255, 103, 75));
        lblValorTotal.setText("0.0");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("<");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnFinalizar.setBackground(new java.awt.Color(255, 103, 75));
        btnFinalizar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        btnFinalizar.setForeground(new java.awt.Color(255, 255, 255));
        btnFinalizar.setText("Finalizar");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 103, 75));
        jLabel8.setFont(new java.awt.Font("JetBrains Mono", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 103, 75));
        jLabel8.setText("CLIENTE");

        jPanel3.setBackground(new java.awt.Color(255, 255, 234));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Configuração", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(255, 103, 75))); // NOI18N

        jRadioButton1.setText("Venda Balcão");
        jRadioButton1.setName("rdVendaBalcao"); // NOI18N
        jRadioButton1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRadioButton1StateChanged(evt);
            }
        });
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("Entrega");
        jRadioButton2.setName("rdVendaEntrega"); // NOI18N
        jRadioButton2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRadioButton2StateChanged(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 103, 75));
        jLabel1.setText("Categoria de Venda");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton1)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)))
                        .addGap(0, 29, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        campoValorPago.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoValorPagoFocusLost(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("JetBrains Mono", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 103, 75));
        jLabel9.setText("VALOR PAGO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(campoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoValorEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(campoTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(1, 1, 1)))
                            .addComponent(jLabel6)
                            .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoValorPago, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel4)
                            .addComponent(cmbPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblValorTotal)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator3))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jButton1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(8, 8, 8)
                        .addComponent(campoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoValorEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(cmbPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(campoValorPago, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(13, 13, 13)
                .addComponent(lblValorTotal)
                .addGap(32, 32, 32)
                .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jScrollPane1.setForeground(new java.awt.Color(255, 103, 75));

        gridBAIXO.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(gridBAIXO);

        btnRemover.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        btnRemover.setForeground(new java.awt.Color(255, 103, 75));
        btnRemover.setText("REMOVER");
        btnRemover.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnRemover.setEnabled(false);
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnAdicionar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        btnAdicionar.setForeground(new java.awt.Color(255, 103, 75));
        btnAdicionar.setText("ADICIONAR");
        btnAdicionar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAdicionar.setEnabled(false);
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        gridCIMA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(gridCIMA);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(78, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void inicializaCampoValorEntrega() {

    campoValorEntrega.addKeyListener(new java.awt.event.KeyAdapter() {
        @Override
        public void keyTyped(java.awt.event.KeyEvent evt) {
            char c = evt.getKeyChar();
            if (!Character.isDigit(c) && c != '.' && c != ',') {
                evt.consume(); 
            }
        }
    });


    campoValorEntrega.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
        @Override
        public void insertUpdate(javax.swing.event.DocumentEvent e) {
            atualizaTotalComEntrega();
        }

        @Override
        public void removeUpdate(javax.swing.event.DocumentEvent e) {
            atualizaTotalComEntrega();
        }

        @Override
        public void changedUpdate(javax.swing.event.DocumentEvent e) {
            atualizaTotalComEntrega();
        }
    });
}
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        telaMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        try {
            removeLinhaBaixo();
            calculaTotal();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void removeLinhaBaixo() {
        int id, linha;
        boolean resultado;
        String[] vetor = new String[5];
        String colunaValor;
        total = 0;

        linha = gridBAIXO.getSelectedRow();
        colunaValor = gridBAIXO.getValueAt(linha, 2).toString();

        tableModelBaixo.removeRow(linha);
        
        calculaTotal();
    }

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        
        if(listaCarrinho.isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Carrinho Vazio");
            return;
        }
        
        if(modoVenda == "ENTREGA"){
            if(!validacaoModoEntrega()){
                return;
            }
        }else if(modoVenda == "BALCAO"){
            if(!validacaoModoBalcao()){
                return;
            }
        }
        

        try {
            preencheVenda();
            
            int vendaid = vendaDAO.inserir(venda,vendaInfo).getId();


            carrinho.setVenda(venda);
            
            carrinho.setProdutos(listaProdutos);
            
            Double subTotal = listaCarrinho.stream()
                    .mapToDouble(item -> item.getValor())
                    .sum();
            
            int quantidade = listaCarrinho.size();
            for (int i = 0; i < quantidade; i++) {
                
                carrinhoDAO.inserir(subTotal,quantidade,vendaid,listaCarrinho.get(i).getId());
            }
            
            JOptionPane.showMessageDialog(rootPane, "Venda concluida!");
            limpaTela();
            tableModelBaixo.setNumRows(0);
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao cadastar venda.");
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
        
        
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        try {
            total = 0;

            int id, linha;

            boolean resultado;
            String[] vetor = new String[5];
            linha = gridCIMA.getSelectedRow();

            for (int i = 0; i < colunas.length; i++) {
                vetor[i] = gridCIMA.getValueAt(linha, i).toString();
            }

            popularTabelaBaixo(vetor);
            populaCarrinho(vetor);
            
            if (gridBAIXO.getRowCount() > 0) {
                for (int i = 0; i < gridBAIXO.getRowCount(); i++) {
                    double aux = Double.parseDouble(gridBAIXO.getValueAt(i, 2).toString());
                    total += aux;
                }
                double valorEntrega = Double.valueOf(campoValorEntrega.getText());
                
                if(valorEntrega > 0){
                    total+=valorEntrega;
                }
                
                if(cmbPagamento.getSelectedItem().toString() != "DINHEIRO"){
                    campoValorPago.setText(String.valueOf(total));
                }
                lblValorTotal.setText(String.valueOf(total));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        popularTabelaCima(produtoDAO.listar());
    }//GEN-LAST:event_formWindowOpened

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioButton1StateChanged
        if(jRadioButton1.isSelected()){
            modoVendaBalcao();
            jRadioButton2.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton1StateChanged

    private void jRadioButton2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioButton2StateChanged
        if(jRadioButton2.isSelected()){
            modoVendaEntrega();
            jRadioButton1.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton2StateChanged

    private void cmbPagamentoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbPagamentoItemStateChanged
        if(cmbPagamento.getSelectedItem().toString() != "DINHEIRO"){
            campoTroco.setText("0.0");
            
            campoValorPago.setEnabled(false);
            campoValorPago.setText(String.valueOf(total));
        }else{
            campoTroco.setText("0.0");
            
            campoValorPago.setEnabled(true);
            campoValorPago.setText(String.valueOf(total));
        }
    }//GEN-LAST:event_cmbPagamentoItemStateChanged

    private void campoValorPagoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoValorPagoFocusLost
        //AUTOMAÇÃO DE TROCO
        
        boolean logica;
        logica = cmbPagamento.getSelectedItem().toString() == "DINHEIRO" && !campoValorPago.getText().isBlank();
        
        if(!logica){
           return;
        }
        
        if(total != 0){
            double valorPago = Double.valueOf(campoValorPago.getText()) + Double.valueOf(campoValorEntrega.getText());

            campoTroco.setText(String.valueOf(valorPago - total));
        }
    }//GEN-LAST:event_campoValorPagoFocusLost
    
    public void atualizaTroco(){
        if(total != 0){
            double valorPago = Double.valueOf(campoValorPago.getText()) + Double.valueOf(campoValorEntrega.getText());
            campoTroco.setText(String.valueOf(valorPago - total));
        }
    }
    
    private void campoValorEntregaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoValorEntregaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoValorEntregaKeyPressed
    
    
    private boolean validacaoModoBalcao(){
        
           
        
        if (campoValorPago.getText().isBlank()) {
            JOptionPane.showMessageDialog(rootPane, "Insira o valor Pago");
            campoValorPago.requestFocus();
            return false;
        }

        try {
            double valorPago = Double.parseDouble(campoValorPago.getText());
            if (valorPago == 0.0) {
                JOptionPane.showMessageDialog(rootPane, "Insira o valor Pago maior que zero");
                campoValorPago.requestFocus();
                return false;
            }
            
             if (valorPago < total) {
                JOptionPane.showMessageDialog(rootPane, "Insira o valor Pago maior que o total");
                campoValorPago.requestFocus();
                return false;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Valor inválido. Insira apenas números");
            campoValorPago.requestFocus();
            return false;
        }
        
         if (cmbPagamento.getSelectedItem().toString().equals("DINHEIRO")) {
                double valorPago = Double.valueOf(campoValorPago.getText());
                if(valorPago > total && campoTroco.getText().isEmpty()){
                    JOptionPane.showMessageDialog(rootPane, "Insira o troco");
                }
        }else{
            campoTroco.setText("0.0");
        }
         
         
        return true;
    }
    
    public void atualizaPagamento(){
        campoValorPago.setText(String.valueOf(pagamento.getTotalPago()));
        campoTroco.setText(String.valueOf(pagamento.getTroco()));
        
        atualizaTroco();
    }
    
    private void modoVendaEntrega(){
        campoCliente.setText("");
        campoCliente.setEnabled(true);
        
        campoEndereco.setText("");
        campoEndereco.setEnabled(true);
        
        campoValorEntrega.setText("0.0");
        campoValorEntrega.setEnabled(true);
        
        
        
        modoVenda = "ENTREGA";
    }
    
    private void modoVendaBalcao(){
        campoCliente.setText("Cliente Avulso");
        campoCliente.setEnabled(false);
        
        campoEndereco.setText("Cliente Avulso");
        campoEndereco.setEnabled(false);
        
        campoValorEntrega.setText("0.0");
        campoValorEntrega.setEnabled(false);
        
        modoVenda = "BALCAO";
        
    }
    
    private void populaCarrinho(String[] vetor) {
        try {
            Produto produto = new Produto();
            ProdutoInfo info = new ProdutoInfo();

            info.setDescricao(vetor[3]);
            info.setCategoria(CategoriaProduto.valueOf(vetor[4]));
            
            produto.setId(Integer.valueOf(vetor[0]));
            produto.setNome(vetor[1]);
            produto.setValor(Double.parseDouble(vetor[2]));
            produto.setInformacoes(info);
            
            listaCarrinho.add(produto);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void popularTabelaCima(List<Produto> lista) {
        tableModelCima.setRowCount(0);
        listaProdutos = lista;

        for (Produto item : listaProdutos) {
            String[] linha = {
                String.valueOf(item.getId()),
                item.getNome(),
                item.getValor().toString(),
                item.getInformacoes().getDescricao(),
                item.getInformacoes().getCategoria().toString()
            };
            tableModelCima.addRow(linha);
        }
        gridCIMA.setModel(tableModelCima);
    }

    protected void popularTabelaBaixo(String[] vetor) {
        tableModelBaixo.addRow(vetor);
        gridBAIXO.setModel(tableModelBaixo);
    }
    
    public void setPagamento(Pagamento pagamento){
        this.pagamento = pagamento;
    }
    
    private boolean validacaoModoEntrega() {
        
        if(campoValorPago.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Preencha o valor pago.");
            campoValorPago.requestFocus();
            return false;
        }
        
        if (campoCliente.getText().isBlank()) {
            JOptionPane.showMessageDialog(rootPane, "Campo CLIENTE vazio.");
            campoCliente.requestFocus();
            return false;
        }

        if (campoCliente.getText().matches(".*\\d.*")) {
            JOptionPane.showMessageDialog(rootPane, "Insira apenas letras no campo CLIENTE.");
            campoCliente.requestFocus();
            return false;
        }

        if (campoEndereco.getText().isBlank()) {
            JOptionPane.showMessageDialog(rootPane, "Campo ENDERECO vazio.");
            campoEndereco.requestFocus();
            return false;
        }

        if (campoValorEntrega.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Campo VALOR ENTREGA vazio.");
            campoValorEntrega.requestFocus();
            return false;
        }


        if (campoValorEntrega.getText().isBlank()) {
            JOptionPane.showMessageDialog(rootPane, "Campo VALOR ENTREGA vazio.");
            campoValorEntrega.requestFocus();
            return false;
        }

        return true;
    }

    private void preencheVenda() {
        Double troco = 0.0;
        Double valorEntrega = 0.0;
        
        venda = new Venda();
        carrinho = new Carrinho();
        vendaInfo = new VendaInfo();
        
        String data = formataData(LocalDate.now().toString());

        vendaInfo.setTransacao(TipoTransacao.valueOf(cmbPagamento.getSelectedItem().toString()));
        vendaInfo.setData(data);
        vendaInfo.setHorario(data);
        vendaInfo.setEndereço(campoEndereco.getText());
        vendaInfo.setNomeCliente(campoCliente.getText());
        
        if(jRadioButton1.isSelected()){
            venda.setCategoriaVenda(CategoriaVenda.BALCAO);          
        }else{
            venda.setCategoriaVenda(CategoriaVenda.ENTREGA);    
        }

        venda.setTotal(total);
        
        if(campoTroco.getText().isEmpty()){
            venda.setTroco(troco);
        }else{
            venda.setTroco(Double.parseDouble(campoTroco.getText()));     
        }
        
        venda.setStatus(Status.APROVADA);
        venda.setData(data);
        
        if(campoValorEntrega.getText().isEmpty()){
            venda.setValorEntrega(valorEntrega);
        }else{
            venda.setValorEntrega(Double.parseDouble(campoValorEntrega.getText()));     
        }
        
       
        venda.setDesconto(0.0);
        venda.setUsuario(Configuracoes.getUsuario());

    }

    private void calculaTotal() {
        String colunaValor;
        double total = 0;
        
        if(listaCarrinho.size() == 0){
            this.total = total;
            lblValorTotal.setText(String.valueOf(total));
            return;
        }
        
        for (int i = 0; i <= gridBAIXO.getRowCount()-1; i++) {
            colunaValor = gridBAIXO.getValueAt(i, 2).toString();
            total = total + Double.valueOf(colunaValor);
        }
        double valorEntrega = Double.valueOf(campoValorEntrega.getText());
                
        if (valorEntrega > 0) {
            total += valorEntrega;
        }

        if (cmbPagamento.getSelectedItem().toString() != "DINHEIRO") {
            campoValorPago.setText(String.valueOf(total));
        }
        
        
        this.total = total;
        lblValorTotal.setText(String.valueOf(total));
    }

    public String formataData(String data) {
        //FUNCAO PARA CONVERTER AS DATAS
        //PRO FORMATO DO BANCO YYYYMMDD
        
        String retorno = "";
        String dia = "";
        String mes = "";
        String ano = "";
        try {
            dia = data.substring(8, 9);
            mes = data.substring(5, 6);
            ano = data.substring(0, 3);

            retorno = ano + mes + dia;
        } catch (Exception e) {

        }

        return retorno;
    }
    
    private void limpaTela() {
        campoCliente.setText("");
        campoEndereco.setText("");
        campoTroco.setText("");
        campoValorEntrega.setText("");
        campoValorPago.setText("");
        
        listaCarrinho.clear();
        calculaTotal();
    }
    private void monitorarCampoValorEntrega() {
        campoValorEntrega.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override
            public void insertUpdate(javax.swing.event.DocumentEvent e) {
                atualizaTotalComEntrega();
            }

            @Override
            public void removeUpdate(javax.swing.event.DocumentEvent e) {
                atualizaTotalComEntrega();
            }

            @Override
            public void changedUpdate(javax.swing.event.DocumentEvent e) {
                atualizaTotalComEntrega();
            }
        });
    }
    
    private void atualizaTotalComEntrega() {
    try {
        double valorEntrega = 0;
        String texto = campoValorEntrega.getText().replace(",", "."); // converte ',' para '.'

        if (!texto.isBlank()) {
            valorEntrega = Double.parseDouble(texto);
        }

        double totalComEntrega = total + valorEntrega;
        lblValorTotal.setText(String.format("%.2f", totalComEntrega));

    } catch (NumberFormatException ex) {
        lblValorTotal.setText(String.format("%.2f", total));
    }
}
    
    
    public void setaTroco() {
        if (!campoValorPago.getText().isBlank()) {
            try {
                double valorPago = Double.parseDouble(campoValorPago.getText()) 
                                   + Double.parseDouble(campoValorEntrega.getText());
                campoTroco.setText(String.valueOf(valorPago - total));
            } catch (NumberFormatException ex) {
                campoTroco.setText("0.0"); // caso digitem algo inválido
            }
        } else {
            campoTroco.setText("0.0");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnRemover;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField campoCliente;
    private javax.swing.JTextField campoEndereco;
    private javax.swing.JTextField campoTroco;
    private javax.swing.JTextField campoValorEntrega;
    private javax.swing.JTextField campoValorPago;
    private javax.swing.JComboBox<String> cmbPagamento;
    private javax.swing.JTable gridBAIXO;
    private javax.swing.JTable gridCIMA;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblValorTotal;
    // End of variables declaration//GEN-END:variables


}
