package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f133716a;

    /* renamed from: b, reason: collision with root package name */
    public final String f133717b;

    /* renamed from: c, reason: collision with root package name */
    public final String f133718c;

    public y0(String __typename, String id3, String entityId) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f133716a = __typename;
        this.f133717b = id3;
        this.f133718c = entityId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return Intrinsics.d(this.f133716a, y0Var.f133716a) && Intrinsics.d(this.f133717b, y0Var.f133717b) && Intrinsics.d(this.f133718c, y0Var.f133718c);
    }

    public final int hashCode() {
        return this.f133718c.hashCode() + a.cb.d(this.f133717b, this.f133716a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Data(__typename=");
        sb3.append(this.f133716a);
        sb3.append(", id=");
        sb3.append(this.f133717b);
        sb3.append(", entityId=");
        return a.a.p(sb3, this.f133718c, ")");
    }
}
