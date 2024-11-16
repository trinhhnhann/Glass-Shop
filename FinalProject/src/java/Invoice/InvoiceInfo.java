/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Invoice;

/**
 *
 * @author nhana
 */
public class InvoiceInfo {
    private String invId;
    private String userId;
    private float total;
    private String dateBuy;
    private String gmail;
    private String address;
    
    public InvoiceInfo(){
        
    }
    
    public InvoiceInfo(String invId,String userId,String dateBuy,String gmail,String address,float total){
        this.invId=invId;
        this.userId=userId;
        this.dateBuy=dateBuy;
        this.gmail=gmail;
        this.address=address;
        this.total=total;
    }

    public String getInvId() {
        return invId;
    }

    public void setInvId(String invId) {
        this.invId = invId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getDateBuy() {
        return dateBuy;
    }

    public void setDateBuy(String dateBuy) {
        this.dateBuy = dateBuy;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
}
