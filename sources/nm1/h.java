package nm1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h implements l {

    /* renamed from: a, reason: collision with root package name */
    public final u50.i0 f91430a;

    public h(u50.i0 text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f91430a = text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Intrinsics.d(this.f91430a, ((h) obj).f91430a);
    }

    public final int hashCode() {
        return this.f91430a.hashCode();
    }

    public final String toString() {
        return "TextButton(text=" + this.f91430a + ")";
    }
}
