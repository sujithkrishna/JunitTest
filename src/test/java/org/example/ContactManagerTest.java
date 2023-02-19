package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class ContactManagerTest {
    @Test
    @DisplayName("Should Create Contact")
    public void shouldCreateContact() {
        ContactManager contactManager = new ContactManager();
        contactManager.addContact("John", "Doe", "0123456789");
        assertFalse(contactManager.getAllContacts().isEmpty());
        assertEquals(1, contactManager.getAllContacts().size());
    }
    @Test
    @DisplayName("Should Throw Exception Contact")
    public void shouldThrowException() {
        ContactManager contactManager = new ContactManager();
        contactManager.addContact("John", "Doe", "0123456789");
        Contact contact= new Contact("John", "Doe", "0123456789");
        Exception exception = assertThrows(RuntimeException.class, () -> {
            contactManager.checkIfContactAlreadyExist(contact);
        });

        String expectedMessage = "Contact Already Exists";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.equals(expectedMessage));


    }
}