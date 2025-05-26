package eq;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.Log;
import com.pinterest.api.model.px;
import j4.f;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import te0.c;
import ye2.m;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f59905a = Pattern.compile("\\{(\\S+?)\\}");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f59906b = Pattern.compile("\\{(.*?)\\}");

    public static CharSequence a(Context context, String str, Map map) {
        if (str == null) {
            return "";
        }
        if (map == null) {
            return str;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Matcher matcher = f59905a.matcher(str);
        int i13 = 0;
        while (matcher.find()) {
            String group = matcher.group(1);
            int start = matcher.start();
            if (i13 <= start) {
                spannableStringBuilder.append((CharSequence) str.substring(i13, start));
                i13 = matcher.end();
            }
            if (map.containsKey(group)) {
                px pxVar = (px) map.get(group);
                if (pxVar.f41128a != null) {
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) pxVar.f41128a);
                    int length2 = spannableStringBuilder.length();
                    Log.e("textmapping", "text is: " + pxVar.f41128a);
                    Log.e("textmapping", "text is bold: " + pxVar.f41130c);
                    if (context != null && pxVar.f41130c.booleanValue()) {
                        spannableStringBuilder.setSpan(new c(context), length, length2, 33);
                    }
                    if (pxVar.f41129b != null) {
                        spannableStringBuilder.setSpan(new f(pxVar, 1), length, length2, 33);
                    }
                }
            }
        }
        spannableStringBuilder.append((CharSequence) str.substring(i13));
        return spannableStringBuilder;
    }

    public static CharSequence b(m mVar, String str, LinkedHashMap linkedHashMap) {
        dv1.f fVar;
        String str2;
        if (str == null) {
            return "";
        }
        if (linkedHashMap == null) {
            return str;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Matcher matcher = f59906b.matcher(str);
        int i13 = 0;
        while (matcher.find()) {
            String group = matcher.group(1);
            int start = matcher.start();
            if (i13 <= start) {
                spannableStringBuilder.append((CharSequence) str.substring(i13, start));
                i13 = matcher.end();
            }
            if (linkedHashMap.containsKey(group) && (fVar = (dv1.f) linkedHashMap.get(group)) != null && (str2 = fVar.f56397b) != null) {
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) str2);
                int length2 = spannableStringBuilder.length();
                if (mVar != null) {
                    spannableStringBuilder.setSpan(new c(mVar), length, length2, 33);
                }
                if (fVar.f56398c != null) {
                    spannableStringBuilder.setSpan(new f(fVar, 2), length, length2, 33);
                }
            }
        }
        spannableStringBuilder.append((CharSequence) str.substring(i13));
        return spannableStringBuilder;
    }
}
