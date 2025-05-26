package e50;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y implements z40.x {

    /* renamed from: a, reason: collision with root package name */
    public final String f57456a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f57457b;

    /* renamed from: c, reason: collision with root package name */
    public final String f57458c;

    public y(String __typename, String str, Boolean bool) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f57456a = __typename;
        this.f57457b = bool;
        this.f57458c = str;
    }

    @Override // z40.x
    public final Boolean a() {
        return this.f57457b;
    }

    @Override // z40.x
    public final String b() {
        return this.f57456a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Intrinsics.d(this.f57456a, yVar.f57456a) && Intrinsics.d(this.f57457b, yVar.f57457b) && Intrinsics.d(this.f57458c, yVar.f57458c);
    }

    @Override // z40.x
    public final String getName() {
        return this.f57458c;
    }

    public final int hashCode() {
        int hashCode = this.f57456a.hashCode() * 31;
        Boolean bool = this.f57457b;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f57458c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("VerifiedIdentity(__typename=");
        sb3.append(this.f57456a);
        sb3.append(", verified=");
        sb3.append(this.f57457b);
        sb3.append(", name=");
        return a.a.p(sb3, this.f57458c, ")");
    }
}
