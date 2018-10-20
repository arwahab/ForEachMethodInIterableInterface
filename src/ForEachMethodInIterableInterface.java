import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/* Java 8 - forEach() demo
 * 
 * Need to create an Iterator each time we traverse through a Collection
 * Might get ConcurrentModificationException if Iterator uses improperly
 * Java 8 added forEach() method in Iterable interface 
 * This method will allow us to focus on business logic only
 * forEach() takes a Consumer object and helps in having business logic @ separate location
 * Which we can re-use
 * 
 * #Lines go up but forEach() helps in having separate logic for iteration & business logic
 * Results in higher separation of concern & cleaner code
 */

public class ForEachMethodInIterableInterface {

	public static void main(String[] args) {

		// creating an example Collection
		List<Integer> aList = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++)
			aList.add(i);

		// traversing using Iterator
		Iterator<Integer> iterator = aList.iterator();
		while (iterator.hasNext()) {
			Integer i = iterator.next();
			System.out.println("Iterator value: " + i);
		}

		// traversing through forEach() of Iterable with anonymous class
		aList.forEach(new Consumer<Integer>() {

			public void accept(Integer anInt) {
				System.out.println("forEach() anonymous class value: " + anInt);

			}

		});

		// traversing with Consumer interface implementation

		MyConsumer action = new MyConsumer();

		aList.forEach(action);

	}

}

// Consumer implementation that can be re-used

class MyConsumer implements Consumer<Integer> {

	public void accept(Integer anInt) {
		System.out.println("Consumer impl value: " + anInt);

	}
}
