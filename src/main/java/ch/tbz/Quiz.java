package ch.tbz;

public class Quiz {
    public static Animal[] animalQuiz = {
            new Animal("How many legs does a dog have?", "4"),

            new Animal("Which animal lives in the northpole? \n (a) penguin / (b) Ice Bear / (c) dolphin", "b"),
            new Animal("What is the biggest thing a whale can eat? \n (a) a car / (b) little crabs / (c) big fishies", "b"),

    };
    public static Language[] languageQuiz = {
        new Language("What is house in german?", "Haus"),
                new Language("What is kitchen cabin in german?", "chuchichästli"), // >:D
                new Language("What is Love in korean?", "사랑해"), // >:D
    };
    public static Switzerland[] switzerlandQuiz = {
            new Switzerland("What is the capital of switzerland? \n (a) Berne / (b) Zürich ", "b"), // >:D
            new Switzerland("Who is the best IT guy in switzerland?", "Gregor Muheim"),  // with a lot of lööv from BI18a
            new Switzerland("Who is the apple guy? \n (a) Manuel Müller / (b) Louis Define / (c) Willhelm Tell", "c"),
    };
}
