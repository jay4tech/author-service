package com.library.author.controller;


import com.library.author.entity.Author;
import com.library.author.service.IAuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path ="author")
public class AuthorController {

    @Autowired
    IAuthorService authorService;

    /**
     *
     * @param id
     * @return Author
     */
    @GetMapping("/{id}")
    public Author getAuthor(@PathVariable Long id) {
        return authorService.getAuthor(id);
    }

    /**
     *
     * @param author
     * @return Author
     */
    @PostMapping("/")
    public Author createAuthor(@RequestBody Author author) {
        return authorService.createAuthor(author);
    }

    /**
     *
     * @param id
     */
    @DeleteMapping("/")
    public void deleleteAuthor(@RequestParam Long id) {
        authorService.deleteAuthor(id);
    }

    /**
     *
     * @param author
     * @return Author
     */
    @PutMapping("/")
    public Author updateAuthor(@RequestBody Author author) {
        return authorService.updateAuthor(author);
    }

}
