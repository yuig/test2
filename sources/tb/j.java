package tb;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f116981a;

    /* renamed from: b, reason: collision with root package name */
    public final int f116982b;

    public j(String workSpecId, int i13) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        this.f116981a = workSpecId;
        this.f116982b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.d(this.f116981a, jVar.f116981a) && this.f116982b == jVar.f116982b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f116982b) + (this.f116981a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb3.append(this.f116981a);
        sb3.append(", generation=");
        return cb.l(sb3, this.f116982b, ')');
    }
}
