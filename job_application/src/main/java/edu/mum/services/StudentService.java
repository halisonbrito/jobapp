package edu.mum.services;

import edu.mum.entities.Student;
import edu.mum.repositories.IStudentDao;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class StudentService implements IStudentService{
    @Resource
    private IStudentDao studentDao;

    @Override
    public List<Student> getAll() {
        return studentDao.findAll();
    }

    @Override
    public Long add(Student student) {
        return studentDao.save(student).getId();
    }

    @Override
    public void delete(Long id) {
        studentDao.delete(get(id));
    }

    @Override
    public Long update(Student student) {
        return studentDao.save(student).getId();
    }

    @Override
    public Student get(Long id) {
        return studentDao.findById(id).get();
    }
}
