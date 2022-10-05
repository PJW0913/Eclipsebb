package stream_objectinputstream_objectoutputstream;

import java.io.Serializable;

public class ClassA implements Serializable {

	int field1;
	ClassB field2 = new ClassB();
	static int field3;
	transient int field4;	//field4가 패스워드이면 출력되면 안되니까 transient로 선언한다.
}
