package yb0;

import kotlin.jvm.internal.Intrinsics;
import u50.i0;
import u50.k0;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f138483a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f138484b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f138485c;

    /* renamed from: d, reason: collision with root package name */
    public final h f138486d;

    /* renamed from: e, reason: collision with root package name */
    public final i0 f138487e;

    public g(k0 title, k0 k0Var, k0 positiveButtonText, ub1.o oVar, k0 k0Var2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(positiveButtonText, "positiveButtonText");
        this.f138483a = title;
        this.f138484b = k0Var;
        this.f138485c = positiveButtonText;
        this.f138486d = oVar;
        this.f138487e = k0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f138483a, gVar.f138483a) && Intrinsics.d(this.f138484b, gVar.f138484b) && Intrinsics.d(this.f138485c, gVar.f138485c) && Intrinsics.d(this.f138486d, gVar.f138486d) && Intrinsics.d(this.f138487e, gVar.f138487e);
    }

    public final int hashCode() {
        int hashCode = this.f138483a.hashCode() * 31;
        i0 i0Var = this.f138484b;
        int e13 = ep.b.e(true, ep.b.d(this.f138485c, (hashCode + (i0Var == null ? 0 : i0Var.hashCode())) * 31, 31), 31);
        h hVar = this.f138486d;
        int e14 = ep.b.e(false, (e13 + (hVar == null ? 0 : hVar.hashCode())) * 31, 31);
        i0 i0Var2 = this.f138487e;
        return Integer.hashCode(3) + ((e14 + (i0Var2 != null ? i0Var2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ShowSimpleGestaltAlertEvent(title=");
        sb3.append(this.f138483a);
        sb3.append(", subTitle=");
        sb3.append(this.f138484b);
        sb3.append(", positiveButtonText=");
        sb3.append(this.f138485c);
        sb3.append(", hasCancelButton=true, listener=");
        sb3.append(this.f138486d);
        sb3.append(", canDismiss=false, checkBoxText=");
        return jq.b.k(sb3, this.f138487e, ", maxLines=3)");
    }
}
