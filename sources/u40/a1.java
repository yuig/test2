package u40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a1 implements z40.x {

    /* renamed from: a, reason: collision with root package name */
    public final String f120290a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f120291b;

    /* renamed from: c, reason: collision with root package name */
    public final String f120292c;

    public a1(String __typename, String str, Boolean bool) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f120290a = __typename;
        this.f120291b = bool;
        this.f120292c = str;
    }

    @Override // z40.x
    public final Boolean a() {
        return this.f120291b;
    }

    @Override // z40.x
    public final String b() {
        return this.f120290a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return Intrinsics.d(this.f120290a, a1Var.f120290a) && Intrinsics.d(this.f120291b, a1Var.f120291b) && Intrinsics.d(this.f120292c, a1Var.f120292c);
    }

    @Override // z40.x
    public final String getName() {
        return this.f120292c;
    }

    public final int hashCode() {
        int hashCode = this.f120290a.hashCode() * 31;
        Boolean bool = this.f120291b;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f120292c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("VerifiedIdentity(__typename=");
        sb3.append(this.f120290a);
        sb3.append(", verified=");
        sb3.append(this.f120291b);
        sb3.append(", name=");
        return a.a.p(sb3, this.f120292c, ")");
    }
}
