package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d2 implements z40.q {

    /* renamed from: a, reason: collision with root package name */
    public final String f132203a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132204b;

    /* renamed from: c, reason: collision with root package name */
    public final String f132205c;

    public d2(String __typename, String id3, String entityId) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f132203a = __typename;
        this.f132204b = id3;
        this.f132205c = entityId;
    }

    @Override // z40.q
    public final String a() {
        return this.f132205c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2)) {
            return false;
        }
        d2 d2Var = (d2) obj;
        return Intrinsics.d(this.f132203a, d2Var.f132203a) && Intrinsics.d(this.f132204b, d2Var.f132204b) && Intrinsics.d(this.f132205c, d2Var.f132205c);
    }

    public final int hashCode() {
        return this.f132205c.hashCode() + a.cb.d(this.f132204b, this.f132203a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("User(__typename=");
        sb3.append(this.f132203a);
        sb3.append(", id=");
        sb3.append(this.f132204b);
        sb3.append(", entityId=");
        return a.a.p(sb3, this.f132205c, ")");
    }
}
