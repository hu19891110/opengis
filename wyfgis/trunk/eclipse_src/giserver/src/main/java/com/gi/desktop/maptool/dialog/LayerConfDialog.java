package com.gi.desktop.maptool.dialog;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.filechooser.FileFilter;

import org.geotools.data.DataStore;
import org.geotools.data.FeatureSource;
import org.opengis.feature.simple.SimpleFeature;
import org.opengis.feature.simple.SimpleFeatureType;

import com.gi.desktop.maptool.MapToolApp;
import com.gi.engine.carto.LayerInfo;
import com.gi.engine.datasource.DataStoreFactory;
import com.gi.engine.datasource.GridCoverage2DReaderFactory;
import com.gi.engine.util.common.PathUtil;

/**
 * This code was edited or generated using CloudGarden's Jigloo SWT/Swing GUI
 * Builder, which is free for non-commercial use. If Jigloo is being used
 * commercially (ie, by a corporation, company or business for any purpose
 * whatever) then you should purchase a license for each developer using Jigloo.
 * Please visit www.cloudgarden.com for details. Use of Jigloo implies
 * acceptance of these licensing terms. A COMMERCIAL LICENSE HAS NOT BEEN
 * PURCHASED FOR THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED LEGALLY FOR
 * ANY CORPORATE OR COMMERCIAL PURPOSE.
 */
