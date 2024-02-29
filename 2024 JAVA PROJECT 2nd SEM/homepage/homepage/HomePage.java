package homepage;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.HashMap;
import java.util.Map;
import homepage.ArrayComponents.ArrayComponent;

public final class HomePage extends JFrame {
    private JLabel Logo;
    
    private JLabel GPU;
    private JLabel PSU;
    private JLabel Fan;
    private JLabel Motherboard;
    private JLabel Storage;
    private JLabel CPU;
    private JLabel Ram;
    private JLabel Case;

    public Map<String, Double> gpuPrices;
    public Map<String, Double> psuPrices;
    public Map<String, Double> fanPrices;
    public Map<String, Double> motherboardPrices;
    public Map<String, Double> storagePrices;
    public Map<String, Double> cpuPrices;
    public Map<String, Double> ramPrices;
    public Map<String, Double> casePrices;

    public Map<String, Double> GPU_REGIONPrices;
    public Map<String, Double> PSU_REGIONPrices;
    public Map<String, Double> FAN_REGIONPrices;
    public Map<String, Double> MOTHERBOARD_REGIONPrices;
    public Map<String, Double> STORAGE_REGIONPrices;
    public Map<String, Double> CPU_REGIONPrices;
    public Map<String, Double> RAM_REGIONPrices;
    public Map<String, Double> CASE_REGIONPrices;

    public JSpinner gpuSpinner;
    public JSpinner psuSpinner;
    public JSpinner fanSpinner;
    public JSpinner motherboardSpinner;
    public JSpinner storageSpinner;
    public JSpinner cpuSpinner;
    public JSpinner ramSpinner;
    public JSpinner caseSpinner;

    public JComboBox<String> gpuBox;
    public JComboBox<String> psuBox;
    public JComboBox<String> fanBox;
    public JComboBox<String> motherboardBox;
    public JComboBox<String> storageBox;
    public JComboBox<String> cpuBox;
    public JComboBox<String> ramBox;
    public JComboBox<String> caseBox;
    
    public JButton checkOut;

    public JComboBox<String> GPURegionBox;
    public JComboBox<String> PSURegionBox;
    public JComboBox<String> FANRegionBox;
    public JComboBox<String> MotherBoardRegionBox;
    public JComboBox<String> STORAGERegionBox;
    public JComboBox<String> CPURegionBox;
    public JComboBox<String> RAMRegionBox;
    public JComboBox<String> CASERegionBox;

    public JLabel GPUprice;
    public JLabel PSUprice;
    public JLabel FANprice;
    public JLabel MotherBoardprice;
    public JLabel STORAGEprice;
    public JLabel CPUprice;
    public JLabel RAMprice;
    public JLabel CASEprice;

    public JLabel GPUtax;
    public JLabel PSUtax;
    public JLabel FANtax;
    public JLabel MotherBoardtax;
    public JLabel STORAGEtax;
    public JLabel CPUtax;
    public JLabel RAMtax;
    public JLabel CASEtax;
    
    public JLabel GPUShippingFee;
    public JLabel PSUShippingFee;
    public JLabel FANShippingFee;
    public JLabel MotherBoardShippingFee;
    public JLabel STORAGEShippingFee;
    public JLabel CPUShippingFee;
    public JLabel RAMShippingFee;
    public JLabel CASEShippingFee;

