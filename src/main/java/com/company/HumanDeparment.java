package com.company;

import java.util.ArrayList;
import java.util.List;

public class HumanDeparment {

    private static HumanDeparment humanDeparment = new HumanDeparment();

    private List<Resume> resumeList = new ArrayList<Resume>();

    public static HumanDeparment get() {
        return humanDeparment;
    }

    public HumanDeparment uploadResumeContent(String name, String content) {
        Resume resume = new Resume();
        resume.setContent(content);
        resume.setName(name);
        resumeList.add(resume);
        return this;
    }

    public void finish() {
        for (Resume resume : resumeList) {
            System.out.println("RESUME READED -> " + resume.getName() + " " + resume.getContent());
        }
    }

    public static void main(String[] args) {

        HumanDeparment.get()
                .uploadResumeContent("furkan özmen", "javacı")
                .uploadResumeContent("evren", "c ci")
                .uploadResumeContent("faruk", "f ci");
        HumanDeparment.get().uploadResumeContent("ok","ok")
                .finish();
    }
}
