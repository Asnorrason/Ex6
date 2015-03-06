/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.sal.cphbusiness.dto;

/**
 *
 * @author sofus
 */
public class PartDTO {
    private int pno;
    private String pName;
    private int qoh;
    private double price;
    private int oLevel;

    public PartDTO(int pno) {
        this.pno = pno;
    }

    public PartDTO(int pno, String pName, int qoh, double price, int oLevel) {
        this.pno = pno;
        this.pName = pName;
        this.qoh = qoh;
        this.price = price;
        this.oLevel = oLevel;
    }

    @Override
    public String toString() {
        return "PartDTO{" + "pno=" + pno + ", pName=" + pName + ", qoh=" + qoh + ", price=" + price + ", oLevel=" + oLevel + '}';
    }

    public int getPno() {
        return pno;
    }

    public void setPno(int pno) {
        this.pno = pno;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public int getQoh() {
        return qoh;
    }

    public void setQoh(int qoh) {
        this.qoh = qoh;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getoLevel() {
        return oLevel;
    }

    public void setoLevel(int oLevel) {
        this.oLevel = oLevel;
    }
    
    
}
