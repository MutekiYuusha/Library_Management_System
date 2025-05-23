package com.mycompany.library.ui.admin;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.Timer;

import com.mycompany.library.functions.LibraryFunctions;
import com.mycompany.library.ui.mainpage.LogInPage;

public class AdminPage extends javax.swing.JFrame {

    public static AdminPage instance;

    public AdminPage() {

        instance = this;

        initComponents();
        initListeners();
        
        cardPanel.add(minimizedPanel, "minimized");
        cardPanel.add(expandedPanel, "extended");

        cardPanel2.add(booksScrollPaneCard, "viewBooks");
        booksScrollPaneCard.setName("viewBooks");

        cardPanel2.add(editBooksScrollPaneCard, "editBooks");
        editBooksScrollPaneCard.setName("editBooks");

        getContentPane().setBackground(java.awt.Color.decode("#91B577"));

        addBooksToPanel(booksPanel, editBooksPanel);

        changeScrollBarLook(booksScrollPaneCard);
        changeScrollBarLook(editBooksScrollPaneCard);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sidePanel = new javax.swing.JPanel();
        viewBooksSideButton = new custom.components.RoundedPanel();
        viewBooksSideLabel = new javax.swing.JLabel();
        editBooksSideButton = new custom.components.RoundedPanel();
        editBooksSideLabel = new javax.swing.JLabel();
        cardPanel = new javax.swing.JPanel();
        minimizedPanel = new javax.swing.JPanel();
        smallLogoLabel = new javax.swing.JLabel();
        expandedPanel = new javax.swing.JPanel();
        olfu_lms_label = new javax.swing.JLabel();
        olfu_logo_label = new javax.swing.JLabel();
        student_label = new javax.swing.JLabel();
        burgerButtonPanel = new custom.components.RoundedPanel();
        burgerButton = new javax.swing.JLabel();
        logOutPanel = new custom.components.RoundedPanel();
        logOutLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        searchBar = new custom.components.RoundedTextField();
        cardPanel2 = new javax.swing.JPanel();
        booksScrollPaneCard = new javax.swing.JScrollPane();
        booksPanel = new javax.swing.JPanel();
        addBooksButton = new custom.components.RoundedPanel();
        addBooksLabel = new javax.swing.JLabel();
        editBooksScrollPaneCard = new javax.swing.JScrollPane();
        editBooksPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Page");
        setMinimumSize(new java.awt.Dimension(810, 600));

        sidePanel.setBackground(new java.awt.Color(255, 255, 242));
        sidePanel.setPreferredSize(new java.awt.Dimension(75, 156));

        viewBooksSideButton.setBackground(new java.awt.Color(255, 255, 255));
        viewBooksSideButton.setBorderRadius(35);
        viewBooksSideButton.setBorderThickness(2);
        viewBooksSideButton.setBorderVisible(true);
        viewBooksSideButton.setMaximumSize(new java.awt.Dimension(183, 60));
        viewBooksSideButton.setMinimumSize(new java.awt.Dimension(60, 63));
        viewBooksSideButton.setVerifyInputWhenFocusTarget(false);

        viewBooksSideLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        viewBooksSideLabel.setForeground(new java.awt.Color(79, 82, 78));
        viewBooksSideLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        viewBooksSideLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/search_books_icon_SMALL.png"))); // NOI18N
        viewBooksSideLabel.setIconTextGap(5);
        viewBooksSideLabel.setPreferredSize(new java.awt.Dimension(130, 40));

        javax.swing.GroupLayout viewBooksSideButtonLayout = new javax.swing.GroupLayout(viewBooksSideButton);
        viewBooksSideButton.setLayout(viewBooksSideButtonLayout);
        viewBooksSideButtonLayout.setHorizontalGroup(
            viewBooksSideButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewBooksSideButtonLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(viewBooksSideLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        viewBooksSideButtonLayout.setVerticalGroup(
            viewBooksSideButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(viewBooksSideLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        editBooksSideButton.setBackground(new java.awt.Color(255, 255, 242));
        editBooksSideButton.setBorderRadius(35);
        editBooksSideButton.setBorderThickness(2);
        editBooksSideButton.setBorderVisible(false);
        editBooksSideButton.setMinimumSize(new java.awt.Dimension(60, 63));

        editBooksSideLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        editBooksSideLabel.setForeground(new java.awt.Color(79, 82, 78));
        editBooksSideLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        editBooksSideLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/edit_books_30x30.png"))); // NOI18N
        editBooksSideLabel.setIconTextGap(5);
        editBooksSideLabel.setMaximumSize(new java.awt.Dimension(145, 40));
        editBooksSideLabel.setMinimumSize(new java.awt.Dimension(145, 40));
        editBooksSideLabel.setPreferredSize(new java.awt.Dimension(145, 40));

        javax.swing.GroupLayout editBooksSideButtonLayout = new javax.swing.GroupLayout(editBooksSideButton);
        editBooksSideButton.setLayout(editBooksSideButtonLayout);
        editBooksSideButtonLayout.setHorizontalGroup(
            editBooksSideButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editBooksSideButtonLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(editBooksSideLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        editBooksSideButtonLayout.setVerticalGroup(
            editBooksSideButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editBooksSideButtonLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(editBooksSideLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cardPanel.setOpaque(false);
        cardPanel.setLayout(new java.awt.CardLayout());

        minimizedPanel.setOpaque(false);

        smallLogoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ccs_logo_small.png"))); // NOI18N
        smallLogoLabel.setText("jLabel2");

        javax.swing.GroupLayout minimizedPanelLayout = new javax.swing.GroupLayout(minimizedPanel);
        minimizedPanel.setLayout(minimizedPanelLayout);
        minimizedPanelLayout.setHorizontalGroup(
            minimizedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(minimizedPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(smallLogoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        minimizedPanelLayout.setVerticalGroup(
            minimizedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(minimizedPanelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(smallLogoLabel)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        cardPanel.add(minimizedPanel, "card2");

        expandedPanel.setOpaque(false);

        olfu_lms_label.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        olfu_lms_label.setForeground(new java.awt.Color(79, 82, 78));
        olfu_lms_label.setText("OLFU LMS");

        olfu_logo_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        olfu_logo_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ccs_logo_big.png"))); // NOI18N

        student_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        student_label.setForeground(new java.awt.Color(79, 82, 78));
        student_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        student_label.setText("ADMIN");

        javax.swing.GroupLayout expandedPanelLayout = new javax.swing.GroupLayout(expandedPanel);
        expandedPanel.setLayout(expandedPanelLayout);
        expandedPanelLayout.setHorizontalGroup(
            expandedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(expandedPanelLayout.createSequentialGroup()
                .addGroup(expandedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(expandedPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(student_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(expandedPanelLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(olfu_lms_label)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(olfu_logo_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        expandedPanelLayout.setVerticalGroup(
            expandedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(expandedPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(olfu_lms_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(olfu_logo_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(student_label)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        cardPanel.add(expandedPanel, "card3");

        burgerButtonPanel.setBackground(new Color(0,0,0,0));
        burgerButtonPanel.setBorderRadius(30);
        burgerButtonPanel.setBorderVisible(false);
        burgerButtonPanel.setDoubleBuffered(false);
        burgerButtonPanel.setFocusable(false);
        burgerButtonPanel.setRequestFocusEnabled(false);
        burgerButtonPanel.setVerifyInputWhenFocusTarget(false);

        burgerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/burger_smaller_green.png"))); // NOI18N

        javax.swing.GroupLayout burgerButtonPanelLayout = new javax.swing.GroupLayout(burgerButtonPanel);
        burgerButtonPanel.setLayout(burgerButtonPanelLayout);
        burgerButtonPanelLayout.setHorizontalGroup(
            burgerButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(burgerButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(burgerButton)
                .addContainerGap())
        );
        burgerButtonPanelLayout.setVerticalGroup(
            burgerButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(burgerButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(burgerButton)
                .addContainerGap())
        );

        logOutPanel.setBackground(new Color(0,0,0,0));
        logOutPanel.setBorderRadius(30);

        logOutLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        logOutLabel.setForeground(new java.awt.Color(79, 82, 78));
        logOutLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        logOutLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/logout_green_25x25.png"))); // NOI18N
        logOutLabel.setIconTextGap(8);

        javax.swing.GroupLayout logOutPanelLayout = new javax.swing.GroupLayout(logOutPanel);
        logOutPanel.setLayout(logOutPanelLayout);
        logOutPanelLayout.setHorizontalGroup(
            logOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logOutPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(logOutLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );
        logOutPanelLayout.setVerticalGroup(
            logOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logOutPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logOutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jSeparator1.setBackground(new java.awt.Color(103, 120, 97));
        jSeparator1.setForeground(new java.awt.Color(103, 120, 97));

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sidePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editBooksSideButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewBooksSideButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(sidePanelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(burgerButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logOutPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(14, 14, 14)))
                .addContainerGap())
            .addComponent(jSeparator1)
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addComponent(cardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(viewBooksSideButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editBooksSideButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(burgerButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logOutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        searchBar.setBackground(Color.decode("#91B577"));
        searchBar.setForeground(new java.awt.Color(255, 255, 255));
        searchBar.setBorderColor(java.awt.Color.white);
        searchBar.setBorderRadius(35);
        searchBar.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N

        cardPanel2.setOpaque(false);
        cardPanel2.setLayout(new java.awt.CardLayout());

        booksScrollPaneCard.setBorder(null);
        booksScrollPaneCard.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        booksScrollPaneCard.setOpaque(false);
        booksScrollPaneCard.setViewportView(booksPanel);

        booksPanel.setBackground(Color.decode("#91B577"));
        booksPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 10));

        addBooksButton.setBackground(new Color(255,255,255,80));
        addBooksButton.setPreferredSize(new java.awt.Dimension(165, 285));

        addBooksLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addBooksLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addCover.png"))); // NOI18N

        javax.swing.GroupLayout addBooksButtonLayout = new javax.swing.GroupLayout(addBooksButton);
        addBooksButton.setLayout(addBooksButtonLayout);
        addBooksButtonLayout.setHorizontalGroup(
            addBooksButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addBooksLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        addBooksButtonLayout.setVerticalGroup(
            addBooksButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addBooksLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        booksPanel.add(addBooksButton);

        booksScrollPaneCard.setViewportView(booksPanel);

        cardPanel2.add(booksScrollPaneCard, "card2");

        editBooksScrollPaneCard.setBorder(null);
        editBooksScrollPaneCard.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        editBooksScrollPaneCard.setOpaque(false);
        editBooksScrollPaneCard.setViewportView(editBooksPanel);

        editBooksPanel.setBackground(Color.decode("#91B577"));
        editBooksPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 10));
        editBooksScrollPaneCard.setViewportView(editBooksPanel);

        cardPanel2.add(editBooksScrollPaneCard, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cardPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 723, Short.MAX_VALUE)
                    .addComponent(searchBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cardPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void initListeners(){

        java.awt.event.MouseAdapter mouseAdapters = new java.awt.event.MouseAdapter(){
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MousePressed(evt);
            }
        };

        JComponent[] components = {
            burgerButton, burgerButtonPanel, viewBooksSideButton,
            editBooksSideButton, addBooksLabel, logOutLabel
        };

        for(JComponent comp : components){
            comp.addMouseListener(mouseAdapters);
        }
        
        searchBar.addKeyListener(new KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent e){
                KeyReleased(e);
            }
        });
    }

    static ArrayList<JPanel> bookPanelsList = new ArrayList<>();
    static HashMap<JPanel, JLabel> bookLabelsList = new HashMap<>();

    protected void addBooksToPanel(JPanel viewBooks, JPanel editBooks) {

        booksPanel.removeAll();
        editBooksPanel.removeAll();
        booksPanel.add(addBooksButton);
        bookPanelsList.clear();
        bookLabelsList.clear();

        List<LibraryFunctions.bookInfos> booksFromDB = LibraryFunctions.fetchBookData();

        for (LibraryFunctions.bookInfos book : booksFromDB) {

            String title = book.title;
            String author = book.author;

            ImageIcon bookCover = book.cover;  // Already scaled from fetchBookData()

            custom.components.RoundedPanel panel1 = createBookPanels(title, author, bookCover);
            custom.components.RoundedPanel panel2 = createBookPanels(title, author, bookCover);
            
            viewBooks.add(panel1);
            editBooks.add(panel2);

            bookPanelsList.add(panel1);
            bookPanelsList.add(panel2);
            bookLabelsList.put(panel1, (javax.swing.JLabel) panel1.getComponent(0));
            bookLabelsList.put(panel2, (javax.swing.JLabel) panel2.getComponent(0));
        }

        viewBooks.revalidate();
        viewBooks.repaint();
        editBooks.revalidate();
        editBooks.repaint();

        resizeBooksPanel(booksPanel, booksScrollPaneCard);
        resizeBooksPanel(editBooksPanel, editBooksScrollPaneCard);
    }

    private custom.components.RoundedPanel createBookPanels(String title, String author, ImageIcon bookCover){

        custom.components.RoundedPanel bookPanel = new custom.components.RoundedPanel();
            bookPanel.setPreferredSize(new Dimension(165, 285));
            bookPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 10));
            bookPanel.setBorderVisible(false);
            bookPanel.setOpaque(true);
            bookPanel.setBackground(new Color(255, 255, 255, 0));
            bookPanel.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    MouseEntered(evt);
                }

                public void mouseExited(java.awt.event.MouseEvent evt) {
                    MouseExited(evt);
                }

                public void mousePressed(java.awt.event.MouseEvent evt) {
                    MousePressed(evt);
                }
            });

            JLabel bookLabel = new JLabel();
            bookLabel.setIcon(bookCover);
            bookLabel.setText("<html><div style='text-align: center;'>" + title + "<br><i>" + author + "</i></div></html>");
            bookLabel.setFont(new Font("Serif", Font.BOLD, 15));
            bookLabel.setHorizontalTextPosition(JLabel.CENTER);
            bookLabel.setVerticalTextPosition(JLabel.BOTTOM);
            bookLabel.setHorizontalAlignment(JLabel.CENTER);
            bookLabel.setIconTextGap(5);

            bookPanel.add(bookLabel);
            return bookPanel;
    }

    private void resizeBooksPanel(JPanel panel, JScrollPane scrollPane){
        int bookPanelWidth = 170;
        int bookPanelHeight = 200;

        int containerWidth = scrollPane.getViewport().getWidth();
        if (containerWidth == 0) containerWidth = 700;

        int booksPerRow = containerWidth / bookPanelWidth;
        if (booksPerRow == 0) booksPerRow = 1;

        int rows = (int) Math.ceil((double) bookPanelsList.size() / booksPerRow);
        int heightNeeded = rows * bookPanelHeight + (rows * 10); // spacing

        panel.setPreferredSize(new Dimension(containerWidth, heightNeeded));
        panel.revalidate();
        panel.repaint();

    }
    
    private void changeScrollBarLook(JScrollPane scrollPane) {
        javax.swing.JScrollBar verticalBar = scrollPane.getVerticalScrollBar();
        verticalBar.setUnitIncrement(10);
        verticalBar.setUI(new javax.swing.plaf.basic.BasicScrollBarUI() {
            @Override
            protected void configureScrollBarColors() {
                this.thumbColor = new java.awt.Color(105, 140, 75); // Scroll thumb
                this.trackColor = new java.awt.Color(204, 224, 191);  // Scroll track
            }

            @Override
            protected JButton createDecreaseButton(int orientation) {
                return createZeroButton();
            }

            @Override
            protected JButton createIncreaseButton(int orientation) {
                return createZeroButton();
            }

            private JButton createZeroButton() {
                JButton button = new JButton();
                button.setPreferredSize(new Dimension(0, 0));
                button.setMinimumSize(new Dimension(0, 0));
                button.setMaximumSize(new Dimension(0, 0));
                return button;
            }

            @Override
            protected void paintThumb(Graphics g, JComponent c, Rectangle thumbBounds) {
                if (thumbBounds.isEmpty() || !scrollbar.isEnabled()) return;

                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                g2.setPaint(thumbColor);
                int arc = 10; // Change this for more or less roundness
                g2.fillRoundRect(thumbBounds.x, thumbBounds.y, thumbBounds.width, thumbBounds.height, arc, arc);

                g2.dispose();
            }

            @Override
            protected void paintTrack(Graphics g, JComponent c, Rectangle trackBounds) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setPaint(trackColor);
                g2.fillRect(trackBounds.x, trackBounds.y, trackBounds.width, trackBounds.height);
                g2.dispose();
            }

            @Override
            public Dimension getPreferredSize(JComponent c) {
                // This controls scrollbar thickness:
                return new Dimension(8, 0); // 8px wide for vertical scrollbar
            }
        });
    }

    
    private boolean isExpanded = false;
    private Timer animationTimer;
    private final int COLLAPSED_WIDTH = 75;
    private final int EXPANDED_WIDTH = 200;
    private final int STEP = 15; // pixels per animation frame
    private final int DELAY = 5; // ms between frames

    private void animateSidePanel(boolean currentlyExpanded){
        CardLayout cl = (CardLayout)(cardPanel.getLayout());
        int startWidth = currentlyExpanded ? EXPANDED_WIDTH : COLLAPSED_WIDTH;
        int targetWidth = currentlyExpanded ? COLLAPSED_WIDTH : EXPANDED_WIDTH;
        int direction = currentlyExpanded ? -STEP : STEP;
    
        animationTimer = new Timer(DELAY, null);
        animationTimer.addActionListener(new ActionListener() {
            int width = startWidth;

            public void actionPerformed(ActionEvent e) {
                width += direction;
                if ((direction > 0 && width >= targetWidth) || (direction < 0 && width <= targetWidth)) {
                    width = targetWidth;
                    animationTimer.stop();
                }
    
                sidePanel.setPreferredSize(new Dimension(width, sidePanel.getHeight()));

                String visibleCard = (width > 150) ? "extended" : "minimized";
                cl.show(cardPanel,visibleCard);

                viewBooksSideLabel.setText((width > 150) ? "<html>View/Add<br>Books</html>" : "");
                editBooksSideLabel.setText((width > 150) ? "Edit Books" : "");
                logOutLabel.setText((width > 150) ? "Log Out" : "");
                
                sidePanel.revalidate();
                sidePanel.repaint();

                resizeBooksPanel(booksPanel, booksScrollPaneCard);
                resizeBooksPanel(editBooksPanel, editBooksScrollPaneCard);
            }
        });
    
        animationTimer.start();
    }

    private void highlightButton(JPanel selectedButton) {
        viewBooksSideButton.setBorderVisible(false);
        editBooksSideButton.setBorderVisible(false);

        ((custom.components.RoundedPanel) selectedButton).setBorderVisible(true);
    }

    private Component getVisibleCard(Container parent){
        
        for(Component comp : parent.getComponents()){
            if(comp.isVisible()){
                return comp;
            }
        }
        return null;
    }

    private void setPanelBackground(JPanel panel, Color color){
        panel.setOpaque(true);
        panel.setBackground(color);
        panel.getParent().repaint();
    }

    private void MouseEntered(java.awt.event.MouseEvent evt){

        Object source = evt.getSource();

        for(JPanel panels : bookPanelsList){
            if(source == panels){
                setPanelBackground(panels, new Color(255,255,255,80));
                return;
            }
        }

        if(source == viewBooksSideButton){
            if(!"viewBooks".equals(getVisibleCard(cardPanel2).getName())){
                setPanelBackground(viewBooksSideButton, new Color(141,181,119,200));
            }
        
        } else if(source == editBooksSideButton){
            if(!"editBooks".equals(getVisibleCard(cardPanel2).getName())){
                setPanelBackground(editBooksSideButton, new Color(141,181,119,200));
            }

        } else if(source == addBooksLabel){
            setPanelBackground(addBooksButton,new Color(255,255,255,120));

        } else if(evt.getSource()==burgerButton){
            setPanelBackground(burgerButtonPanel,new Color(0,0,0,100));

        } else if(evt.getSource()==logOutLabel){
            setPanelBackground(logOutPanel,new Color(0,0,0,100));
        }

    }

    private void MouseExited(java.awt.event.MouseEvent evt){

        Object source = evt.getSource();

        for(JPanel panels : bookPanelsList){
            if(evt.getSource()==panels){
                setPanelBackground(panels,new Color(255,255,255,0));
            }
        }

        if(source == viewBooksSideButton){
            setPanelBackground(viewBooksSideButton,new Color(0,0,0,0));
        
        } else if(source == editBooksSideButton){
            setPanelBackground(editBooksSideButton,new Color(0,0,0,0));
        
        } else if(source == addBooksLabel){
            setPanelBackground(addBooksButton,new Color(255,255,255,80));
        
        } else if(source == burgerButton){
            setPanelBackground(burgerButtonPanel,new Color(0,0,0,0));
        
        } else if(source == logOutLabel){
            setPanelBackground(logOutPanel,new Color(0,0,0,0));
        }
    }

    public static String editBookTag = null;
    public static String editBookcallNum = null;

    private void MousePressed(java.awt.event.MouseEvent evt){

        Object source = evt.getSource();
        CardLayout cl = (CardLayout) cardPanel2.getLayout();

        if(evt.getSource() == burgerButton && (animationTimer == null || !animationTimer.isRunning())){
            animateSidePanel(isExpanded);
            isExpanded = !isExpanded;
            return;
        }

        for (JPanel book : bookPanelsList){
            if(source == book){
                JLabel bookLabel = bookLabelsList.get(book);
                String text = bookLabel.getText().replaceAll("<[^>]*>", "_").trim();
                String[] info = text.split("__");
                String bookTitle = info[1];

                List<com.mycompany.library.functions.LibraryFunctions.bookInfos> bookInfos = 
                    com.mycompany.library.functions.LibraryFunctions.fetchBookByTitle(bookTitle);

                if("editBooks".equals(getVisibleCard(cardPanel2).getName())){
                    AdminFunctions.showEditBookDialog(bookInfos);
                
                } else{
                    AdminFunctions.showViewBookDialog(bookInfos);
                }

                return;
            }
        }

        if(source == viewBooksSideButton){
            cl.show(cardPanel2, "viewBooks");
            highlightButton(viewBooksSideButton);
        
        } else if(source == editBooksSideButton){
            cl.show(cardPanel2, "editBooks");
            highlightButton(editBooksSideButton);
        
        } else if(source == addBooksLabel){
            AdminFunctions.showDialog(new adminAddBook(), "Add Book", true);
        
        } else if(source == logOutLabel){
            int logOut = JOptionPane.showConfirmDialog(rootPane, 
                                                        "Are you sure you want to log out?",
                                                        "Log Out?", JOptionPane.YES_NO_OPTION);
            if(logOut == JOptionPane.YES_OPTION){
                this.dispose();
                new LogInPage().setVisible(true);
            }
        }

        sidePanel.revalidate();
        sidePanel.repaint();

    }

    public void KeyReleased(java.awt.event.KeyEvent e){
        String query = searchBar.getText().toLowerCase();
        for (JPanel panel : bookPanelsList) {
            JLabel label = bookLabelsList.get(panel);
            boolean visible = label.getText().toLowerCase().contains(query);
            panel.setVisible(visible);
        }
        booksPanel.revalidate();
        booksPanel.repaint();
    }

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
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private custom.components.RoundedPanel addBooksButton;
    private javax.swing.JLabel addBooksLabel;
    public static javax.swing.JPanel booksPanel;
    public javax.swing.JScrollPane booksScrollPaneCard;
    private javax.swing.JLabel burgerButton;
    private custom.components.RoundedPanel burgerButtonPanel;
    private javax.swing.JPanel cardPanel;
    private javax.swing.JPanel cardPanel2;
    public static javax.swing.JPanel editBooksPanel;
    private javax.swing.JScrollPane editBooksScrollPaneCard;
    private custom.components.RoundedPanel editBooksSideButton;
    private javax.swing.JLabel editBooksSideLabel;
    private javax.swing.JPanel expandedPanel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel logOutLabel;
    private custom.components.RoundedPanel logOutPanel;
    private javax.swing.JPanel minimizedPanel;
    private javax.swing.JLabel olfu_lms_label;
    private javax.swing.JLabel olfu_logo_label;
    private custom.components.RoundedTextField searchBar;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JLabel smallLogoLabel;
    private javax.swing.JLabel student_label;
    private custom.components.RoundedPanel viewBooksSideButton;
    private javax.swing.JLabel viewBooksSideLabel;
    // End of variables declaration//GEN-END:variables
}
