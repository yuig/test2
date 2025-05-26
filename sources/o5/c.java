package o5;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.Locale;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final h f92892d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f92893e;

    /* renamed from: f, reason: collision with root package name */
    public static final String f92894f;

    /* renamed from: g, reason: collision with root package name */
    public static final c f92895g;

    /* renamed from: h, reason: collision with root package name */
    public static final c f92896h;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f92897a;

    /* renamed from: b, reason: collision with root package name */
    public final int f92898b;

    /* renamed from: c, reason: collision with root package name */
    public final g f92899c;

    static {
        h hVar = i.f92906c;
        f92892d = hVar;
        f92893e = Character.toString((char) 8206);
        f92894f = Character.toString((char) 8207);
        f92895g = new c(false, 2, hVar);
        f92896h = new c(true, 2, hVar);
    }

    public c(boolean z13, int i13, g gVar) {
        this.f92897a = z13;
        this.f92898b = i13;
        this.f92899c = gVar;
    }

    public static c a() {
        return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? f92896h : f92895g;
    }

    public final String b(String str) {
        if (str == null) {
            return null;
        }
        boolean f13 = this.f92899c.f(str.length(), str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i13 = this.f92898b & 2;
        String str2 = "";
        String str3 = f92894f;
        String str4 = f92893e;
        boolean z13 = this.f92897a;
        if (i13 != 0) {
            boolean f14 = (f13 ? i.f92905b : i.f92904a).f(str.length(), str);
            spannableStringBuilder.append((CharSequence) ((z13 || !(f14 || new b(str).b() == 1)) ? (!z13 || (f14 && new b(str).b() != -1)) ? "" : str3 : str4));
        }
        if (f13 != z13) {
            spannableStringBuilder.append(f13 ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append((CharSequence) str);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append((CharSequence) str);
        }
        boolean f15 = (f13 ? i.f92905b : i.f92904a).f(str.length(), str);
        if (!z13 && (f15 || new b(str).c() == 1)) {
            str2 = str4;
        } else if (z13 && (!f15 || new b(str).c() == -1)) {
            str2 = str3;
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder.toString();
    }
}
