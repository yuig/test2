package k62;

import kotlin.jvm.internal.Intrinsics;
import r72.k2;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final k2 f78432a;

    /* renamed from: b, reason: collision with root package name */
    public final int f78433b;

    public e(k2 font, int i13) {
        Intrinsics.checkNotNullParameter(font, "font");
        this.f78432a = font;
        this.f78433b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f78432a == eVar.f78432a && this.f78433b == eVar.f78433b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f78433b) + (this.f78432a.hashCode() * 31);
    }

    public final String toString() {
        return "FontVariant(font=" + this.f78432a + ", displayResId=" + this.f78433b + ")";
    }
}
