package wm1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q extends s {

    /* renamed from: d, reason: collision with root package name */
    public final u50.i0 f130324d;

    /* renamed from: e, reason: collision with root package name */
    public final u50.i0 f130325e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f130326f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(u50.i0 headerText, u50.i0 subHeaderText, boolean z13) {
        super(headerText, subHeaderText, z13);
        Intrinsics.checkNotNullParameter(headerText, "headerText");
        Intrinsics.checkNotNullParameter(subHeaderText, "subHeaderText");
        this.f130324d = headerText;
        this.f130325e = subHeaderText;
        this.f130326f = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.d(this.f130324d, qVar.f130324d) && Intrinsics.d(this.f130325e, qVar.f130325e) && this.f130326f == qVar.f130326f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f130326f) + ep.b.d(this.f130325e, this.f130324d.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DefaultDisplayState(headerText=");
        sb3.append(this.f130324d);
        sb3.append(", subHeaderText=");
        sb3.append(this.f130325e);
        sb3.append(", supportLinks=");
        return a.a.r(sb3, this.f130326f, ")");
    }

    public /* synthetic */ q(u50.i0 i0Var, u50.i0 i0Var2, boolean z13, int i13) {
        this(i0Var, (i13 & 2) != 0 ? u50.h0.f120562a : i0Var2, (i13 & 4) != 0 ? false : z13);
    }
}
