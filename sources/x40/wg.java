package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class wg implements z40.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f133628a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f133629b;

    public wg(String __typename, Boolean bool) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f133628a = __typename;
        this.f133629b = bool;
    }

    @Override // z40.c0
    public final Boolean a() {
        return this.f133629b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wg)) {
            return false;
        }
        wg wgVar = (wg) obj;
        return Intrinsics.d(this.f133628a, wgVar.f133628a) && Intrinsics.d(this.f133629b, wgVar.f133629b);
    }

    public final int hashCode() {
        int hashCode = this.f133628a.hashCode() * 31;
        Boolean bool = this.f133629b;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("VerifiedIdentity(__typename=");
        sb3.append(this.f133628a);
        sb3.append(", verified=");
        return a.c.h(sb3, this.f133629b, ")");
    }
}
