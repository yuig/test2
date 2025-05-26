package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e8 implements z40.q {

    /* renamed from: a, reason: collision with root package name */
    public final String f132319a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132320b;

    /* renamed from: c, reason: collision with root package name */
    public final String f132321c;

    public e8(String __typename, String id3, String entityId) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f132319a = __typename;
        this.f132320b = id3;
        this.f132321c = entityId;
    }

    @Override // z40.q
    public final String a() {
        return this.f132321c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8)) {
            return false;
        }
        e8 e8Var = (e8) obj;
        return Intrinsics.d(this.f132319a, e8Var.f132319a) && Intrinsics.d(this.f132320b, e8Var.f132320b) && Intrinsics.d(this.f132321c, e8Var.f132321c);
    }

    public final int hashCode() {
        return this.f132321c.hashCode() + a.cb.d(this.f132320b, this.f132319a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("User(__typename=");
        sb3.append(this.f132319a);
        sb3.append(", id=");
        sb3.append(this.f132320b);
        sb3.append(", entityId=");
        return a.a.p(sb3, this.f132321c, ")");
    }
}
