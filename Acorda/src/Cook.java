//concrete builder
public class Cook extends Chef{

	@Override
	public String addSalt() {
		return "Sal:: insonsos h� por a� muitos!";
	}

	@Override
	public String addShirmp() {
		return "Caram�o:: adicionado com carinho!";
	}

	@Override
	public String addBread() {
		return "P�ozinho:: consist�ncia boa mnhami mnhami!";
	}

	@Override
	public String addWater() {
		return "�gua:: adicionado sem vinho!";
	}

	@Override
	public String addKisses() {
		return "Beijinhos!.. toque especial";
	}

	@Override
	public String addCoriander() {
		return "Coentros:: aquele gostinho!";
	}

	@Override
	public String addEggs() {
		return "Ovos:: para um pouquinho de cor!";
	}

	@Override
	public String addGarlic() {
		return "Alho:: uhhh.. saboroso!";
	}

	@Override
	public String addOliveOil() {
		return "Azeite:: loirinhhhhooo e do bom!";
	}		
	
	public void sleep(int milisseconds){
		try {
			Thread.sleep(milisseconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void cook(){
		System.out.println("Organiza panelas e estamin�... vamos l� fazer a bela da a�orda");
		sleep(4000);
		System.out.println(addOliveOil());
		System.out.println(addGarlic());
		sleep(4000);
		System.out.println(addBread());
		System.out.println(addCoriander());
		System.out.println(addSalt());
		sleep(4000);
		System.out.println(addShirmp());
		sleep(2000);
		System.out.println(addEggs());
		sleep(2000);
		System.out.println(addKisses()); //toque final
		System.out.println("Prontinho e gostosinho!");
		
	}
}