    public HomePage(){
        initializeComponents();

        checkOut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateAndShowTotal(); // Call the method to show the checkout summary
            }
        });
    }

    public void initializeComponents() {
        //Main top panel
        JPanel mainTopPanel = new JPanel(new BorderLayout());
        mainTopPanel.setBackground(Color.decode("#232527"));

        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 100,50));
        topPanel.setBackground(Color.decode("#232527"));
        Logo = new JLabel("Logo");
        topPanel.add(Logo);

        JPanel RIGHT_Log_Reg_Panel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 100,50));
        RIGHT_Log_Reg_Panel.setBackground(Color.decode("#232527"));
        JButton Login = new JButton("Login");
        Login.setForeground(Color.WHITE);
        Login.setBackground(Color.decode("#232527"));
        Login.setBorder(BorderFactory.createEmptyBorder());
        JButton Register = new JButton("Register");
        Register.setForeground(Color.WHITE);
        Register.setBackground(Color.decode("#232527"));
        Register.setBorder(BorderFactory.createEmptyBorder());

        RIGHT_Log_Reg_Panel.add(Login);
        RIGHT_Log_Reg_Panel.add(Register);

        JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT, 100,10));
        p1.setBackground(Color.decode("#191B1B"));
        JLabel component = new JLabel("Component                                                           Selection");
        JLabel amount = new JLabel("                    Amount");
        JLabel Location = new JLabel("Location");
        JLabel Tax = new JLabel("Tax");
        JLabel Price = new JLabel("Price");

        component.setForeground(Color.WHITE);
        amount.setForeground(Color.WHITE);
        Location.setForeground(Color.WHITE);
        Tax.setForeground(Color.WHITE);
        Price.setForeground(Color.WHITE);

        p1.add(component);
        p1.add(amount);
        p1.add(Location);
        p1.add(Tax);
        p1.add(Price);
        
        javax.swing.border.Border emptyBorder = BorderFactory.createEmptyBorder(10,10,100,100);
        JPanel emptyPanel = new JPanel(new BorderLayout());
        emptyPanel.setBorder(emptyBorder);

        JPanel p2 = new JPanel(new GridLayout(0,7,100,10));

        String[] gpuArray = ArrayComponent.getGPUArray();
        String[] psuArray = ArrayComponent.getPSUArray();
        String[] fanArray = ArrayComponent.getFANArray();
        String[] motherBArray = ArrayComponent.getMotherBoardArray();
        String[] storageArray = ArrayComponent.getStorageArray();
        String[] cpuArray = ArrayComponent.getCPUArray();
        String[] ramArray = ArrayComponent.getRAMArray();
        String[] caseArray = ArrayComponent.getCaseArray();

        gpuPrices = ArrayComponent.getGPUPrices();
        psuPrices = ArrayComponent.getPSUPrices();
        fanPrices = ArrayComponent.getFANPrices();
        motherboardPrices = ArrayComponent.getMotherboardPrices();
        storagePrices = ArrayComponent.getStoragePrices();
        cpuPrices = ArrayComponent.getCPUPrices();
        ramPrices = ArrayComponent.getRAMPrices();
        casePrices = ArrayComponent.getCasePrices();

        //Regions
        String[] gpuRegionArray = ArrayComponent.getGPURegionArray();
        String[] psuRegionArray = ArrayComponent.getPSURegionArray();
        String[] fanRegionArray = ArrayComponent.getFANRegionArray();
        String[] motherboardRegionArray = ArrayComponent.getMOTHERBOARDRegionArray();
        String[] storageRegionArray = ArrayComponent.getSTORAGERegionArray();
        String[] cpuRegionArray = ArrayComponent.getCPURegionArray();
        String[] ramRegionArray = ArrayComponent.getRAMRegionArray();
        String[] caseRegionArray = ArrayComponent.getCASERegionArray();

        GPU_REGIONPrices = ArrayComponent.getGPU_REGIONPrices();
        PSU_REGIONPrices = ArrayComponent.getPSU_REGIONPrices();
        FAN_REGIONPrices = ArrayComponent.getFAN_REGIONPrices();
        MOTHERBOARD_REGIONPrices = ArrayComponent.getMOTHEBOARD_REGIONPrices();
        STORAGE_REGIONPrices = ArrayComponent.getSTORAGE_REGIONPrices();
        CPU_REGIONPrices = ArrayComponent.getCPU_REGIONPrices();
        RAM_REGIONPrices = ArrayComponent.getRAM_REGIONPrices();
        CASE_REGIONPrices = ArrayComponent.getCASE_REGIONPrices();

        

        //New object JSpinner
        GPU = new JLabel("GPU");
        gpuBox = new JComboBox<>(gpuArray);
        SpinnerNumberModel GPUspinnerModel = new SpinnerNumberModel(0, 0, 100, 1);
        gpuSpinner = new JSpinner(GPUspinnerModel);
        JSpinner.NumberEditor GPUeditor = new JSpinner.NumberEditor(gpuSpinner, "0");
        gpuSpinner.setEditor(GPUeditor);
        GPURegionBox = new JComboBox<>(gpuRegionArray); 
        GPUprice = new JLabel(""+ gpuPrices.get(gpuArray[0]));
        GPUtax = new JLabel("0");
        GPUShippingFee = new JLabel(""+ GPU_REGIONPrices.get(gpuRegionArray[0]));

        PSU = new JLabel("PSU");
        psuBox = new JComboBox<>(psuArray);
        SpinnerNumberModel PSUspinnerModel = new SpinnerNumberModel(0, 0, 100,1);
        psuSpinner = new JSpinner(PSUspinnerModel);
        JSpinner.NumberEditor psueditor = new JSpinner.NumberEditor(psuSpinner, "0");
        psuSpinner.setEditor(psueditor);
        PSURegionBox = new JComboBox<>(psuRegionArray);
        PSUprice = new JLabel(""+ psuPrices.get(psuArray[0]));
        PSUtax = new JLabel("0");
        PSUShippingFee = new JLabel(""+ PSU_REGIONPrices.get(psuRegionArray[0]));

        Fan = new JLabel("Fan");
        fanBox = new JComboBox<>(fanArray);
        SpinnerNumberModel FANspinnerModel = new SpinnerNumberModel(0, 0, 100,1);
        fanSpinner = new JSpinner(FANspinnerModel);
        JSpinner.NumberEditor faneditor = new JSpinner.NumberEditor(fanSpinner, "0");
        fanSpinner.setEditor(faneditor);
        FANRegionBox = new JComboBox<>(fanRegionArray);
        FANprice = new JLabel(""+ fanPrices.get(fanArray[0]));
        FANtax = new JLabel("0");
        FANShippingFee = new JLabel(""+ FAN_REGIONPrices.get(fanRegionArray[0]));

        Motherboard = new JLabel("MotherBoard");
        motherboardBox = new JComboBox<>(motherBArray);
        SpinnerNumberModel MOTHERBOARDspinnerModel = new SpinnerNumberModel(0, 0, 100,1);
        motherboardSpinner = new JSpinner(MOTHERBOARDspinnerModel);
        JSpinner.NumberEditor motherboardeditor = new JSpinner.NumberEditor(motherboardSpinner, "0");
        motherboardSpinner.setEditor(motherboardeditor);
        MotherBoardRegionBox = new JComboBox<>(motherboardRegionArray);
        MotherBoardprice = new JLabel(""+ MOTHERBOARD_REGIONPrices.get(motherBArray[0]));
        MotherBoardtax = new JLabel("0");
        MotherBoardShippingFee = new JLabel(""+ MOTHERBOARD_REGIONPrices.get(motherboardRegionArray[0]));

        Storage = new JLabel("Storage");
        storageBox = new JComboBox<>(storageArray);
        SpinnerNumberModel STORAGEspinnerModel = new SpinnerNumberModel(0, 0, 100,1);
        storageSpinner = new JSpinner(STORAGEspinnerModel);
        JSpinner.NumberEditor storageeditor = new JSpinner.NumberEditor(storageSpinner, "0");
        storageSpinner.setEditor(storageeditor);
        STORAGERegionBox = new JComboBox<>(storageRegionArray);
        STORAGEprice = new JLabel(""+ storagePrices.get(storageArray[0]));
        STORAGEtax = new JLabel("0");
        STORAGEShippingFee = new JLabel(""+ STORAGE_REGIONPrices.get(storageArray[0]));

        CPU = new JLabel("CPU");
        cpuBox = new JComboBox<>(cpuArray);
        SpinnerNumberModel CPUspinnerModel = new SpinnerNumberModel(0, 0, 100,1);
        cpuSpinner = new JSpinner(CPUspinnerModel);
        JSpinner.NumberEditor cpueditor = new JSpinner.NumberEditor(cpuSpinner, "0");
        cpuSpinner.setEditor(cpueditor);
        CPURegionBox = new JComboBox<>(cpuRegionArray);
        CPUprice = new JLabel(""+ cpuPrices.get(cpuArray[0]));
        CPUtax = new JLabel("0");
        CPUShippingFee = new JLabel(""+ CPU_REGIONPrices.get(cpuArray[0]));

        Ram = new JLabel("Ram");
        ramBox = new JComboBox<>(ramArray);
        SpinnerNumberModel RAMspinnerModel = new SpinnerNumberModel(0, 0, 100,1);
        ramSpinner = new JSpinner(RAMspinnerModel);
        JSpinner.NumberEditor ram_editor = new JSpinner.NumberEditor(ramSpinner, "0");
        ramSpinner.setEditor(ram_editor);
        RAMRegionBox = new JComboBox<>(ramRegionArray);
        RAMprice = new JLabel(""+ ramPrices.get(ramArray[0]));
        RAMtax = new JLabel("0");
        RAMShippingFee = new JLabel(""+ RAM_REGIONPrices.get(cpuArray[0]));

        Case = new JLabel("Case");
        caseBox = new JComboBox<>(caseArray);
        SpinnerNumberModel CASEspinnerModel = new SpinnerNumberModel(0, 0, 100,1);
        caseSpinner = new JSpinner(CASEspinnerModel);
        JSpinner.NumberEditor caseeditor = new JSpinner.NumberEditor(caseSpinner, "0");
        caseSpinner.setEditor(caseeditor);
        CASERegionBox = new JComboBox<>(caseRegionArray);
        CASEprice = new JLabel(""+ casePrices.get(caseArray[0]));
        CASEtax = new JLabel("0");
        CASEShippingFee = new JLabel(""+ CASE_REGIONPrices.get(cpuArray[0]));
        
        Register.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                dispose();
                new Register().setVisible(true);
            }
        });

        Login.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                dispose();
                new Login().setVisible(true);
            }
        });


        p2.add(GPU);
        p2.add(gpuBox);
        p2.add(gpuSpinner);
        p2.add(GPURegionBox);
        p2.add(GPUprice);
        p2.add(GPUtax);
        p2.add(GPUShippingFee);

        p2.add(PSU);
        p2.add(psuBox);
        p2.add(psuSpinner);
        p2.add(PSURegionBox);
        p2.add(PSUprice);
        p2.add(PSUtax);
        p2.add(PSUShippingFee);

        p2.add(Fan);
        p2.add(fanBox);
        p2.add(fanSpinner);
        p2.add(FANRegionBox);
        p2.add(FANprice);
        p2.add(FANtax);
        p2.add(FANShippingFee);

        p2.add(Motherboard);
        p2.add(motherboardBox);
        p2.add(motherboardSpinner);
        p2.add(MotherBoardRegionBox);
        p2.add(MotherBoardprice);
        p2.add(MotherBoardtax);
        p2.add(MotherBoardShippingFee);

        p2.add(Storage);
        p2.add(storageBox);
        p2.add(storageSpinner);
        p2.add(STORAGERegionBox);
        p2.add(STORAGEprice);
        p2.add(STORAGEtax);
        p2.add(STORAGEShippingFee);

        p2.add(CPU);
        p2.add(cpuBox);
        p2.add(cpuSpinner);
        p2.add(CPURegionBox);
        p2.add(CPUprice);
        p2.add(CPUtax);
        p2.add(CPUShippingFee);

        p2.add(Ram);
        p2.add(ramBox);
        p2.add(ramSpinner);
        p2.add(RAMRegionBox);
        p2.add(RAMprice);
        p2.add(RAMtax);
        p2.add(RAMShippingFee);

        p2.add(Case);
        p2.add(caseBox);
        p2.add(caseSpinner);
        p2.add(CASERegionBox);
        p2.add(CASEprice);
        p2.add(CASEtax);
        p2.add(CASEShippingFee);

        JPanel checkoutPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 100,10));
        checkOut = new JButton("Check out");

        checkoutPanel.add(checkOut);

        mainTopPanel.add(topPanel, BorderLayout.WEST);
        mainTopPanel.add(RIGHT_Log_Reg_Panel, BorderLayout.EAST);
        mainTopPanel.add(p1, BorderLayout.SOUTH);
        
        add(mainTopPanel, BorderLayout.NORTH);

        add(emptyPanel, BorderLayout.WEST);
        add(p2, BorderLayout.CENTER);
        add(checkoutPanel, BorderLayout.SOUTH);
        
        //Over
          // Add a ChangeListener to the JSpinner to update the JLabel when the value changes
        gpuSpinner.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                updateGPUPrice();
                updateGPUTaxLabel();
            }
        });

        gpuBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    updateGPUPrice();
                }
            }
        });

        psuSpinner.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                updatePSUPrice();
                updatePSUTaxLabel();
            }
        });
        
        psuBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    updatePSUPrice();
                }
            }
        });

        fanSpinner.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                updateFANPrice();
                updateFANTaxLabel();
            }
        });

        fanBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    updateFANPrice();
                }
            }
        });

        motherboardSpinner.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                updateMOTHERBOARDPrice();
                updateMOTHERBOARDTaxLabel();
            }
        });

        motherboardBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    updateMOTHERBOARDPrice();
                }
            }
        });

        storageSpinner.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                updateSTORAGEPrice();
                updateSTORAGETaxLabel();
            }
        });

        storageBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    updateSTORAGEPrice();
                }
            }
        });

        cpuSpinner.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                updateCPUPrice();
                updateCPUTaxLabel();
            }
        });

        cpuBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    updateCPUPrice();
                }
            }
        });
   
        ramSpinner.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                updateRAMPrice();
                updateRAMTaxLabel();
            }
        });

        ramBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    updateRAMPrice();

                }
            }
        });
    
        caseSpinner.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                updateCASEPrice();
                updateCASETaxLabel();
            }
        });

        caseBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    updateCASEPrice();
                }
            }
        });
    
        // Regional JBox
    GPURegionBox.addActionListener(new ActionListener() {
        @Override
            public void actionPerformed(ActionEvent e) {
                    updateGPUPrice();
                }
        });
    
    PSURegionBox.addActionListener(new ActionListener() {
        @Override
            public void actionPerformed(ActionEvent e) {
                    updatePSUPrice();
                }
        });

    FANRegionBox.addActionListener(new ActionListener() {
        @Override
            public void actionPerformed(ActionEvent e) {
                    updateFANPrice();
                }
        });

    MotherBoardRegionBox.addActionListener(new ActionListener() {
        @Override
            public void actionPerformed(ActionEvent e) {
                    updateMOTHERBOARDPrice();
                }
        });

    STORAGERegionBox.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            updateSTORAGEPrice();
        }
    });

    CPURegionBox.addActionListener(new ActionListener() {
        @Override
            public void actionPerformed(ActionEvent e) {
                    updateCPUPrice();
                }
        });
    
    RAMRegionBox.addActionListener(new ActionListener() {
        @Override
            public void actionPerformed(ActionEvent e) {
                    updateRAMPrice();
                }
        });

    CASERegionBox.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            updateCASEPrice();
                }
            });
        }

    // Update the GPU price based on the selected GPU and spinner value
    private void updateGPUPrice() {
        String selectedGPU = (String) gpuBox.getSelectedItem();
        Double selectedGPUPrice = gpuPrices.get(selectedGPU);
        int spinnerValue = (int) gpuSpinner.getValue();
    
        if (selectedGPUPrice != null) {
            double totalPrice = selectedGPUPrice * spinnerValue;
            GPUprice.setText("P" + totalPrice);
    
            String selectedGPURegion = (String) GPURegionBox.getSelectedItem();
            Double shippingFee = GPU_REGIONPrices.get(selectedGPURegion);
    
            if (shippingFee != null) {
                GPUShippingFee.setText("P" + shippingFee);
            } else {
                GPUShippingFee.setText("Shipping fee not available");
            }
        } else {
            GPUprice.setText("Price not available");
        }
    }

    private void updatePSUPrice() {
        String selectedPSU = (String) psuBox.getSelectedItem();
        Double selectedPSUPrice = psuPrices.get(selectedPSU);
        int spinnerValue = (int) psuSpinner.getValue();
    
        if (selectedPSUPrice != null) {
            double totalPrice = selectedPSUPrice * spinnerValue;
            PSUprice.setText("P" + totalPrice);
    
            String selectedPSURegion = (String) PSURegionBox.getSelectedItem();
            Double shippingFee = PSU_REGIONPrices.get(selectedPSURegion);
    
            if (shippingFee != null) {
                PSUShippingFee.setText("P" + shippingFee);
            } else {
                PSUShippingFee.setText("Shipping fee not available");
            }
        } else {
            PSUprice.setText("Price not available");
        }
    }
    
    private void updateFANPrice() {
        String selectedFAN = (String) fanBox.getSelectedItem();
        Double selectedFANPrice = fanPrices.get(selectedFAN);
        int spinnerValue = (int) fanSpinner.getValue();
    
        if (selectedFANPrice != null) {
            double totalPrice = selectedFANPrice * spinnerValue;
            FANprice.setText("P" + totalPrice);
    
            String selectedFANRegion = (String) FANRegionBox.getSelectedItem();
            Double shippingFee = FAN_REGIONPrices.get(selectedFANRegion);
    
            if (shippingFee != null) {
                FANShippingFee.setText("P" + shippingFee);
            } else {
                FANShippingFee.setText("Shipping fee not available");
            }
        } else {
            FANprice.setText("Price not available");
        }
    }
    
    private void updateMOTHERBOARDPrice() {
        String selectedMotherboard = (String) motherboardBox.getSelectedItem();
        Double selectedMotherboardPrice = motherboardPrices.get(selectedMotherboard);
        int spinnerValue = (int) motherboardSpinner.getValue();
    
        if (selectedMotherboardPrice != null) {
            double totalPrice = selectedMotherboardPrice * spinnerValue;
            MotherBoardprice.setText("P" + totalPrice);
    
            String selectedMOTHERBOARDRegion = (String) MotherBoardRegionBox.getSelectedItem();
            Double shippingFee = MOTHERBOARD_REGIONPrices.get(selectedMOTHERBOARDRegion);
    
            if (shippingFee != null) {
                MotherBoardShippingFee.setText("P" + shippingFee);
            } else {
                MotherBoardShippingFee.setText("Shipping fee not available");
            }
        } else {
            MotherBoardprice.setText("Price not available");
        }
    }

    private void updateSTORAGEPrice() {
        String selectedStorage = (String) storageBox.getSelectedItem();
        Double selectedStoragePrice = storagePrices.get(selectedStorage);
        int spinnerValue = (int) storageSpinner.getValue();
    
        if (selectedStoragePrice != null) {
            double totalPrice = selectedStoragePrice * spinnerValue;
            STORAGEprice.setText("P" + totalPrice);
    
            String selectedSTORAGERegion = (String) STORAGERegionBox.getSelectedItem();
            Double shippingFee = STORAGE_REGIONPrices.get(selectedSTORAGERegion);
    
            if (shippingFee != null) {
                STORAGEShippingFee.setText("P" + shippingFee);
            } else {
                STORAGEShippingFee.setText("Shipping fee not available");
            }
        } else {
            STORAGEprice.setText("Price not available");
        }
    }
    
    private void updateCPUPrice() {
        String selectedCPU = (String) cpuBox.getSelectedItem();
        Double selectedCPUPrice = cpuPrices.get(selectedCPU);
        int spinnerValue = (int) cpuSpinner.getValue();
    
        if (selectedCPUPrice != null) {
            double totalPrice = selectedCPUPrice * spinnerValue;
            CPUprice.setText("P" + totalPrice);
    
            String selectedCPURegion = (String) CPURegionBox.getSelectedItem();
            Double shippingFee = CPU_REGIONPrices.get(selectedCPURegion);
    
            if (shippingFee != null) {
                CPUShippingFee.setText("P" + shippingFee);
            } else {
                CPUShippingFee.setText("Shipping fee not available");
            }
        } else {
            CPUprice.setText("Price not available");
        }
    }

    private void updateRAMPrice() {
    String selectedRAM = (String) ramBox.getSelectedItem();
    Double selectedRAMPrice = ramPrices.get(selectedRAM);
    int spinnerValue = (int) ramSpinner.getValue();

    if (selectedRAMPrice != null) {
        double totalPrice = selectedRAMPrice * spinnerValue;
        RAMprice.setText("P" + totalPrice);

        String selectedRAMRegion = (String) RAMRegionBox.getSelectedItem();
        Double shippingFee = RAM_REGIONPrices.get(selectedRAMRegion);

        if (shippingFee != null) {
            RAMShippingFee.setText("P" + shippingFee);
        } else {
            RAMShippingFee.setText("Shipping fee not available");
        }
    } else {
        RAMprice.setText("Price not available");
    }
}

