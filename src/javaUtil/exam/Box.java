package javaUtil.exam;

//public class Box {
//    private Object obj;
//    
//    public void setObj(Object obj) {
//    	this.obj = obj;
//    }
//    
//    public Object getObj() {
//    	return this.obj;
//    }
//}

public class Box<E> {
    private E obj;
    
    public void setObj(E obj) {
    	this.obj = obj;
    }
    
    public E getObj() {
    	return this.obj;
    }
}
