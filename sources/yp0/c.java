package yp0;

import a.cb;
import android.text.Editable;
import android.text.TextWatcher;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import uk2.f;

/* loaded from: classes5.dex */
public final class c implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final String f139613a;

    /* renamed from: b, reason: collision with root package name */
    public final String f139614b;

    /* renamed from: c, reason: collision with root package name */
    public final sk2.c f139615c;

    /* renamed from: d, reason: collision with root package name */
    public final f f139616d;

    public c(String str, String str2) {
        this.f139613a = str == null ? "@" : str;
        this.f139614b = str2 == null ? "(^@\\w*)|(\\s@\\w*)" : str2;
        sk2.c cVar = new sk2.c();
        Intrinsics.checkNotNullExpressionValue(cVar, "create(...)");
        this.f139615c = cVar;
        this.f139616d = cb.r("create(...)");
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable s13) {
        Intrinsics.checkNotNullParameter(s13, "s");
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence s13, int i13, int i14, int i15) {
        Intrinsics.checkNotNullParameter(s13, "s");
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence changedText, int i13, int i14, int i15) {
        Intrinsics.checkNotNullParameter(changedText, "changedText");
        if (i15 > 0) {
            i13 += i15;
        }
        Matcher matcher = Pattern.compile(this.f139614b).matcher(changedText);
        String str = null;
        boolean z13 = false;
        while (matcher.find()) {
            if (matcher.start() < i13 && i13 <= matcher.end()) {
                str = changedText.subSequence(matcher.start(), matcher.end()).toString();
                z13 = true;
            }
        }
        this.f139616d.c(Boolean.valueOf(z13));
        if (str != null) {
            String str2 = this.f139613a;
            String substring = str.substring(str2.length() + StringsKt.L(str, str2, 0, false, 6));
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            this.f139615c.c(substring);
        }
    }
}
