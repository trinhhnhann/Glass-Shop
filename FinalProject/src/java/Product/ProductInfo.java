/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Product;

/**
 *
 * @author nhana
 */
public class ProductInfo {
    private String glassId;
    private String glassName;
    private String description;
    private String type;
    private String image;
    private float price;
    private int status;
    
    public ProductInfo(){
        
    }
    
    public ProductInfo(String glassId,String glassName,String description,String type,String image,float price,int status){
        this.glassId=glassId;
        this.glassName=glassName;
        this.description=description;
        this.type=type;
        this.image=image;
        this.price=price;
        this.status=status;
    }

    public String getGlassId() {
        return glassId;
    }

    public void setGlassId(String glassId) {
        this.glassId = glassId;
    }

    public String getGlassName() {
        return glassName;
    }

    public void setGlassName(String glassName) {
        this.glassName = glassName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
       
}
