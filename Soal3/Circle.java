public class Circle extends GraphicObject {
	void resize(){
	System.out.println("Circle resize");
	}
	void drawShape(){
	System.out.println("Circle shape");
	}
	void position(){
	System.out.println(this.x + this.y);
	}
}