private void updateCASEPrice() {
    String selectedCASE = (String) caseBox.getSelectedItem();
    Double selectedCASEPrice = casePrices.get(selectedCASE);
    int spinnerValue = (int) caseSpinner.getValue();

    if (selectedCASEPrice != null) {
        double totalPrice = selectedCASEPrice * spinnerValue;
        CASEprice.setText("P" + totalPrice);

        String selectedCASERegion = (String) CASERegionBox.getSelectedItem();
        Double shippingFee = CASE_REGIONPrices.get(selectedCASERegion);

        if (shippingFee != null) {
            CASEShippingFee.setText("P" + shippingFee);
        } else {
            CASEShippingFee.setText("Shipping fee not available");
        }
    } else {
        CASEprice.setText("Price not available");
    }
}

    //Tax changer
    private void updateGPUTaxLabel() {
        int selectedQuantity = (int) gpuSpinner.getValue();

    if (selectedQuantity > 0) {
        GPUtax.setText("12%");
    } else {
        GPUtax.setText("0%");
    }
}

    private void updatePSUTaxLabel() {
        int selectedQuantity = (int) psuSpinner.getValue();

    if (selectedQuantity > 0) {
        PSUtax.setText("12%");
    } else {
        PSUtax.setText("0%");
    }
}

    private void updateFANTaxLabel() {
        int selectedQuantity = (int) fanSpinner.getValue();
        if (selectedQuantity > 0) {
            FANtax.setText("12%");
        } else {
            FANtax.setText("0%");
        }
    }

    private void updateMOTHERBOARDTaxLabel() {
        int selectedQuantity = (int) motherboardSpinner.getValue();

    if (selectedQuantity > 0) {
        MotherBoardtax.setText("12%");
    } else {
        MotherBoardtax.setText("0%");
    }
}

    private void updateSTORAGETaxLabel() {
        int selectedQuantity = (int) storageSpinner.getValue();

    if (selectedQuantity > 0) {
        STORAGEtax.setText("12%");
    } else {
        STORAGEtax.setText("0%");
    }
}

    private void updateCPUTaxLabel() {
        int selectedQuantity = (int) cpuSpinner.getValue();

    if (selectedQuantity > 0) {
        CPUtax.setText("12%");
    } else {
        CPUtax.setText("0%");
    }
}

    private void updateRAMTaxLabel() {
        int selectedQuantity = (int) ramSpinner.getValue();

        // Check if the selected quantity is greater than 0
    if (selectedQuantity > 0) {
        // Set the FANtax label to "12%" if the quantity is greater than 0
        RAMtax.setText("12%");
    } else {
        // Otherwise, set the FANtax label to "0%"
        RAMtax.setText("0%");
    }
}

    private void updateCASETaxLabel() {
        int selectedQuantity = (int) caseSpinner.getValue();
        if (selectedQuantity > 0) {
            CASEtax.setText("12%");
        } else {
            CASEtax.setText("0%");
        }
    }
    

    private void processPayment() {
        // Ensure the selected products are set in the Receipt class before generating the receipt text
        String selectedGPU = (String) gpuBox.getSelectedItem();
        String selectedPSU = (String) psuBox.getSelectedItem();
        String selectedFAN = (String) fanBox.getSelectedItem();  // Replace with the actual selected FAN value
        String selectedMotherboard = (String) motherboardBox.getSelectedItem();  // Replace with the actual selected MOTHERBOARD value
        String selectedStorage = (String) storageBox.getSelectedItem();  // Replace with the actual selected STORAGE value
        String selectedCPU = (String) cpuBox.getSelectedItem();  // Replace with the actual selected CPU value
        String selectedRAM = (String) ramBox.getSelectedItem();  // Replace with the actual selected RAM value
        String selectedCASE = (String) caseBox.getSelectedItem();  // Replace with the actual selected CASE value

Receipt.setSelectedProducts(selectedGPU, selectedPSU, selectedFAN, selectedMotherboard, 
                             selectedStorage, selectedCPU, selectedRAM, selectedCASE);

        String receiptText = Receipt.generateReceiptText(CASERegionBox, caseSpinner);

        // Display the receipt as a popup message
        JOptionPane.showMessageDialog(this, receiptText, "Receipt", JOptionPane.INFORMATION_MESSAGE);

        closeSummaryFrame();
    }

    private void closeSummaryFrame() {
        // Close the summary frame
        Window[] windows = Window.getWindows();
        for (Window window : windows) {
            if (window instanceof JFrame) {
                window.dispose();
            }
        }
    }

    // CALCULATION
    public double calculateAndShowTotal() {
        double totalPrice = calculateTotalPrice();
        System.out.println("Total Price: " + totalPrice);
    
        double shippingFee = calculateShippingFee(CPURegionBox, CPU_REGIONPrices); // Adjust the arguments
        System.out.println("Shipping Fee: " + shippingFee);
        Receipt.setTransactionDetails(totalPrice, shippingFee);

        //debug
        double totalShippingFees = calculateTotalShippingFees();
        System.out.println("Total Shipping Fees: " + totalShippingFees);
    
        JFrame summaryFrame = new JFrame("Checkout Summary");
        summaryFrame.setSize(400, 200);
    
        JLabel totalPriceLabel = new JLabel("Total Price: P" + totalPrice);
        totalPriceLabel.setFont(new Font("Arial", Font.BOLD, 18));
    
        JButton payButton = new JButton("Pay");
        payButton.addActionListener(e -> {
            processPayment();
            performCheckout(); // Call performCheckout when the Pay button is clicked
            summaryFrame.dispose();
        });
    
        JPanel panel = new JPanel();
        panel.add(totalPriceLabel);
        panel.add(payButton);
    
        summaryFrame.add(panel);
    
        summaryFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        summaryFrame.setLocationRelativeTo(null);
        summaryFrame.setVisible(true);

        return totalPrice;
    }

    private double calculateTotalShippingFees() {
        double totalShippingFees = 0.0;
    
        totalShippingFees += calculateShippingFee(GPURegionBox, GPU_REGIONPrices);
        totalShippingFees += calculateShippingFee(PSURegionBox, PSU_REGIONPrices);
        totalShippingFees += calculateShippingFee(FANRegionBox, FAN_REGIONPrices);
        totalShippingFees += calculateShippingFee(MotherBoardRegionBox, MOTHERBOARD_REGIONPrices);
        totalShippingFees += calculateShippingFee(STORAGERegionBox, STORAGE_REGIONPrices);
        totalShippingFees += calculateShippingFee(CPURegionBox, CPU_REGIONPrices);
        totalShippingFees += calculateShippingFee(RAMRegionBox, RAM_REGIONPrices);
        totalShippingFees += calculateShippingFee(CASERegionBox, CASE_REGIONPrices);
    
        return totalShippingFees;
    }
    

    private double calculateShippingFee(JComboBox<String> regionBox, Map<String, Double> regionPrices) {
        // Get the selected region from the JComboBox
        String selectedRegion = (String) regionBox.getSelectedItem();
    
        // Calculate and return the shipping fee for the selected region
        return regionPrices.get(selectedRegion);
    }

    private double calculateTotalPrice() {
        // Calculate total price based on selected items in spinners and combo boxes
        double total = 0.0;
    
        // Add the total price of each component
        total += calculateComponentTotal(gpuBox, gpuPrices, gpuSpinner, GPURegionBox, GPU_REGIONPrices);
        total += calculateComponentTotal(psuBox, psuPrices, psuSpinner, PSURegionBox, PSU_REGIONPrices);
        total += calculateComponentTotal(fanBox, fanPrices, fanSpinner, FANRegionBox, FAN_REGIONPrices);
        total += calculateComponentTotal(motherboardBox, motherboardPrices, motherboardSpinner,
            MotherBoardRegionBox, MOTHERBOARD_REGIONPrices);
        total += calculateComponentTotal(storageBox, storagePrices, storageSpinner, STORAGERegionBox, STORAGE_REGIONPrices);
        total += calculateComponentTotal(cpuBox, cpuPrices, cpuSpinner, CPURegionBox, CPU_REGIONPrices);
        total += calculateComponentTotal(ramBox, ramPrices, ramSpinner, RAMRegionBox, RAM_REGIONPrices);
        total += calculateComponentTotal(caseBox, casePrices, caseSpinner, CASERegionBox, CASE_REGIONPrices);
        
        return total;
    }
    
    private double calculateComponentTotal(
        JComboBox<String> comboBox, Map<String, Double> prices,
        JSpinner spinner, JComboBox<String> regionBox, Map<String, Double> regionPrices) {

    String selectedComponent = (String) comboBox.getSelectedItem();
    Double price = prices.get(selectedComponent);
    int quantity = (int) spinner.getValue();

    System.out.println("Selected Component: " + selectedComponent);
    System.out.println("Price: " + price);
    System.out.println("Quantity: " + quantity);

    double componentTotal = (price != null) ? price * quantity : 0.0;

    String selectedRegion = (String) regionBox.getSelectedItem();
    Double shippingFee = regionPrices.get(selectedRegion);

    System.out.println("Selected Region: " + selectedRegion);
    System.out.println("Shipping Fee: " + shippingFee);

    double total = componentTotal + ((shippingFee != null) ? shippingFee : 0.0);

    System.out.println("Component Total: " + componentTotal);
    System.out.println("Total: " + total);

    return total;
}

