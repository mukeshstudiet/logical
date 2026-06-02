package LogicTest;

	/**
	 * This class implements Circular queue using array of size N.
	 */
	public class CircularQueue
	{
	/** Array used for circular queue.*/
	int[] _userArray;
	/** Sizeof the array/queue.*/
	int _size;
	/** Head location.*/
	int _head;
	/** Tail location.*/
	int _tail;
	/** Number of elements on queue.*/
	int _count;

	/**
	* Constructor.
	* @param size Sizeof queue/array.
	*/
	public CircularQueue(int size)
	{
	if (size < 0)
	{
	throw new IllegalArgumentException("Invalid Size Requested!");
	}
	_size = size;
	}

	/**
	* Initialize all data.
	*/
	public void initialize()
	{
	_userArray = new int[_size];
	_head = _count =0;
	_tail = -1;
	}

	/**
	* Enqueue element on the queue.
	* @param item Item to enque.
	* @throws Exception If queue is full.
	*/
	public void enqueue(int item) throws Exception
	{
	if (_count == _size)
	{
	throw new Exception("Queue is Full");
	}
	// add element
	synchronized (_userArray)
	{
	_userArray[(++_tail) % _size] = item;
	_count ++;
	}
	}

	/**
	* Dequeue element from queue.
	* @return Item.
	* @throws Exception If queue is empty.
	*/
	public int dequeue() throws Exception
	{
	int retVal;
	if (_count == 0 )
	{
	throw new Exception("Queue is Empty");
	}
	// remove element
	synchronized (_userArray)
	{
	retVal = _userArray[_head];
	_head = (_head  + 1) % (_size);
	_count --;
	}
	return retVal;
	}
	}

