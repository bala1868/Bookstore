package com.example.Bookstore.Repository;

import com.example.Bookstore.Model.MyBookList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MyBookRepository extends JpaRepository<MyBookList,Integer>{

}
