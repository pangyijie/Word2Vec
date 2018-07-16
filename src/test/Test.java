package test;

import com.ansj.vec.Learn;
import com.ansj.vec.Word2VEC;

import java.io.File;
import java.io.IOException;


public class Test {

    private static final File InputFile = new File("/Users/pangyijie/Documents/Word2Vec/corpus.txt");

    public static void main(String[] args) throws IOException {
/*        Word2VEC w1 = new Word2VEC() ;
        w1.loadGoogleModel("library/corpus.bin") ;

        System.out.println(w1.distance("奥尼尔"));

        System.out.println(w1.distance("毛泽东"));

        System.out.println(w1.distance("邓小平"));


        System.out.println(w1.distance("魔术队"));

        System.out.println(w1.distance("魔术"));*/

        //进行分词训练
        /*Learn lean = new Learn();
        lean.learnFile(InputFile);
        lean.saveModel(new File("/Users/pangyijie/Documents/JAVA_Test/Word2Vec/vector.mod"));*/

        //加载测试
        Word2VEC w2v = new Word2VEC();
        w2v.loadJavaModel("/Users/pangyijie/Documents/Word2Vec/vector.mod");
        System.out.println(w2v.distance("up"));
        System.out.println(w2v.getWordVector("up").length);
        float[] w1 = w2v.getWordVector("up");
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (int i = 0; i < w1.length; i++) {
            sb.append(w1[i]).append(", ");
        }
        sb.append("}");
        System.out.println(sb.toString());


    }
}
