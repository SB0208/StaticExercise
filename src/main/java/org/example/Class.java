package org.example;

public class Class {

   private static int totalCount = 0;
    private static int instanceCount = 0;

    public Class(){}


   public static void incrementTotalCount(){
        totalCount++;
   }

   public void incrementInstanceCount(){
        this.instanceCount++;
   }

   public static int getTotalCount(){
        return totalCount;
   }


    public int getInstanceCount() {
        return instanceCount;
    }

    public void setInstanceCount(int instanceCount) {
        this.instanceCount = instanceCount;
    }

    public static int getTotalCount() {
        return totalCount;
    }

    public static void setTotalCount(int totalCount) {
        Class.totalCount = totalCount;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
