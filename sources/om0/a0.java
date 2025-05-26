package om0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a0 implements f1 {

    /* renamed from: a, reason: collision with root package name */
    public final u50.i0 f96459a;

    public a0(u50.i0 label) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.f96459a = label;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && Intrinsics.d(this.f96459a, ((a0) obj).f96459a);
    }

    public final int hashCode() {
        return this.f96459a.hashCode();
    }

    public final String toString() {
        return "CtaPreviewState(label=" + this.f96459a + ")";
    }
}
