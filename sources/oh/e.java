package oh;

import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class e {
    static {
        Pattern.compile("\\$\\{(.*?)\\}");
    }

    public static boolean a(String str) {
        return str == null || str.trim().isEmpty();
    }
}
