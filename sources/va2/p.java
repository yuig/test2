package va2;

import android.text.style.StyleSpan;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final int f125439a;

    /* renamed from: b, reason: collision with root package name */
    public final int f125440b;

    /* renamed from: c, reason: collision with root package name */
    public final StyleSpan f125441c;

    public p(int i13, int i14, StyleSpan style) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f125439a = i13;
        this.f125440b = i14;
        this.f125441c = style;
    }

    public final int a() {
        return this.f125440b;
    }

    public final int b() {
        return this.f125439a;
    }

    public final StyleSpan c() {
        return this.f125441c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f125439a == pVar.f125439a && this.f125440b == pVar.f125440b && Intrinsics.d(this.f125441c, pVar.f125441c);
    }

    public final int hashCode() {
        return this.f125441c.hashCode() + ep.b.b(this.f125440b, Integer.hashCode(this.f125439a) * 31, 31);
    }

    public final String toString() {
        return "StyledSubstring(startIndex=" + this.f125439a + ", endIndex=" + this.f125440b + ", style=" + this.f125441c + ")";
    }
}
