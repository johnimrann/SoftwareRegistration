package fr.imrann.softwwareregistration;

public class Softwareregistration {

	private static int nombreDeLicenceMax = 3;
		
	public static int getNombreDeLicenceMax() 
		{
		return nombreDeLicenceMax;
		}
	public static void setNombreDeLicenceMax(int nombreDeLicenceMax) 
		{
		Softwareregistration.nombreDeLicenceMax = nombreDeLicenceMax;
		}
	
	private String license;
	
	public String setLicense(String license) {
		this.license = license;
		return license;
	}
	public String getLicense() 
		{
		return license;
		}
	
	public Softwareregistration(String license) 
		{
	    this.license = license;
	    
	    if(getNombreDeLicenceMax()>0) {
	    	nombreDeLicenceMax --;
	    System.out.println("Nouvelle license acheté : " + this.license + " - Il vous reste : " + this.nombreDeLicenceMax + " licenses ");
	    }
	    else
	    { 
	    System.out.println("Nombre de license max atteint :) Vous ne pouvez plus creer de nouvelle license !");
	    }
		}
}
	
	

	
    
	
	

