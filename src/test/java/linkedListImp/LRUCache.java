package linkedListImp;


import java.util.HashMap;
import java.util.Map;

class LRUCache {
    int capacity;
    Map<Integer, DLNode> map;
    DLNode head;
    DLNode tail;

    public LRUCache(int capacity) {
        map=new HashMap<>(capacity);
        head = new DLNode();
        tail = new DLNode();
        head.next = tail;
        head.prev = null;
        tail.next = null;
        tail.prev = head;
        this.capacity=capacity;
    }

    public int get(int key) {
        if(map.containsKey(key)){
            moveToHead(map.get(key));
            return map.get(key).value;
        }
        return -1;
    }

    public void put(int key, int value) {
        if(map.containsKey(key)){
            moveToHead(map.get(key));
            DLNode node = map.get(key);
            node.value = value;
        }
        else {
            if(map.size()==capacity){
                map.remove(tail.prev.key);
                deleteNode(tail.prev);
            }
            DLNode node = new DLNode();
            node.key = key;
            node.value = value;
            addStartHead(node);
            map.put(key, node);
        }
    }

    public void addStartHead(DLNode node){
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }

    public void deleteNode(DLNode node){
        DLNode prev = node.prev;
        DLNode next = node.next;
        prev.next = next;
        next.prev = prev;
    }

    public  void moveToHead(DLNode node){
        deleteNode(node);
        addStartHead(node);
    }
}

class DLNode {
    int key;
    int value;
    DLNode next;
    DLNode prev;
}

//    public DLNode(int key, int value) {
//        this.key = key;
//        this.value = value;
//    }