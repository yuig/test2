package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a4 implements z40.q {

    /* renamed from: a, reason: collision with root package name */
    public final String f131913a;

    /* renamed from: b, reason: collision with root package name */
    public final String f131914b;

    /* renamed from: c, reason: collision with root package name */
    public final String f131915c;

    public a4(String __typename, String id3, String entityId) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f131913a = __typename;
        this.f131914b = id3;
        this.f131915c = entityId;
    }

    @Override // z40.q
    public final String a() {
        return this.f131915c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a4)) {
            return false;
        }
        a4 a4Var = (a4) obj;
        return Intrinsics.d(this.f131913a, a4Var.f131913a) && Intrinsics.d(this.f131914b, a4Var.f131914b) && Intrinsics.d(this.f131915c, a4Var.f131915c);
    }

    public final int hashCode() {
        return this.f131915c.hashCode() + a.cb.d(this.f131914b, this.f131913a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("User(__typename=");
        sb3.append(this.f131913a);
        sb3.append(", id=");
        sb3.append(this.f131914b);
        sb3.append(", entityId=");
        return a.a.p(sb3, this.f131915c, ")");
    }
}
