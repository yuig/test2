package ny0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b0 implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final u50.i0 f92554a;

    public b0(u50.i0 text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f92554a = text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && Intrinsics.d(this.f92554a, ((b0) obj).f92554a);
    }

    public final int hashCode() {
        return this.f92554a.hashCode();
    }

    public final String toString() {
        return "NuxPinFeedHeaderDisplayState(text=" + this.f92554a + ")";
    }
}
