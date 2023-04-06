package Package_1.generics;

public class ThreeDPrinter<T extends Material> {	
						  // Material상속받은 class만 사용가능을 뜻하는 조건식
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	public String toString() {		
		return material.toString();
	}
}
