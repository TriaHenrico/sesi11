class SpongeBob extends Hewan implements Manusia {
	public SpongeBob(){
		super("Spongbob", 2, false);
		}
		public void bersuara(){
			System.out.println("\nHallo petrik..");
			}
		public void menyanyi(){
			System.out.println("nye, nye, nye, wik, wik, wik");
			}
		public void ketawa(){
			System.out.println(" WKWKWKWKWKWKWKWK,,,,,");
			}
		public static void makan(){
			System.out.println("enyak enyak enyaaak...");
			}
		public void makan2(){
			super.makan();
			}
		public static void main(String[] args){
			SpongeBob s = new SpongeBob();
			s.isHewan();
			s.bersuara();
			s.menyanyi();
			s.ketawa();
			s.makan2();
			Hewan.makan();
			makan();
			}
	}