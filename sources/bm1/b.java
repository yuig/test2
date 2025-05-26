package bm1;

import kotlin.jvm.internal.Intrinsics;
import u50.i0;

/* loaded from: classes5.dex */
public final class b implements l {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f23488a;

    /* renamed from: b, reason: collision with root package name */
    public final rm1.q f23489b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f23490c;

    public /* synthetic */ b(i0 i0Var) {
        this(i0Var, null, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f23488a, bVar.f23488a) && this.f23489b == bVar.f23489b && this.f23490c == bVar.f23490c;
    }

    public final int hashCode() {
        i0 i0Var = this.f23488a;
        int hashCode = (i0Var == null ? 0 : i0Var.hashCode()) * 31;
        rm1.q qVar = this.f23489b;
        return Boolean.hashCode(this.f23490c) + ((hashCode + (qVar != null ? qVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Default(text=");
        sb3.append(this.f23488a);
        sb3.append(", startIcon=");
        sb3.append(this.f23489b);
        sb3.append(", hasDropDownIcon=");
        return a.a.r(sb3, this.f23490c, ")");
    }

    public b(i0 i0Var, rm1.q qVar, boolean z13) {
        this.f23488a = i0Var;
        this.f23489b = qVar;
        this.f23490c = z13;
    }
}
