package com.example.demo.controllers;



import com.example.demo.models.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/student")
public class StudentController {

    private Long nextId = 1L;//по умолчанию 1


    // (GET) — показывает форму для ввода данных о студенте, создавая новый объект `Student`.
    @GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("student", new Student());
        return "student-form";
    }
// (POST) — принимает заполненные данные, присваивает студенту уникальный ID (используя `nextId`,
// который увеличивается при каждом сохранении), и передает данные на страницу результатов.
    @PostMapping("/form")
    public String processForm(@ModelAttribute Student student, Model model) {
        // Генерируем ID
        student.setId(nextId++);
        model.addAttribute("student", student);
        return "student-result";
    }

    @GetMapping("/new")
    public String newForm() {
        return "redirect:/student/form";
    }
}
//В методе `showForm()`  добавляются в
//модель пустого студента (`new Student()`),
//чтобы форма на странице могла привязать к нему свои поля.
//Когда пользователь заполняет форму и отправляет её,
//срабатывает `processForm()`, которая получает заполненные данные,
//создает у студента уникальный ID, присваивая ему значение `nextId`,
//и увеличивая его для следующего студента благодаря выражению `student.setId(nextId++);`.
//Затем этот объект студента с заполненными полями и ID передается обратно в модель и
//отображается на странице результатов.