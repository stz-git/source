package com.imooc.hashmap;


import javax.swing.tree.TreeNode;

public class ExtHashMap8<K,V> {

    private Node<K,V>[] table = new Node[10];

    final V put(int hash, K key, V value, boolean onlyIfAbsent, boolean evict){
        Node<K,V>[] tab;
        Node<K,V> p;
        int n;
        int i;
        if((tab = table) == null || (n = tab.length) == 0)
            //init table
            n = 10;

        if((p = tab[i = (n-1) & hash]) == null)
            //old Node = null;
            //add new Node directly
            tab[i] = new Node<K, V>();

        else{
            Node<K,V> e;
            K k;

            //old Node's index exists
            //first Node's key == this key??
            //why???TODO
            if(p.hash == hash && p.key == key)
                e = p;//to replace value

            //first Node is red-black treeNode??
            else if(p instanceof TreeNode)
                System.out.println("add TreeNode");


        }


        return null;
    }
    class Node<K,V>{
        public int hash;
        public K key;
        public V value;
        public Node next;
    }
}
