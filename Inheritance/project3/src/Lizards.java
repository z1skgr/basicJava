
public class Lizards extends Animals {
		protected String coverMethod;
		
		public Lizards(String name, int count,String cover){ //Constructor
			super(name,count);
			coverMethod=cover;
		}

		
		public void printAnimals(){		//methodos ektipshs gia ths saures.energopoieite kai h methodos print ths uperklashs
			super.printAnimals();
			System.out.println("Methodos Kalypsis: "+coverMethod);
		}

		public String getCoverMethod() {	//Getter && Setters
			return coverMethod;
		}

		public void setCoverMethod(String coverMethod) {
			this.coverMethod = coverMethod;
		}
}
