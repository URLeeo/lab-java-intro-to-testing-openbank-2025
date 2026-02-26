package org.example;

public class Keywords {
    public static boolean containsJavaKeyword(String text) {
        if (text == null) {
            return false;
        }
        text = text.trim();
        if (text.isEmpty()) {
            return false;
        }

        String[] keywords = {
                "abstract","assert","boolean","break","byte","case","catch","char","class",
                "const","continue","default","do","double","else","enum","extends","final",
                "finally","float","for","goto","if","implements","import","instanceof","int",
                "interface","long","native","new","package","private","protected","public",
                "return","short","static","strictfp","super","switch","synchronized","this",
                "throw","throws","transient","try","void","volatile","while",
                "true","false","null"
        };

        text = text.toLowerCase();
        String[] words = text.split("[^a-z]+");


        for (String word : words) {
            if (word.isEmpty()) continue;

            for (String kw : keywords) {
                if (word.equals(kw)) {
                    return true;
                }
            }
        }
        return false;
    }

}
