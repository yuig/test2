package bk1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b2 implements d2 {

    /* renamed from: a, reason: collision with root package name */
    public final ro1.b f23185a;

    /* renamed from: b, reason: collision with root package name */
    public final bs.f f23186b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f23187c;

    public b2(ro1.b oneTapType, bs.f quarantineResult, boolean z13) {
        Intrinsics.checkNotNullParameter(oneTapType, "oneTapType");
        Intrinsics.checkNotNullParameter(quarantineResult, "quarantineResult");
        this.f23185a = oneTapType;
        this.f23186b = quarantineResult;
        this.f23187c = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b2)) {
            return false;
        }
        b2 b2Var = (b2) obj;
        return this.f23185a == b2Var.f23185a && Intrinsics.d(this.f23186b, b2Var.f23186b) && this.f23187c == b2Var.f23187c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f23187c) + ((this.f23186b.hashCode() + (this.f23185a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Loaded(oneTapType=");
        sb3.append(this.f23185a);
        sb3.append(", quarantineResult=");
        sb3.append(this.f23186b);
        sb3.append(", isPlayStoreInstalled=");
        return a.a.r(sb3, this.f23187c, ")");
    }
}
