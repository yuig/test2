package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class vi implements z40.x {

    /* renamed from: a, reason: collision with root package name */
    public final String f133560a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f133561b;

    /* renamed from: c, reason: collision with root package name */
    public final String f133562c;

    public vi(String __typename, String str, Boolean bool) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f133560a = __typename;
        this.f133561b = bool;
        this.f133562c = str;
    }

    @Override // z40.x
    public final Boolean a() {
        return this.f133561b;
    }

    @Override // z40.x
    public final String b() {
        return this.f133560a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vi)) {
            return false;
        }
        vi viVar = (vi) obj;
        return Intrinsics.d(this.f133560a, viVar.f133560a) && Intrinsics.d(this.f133561b, viVar.f133561b) && Intrinsics.d(this.f133562c, viVar.f133562c);
    }

    @Override // z40.x
    public final String getName() {
        return this.f133562c;
    }

    public final int hashCode() {
        int hashCode = this.f133560a.hashCode() * 31;
        Boolean bool = this.f133561b;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f133562c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("VerifiedIdentity(__typename=");
        sb3.append(this.f133560a);
        sb3.append(", verified=");
        sb3.append(this.f133561b);
        sb3.append(", name=");
        return a.a.p(sb3, this.f133562c, ")");
    }
}
