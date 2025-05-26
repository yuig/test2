package ef;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f58826a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f58827b;

    public a(String name, boolean z13) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f58826a = name;
        this.f58827b = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f58826a, aVar.f58826a) && this.f58827b == aVar.f58827b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.f58826a.hashCode() * 31;
        boolean z13 = this.f58827b;
        int i13 = z13;
        if (z13 != 0) {
            i13 = 1;
        }
        return hashCode + i13;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("GateKeeper(name=");
        sb3.append(this.f58826a);
        sb3.append(", value=");
        return cb.m(sb3, this.f58827b, ')');
    }
}
