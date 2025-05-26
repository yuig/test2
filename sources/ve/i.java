package ve;

import android.text.TextUtils;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.io.File;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import le.v;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f125676a = new i();

    public static final File a() {
        if (p001if.a.b(i.class)) {
            return null;
        }
        try {
            File file = new File(v.a().getFilesDir(), "facebook_ml/");
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    return null;
                }
            }
            return file;
        } catch (Throwable th3) {
            p001if.a.a(i.class, th3);
            return null;
        }
    }

    public final String b(String str) {
        if (p001if.a.b(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(str, "str");
            int length = str.length() - 1;
            int i13 = 0;
            boolean z13 = false;
            while (i13 <= length) {
                boolean z14 = Intrinsics.i(str.charAt(!z13 ? i13 : length), 32) <= 0;
                if (z13) {
                    if (!z14) {
                        break;
                    }
                    length--;
                } else if (z14) {
                    i13++;
                } else {
                    z13 = true;
                }
            }
            Object[] array = new Regex("\\s+").f(0, str.subSequence(i13, length + 1).toString()).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String join = TextUtils.join(" ", (String[]) array);
            Intrinsics.checkNotNullExpressionValue(join, "join(\" \", strArray)");
            return join;
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
            return null;
        }
    }

    public final int[] c(String texts) {
        if (p001if.a.b(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(texts, "texts");
            int[] iArr = new int[RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN];
            String b13 = b(texts);
            Charset forName = Charset.forName("UTF-8");
            Intrinsics.checkNotNullExpressionValue(forName, "forName(\"UTF-8\")");
            if (b13 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            byte[] bytes = b13.getBytes(forName);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            int i13 = 0;
            while (true) {
                int i14 = i13 + 1;
                if (i13 < bytes.length) {
                    iArr[i13] = bytes[i13] & 255;
                } else {
                    iArr[i13] = 0;
                }
                if (i14 >= 128) {
                    return iArr;
                }
                i13 = i14;
            }
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
            return null;
        }
    }
}
