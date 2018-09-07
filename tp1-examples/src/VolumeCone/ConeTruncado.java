package VolumeCone;

public class ConeTruncado {

	int Rb, Rm, G;
	ConeTruncado(){
		
	}
	
	ConeTruncado(int Rb, int Rm, int G){
		this.Rb = Rb;
		this.Rm = Rm;
		this.G = G;
		
	}
	
	public double CalculoDoVolume(){
		return ((Math.PI)*(Math.sqrt(Math.pow(this.G,2) - 
				Math.pow((this.Rb - this.Rm),2)))*
				(Math.pow(this.Rb, 2) + 
				Math.pow(this.Rm, 2) + 
				(this.Rb*this.Rm))) / 
				3 ;  
	}
	
	public void ImprimirValores() {
		System.out.println("Valores->Rb: "+this.Rb+" Rm:"+this.Rm+" G:"+this.G );
	}
	
	
}
