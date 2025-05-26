package ux0;

import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import com.pinterest.api.model.px;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.net.y;
import rx0.g;
import xa0.j;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final y f123240a;

    /* renamed from: b, reason: collision with root package name */
    public final g f123241b;

    /* renamed from: c, reason: collision with root package name */
    public final pb0.d f123242c;

    /* renamed from: d, reason: collision with root package name */
    public final Pattern f123243d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f123244e;

    public e(y newsHubDateHelper, g listener, pb0.d fuzzyDateFormatter) {
        Intrinsics.checkNotNullParameter(newsHubDateHelper, "newsHubDateHelper");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(fuzzyDateFormatter, "fuzzyDateFormatter");
        this.f123240a = newsHubDateHelper;
        this.f123241b = listener;
        this.f123242c = fuzzyDateFormatter;
        this.f123243d = Pattern.compile("\\{(\\S+?)\\}");
        this.f123244e = new LinkedHashMap();
    }

    public final CharSequence a(String textCacheKey, String rawText, Map textMappings) {
        Intrinsics.checkNotNullParameter(textCacheKey, "textCacheKey");
        Intrinsics.checkNotNullParameter(rawText, "rawText");
        Intrinsics.checkNotNullParameter(textMappings, "textMappings");
        LinkedHashMap linkedHashMap = this.f123244e;
        CharSequence charSequence = (CharSequence) linkedHashMap.get(textCacheKey);
        if (charSequence != null) {
            return charSequence;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Matcher matcher = this.f123243d.matcher(rawText);
        int i13 = 0;
        while (matcher.find()) {
            String group = matcher.group(1);
            int start = matcher.start();
            if (i13 <= start) {
                String substring = rawText.substring(i13, start);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                spannableStringBuilder.append((CharSequence) substring);
                i13 = matcher.end();
            }
            if (textMappings.containsKey(group)) {
                px pxVar = (px) textMappings.get(group);
                String str = pxVar != null ? pxVar.f41128a : null;
                px pxVar2 = (px) textMappings.get(group);
                Boolean bool = pxVar2 != null ? pxVar2.f41130c : null;
                if (str != null) {
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) str);
                    int length2 = spannableStringBuilder.length();
                    if (Intrinsics.d(bool, Boolean.TRUE)) {
                        spannableStringBuilder.setSpan(new StyleSpan(1), length, length2, 33);
                    }
                    Intrinsics.f(group);
                    spannableStringBuilder.setSpan(new d(this, group), length, length2, 33);
                }
            }
        }
        String substring2 = rawText.substring(i13, rawText.length());
        Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
        spannableStringBuilder.append((CharSequence) substring2);
        linkedHashMap.put(rawText, spannableStringBuilder);
        return spannableStringBuilder;
    }

    public final CharSequence b(Date date, pb0.b style) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f123240a.getClass();
        Intrinsics.checkNotNullParameter(date, "date");
        return this.f123242c.c(j.p(date), style, false);
    }
}
