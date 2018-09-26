package lk.ijse.spring.admin.service.impl;

import lk.ijse.spring.admin.dto.CommentDTO;
import lk.ijse.spring.admin.entity.Comment;
import lk.ijse.spring.admin.repository.CommentRepository;
import lk.ijse.spring.admin.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional(propagation = Propagation.SUPPORTS ,readOnly = true)
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentRepository commentRepository;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean saveComment(CommentDTO commentDTO) {
        Comment comment=new Comment(commentDTO.getName(),
                commentDTO.getEmail(),
                commentDTO.getContact(),
                commentDTO.getComment());
        commentRepository.save(comment);

        return true;
    }

    @Override
    public ArrayList<CommentDTO> getAllComments() {
        List<Comment> comments=commentRepository.findAll();

        ArrayList<CommentDTO> alComments=new ArrayList<>();
        for (Comment comment: comments) {
            CommentDTO commentDTO=new CommentDTO(
                    comment.getCommentID(),
                    comment.getName(),
                    comment.getEmail(),
                    comment.getContact(),
                    comment.getComment());

            alComments.add(commentDTO);
        }
        return alComments;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean deleteComment(int commentID) {
        commentRepository.deleteById(commentID);
        return true;
    }
}
