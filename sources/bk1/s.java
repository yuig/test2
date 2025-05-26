package bk1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class s implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public final ro1.b f23315a;

    /* renamed from: b, reason: collision with root package name */
    public final bs.f f23316b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f23317c;

    /* renamed from: d, reason: collision with root package name */
    public final String f23318d;

    public s(ro1.b oneTapType, bs.f quarantineResult, boolean z13, String pinId) {
        Intrinsics.checkNotNullParameter(oneTapType, "oneTapType");
        Intrinsics.checkNotNullParameter(quarantineResult, "quarantineResult");
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f23315a = oneTapType;
        this.f23316b = quarantineResult;
        this.f23317c = z13;
        this.f23318d = pinId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f23315a == sVar.f23315a && Intrinsics.d(this.f23316b, sVar.f23316b) && this.f23317c == sVar.f23317c && Intrinsics.d(this.f23318d, sVar.f23318d);
    }

    public final int hashCode() {
        return this.f23318d.hashCode() + ep.b.e(this.f23317c, (this.f23316b.hashCode() + (this.f23315a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "DeferredClickthroughValuesComputed(oneTapType=" + this.f23315a + ", quarantineResult=" + this.f23316b + ", isPlayStoreInstalled=" + this.f23317c + ", pinId=" + this.f23318d + ")";
    }
}
