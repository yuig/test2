package ny0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d1 implements l82.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final u50.i0 f92573a;

    public d1(u50.i0 text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f92573a = text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d1) && Intrinsics.d(this.f92573a, ((d1) obj).f92573a);
    }

    public final int hashCode() {
        return this.f92573a.hashCode();
    }

    public final String toString() {
        return "UseCaseHeader(text=" + this.f92573a + ")";
    }
}
