package om0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q0 implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final u50.i0 f96569a;

    /* renamed from: b, reason: collision with root package name */
    public final u50.i0 f96570b;

    static {
        u50.h0 h0Var = u50.h0.f120562a;
        new q0(h0Var, h0Var);
    }

    public q0(u50.i0 title, u50.i0 description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f96569a = title;
        this.f96570b = description;
    }

    public final boolean e(i2.o oVar) {
        i2.s sVar = (i2.s) oVar;
        sVar.W(-584553787);
        boolean z13 = kotlin.text.z.j((CharSequence) dl2.b.u2(this.f96569a, sVar)) && kotlin.text.z.j((CharSequence) dl2.b.u2(this.f96570b, sVar));
        sVar.r(false);
        return z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return Intrinsics.d(this.f96569a, q0Var.f96569a) && Intrinsics.d(this.f96570b, q0Var.f96570b);
    }

    public final int hashCode() {
        return this.f96570b.hashCode() + (this.f96569a.hashCode() * 31);
    }

    public final String toString() {
        return "PreviewMetadataState(title=" + this.f96569a + ", description=" + this.f96570b + ")";
    }
}
