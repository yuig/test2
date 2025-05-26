package kr1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f80765a;

    /* renamed from: b, reason: collision with root package name */
    public final String f80766b;

    public a(String code, String state) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f80765a = code;
        this.f80766b = state;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f80765a, aVar.f80765a) && Intrinsics.d(this.f80766b, aVar.f80766b);
    }

    public final int hashCode() {
        return this.f80766b.hashCode() + (this.f80765a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SSOAuthResult(code=");
        sb3.append(this.f80765a);
        sb3.append(", state=");
        return a.a.p(sb3, this.f80766b, ")");
    }
}
