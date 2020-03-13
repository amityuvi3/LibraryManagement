package com.tr.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.model.BookBean;
import com.model.RegistrationBean;
@Repository
public interface BookBeanRepository extends JpaRepository<BookBean, Integer>{

	@Query("select bb  from BookBean bb where userId=?1")
	BookBean bookValidation(int bookId);
    @Query("select bb  from BookBean bb where authorName=?1")
    List<BookBean> getBooksByCategoryAuthor_Name(String category);

    @Query("select bb  from BookBean bb where bookName=?1")
    List<BookBean> getBooksByCategoryBook_Name(String category);
    @Query("select bb  from BookBean bb where subject=?1")
    List<BookBean> getBooksByCategorySubject_Name(String category);
    
    /*
    @Query("update book_bean SET bookNumber=?, subject=?, bookName=?, authorName=? where bookId=?1")
    List<BookBean> updateBooks(Integer bookId);
    */
    /*public void update(BookBean book) {
        jdbcTemplate.update(
                "UPDATE book_bean SET bookNumber=?, subject=?, bookName=?, authorName=? where bookId="
                member.getForename(), member.getSurname(),
                member.getAddress1(), member.getAddress2(), member.getCity(),
                member.getPostcode(), member.getId());
    }
*/
}

