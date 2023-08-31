package com.library.author.service;


import com.library.author.entity.Author;

public interface IAuthorService {

	Author getAuthor(Long id);

	Author createAuthor(Author author);

	void deleteAuthor(Long id);

	Author updateAuthor(Author author);

}
