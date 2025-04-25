package DPR;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Table_2A_B extends Table_1B{

	String BangladeshDate = "19-11-2023";
	String BhutanDate = "19-11-2023";
	String NepalDate = "19-11-2023";
	
	String BangladeshDate2022 = "19-11-2022";
	String BhutanDate2022 = "19-11-2022";
	String NepalDate2022 = "19-11-2022";
	
	
	
    //===================Table-2A====================================
    
    //=================Cross Border Electricity Exchange (Daily Energy & Peak MW)================================  
	//=========================================Bangladesh=======================================================================
    @Test(priority=37) 
    public void Bangladesh_NetEnergyExchange () throws InterruptedException {
    	System.out.println();
    	System.out.println("<==========Table-2A : Cross Border Electricity Exchange of India*-Import(+ve)/Export(-ve)============>");
    	 System.out.println("=========Bangladesh Energy Exchange between India and Bangladesh========");
    	 System.out.println();
    WebElement Country_dropdown = driver.findElement(By.xpath("/html/body/app-root/ng-component/div/div[2]/div/div/div[2]/div[1]/a"));
    Country_dropdown.click();
     Thread.sleep(4000);	
     
     WebElement Select_India = driver.findElement(By.xpath("/html/body/app-root/ng-component/div/div[2]/div/div/div[2]/div[1]/div/nav/ul/li[4]/div/input"));
     Select_India.click();
      Thread.sleep(4000);	
    
      // Select Cross border electricity trade KPI
      
      WebElement Select_KPI = driver.findElement(By.xpath("/html/body/app-root/ng-component/div/div[2]/div/div/div[1]/div/nav/ul/li[4]/a"));
      Select_KPI.click();
       Thread.sleep(4000);
       
       //Transnational Energy Exchange
       WebElement Transnational_Energy_Exchange = driver.findElement(By.xpath("/html/body/app-root/ng-component/div/div[2]/div/div/div[1]/div/nav/ul/li[4]/ul/li[1]/a/p"));
       Transnational_Energy_Exchange.click();
        Thread.sleep(4000);
        
       //Energy Exchange between India and Bangladesh
       WebElement Select_Sub_KPI = driver.findElement(By.xpath("/html/body/app-root/ng-component/div/div[2]/div/div/div[1]/div/nav/ul/li[4]/ul/li[1]/ul/li[1]/div/a/p"));
       Select_Sub_KPI.click();
        Thread.sleep(4000);
        
        // Bangladesh
        List <WebElement> col = driver.findElements(By.xpath("/html/body/app-root/ng-component/div/div[2]/div/div/div[2]/div[2]/div[1]/div[5]/div/div/div/div[1]/div/table/thead/tr/th"));
        //Total Power Plants Installed Capacity Fuel Wise in India : 2010-2023
       for(int i=1;i<=col.size();i++)
       {
         WebElement tablehead = driver.findElement(By.xpath("/html/body/app-root/ng-component/div/div[2]/div/div/div[2]/div[2]/div[1]/div[5]/div/div/div/div[1]/div/table/thead/tr/th["+i+"]"));
          if(tablehead.getText()==BangladeshDate || tablehead.getText().equalsIgnoreCase(BangladeshDate))
         {
       	   
       	  WebElement tablerow = driver.findElement(By.xpath("/html/body/app-root/ng-component/div/div[2]/div/div/div[2]/div[2]/div[1]/div[5]/div/div/div/div[1]/div/table/tbody/tr/td["+i+"]")); 	   
       	    float valueof2023= Float.parseFloat(tablerow.getText().replace(",", ""));
       	    System.out.print("||"+BangladeshDate+" Bangladesh Energy Exchange between India and Bangladesh||"+valueof2023);
       	      System.out.println();
         }
       }
           }
    //=================================================Bhutan==========================================================
    @Test(priority=38) 
    public void Bhutan_NetEnergyExchange () throws InterruptedException {
    	System.out.println();
    	System.out.println("============BNepal Energy Exchange between India and Bhutan===========");
    //Energy Exchange between India and Bhutan KPI
    WebElement Energy_Exchange_with_Bhutan_Sub_KPI = driver.findElement(By.xpath("/html/body/app-root/ng-component/div/div[2]/div/div/div[1]/div/nav/ul/li[4]/ul/li[1]/ul/li[2]/div/a/p"));
    Energy_Exchange_with_Bhutan_Sub_KPI.click();
     Thread.sleep(4000);
     
     //Bhutan
     List <WebElement> col = driver.findElements(By.xpath("/html/body/app-root/ng-component/div/div[2]/div/div/div[2]/div[2]/div[1]/div[5]/div/div/div/div[1]/div/table/thead/tr/th"));
     //Total Power Plants Installed Capacity Fuel Wise in India : 2010-2023
    for(int i=1;i<=col.size();i++)
    {
      WebElement tablehead = driver.findElement(By.xpath("/html/body/app-root/ng-component/div/div[2]/div/div/div[2]/div[2]/div[1]/div[5]/div/div/div/div[1]/div/table/thead/tr/th["+i+"]"));
       if(tablehead.getText()==BhutanDate || tablehead.getText().equalsIgnoreCase(BhutanDate))
      {
    	   
    	  WebElement tablerow = driver.findElement(By.xpath("/html/body/app-root/ng-component/div/div[2]/div/div/div[2]/div[2]/div[1]/div[5]/div/div/div/div[1]/div/table/tbody/tr/td["+i+"]")); 	   
    	    float valueof2023= Float.parseFloat(tablerow.getText().replace(",", ""));
    	    System.out.print("||"+BhutanDate+" Energy Exchange between India and Bhutan||"+valueof2023);
    	      System.out.println();
    }
}
    }
    //============================================Nepal===================================================================
    @Test(priority=39) 
    public void Nepal_NetEnergyExchange () throws InterruptedException {
    	System.out.println(); 
    	System.out.println("==============Bangladesh Energy Exchange between India and Nepal================");
    //Energy Exchange between India and Nepal KPI
    WebElement Energy_Exchange_with_Nepal_Sub_KPI = driver.findElement(By.xpath("/html/body/app-root/ng-component/div/div[2]/div/div/div[1]/div/nav/ul/li[4]/ul/li[1]/ul/li[3]/div/a/p"));
    Energy_Exchange_with_Nepal_Sub_KPI.click();
     Thread.sleep(4000);
     
     //Nepal
     List <WebElement> col = driver.findElements(By.xpath("/html/body/app-root/ng-component/div/div[2]/div/div/div[2]/div[2]/div[1]/div[5]/div/div/div/div[1]/div/table/thead/tr/th"));
     //Total Power Plants Installed Capacity Fuel Wise in India : 2010-2023
    for(int i=1;i<=col.size();i++)
    {
      WebElement tablehead = driver.findElement(By.xpath("/html/body/app-root/ng-component/div/div[2]/div/div/div[2]/div[2]/div[1]/div[5]/div/div/div/div[1]/div/table/thead/tr/th["+i+"]"));
       if(tablehead.getText()==NepalDate || tablehead.getText().equalsIgnoreCase(NepalDate))
      {
    	   
    	  WebElement tablerow = driver.findElement(By.xpath("/html/body/app-root/ng-component/div/div[2]/div/div/div[2]/div[2]/div[1]/div[5]/div/div/div/div[1]/div/table/tbody/tr/td["+i+"]")); 	   
    	    float valueof2023= Float.parseFloat(tablerow.getText().replace(",", ""));
    	    System.out.print("||"+NepalDate+" Energy Exchange between India and Nepal||"+valueof2023);
    	      System.out.println();
    }
}
    }
    
   //=========================================================================================================//
    //========================T====ransnational_Exchange_of_Power_Day_Peak=====================================
    @Test(priority=40) 
    public void Transnational_Exchange_of_Power_Day_Peak () throws InterruptedException {
    	System.out.println();
    	System.out.println("===========Exchange of Power with Bangladesh (Day Peak)================");
 // Transnational Exchange of Power (Day Peak)
    
    WebElement Select_KPI_DayPeak = driver.findElement(By.xpath("/html/body/app-root/ng-component/div/div[2]/div/div/div[1]/div/nav/ul/li[4]/ul/li[2]/a/p"));
    Select_KPI_DayPeak.click();
     Thread.sleep(4000);
      
     //Exchange of Power between India and Bangladesh
     WebElement Select_Sub_KPI = driver.findElement(By.xpath("/html/body/app-root/ng-component/div/div[2]/div/div/div[1]/div/nav/ul/li[4]/ul/li[2]/ul/li[1]/div/a/p"));
     Select_Sub_KPI.click();
      Thread.sleep(4000);
      
      // Bangladesh
      List <WebElement> col = driver.findElements(By.xpath("/html/body/app-root/ng-component/div/div[2]/div/div/div[2]/div[2]/div[1]/div[5]/div/div/div/div[1]/div/table/thead/tr/th"));
      //Total Power Plants Installed Capacity Fuel Wise in India : 2010-2023
     for(int i=1;i<=col.size();i++)
     {
       WebElement tablehead = driver.findElement(By.xpath("/html/body/app-root/ng-component/div/div[2]/div/div/div[2]/div[2]/div[1]/div[5]/div/div/div/div[1]/div/table/thead/tr/th["+i+"]"));
        if(tablehead.getText()==BangladeshDate || tablehead.getText().equalsIgnoreCase(BangladeshDate))
       {
     	   
     	  WebElement tablerow = driver.findElement(By.xpath("/html/body/app-root/ng-component/div/div[2]/div/div/div[2]/div[2]/div[1]/div[5]/div/div/div/div[1]/div/table/tbody/tr/td["+i+"]")); 	   
     	    float valueof2023= Float.parseFloat(tablerow.getText().replace(",", ""));
     	    System.out.print("||"+BangladeshDate+" Exchange of Power with Bangladesh (Day Peak)||"+valueof2023);
     	      System.out.println();
       } 
     }
         }
    @Test(priority=41) 
    //==============Exchange of Power with Bhutan (Day Peak)================
    public void Bhutan_NetEnergyExchange_dayPeak () throws InterruptedException {
    	System.out.println();
    	System.out.println("========Exchange of Power with Bhutan (Day Peak)=============");	
    //Energy Exchange between India and Bhutan KPI
    WebElement Energy_Exchange_with_Bhutan_Sub_KPI = driver.findElement(By.xpath("/html/body/app-root/ng-component/div/div[2]/div/div/div[1]/div/nav/ul/li[4]/ul/li[2]/ul/li[2]/div/a/p"));
    Energy_Exchange_with_Bhutan_Sub_KPI.click();
     Thread.sleep(4000);
     
     //Bhutan
     List <WebElement> col = driver.findElements(By.xpath("/html/body/app-root/ng-component/div/div[2]/div/div/div[2]/div[2]/div[1]/div[5]/div/div/div/div[1]/div/table/thead/tr/th"));
     //Total Power Plants Installed Capacity Fuel Wise in India : 2010-2023
    for(int i=1;i<=col.size();i++)
    {
      WebElement tablehead = driver.findElement(By.xpath("/html/body/app-root/ng-component/div/div[2]/div/div/div[2]/div[2]/div[1]/div[5]/div/div/div/div[1]/div/table/thead/tr/th["+i+"]"));
       if(tablehead.getText()==BhutanDate || tablehead.getText().equalsIgnoreCase(BhutanDate))
      {
    	   
    	  WebElement tablerow = driver.findElement(By.xpath("/html/body/app-root/ng-component/div/div[2]/div/div/div[2]/div[2]/div[1]/div[5]/div/div/div/div[1]/div/table/tbody/tr/td["+i+"]")); 	   
    	    float valueof2023= Float.parseFloat(tablerow.getText().replace(",", ""));
    	    System.out.print("||"+BhutanDate+" Energy Exchange between India and Bhutan||"+valueof2023);
    	      System.out.println();
    }
}
    }
  
    @Test(priority=42) 
    //==============Exchange of Power with Nepal (Day Peak)================
    public void Nepal_NetEnergyExchange_dayPeak () throws InterruptedException {
    	System.out.println();
    	System.out.println("==========Exchange of Power with Bangladesh (Day Peak)============");	
    //Energy Exchange between India and Nepal KPI
    WebElement Energy_Exchange_with_Nepal_Sub_KPI = driver.findElement(By.xpath("/html/body/app-root/ng-component/div/div[2]/div/div/div[1]/div/nav/ul/li[4]/ul/li[2]/ul/li[3]/div/a/p"));
    Energy_Exchange_with_Nepal_Sub_KPI.click();
     Thread.sleep(4000);
     
     //Nepal
     List <WebElement> col = driver.findElements(By.xpath("/html/body/app-root/ng-component/div/div[2]/div/div/div[2]/div[2]/div[1]/div[5]/div/div/div/div[1]/div/table/thead/tr/th"));
     //Total Power Plants Installed Capacity Fuel Wise in India : 2010-2023
    for(int i=1;i<=col.size();i++)
    {
      WebElement tablehead = driver.findElement(By.xpath("/html/body/app-root/ng-component/div/div[2]/div/div/div[2]/div[2]/div[1]/div[5]/div/div/div/div[1]/div/table/thead/tr/th["+i+"]"));
       if(tablehead.getText()==NepalDate || tablehead.getText().equalsIgnoreCase(NepalDate))
      {
    	   
    	  WebElement tablerow = driver.findElement(By.xpath("/html/body/app-root/ng-component/div/div[2]/div/div/div[2]/div[2]/div[1]/div[5]/div/div/div/div[1]/div/table/tbody/tr/td["+i+"]")); 	   
    	    float valueof2023= Float.parseFloat(tablerow.getText().replace(",", ""));
    	    System.out.print("||"+NepalDate+" Exchange of Power with Nepal (Day Peak)||"+valueof2023);
    	      System.out.println();
    }
}
    }
    //============Cross border electricity trade ==========2022================
    
    
    //===================Table-2A
    
//=================Cross Border Electricity Exchange (Daily Energy & Peak MW)================================  
@Test(priority=43) 
public void Bangladesh_NetEnergyExchange_2022 () throws InterruptedException {
	System.out.println();
	System.out.println("==========Exchange of Power with India and Bangladesh -2022============");
	
  // Select Cross border electricity trade KPI
  
  //WebElement Select_KPI = driver.findElement(By.xpath("/html/body/app-root/ng-component/div/div[2]/div/div/div[1]/div/nav/ul/li[4]/a"));
  //Select_KPI.click();
   //Thread.sleep(4000);
   
   //Transnational Energy Exchange
   WebElement Transnational_Energy_Exchange = driver.findElement(By.xpath("/html/body/app-root/ng-component/div/div[2]/div/div/div[1]/div/nav/ul/li[4]/ul/li[1]/a/p"));
   Transnational_Energy_Exchange.click();
    Thread.sleep(4000);
    
    //Click slider year 2022
    WebElement Slider = driver.findElement(By.xpath("/html/body/app-root/ng-component/div/div[2]/div/div/div[2]/div[2]/div[2]/div/div[1]/div/ng5-slider/span[12]/span[4]"));
    Slider.click();
    Thread.sleep(4000);
    
  
    
   //Energy Exchange between India and Bangladesh
   WebElement Select_Sub_KPI = driver.findElement(By.xpath("/html/body/app-root/ng-component/div/div[2]/div/div/div[1]/div/nav/ul/li[4]/ul/li[1]/ul/li[1]/div/a/p"));
   Select_Sub_KPI.click();
    Thread.sleep(4000);
    
    
  //===============Month Slider====================
    
    WebElement MSliderr = driver.findElement(By.xpath("/html/body/app-root/ng-component/div/div[2]/div/div/div[2]/div[2]/div[2]/div/div[2]/div/ng5-slider/span[12]/span[11]"));
    MSliderr.click();
     Thread.sleep(4000);
    // Bangladesh
    
    List <WebElement> col = driver.findElements(By.xpath("/html/body/app-root/ng-component/div/div[2]/div/div/div[2]/div[2]/div[1]/div[5]/div/div/div/div[1]/div/table/thead/tr/th"));
    //Total Power Plants Installed Capacity Fuel Wise in India : 2010-2023
     
    for(int i=1;i<=col.size();i++)
   {
     WebElement tablehead = driver.findElement(By.xpath("/html/body/app-root/ng-component/div/div[2]/div/div/div[2]/div[2]/div[1]/div[5]/div/div/div/div[1]/div/table/thead/tr/th["+i+"]"));
      if(tablehead.getText()==BangladeshDate2022 || tablehead.getText().equalsIgnoreCase(BangladeshDate2022))
     {
   	   
   	  WebElement tablerow = driver.findElement(By.xpath("/html/body/app-root/ng-component/div/div[2]/div/div/div[2]/div[2]/div[1]/div[5]/div/div/div/div[1]/div/table/tbody/tr/td["+i+"]")); 	   
   	    float valueof2023= Float.parseFloat(tablerow.getText().replace(",", ""));
   	    System.out.print("||"+BangladeshDate2022+" Bangladesh Energy Exchange between India and Bangladesh 2022||"+valueof2023);
   	      System.out.println();
     }
   }
       }
@Test(priority=44) 
public void Bhutan_NetEnergyExchange_2022 () throws InterruptedException {
	
//Energy Exchange between India and Bhutan KPI
WebElement Energy_Exchange_with_Bhutan_Sub_KPI = driver.findElement(By.xpath("/html/body/app-root/ng-component/div/div[2]/div/div/div[1]/div/nav/ul/li[4]/ul/li[1]/ul/li[2]/div/a/p"));
Energy_Exchange_with_Bhutan_Sub_KPI.click();
 Thread.sleep(4000);
 
//===============Month Slider====================
 
 WebElement MSliderr = driver.findElement(By.xpath("/html/body/app-root/ng-component/div/div[2]/div/div/div[2]/div[2]/div[2]/div/div[2]/div/ng5-slider/span[12]/span[11]"));
 MSliderr.click();
  Thread.sleep(4000);
 // Bangladesh
 
 //Bhutan
 List <WebElement> col = driver.findElements(By.xpath("/html/body/app-root/ng-component/div/div[2]/div/div/div[2]/div[2]/div[1]/div[5]/div/div/div/div[1]/div/table/thead/tr/th"));
 //Total Power Plants Installed Capacity Fuel Wise in India : 2010-2023
for(int i=1;i<=col.size();i++)
{
  WebElement tablehead = driver.findElement(By.xpath("/html/body/app-root/ng-component/div/div[2]/div/div/div[2]/div[2]/div[1]/div[5]/div/div/div/div[1]/div/table/thead/tr/th["+i+"]"));
   if(tablehead.getText()==BhutanDate2022 || tablehead.getText().equalsIgnoreCase(BhutanDate2022))
  {
	   
	  WebElement tablerow = driver.findElement(By.xpath("/html/body/app-root/ng-component/div/div[2]/div/div/div[2]/div[2]/div[1]/div[5]/div/div/div/div[1]/div/table/tbody/tr/td["+i+"]")); 	   
	    float valueof2023= Float.parseFloat(tablerow.getText().replace(",", ""));
	    System.out.print("||"+BhutanDate2022+" Energy Exchange between India and Bhutan 2022||"+valueof2023);
	      System.out.println();
}
}
}
@Test(priority=45) 
public void Nepal_NetEnergyExchange_2022 () throws InterruptedException {
	
//Energy Exchange between India and Nepal KPI
WebElement Energy_Exchange_with_Nepal_Sub_KPI = driver.findElement(By.xpath("/html/body/app-root/ng-component/div/div[2]/div/div/div[1]/div/nav/ul/li[4]/ul/li[1]/ul/li[3]/div/a/p"));
Energy_Exchange_with_Nepal_Sub_KPI.click();
 Thread.sleep(4000);
 
//===============Month Slider====================
 
 WebElement MSliderr = driver.findElement(By.xpath("/html/body/app-root/ng-component/div/div[2]/div/div/div[2]/div[2]/div[2]/div/div[2]/div/ng5-slider/span[12]/span[11]"));
 MSliderr.click();
  Thread.sleep(4000);
 // Bangladesh
 
 
 //Nepal
 List <WebElement> col = driver.findElements(By.xpath("/html/body/app-root/ng-component/div/div[2]/div/div/div[2]/div[2]/div[1]/div[5]/div/div/div/div[1]/div/table/thead/tr/th"));
 //Total Power Plants Installed Capacity Fuel Wise in India : 2010-2023
for(int i=1;i<=col.size();i++)
{
  WebElement tablehead = driver.findElement(By.xpath("/html/body/app-root/ng-component/div/div[2]/div/div/div[2]/div[2]/div[1]/div[5]/div/div/div/div[1]/div/table/thead/tr/th["+i+"]"));
   if(tablehead.getText()==NepalDate2022 || tablehead.getText().equalsIgnoreCase(NepalDate2022))
  {
	   
	  WebElement tablerow = driver.findElement(By.xpath("/html/body/app-root/ng-component/div/div[2]/div/div/div[2]/div[2]/div[1]/div[5]/div/div/div/div[1]/div/table/tbody/tr/td["+i+"]")); 	   
	    float valueof2023= Float.parseFloat(tablerow.getText().replace(",", ""));
	    System.out.print("||"+NepalDate2022+" Energy Exchange between India and Nepal 2022||"+valueof2023);
	      System.out.println();
}
}
}


@Test(priority=46) 
public void Transnational_Exchange_of_Power_with_Bangladesh_Day_Peak_2022 () throws InterruptedException {
// Transnational Exchange of Power (Day Peak)
	 System.out.println();
	
WebElement Select_KPI_DayPeak = driver.findElement(By.xpath("/html/body/app-root/ng-component/div/div[2]/div/div/div[1]/div/nav/ul/li[4]/ul/li[2]/a/p"));
Select_KPI_DayPeak.click();
 Thread.sleep(4000);
  
 //Exchange of Power between India and Bangladesh
 WebElement Select_Sub_KPI = driver.findElement(By.xpath("/html/body/app-root/ng-component/div/div[2]/div/div/div[1]/div/nav/ul/li[4]/ul/li[2]/ul/li[1]/div/a/p"));
 Select_Sub_KPI.click();
  Thread.sleep(4000);
//===============Month Slider====================
  
 WebElement MSliderr = driver.findElement(By.xpath("/html/body/app-root/ng-component/div/div[2]/div/div/div[2]/div[2]/div[2]/div/div[2]/div/ng5-slider/span[12]/span[11]"));
 MSliderr.click();
  Thread.sleep(4000);
  
  // Bangladesh
  List <WebElement> col = driver.findElements(By.xpath("/html/body/app-root/ng-component/div/div[2]/div/div/div[2]/div[2]/div[1]/div[5]/div/div/div/div[1]/div/table/thead/tr/th"));
  //Total Power Plants Installed Capacity Fuel Wise in India : 2010-2023
 for(int i=1;i<=col.size();i++)
 {
   WebElement tablehead = driver.findElement(By.xpath("/html/body/app-root/ng-component/div/div[2]/div/div/div[2]/div[2]/div[1]/div[5]/div/div/div/div[1]/div/table/thead/tr/th["+i+"]"));
    if(tablehead.getText()==BangladeshDate2022 || tablehead.getText().equalsIgnoreCase(BangladeshDate2022))
   {
 	   
 	  WebElement tablerow = driver.findElement(By.xpath("/html/body/app-root/ng-component/div/div[2]/div/div/div[2]/div[2]/div[1]/div[5]/div/div/div/div[1]/div/table/tbody/tr/td["+i+"]")); 	   
 	    float valueof2023= Float.parseFloat(tablerow.getText().replace(",", ""));
 	    System.out.print("||"+BangladeshDate2022+" Exchange of Power with Bangladesh (Day Peak)2022||"+valueof2023);
 	      System.out.println();
  
	  
   }
 }
     }
@Test(priority=47) 
//==============Exchange of Power with Bhutan (Day Peak)================
public void Bhutan_NetEnergyExchange_dayPeak_2022 () throws InterruptedException {
	
//Energy Exchange between India and Bhutan KPI
WebElement Energy_Exchange_with_Bhutan_Sub_KPI = driver.findElement(By.xpath("/html/body/app-root/ng-component/div/div[2]/div/div/div[1]/div/nav/ul/li[4]/ul/li[2]/ul/li[2]/div/a/p"));
Energy_Exchange_with_Bhutan_Sub_KPI.click();
 Thread.sleep(4000);
 
//===============Month Slider====================
 
WebElement MSliderr = driver.findElement(By.xpath("/html/body/app-root/ng-component/div/div[2]/div/div/div[2]/div[2]/div[2]/div/div[2]/div/ng5-slider/span[12]/span[11]"));
MSliderr.click();
 Thread.sleep(4000);
 
 //Bhutan
 List <WebElement> col = driver.findElements(By.xpath("/html/body/app-root/ng-component/div/div[2]/div/div/div[2]/div[2]/div[1]/div[5]/div/div/div/div[1]/div/table/thead/tr/th"));
 //Total Power Plants Installed Capacity Fuel Wise in India : 2010-2023
for(int i=1;i<=col.size();i++)
{
  WebElement tablehead = driver.findElement(By.xpath("/html/body/app-root/ng-component/div/div[2]/div/div/div[2]/div[2]/div[1]/div[5]/div/div/div/div[1]/div/table/thead/tr/th["+i+"]"));
   if(tablehead.getText()==BhutanDate2022 || tablehead.getText().equalsIgnoreCase(BhutanDate2022))
  {
	   
	  WebElement tablerow = driver.findElement(By.xpath("/html/body/app-root/ng-component/div/div[2]/div/div/div[2]/div[2]/div[1]/div[5]/div/div/div/div[1]/div/table/tbody/tr/td["+i+"]")); 	   
	    float valueof2023= Float.parseFloat(tablerow.getText().replace(",", ""));
	    System.out.print("||"+BhutanDate2022+" Energy Exchange between India and Bhutan 2022||"+valueof2023);
	      System.out.println();
}
}
}

@Test(priority=48) 
//==============Exchange of Power with Nepal (Day Peak)================
public void Nepal_NetEnergyExchange_dayPeak_2022() throws InterruptedException {
	
//Energy Exchange between India and Nepal KPI
WebElement Energy_Exchange_with_Nepal_Sub_KPI = driver.findElement(By.xpath("/html/body/app-root/ng-component/div/div[2]/div/div/div[1]/div/nav/ul/li[4]/ul/li[2]/ul/li[3]/div/a/p"));
Energy_Exchange_with_Nepal_Sub_KPI.click();
 Thread.sleep(4000);
 
 
//===============Month Slider====================
 
WebElement MSliderr = driver.findElement(By.xpath("/html/body/app-root/ng-component/div/div[2]/div/div/div[2]/div[2]/div[2]/div/div[2]/div/ng5-slider/span[12]/span[11]"));
MSliderr.click();
 Thread.sleep(4000);
 
 //Nepal
 List <WebElement> col = driver.findElements(By.xpath("/html/body/app-root/ng-component/div/div[2]/div/div/div[2]/div[2]/div[1]/div[5]/div/div/div/div[1]/div/table/thead/tr/th"));
 //Total Power Plants Installed Capacity Fuel Wise in India : 2010-2023
for(int i=1;i<=col.size();i++)
{
  WebElement tablehead = driver.findElement(By.xpath("/html/body/app-root/ng-component/div/div[2]/div/div/div[2]/div[2]/div[1]/div[5]/div/div/div/div[1]/div/table/thead/tr/th["+i+"]"));
   if(tablehead.getText()==NepalDate2022 || tablehead.getText().equalsIgnoreCase(NepalDate2022))
  {
	   
	  WebElement tablerow = driver.findElement(By.xpath("/html/body/app-root/ng-component/div/div[2]/div/div/div[2]/div[2]/div[1]/div[5]/div/div/div/div[1]/div/table/tbody/tr/td["+i+"]")); 	   
	    float valueof2023= Float.parseFloat(tablerow.getText().replace(",", ""));
	    System.out.print("||"+NepalDate2022+" Exchange of Power with Nepal Day Peak 2022||"+valueof2023);
	      System.out.println();
}
}
System.out.println();
Thread.sleep(4000);
}

	
}
