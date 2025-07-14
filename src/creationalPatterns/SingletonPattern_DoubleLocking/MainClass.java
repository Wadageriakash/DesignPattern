package creationalPatterns.SingletonPattern_DoubleLocking;



//For the double locking it will check wether the object is created or not if it already created
// then it wonot create again. And in industry it majorly used.


//02) Singleton Pattern:
//----------------------------------------
//==> It is used when we have to create only one instnace of the class.
//*  4 ways to achive this:
//-----------------------------------
//01) Eager
//02) Lazy
//03) Synchronized method
//04) Double Locking
public class MainClass {

	public static void main(String[] args) {
		
		DBConnection connectionObj = DBConnection.getInstance();
	}
}
