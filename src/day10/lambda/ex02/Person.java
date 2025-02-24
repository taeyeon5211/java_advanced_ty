package day10.lambda.ex02;

public class Person {
    private String name;
    private String job;
    private String content;
    private String title;

    public Person(String name, String job, String content) {
        this.name = name;
        this.job = job;
        this.content = content;
    }

    public Person(String name, String job, String content, String title) {
        this.name = name;
        this.job = job;
        this.content = content;
        this.title = title;
    }

    public void action(Workable workable) {
        workable.work(name, job);
    }

    public void action2(Speakable speakable) {
        speakable.speak(content);
    }

    public void action3(Sing sing) {
        sing.sing(title);
    }
}
