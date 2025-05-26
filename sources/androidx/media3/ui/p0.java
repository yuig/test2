package androidx.media3.ui;

import android.text.Html;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public abstract class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f19069a = Pattern.compile("(&#13;)?&#10;");

    public static String a(CharSequence charSequence) {
        return f19069a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }
}
