package com.kang.service;

import com.kang.pojo.Books;

import java.util.List;

/**
 * @author Kangshitao
 * @date 2021年7月2日 上午10:37
 */
public interface BookService {
    int addBook(Books books);

    int deleteBookById(int id);

    int updateBook(Books books);

    Books queryBookById(int id);

    List<Books> queryAllBooks();

    List<Books> queryBookByName(String bookName);
}
