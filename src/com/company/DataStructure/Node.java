package com.company.DataStructure;

public class Node {

    private String character;
    private Node[] children;
    private boolean leaf;
    private boolean visited;

    public Node(String character) {
        this.character = character;
        children = new Node[Constant.ALPHABET_SIZE];
    }
}
