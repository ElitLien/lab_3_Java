package Task3;

import java.util.List;
import java.util.stream.Collectors;

public class StudentSimple {
    private long id;
    private String name;
    private String surName;

    public StudentSimple() {
    }

    public StudentSimple(final Student students) {
        this.name = students.getName();
        this.surName = students.getSurName();
        this.id = students.getId();
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(final String surName) {
        this.surName = surName;
    }

    public long getId() {
        return id;
    }

    public void setId(final long id) {
        this.id = id;
    }

    public List<StudentSimple> transformationList(final List<Student> students) {
        return students.stream()
                       .map(StudentSimple::new)
                       .collect(Collectors.toList());
    }
}
