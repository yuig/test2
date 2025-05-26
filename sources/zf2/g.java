package zf2;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f141940a;

    /* renamed from: b, reason: collision with root package name */
    public final int f141941b;

    public g(String name, int i13) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f141940a = name;
        this.f141941b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f141940a, gVar.f141940a) && this.f141941b == gVar.f141941b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f141941b) + (this.f141940a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("UiInstance(name=");
        sb3.append(this.f141940a);
        sb3.append(", id=");
        return cb.l(sb3, this.f141941b, ')');
    }
}
