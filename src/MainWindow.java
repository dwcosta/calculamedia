import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;

public class MainWindow extends JFrame {

	private JPanel contentPane;
	private JTextField tfp1;
	private JTextField tfp2;
	private JTextField tft;
	private JButton btncalc;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public MainWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 463, 280);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMdiaFinal = new JLabel("M\u00E9dia Final");
		lblMdiaFinal.setHorizontalAlignment(SwingConstants.CENTER);
		lblMdiaFinal.setFont(new Font("Courier New", Font.PLAIN, 16));
		lblMdiaFinal.setBounds(281, 164, 110, 30);
		contentPane.add(lblMdiaFinal);
		
		JLabel lblmediafinal = new JLabel("0,0");
		lblmediafinal.setHorizontalAlignment(SwingConstants.CENTER);
		lblmediafinal.setFont(new Font("Courier New", Font.BOLD, 24));
		lblmediafinal.setBounds(294, 192, 85, 26);
		contentPane.add(lblmediafinal);
		
		JLabel lblSituao = new JLabel("Situa\u00E7\u00E3o");
		lblSituao.setHorizontalAlignment(SwingConstants.CENTER);
		lblSituao.setFont(new Font("Courier New", Font.PLAIN, 16));
		lblSituao.setBounds(281, 50, 110, 26);
		contentPane.add(lblSituao);
		
		JLabel lblsituacao = new JLabel("");
		lblsituacao.setHorizontalAlignment(SwingConstants.CENTER);
		lblsituacao.setFont(new Font("Courier New", Font.BOLD, 24));
		lblsituacao.setBounds(235, 87, 202, 30);
		contentPane.add(lblsituacao);
		
		JLabel iconrep = new JLabel("");
		iconrep.setIcon(new ImageIcon(MainWindow.class.getResource("/com/sun/javafx/scene/control/skin/caspian/dialog-warning.png")));
		iconrep.setBounds(314, 112, 46, 39);
		contentPane.add(iconrep);
		iconrep.setVisible(false);
		
		JLabel iconapr = new JLabel("");
		iconapr.setIcon(new ImageIcon(MainWindow.class.getResource("/com/sun/javafx/scene/control/skin/caspian/dialog-information.png")));
		iconapr.setBounds(314, 112, 46, 39);
		contentPane.add(iconapr);
		iconapr.setVisible(false);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnConfig = new JMenu("Op\u00E7\u00F5es");
		mnConfig.setFont(new Font("Courier New", Font.PLAIN, 12));
		menuBar.add(mnConfig);
		
		JMenuItem mntmNovo = new JMenuItem("Novo...");
		mntmNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfp1.setText("");
				tfp2.setText("");
				tft.setText("");
				lblsituacao.setText("");
				lblmediafinal.setText("0,0");
				iconapr.setVisible(false);
				iconrep.setVisible(false);
			}
		});
		mnConfig.add(mntmNovo);
		
		JMenuItem mntmSobreOPrograma = new JMenuItem("Sobre o programa");
		mntmSobreOPrograma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,
					    "Cálculo de média final.\n\n"
					    + "Este simulador foi feito como trabalho de P.O.O. do 5o Semestre\n"
					    + "de Ciência da Computação da Faculdade de Americana (FAM)\n"
					    + "Jun/2018\n"
					    + "Professor Danilo Dionia\n"
					    + "\n"
					    + "Desenvolvedor:\n"
					    + "Douglas Wantuil da Costa - RA 20160040\n");
			}
		});
		mnConfig.add(mntmSobreOPrograma);
		mntmSobreOPrograma.setFont(new Font("Courier New", Font.PLAIN, 12));
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mntmSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mntmSair.setFont(new Font("Courier New", Font.PLAIN, 12));
		mnConfig.add(mntmSair);
		

		
		JLabel lblNewLabel = new JLabel("Calcula m\u00E9dia");
		lblNewLabel.setFont(new Font("Courier New", Font.BOLD, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 0, 427, 39);
		contentPane.add(lblNewLabel);
		
		JLabel lblNotaProva1 = new JLabel("Nota Prova 1");
		lblNotaProva1.setFont(new Font("Courier New", Font.PLAIN, 16));
		lblNotaProva1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNotaProva1.setBounds(10, 58, 127, 14);
		contentPane.add(lblNotaProva1);
		
		JLabel lblNotaProva2 = new JLabel("Nota Prova 2");
		lblNotaProva2.setFont(new Font("Courier New", Font.PLAIN, 16));
		lblNotaProva2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNotaProva2.setBounds(10, 89, 127, 14);
		contentPane.add(lblNotaProva2);
		
		JLabel lblNotaTrabalho = new JLabel("Nota Trabalho");
		lblNotaTrabalho.setFont(new Font("Courier New", Font.PLAIN, 16));
		lblNotaTrabalho.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNotaTrabalho.setBounds(0, 120, 137, 14);
		contentPane.add(lblNotaTrabalho);
		

		
		tfp1 = new JTextField();
		tfp1.setFont(new Font("Courier New", Font.PLAIN, 16));
		tfp1.setBounds(147, 50, 70, 30);
		contentPane.add(tfp1);
		tfp1.setColumns(10);
		tfp1.grabFocus();
		
		tfp2 = new JTextField();
		tfp2.setFont(new Font("Courier New", Font.PLAIN, 16));
		tfp2.setColumns(10);
		tfp2.setBounds(147, 81, 70, 30);
		contentPane.add(tfp2);
		
		tft = new JTextField();
		tft.setFont(new Font("Courier New", Font.PLAIN, 16));
		tft.setColumns(10);
		tft.setBounds(147, 112, 70, 30);
		contentPane.add(tft);
		
		btncalc = new JButton("Calcular");
		btncalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
				
					String vp1v,vp2v,vtv;
					vp1v = tfp1.getText();
					vp1v = vp1v.replace(',','.');
					vp2v = tfp2.getText();
					vp2v = vp2v.replace(',','.');
					vtv = tft.getText();
					vtv = vtv.replace(',','.');
					float fp1, fp2, ft;
					fp1=Float.valueOf(vp1v);
					fp2=Float.valueOf(vp2v);
					ft=Float.valueOf(vtv);

					if((fp1 < 0) || (fp2 < 0) || (ft < 0) || (fp1 > 10) || (fp2 > 10) || (ft > 10) ) {
						JOptionPane.showMessageDialog(new JFrame(), "Os numeros digitados devem estar entre 0 e 10","Erro",JOptionPane.ERROR_MESSAGE);
					} else {
						Notas nota = new Notas();
						nota.setP1(Float.valueOf(vp1v));
						nota.setP2(Float.valueOf(vp2v));
						nota.setT1(Float.valueOf(vtv));
						nota.setMedia(fp1,fp2,ft);
						lblmediafinal.setText(String.format("%,.2f", nota.getMedia()));
						if (nota.getMedia() >= 6) {
							lblsituacao.setText("Aprovado");
							iconrep.setVisible(false);
							iconapr.setVisible(true);
						} else {
							lblsituacao.setText("Recuperação");
							iconrep.setVisible(true);
							iconapr.setVisible(false);
						}
					}
					
				}catch (NumberFormatException e){
					JOptionPane.showMessageDialog(new JFrame(), "Houve algum erro. Possiveis causas: \n\n"
							+ "- Algum valor em branco,\n"
							+ "- Letras ou caracteres especiais ao invés de números.\n"
							, "Erro",JOptionPane.ERROR_MESSAGE);
				}
			}
			});
			btncalc.setFont(new Font("Courier New", Font.BOLD, 16));
			btncalc.setBounds(48, 163, 149, 51);
			contentPane.add(btncalc);

	}
}
