package xyz.zzlcjj.commons.random;

import com.sun.javadoc.ClassDoc;
import com.sun.javadoc.Doclet;
import com.sun.javadoc.MethodDoc;
import com.sun.javadoc.RootDoc;

/**
 * @author zzl
 * @since 2023/7/31
 */
public class SimpleDoclet extends Doclet {

    public static boolean start(RootDoc root) {
        for (ClassDoc classDoc : root.classes()) {
            System.out.println("Found class: " + classDoc.name());

            for (MethodDoc method : classDoc.methods()) {
                System.out.println("Found method: " + method.name());
                System.out.println("Comment: " + method.commentText());
                System.out.println("all doc: " + method.getRawCommentText());
            }
        }
        return true;
    }
}
