package lk.ijse.spring.admin.service;

import lk.ijse.spring.admin.dto.CommentDTO;

import java.util.ArrayList;

public interface CommentService {

    public boolean saveComment(CommentDTO commentDTO);

    public ArrayList<CommentDTO> getAllComments();

    public boolean deleteComment(int commentID);

}
