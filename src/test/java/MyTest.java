import com.kang.pojo.Books;
import com.kang.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Kangshitao
 * @date 2021年7月2日 下午3:40
 */
public class MyTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = context.getBean("bookServiceImpl", BookService.class);
        Books books = bookService.queryBookById(3);
        System.out.println(books.toString());
    }
}
