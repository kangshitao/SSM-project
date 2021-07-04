package com.kang.controller;

import com.kang.pojo.Books;
import com.kang.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.awt.print.Book;
import java.util.List;

/**
 * @author Kangshitao
 * @date 2021年7月2日 下午3:20
 */
@Controller
@RequestMapping("/book")
public class BookController {
    //controller调用service层
    @Autowired
    @Qualifier("bookServiceImpl")
    private BookService bookService;

    //查询全部书籍，并返回书籍展示页面视图
    @RequestMapping("/allBook")
    public String bookList(Model model){
        List<Books> books = bookService.queryAllBooks();
        model.addAttribute("bookList",books);
        return "allBook";
    }

    //跳转到查询页面
    @RequestMapping("/toAddBook")
    public String toAddBook(Model model){
        return "addBook";
    }

    //addBook
    @RequestMapping("/addBook")
    public String addBook(Books books){
        bookService.addBook(books);
        return "redirect:/book/allBook"; //重定向到书籍展示页面
    }

    //跳转到修改页面
    @RequestMapping("/toUpdateBook")
    public String toUpdateBook(int id,Model model){
        //通过前端传递过来的id查询出来对应的book信息，反馈到前端
        Books books = bookService.queryBookById(id);
        model.addAttribute("bookToUpdate",books);
        return "updateBook";
    }

    //updateBook
    @RequestMapping("/updateBook")
    public String updateBook(Books books){
        bookService.updateBook(books);
        return "redirect:/book/allBook";
    }

    //deleteBook
    @RequestMapping("/deleteBook/{bookId}")
    //使用restfull风格传递数据
    public String deleteBook(@PathVariable("bookId") int id){
        bookService.deleteBookById(id);
        return "redirect:/book/allBook";
    }

    //搜索书籍
    @RequestMapping("/searchBookByName")
    public String searchBookByName(@RequestParam("queryBookName")String queryBookName, Model model){
        List<Books> books = bookService.queryBookByName(queryBookName);
        //将查询到的结果重新写入到页面
        model.addAttribute("bookList",books);
        return "allBook";
    }
}
