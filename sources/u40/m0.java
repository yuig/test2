package u40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m0 implements z40.x {

    /* renamed from: a, reason: collision with root package name */
    public final String f120388a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f120389b;

    /* renamed from: c, reason: collision with root package name */
    public final String f120390c;

    public m0(String __typename, String str, Boolean bool) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f120388a = __typename;
        this.f120389b = bool;
        this.f120390c = str;
    }

    @Override // z40.x
    public final Boolean a() {
        return this.f120389b;
    }

    @Override // z40.x
    public final String b() {
        return this.f120388a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return Intrinsics.d(this.f120388a, m0Var.f120388a) && Intrinsics.d(this.f120389b, m0Var.f120389b) && Intrinsics.d(this.f120390c, m0Var.f120390c);
    }

    @Override // z40.x
    public final String getName() {
        return this.f120390c;
    }

    public final int hashCode() {
        int hashCode = this.f120388a.hashCode() * 31;
        Boolean bool = this.f120389b;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f120390c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("VerifiedIdentity(__typename=");
        sb3.append(this.f120388a);
        sb3.append(", verified=");
        sb3.append(this.f120389b);
        sb3.append(", name=");
        return a.a.p(sb3, this.f120390c, ")");
    }
}
