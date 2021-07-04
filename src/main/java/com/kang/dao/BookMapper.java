package com.kang.dao;

import com.kang.pojo.Books;

import java.util.List;

/**
 * @author Kangshitao
 * @date 2021年7月1日 下午9:58
 */
public interface BookMapper {
    int addBook(Books books);

    int deleteBookById(int id);

    int updateBook(Books books);

    Books queryBookById(int id);

    List<Books> queryAllBooks();

    List<Books> queryBookByName(String bookName);
}
