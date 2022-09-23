package com.example.productdiscountcalculator;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "ProductDiscountServlet", value = "/discount")
public class ProductDiscountServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        float price = Float.parseFloat(req.getParameter("Price"));
        float percent = Float.parseFloat(req.getParameter("Percent"));
        double amount = price * percent * 0.01;
        double priceAfterTax = price - amount;
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<h2>Discount Amount: " + amount + "</h2>");
        writer.println("<h2>Discount Price : " + priceAfterTax + "</h2>");
        writer.println("</html>");
    }

    public void destroy() {
    }
}