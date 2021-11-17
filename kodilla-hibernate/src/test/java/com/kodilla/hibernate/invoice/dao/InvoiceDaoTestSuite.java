package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Autowired
    private ItemDao itemDao;

    @Autowired
    private ProductDao productDao;

    @Test
    void testInvoiceDaoSave() {
        // Given
        Invoice invoice = new Invoice("2021/11/13/01221");

        Product product1 = new Product("Książka");
        Product product2 = new Product("Słuchawki");
        Product product3 = new Product("Plecak");

        productDao.save(product1);
        productDao.save(product2);
        productDao.save(product3);

        Item item1 = new Item(product1, new BigDecimal(30), 20, new BigDecimal(600));
        Item item2 = new Item(product2, new BigDecimal(35), 20, new BigDecimal(700));
        Item item3 = new Item(product3, new BigDecimal(40), 20, new BigDecimal(800));

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        invoiceDao.save(invoice);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        itemDao.save(item1);
        itemDao.save(item2);
        itemDao.save(item3);

        // When
        int invoiceId = invoice.getId();

        // Then
        assertNotEquals(0, invoiceId);
        assertEquals(3, invoice.getItems().size());

        // Cleanup
        try {
            productDao.deleteAll();
            itemDao.deleteAll();
            invoiceDao.deleteAll();
        } catch (Exception e) {
            //do nothing
        }
    }
}
