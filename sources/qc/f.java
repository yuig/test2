package qc;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f103431a;

    /* renamed from: b, reason: collision with root package name */
    public final String f103432b;

    public f(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f103431a = name;
        this.f103432b = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f103431a, fVar.f103431a) && Intrinsics.d(this.f103432b, fVar.f103432b);
    }

    public final int hashCode() {
        return this.f103432b.hashCode() + (this.f103431a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("HttpHeader(name=");
        sb3.append(this.f103431a);
        sb3.append(", value=");
        return ep.b.k(sb3, this.f103432b, ')');
    }
}
