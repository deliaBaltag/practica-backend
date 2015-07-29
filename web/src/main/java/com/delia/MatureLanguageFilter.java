package com.delia;

import com.delia.model.Comment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Delia on 7/29/2015.
 */
public class MatureLanguageFilter {
    public static Comment replaceMatureWord(Comment comment){
        String commentWords[] = comment.getText().split(" ");
        StringBuilder sb = new StringBuilder("");
        for(String word : commentWords){
            if(BAD_WORDS.contains(word.toLowerCase())){
                sb.append("**** ");
            }else{
                sb.append(word + " ");
            }
        }
        comment.setText(sb.toString());
        return comment;
    }

    public static List<String > BAD_WORDS = new ArrayList<String>(Arrays.asList("fuck", "fuckoff", "prick", "asshole"));
}
