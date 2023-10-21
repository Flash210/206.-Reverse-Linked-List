class Node(var data: Int) {
    var next: Node? = null
}

class LinkedList {
    var head: Node? = null

    fun append(data: Int) {
        val newNode = Node(data)
        if (head == null) {
            head = newNode
            return
        }
        var current = head
        while (current?.next != null) {
            current = current.next
        }
        current?.next = newNode
    }



    fun ReverseLinkedList():Node? {

        var prev: Node? = null
        var curent: Node? = head

        while (curent != null){

            val next =curent.next
            curent.next=prev
            prev=curent
            curent=next
        }

        return prev


    }


    fun DisplayLinkedListData(){


        var curent= head

        while (curent!=null){
            print("${curent.data} ->")
            curent=curent.next
        }

        println("null")
    }




}
fun main(args: Array<String>) {

val list=LinkedList()

    list.append(1)
    list.append(2)
    list.append(3)
    list.append(4)

list.DisplayLinkedListData()
    System.out.println("The Reversed one ")

   list.head= list.ReverseLinkedList()
    list.DisplayLinkedListData()


}

