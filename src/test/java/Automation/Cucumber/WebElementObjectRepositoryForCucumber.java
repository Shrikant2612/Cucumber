package Automation.Cucumber;


	
	import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
	
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.asserts.SoftAssert;



	public class WebElementObjectRepositoryForCucumber {
		public static Logger logger;
		
		 public static SoftAssert  softassertion = new SoftAssert();
	
		
		
		public static void webelementObjectRepositorymain() {
			 logger = Logger.getLogger("webelementObjectRepository");
		
			
		}
		public static void main(String[] args) {

			{
				PropertyConfigurator.configure("log4j.properties");
			}
		}
		
		
				
		public static java.lang.String InudsURL="https://153.58.71.231/ICICI_OUTWARD_UAT/LoginPage.aspx";
		
		

		@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtUserID_1")
		public static WebElement username;
		
		@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_lblErrorDisplay")
		public static WebElement messageonuiforinvaliduser;
		
		
		
		@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtPassword_1")
		public static WebElement password;
		
		@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_btnLogin")
		public static WebElement login;
		@FindBy(how = How.ID, using = "overridelink")
		public static WebElement Untrusted;
		@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_ImageButton1")
		public static WebElement logout;
		@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_lblErrorDisplay")
		public static WebElement errormessagewhileloginwithinvaliduser;
		
		
		
		
		
	//==============================================login module inputs============================================================================
		

	// ================================status viewer for reject repair non slip inputs============================================================
		@FindBy(how = How.LINK_TEXT, using = "[S]Status Viewer")
		public static WebElement statusviewer;
		@FindBy(how = How.LINK_TEXT, using = "[4]Status Viewer")
		public static WebElement statusviewerforOBCBank;
		
		@FindBy(how = How.XPATH, using = "//table[@id='ctl00_ContentPlaceHolder1_TabContainer1_TabPanel1_GridView1']/tbody/tr[1]/td[8]")
		public static WebElement statusviewer1;
		
		@FindBy(how = How.LINK_TEXT, using ="Main Menu")
		public static WebElement mainmenu;
		
		@FindBy(how = How.LINK_TEXT, using ="[7]Reports")
		public static WebElement boiinwardreports;
		
		
		
		
		
		@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_LinkButton1")
		public static WebElement mainmenuforcanara;
		

		@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_LinkButton1")
		public static WebElement mainmenuusingid;
		
		@FindBy(how = How.XPATH, using = "//*[@id='ctl00_ContentPlaceHolder1_LinkButton1']")
		public static WebElement mainmenuusingxpath;
		
		@FindBy(how = How.LINK_TEXT, using = "[3]Reject Repair(Non-Slip)")
		public static WebElement rejectrepairnonslip;
		@FindBy(how = How.LINK_TEXT, using = "002001")
		public static WebElement batchno_1;
		@FindBy(how = How.LINK_TEXT, using = "001001")
		public static WebElement batchnoobeforOBCBank;
		
		@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_btnShowAll")
		public static WebElement showallbuttonforOBCBank;
		@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_1|ChequeNo|-1|6|0")
		public static WebElement Chequeno;
		@FindBy(how=How.ID, using="ctl00_ContentPlaceHolder1_txtDataEntry_2|SortCode|0|3|0")
		public static WebElement city;//400
		@FindBy(how=How.ID, using="ctl00_ContentPlaceHolder1_txtDataEntry_3|SortCode|3|3|0")
		public static WebElement bank;//240
		@FindBy(how=How.ID,using="ctl00_ContentPlaceHolder1_txtDataEntry_4|SortCode|6|3|0")
		public static WebElement branch;//008
		@FindBy(how=How.ID,using="ctl00_ContentPlaceHolder1_txtDataEntry_5|BaseNo|-1|6|0")
		public static WebElement baseno;//0154766
		@FindBy(how=How.ID,using="ctl00_ContentPlaceHolder1_txtDataEntry_5|BaseNo|-1|7|0")
		public static WebElement basenoforgovtcheque;//0154766
		

		@FindBy(how=How.ID,using="ctl00_ContentPlaceHolder1_txtDataEntry_6|TC|-1|2|0")
		public static WebElement transcode;//10
		@FindBy(how=How.ID,using="ctl00_ContentPlaceHolder1_txtDataEntry_6|TC|-1|3|0")
		public static WebElement transcodeforgovtcheque;//10
		
		
		@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_btnValidate")
		public static WebElement savebutton;
		@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_btnOK")
		public static WebElement submitbatch;
		
		@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_btnCancel")
		public static WebElement dontwanttosubmitbatch;
		
		
		@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_btnCancelExit")
		public static WebElement dontwanttoloadbatch;
		
		@FindBy(how = How.ID, using = "__tab_ctl00_ContentPlaceHolder1_TabContainer1_TabPanel2")
		public static WebElement icicioutwardworkstationsummary;
		
		@FindBy(how = How.XPATH, using = "//table[@id='ctl00_ContentPlaceHolder1_TabContainer1_TabPanel2_GridView2']/tbody/tr[2]/td[2]")
		public static WebElement workstationsummaryforapplicationno;
		
		@FindBy(how = How.XPATH, using = "//table[@id='ctl00_ContentPlaceHolder1_TabContainer1_TabPanel2_GridView2']/tbody/tr[2]/td[5]")
		public static WebElement workstationsummaryforapplicationname;
		
		@FindBy(how = How.XPATH, using = "//table[@id='ctl00_ContentPlaceHolder1_TabContainer1_TabPanel3_GridView3']/tbody/tr[2]/td[5]")
		public static WebElement podstatussummary;
		
		@FindBy(how = How.ID, using = "__tab_ctl00_ContentPlaceHolder1_TabContainer1_TabPanel3")
		public static WebElement icicioutwardpodstatus;
		@FindBy(how = How.ID, using = "__tab_ctl00_ContentPlaceHolder1_TabContainer1_TabPanel4")
		public static WebElement icicioutwarddashboardreport;
		@FindBy(how = How.XPATH, using = "//table[@id='ctl00_ContentPlaceHolder1_TabContainer1_TabPanel4_gvdashboard']/tbody/tr[2]/td[1]")
		public static WebElement icicioutwarddashboardsummary;
		
		
		
		
		
		
		
		
		

		
		
		
	//===================================Batch Balancing(RBNL-LBNR)===========================================================
		

	@FindBy(how=How.LINK_TEXT,using="[5]Batch Balancing (RBNL-LBNR)")
	public static WebElement batchbalancingrbnllbnr ;

	@FindBy(how=How.LINK_TEXT,using="[3]Batch Balancing (RBNL-LBNR)")
	public static WebElement batchbalancingrbnllbnrforOBCBank ;

	/*@FindBy(how=How.ID,using="ctl00_ContentPlaceHolder1_txtDataEntry_4|Amount|-1|18|0")
	public static WebElement amount;//200000
	*/
	@FindBy(how=How.ID,using="ctl00_ContentPlaceHolder1_gvSecond_ctl02_txtAmount")
	public static WebElement amount;

	@FindBy(how=How.ID,using="ctl00_ContentPlaceHolder1_gvSecond_ctl02_txtAccountName")
	public static WebElement accountname;//amit joshi
	/*@FindBy(how=How.ID,using="ctl00_ContentPlaceHolder1_txtDataEntry_6|AccountNo|-1|12|")
	public static WebElement accountno;//12345678912345
	*/
	@FindBy(how=How.ID,using="ctl00_ContentPlaceHolder1_gvSecond_ctl02_txtAccountNo")
	public static WebElement accountno;

	@FindBy(how=How.ID,using="ctl00_ContentPlaceHolder1_gvSecond_ctl02_btnSave")
	public static WebElement saverecordinrbnl;//

	@FindBy(how=How.ID,using="ctl00_ContentPlaceHolder1_btnCommit")
	public static WebElement commit;//
	@FindBy(how=How.ID,using="ctl00_ContentPlaceHolder1_btnSubmit")
	public static WebElement submitrecordrbnl;//
	@FindBy(how=How.ID,using="ctl00_ContentPlaceHolder1_gvSecond_ctl02_txtChqNo")
	public static WebElement chequenoinlbnrtbl;
	@FindBy(how=How.ID,using="ctl00_ContentPlaceHolder1_gvSecond_ctl02_txtSortCode")
	public static WebElement sortcodeinlbnr;

	@FindBy(how=How.ID,using="ctl00_ContentPlaceHolder1_gvSecond_ctl02_txtBaseNo")
	public static WebElement basenoinlbnr;
	@FindBy(how=How.ID,using="ctl00_ContentPlaceHolder1_gvSecond_ctl02_txtTC")
	public static WebElement tcinlbnr;

	@FindBy(how=How.ID,using="ctl00_ContentPlaceHolder1_gvSecond_ctl02_txtAmount")
	public static WebElement amountinlbnr;

	@FindBy(how=How.ID,using="ctl00_ContentPlaceHolder1_gvSecond_ctl02_txtAccountName")
	public static WebElement accountnameinlbnr;
	@FindBy(how=How.ID,using="ctl00_ContentPlaceHolder1_gvSecond_ctl02_txtAccountNo")
	public static WebElement accountnoinlbnr;
	@FindBy(how=How.ID,using="ctl00_ContentPlaceHolder1_txtDataEntry_1|AccountNo|-1|12|")
	public static WebElement accountnoforexceptionprocessingmaker;

	@FindBy(how=How.ID,using="ctl00_ContentPlaceHolder1_txtDataEntry_11|ExceptionRemarks|-1|100|")
	public static WebElement remarkforexceptionprocessingmaker;

	@FindBy(how=How.LINK_TEXT,using="[9]EXCEPTION HANDLING-CHECKER")
	public static WebElement exceptionhandlingchecker;

	@FindBy(how=How.ID,using="ctl00_ContentPlaceHolder1_chk_Image_ToggleButton")
	public static WebElement rejectinstrument;
	@FindBy(how=How.ID,using="ctl00_ContentPlaceHolder1_txtDeleteReason")
	public static WebElement enterreasonfordeleteinstrument;

	@FindBy(how=How.XPATH,using="//*[@id='ctl00_ContentPlaceHolder1_chk_Image_ToggleButton']")
	public static WebElement rejectinstrumentincmsslipforschoolfees;
	@FindBy(how=How.LINK_TEXT,using="Reject")
	public static WebElement icicioutrejectbuttonforcmsslipschoolfees;
	@FindBy(how=How.LINK_TEXT,using="[P](Vendor-CMS-slip)PWO (>=1L) (Maker)")
	public static WebElement icicioutvendorcmsslippwoexceptionmaker;
	@FindBy(how=How.ID,using="ctl00_ContentPlaceHolder1_txtDataEntry_12|Remark|-1|100|")
	public static WebElement icicioutremarkforpwoexception;
	@FindBy(how=How.LINK_TEXT,using="[A](Vendor-CMS-slip)PWO (>=1L) (Checker)")
	public static WebElement icicioutvendorcmsslippwoexceptionchecker;
	@FindBy(how=How.ID,using="ctl00_ContentPlaceHolder1_txtDataEntry_1|SortCode|0|3|0")
	public static WebElement icicioutcitycodeforloanbatch;
	@FindBy(how=How.ID,using="ctl00_ContentPlaceHolder1_txtDataEntry_2|SortCode|3|3|0")
	public static WebElement icicioutbankcodeforloanbatch;
	@FindBy(how=How.ID,using="ctl00_ContentPlaceHolder1_txtDataEntry_3|SortCode|6|3|0")
	public static WebElement icicioutbranchcodeforloanbatch;
	@FindBy(how=How.ID,using="ctl00_ContentPlaceHolder1_txtDataEntry_4|ChequeNo|-1|6|0")
	public static WebElement icicioutchequenoforloanbatch;
	@FindBy(how=How.ID,using="ctl00_ContentPlaceHolder1_txtDataEntry_5|Amount|-1|18|0")
	public static WebElement icicioutamountforloanbatch;

	@FindBy(how=How.ID,using="ctl00_ContentPlaceHolder1_txtDataEntry_6|Inst_Date|-1|10|")
	public static WebElement icicioutchequedateforloanbatch;
	@FindBy(how=How.ID,using="ctl00_ContentPlaceHolder1_txtDataEntry_7|CreditAccountNumber|-1|12|")
	public static WebElement icicioutcreditaccnoforloanbatch;
	@FindBy(how=How.ID,using="ctl00_ContentPlaceHolder1_txtDataEntry_8|AccountName|-1|25|")
	public static WebElement icicioutpayeenameforloanbatch;
	@FindBy(how=How.ID,using="ctl00_ContentPlaceHolder1_txtDataEntry_9|DraweeName|-1|18|")
	public static WebElement icicioutdraweraccnameforloanbatch;
	@FindBy(how=How.ID,using="ctl00_ContentPlaceHolder1_txtDataEntry_10|LoanNumber|-1|20|")
	public static WebElement icicioutloannoforloanbatch;





















	//===================================Batch Balancing(RBNL-LBNR)===========================================================


	//===================================Exception handling maker===========================================================
	@FindBy(how = How.XPATH, using = "//table[@id='ctl00_ContentPlaceHolder1_TabContainer1_TabPanel1_GridView1']/tbody/tr[1]/td[10]")
	public static WebElement totalamount;
	@FindBy(how = How.XPATH, using = "//table[@id='ctl00_ContentPlaceHolder1_TabContainer1_TabPanel1_GridView1']/tbody/tr[1]/td[9]")
	public static WebElement totalamountforOBCBank;
	@FindBy(how = How.XPATH, using = "//table[@id='ctl00_ContentPlaceHolder1_TabContainer1_TabPanel1_GridView1']/tbody/tr[1]/td[9]")
	public static WebElement totalcount;
	@FindBy(how = How.XPATH, using = "//table[@id='ctl00_ContentPlaceHolder1_TabContainer1_TabPanel1_GridView1']/tbody/tr[1]/td[8]")
	public static WebElement totalcountforOBCBank;
	@FindBy(how=How.LINK_TEXT,using="[8]EXCEPTION HANDLING-MAKER")
	public static WebElement Exceptionhandlingmaker;//
	//=================================Exception handling maker===================================================================

	//==================================Second batch=============================================================================

	@FindBy(how = How.XPATH, using = "//table[@id='ctl00_ContentPlaceHolder1_TabContainer1_TabPanel1_GridView1']/tbody/tr[2]/td[8]")
	public static WebElement statusviewerforsecondbatch;
	@FindBy(how = How.XPATH, using = "//table[@id='ctl00_ContentPlaceHolder1_TabContainer1_TabPanel1_GridView1']/tbody/tr[2]/td[10]")
	public static WebElement totalamountforsecondbatch;
	@FindBy(how = How.LINK_TEXT, using ="002002")
	public static WebElement secondbatch;
	@FindBy(how = How.XPATH, using = "//table[@id='ctl00_ContentPlaceHolder1_TabContainer1_TabPanel1_GridView1']/tbody/tr[2]/td[9]")
	public static WebElement totalcountforsecondbatch;
	@FindBy(how = How.LINK_TEXT, using = "[7]Super Balancing(Non-Slip)")
	public static WebElement superbalancingmodulefornonslip;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_btn_HandleAll")
	public static WebElement handleallrecord;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_btn_Handle")
	public static WebElement handlesinglerecord;

	//=============================THIRD BATCH===================================================================
	@FindBy(how = How.XPATH, using = "//table[@id='ctl00_ContentPlaceHolder1_TabContainer1_TabPanel1_GridView1']/tbody/tr[3]/td[8]")
	public static WebElement statusviewerforthirdbatch;
	@FindBy(how = How.XPATH, using = "//table[@id='ctl00_ContentPlaceHolder1_TabContainer1_TabPanel1_GridView1']/tbody/tr[3]/td[9]")
	public static WebElement totalcountforthirdbatch;
	@FindBy(how = How.XPATH, using = "//table[@id='ctl00_ContentPlaceHolder1_TabContainer1_TabPanel1_GridView1']/tbody/tr[3]/td[10]")
	public static WebElement totalamountforthirdbatch;
	@FindBy(how = How.LINK_TEXT, using = "[4]Reject Repair(CMS Slip)")
	public static WebElement rejectrepaircmsslip;

	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_chk_Image_ToggleButton")
	public static WebElement imagetag;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_chk_IQA_ToggleButton")
	public static WebElement iqa;





	@FindBy(how = How.LINK_TEXT, using ="002003")
	public static WebElement batchnoforthirdbatch;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_1|DepSlipNo|-1|10|0")
	public static WebElement slipno;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_1|SlipNo|-1|10|")
	public static WebElement slipnoforsecondbatch;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_5|HierarchyCode|-1|20|")
	public static WebElement hierarchycode;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_ddl_ChangeType")
	public static WebElement changetype;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_btnCancel")
	public static WebElement dontwanttodeleteinstrument;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_btn_TaggedPrev")
	public static WebElement gotopreviouscheque;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_btn_TaggedNext")
	public static WebElement gotonextcheque;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDeleteReason")
	public static WebElement reasonfordeleteinginstrumentinrr;












	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_2|Amount|-1|16|0")
	public static WebElement amountforcmsslip;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_3|CustCode|-1|20|")
	public static WebElement customercode;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_4|ProdCode|-1|10|")
	public static WebElement productcode;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_6|NoInstruments|-1|2|0")
	public static WebElement noofinstrument;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_7|AccountName|-1|25|")
	public static WebElement accounttitle;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_7|Amount|-1|13|0")
	public static WebElement amountforcheque;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_1|ChequeNo|-1|6|0")
	public static WebElement chequenoforbatch3;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_2|SortCode|0|3|0")
	public static WebElement citycodeforbatch3;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_3|SortCode|3|3|0")
	public static WebElement bankcodeforbatch3;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_4|SortCode|6|3|0")
	public static WebElement branchcodeforbatch3;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_5|BaseNo|-1|6|0")
	public static WebElement basenoeforbatch3;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_6|TC|-1|2|0")
	public static WebElement transcodeforbatch3;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_7|Amount|-1|13|0")
	public static WebElement amountforbatch3;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_5|BaseNo|-1|7|0")
	public static WebElement basenoforbatch3govtcheque;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_6|TC|-1|3|0")
	public static WebElement tcforbatch3govtcheque;







	@FindBy(how = How.LINK_TEXT, using ="[6]Super Balancing(CMS Slip)")
	public static WebElement superbalancingcmsslip;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_LinkButton1")
	public static WebElement clickheretologin;
	@FindBy(how = How.LINK_TEXT, using ="[6]Super Balancing(CMS Slip)")
	public static WebElement superbalancingmodulefornonslipchecker;

	@FindBy(how = How.XPATH, using ="//*[@id='ctl00_ContentPlaceHolder1_tv_Instrumentst2']/font")
	public static WebElement selectslipfromtree;




	//====================================handling fourth batch=================================
	@FindBy(how = How.XPATH, using = "//table[@id='ctl00_ContentPlaceHolder1_TabContainer1_TabPanel1_GridView1']/tbody/tr[4]/td[8]")
	public static WebElement statusviewerforfourthbatch;
	@FindBy(how = How.XPATH, using = "//table[@id='ctl00_ContentPlaceHolder1_TabContainer1_TabPanel1_GridView1']/tbody/tr[4]/td[9]")
	public static WebElement totalcountforfourthbatch;
	@FindBy(how = How.XPATH, using = "//table[@id='ctl00_ContentPlaceHolder1_TabContainer1_TabPanel1_GridView1']/tbody/tr[4]/td[10]")
	public static WebElement totalamountforfourthbatch;
	@FindBy(how = How.LINK_TEXT, using = "[Q]Reject Repair(Vendor-Retail Without Slip)")
	public static WebElement rejectrepairvendorretailwithoutslip;
	@FindBy(how = How.LINK_TEXT, using ="002004")
	public static WebElement fourthbatch;
	@FindBy(how = How.LINK_TEXT, using ="[W]Data entry (Maker)")
	public static WebElement dataentryformaker;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_1|AccountName|-1|50|")
	public static WebElement payeename;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_2|DraweeName|-1|18|")
	public static WebElement drawername;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_3|Inst_Date|-1|10|")
	public static WebElement chequedate;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_4|Amount|-1|18|0")
	public static WebElement amountfordataentrymaker;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_6|AccountNo|-1|12|")
	public static WebElement accountnofordataentrymaker;
	@FindBy(how = How.LINK_TEXT, using ="[E]Data entry (Checker)")
	public static WebElement dataentryforchecker;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_btnValidate")
	public static WebElement acceptrecord;
	@FindBy(how = How.LINK_TEXT, using ="[T]SAAS File Extract/Upload")
	public static WebElement saasfileextract;
	@FindBy(how = How.LINK_TEXT, using ="Extract")
	public static WebElement extractbutton;
	@FindBy(how = How.LINK_TEXT, using ="[P]PWO (>=50000) (Maker)")
	public static WebElement pwoexceptionmaker;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_4|Amount|-1|18|0")
	public static WebElement amountforfourthbatch;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_6|AccountNo|-1|12|")
	public static WebElement accountnoforfourthbatch;
	@FindBy(how = How.LINK_TEXT, using ="Upload")
	public static WebElement uploadbutton;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_btnRefresh")
	public static WebElement refreshbutton;






	//====================================================5th Batch======================================================

	@FindBy(how = How.XPATH, using = "//table[@id='ctl00_ContentPlaceHolder1_TabContainer1_TabPanel1_GridView1']/tbody/tr[5]/td[8]")
	public static WebElement statusviewerforfifthbatch;
	@FindBy(how = How.XPATH, using = "//table[@id='ctl00_ContentPlaceHolder1_TabContainer1_TabPanel1_GridView1']/tbody/tr[5]/td[9]")
	public static WebElement totalcountforfifthbatch;
	@FindBy(how = How.XPATH, using = "//table[@id='ctl00_ContentPlaceHolder1_TabContainer1_TabPanel1_GridView1']/tbody/tr[5]/td[10]")
	public static WebElement totalamountforfifthbatch;
	@FindBy(how = How.LINK_TEXT, using ="[F](Vendor-slip)Reject Repair")
	public static WebElement vendorsliprejectrepair;
	@FindBy(how = How.LINK_TEXT, using ="002005")
	public static WebElement fifthbatch;
	@FindBy(how = How.LINK_TEXT, using ="[G](Vendor-slip)Data entry (Maker)")
	public static WebElement vendorslipdataentrymaker;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_1|AccountNo|-1|12|")
	public static WebElement accountNoForfifthBatchslip ;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_2|Amount|-1|18|0")
	public static WebElement amountforfifthbatchslip;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_3|AccountName|-1|50|")
	public static WebElement accountnameforfifthbatchslip;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_1|Amount|-1|18|0")
	public static WebElement amountforfifthbatchcheque;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_2|AccountName|-1|50|")
	public static WebElement accountnameforfifthbatchcheque;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_3|DraweeName|-1|50|")
	public static WebElement drawernameforfifthbatchcheque;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_14|Inst_Date|-1|10|")
	public static WebElement chequedateforfifthbatchcheque;
	@FindBy(how = How.LINK_TEXT, using ="[H](Vendor-slip)Data entry (Checker)")
	public static WebElement vendorslipdataentrychecker;
	@FindBy(how = How.LINK_TEXT, using ="[T]SAAS File Extract/Upload")
	public static WebElement saasfilextract;
	@FindBy(how = How.LINK_TEXT, using ="[B](Vendor-slip)SAAS File Extract/Upload")
	public static WebElement saasfileupload;
	@FindBy(how = How.LINK_TEXT, using ="(VRS)Waiting for Exception (>=50000) (Maker)")
	public static WebElement waitingforexceptionmaker;
	@FindBy(how = How.LINK_TEXT, using ="[C](Vendor-slip)PWO (>=1L) (Maker)")
	public static WebElement vendorslipmakerforfifthbatch;







	//==========================================6th batch===================================================================================================
	@FindBy(how = How.LINK_TEXT, using ="[Q](VCNS)Reject Repair")
	public static WebElement vcnsrejectreapir;
	@FindBy(how = How.XPATH, using = "//table[@id='ctl00_ContentPlaceHolder1_TabContainer1_TabPanel1_GridView1']/tbody/tr[6]/td[8]")
	public static WebElement statusviewerforsixthbatch;
	@FindBy(how = How.XPATH, using = "//table[@id='ctl00_ContentPlaceHolder1_TabContainer1_TabPanel1_GridView1']/tbody/tr[6]/td[9]")
	public static WebElement totalcountforsixthbatch;
	@FindBy(how = How.XPATH, using = "//table[@id='ctl00_ContentPlaceHolder1_TabContainer1_TabPanel1_GridView1']/tbody/tr[6]/td[10]")
	public static WebElement totalamountforsixthbatch;
	@FindBy(how = How.LINK_TEXT, using ="(VCNS)Waiting for Data Entry(Maker)")
	public static WebElement waitingfordataentrymaker;
	@FindBy(how = How.LINK_TEXT, using ="[W](VCNS)Data entry (Maker)")
	public static WebElement vcnsdataentrymaker;




	//==========================================7th batch===================================================================================================

	@FindBy(how = How.XPATH, using = "//table[@id='ctl00_ContentPlaceHolder1_TabContainer1_TabPanel1_GridView1']/tbody/tr[7]/td[8]")
	public static WebElement statusviewerforseventhhbatch;
	@FindBy(how = How.XPATH, using = "//table[@id='ctl00_ContentPlaceHolder1_TabContainer1_TabPanel1_GridView1']/tbody/tr[7]/td[9]")
	public static WebElement totalcountforseventhbatch;
	@FindBy(how = How.XPATH, using = "//table[@id='ctl00_ContentPlaceHolder1_TabContainer1_TabPanel1_GridView1']/tbody/tr[7]/td[10]")
	public static WebElement totalamountforseventhbatch;
	@FindBy(how = How.LINK_TEXT, using ="[4]Reject Repair(Vendor-CMS With Slip)")
	public static WebElement vendorcmsslip;
	@FindBy(how = How.LINK_TEXT, using ="002007")
	public static WebElement seventhbatch;
	@FindBy(how = How.LINK_TEXT, using ="[G](Vendor-CMS-Slip)Data entry (Maker)")
	public static WebElement vendorcmsslipfordataentrymaker;

	//================INDUSIND BANK OUTWARD=================================================================




	@FindBy(how = How.LINK_TEXT, using ="[5]Status Viewer")
	public static WebElement indusstatusviewer;
	@FindBy(how = How.XPATH, using ="//table[@id='ctl00_ContentPlaceHolder1_TabContainer1_TabPanel1_GridView1']/tbody/tr[1]/td[7]")
	public static WebElement indusstatusviewerforfirstbatch;
	@FindBy(how = How.XPATH, using ="//table[@id='ctl00_ContentPlaceHolder1_TabContainer1_TabPanel1_GridView1']/tbody/tr[1]/td[9]")
	public static WebElement industotalamountforfirstbatch;
	@FindBy(how = How.XPATH, using ="//table[@id='ctl00_ContentPlaceHolder1_TabContainer1_TabPanel1_GridView1']/tbody/tr[1]/td[8]")
	public static WebElement industotalitemcountforfirstbatch;
	@FindBy(how = How.XPATH, using ="//table[@id='ctl00_ContentPlaceHolder1_TabContainer1_TabPanel1_GridView1']/tbody/tr[2]/td[7]")
	public static WebElement indusstatusviewerforsecondbatch;
	@FindBy(how = How.XPATH, using ="//table[@id='ctl00_ContentPlaceHolder1_TabContainer1_TabPanel1_GridView1']/tbody/tr[2]/td[9]")
	public static WebElement industotalamountforsecondbatch;
	@FindBy(how = How.XPATH, using ="//table[@id='ctl00_ContentPlaceHolder1_TabContainer1_TabPanel1_GridView1']/tbody/tr[2]/td[8]")
	public static WebElement industotalitemcountforsecondbatch;
	@FindBy(how = How.XPATH, using ="//table[@id='ctl00_ContentPlaceHolder1_TabContainer1_TabPanel1_GridView1']/tbody/tr[3]/td[7]")
	public static WebElement indusstatusviewerforthirdbatch;
	@FindBy(how = How.XPATH, using ="//table[@id='ctl00_ContentPlaceHolder1_TabContainer1_TabPanel1_GridView1']/tbody/tr[3]/td[9]")
	public static WebElement industotalamountforthirdbatch;
	@FindBy(how = How.XPATH, using ="//table[@id='ctl00_ContentPlaceHolder1_TabContainer1_TabPanel1_GridView1']/tbody/tr[3]/td[8]")
	public static WebElement industotalitemcountforthirdbatch;
	@FindBy(how = How.LINK_TEXT, using ="[2]Reject Repair Batch Balancing")
	public static WebElement indusrrbatchbalancing;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_1|AccountNo|-1|14|")
	public static WebElement indusaccountno;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_2|AccountNo|-1|15|")
	public static WebElement indusaccountnoforsecondbatch;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_2|Amount|-1|14|0")
	public static WebElement indusamountforslip;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_3|Amount|-1|14|0")
	public static WebElement indusamountforsecondbatchslip;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_7|Amount|-1|14|0")
	public static WebElement indusamountforcheque;
	@FindBy(how = How.XPATH, using ="//*[@id='ctl00_ContentPlaceHolder1_tv_Instrumentst1']/font")
	public static WebElement indusslipinsertionforcheque;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_btn_DummySlip")
	public static WebElement indusdummyslipinsertion;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_btn_Delete")
	public static WebElement indusdeletebutton;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_UnDelete")
	public static WebElement indusundeletebutton;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_1|AccountNo|-1|14|")
	public static WebElement indusaccountnoforslip;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_2|Amount|-1|14|0")
	public static WebElement indusamountforslipforfirstbatch;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_3|SortCode|3|3|0")
	public static WebElement indusbankcode;










	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_8|Inst_Date|-1|10|")
	public static WebElement induschequedate;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_9|DraweeName|-1|30|")
	public static WebElement indusdraweebankname;
	/*@FindBy(how = How.XPATH, using ="//*[@id="ctl00_ContentPlaceHolder1_tv_Instrumentst4"]/font")
	public static WebElement indusdraweebankname;*/



	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_ddl_ChangeType")
	public static WebElement induscmsslipinsertionforsecondbatch;
	@FindBy(how = How.LINK_TEXT, using ="[3]Super Balancing")
	public static WebElement indussuperbalancing;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_2|SlipNo|-1|14|0")
	public static WebElement indusslipno;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_3|AccountNo|-1|14|")
	public static WebElement indusaccountnoforbatch2;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_4|Amount|-1|14|0")
	public static WebElement indusamount;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_5|PickUPPoint|-1|50|")
	public static WebElement induspickuppoint;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_btn_ForceSave")
	public static WebElement forcesavebutton;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_2|SlipNo|-1|10|")
	public static WebElement indusslipnofirthirdbatch;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_3|AccountNo|-1|15|")
	public static WebElement indusaccountnonofirthirdbatch;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_4|Amount|-1|14|0")
	public static WebElement indusamountforfirthirdbatch;




	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_6|PickUPLoc|-1|50|")
	public static WebElement induspickuplocation;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_7|DivisionCode|-1|16|")
	public static WebElement indusdivisioncode;
	@FindBy(how = How.XPATH, using ="/html/body/div[1]/div[3]/div/button/span")
	public static WebElement ok;
	@FindBy(how = How.LINK_TEXT, using ="[C]Credit Card Balancing")
	public static WebElement creditcardbalancing;
	@FindBy(how = How.LINK_TEXT, using ="[2]Credit Card Keying")
	public static WebElement creditcardkeying;
	@FindBy(how = How.LINK_TEXT, using ="[7]Document Search")
	public static WebElement indusdocumentsearch;
	@FindBy(how = How.LINK_TEXT, using ="001002")
	public static WebElement indussecondbatch;
	@FindBy(how = How.LINK_TEXT, using ="001003")
	public static WebElement industhirdbatch;
	@FindBy(how = How.LINK_TEXT, using ="[8]Reports")
	public static WebElement report;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_lblInstCount")
	public static WebElement totalitemcount;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_lblInstAmount")
	public static WebElement totalamountfordocsearch;
	@FindBy(how = How.LINK_TEXT, using ="Search Criteria")
	public static WebElement searchcriteria;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDeleteReason")
	public static WebElement ignoreIQAreason;





	//---------------------------Bhutan Bank_-------------------------------------------------

	@FindBy(how = How.XPATH, using = "//table[@id='ctl00_ContentPlaceHolder1_TabContainer1_TabPanel1_GridView1']/tbody/tr[1]/td[7]")
	public static WebElement bhutan_statusviewerfirstbatch;
	@FindBy(how = How.XPATH, using = "//table[@id='ctl00_ContentPlaceHolder1_TabContainer1_TabPanel1_GridView1']/tbody/tr[2]/td[7]")
	public static WebElement bhutan_statusviewersecondbatch;
	@FindBy(how = How.XPATH, using = "//table[@id='ctl00_ContentPlaceHolder1_TabContainer1_TabPanel1_GridView1']/tbody/tr[3]/td[7]")
	public static WebElement bhutan_statusviewerthirdbatch;
	@FindBy(how = How.XPATH, using = "//table[@id='ctl00_ContentPlaceHolder1_TabContainer1_TabPanel1_GridView1']/tbody/tr[4]/td[7]")
	public static WebElement bhutan_statusviewerfourthbatch;
	@FindBy(how = How.XPATH, using = "//table[@id='ctl00_ContentPlaceHolder1_TabContainer1_TabPanel1_GridView1']/tbody/tr[1]/td[8]")
	public static WebElement bhutan_statusviewertotalcountforfirstbatch;

	@FindBy(how = How.XPATH, using = "//table[@id='ctl00_ContentPlaceHolder1_TabContainer1_TabPanel1_GridView1']/tbody/tr[2]/td[8]")
	public static WebElement bhutan_statusviewertotalcountforsecondbatch;
	@FindBy(how = How.XPATH, using = "//table[@id='ctl00_ContentPlaceHolder1_TabContainer1_TabPanel1_GridView1']/tbody/tr[3]/td[8]")
	public static WebElement bhutan_statusviewertotalcountforthirdbatch;
	@FindBy(how = How.XPATH, using = "//table[@id='ctl00_ContentPlaceHolder1_TabContainer1_TabPanel1_GridView1']/tbody/tr[4]/td[8]")
	public static WebElement bhutan_statusviewertotalcountforfourthbatch;
	@FindBy(how = How.XPATH, using = "//table[@id='ctl00_ContentPlaceHolder1_TabContainer1_TabPanel1_GridView1']/tbody/tr[1]/td[9]")
	public static WebElement bhutan_statusviewertotalamountforfirstbatch;
	@FindBy(how = How.XPATH, using = "//table[@id='ctl00_ContentPlaceHolder1_TabContainer1_TabPanel1_GridView1']/tbody/tr[2]/td[9]")
	public static WebElement bhutan_statusviewertotalamountforsecondbatch;
	@FindBy(how = How.XPATH, using = "//table[@id='ctl00_ContentPlaceHolder1_TabContainer1_TabPanel1_GridView1']/tbody/tr[3]/td[9]")
	public static WebElement bhutan_statusviewertotalamountforthirdbatch;
	@FindBy(how = How.XPATH, using = "//table[@id='ctl00_ContentPlaceHolder1_TabContainer1_TabPanel1_GridView1']/tbody/tr[4]/td[9]")
	public static WebElement bhutan_statusviewertotalamountforfourthbatch;

	@FindBy(how = How.LINK_TEXT, using = "[2]Reject Repair Batch Balancing")
	public static WebElement bhutan_RejectRepairBatchBalancing;

	@FindBy(how = How.LINK_TEXT, using = "011001")
	public static WebElement bhutan_firstbatch;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_1|AccountNo|-1|16|")
	public static WebElement bhutan_depositaccountnoforslip;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_2|Amount|-1|13|0")
	public static WebElement bhutan_amountforslip;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_2|SortCode|0|2|0")
	public static WebElement bhutan_citycode;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_3|SortCode|2|3|0")
	public static WebElement bhutan_bankcode;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_4|SortCode|5|3|0")
	public static WebElement bhutan_branchcode;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_5|SortCode|8|1|0")
	public static WebElement bhutan_cdk;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_7|Amount|-1|13|0")
	public static WebElement amountforfirstcheque;
	@FindBy(how = How.LINK_TEXT, using = "[3]Super Balancing")
	public static WebElement bhutan_superbalancing;
	@FindBy(how = How.LINK_TEXT, using = "[5]Document Search")
	public static WebElement bhutan_documentsearch;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_lblInstCount")
	public static WebElement bhutan_totalitemcount;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_lblInstAmount")
	public static WebElement bhutan_totalamount;
	@FindBy(how = How.LINK_TEXT, using = "[R]Reports")
	public static WebElement bhutan_reports;

	//-------------------------------------------------bandhan bank-----------------------------------

	@FindBy(how = How.LINK_TEXT, using = "[1]DD Keying")
	public static WebElement bandhan_ddkeying;

	@FindBy(how = How.LINK_TEXT, using = "000001")
	public static WebElement bandhanfirstbatch;
	@FindBy(how = How.LINK_TEXT, using = "000002")
	public static WebElement bandhansecondbatch;
	@FindBy(how = How.LINK_TEXT, using = "000003")
	public static WebElement bandhanthirdbatch;
	@FindBy(how = How.LINK_TEXT, using = "000004")
	public static WebElement bandhanfourthbatch;
	@FindBy(how = How.LINK_TEXT, using = "000005")
	public static WebElement bandhanfifthbatch;
	@FindBy(how = How.LINK_TEXT, using = "000006")
	public static WebElement bandhansixthbatch;
	@FindBy(how = How.LINK_TEXT, using ="[2]Payee Name Keying And AUX")
	public static WebElement bandhanpayeenamekeyingmodule;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_6|PESequence|-1|15|")
	public static WebElement bandhan_sequenceno;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_1|Payeename|-1|50|")
	public static WebElement bandhanpayeenamekeying;
	@FindBy(how = How.LINK_TEXT, using = "[3]Verifier Maker(Low)")
	public static WebElement verifiermakerlowmodule;
	@FindBy(how = How.LINK_TEXT, using = "[Q]Verifier Maker(Medium)")
	public static WebElement verifiermakermediummodule;
	@FindBy(how = How.LINK_TEXT, using = "[W]Verifier Maker(High)")
	public static WebElement verifiermakerhighmodule;
	@FindBy(how = How.LINK_TEXT, using = "[6]Verifier Checker(High)")
	public static WebElement verifiercheckerhighmodule;


	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_lblAccountNoVal")
	public static WebElement bandhanaccountno;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_btnAccept")
	public static WebElement bandhanacceptrecord;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_btnReject")
	public static WebElement bandhanrejectrecord;
	@FindBy(how = How.LINK_TEXT, using = "01")
	public static WebElement rejectreasoncode;
	@FindBy(how = How.LINK_TEXT, using = "[8]Reports")
	public static WebElement reportmodule;
	@FindBy(how = How.LINK_TEXT, using = "[6]Reports")
	public static WebElement indusreportmodule;
	@FindBy(how = How.LINK_TEXT, using = "[7]Document Search")
	public static WebElement bandhandocumentsearch;
	@FindBy(how = How.LINK_TEXT, using = "[M]Manual Return")
	public static WebElement bandhanmanualreturn;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtChequeno")
	public static WebElement docsearchchequeno;

	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtAccountNo")
	public static WebElement docsearchaccountno;



	@FindBy(how = How.LINK_TEXT, using = "000012")
	public static WebElement bandhanreturnchequeno;
	@FindBy(how = How.LINK_TEXT, using = "006208")
	public static WebElement bandhanoutwardreturnchequeno;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_btnSearch")
	public static WebElement searchbutton;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_dplReturnReasons")
	public static WebElement manualreturnreason;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_btnMarkReturn")
	public static WebElement markreturn;

	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_grdviwMarkedRecords_ctl02_RadioButton2")
	public static WebElement selectrecordtodounmarkcheque;


	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_btnUnMark")
	public static WebElement unmarkreturn;



	@FindBy(how = How.XPATH, using ="//table[@id='ctl00_ContentPlaceHolder1_TabContainer1_TabPanel1_GridView1']/tbody/tr[1]/td[8]")
	public static WebElement expectedstatusforbandhanbank;
	@FindBy(how = How.XPATH, using ="//table[@id='ctl00_ContentPlaceHolder1_TabContainer1_TabPanel1_GridView1']/tbody/tr[1]/td[9]")
	public static WebElement expectedtotalcountforbandhanbank;
	@FindBy(how = How.XPATH, using ="//table[@id='ctl00_ContentPlaceHolder1_TabContainer1_TabPanel1_GridView1']/tbody/tr[1]/td[10]")
	public static WebElement expectedtotalamountforbandhanbank;
	@FindBy(how = How.LINK_TEXT, using = "[2]Reject Repair Batch Balancing")
	public static WebElement BandhanRejectRepairBatchBalancing;
	@FindBy(how = How.LINK_TEXT, using = "001001")
	public static WebElement Bandhanbatchno;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_1|AccountNo|-1|14|")
	public static WebElement bandhandepositaccountnoforslip;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_2|Amount|-1|13|0")
	public static WebElement bandhandepositamountforslip;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_7|Amount|-1|13|0")
	public static WebElement bandhanamountforcheque;
	@FindBy(how = How.LINK_TEXT, using = "[3]Super Balancing")
	public static WebElement Bandhansuperbalancing;
	@FindBy(how = How.LINK_TEXT, using = "[V]Verifier")
	public static WebElement BandhanVerifiermodule;
	@FindBy(how = How.LINK_TEXT, using = "[5]Document Search")
	public static WebElement Documentsearchmodule;
	@FindBy(how = How.LINK_TEXT, using = "[6]Document Manager")
	public static WebElement Documentmanagermodule;
	@FindBy(how = How.LINK_TEXT, using ="[R]Reports")
	public static WebElement bandhanreport;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_lblReportName")
	public static WebElement reportname;

	//-----------------------------------------------KVB BANK---------------------------------------------------------

	@FindBy(how = How.LINK_TEXT, using ="[3]Reject Repair(RC Flow)")
	public static WebElement RRRCFlow;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_1|ChequeNo|-1|6|0")
	public static WebElement KVBchequeno;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_2|SortCode|0|3|0")
	public static WebElement KVBcitycode;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_3|SortCode|3|3|0")
	public static WebElement KVBbankcode;
	@FindBy(how = How.ID, using ="cctl00_ContentPlaceHolder1_txtDataEntry_4|SortCode|6|3|0")
	public static WebElement KVBbranchcode;

	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_5|BaseNo|-1|6|0")
	public static WebElement KVBbaseno;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_6|TC|-1|2|0")
	public static WebElement KVBtranscode;
	@FindBy(how = How.LINK_TEXT, using ="[6]Batch Balancing (RBNL-LBNR)")
	public static WebElement KVBrbnllbnr;
	@FindBy(how = How.LINK_TEXT, using ="001002")
	public static WebElement KVBsecondbatch;
	@FindBy(how = How.LINK_TEXT, using ="001003")
	public static WebElement KVBthirdbatch;
	@FindBy(how = How.LINK_TEXT, using ="001001")
	public static WebElement KVBfirstbatch;

	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_btnShowAll")
	public static WebElement KVBshowallbutton;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_btnSubmit")
	public static WebElement kvbsubmitbatch;
	@FindBy(how = How.LINK_TEXT, using ="[2]Account Keying")
	public static WebElement KVBaccountkeying;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_1|AccountNo|0|4|0")
	public static WebElement kvbbrcode;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_2|AccountNo|4|3|0")
	public static WebElement kvbproductcode;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_3|AccountNo|7|9|0")
	public static WebElement kvbaccountno;
	@FindBy(how = How.LINK_TEXT, using ="[5]Reject Repair(Without Slip Flow)")
	public static WebElement KVBRRwithoutslipflow;
	@FindBy(how = How.LINK_TEXT, using ="[8]Super Balancing(Without Slip Flow)")
	public static WebElement KVBsuperbalancingwithoutslipflow;
	@FindBy(how = How.LINK_TEXT, using ="[W]Drawee Name Keying")
	public static WebElement KVBdraweenamekeyingmodule;
	@FindBy(how = How.LINK_TEXT, using ="[4]Reject Repair(Slip Flow)")
	public static WebElement KVBRRtslipflow;
	@FindBy(how = How.LINK_TEXT, using ="[7]Super Balancing(Slip Flow)")
	public static WebElement KVBsuperbalancingslipflow;




	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_11|DraweeName|-1|25|")
	public static WebElement kvbdraweebankname;

	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_1|ChequeNo|-1|6|0")
	public static WebElement kvbchequenoforsecondbatch;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_7|Amount|-1|13|00")
	public static WebElement kvbamountforsecondbatch;

	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_2|SortCode|0|3|0")
	public static WebElement kvbcitycodeforsecondbatch;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_3|SortCode|3|3|0")
	public static WebElement kvbbankcodeforsecondbatch;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_4|SortCode|6|3|0")
	public static WebElement kvbbranchcodeforsecondbatch;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_1|AccountNo|0|4|0")
	public static WebElement kvbbrcodeforslipflow;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_2|AccountNo|4|3|0")
	public static WebElement kvbproductcodeforslipflow;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_3|AccountNo|7|9|0")
	public static WebElement kvbaccountnoforslipflow;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_4|Amount|-1|13|0")
	public static WebElement kvbamountforslipflow;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_1|ChequeNo|-1|6|0")
	public static WebElement kvbchequenoforslipflow;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_2|SortCode|0|3|0")
	public static WebElement kvbcitycodeforslipflow;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_3|SortCode|3|3|0")
	public static WebElement kvbbankcodeforslipflow;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_4|SortCode|6|3|0")
	public static WebElement kvbbranchcodeforslipflow;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_7|Amount|-1|13|0")
	public static WebElement kvbamountforslipflowcheque;
	@FindBy(how = How.LINK_TEXT, using ="[R]Reports")
	public static WebElement kvbreport;
	@FindBy(how = How.LINK_TEXT, using = "[D]Document Search")
	public static WebElement kvbdocumentsearch;




	//-------------------------------------------------------------------------------------------------------------

	@FindBy(how = How.LINK_TEXT, using ="[V]Status Viewer")
	public static WebElement obcstatusviewer;
	@FindBy(how = How.LINK_TEXT, using ="[R]Reject Repair")
	public static WebElement obcrejectrepair;
	@FindBy(how = How.LINK_TEXT, using ="[B]Batch Balancing (RBNL-LBNR)")
	public static WebElement obcrejectrepairobclbnrtbl;
	@FindBy(how = How.LINK_TEXT, using ="[S]Super Balancing")
	public static WebElement obcsuperbaancing;
	@FindBy(how = How.LINK_TEXT, using ="[D]Document Search")
	public static WebElement obcdocumentsearch;
	@FindBy(how = How.LINK_TEXT, using ="[O]Reports")
	public static WebElement obcreports;
	@FindBy(how = How.LINK_TEXT, using ="[M]Manual Return")
	public static WebElement obcmanualreturn;
	@FindBy(how = How.LINK_TEXT, using ="[E]Paper Tracking")
	public static WebElement obcpapertracking;
	@FindBy(how = How.XPATH, using = "//table[@id='ctl00_ContentPlaceHolder1_TabContainer1_TabPanel1_GridView1']/tbody/tr[1]/td[7]")
	public static WebElement obcstatusviewerforfirstbatch;
	@FindBy(how = How.XPATH, using = "//table[@id='ctl00_ContentPlaceHolder1_TabContainer1_TabPanel1_GridView1']/tbody/tr[2]/td[7]")
	public static WebElement obcstatusviewerforsecondbatch;
	@FindBy(how = How.XPATH, using = "//table[@id='ctl00_ContentPlaceHolder1_TabContainer1_TabPanel1_GridView1']/tbody/tr[3]/td[7]")
	public static WebElement obcstatusviewerforthirdbatch;
	@FindBy(how = How.XPATH, using = "//table[@id='ctl00_ContentPlaceHolder1_TabContainer1_TabPanel1_GridView1']/tbody/tr[1]/td[8]")
	public static WebElement obctotalcountforfirstbatch;
	@FindBy(how = How.XPATH, using = "//table[@id='ctl00_ContentPlaceHolder1_TabContainer1_TabPanel1_GridView1']/tbody/tr[1]/td[9]")
	public static WebElement obctotalamountforfirstbatch;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_1|ChequeNo|-1|6|0")
	public static WebElement obcchequeno;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_2|SortCode|0|3|0")
	public static WebElement obccitycode;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_3|SortCode|3|3|0")
	public static WebElement obcbankcode;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_4|SortCode|6|3|0")
	public static WebElement obcbranchcode;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_5|BaseNo|-1|6|0")
	public static WebElement obcbaseno;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_6|TC|-1|2|0")
	public static WebElement obctranscode;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_btnMark")
	public static WebElement obcmarkbutton;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_chk_MICR_ToggleButton")
	public static WebElement MICRbutton;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_GridView1_ctl02_chkSel")
	public static WebElement selectinstrumenttogeneratereport;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_btnReportPrint")
	public static WebElement generatereport;

	//-----------------------------------------------------------------------------------------------------------

	@FindBy(how = How.LINK_TEXT, using ="[1]A/c No and Date Keying")
	public static WebElement obcaccountanddatekeying;
	@FindBy(how = How.LINK_TEXT, using ="[2]Payee Name Keying And AUX")
	public static WebElement obcpayeenamekeying;

	@FindBy(how = How.LINK_TEXT, using ="[3]Verifier Keying")
	public static WebElement obcverifierkeying;
	@FindBy(how = How.LINK_TEXT, using ="[5]Draft Processing")
	public static WebElement obcdraftprocessing;
	@FindBy(how = How.LINK_TEXT, using ="[R]Inward Reports")
	public static WebElement obcinwardreport;

	@FindBy(how = How.LINK_TEXT, using ="[6]Document Search")
	public static WebElement obcdocumentsearchmodule;
	@FindBy(how = How.LINK_TEXT, using ="[7]Manual Return")
	public static WebElement obcmanualreturnforinward;
	@FindBy(how = How.LINK_TEXT, using ="[8]Status Viewer")
	public static WebElement obcstatusviewerforinward;
	@FindBy(how = How.LINK_TEXT, using ="000001")
	public static WebElement obcinwardfirstbatch;
	@FindBy(how = How.LINK_TEXT, using ="000002")
	public static WebElement obcinwardsecondbatch;
	@FindBy(how = How.LINK_TEXT, using ="000003")
	public static WebElement obcinwardthirdbatch;

	@FindBy(how = How.LINK_TEXT, using ="[3]Verifier Keying")
	public static WebElement obcinwardverifiermodule;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_TabContainer1_Tab_8_10myDropDownLeft5")
	public static WebElement obcinwardselectdropdownforverifier;

	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_1|AccountNo|-1|14|0")
	public static WebElement obcinwardaccountno;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_2|Inst_Date|-1|10|")
	public static WebElement obcchequedate;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_2|Branchcode|-1|6|")
	public static WebElement obcbranchcodefordataprocessing;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_3|Inst_Date|-1|10|")
	public static WebElement obcchequedatefordatefordraftprocessing;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_chk_IgnoreIQA_ToggleButton")
	public static WebElement ignoreIQA;

	//==================================ICICI INWARD=================================================================

	@FindBy(how = How.LINK_TEXT, using = "000001")
	public static WebElement iciciinwardfirstbatch;

	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_1|AccountNo|0|4| ")
	public static WebElement iciciinwardsolid;


	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_2|AccountNo|4|2|0")
	public static WebElement iciciinwardproductcode;





	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_3|AccountNo|6|6|0")
	public static WebElement iciciinwardsancode;






	@FindBy(how = How.LINK_TEXT, using = "000002")
	public static WebElement iciciinwardsecondbatch;
	@FindBy(how = How.LINK_TEXT, using = "000008")
	public static WebElement iciciinwardeightbatch;
	@FindBy(how = How.LINK_TEXT, using = "000011")
	public static WebElement iciciinwardeleventhbatch;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_btnSubmitBatch")
	public static WebElement iciciinwardsubmitbatch;

	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_btnCancel")
	public static WebElement allrecordnothandle;


	@FindBy(how = How.LINK_TEXT, using = "[1]A/c No. / Folio No. Keying")
	public static WebElement iciciinwardaccfolionokeying;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_1|AccountNo|0|4| ")
	public static WebElement iciciinwardsolidforacckeying;
	@FindBy(how = How.LINK_TEXT, using = "[2]SV – L1 (< 50K)")
	public static WebElement iciciinwardsvlessthan50k;
	@FindBy(how = How.LINK_TEXT, using = "[3]SV – L1 ( >= 50K)")
	public static WebElement iciciinwardsvmorethan50k;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtRemarks")
	public static WebElement iciciinwardremark;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_btnAccept")
	public static WebElement iciciinwardacceptbutton;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_btnReject")
	public static WebElement iciciinwardescalatebutton;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_btnCancel")
	public static WebElement iciciinwardgovernmentcheque;
	@FindBy(how = How.LINK_TEXT, using = "[4]SV – Escalation")
	public static WebElement iciciinwardsvescalation;
	@FindBy(how = How.LINK_TEXT, using = "[R]Inward Reports")
	public static WebElement iciciinwardreportmodule;
	@FindBy(how = How.LINK_TEXT, using = "[M]Manual Return")
	public static WebElement iciciinwardmanualreturnmodule;
	@FindBy(how = How.LINK_TEXT, using = "[9]Document Search")
	public static WebElement iciciinwarddocumentsearchmodule;
	@FindBy(how = How.LINK_TEXT, using = "[8]SV / TV  – L2 (OFFLINE)")
	public static WebElement iciciinwardtvofflinemodule;
	@FindBy(how = How.LINK_TEXT, using = "[7]TV – Escalation")
	public static WebElement iciciinwardtvesclation;
	@FindBy(how = How.LINK_TEXT, using = "[6]TV – [Weath and Others]")
	public static WebElement iciciinwardwealthandothermodule;

	@FindBy(how = How.LINK_TEXT, using = "[M]Advice Marking (OFFLINE)")
	public static WebElement iciciinwardadvicemarkingoffline;
	@FindBy(how = How.LINK_TEXT, using = "[5]TV – [GPC]")
	public static WebElement iciciinwardgpcmodule;
	@FindBy(how = How.LINK_TEXT, using ="[S]Status Viewer")
	public static WebElement iciciinwardstatusviewer;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_btnShowAllLbnr")
	public static WebElement showallrecordinlbnr;

	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_btnDelete")
	public static WebElement deletebuttoninlbnrtbl;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_gvSecond_ctl02_btnSave")
	public static WebElement saverecordinlbnrtbl;












	//==================================CUB OUTWARD=================================================================

	@FindBy(how = How.LINK_TEXT, using ="[D]CMS Data Entry")
	public static WebElement cuboutwardcmsdataentry;
	@FindBy(how = How.LINK_TEXT, using ="[4]Status Viewer")
	public static WebElement cuboutwardstatusviewer;
	@FindBy(how = How.LINK_TEXT, using ="[S]Super Balancing")
	public static WebElement cuboutwardsuperbalancing;

	@FindBy(how = How.LINK_TEXT, using ="[K]Super Balancing (Kiosk)")
	public static WebElement cuboutwardsuperbalancingkisok;



	@FindBy(how = How.LINK_TEXT, using ="001002")
	public static WebElement cuboutwardsecondbatch;

	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_2|Challan_Number|-1|10|")
	public static WebElement cuboutwardchallanno;

	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_3|Challan_Date|-1|10|")
	public static WebElement cuboutwardchallandate;




	@FindBy(how = How.LINK_TEXT, using ="[2]Reject Repair Batch Balancing")
	public static WebElement cuboutwardrejectrepairbatchbalancing;

	@FindBy(how = How.LINK_TEXT, using ="[8]Reject Repair Batch Balancing (Kiosk)")
	public static WebElement cuboutwardrejectrepairbatchbalancingforkiosk;




	@FindBy(how = How.LINK_TEXT, using ="[5]Document Search")
	public static WebElement cuboutwarddocumentsearch;
	@FindBy(how = How.LINK_TEXT, using ="[6]Reports")
	public static WebElement cuboutwardreports;

	@FindBy(how = How.LINK_TEXT, using ="[7]Manual Return")
	public static WebElement cuboutwardmanualreturn;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_1|AccountNo|-1|15|")
	public static WebElement cuboutwarddepositaccountnoforslip;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_2|Amount|-1|13|0")
	public static WebElement cuboutwardamountforslip;
	@FindBy(how = How.LINK_TEXT, using ="001001")
	public static WebElement cuboutwardfirstbatch;

	@FindBy(how = How.LINK_TEXT, using ="000001")
	public static WebElement cuboutwardkioskfirstbatch;


	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_1|ChequeNo|-1|6|0")
	public static WebElement cuboutwardchequeno;

	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_2|SortCode|0|3|0")
	public static WebElement cuboutwardcitycode;

	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_3|SortCode|3|3|0")
	public static WebElement cuboutwardbankcode;

	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_4|SortCode|6|3|0")
	public static WebElement cuboutwardbranchcode;

	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_5|BaseNo|-1|6|0")
	public static WebElement cuboutwardbaseno;

	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_6|TC|-1|2|0")
	public static WebElement cuboutwardtccode;





	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_7|Amount|-1|13|0")
	public static WebElement cuboutwardamountforcheque;

	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_8|Inst_Date|-1|10|")
	public static WebElement cuboutwardinstrumentdate;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_9|DraweeName|-1|20|")
	public static WebElement cuboutwarddrawername;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_btn_DummySlip")
	public static WebElement dummyslip;

	//====================================CUB INWARD========================================================
	@FindBy(how = How.LINK_TEXT, using ="[1]SAN Number Keying")
	public static WebElement cubinwardsannumberkeying;
	@FindBy(how = How.LINK_TEXT, using ="[3]Payee Name Keying")
	public static WebElement cubinwardpayeenamekeyingmodule;
	@FindBy(how = How.LINK_TEXT, using ="[8]Document Search(Backup)")
	public static WebElement cubinwarddocumentsearchbackupmodule;
	@FindBy(how = How.LINK_TEXT, using ="[8]Manual Return")
	public static WebElement cubinwardmanualreturnmodule;
	@FindBy(how = How.LINK_TEXT, using ="[9]Document Search")
	public static WebElement cubinwarddocumentsearchmodule;
	@FindBy(how = How.LINK_TEXT, using ="[R]Inward Reports")
	public static WebElement cubinwardreportmodule;

	@FindBy(how = How.LINK_TEXT, using ="[7]Reports")
	public static WebElement boiinwardreportmodule;

	@FindBy(how = How.LINK_TEXT, using ="[4]Manual Return")
	public static WebElement boimanualreturn;



	@FindBy(how = How.LINK_TEXT, using ="[S]Status Viewer")
	public static WebElement cubinwardstatusviewermodule;
	@FindBy(how = How.LINK_TEXT, using ="[4]Verifier Keying")
	public static WebElement cubinwardverifiermodule;

	@FindBy(how = How.LINK_TEXT, using = "000001")
	public static WebElement cubinwardfirstbatch;
	@FindBy(how = How.LINK_TEXT, using = "000002")
	public static WebElement cubinwardsecondbatch;
	@FindBy(how = How.LINK_TEXT, using = "000005")
	public static WebElement cubinwardfifthbatch;
	@FindBy(how = How.LINK_TEXT, using = "000007")
	public static WebElement cubinwardseventhbatch;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_1|Payeename|-1|25|")
	public static WebElement cubinwardpayeename;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_lblAccountNoVal")
	public static WebElement cubinwardaccountnoforverifiermodule;

	@FindBy(how = How.ID, using ="__tab_ctl00_ContentPlaceHolder1_TabContainer1_Tab_2")
	public static WebElement cubinwardchequesearch;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_TabContainer1_Tab_2_01myTextBoxLeft0")
	public static WebElement docsearchchequenotoenter;


	@FindBy(how = How.ID, using ="__tab_ctl00_ContentPlaceHolder1_TabContainer1_Tab_3")
	public static WebElement cubinwardgovtchequesearch;
	@FindBy(how = How.LINK_TEXT, using = "00")
	public static WebElement cubinwardrejectreason;



	//-------------------------------TJSB Outward------------------------------------------------------------------------

	@FindBy(how = How.LINK_TEXT, using = "001001")
	public static WebElement tjsboutwardbatchno;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_1|AccountNo|0|3|0")
	public static WebElement tjsboutwardbranchcode;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_2|AccountNo|3|4|0")
	public static WebElement tjsboutwardproductcode;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_3|AccountNo|7|8|0")
	public static WebElement tjsboutwardaccountno;
	@FindBy(how = How.LINK_TEXT, using = "[2]Account Keying")
	public static WebElement tjsboutwardaccountkeyingmodule;
	@FindBy(how = How.LINK_TEXT, using = "[3]Reject Repair")
	public static WebElement tjsboutwardrejectrepairmodule;

	@FindBy(how = How.LINK_TEXT, using = "[3]Draweename Keying")
	public static WebElement tjsboutwarddraweenamekeyingmodule;

	@FindBy(how = How.LINK_TEXT, using = "[6]Status Viewer")
	public static WebElement tjsboutwardstatusviewer;
	@FindBy(how = How.LINK_TEXT, using = "[7]Manual Return")
	public static WebElement tjsboutwardmanualreturnmodule;
	@FindBy(how = How.LINK_TEXT, using = "[5]Document Search")
	public static WebElement tjsboutwarddocsearchmodule;
	@FindBy(how = How.LINK_TEXT, using = "[8]Reports")
	public static WebElement tjsboutwardreportsmodule;

	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_11|PayeeName|-1|20|")
	public static WebElement tjsboutwarddraweebankname;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_7|Amount|-1|13|0")
	public static WebElement tjsboutwardamount;
	@FindBy(how = How.LINK_TEXT, using = "[4]Super Balancing")
	public static WebElement tjsboutwardsuperbalancingmodule;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_chkHighValue")
	public static WebElement tjsboutwardselecthighvaluetag;


	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_TabContainer1_Tab_7_01myTextBoxRight0")
	public static WebElement tjsboutwarddocsearchchequenoinsecondtab;

	@FindBy(how = How.ID, using = "__tab_ctl00_ContentPlaceHolder1_TabContainer1_Tab_3")
	public static WebElement tjsboutwardspecialchequedocsearch;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_btnSubmit")
	public static WebElement tjsboutwardsubmitbatch;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_btn_ImageTag")
	public static WebElement tjsboutwardimagetagbutton;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_cb_ImageTag")
	public static WebElement tjsboutwardimagetagcheckbox;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_2|SortCode|0|3|0")
	public static WebElement tjsboutwardcitycode;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_3|SortCode|3|3|0")
	public static WebElement tjsboutwardbankcode;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_4|SortCode|6|3|0")
	public static WebElement tjsboutwardbranchcodeforrr;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_5|BaseNo|0|6|0")
	public static WebElement tjsboutwardbaseno;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_6|TC|-1|2|0")
	public static WebElement tjsboutwardtccode;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_8|AccountNo|0|3|0")
	public static WebElement tjsboutwardbrcode;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_9|AccountNo|3|4|0")
	public static WebElement tjsboutwardproductcodeforrr;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_10|AccountNo|7|8|0")
	public static WebElement tjsboutwardaccountnoforrr;

	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_ddl_ChangeType")
	public static WebElement tjsboutwardchangechequetype;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_5|BaseNo|-1|7|0")
	public static WebElement tjsboutwardbasenoforgovtcheque;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_6|TC|-1|3|0")
	public static WebElement tjsboutwardtcforgovtcheque;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_lblMessage")
	public static WebElement tjsboutwardbatchsubmitmessage;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_1|ChequeNo|-1|6|0")
	public static WebElement tjsboutwardchequeno;
	@FindBy(how = How.ID, using = "rdSelect")
	public static WebElement tjsboutwardselectinstrumenttodelete;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_btn_Delete")
	public static WebElement tjsboutwarddeleteinstrument;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_UnDelete")
	public static WebElement tjsboutwardundeleteinstrument;

	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_TabContainer1_Tab_2_myChequeBox1")
	public static WebElement tjsboutwardselectcheckbox;


	//REJECT REPAIR FOR CMS SLIP FLOW

	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_1|ChequeNo|-1|6|0")
	public static WebElement cmsslipchequeno;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_2|SortCode|0|3|0")
	public static WebElement cmsslipcitycode;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_3|SortCode|3|3|0")
	public static WebElement cmsslipbankcode;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_4|SortCode|6|3|0")
	public static WebElement cmsslipbranchcode;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_5|BaseNo|-1|6|0")
	public static WebElement cmsslipbaseno;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_6|TC|-1|2|0")
	public static WebElement cmssliptccode;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_btn_Delete")
	public static WebElement deletebuttoninrr;


	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_UnDelete")
	public static WebElement undeletebuttoninrr;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_1|CustCode|-1|8|")
	public static WebElement custcodeforcreditcard;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_2|ProductCode|-1|6|")
	public static WebElement productcodeforcreditcard;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_3|HierarchyCode|-1|6|")
	public static WebElement hiercodeforcreditcard;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_4|CustomerName|-1|25|")
	public static WebElement customernamecreditcard;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_6|PickCode|-1|6|")
	public static WebElement pickuppointforcreditcard;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_5|SubCustomerCode|-1|6|")
	public static WebElement subcustomercodeforcreditcard;


	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_7|Amount|-1|18|0")
	public static WebElement amountforcreditcard;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_8|InstCount|-1|6|0")
	public static WebElement itemcountforcreditcard;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_9|AddInf1|-1|50|")
	public static WebElement address1forcreditcard;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_10|AddInf1|-1|50|")
	public static WebElement address2forcreditcard;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_1|Inst_Date|-1|10|")
	public static WebElement icicioutchequedatefordataentrymakerfourtbatchforschoolfees;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_2|Amount|-1|18|0")
	public static WebElement icicioutamountfordataentrymakerfourtbatchforschoolfees;

	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_11|AddInf1|-1|50|")
	public static WebElement address3forcreditcard;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_12|AddInf1|-1|50|")
	public static WebElement address4forcreditcard;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_13|AddInf1|-1|50|")
	public static WebElement address5forcreditcard;

	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_14|AccountNo|-1|12|")
	public static WebElement accountnoforcreditcard;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_15|DepSlipNo|-1|10|0")
	public static WebElement slipnoforcreditcard;

	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_1|AccountName|-1|25|")
	public static WebElement payeenameforcreditcard;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_2|DraweeName|-1|18|")
	public static WebElement drawernameforcreditcard;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_3|Inst_Date|-1|10|")
	public static WebElement chequedateforcreditcard;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_4|Amount|-1|18|0")
	public static WebElement amountforcreditcardforcheque;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_5|CreditAccountNumber|-1|12|")
	public static WebElement accountnoforcreditcardforcheque;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_4|Amount|-1|18|0")
	public static WebElement amountforcreditcardcheque;
	@FindBy(how = How.ID, using = "rdSelect")
	public static WebElement selectinstrumenttoundelete;
	@FindBy(how = How.LINK_TEXT, using = "[4]Reject Repair(Vendor-CMS With Slip)")
	public static WebElement rejectrepairvendorcmsslipflow;
	@FindBy(how = How.LINK_TEXT, using = "[G](Vendor-CMS-Slip)Data entry (Maker)")
	public static WebElement cmsslipdataentrymaker;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_4|HierarchyCode|-1|6|")
	public static WebElement hierarchycodefornormal;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_5|SUBCUSTOMERCODE|-1|6|")
	public static WebElement subcustomercodefornormal;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_6|PICKCODE|-1|6|")
	public static WebElement pickupcodefornormal;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_7|Course|-1|6|")
	public static WebElement divcodefornormal;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_8|ADDINF1|-1|25|")
	public static WebElement addressfornormal;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_1|DraweeName|-1|18|")
	public static WebElement draweenamefornormal;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_2|Inst_Date|-1|10|")
	public static WebElement chequedatefornormal;
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_3|Amount|-1|18|0")
	public static WebElement amountforchequenormal;












	//Canara Bank Outward




	@FindBy(how = How.LINK_TEXT, using = "[2]Reject Repair Batch Balancing[Correction of MICR Details & Balancing Of Batches]")
	public static WebElement newcanaraoutrrmodule;
	@FindBy(how = How.LINK_TEXT, using = "[3]Super Balancing [Final confirmation of Batches By Supervisor]")
	public static WebElement canaraoutsuperbalancingmodule;
	@FindBy(how = How.LINK_TEXT, using = "[4]Manual Return [Option to Mark Chq Returns Manually]")
	public static WebElement canaraoutmanualreturnmodule;
	@FindBy(how = How.LINK_TEXT, using = "[5]Status Viewer [Option To view Job/Operator Status By Supervisor]")
	public static WebElement canaraoutstatusviewermodule;
	@FindBy(how = How.LINK_TEXT, using = "[6]Reports [To Generate Clearing Reports]")
	public static WebElement canaraoutreportmodule;
	@FindBy(how = How.LINK_TEXT, using = "[7]Document Search [To Search Historical / Old Instrument Details]")
	public static WebElement canaraoutdocsearchmodule;

	
	
	@FindBy(how = How.ID, using ="__tab_ctl00_ContentPlaceHolder1_TabContainer1_Tab_1")
	public static WebElement canaraoutdepositslipsectionfordocsearch;
	
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_TabContainer1_Tab_1_01myTextBoxLeft0")
	public static WebElement canaraoutdepositslipaccountnoleft;
	
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_TabContainer1_Tab_1_01myTextBoxRight0")
	public static WebElement canaraoutdepositslipaccountnoright;
	
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_TabContainer1_Tab_1_01myTextBoxLeft1")
	public static WebElement canaraoutdepositslipamountleft;
	
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_TabContainer1_Tab_1_01myTextBoxRight1")
	public static WebElement canaraoutdepositslipamountright;
	
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_TabContainer1_Tab_1_myChequeBox1")
	public static WebElement canaraoutdepositslipunchecktextbox;
	
	
	
	
	
	
	
	
	
	
	
	
	
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_TabContainer1_Tab_7_01myTextBoxLeft0")
	public static WebElement canaraoutleftsorterno;
	
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_TabContainer1_Tab_7_01myTextBoxRight0")
	public static WebElement canaraoutrightsorterno;
	
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_TabContainer1_Tab_7_01myTextBoxLeft1")
	public static WebElement canaraoutleftpresentingbankroutingno;
	
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_TabContainer1_Tab_7_01myTextBoxRight1")
	public static WebElement canaraoutrightpresentingbankroutingno;
	
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_TabContainer1_Tab_7_01myTextBoxLeft2")
	public static WebElement canaraoutleftsequenceno;
	
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_TabContainer1_Tab_7_01myTextBoxRight2")
	public static WebElement canaraoutrightsequenceno;
	
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_TabContainer1_Tab_7_01myTextBoxLeft3")
	public static WebElement canaraoutleftblockno;
	
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_TabContainer1_Tab_7_01myTextBoxLeft4")
	public static WebElement canaraoutleftbatchno;
	
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_TabContainer1_Tab_7_01myTextBoxRight4")
	public static WebElement canaraoutrightbatchno;
	
	
	
	
	
	
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_TabContainer1_Tab_7_01myTextBoxRight3")
	public static WebElement canaraoutrightblockno;
	
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_TabContainer1_Tab_7_01myTextBoxLeft5")
	public static WebElement canaraoutleftchequedate;
	
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_TabContainer1_Tab_7_01myTextBoxRight5")
	public static WebElement canaraoutrightchequedate;
	
	
	
	//canara out cheque section for doc search
	
	@FindBy(how = How.ID, using ="__tab_ctl00_ContentPlaceHolder1_TabContainer1_Tab_2")
	public static WebElement canaraoutchequesection;
	
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_TabContainer1_Tab_2_01myTextBoxLeft0")
	public static WebElement canaraoutchequenoforchequetableftsection;
	
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_TabContainer1_Tab_2_01myTextBoxRight0")
	public static WebElement canaraoutchequenoforchequetabrightsection;
	
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_TabContainer1_Tab_2_01myTextBoxLeft1")
	public static WebElement canaraoutcitycodeforchequetableftsection;
	
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_TabContainer1_Tab_2_01myTextBoxRight1")
	public static WebElement canaraoutcitycodeforchequetabrightsection;
	
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_TabContainer1_Tab_2_01myTextBoxLeft2")
	public static WebElement canaraoutbankcodeforchequetableftsection;
	
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_TabContainer1_Tab_2_01myTextBoxRight2")
	public static WebElement canaraoutbankcodeforchequetabrightsection;
	
	
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_TabContainer1_Tab_2_01myTextBoxLeft3")
	public static WebElement canaraoutbranchcodeforchequetableftsection;
	
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_TabContainer1_Tab_2_01myTextBoxRight3")
	public static WebElement canaraoutbranchcodeforchequetabrightsection;
	
	
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_TabContainer1_Tab_2_01myTextBoxLeft4")
	public static WebElement canaraoutbasenoforchequetableftsection;
	
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_TabContainer1_Tab_2_01myTextBoxRight4")
	public static WebElement canaraoutbasenoforchequetabrightsection;
	
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_TabContainer1_Tab_2_01myTextBoxLeft5")
	public static WebElement canaraouttcforchequetableftsection;
	
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_TabContainer1_Tab_2_01myTextBoxRight5")
	public static WebElement canaraouttcforchequetabrightsection;
	
	
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_TabContainer1_Tab_2_01myTextBoxLeft6")
	public static WebElement canaraoutamountforchequetableftsection;
	
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_TabContainer1_Tab_2_01myTextBoxRight6")
	public static WebElement canaraoutamountforchequetabrightsection;
	
	
	//for special cheque
	
	
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_TabContainer1_Tab_3_01myTextBoxLeft0")
	public static WebElement canaraoutchequenoforspecialchequetableftsection;
	
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_TabContainer1_Tab_3_01myTextBoxRight0")
	public static WebElement canaraoutchequenoforspecialchequetabrightsection;
	
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_TabContainer1_Tab_3_01myTextBoxLeft1")
	public static WebElement canaraoutcitycodeforspecialchequetableftsection;
	
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_TabContainer1_Tab_3_01myTextBoxRight1")
	public static WebElement canaraoutcitycodeforspecialchequetabrightsection;
	
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_TabContainer1_Tab_3_01myTextBoxLeft2")
	public static WebElement canaraoutbankcodeforspecialchequetableftsection;
	
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_TabContainer1_Tab_3_01myTextBoxRight2")
	public static WebElement canaraoutbankcodeforspecialchequetabrightsection;
	
	
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_TabContainer1_Tab_3_01myTextBoxLeft3")
	public static WebElement canaraoutbranchcodeforspecialchequetableftsection;
	
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_TabContainer1_Tab_3_01myTextBoxRight3")
	public static WebElement canaraoutbranchcodeforspecialchequetabrightsection;
	
	
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_TabContainer1_Tab_3_01myTextBoxLeft4")
	public static WebElement canaraoutbasenoforspecialchequetableftsection;
	
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_TabContainer1_Tab_3_01myTextBoxRight4")
	public static WebElement canaraoutbasenoforspecialchequetabrightsection;
	
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_TabContainer1_Tab_3_01myTextBoxLeft5")
	public static WebElement canaraouttcforspecialchequetableftsection;
	
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_TabContainer1_Tab_3_01myTextBoxRight5")
	public static WebElement canaraouttcforspecialchequetabrightsection;
	
	
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_TabContainer1_Tab_3_01myTextBoxLeft6")
	public static WebElement canaraoutamountforspecialchequetableftsection;
	
	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_TabContainer1_Tab_3_01myTextBoxRight6")
	public static WebElement canaraoutamountforspecialchequetabrightsection;
	
	
//paper tracking module
	

	@FindBy(how = How.LINK_TEXT, using = "[8]Paper Tracking")
	public static WebElement canaraoutpapertrackingmodule;
	
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_GridView1_ctl01_chkSelect")
	public static WebElement canaraoutpapertrackingselectallcheque;
	
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_TabContainer1_Tab_47_11myDropDownLeft2")
	public static WebElement canaraoutpapertrackingmoduleselectstatus;
	
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_btnMark")
	public static WebElement canaraoutpapertrackingmarktherecord;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@FindBy(how = How.LINK_TEXT, using = "032001")
	public static WebElement canaraoutbatchno;

	@FindBy(how = How.LINK_TEXT, using = "032002")
	public static WebElement canaraoutsecondbatch;
	
	
	@FindBy(how = How.LINK_TEXT, using = "001001")
	public static WebElement canaraoutfirstbatch;

	@FindBy(how = How.LINK_TEXT, using = "001002")
	public static WebElement canaraoutsecondbatchforp2f;

	@FindBy(how = How.ID, using = "ctl00_lblUserName")
	public static WebElement useridthatshowingonui;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_1|AccountNo|-1|13|")
	public static WebElement canaraoutdepositaccountnoforslip;

	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_2|Amount|-1|13|0")
	public static WebElement canaraoutamountforslip;
	
	
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_1|ChequeNo|-1|6|0")
	public static WebElement canarachequeno;

	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_2|SortCode|0|3|0")
	public static WebElement canaracitycode;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_3|SortCode|3|3|0")
	public static WebElement canarabankcode;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_4|SortCode|6|3|0")
	public static WebElement canarabranchcode;

	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_5|BaseNo|-1|6|0")
	public static WebElement canarabaseno;

	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_6|TC|-1|2|0")
	public static WebElement canaratccode;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_7|Amount|-1|13|0")
	public static WebElement canaraamountforcheque;









	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_1|InstitutionCode|-1|6|")
	public static WebElement icicioutinstitutioncodeforschoolfees;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_3|StudentName|-1|18|")
	public static WebElement icicioutstudentnameforschoolfees;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_4|RollNo|-1|15|")
	public static WebElement icicioutrollnoforschoolfees;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_5|Class|-1|6|")
	public static WebElement icicioutclassforschoolfees;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_6|Course|-1|6|")
	public static WebElement icicioutcourseselectionforschoolfees;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_7|Amount|-1|18|0")
	public static WebElement icicioutslipamountforschoolfees;
	@FindBy(how = How.LINK_TEXT, using = "[H](Vendor-CMS-slip)Data entry (Checker)")
	public static WebElement icicioutcmsslipdataentrychecker;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_1|CustCode|-1|9|")
	public static WebElement icicioutcustcodefornormal;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_4|AccountNo|-1|12|")
	public static WebElement icicioutaccountnofornormal;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_9|Amount|-1|18|0")
	public static WebElement icicioutamountfornormal;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_16|DepSlipNo|-1|10|0")
	public static WebElement icicioutslipnofornormal;
	@FindBy(how = How.ID, using = "__tab_ctl00_ContentPlaceHolder1_TabContainer1_Tab_1")
	public static WebElement canaraoutdocsearchdepositslip;
	@FindBy(how = How.ID, using = "__tab_ctl00_ContentPlaceHolder1_TabContainer1_Tab_2")
	public static WebElement canaraoutdocsearchforchequeslip;
	@FindBy(how = How.ID, using = "__tab_ctl00_ContentPlaceHolder1_TabContainer1_Tab_3")
	public static WebElement canaraoutdocsearchforspecialcheque;



	//BOI Inward Webelement

	@FindBy(how = How.LINK_TEXT, using = "[1]A/c No and Date Keying")
	public static WebElement boiinwardaccountnorepair;

	@FindBy(how = How.LINK_TEXT, using = "[2]Payee Name Keying And AUX")
	public static WebElement boiinwardpayeenamekeyingandaux;

	@FindBy(how = How.LINK_TEXT, using = "[4]Manual Return")
	public static WebElement boiinwardmanualreturn;

	@FindBy(how = How.LINK_TEXT, using = "[5]Status Viewer")
	public static WebElement boiinwardstatusviewer;
	@FindBy(how = How.LINK_TEXT, using = "[6]Document Search")
	public static WebElement boiinwarddocsearch;

	@FindBy(how = How.LINK_TEXT, using = "[7]Reports")
	public static WebElement boiinwardreport;
	@FindBy(how = How.LINK_TEXT, using = "000001")
	public static WebElement boiinwardfirstbatch;
	@FindBy(how = How.LINK_TEXT, using = "000002")
	public static WebElement boiinwardsecondbatch;

	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_1|Payeename|-1|50|")
	public static WebElement boiinwardpayeename;



	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_1|AccountNo|-1|15|0")
	public static WebElement boiinwardaccountno;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_2|Inst_Date|-1|10|")
	public static WebElement boiinwardchequedate;



	//sampath Outward Module
	@FindBy(how = How.LINK_TEXT, using = "[5]Status Viewer")
	public static WebElement sampathoutstatusviewer;
	@FindBy(how = How.LINK_TEXT, using = "[2]Reject Repair")
	public static WebElement sampathoutrrmodule;
	@FindBy(how = How.LINK_TEXT, using = "[3]Amount Keying")
	public static WebElement sampathoutamountkeying;
	@FindBy(how = How.LINK_TEXT, using = "[4]Batch Balancing")
	public static WebElement sampathoutbatchbalancing;
	@FindBy(how = How.LINK_TEXT, using = "[6]Document Search")
	public static WebElement sampathoutdocumentsearch;
	@FindBy(how = How.LINK_TEXT, using = "[8]Document Search (BackUp)")
	public static WebElement sampathoutdocumentsearchbackup;
	@FindBy(how = How.LINK_TEXT, using = "[B]Reports(Back up)")
	public static WebElement sampathoutreportbackupmodule;

	@FindBy(how = How.LINK_TEXT, using = "[R]Reports")
	public static WebElement sampathoutreportmodule;
	@FindBy(how = How.LINK_TEXT, using = "900001")
	public static WebElement sampathoutfirstbatch;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_1|SetNo|-1|4|")
	public static WebElement sampathoutsetnoforrr;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_1|ChequeNo|-1|6|0")
	public static WebElement sampathoutchequenoforrr;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_2|BankNo|-1|4|0")
	public static WebElement sampathoutbankcode;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_3|BranchNo|-1|3|0")
	public static WebElement sampathoutbranchcode;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_4|DRAccountNo|-1|10|0")
	public static WebElement sampathoutdraccountno;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_5|TC|-1|2|0")
	public static WebElement sampathouttccode;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_1|Amount|-1|16|0")
	public static WebElement sampathoutamountforamountkeying;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDataEntry_2|Amount|-1|16|0")
	public static WebElement sampathoutamountforbatchbalancingmodule;




	@FindBy(how = How.LINK_TEXT, using = "[1]Reject Repair")
	public static WebElement sampathinwrrmodule;


	@FindBy(how = How.LINK_TEXT, using = "[2]Document Search")
	public static WebElement sampathinwdocsearchmodule;

	@FindBy(how = How.LINK_TEXT, using = "[3]Manual Return")
	public static WebElement sampathinwmanualreturnmodule;

	@FindBy(how = How.LINK_TEXT, using = "[6]Status Viewer")
	public static WebElement sampathinwstatusviewermodule;

	@FindBy(how = How.LINK_TEXT, using = "[7]Inward Reports")
	public static WebElement sampathinwreportmodule;

	@FindBy(how = How.LINK_TEXT, using = "[8]Document Search (BackUp)")
	public static WebElement sampathinwdocsearchbackup;

	@FindBy(how = How.LINK_TEXT, using = "[B]Reports(Back up)")
	public static WebElement sampathinwreportbackupmodule;


	//PNB outward

	@FindBy(how = How.LINK_TEXT, using = "[4]Status Viewer")
	public static WebElement pnboutstatusviewer;

	@FindBy(how = How.LINK_TEXT, using = "[2]Reject Repair")
	public static WebElement pnboutrrmodule;

	@FindBy(how = How.LINK_TEXT, using = "076001")
	public static WebElement pnboutfirstbatch;

	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_1|ChequeNo|0|6|0")
	public static WebElement pnboutchequeno;

	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_2|SortCode|0|3|0")
	public static WebElement pnboutcitycode;

	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_3|SortCode|3|3|0")
	public static WebElement pnboutbankcode;

	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_4|SortCode|6|3|0")
	public static WebElement pnboutbranchcode;

	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_5|BaseNo|-1|6|0")
	public static WebElement pnboutbaseno;

	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_6|TC|-1|2|0")
	public static WebElement pnbouttccode;

	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_5|BaseNo|-1|7|0")
	public static WebElement pnboutbasenoforgovtcheque;

	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtDataEntry_6|TC|-1|3|0")
	public static WebElement pnbouttcodeforgovtcheque;

	@FindBy(how = How.LINK_TEXT, using ="[3]Batch Balancing (RBNL-LBNR)")
	public static WebElement pnboutrbnllbnrmodule;

	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_btnMark")
	public static WebElement markrecordinlbnrmodule;

	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_gvSecond_ctl02_txtAccountName")
	public static WebElement pnboutaccountnameforlbnrmodule;

	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_gvSecond_ctl02_btnSave")
	public static WebElement pnboutsavebuttoninlbnrmodule;
	@FindBy(how = How.LINK_TEXT, using ="[C]Super Balancing")
	public static WebElement pnboutsuperbalancingmodule;




	//SVS

	@FindBy(how = How.ID, using ="Login ID")
	public static WebElement svsusername;

	@FindBy(how = How.ID, using ="Password")
	public static WebElement svspassword;

	@FindBy(how = How.XPATH, using ="//*[@id='login-box']/div/div/form/fieldset/div[2]/button")
	public static WebElement svsloginbutton;

	@FindBy(how = How.XPATH, using ="//*[@id='body']/div[1]/div[1]/div[1]/div/div/b/span")
	public static WebElement svsgotomainmenu;

	@FindBy(how = How.XPATH, using ="//*[@id='nav1']/li[2]/a")
	public static WebElement svsclickonaccount;///working in IE

	@FindBy(how = How.XPATH, using ="//*[@id='nav1']/li[1]/a")
	public static WebElement svsadministrationtool;

	//*[@id="nav1"]/li[1]/a

	/*@FindBy(how = How.XPATH, using ="/html/body/div[1]/div[1]/div[1]/div/div/b/div/div/ul/li[2]/a")
	public static WebElement svsclickonaccount;*/




	/*@FindBy(how = How.XPATH, using ="//*[contains(text(),'Account')]")
	public static WebElement svsclickonaccount;*/

	@FindBy(how = How.ID, using ="cbValidSign")
	public static WebElement svsvalidsign;

	@FindBy(how = How.ID, using ="btnSubmit")
	public static WebElement svssubmitbutton;

	@FindBy(how = How.ID, using ="btnload")
	public static WebElement svsloadbutton;

	@FindBy(how = How.XPATH, using ="//*[@id='body']/div[9]/div/div/div[2]/button[2]")
	public static WebElement svsokbutton;




	@FindBy(how = How.LINK_TEXT, using ="SignatureValidation")
	public static WebElement svssignaturevalidation;

	@FindBy(how = How.XPATH, using ="//*[@id='signaturevalidation.html']/div[1]/div[2]/div[2]/span/button[2]/h3")
	public static WebElement svsnextbuttonforsignatureselection;




	@FindBy(how = How.ID, using ="txtaccno")
	public static WebElement svsaccountnoforsignature;


	@FindBy(how = How.XPATH, using ="//*[@id='body']/div[1]/div[1]/div[1]/div/div/ul/li[3]/a")
	public static WebElement svslogoutbutton;

	@FindBy(how = How.XPATH, using ="//*[@id='body']/div[9]/div/div/div[2]/button[1]")
	public static WebElement svscancelbutton;

	@FindBy(how = How.ID, using ="btnNext")
	public static WebElement svsnextbutton;

	@FindBy(how = How.ID, using ="cbRejectSigncard")
	public static WebElement svsrejectsigncard;

	@FindBy(how = How.XPATH, using ="//*[@id='signaturevalidation.html']/div[1]/div[1]/table/tbody/tr/td[2]/button")
	public static WebElement svszoominbuttonforleftpanel;

	@FindBy(how = How.XPATH, using ="//*[@id='signaturevalidation.html']/div[1]/div[1]/table/tbody/tr/td[3]/button")
	public static WebElement svszoomoutbuttonforleftpanel;

	@FindBy(how = How.XPATH, using ="//*[@id='signaturevalidation.html']/div[1]/div[2]/table/tbody/tr/td[1]/button")
	public static WebElement svszoominbuttonforrightpanel;

	@FindBy(how = How.XPATH, using ="//*[@id='signaturevalidation.html']/div[1]/div[1]/table/tbody/tr/td[2]/button")
	public static WebElement svszoomoutbuttonforrightpanel;


	//SPDC

	@FindBy(how = How.LINK_TEXT, using = "[S]SPDC")
	public static WebElement spdcmodule;

	@FindBy(how = How.LINK_TEXT, using = "[A]Security File Upload")
	public static WebElement spdcsecurityfileuploadmodule;

	@FindBy(how = How.LINK_TEXT, using = "[H]File Upload - Hold")
	public static WebElement spdcholdfileupload;

	@FindBy(how = How.LINK_TEXT, using = "[D]File Download – Vendor Authorisation/Box Number Update/Reverse Upload")
	public static WebElement spdcfiledownload;

	@FindBy(how = How.LINK_TEXT, using = "[I]File Upload - Unhold")
	public static WebElement spdcunholdfileupload;

	@FindBy(how = How.LINK_TEXT, using = "[E]File Upload – Vendor Authorisation")
	public static WebElement spdcreceivedfromvendor;

	@FindBy(how = How.LINK_TEXT, using = "[J]File Upload – Pullout for Deposit /Section 138")
	public static WebElement spdcpulloutfileupload;


	@FindBy(how = How.LINK_TEXT, using = "[F]Discrepancy – Vendor Authorisation")
	public static WebElement spdcdiscrpencyauthorization;

	@FindBy(how = How.LINK_TEXT, using = "[K]File Upload - ReDeposit")
	public static WebElement spdcdepositfileupload;

	//[@id='ctl00_ContentPlaceHolder1_GridView1']/tobdy/tr[2]/td[16]


	@FindBy(how = How.LINK_TEXT, using = "[2]FCH File Status")
	public static WebElement spdcfilestatusforfcs;


	@FindBy(how = How.LINK_TEXT, using = "[G]File Upload – Box Number Update")
	public static WebElement spdcbarcodeupdatefileupload;

	@FindBy(how = How.LINK_TEXT, using = "[M]Cheque View")
	public static WebElement spdcdocumentsearchmodule;

	@FindBy(how = How.LINK_TEXT, using = "[B]File Status")
	public static WebElement spdcfilestatus;

	@FindBy(how = How.LINK_TEXT, using = "[L]Cheque Modification")
	public static WebElement spdcchequedetailsmodification;

	@FindBy(how = How.LINK_TEXT, using = "[G]File Upload – Box Number Update")
	public static WebElement spdccbarcodeupdatefileupload;

	@FindBy(how = How.LINK_TEXT, using = "[C]Inhouse Authorisation")
	public static WebElement spdcauthorizediscrepencyentry;



	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_DGVPDC_ctl02_btnDownload")
	public static WebElement filedownloadforreceivedfromvendor;

	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_DGVPDC_ctl03_btnDownload")
	public static WebElement filedownloadforbarodeupdate;


	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_DGVPDC_ctl04_btnDownload")
	public static WebElement filedownloadforreversefiledownload;


	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtLoanNo")
	public static WebElement spdcauthorizediscrepencyentryloannotosearch;

	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_btnSearch")
	public static WebElement spdcauthorizediscrepencyentrysearchbutton;

	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_GridView1_ctl01_chkSelectHeader")
	public static WebElement selectrecordindiscrepencyauthorizationmodule;

	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_GridView1_ctl02_LinkButton2")
	public static WebElement editbuttonindiscrepencyauthorizationmodule;

	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_GridView1_ctl02_LinkButton3")
	public static WebElement updatebuttonindiscrepencyauthorizationmodule;

	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_btnAuthorize")
	public static WebElement authorizebuttonindiscrepencyauthorizationmodule;





	//ChequeAmount

	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_btnReset")
	public static WebElement spdcauthorizediscrepencyentryresetbutton;






	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_btnSubmit")
	public static WebElement submitbuttoninpdc;


	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_btnMicr")
	public static WebElement micrselection;

	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDate")
	public static WebElement pdcdateselectionformodule;

	@FindBy(how = How.LINK_TEXT, using = "More information")
	public static WebElement clickonmoreinformation;

	@FindBy(how = How.ID, using = "overridelink")
	public static WebElement clickonoverridelink;

	@FindBy(how = How.XPATH, using ="//*[@id='ctl00_ContentPlaceHolder1_FileUpload1']")
	public static WebElement browsebuttoninspdc;



	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_btnUpload")
	public static WebElement uploadbuttoninspdc;

	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_btnAccept")
	public static WebElement acceptbuttonindiscrepencymodule;

	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtAgreementNo")
	public static WebElement loannofordocsearchinspdc;

	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_btnSearch")
	public static WebElement searchbuttonindocsearch;

	//cheque details modification

	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtloanNo")
	public static WebElement loannoforchequedetailsmodification;

	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtChequeNo")
	public static WebElement chequenoforchequedetailsmodification;

	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_btnView")
	public static WebElement viewbuttoninchequedetailsmodificationmodule;

	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_btnReset")
	public static WebElement resetbuttoninchequedetailsmodificationmodule;

	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txt_SPDC_VendorName")
	public static WebElement vendornameinchequedetailsmodificationmodule;

	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txt_SPDC_CartonBarcodeNo")
	public static WebElement cartonbarcodeinchequedetailsmodificationmodule;

	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txt_SPDC_FileBarcodeNo")
	public static WebElement filebarcodeinchequedetailsmodificationmodule;

	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_btn_Ch_StatusUpdate")
	public static WebElement submitbuttoninchequedetailsmodificationmodule;

	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_rbtnManual")
	public static WebElement selectmanualmodeinfilestatus;

	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_btnSearch")
	public static WebElement searchbuttoninfilestatus;

	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_DGVPDC_ctl02_btnDownloadAccepted")
	public static WebElement downloadacceptedrecords;

	@FindBy(how = How.LINK_TEXT, using ="Start Menu")
	public static WebElement startmenu;

	@FindBy(how = How.LINK_TEXT, using ="[F]F/C/S")
	public static WebElement FCSModules;

	@FindBy(how = How.LINK_TEXT, using ="[F]Foreclose File Upload")
	public static WebElement forecloseModules;

	@FindBy(how = How.LINK_TEXT, using ="[F]Cancellation File Upload")
	public static WebElement cancellationodules;

	@FindBy(how = How.LINK_TEXT, using ="[S]Swap File Upload")
	public static WebElement swapModules;

























	@FindBy(how = How.XPATH, using = "//table[@id='ctl00_ContentPlaceHolder1_GridView1']/tbody/tr[2]/td[16]")
	public static WebElement statusindocsearchforspdc;

	@FindBy(how = How.XPATH, using = "//table[@id='ctl00_ContentPlaceHolder1_GridView1']/tbody/tr[2]/td[9]")
	public static WebElement vendornaameindocsearchforspdc;

	@FindBy(how = How.XPATH, using = "//table[@id='ctl00_ContentPlaceHolder1_GridView1']/tbody/tr[2]/td[13]")
	public static WebElement cartoncodeindocsearchforspdc;

	@FindBy(how = How.XPATH, using = "//table[@id='ctl00_ContentPlaceHolder1_GridView1']/tbody/tr[2]/td[14]")
	public static WebElement barcodeindocsearchforspdc;


	@FindBy(how = How.XPATH, using = "//table[@id='ctl00_ContentPlaceHolder1_GridView1']/tbody/tr[2]/td[17]")
	public static WebElement statusindocsearchforpulloutstatusinspdc;


	//PNB Inward





	@FindBy(how = How.LINK_TEXT, using ="[1]A/c No and Date Keying")
	public static WebElement pnbinwardackeying;


	@FindBy(how = How.LINK_TEXT, using ="[2]Payee Name Keying And AUX")
	public static WebElement pnbinwardpayeenamekeying;

	/*
	[3]Data Correction Module


	[5]Draft Processing (Maker)


	[6]Draft Processing (Checker)

	[7]Manual Return

	[8]Document Search

	[9]Status Viewer

	[R]Inward Reports

	*/

	//***************************************SBI Outward******************************************************



	@FindBy(how = How.LINK_TEXT, using ="[7]Status Viewer")
	public static WebElement sbioutstatusviewer;


	@FindBy(how = How.LINK_TEXT, using ="[3]Reject Repair\\Batch Balancing")
	public static WebElement sbioutrrbatchbalancing;

	@FindBy(how = How.LINK_TEXT, using ="[3]Reject Repair\\Batch Balancing\\LBNR")
	public static WebElement sbioutrrbatchbalancinglbnr;




	@FindBy(how = How.LINK_TEXT, using ="[4]Batch Balancing (RBNL-LBNR)")
	public static WebElement sbioutbatchbalancing;

	@FindBy(how = How.LINK_TEXT, using ="[5]Super Balancing")
	public static WebElement sbioutsuperbalancing;

	@FindBy(how = How.LINK_TEXT, using ="[6]Manual Return")
	public static WebElement sbioutmanualreturn;

	@FindBy(how = How.LINK_TEXT, using ="[6]Super Balancing(RBNL/LBNR)")
	public static WebElement sbioutsuperbalancingrbnllbnr;

	@FindBy(how = How.LINK_TEXT, using ="[8]Document Search")
	public static WebElement sbioutdocumentsearchmodule;

	@FindBy(how = How.LINK_TEXT, using ="[8]Paper Tracking")
	public static WebElement sbioutpapertracking;

	@FindBy(how = How.LINK_TEXT, using ="[R]Reports")
	public static WebElement sbioutreportmodule;

	@FindBy(how = How.LINK_TEXT, using ="[6]Document Search")
	public static WebElement boiinwarddocumentsearch;





	@FindBy(how = How.LINK_TEXT, using ="[9]Reject Repair\\Batch Balancing For BGL")
	public static WebElement sbioutrrbatchbalancingbgl;




	//PDC 

	@FindBy(how = How.LINK_TEXT, using ="[I]INWARD")
	public static WebElement pdcinwardmoduleselection;


	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_btnMicr")
	public static WebElement pdcinwardmicrmenu;



	@FindBy(how = How.LINK_TEXT, using ="[A]PDC Manual Data Entry")
	public static WebElement pdcinwardmanualdataentrymoduleselection;


	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtLoanNumber")
	public static WebElement pdcinwardloannoinmanualdataentrymodule;

	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtCustomerName")
	public static WebElement pdcinwardcustomernameinmanualdataentrymodule;


	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtFileNumber")
	public static WebElement pdcinwardfilenoinmanualdataentrymodule;

	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtMICRCode")
	public static WebElement pdcinwardmicrcodeinmanualdataentrymodule;

	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtChequeAmount")
	public static WebElement pdcinwardamountinmanualdataentrymodule;

	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtChequeDate")
	public static WebElement pdcinwardchequedateinmanualdataentrymodule;

	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtPresentmentDate")
	public static WebElement pdcinwardpresentmentdateinmanualdataentrymodule;

	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtChequeNo")
	public static WebElement pdcinwardchequenoinmanualdataentrymodule;

	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtTransCode")
	public static WebElement pdcinwardtccodeinmanualdataentrymodule;

	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtNoOfCheque")
	public static WebElement pdcinwardnoofchequeinmanualdataentrymodule;

	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_txtCustomerAccountNo")
	public static WebElement pdcinwardcustomeraccountnoinmanualdataentrymodule;

	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_btnAddtoList")
	public static WebElement pdcinwardaddtolistbuttoninmanualdataentrymodule;


	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_btnSubmit")
	public static WebElement pdcinwardsubmitbuttoninmanualdataentrymodule;




	@FindBy(how = How.ID, using ="ctl00_ContentPlaceHolder1_btnClear")
	public static WebElement pdcinwardclearbuttoninmanualdataentrymodule;



	//non web  module

	@FindBy(how = How.NAME, using = "Download PXF and PIBF Files")
	public static WebElement nonwebdownloadpxfandpibffile;
	@FindBy(how = How.NAME, using = "Process Media Files")
	public static WebElement nonwebselectprocessmediafiles;
	@FindBy(how = How.NAME, using = "CHI InterFace")
	public static WebElement nonwebchiinterface;
	@FindBy(how = How.NAME, using = "Exit")
	public static WebElement nonwebexitchiinterfacemodule;
	@FindBy(how = How.NAME, using = "Yes")
	public static WebElement nonwebexitthechiinterfacescreen;
	@FindBy(how = How.NAME, using ="Log Out")
	public static WebElement nonweblogoutbutton;


//capture module for panini
	
	@FindBy(how = How.LINK_TEXT, using ="[P]Remote Capture (PANINI)")
	public static WebElement canaraoutpaninimodule;

	
	@FindBy(how = How.ID, using ="btnInitialize")
	public static WebElement initializebuttoninpanini;
	
	@FindBy(how = How.ID, using ="btnstart")
	public static WebElement startcapturebuttoninpanini;
	
	@FindBy(how = How.ID, using ="btnUpdate")
	public static WebElement CreateBatchbuttoninpanini;
	@FindBy(how = How.ID, using ="btnClose")
	public static WebElement closeBatchbuttoninpanini;
	
	@FindBy(how = How.ID, using ="btnStop")
	public static WebElement stopBatchbuttoninpanini;
	
	@FindBy(how = How.ID, using ="BtnEndBlock")
	public static WebElement endblockbuttoninpanini;











































	}


