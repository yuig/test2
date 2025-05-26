package ny0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e1 implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final u50.i0 f92580a;

    public e1(u50.i0 text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f92580a = text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e1) && Intrinsics.d(this.f92580a, ((e1) obj).f92580a);
    }

    public final int hashCode() {
        return this.f92580a.hashCode();
    }

    public final String toString() {
        return "UseCaseHeaderDisplayState(text=" + this.f92580a + ")";
    }
}
