package nf2;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final String f90515a;

    /* renamed from: b, reason: collision with root package name */
    public final int f90516b;

    public p(String name, int i13) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f90515a = name;
        this.f90516b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.d(this.f90515a, pVar.f90515a) && this.f90516b == pVar.f90516b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f90516b) + (this.f90515a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Instance(name=");
        sb3.append(this.f90515a);
        sb3.append(", id=");
        return cb.l(sb3, this.f90516b, ')');
    }
}
