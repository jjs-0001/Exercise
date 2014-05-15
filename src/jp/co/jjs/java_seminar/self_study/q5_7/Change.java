package jp.co.jjs.java_seminar.self_study.q5_7;

public class Change {

    static String spanish(String egi){

        switch(egi){
        case "One": return "Uno";
        case "Two": return "Dos";
        case "Three": return "Tres";
        case "Four": return "Quatro";
        case "Five": return "Cinco";
        default:
            return "変換できませんでした";

        }
    }
}
