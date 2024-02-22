package homepage;
 
import java.awt.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.synth.Region;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Map;
import homepage.ArrayComponents.ArrayComponent;
import java.util.logging.LogRecord;

import javafx.scene.layout.Border;

public class HomePage extends JFrame {
    private JLabel Logo;
    public JLabel LogIn;
    public JLabel Register;
    
    private JLabel component;
    private JLabel selection;
    private JLabel amount;
    private JLabel Location;
    private JLabel Tax;
    private JLabel Price;
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

    public JSpinner gpuSpinner;
    public JSpinner psuSpinner;
    public JTextField fanJField;
    public JTextField motherboardJField;
    public JTextField storageJField;
    public JTextField cpuJField;
    public JTextField ramJField;
    public JTextField caseJField;

    public JComboBox<String> gpuBox;
    public JComboBox<String> psuBox;
    public JComboBox<String> fanBox;
    public JComboBox<String> motherBBox;
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
        LogIn = new JLabel("LogIn");
        LogIn.setForeground(Color.WHITE);
        Register = new JLabel("Register");
        Register.setForeground(Color.WHITE);

        RIGHT_Log_Reg_Panel.add(LogIn);
        RIGHT_Log_Reg_Panel.add(Register);

        JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT, 100,10));
        p1.setBackground(Color.decode("#191B1B"));
        component = new JLabel("Component");
        selection = new JLabel("                                                                                Selection");
        amount = new JLabel("                    Amount");
        Location = new JLabel("Location");
        Tax = new JLabel("Tax");
        Price = new JLabel("Price");

        component.setForeground(Color.WHITE);
        selection.setForeground(Color.WHITE);
        amount.setForeground(Color.WHITE);
        Location.setForeground(Color.WHITE);
        Tax.setForeground(Color.WHITE);
        Price.setForeground(Color.WHITE);

        p1.add(component);
        p1.add(selection);
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

        //Regions
        String[] gpuRegionArray = ArrayComponent.getGPURegionArray();
        String[] psuRegionArray = ArrayComponent.getPSURegionArray();
        String[] FANregionArray = {" ", "Region4a", "Region4B"};
        String[] MotherBoardregionArray = {" ", "Region4a", "Region4B"};
        String[] STORAGEregionArray = {" ", "Region4a", "Region4B"};
        String[] CPUregionArray = {" ", "Region4a", "Region4B"};
        String[] RAMregionArray = {" ", "Region4a", "Region4B"};
        String[] CASEregionArray = {" ", "Region4a", "Region4B"};

        gpuPrices = ArrayComponent.getGPUPrices();
        psuPrices = ArrayComponent.getPSUPrices();

        //New object JSpinner
        

        GPU = new JLabel("GPU");
        gpuBox = new JComboBox<>(gpuArray);
        SpinnerNumberModel GPUspinnerModel = new SpinnerNumberModel(0, 0, 100, 1);
        gpuSpinner = new JSpinner(GPUspinnerModel);
        JSpinner.NumberEditor GPUeditor = new JSpinner.NumberEditor(gpuSpinner, "0");
        gpuSpinner.setEditor(GPUeditor);
        GPURegionBox = new JComboBox<>(gpuRegionArray);
        GPUprice = new JLabel(""+ gpuPrices.get(gpuArray[0]));
        GPUtax = new JLabel("Tax++++++");
        GPUShippingFee = new JLabel("Shipping fee++++++");

        PSU = new JLabel("PSU");
        psuBox = new JComboBox<>(psuArray);
        SpinnerNumberModel PSUspinnerModel = new SpinnerNumberModel(0, 0, 100,1);
        psuSpinner = new JSpinner(PSUspinnerModel);
        JSpinner.NumberEditor psueditor = new JSpinner.NumberEditor(psuSpinner, "0");
        psuSpinner.setEditor(psueditor);
        PSURegionBox = new JComboBox<>(psuRegionArray);
        PSUprice = new JLabel(""+ psuPrices);
        PSUtax = new JLabel("++++++");
        PSUShippingFee = new JLabel("Shipping fee++++++");

        Fan = new JLabel("Fan");
        fanBox = new JComboBox<>(fanArray);
        fanJField = new JTextField("");
        fanJField.setHorizontalAlignment(SwingConstants.CENTER);
        FANRegionBox = new JComboBox<>(FANregionArray);
        FANprice = new JLabel("++++++");
        FANtax = new JLabel("++++++");
        FANShippingFee = new JLabel("Shipping fee++++++");

        Motherboard = new JLabel("MotherBoard");
        motherBBox = new JComboBox<>(motherBArray);
        motherboardJField = new JTextField("");
        motherboardJField.setHorizontalAlignment(SwingConstants.CENTER);
        MotherBoardRegionBox = new JComboBox<>(MotherBoardregionArray);
        MotherBoardprice = new JLabel("++++++");
        MotherBoardtax = new JLabel("++++++");
        MotherBoardShippingFee = new JLabel("Shipping fee++++++");

        Storage = new JLabel("Storage");
        storageBox = new JComboBox<>(storageArray);
        storageJField = new JTextField("");
        storageJField.setHorizontalAlignment(SwingConstants.CENTER);
        STORAGERegionBox = new JComboBox<>(STORAGEregionArray);
        STORAGEprice = new JLabel("++++++");
        STORAGEtax = new JLabel("++++++");
        STORAGEShippingFee = new JLabel("Shipping fee++++++");

        CPU = new JLabel("CPU");
        cpuBox = new JComboBox<>(cpuArray);
        cpuJField = new JTextField("");
        cpuJField.setHorizontalAlignment(SwingConstants.CENTER);
        CPURegionBox = new JComboBox<>(CPUregionArray);
        CPUprice = new JLabel("++++++");
        CPUtax = new JLabel("++++++");
        CPUShippingFee = new JLabel("Shipping fee++++++");

        Ram = new JLabel("Ram");
        ramBox = new JComboBox<>(ramArray);
        ramJField = new JTextField("");
        ramJField.setHorizontalAlignment(SwingConstants.CENTER);
        RAMRegionBox = new JComboBox<>(RAMregionArray);
        RAMprice = new JLabel("++++++");
        RAMtax = new JLabel("++++++");
        RAMShippingFee = new JLabel("Shipping fee++++++");

        Case = new JLabel("Case");
        caseBox = new JComboBox<>(caseArray);
        caseJField = new JTextField("");
        caseJField.setHorizontalAlignment(SwingConstants.CENTER);
        CASERegionBox = new JComboBox<>(CASEregionArray);
        CASEprice = new JLabel("++++++");
        CASEtax = new JLabel("++++++");
        CASEShippingFee = new JLabel("Shipping fee++++++");

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
        p2.add(fanJField);
        p2.add(FANRegionBox);
        p2.add(FANprice);
        p2.add(FANtax);
        p2.add(FANShippingFee);

        p2.add(Motherboard);
        p2.add(motherBBox);
        p2.add(motherboardJField);
        p2.add(MotherBoardRegionBox);
        p2.add(MotherBoardprice);
        p2.add(MotherBoardtax);
        p2.add(MotherBoardShippingFee);

        p2.add(Storage);
        p2.add(storageBox);
        p2.add(storageJField);
        p2.add(STORAGERegionBox);
        p2.add(STORAGEprice);
        p2.add(STORAGEtax);
        p2.add(STORAGEShippingFee);

        p2.add(CPU);
        p2.add(cpuBox);
        p2.add(cpuJField);
        p2.add(CPURegionBox);
        p2.add(CPUprice);
        p2.add(CPUtax);
        p2.add(CPUShippingFee);

        p2.add(Ram);
        p2.add(ramBox);
        p2.add(ramJField);
        p2.add(RAMRegionBox);
        p2.add(RAMprice);
        p2.add(RAMtax);
        p2.add(RAMShippingFee);

        p2.add(Case);
        p2.add(caseBox);
        p2.add(caseJField);
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

          // Add a ChangeListener to the JSpinner to update the JLabel when the value changes
          gpuSpinner.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                updateGPUPrice();
            }
        });

        // Add an ItemListener to the JComboBox to update the JLabel when a GPU is selected
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
            }
        });

    }

    // Update the GPU price based on the selected GPU and spinner value
    private void updateGPUPrice() {
        String selectedGPU = (String) gpuBox.getSelectedItem();
        double selectedGPUPrice = gpuPrices.get(selectedGPU);
        int spinnerValue = (int) gpuSpinner.getValue();

        double totalPrice = selectedGPUPrice * spinnerValue;
        GPUprice.setText("" + totalPrice);
    }

    // Update the GPU price based on the selected GPU and spinner value
    private void updatePSUPrice() {
        String selectedPSU = (String) psuBox.getSelectedItem();
        double selectedPSUPrice = psuPrices.get(selectedPSU);
        int spinnerValue = (int) psuSpinner.getValue();

        double totalPrice = selectedPSUPrice * spinnerValue;
        PSUprice.setText("" + totalPrice);
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