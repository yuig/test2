package b2;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a */
    public final n f21188a;

    /* renamed from: b */
    public final n f21189b;

    /* renamed from: c */
    public final boolean f21190c;

    public o(n nVar, n nVar2, boolean z13) {
        this.f21188a = nVar;
        this.f21189b = nVar2;
        this.f21190c = z13;
    }

    public static o a(o oVar, n nVar, n nVar2, boolean z13, int i13) {
        if ((i13 & 1) != 0) {
            nVar = oVar.f21188a;
        }
        if ((i13 & 2) != 0) {
            nVar2 = oVar.f21189b;
        }
        oVar.getClass();
        return new o(nVar, nVar2, z13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.d(this.f21188a, oVar.f21188a) && Intrinsics.d(this.f21189b, oVar.f21189b) && this.f21190c == oVar.f21190c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f21190c) + ((this.f21189b.hashCode() + (this.f21188a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Selection(start=");
        sb3.append(this.f21188a);
        sb3.append(", end=");
        sb3.append(this.f21189b);
        sb3.append(", handlesCrossed=");
        return cb.m(sb3, this.f21190c, ')');
    }
}
