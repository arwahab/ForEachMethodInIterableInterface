# ForEachMethodInIterableInterface

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
