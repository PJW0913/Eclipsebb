package stream_objectinputstream_objectoutputstream;

import java.io.Serializable;

public class ClassA implements Serializable {

	int field1;
	ClassB field2 = new ClassB();
	static int field3;
	transient int field4;	//field4�� �н������̸� ��µǸ� �ȵǴϱ� transient�� �����Ѵ�.
}
