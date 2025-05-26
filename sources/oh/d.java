package oh;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f94459a;

    static {
        Pattern.compile("\\\\.");
        f94459a = Pattern.compile("[\\\\\"/\b\f\n\r\t]");
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Matcher matcher = f94459a.matcher(str);
        StringBuffer stringBuffer = null;
        while (matcher.find()) {
            if (stringBuffer == null) {
                stringBuffer = new StringBuffer();
            }
            char charAt = matcher.group().charAt(0);
            if (charAt == '\f') {
                matcher.appendReplacement(stringBuffer, "\\\\f");
            } else if (charAt == '\r') {
                matcher.appendReplacement(stringBuffer, "\\\\r");
            } else if (charAt == '\"') {
                matcher.appendReplacement(stringBuffer, "\\\\\\\"");
            } else if (charAt == '/') {
                matcher.appendReplacement(stringBuffer, "\\\\/");
            } else if (charAt != '\\') {
                switch (charAt) {
                    case '\b':
                        matcher.appendReplacement(stringBuffer, "\\\\b");
                        break;
                    case '\t':
                        matcher.appendReplacement(stringBuffer, "\\\\t");
                        break;
                    case '\n':
                        matcher.appendReplacement(stringBuffer, "\\\\n");
                        break;
                }
            } else {
                matcher.appendReplacement(stringBuffer, "\\\\\\\\");
            }
        }
        if (stringBuffer == null) {
            return str;
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }
}