public class LayerConfDialog extends javax.swing.JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8245888082871162071L;
	private JPanel jPanel1;
	private JButton jButtonCancel;
	private JTextField jTextFieldName;
	private JTextField jTextFieldPostgisDatabase;
	private JButton jButtonPostgisListLayers;
	private JList jListPostgisLayers;
	private JTextField jTextFieldPostgisSchema;
	private JLabel jLabelPostgisSchema;
	private JLabel jLabelPostgisDatabase;
	private JPasswordField jPasswordFieldPostgisPasswd;
	private JLabel jLabelPostgisPasswd;
	private JTextField jTextFieldPostgisUser;
	private JLabel jLabelPostgisUser;
	private JTextField jTextFieldPostgisPort;
	private JLabel jLabelPostgisPort;
	private JTextField jTextFieldPostgisHost;
	private JLabel jLabelPostgisHost;

	private JTextField jTextFieldMysqlDatabase;
	private JButton jButtonMysqlListLayers;
	private JList jListMysqlLayers;
	private JLabel jLabelMysqlDatabase;
	private JPasswordField jPasswordFieldMysqlPasswd;
	private JLabel jLabelMysqlPasswd;
	private JTextField jTextFieldMysqlUser;
	private JLabel jLabelMysqlUser;
	private JTextField jTextFieldMysqlPort;
	private JLabel jLabelMysqlPort;
	private JTextField jTextFieldMysqlHost;
	private JLabel jLabelMysqlHost;

	private JTextField jTextFieldArcsdeInstance;
	private JButton jButtonArcsdeListLayers;
	private JList jListArcsdeLayers;
	private JLabel jLabelArcsdeInstance;
	private JPasswordField jPasswordFieldArcsdePasswd;
	private JLabel jLabelArcsdePasswd;
	private JTextField jTextFieldArcsdeUser;
	private JLabel jLabelArcsdeUser;
	private JTextField jTextFieldArcsdePort;
	private JLabel jLabelArcsdePort;
	private JTextField jTextFieldArcsdeHost;
	private JLabel jLabelArcsdeHost;

	private JTextField jTextFieldOracleInstance;
	private JButton jButtonOracleListLayers;
	private JList jListOracleLayers;
	private JLabel jLabelOracleInstance;
	private JPasswordField jPasswordFieldOraclePasswd;
	private JLabel jLabelOraclePasswd;
	private JTextField jTextFieldOracleUser;
	private JLabel jLabelOracleUser;
	private JTextField jTextFieldOraclePort;
	private JLabel jLabelOraclePort;
	private JTextField jTextFieldOracleHost;
	private JLabel jLabelOracleHost;
	private JTextField jTextFieldFileCharset;
	private JLabel jLabel2;
	private JScrollPane jScrollPane5;
	private JScrollPane jScrollPane4;
	private JScrollPane jScrollPane3;
	private JScrollPane jScrollPane2;
	private JScrollPane jScrollPane1;
	private JLabel jLabel1;
	private JTextField jTextFieldOracleLayer;
	private JTextField jTextFieldArcsdeLayer;
	private JTextField jTextFieldMysqlLayer;
	private JTextField jTextFieldPostgisLayer;
	private JTextField jTextFieldWfsLayer;

	private JList jListWfsLayers;
	private JTextField jTextFieldFilePath;
	private JButton jButtonWfsListLayers;
	private JTextField jTextFieldWfsUrl;
	private JLabel jLabelWfsUrl;
	private JButton jButtonFileBrowse;
	private JButton jButtonDataSourceTest;
	private JButton jButtonStyle;
	private JTextField jTextFieldStyleFilePath;
	private JLabel jLabelStyle;
	private JPanel jPanelOracle;
	private JPanel jPanelArcSDE;
	private JPanel jPanelMySQL;
	private JPanel jPanelPostGIS;
	private JPanel jPanelWFS;
	private JPanel jPanelFile;
	private JTabbedPane jTabbedPaneDataSource;
	private JLabel jLabelDataSource;
	private JCheckBox jCheckBoxEditable;
	private JCheckBox jCheckBoxVisible;
	private JLabel jLabelName;
	private JPanel jPanel2;
	private JButton jButtonOK;

	private JFileChooser jFileChooserOpenFile;
	private JFileChooser jFileChooserOpenStyleFile;

	private MapConfDialog mapConfDialog;
	private LayerInfo layerInfo;

	public LayerConfDialog(MapConfDialog mapConfDialog) {
		super((JFrame) mapConfDialog.getParent());
		this.mapConfDialog = mapConfDialog;
		initGUI();
	}

	private void initGUI() {
		try {
			setTitle("Configure Layer");
			setResizable(false);
			{
				jPanel1 = new JPanel();
				getContentPane().add(jPanel1, BorderLayout.SOUTH);
				jPanel1.setPreferredSize(new java.awt.Dimension(537, 43));
				{
					jButtonOK = new JButton();
					jPanel1.add(jButtonOK);
					jButtonOK.setText("OK");
					jButtonOK.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							jButtonOKActionPerformed(evt);
						}
					});
				}
				{
					jButtonCancel = new JButton();
					jPanel1.add(jButtonCancel);
					jButtonCancel.setText("Cancel");
					jButtonCancel.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							jButtonCancelActionPerformed(evt);
						}
					});
				}
			}
			{
				jPanel2 = new JPanel();
				getContentPane().add(jPanel2, BorderLayout.CENTER);
				jPanel2.setLayout(null);
				jPanel2.setPreferredSize(new java.awt.Dimension(648, 554));
				{
					jLabelName = new JLabel();
					jPanel2.add(jLabelName);
					jLabelName.setText("Name:");
					jLabelName.setBounds(12, 5, 58, 43);
				}
				{
					jTextFieldName = new JTextField();
					jPanel2.add(jTextFieldName);
					jTextFieldName.setBounds(70, 12, 265, 29);
				}
				{
					jCheckBoxVisible = new JCheckBox();
					jPanel2.add(jCheckBoxVisible);
					jCheckBoxVisible.setText("Visible");
					jCheckBoxVisible.setBounds(12, 52, 67, 26);
					jCheckBoxVisible.setSelected(true);
				}
				{
					jCheckBoxEditable = new JCheckBox();
					jPanel2.add(jCheckBoxEditable);
					jCheckBoxEditable.setText("Editable");
					jCheckBoxEditable.setBounds(119, 52, 79, 26);
				}
				{
					jLabelDataSource = new JLabel();
					jPanel2.add(jLabelDataSource);
					jLabelDataSource.setText("Data Source:");
					jLabelDataSource.setBounds(12, 87, 107, 43);
				}
				{
					jTabbedPaneDataSource = new JTabbedPane();
					jPanel2.add(jTabbedPaneDataSource);
					jTabbedPaneDataSource.setBounds(12, 130, 582, 354);
					jTabbedPaneDataSource.setTabPlacement(JTabbedPane.LEFT);
					{
						jPanelFile = new JPanel();
						jTabbedPaneDataSource.addTab("File", null, jPanelFile,
								null);
						jPanelFile.setLayout(null);
						jPanelFile.setName("File");
						{
							jTextFieldFilePath = new JTextField();
							jPanelFile.add(jTextFieldFilePath);
							jTextFieldFilePath.setBounds(12, 6, 354, 29);
						}
						{
							jButtonFileBrowse = new JButton();
							jPanelFile.add(jButtonFileBrowse);
							jPanelFile.add(getJLabel2());
							jPanelFile.add(getJTextFieldFileCharset());
							jButtonFileBrowse.setText("Browse");
							jButtonFileBrowse.setBounds(378, 6, 69, 29);
							jButtonFileBrowse
									.addActionListener(new ActionListener() {
										public void actionPerformed(
												ActionEvent evt) {
											jButtonFileBrowseActionPerformed(evt);
										}
									});
						}
					}
					{
						jPanelWFS = new JPanel();
						jTabbedPaneDataSource.addTab("WFS", null, jPanelWFS,
								null);
						jPanelWFS.setLayout(null);
						jPanelWFS.setName("WFS");
						{
							jLabelWfsUrl = new JLabel();
							jPanelWFS.add(jLabelWfsUrl);
							jLabelWfsUrl.setText("URL:");
							jLabelWfsUrl.setBounds(12, 12, 53, 22);
						}
						{
							jTextFieldWfsUrl = new JTextField();
							jPanelWFS.add(jTextFieldWfsUrl);
							jTextFieldWfsUrl.setBounds(65, 9, 427, 29);
						}
						{
							jButtonWfsListLayers = new JButton();
							jPanelWFS.add(jButtonWfsListLayers);
							jPanelWFS.add(getJTextFieldWfsLayer());
							jPanelWFS.add(getJScrollPane1());
							jButtonWfsListLayers.setText("List Layers");
							jButtonWfsListLayers.setBounds(12, 50, 141, 29);
							jButtonWfsListLayers
									.addActionListener(new ActionListener() {
										public void actionPerformed(
												ActionEvent evt) {
											jButtonWfsListLayersActionPerformed(evt);
										}
									});
						}
					}
					{
						jPanelPostGIS = new JPanel();
						jTabbedPaneDataSource.addTab("PostGIS", null,
								jPanelPostGIS, null);
						jPanelPostGIS.setLayout(null);
						jPanelPostGIS.setName("PostGIS");
						{
							jLabelPostgisHost = new JLabel();
							jPanelPostGIS.add(jLabelPostgisHost);
							jLabelPostgisHost.setText("Host:");
							jLabelPostgisHost.setBounds(12, 12, 39, 22);
						}
						{
							jTextFieldPostgisHost = new JTextField();
							jPanelPostGIS.add(jTextFieldPostgisHost);
							jTextFieldPostgisHost.setText("localhost");
							jTextFieldPostgisHost.setBounds(63, 9, 188, 29);
						}
						{
							jLabelPostgisPort = new JLabel();
							jPanelPostGIS.add(jLabelPostgisPort);
							jLabelPostgisPort.setText("Port:");
							jLabelPostgisPort.setBounds(301, 12, 36, 22);
						}
						{
							jTextFieldPostgisPort = new JTextField();
							jPanelPostGIS.add(jTextFieldPostgisPort);
							jTextFieldPostgisPort.setText("5432");
							jTextFieldPostgisPort.setBounds(349, 9, 63, 29);
						}
						{
							jLabelPostgisUser = new JLabel();
							jPanelPostGIS.add(jLabelPostgisUser);
							jLabelPostgisUser.setText("User:");
							jLabelPostgisUser.setBounds(12, 50, 38, 22);
						}
						{
							jTextFieldPostgisUser = new JTextField();
							jPanelPostGIS.add(jTextFieldPostgisUser);
							jTextFieldPostgisUser.setText("postgres");
							jTextFieldPostgisUser.setBounds(62, 47, 91, 29);
						}
						{
							jLabelPostgisPasswd = new JLabel();
							jPanelPostGIS.add(jLabelPostgisPasswd);
							jLabelPostgisPasswd.setText("Password:");
							jLabelPostgisPasswd.setBounds(212, 50, 76, 22);
						}
						{
							jPasswordFieldPostgisPasswd = new JPasswordField();
							jPanelPostGIS.add(jPasswordFieldPostgisPasswd);
							jPasswordFieldPostgisPasswd.setBounds(300, 47, 192,
									29);
						}
						{
							jLabelPostgisDatabase = new JLabel();
							jPanelPostGIS.add(jLabelPostgisDatabase);
							jLabelPostgisDatabase.setText("Database:");
							jLabelPostgisDatabase.setBounds(12, 88, 75, 22);
						}
						{
							jTextFieldPostgisDatabase = new JTextField();
							jPanelPostGIS.add(jTextFieldPostgisDatabase);
							jTextFieldPostgisDatabase
									.setBounds(99, 85, 119, 29);
						}
						{
							jLabelPostgisSchema = new JLabel();
							jPanelPostGIS.add(jLabelPostgisSchema);
							jLabelPostgisSchema.setText("Schema:");
							jLabelPostgisSchema.setBounds(257, 88, 64, 22);
						}
						{
							jTextFieldPostgisSchema = new JTextField();
							jPanelPostGIS.add(jTextFieldPostgisSchema);
							jTextFieldPostgisSchema.setBounds(333, 85, 132, 29);
						}
						{
							jButtonPostgisListLayers = new JButton();
							jPanelPostGIS.add(jButtonPostgisListLayers);
							jPanelPostGIS.add(getJTextFieldPostgisLayer());
							jPanelPostGIS.add(getJScrollPane2());
							jButtonPostgisListLayers.setText("List Layers");
							jButtonPostgisListLayers
									.setBounds(12, 127, 141, 29);
							jButtonPostgisListLayers
									.addActionListener(new ActionListener() {
										public void actionPerformed(
												ActionEvent evt) {
											jButtonPostgisListLayersActionPerformed(evt);
										}
									});
						}
					}
					{
						jPanelMySQL = new JPanel();
						jTabbedPaneDataSource.addTab("MySQL", null,
								jPanelMySQL, null);
						jPanelMySQL.setLayout(null);
						jPanelMySQL.setName("MySQL");
						{
							jLabelMysqlHost = new JLabel();
							jPanelMySQL.add(jLabelMysqlHost);
							jLabelMysqlHost.setText("Host:");
							jLabelMysqlHost.setBounds(12, 12, 39, 22);
						}
						{
							jTextFieldMysqlHost = new JTextField();
							jPanelMySQL.add(jTextFieldMysqlHost);
							jTextFieldMysqlHost.setText("localhost");
							jTextFieldMysqlHost.setBounds(63, 9, 188, 29);
						}
						{
							jLabelMysqlPort = new JLabel();
							jPanelMySQL.add(jLabelMysqlPort);
							jLabelMysqlPort.setText("Port:");
							jLabelMysqlPort.setBounds(301, 12, 36, 22);
						}
						{
							jTextFieldMysqlPort = new JTextField();
							jPanelMySQL.add(jTextFieldMysqlPort);
							jTextFieldMysqlPort.setText("3306");
							jTextFieldMysqlPort.setBounds(349, 9, 63, 29);
						}
						{
							jLabelMysqlUser = new JLabel();
							jPanelMySQL.add(jLabelMysqlUser);
							jLabelMysqlUser.setText("User:");
							jLabelMysqlUser.setBounds(12, 50, 38, 22);
						}
						{
							jTextFieldMysqlUser = new JTextField();
							jPanelMySQL.add(jTextFieldMysqlUser);
							jTextFieldMysqlUser.setText("root");
							jTextFieldMysqlUser.setBounds(62, 47, 91, 29);
						}
						{
							jLabelMysqlPasswd = new JLabel();
							jPanelMySQL.add(jLabelMysqlPasswd);
							jLabelMysqlPasswd.setText("Password:");
							jLabelMysqlPasswd.setBounds(212, 50, 76, 22);
						}
						{
							jPasswordFieldMysqlPasswd = new JPasswordField();
							jPanelMySQL.add(jPasswordFieldMysqlPasswd);
							jPasswordFieldMysqlPasswd.setBounds(300, 47, 192,
									29);
						}
						{
							jLabelMysqlDatabase = new JLabel();
							jPanelMySQL.add(jLabelMysqlDatabase);
							jLabelMysqlDatabase.setText("Database:");
							jLabelMysqlDatabase.setBounds(12, 88, 75, 22);
						}
						{
							jTextFieldMysqlDatabase = new JTextField();
							jPanelMySQL.add(jTextFieldMysqlDatabase);
							jTextFieldMysqlDatabase.setBounds(99, 85, 119, 29);
						}
						{
							jButtonMysqlListLayers = new JButton();
							jPanelMySQL.add(jButtonMysqlListLayers);
							jPanelMySQL.add(getJTextFieldMysqlLayer());
							jPanelMySQL.add(getJScrollPane3());
							jButtonMysqlListLayers.setText("List Layers");
							jButtonMysqlListLayers.setBounds(12, 127, 141, 29);
							jButtonMysqlListLayers
									.addActionListener(new ActionListener() {
										public void actionPerformed(
												ActionEvent evt) {
											jButtonMysqlListLayersActionPerformed(evt);
										}
									});
						}
					}
					{
						jPanelArcSDE = new JPanel();
						jTabbedPaneDataSource.addTab("ArcSDE", null,
								jPanelArcSDE, null);
						jPanelArcSDE.setLayout(null);
						jPanelArcSDE.setBounds(84, -2, 504, 349);
						jPanelArcSDE.setName("ArcSDE");
						{
							jLabelArcsdeHost = new JLabel();
							jPanelArcSDE.add(jLabelArcsdeHost);
							jLabelArcsdeHost.setText("Host:");
							jLabelArcsdeHost.setBounds(12, 12, 39, 22);
						}
						{
							jTextFieldArcsdeHost = new JTextField();
							jPanelArcSDE.add(jTextFieldArcsdeHost);
							jTextFieldArcsdeHost.setText("localhost");
							jTextFieldArcsdeHost.setBounds(63, 9, 188, 29);
						}
						{
							jLabelArcsdePort = new JLabel();
							jPanelArcSDE.add(jLabelArcsdePort);
							jLabelArcsdePort.setText("Port:");
							jLabelArcsdePort.setBounds(301, 12, 36, 22);
						}
						{
							jTextFieldArcsdePort = new JTextField();
							jPanelArcSDE.add(jTextFieldArcsdePort);
							jTextFieldArcsdePort.setText("5151");
							jTextFieldArcsdePort.setBounds(349, 9, 63, 29);
						}
						{
							jLabelArcsdeUser = new JLabel();
							jPanelArcSDE.add(jLabelArcsdeUser);
							jLabelArcsdeUser.setText("User:");
							jLabelArcsdeUser.setBounds(12, 50, 38, 22);
						}
						{
							jTextFieldArcsdeUser = new JTextField();
							jPanelArcSDE.add(jTextFieldArcsdeUser);
							jTextFieldArcsdeUser.setText("sde");
							jTextFieldArcsdeUser.setBounds(62, 47, 91, 29);
						}
						{
							jLabelArcsdePasswd = new JLabel();
							jPanelArcSDE.add(jLabelArcsdePasswd);
							jLabelArcsdePasswd.setText("Password:");
							jLabelArcsdePasswd.setBounds(212, 50, 76, 22);
						}
						{
							jPasswordFieldArcsdePasswd = new JPasswordField();
							jPanelArcSDE.add(jPasswordFieldArcsdePasswd);
							jPasswordFieldArcsdePasswd.setBounds(300, 47, 192,
									29);
						}
						{
							jLabelArcsdeInstance = new JLabel();
							jPanelArcSDE.add(jLabelArcsdeInstance);
							jLabelArcsdeInstance.setText("Instance:");
							jLabelArcsdeInstance.setBounds(12, 88, 75, 22);
						}
						{
							jTextFieldArcsdeInstance = new JTextField();
							jPanelArcSDE.add(jTextFieldArcsdeInstance);
							jTextFieldArcsdeInstance.setBounds(99, 85, 119, 29);
							jTextFieldArcsdeInstance.setText("sde");
						}
						{
							jButtonArcsdeListLayers = new JButton();
							jPanelArcSDE.add(jButtonArcsdeListLayers);
							jPanelArcSDE.add(getJTextFieldArcsdeLayer());
							jPanelArcSDE.add(getJScrollPane4());
							jButtonArcsdeListLayers.setText("List Layers");
							jButtonArcsdeListLayers.setBounds(12, 127, 141, 29);
							jButtonArcsdeListLayers
									.addActionListener(new ActionListener() {
										public void actionPerformed(
												ActionEvent evt) {
											jButtonArcsdeListLayersActionPerformed(evt);
										}
									});
						}
					}
					{
						jPanelOracle = new JPanel();
						jTabbedPaneDataSource.addTab("Oracle", null,
								jPanelOracle, null);
						jPanelOracle.setLayout(null);
						jPanelOracle.setBounds(84, -2, 504, 349);
						jPanelOracle.setName("Oracle");
						{
							jLabelOracleHost = new JLabel();
							jPanelOracle.add(jLabelOracleHost);
							jLabelOracleHost.setText("Host:");
							jLabelOracleHost.setBounds(12, 12, 39, 22);
						}
						{
							jTextFieldOracleHost = new JTextField();
							jPanelOracle.add(jTextFieldOracleHost);
							jTextFieldOracleHost.setText("localhost");
							jTextFieldOracleHost.setBounds(63, 9, 188, 29);
						}
						{
							jLabelOraclePort = new JLabel();
							jPanelOracle.add(jLabelOraclePort);
							jLabelOraclePort.setText("Port:");
							jLabelOraclePort.setBounds(301, 12, 36, 22);
						}
						{
							jTextFieldOraclePort = new JTextField();
							jPanelOracle.add(jTextFieldOraclePort);
							jTextFieldOraclePort.setText("1521");
							jTextFieldOraclePort.setBounds(349, 9, 63, 29);
						}
						{
							jLabelOracleUser = new JLabel();
							jPanelOracle.add(jLabelOracleUser);
							jLabelOracleUser.setText("User:");
							jLabelOracleUser.setBounds(12, 50, 38, 22);
						}
						{
							jTextFieldOracleUser = new JTextField();
							jPanelOracle.add(jTextFieldOracleUser);
							jTextFieldOracleUser.setText("");
							jTextFieldOracleUser.setBounds(62, 47, 91, 29);
						}
						{
							jLabelOraclePasswd = new JLabel();
							jPanelOracle.add(jLabelOraclePasswd);
							jLabelOraclePasswd.setText("Password:");
							jLabelOraclePasswd.setBounds(212, 50, 76, 22);
						}
						{
							jPasswordFieldOraclePasswd = new JPasswordField();
							jPanelOracle.add(jPasswordFieldOraclePasswd);
							jPasswordFieldOraclePasswd.setBounds(300, 47, 192,
									29);
						}
						{
							jLabelOracleInstance = new JLabel();
							jPanelOracle.add(jLabelOracleInstance);
							jLabelOracleInstance.setText("Instance:");
							jLabelOracleInstance.setBounds(12, 88, 75, 22);
						}
						{
							jTextFieldOracleInstance = new JTextField();
							jPanelOracle.add(jTextFieldOracleInstance);
							jTextFieldOracleInstance.setBounds(99, 85, 119, 29);
							jTextFieldOracleInstance.setText("ORCL");
						}
						{
							jButtonOracleListLayers = new JButton();
							jPanelOracle.add(jButtonOracleListLayers);
							jPanelOracle.add(getJTextFieldOracleLayer());
							jPanelOracle.add(getJScrollPane5());
							jButtonOracleListLayers.setText("List Layers");
							jButtonOracleListLayers.setBounds(12, 127, 141, 29);
							jButtonOracleListLayers
									.addActionListener(new ActionListener() {
										public void actionPerformed(
												ActionEvent evt) {
											jButtonOracleListLayersActionPerformed(evt);
										}
									});
						}
					}
				}
				{
					jLabelStyle = new JLabel();
					jPanel2.add(jLabelStyle);
					jLabelStyle.setText("Style:");
					jLabelStyle.setBounds(12, 504, 48, 22);
				}
				{
					jTextFieldStyleFilePath = new JTextField();
					jPanel2.add(jTextFieldStyleFilePath);
					jTextFieldStyleFilePath.setBounds(60, 501, 459, 29);
				}
				{
					jButtonStyle = new JButton();
					jPanel2.add(jButtonStyle);
					jButtonStyle.setText("Browse");
					jButtonStyle.setBounds(525, 501, 69, 29);
					jButtonStyle.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							jButtonStyleActionPerformed(evt);
						}
					});
				}
				{
					jButtonDataSourceTest = new JButton();
					jPanel2.add(jButtonDataSourceTest);
					jPanel2.add(getJLabel1());
					jButtonDataSourceTest.setText("Test Data Source");
					jButtonDataSourceTest.setBounds(131, 94, 167, 29);
					jButtonDataSourceTest
							.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent evt) {
									jButtonDataSourceTestActionPerformed(evt);
								}
							});
				}
			}
			pack();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void setLayerInfo(LayerInfo layerInfo) {
		this.layerInfo = layerInfo;

		if (layerInfo == null) {
			// Add Layer
			jTextFieldName.setText("");
			jTextFieldStyleFilePath.setText("");
			jCheckBoxVisible.setSelected(true);
			jCheckBoxEditable.setSelected(false);

			jTextFieldFilePath.setText("");
			jTextFieldFileCharset.setText("");
			jTextFieldWfsLayer.setText("");
			jListWfsLayers.clearSelection();
			jTextFieldPostgisLayer.setText("");
			jListPostgisLayers.clearSelection();
			jTextFieldMysqlLayer.setText("");
			jListMysqlLayers.clearSelection();
			jTextFieldArcsdeLayer.setText("");
			jListArcsdeLayers.clearSelection();
			jTextFieldOracleLayer.setText("");
			jListOracleLayers.clearSelection();
		} else {
			// Edit Layer
			jTextFieldName.setText(layerInfo.getName());
			jTextFieldStyleFilePath.setText(layerInfo.getStyle());
			jCheckBoxVisible.setSelected(layerInfo.isVisible());
			jCheckBoxEditable.setSelected(layerInfo.isEditable());
			setSelectedDataSourceType(layerInfo.getDataSourceType());
			setDataSource(layerInfo.getDataSourceType(), layerInfo
					.getDataSource());

			String charset = layerInfo.getCharset();
			if (charset != null) {
				jTextFieldFileCharset.setText(charset);
			}
		}
	}

	private void setSelectedDataSourceType(String dataSourceType) {
		String low = dataSourceType.toLowerCase();
		if (low.equals("file")) {
			jTabbedPaneDataSource.setSelectedComponent(jPanelFile);
		} else if (low.equals("wfs")) {
			jTabbedPaneDataSource.setSelectedComponent(jPanelWFS);
		} else if (low.equals("postgis")) {
			jTabbedPaneDataSource.setSelectedComponent(jPanelPostGIS);
		} else if (low.equals("mysql")) {
			jTabbedPaneDataSource.setSelectedComponent(jPanelMySQL);
		} else if (low.equals("arcsde")) {
			jTabbedPaneDataSource.setSelectedComponent(jPanelArcSDE);
		} else if (low.equals("oracle")) {
			jTabbedPaneDataSource.setSelectedComponent(jPanelOracle);
		}
	}

	private void setDataSource(String dataSourceType, String dataSource) {
		try {
			String low = dataSourceType.toLowerCase();
			String[] dss = dataSource.split(",");
			if (low.equals("file")) {
				jTextFieldFilePath.setText(dss[0]);
				if (dss.length > 1) {
					jTextFieldFileCharset.setText(dss[0]);
				}
			} else if (low.equals("wfs")) {
				jTextFieldWfsUrl.setText(dss[0]);
				jTextFieldWfsLayer.setText(dss[1]);
			} else if (low.equals("postgis")) {
				jTextFieldPostgisHost.setText(dss[0]);
				jTextFieldPostgisPort.setText(dss[1]);
				jTextFieldPostgisUser.setText(dss[2]);
				jPasswordFieldPostgisPasswd.setText(dss[3]);
				jTextFieldPostgisDatabase.setText(dss[4]);
				jTextFieldPostgisSchema.setText(dss[5]);
				jTextFieldPostgisLayer.setText(dss[6]);
			} else if (low.equals("mysql")) {
				jTextFieldMysqlHost.setText(dss[0]);
				jTextFieldMysqlPort.setText(dss[1]);
				jTextFieldMysqlUser.setText(dss[2]);
				jPasswordFieldMysqlPasswd.setText(dss[3]);
				jTextFieldMysqlDatabase.setText(dss[4]);
				jTextFieldMysqlLayer.setText(dss[5]);
			} else if (low.equals("arcsde")) {
				jTextFieldArcsdeHost.setText(dss[0]);
				jTextFieldArcsdePort.setText(dss[1]);
				jTextFieldArcsdeInstance.setText(dss[2]);
				jTextFieldArcsdeUser.setText(dss[3]);
				jPasswordFieldArcsdePasswd.setText(dss[4]);
				jTextFieldArcsdeLayer.setText(dss[5]);
			} else if (low.equals("oracle")) {
				jTextFieldOracleHost.setText(dss[0]);
				jTextFieldOraclePort.setText(dss[1]);
				jTextFieldOracleUser.setText(dss[2]);
				jPasswordFieldOraclePasswd.setText(dss[3]);
				jTextFieldOracleInstance.setText(dss[4]);
				jTextFieldOracleLayer.setText(dss[5]);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		/*
		 * (tabName.equals(this.jPanelOracle.getName())) { dataSource =
		 * jTextFieldOracleHost.getText() + "," + jTextFieldOraclePort.getText()
		 * + "," + jTextFieldOracleUser.getText() + "," +
		 * String.valueOf(jPasswordFieldOraclePasswd .getPassword()) + "," +
		 * jTextFieldOracleInstance.getText() + "," +
		 * String.valueOf(jListOracleLayers.getSelectedValue());
		 */

	}

	private JTextField getJTextFieldWfsLayer() {
		if (jTextFieldWfsLayer == null) {
			jTextFieldWfsLayer = new JTextField();
			jTextFieldWfsLayer.setBounds(164, 53, 328, 26);
			jTextFieldWfsLayer.setEditable(false);
		}
		return jTextFieldWfsLayer;
	}

	private JTextField getJTextFieldPostgisLayer() {
		if (jTextFieldPostgisLayer == null) {
			jTextFieldPostgisLayer = new JTextField();
			jTextFieldPostgisLayer.setBounds(164, 127, 328, 29);
			jTextFieldPostgisLayer.setEditable(false);
		}
		return jTextFieldPostgisLayer;
	}

	private JTextField getJTextFieldMysqlLayer() {
		if (jTextFieldMysqlLayer == null) {
			jTextFieldMysqlLayer = new JTextField();
			jTextFieldMysqlLayer.setBounds(164, 127, 328, 29);
			jTextFieldMysqlLayer.setEditable(false);
		}
		return jTextFieldMysqlLayer;
	}

	private JTextField getJTextFieldArcsdeLayer() {
		if (jTextFieldArcsdeLayer == null) {
			jTextFieldArcsdeLayer = new JTextField();
			jTextFieldArcsdeLayer.setBounds(164, 127, 328, 29);
			jTextFieldArcsdeLayer.setEditable(false);
		}
		return jTextFieldArcsdeLayer;
	}

	private JTextField getJTextFieldOracleLayer() {
		if (jTextFieldOracleLayer == null) {
			jTextFieldOracleLayer = new JTextField();
			jTextFieldOracleLayer.setBounds(164, 127, 328, 29);
			jTextFieldOracleLayer.setEditable(false);
		}
		return jTextFieldOracleLayer;
	}

	private void jListWfsLayersValueChanged(ListSelectionEvent evt) {
		jTextFieldWfsLayer.setText(String.valueOf(jListWfsLayers
				.getSelectedValue()));
	}

	private void jListPostgisLayersValueChanged(ListSelectionEvent evt) {
		jTextFieldPostgisLayer.setText(String.valueOf(jListPostgisLayers
				.getSelectedValue()));
	}

	private void jListMysqlLayersValueChanged(ListSelectionEvent evt) {
		jTextFieldMysqlLayer.setText(String.valueOf(jListMysqlLayers
				.getSelectedValue()));
	}

	private void jListArcsdeLayersValueChanged(ListSelectionEvent evt) {
		jTextFieldArcsdeLayer.setText(String.valueOf(jListArcsdeLayers
				.getSelectedValue()));
	}

	private void jListOracleLayersValueChanged(ListSelectionEvent evt) {
		jTextFieldOracleLayer.setText(String.valueOf(jListOracleLayers
				.getSelectedValue()));
	}

	private void jButtonDataSourceTestActionPerformed(ActionEvent evt) {
		String tabName = jTabbedPaneDataSource.getSelectedComponent().getName();
		boolean succeeed = false;
		DataStore ds = null;
		try {
			FeatureSource<SimpleFeatureType, SimpleFeature> fs = null;
			String typeName = null;
			if (tabName.equals(this.jPanelFile.getName())) {
				ds = this.getSelectedDataStore(jPanelFile.getName());
				if (ds == null) {
					String filePath = jTextFieldFilePath.getText();
					String realPath = PathUtil.fakePathToReal(filePath);
					File file = new File(filePath);
					if (!file.exists()) {
						MapToolApp app = (MapToolApp) this.getParent();
						String mapDescFilePath = app.getMapDescFilePath();
						File mapDescFile = new File(mapDescFilePath);
						String dir = mapDescFile.getParentFile()
								.getAbsolutePath();
						String path = dir + File.separator + realPath;
						file = new File(path);
					}
					if (GridCoverage2DReaderFactory
							.getGridCoverage2DReaderFromFile(file) != null) {
						succeeed = true;
					}
				} else {
					if (ds.getTypeNames().length > 0) {
						typeName = ds.getTypeNames()[0];
						fs = ds.getFeatureSource(typeName);
						succeeed = true;
					}
				}
			} else {
				ds = this.getSelectedDataStore(tabName);
				typeName = this.getSelectedTypeName(tabName);
				fs = ds.getFeatureSource(typeName);
				if (fs != null) {
					succeeed = true;
				}
			}

			if (jTextFieldName.getText().length() <= 0 && typeName != null) {
				jTextFieldName.setText(typeName);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (ds != null) {
				ds.dispose();
			}
			if (succeeed) {
				JOptionPane.showMessageDialog(this, "Succeed!");
			} else {
				JOptionPane.showMessageDialog(this, "Failed!");
			}
		}
	}

	private DataStore getSelectedDataStore(String tabName) throws Exception {
		DataStore ds = null;

		if (tabName.equals(jPanelFile.getName())) {
			String filePath = jTextFieldFilePath.getText();
			String realPath = PathUtil.fakePathToReal(filePath);
			File file = new File(filePath);
			if (!file.exists()) {
				MapToolApp app = (MapToolApp) this.getParent();
				String mapDescFilePath = app.getMapDescFilePath();
				File mapDescFile = new File(mapDescFilePath);
				String dir = mapDescFile.getParentFile().getAbsolutePath();
				String path = dir + File.separator + realPath;
				file = new File(path);
			}
			String charset = jTextFieldFileCharset.getText();
			ds = DataStoreFactory.getDataStoreFromFile(file, charset);
		} else if (tabName.equals(jPanelWFS.getName())) {
			ds = DataStoreFactory.getDataStoreFromWFS(jTextFieldWfsUrl
					.getText());
		} else if (tabName.equals(jPanelPostGIS.getName())) {
			ds = DataStoreFactory.getDataStoreFromPostGIS(jTextFieldPostgisHost
					.getText(), Integer.parseInt(jTextFieldPostgisPort
					.getText()), jTextFieldPostgisUser.getText(), String
					.valueOf(jPasswordFieldPostgisPasswd.getPassword()),
					jTextFieldPostgisDatabase.getText(),
					jTextFieldPostgisSchema.getText());
		} else if (tabName.equals(jPanelMySQL.getName())) {
			ds = DataStoreFactory.getDataStoreFromMySQL(jTextFieldMysqlHost
					.getText(),
					Integer.parseInt(jTextFieldMysqlPort.getText()),
					jTextFieldMysqlUser.getText(), String
							.valueOf(jPasswordFieldMysqlPasswd.getPassword()),
					jTextFieldMysqlDatabase.getText());
		} else if (tabName.equals(jPanelArcSDE.getName())) {
			ds = DataStoreFactory.getDataStoreFromArcSDE(jTextFieldArcsdeHost
					.getText(), Integer
					.parseInt(jTextFieldArcsdePort.getText()),
					jTextFieldArcsdeInstance.getText(), jTextFieldArcsdeUser
							.getText(), String
							.valueOf(jPasswordFieldArcsdePasswd.getPassword()));
		} else if (tabName.equals(jPanelOracle.getName())) {
			ds = DataStoreFactory.getDataStoreFromOracle(jTextFieldOracleHost
					.getText(), Integer
					.parseInt(jTextFieldOraclePort.getText()),
					jTextFieldOracleUser.getText(), String
							.valueOf(jPasswordFieldOraclePasswd.getPassword()),
					jTextFieldOracleInstance.getText());
		}

		return ds;
	}

	private String getSelectedTypeName(String tabName) {
		String typeName = null;
		try {
			if (tabName.equals(jPanelWFS.getName())) {
				typeName = jTextFieldWfsLayer.getText();
			} else if (tabName.equals(this.jPanelPostGIS.getName())) {
				typeName = jTextFieldPostgisLayer.getText();
			} else if (tabName.equals(this.jPanelMySQL.getName())) {
				typeName = jTextFieldMysqlLayer.getText();
			} else if (tabName.equals(this.jPanelArcSDE.getName())) {
				typeName = jTextFieldArcsdeLayer.getText();
			} else if (tabName.equals(this.jPanelOracle.getName())) {
				typeName = jTextFieldOracleLayer.getText();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return typeName;
	}

	private String getSelectedDataSource(String tabName) {
		String dataSource = null;
		try {
			if (tabName.equals(jPanelFile.getName())) {
				dataSource = jTextFieldFilePath.getText();
			} else if (tabName.equals(jPanelWFS.getName())) {
				dataSource = jTextFieldWfsUrl.getText() + ","
						+ getSelectedTypeName(tabName);
			} else if (tabName.equals(this.jPanelPostGIS.getName())) {
				dataSource = jTextFieldPostgisHost.getText()
						+ ","
						+ jTextFieldPostgisPort.getText()
						+ ","
						+ jTextFieldPostgisUser.getText()
						+ ","
						+ String.valueOf(jPasswordFieldPostgisPasswd
								.getPassword()) + ","
						+ jTextFieldPostgisDatabase.getText() + ","
						+ jTextFieldPostgisSchema.getText() + ","
						+ getSelectedTypeName(tabName);
			} else if (tabName.equals(this.jPanelMySQL.getName())) {
				dataSource = jTextFieldMysqlHost.getText()
						+ ","
						+ jTextFieldMysqlPort.getText()
						+ ","
						+ jTextFieldMysqlUser.getText()
						+ ","
						+ String.valueOf(jPasswordFieldMysqlPasswd
								.getPassword()) + ","
						+ jTextFieldMysqlDatabase.getText() + ","
						+ getSelectedTypeName(tabName);
			} else if (tabName.equals(this.jPanelArcSDE.getName())) {
				dataSource = jTextFieldArcsdeHost.getText()
						+ ","
						+ jTextFieldArcsdePort.getText()
						+ ","
						+ jTextFieldArcsdeInstance.getText()
						+ ","
						+ jTextFieldArcsdeUser.getText()
						+ ","
						+ String.valueOf(jPasswordFieldArcsdePasswd
								.getPassword()) + ","
						+ getSelectedTypeName(tabName);
			} else if (tabName.equals(this.jPanelOracle.getName())) {
				dataSource = jTextFieldOracleHost.getText()
						+ ","
						+ jTextFieldOraclePort.getText()
						+ ","
						+ jTextFieldOracleUser.getText()
						+ ","
						+ String.valueOf(jPasswordFieldOraclePasswd
								.getPassword()) + ","
						+ jTextFieldOracleInstance.getText() + ","
						+ getSelectedTypeName(tabName);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return dataSource;
	}

	private void jButtonFileBrowseActionPerformed(ActionEvent evt) {
		JFileChooser jFileChooser = getJFileChooserOpenFile();
		int returnVal = jFileChooser.showOpenDialog(this);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			String filePath = jFileChooser.getSelectedFile().getAbsolutePath();
			String fakeFilePath = PathUtil.realPathToFake(filePath);

			MapToolApp app = (MapToolApp) this.getParent();
			String mapDescFilePath = app.getMapDescFilePath();
			File mapDescFile = new File(mapDescFilePath);
			String dir = mapDescFile.getParentFile().getAbsolutePath();
			String fakeDir = PathUtil.realPathToFake(dir);

			if (fakeFilePath.startsWith(fakeDir)) {
				String fakeRelFilePath = fakeFilePath.substring(fakeDir
						.length() + 1);
				jTextFieldFilePath.setText(fakeRelFilePath);
			} else {
				jTextFieldFilePath.setText(fakeFilePath);
			}
		}
	}

	public JFileChooser getJFileChooserOpenFile() {
		if (jFileChooserOpenFile == null) {
			jFileChooserOpenFile = new JFileChooser();
			jFileChooserOpenFile.setDialogTitle("Open File");
			jFileChooserOpenFile
					.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
			FileFilter filter = new FileFilter() {
				public boolean accept(File file) {
					String lowName = file.getName().toLowerCase();
					return (file.isDirectory() || (file.isFile() && (lowName
							.endsWith(".shp")
							|| lowName.endsWith(".gml")
							|| lowName.endsWith(".jpg")
							|| lowName.endsWith(".jpeg")
							|| lowName.endsWith(".png")
							|| lowName.endsWith(".gif")
							|| lowName.endsWith(".tif") || lowName
							.endsWith(".tiff"))));
				}

				public String getDescription() {
					return "All Supported Type (shp/gml/jpeg/png/gif/tiff)";
				}
			};
			jFileChooserOpenFile.setFileFilter(filter);

			MapToolApp app = (MapToolApp) mapConfDialog.getParent();
			File mapDir = new File(app.getMapDirPath());
			jFileChooserOpenFile.setSelectedFile(mapDir);
		}
		return jFileChooserOpenFile;
	}

	private void jButtonWfsListLayersActionPerformed(ActionEvent evt) {
		try {
			jListWfsLayers.removeAll();
			DataStore ds = this.getSelectedDataStore(jPanelWFS.getName());
			String[] typeNames = ds.getTypeNames();
			final DefaultComboBoxModel model = new DefaultComboBoxModel(
					typeNames);
			jListWfsLayers.setModel(model);
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(this, ex.getMessage());
		}
	}

	private void jButtonPostgisListLayersActionPerformed(ActionEvent evt) {
		try {
			jListPostgisLayers.removeAll();
			DataStore ds = this.getSelectedDataStore(jPanelPostGIS.getName());
			String[] typeNames = ds.getTypeNames();
			final DefaultComboBoxModel model = new DefaultComboBoxModel(
					typeNames);
			jListPostgisLayers.setModel(model);
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(this, ex.getMessage());
		}
	}

	private void jButtonMysqlListLayersActionPerformed(ActionEvent evt) {
		try {
			jListMysqlLayers.removeAll();
			DataStore ds = this.getSelectedDataStore(jPanelMySQL.getName());
			String[] typeNames = ds.getTypeNames();
			final DefaultComboBoxModel model = new DefaultComboBoxModel(
					typeNames);
			jListMysqlLayers.setModel(model);
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(this, ex.getMessage());
		}
	}

	private void jButtonArcsdeListLayersActionPerformed(ActionEvent evt) {
		try {
			jListArcsdeLayers.removeAll();
			DataStore ds = this.getSelectedDataStore(jPanelArcSDE.getName());
			String[] typeNames = ds.getTypeNames();
			final DefaultComboBoxModel model = new DefaultComboBoxModel(
					typeNames);
			jListArcsdeLayers.setModel(model);
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(this, ex.getMessage());
		}
	}

	private void jButtonOracleListLayersActionPerformed(ActionEvent evt) {
		try {
			jListOracleLayers.removeAll();
			DataStore ds = this.getSelectedDataStore(jPanelOracle.getName());
			String[] typeNames = ds.getTypeNames();
			final DefaultComboBoxModel model = new DefaultComboBoxModel(
					typeNames);
			jListOracleLayers.setModel(model);
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(this, ex.getMessage());
		}
	}

	private void jButtonStyleActionPerformed(ActionEvent evt) {
		JFileChooser jFileChooser = getJFileChooserOpenStyleFile();
		int returnVal = jFileChooser.showOpenDialog(this);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			String filePath = jFileChooser.getSelectedFile().getAbsolutePath();
			String fakeFilePath = PathUtil.realPathToFake(filePath);

			MapToolApp app = (MapToolApp) this.getParent();
			String mapDescFilePath = app.getMapDescFilePath();
			File mapDescFile = new File(mapDescFilePath);
			String dir = mapDescFile.getParentFile().getAbsolutePath();
			String fakeDir = PathUtil.realPathToFake(dir);

			if (fakeFilePath.startsWith(fakeDir)) {
				String fakeRelFilePath = fakeFilePath.substring(fakeDir
						.length() + 1);
				jTextFieldStyleFilePath.setText(fakeRelFilePath);
			} else {
				jTextFieldStyleFilePath.setText(fakeFilePath);
			}
		}
	}

	public JFileChooser getJFileChooserOpenStyleFile() {
		if (jFileChooserOpenStyleFile == null) {
			jFileChooserOpenStyleFile = new JFileChooser();
			jFileChooserOpenStyleFile.setDialogTitle("Open SLD File");
			jFileChooserOpenStyleFile
					.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
			FileFilter filter = new FileFilter() {
				public boolean accept(File file) {
					String lowName = file.getName().toLowerCase();
					return (file.isDirectory() || (file.isFile() && (lowName
							.endsWith(".sld"))));
				}

				public String getDescription() {
					return "Styled Layer Descriptor (sld)";
				}
			};
			jFileChooserOpenStyleFile.setFileFilter(filter);

			MapToolApp app = (MapToolApp) mapConfDialog.getParent();
			File mapDir = new File(app.getMapDirPath());
			jFileChooserOpenStyleFile.setSelectedFile(mapDir);
		}
		return jFileChooserOpenStyleFile;
	}

	private void jButtonOKActionPerformed(ActionEvent evt) {
		boolean isAdd = layerInfo == null ? true : false;

		if (layerInfo == null) {
			layerInfo = new LayerInfo();
		}

		layerInfo.setName(this.jTextFieldName.getText());
		layerInfo.setVisible(this.jCheckBoxVisible.isSelected());
		layerInfo.setEditable(this.jCheckBoxEditable.isSelected());
		layerInfo.setStyle(this.jTextFieldStyleFilePath.getText());
		String tabName = this.jTabbedPaneDataSource.getSelectedComponent()
				.getName();
		layerInfo.setDataSourceType(tabName);
		layerInfo.setDataSource(getSelectedDataSource(tabName));
		if (tabName.equals(this.jPanelFile.getName())) {
			layerInfo.setCharset(this.jTextFieldFileCharset.getText());
		}

		DefaultComboBoxModel jListLayersModel = mapConfDialog
				.getjListLayersModel();
		if (isAdd) {
			LayerItem item = new LayerItem();
			item.setLayerInfo(layerInfo);
			jListLayersModel.addElement(item);
		}
		mapConfDialog.getJListLayers().repaint();

		this.setVisible(false);
	}

	private void jButtonCancelActionPerformed(ActionEvent evt) {
		this.setVisible(false);
	}

	private JLabel getJLabel1() {
		if (jLabel1 == null) {
			jLabel1 = new JLabel();
			jLabel1
					.setText("(If use default style, input \"point\" or \"polyline\" or \"polygon\", leave blank sometimes not work)");
			jLabel1.setBounds(60, 534, 534, 22);
			jLabel1.setFont(new java.awt.Font("微软雅黑", 0, 12));
		}
		return jLabel1;
	}

	private JScrollPane getJScrollPane1() {
		if (jScrollPane1 == null) {
			jScrollPane1 = new JScrollPane();
			jScrollPane1.setBounds(12, 85, 480, 252);
			{
				jListWfsLayers = new JList();
				jScrollPane1.setViewportView(jListWfsLayers);
				jListWfsLayers.setBounds(286, 229, 206, 108);
				jListWfsLayers
						.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
				jListWfsLayers
						.addListSelectionListener(new ListSelectionListener() {
							public void valueChanged(ListSelectionEvent evt) {
								jListWfsLayersValueChanged(evt);
							}
						});
			}
		}
		return jScrollPane1;
	}

	private JScrollPane getJScrollPane2() {
		if (jScrollPane2 == null) {
			jScrollPane2 = new JScrollPane();
			jScrollPane2.setBounds(12, 161, 480, 176);
			{
				jListPostgisLayers = new JList();
				jScrollPane2.setViewportView(jListPostgisLayers);
				jListPostgisLayers.setBounds(434, 280, 58, 57);
				jListPostgisLayers
						.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
				jListPostgisLayers
						.addListSelectionListener(new ListSelectionListener() {
							public void valueChanged(ListSelectionEvent evt) {
								jListPostgisLayersValueChanged(evt);
							}
						});
			}
		}
		return jScrollPane2;
	}

	private JScrollPane getJScrollPane3() {
		if (jScrollPane3 == null) {
			jScrollPane3 = new JScrollPane();
			jScrollPane3.setBounds(12, 161, 480, 176);
			{
				jListMysqlLayers = new JList();
				jScrollPane3.setViewportView(jListMysqlLayers);
				jListMysqlLayers.setBounds(424, 307, 68, 30);
				jListMysqlLayers
						.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
				jListMysqlLayers
						.addListSelectionListener(new ListSelectionListener() {
							public void valueChanged(ListSelectionEvent evt) {
								jListMysqlLayersValueChanged(evt);
							}
						});
			}
		}
		return jScrollPane3;
	}

	private JScrollPane getJScrollPane4() {
		if (jScrollPane4 == null) {
			jScrollPane4 = new JScrollPane();
			jScrollPane4.setBounds(12, 161, 480, 176);
			{
				jListArcsdeLayers = new JList();
				jScrollPane4.setViewportView(jListArcsdeLayers);
				jListArcsdeLayers.setBounds(412, 309, 80, 28);
				jListArcsdeLayers
						.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
				jListArcsdeLayers
						.addListSelectionListener(new ListSelectionListener() {
							public void valueChanged(ListSelectionEvent evt) {
								jListArcsdeLayersValueChanged(evt);
							}
						});
			}
		}
		return jScrollPane4;
	}

	private JScrollPane getJScrollPane5() {
		if (jScrollPane5 == null) {
			jScrollPane5 = new JScrollPane();
			jScrollPane5.setBounds(12, 161, 480, 176);
			{
				jListOracleLayers = new JList();
				jScrollPane5.setViewportView(jListOracleLayers);
				jListOracleLayers.setBounds(433, 308, 59, 29);
				jListOracleLayers
						.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
				jListOracleLayers
						.addListSelectionListener(new ListSelectionListener() {
							public void valueChanged(ListSelectionEvent evt) {
								jListOracleLayersValueChanged(evt);
							}
						});
			}
		}
		return jScrollPane5;
	}

	private JLabel getJLabel2() {
		if (jLabel2 == null) {
			jLabel2 = new JLabel();
			jLabel2.setText("Charset (Optional): ");
			jLabel2.setBounds(12, 41, 178, 26);
		}
		return jLabel2;
	}

	private JTextField getJTextFieldFileCharset() {
		if (jTextFieldFileCharset == null) {
			jTextFieldFileCharset = new JTextField();
			jTextFieldFileCharset.setBounds(196, 38, 170, 33);
		}
		return jTextFieldFileCharset;
	}

}