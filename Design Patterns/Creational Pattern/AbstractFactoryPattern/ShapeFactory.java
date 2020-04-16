package AbstractFactoryPattern;

//创建实现相同接口的具体类。 
//创建工厂类，根据给定信息扩展AbstractFactory以生成具体类的对象。
public class ShapeFactory extends AbstractFactory {

	@Override
	   public Shape getShape(String shapeType){

	      if(shapeType == null){
	         return null;
	      }

	      if(shapeType.equalsIgnoreCase("CIRCLE")){
	         return new Circle();

	      }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
	         return new Rectangle();

	      }else if(shapeType.equalsIgnoreCase("SQUARE")){
	         return new Square();
	      }

	      return null;
	   }

	   @Override
	   Color getColor(String color) {
	      return null;
	   }

}
