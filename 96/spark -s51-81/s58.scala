Problem Scenario 58 : You have been given below code snippet. 
val a = sc.parallelize(List("dog", "tiger", "lion", "cat", "spider", "eagle"), 2) 
val b = a.keyBy(_.length) 

operation 1 

Write a correct code snippet for operation1 which will produce desired output, shown below. 
Array[(lnt, Seq[String])] = Array((4,ArrayBuffer(lion)), (6,ArrayBuffer(spider)), (3,ArrayBuffer(dog, cat)), (5,ArrayBuffer(tiger, eagle))) 

Solution : 

b.groupByKey.collect 
groupByKey [Pair] 

Very similar to groupBy, but instead of supplying a function, the key-component of each pair will automatically be presented to the partitioner. 

Listing Variants 

def groupBYKey():RDD[(K, Iterable[V])] 
def groupByKey(numPartitions: Int):RDD[(K, Iterable[V])] 
def groupByKey(partitioner: Partitioner):RDD[(K, Iterable[V])] 
