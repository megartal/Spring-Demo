package com.test.demo.api.v1.controllers;

import com.test.demo.domain.Book;
import com.test.demo.service.interf.BookService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

/**
 * @Author Akbar
 * @DATE 5/10/2018.
 */
public class BookRestControllerTest {

    @Mock
    BookService bookService;

    BookRestController controller;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        controller = new BookRestController(bookService);
    }

    @Test
    public void getBooks() throws Exception {
        //given
        Book book = new Book();
        book.setId(1);
        Iterable<Book> books = new ArrayList<>(Arrays.asList(book));
        when(bookService.findAllBooks()).thenReturn(books);

        //when
        Iterable<Book> allBooks = controller.getBooks();

        //then
        assertEquals(1, allBooks.iterator().next().getId());
    }

    @Test
    public void testMockMVC() throws Exception {
//        MockRestServiceServer by REST Client Testing With MockRestServiceServer

    }
}