package om0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b1 implements e1 {

    /* renamed from: a, reason: collision with root package name */
    public final u50.i0 f96467a;

    /* renamed from: b, reason: collision with root package name */
    public final u50.i0 f96468b;

    public b1(u50.k0 title, u50.k0 message) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f96467a = title;
        this.f96468b = message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return Intrinsics.d(this.f96467a, b1Var.f96467a) && Intrinsics.d(this.f96468b, b1Var.f96468b);
    }

    public final int hashCode() {
        return this.f96468b.hashCode() + (this.f96467a.hashCode() * 31);
    }

    public final String toString() {
        return "NoSavedContent(title=" + this.f96467a + ", message=" + this.f96468b + ")";
    }
}
