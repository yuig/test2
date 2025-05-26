package la;

import com.google.android.gms.ads.AdError;
import g4.u;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f82340a;

    /* renamed from: b, reason: collision with root package name */
    public final String f82341b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f82342c;

    /* renamed from: d, reason: collision with root package name */
    public final int f82343d;

    /* renamed from: e, reason: collision with root package name */
    public final String f82344e;

    /* renamed from: f, reason: collision with root package name */
    public final int f82345f;

    /* renamed from: g, reason: collision with root package name */
    public final int f82346g;

    public a(int i13, int i14, String name, String type, String str, boolean z13) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f82340a = name;
        this.f82341b = type;
        this.f82342c = z13;
        this.f82343d = i13;
        this.f82344e = str;
        this.f82345f = i14;
        int i15 = 5;
        if (type != null) {
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String upperCase = type.toUpperCase(US);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
            if (StringsKt.E(upperCase, "INT", false)) {
                i15 = 3;
            } else if (StringsKt.E(upperCase, "CHAR", false) || StringsKt.E(upperCase, "CLOB", false) || StringsKt.E(upperCase, "TEXT", false)) {
                i15 = 2;
            } else if (!StringsKt.E(upperCase, "BLOB", false)) {
                i15 = (StringsKt.E(upperCase, "REAL", false) || StringsKt.E(upperCase, "FLOA", false) || StringsKt.E(upperCase, "DOUB", false)) ? 4 : 1;
            }
        }
        this.f82346g = i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f82343d != aVar.f82343d) {
            return false;
        }
        if (!Intrinsics.d(this.f82340a, aVar.f82340a) || this.f82342c != aVar.f82342c) {
            return false;
        }
        int i13 = aVar.f82345f;
        String str = aVar.f82344e;
        String str2 = this.f82344e;
        int i14 = this.f82345f;
        if (i14 == 1 && i13 == 2 && str2 != null && !u.c0(str2, str)) {
            return false;
        }
        if (i14 != 2 || i13 != 1 || str == null || u.c0(str, str2)) {
            return (i14 == 0 || i14 != i13 || (str2 == null ? str == null : u.c0(str2, str))) && this.f82346g == aVar.f82346g;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f82340a.hashCode() * 31) + this.f82346g) * 31) + (this.f82342c ? 1231 : 1237)) * 31) + this.f82343d;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Column{name='");
        sb3.append(this.f82340a);
        sb3.append("', type='");
        sb3.append(this.f82341b);
        sb3.append("', affinity='");
        sb3.append(this.f82346g);
        sb3.append("', notNull=");
        sb3.append(this.f82342c);
        sb3.append(", primaryKeyPosition=");
        sb3.append(this.f82343d);
        sb3.append(", defaultValue='");
        String str = this.f82344e;
        if (str == null) {
            str = AdError.UNDEFINED_DOMAIN;
        }
        return a.a.p(sb3, str, "'}");
    }
}
