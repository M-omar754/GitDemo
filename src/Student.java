class Student {
    private String name;
    private Subject[] subjects;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void fillSubjects() {
        subjects = new Subject[4];
        subjects[0] = new Subject();
        subjects[0].setName("Math");
        subjects[0].fillSubject();

        subjects[1] = new Subject();
        subjects[1].setName("Sciences");
        subjects[1].fillSubject();

        subjects[2] = new Subject();
        subjects[2].setName("English");
        subjects[2].fillSubject();

        subjects[3] = new Subject();
        subjects[3].setName("Arabic");
        subjects[3].fillSubject();
    }

    public double getAVG(String subjectName) {
        for (Subject subject : subjects) {
            if (subject.getName().equals(subjectName)) {
                return subject.getAVG();
            }
        }
        return -1;
    }

    public double getOverallAVG() {
        double sum = 0;
        for (Subject subject : subjects) {
            sum += subject.getAVG();
        }
        return sum / 4;
    }
}
