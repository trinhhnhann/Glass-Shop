/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cart;

import java.io.Serializable;

/**
 *
 * @author nhana
 */
public class CartInfo implements Serializable{
    private static final long serialVersionUID = 1L; // Thêm serialVersionUID
    private String cardId;
    private String glassId;
    private String userId;
    private String invId;
    private float price;
    private int quantity;
    private float totalprice;
    private String image;
    
    public CartInfo(){
        
    }
    
    public CartInfo(String cardId,String glassId,String userId,String invId,float price,int quantity,float totalprice,String image){
        this.cardId=cardId;
        this.glassId=glassId;
        this.userId=userId;
        this.invId=invId;
        this.price=price;
        this.quantity=quantity;
        this.totalprice=totalprice;
        this.image=image;
        
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getInvId() {
        return invId;
    }

    public void setInvId(String invId) {
        this.invId = invId;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(float totalprice) {
        this.totalprice = totalprice;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getGlassId() {
        return glassId;
    }

    public void setGlassId(String glassId) {
        this.glassId = glassId;
    }
      
    
}
