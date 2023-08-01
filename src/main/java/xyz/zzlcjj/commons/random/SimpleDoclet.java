package xyz.zzlcjj.commons.random;

import com.sun.javadoc.ClassDoc;
import com.sun.javadoc.Doclet;
import com.sun.javadoc.MethodDoc;
import com.sun.javadoc.ParamTag;
import com.sun.javadoc.Parameter;
import com.sun.javadoc.RootDoc;
import com.sun.javadoc.Tag;

/**
 * @author zzl
 * @since 2023/7/31
 */
public class SimpleDoclet extends Doclet {

    /**
     * 解析出全部的Javadoc
     *
     * @param root 用户id:required:(1~100):[1,2,3,4]
     * @return 是否解析成功
     */
    public static boolean start(RootDoc root) {
        String[] split = "用户id:required:1~100:1,2,3,4".split(":");
        for (ClassDoc classDoc : root.classes()) {
            for (MethodDoc method : classDoc.methods()) {
                System.out.println("----------------------------------");
                System.out.println("name============>" + method.name());
                System.out.println("commentText=====>" + method.commentText());
                System.out.println("RawCommentText==>" + method.getRawCommentText());
                System.out.println("returnType======>" + method.returnType());
                for (Tag tag : method.tags()) {
                    System.out.println("tagName========>" + tag.name());
                    System.out.println("tagText========>" + tag.text());
                    System.out.println("tag============>" + tag);
                }
                for (Parameter parameter : method.parameters()) {
                    System.out.println("paramType=====>" + parameter.type());
                    System.out.println("paramType=====>" + parameter.name());
                }
                for (ParamTag paramTag : method.paramTags()) {
                    System.out.println("paramComment====>" + paramTag.parameterComment());
                    System.out.println("paramKind=======>" + paramTag.kind());
                    System.out.println("parameterName===>" + paramTag.parameterName());
                    System.out.println("ParamTag========>" + paramTag);
                }
                System.out.println("----------------------------------");
            }
        }
        return true;
    }
}
