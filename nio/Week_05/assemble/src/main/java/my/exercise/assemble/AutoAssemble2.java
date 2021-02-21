package my.exercise.assemble;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Data
@Service
public class AutoAssemble2 {
    @Autowired
    Student2 student2;
}
