package lk.ijse.spring.admin.controller;

import lk.ijse.spring.admin.dto.CommentDTO;
import lk.ijse.spring.admin.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/comments")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE , produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean saveComment(@RequestBody CommentDTO comment){
        return commentService.saveComment(comment);
    }

    @DeleteMapping(value = "{commentID}" , produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean deleteComment(@PathVariable("commentID") int commentID){
        return commentService.deleteComment(commentID);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<CommentDTO> getAllComments(){
        return commentService.getAllComments();
    }
}
