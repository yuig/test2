package e50;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e implements z40.x {

    /* renamed from: a, reason: collision with root package name */
    public final String f57314a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f57315b;

    /* renamed from: c, reason: collision with root package name */
    public final String f57316c;

    public e(String __typename, String str, Boolean bool) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f57314a = __typename;
        this.f57315b = bool;
        this.f57316c = str;
    }

    @Override // z40.x
    public final Boolean a() {
        return this.f57315b;
    }

    @Override // z40.x
    public final String b() {
        return this.f57314a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f57314a, eVar.f57314a) && Intrinsics.d(this.f57315b, eVar.f57315b) && Intrinsics.d(this.f57316c, eVar.f57316c);
    }

    @Override // z40.x
    public final String getName() {
        return this.f57316c;
    }

    public final int hashCode() {
        int hashCode = this.f57314a.hashCode() * 31;
        Boolean bool = this.f57315b;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f57316c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("VerifiedIdentity(__typename=");
        sb3.append(this.f57314a);
        sb3.append(", verified=");
        sb3.append(this.f57315b);
        sb3.append(", name=");
        return a.a.p(sb3, this.f57316c, ")");
    }
}
