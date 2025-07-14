package creationalPatterns.FactoryPattern;


 // ==> It is used when all the Object Creation and Its business Logic we need to keep at one place.
public class MainClass {

	public static void main(String[] args) {
		ShapeInstanceFactory factory = new ShapeInstanceFactory();
		Shape circleObj = factory.getShapeInstance("Circle");
		circleObj.computeArea();
	}
}
