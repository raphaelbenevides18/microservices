package br.com.rlb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rlb.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
