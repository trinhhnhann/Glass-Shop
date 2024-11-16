package Controller;

import Product.ProductDAO;
import Product.ProductInfo;
import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@MultipartConfig
public class AddProductServlet extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String glassId = request.getParameter("userId");
        String glassName = request.getParameter("fullName");
        String description = request.getParameter("description");
        String type = request.getParameter("type");
        float price = Float.parseFloat(request.getParameter("price"));
        int status = 1; // Assuming status is set to 1 by default

        Part filePart = request.getPart("image");
        String fileName = getFileName(filePart);
        
        // Get the absolute path to the web directory
        String appPath = request.getServletContext().getRealPath("");
        // Define the path to save the file
        String savePath = appPath + "IMG" + File.separator + fileName;
        // Define the relative path to be saved in the database
        String webPath = "IMG/" + fileName;

        // Ensure the directory exists
        File fileSaveDir = new File(appPath + "IMG");
        if (!fileSaveDir.exists()) {
            fileSaveDir.mkdirs();
        }
        // Save the file to the specified directory
        filePart.write(savePath);

        // Create ProductDAO object
        ProductDAO productDAO = new ProductDAO();
        
        try {
            ProductInfo existingProduct = productDAO.getGlassById(glassId);
            if (existingProduct == null) {
                // Create ProductInfo object
                ProductInfo newProduct = new ProductInfo(glassId, glassName, description, type, webPath, price, status);
                // Save the product info to the database
                productDAO.addGlass(newProduct);
                request.setAttribute("MESSAGE", "Product has been created successfully!");
                response.sendRedirect("ShopFOrAdmin"); // Redirect to product list page
            } else {
                request.setAttribute("error", glassId + " already exists! Please enter another ID!");
                request.getRequestDispatcher("AddProduct.jsp").forward(request, response); // Forward to addProduct.jsp with error
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
            request.setAttribute("error", "Invalid price format. Please enter a valid number.");
            request.getRequestDispatcher("AddProduct.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("error", "An error occurred while processing your request.");
            request.getRequestDispatcher("AddProduct.jsp").forward(request, response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

    private String getFileName(Part part) {
        for (String content : part.getHeader("content-disposition").split(";")) {
            if (content.trim().startsWith("filename")) {
                return content.substring(content.indexOf('=') + 1).trim().replace("\"", "");
            }
        }
        return null;
    }
}
