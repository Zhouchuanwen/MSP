package com.alan.book.repo;

import com.alan.book.bean.Book;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


/**
 * Created by alan on 17/3/16.
 */

public interface BookTestRepository extends CrudRepository<Book, Long> {

    List<Book> findTop10ByBookName(String bookName, Pageable pageable);

}
