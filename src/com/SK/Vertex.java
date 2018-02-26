package com.SK;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    private int data;
    private boolean visited;
    private List<Vertex> NeighbourList;

    public Vertex(int data) {
        this.data = data;
        this.NeighbourList = new ArrayList<>();
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Vertex> getNeighbourList() {
        return NeighbourList;
    }

    @Override
    public String toString() {
        return "" + this.data;
    }

    public void addNeighbourVertex(Vertex vertex){
        this.NeighbourList.add(vertex);
    }
}
