package tb;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f116972a;

    /* renamed from: b, reason: collision with root package name */
    public final int f116973b;

    /* renamed from: c, reason: collision with root package name */
    public final int f116974c;

    public g(String workSpecId, int i13, int i14) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        this.f116972a = workSpecId;
        this.f116973b = i13;
        this.f116974c = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f116972a, gVar.f116972a) && this.f116973b == gVar.f116973b && this.f116974c == gVar.f116974c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f116974c) + ep.b.b(this.f116973b, this.f116972a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SystemIdInfo(workSpecId=");
        sb3.append(this.f116972a);
        sb3.append(", generation=");
        sb3.append(this.f116973b);
        sb3.append(", systemId=");
        return cb.l(sb3, this.f116974c, ')');
    }
}