private void performCheckout() {
    String selectedGPU = (String) gpuBox.getSelectedItem();
String selectedPSU = (String) psuBox.getSelectedItem();
String selectedFAN = (String) fanBox.getSelectedItem();  // Replace with the actual selected FAN value
String selectedMotherboard = (String) motherboardBox.getSelectedItem();  // Replace with the actual selected MOTHERBOARD value
String selectedStorage = (String) storageBox.getSelectedItem();  // Replace with the actual selected STORAGE value
String selectedCPU = (String) cpuBox.getSelectedItem();  // Replace with the actual selected CPU value
String selectedRAM = (String) ramBox.getSelectedItem();  // Replace with the actual selected RAM value
String selectedCASE = (String) caseBox.getSelectedItem();  // Replace with the actual selected CASE value

Receipt.setSelectedProducts(selectedGPU, selectedPSU, selectedFAN, selectedMotherboard, 
                             selectedStorage, selectedCPU, selectedRAM, selectedCASE);

    // Generate receipt text
    String receiptText = Receipt.generateReceiptText(CASERegionBox, caseSpinner);

    // Display the receipt as a popup message
    JOptionPane.showMessageDialog(this, receiptText, "Receipt", JOptionPane.INFORMATION_MESSAGE);

    // Close the summary frame
    closeSummaryFrame();
}
        
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            HomePage mainframe = new HomePage();
            mainframe.setTitle("Home Page");
            mainframe.setSize(1920, 1080);
            mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mainframe.setLocationRelativeTo(null);
            mainframe.setVisible(true);
        });
    } 
}
