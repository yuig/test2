package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g7 {

    /* renamed from: a, reason: collision with root package name */
    public final String f132432a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132433b;

    /* renamed from: c, reason: collision with root package name */
    public final String f132434c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f132435d;

    /* renamed from: e, reason: collision with root package name */
    public final f7 f132436e;

    public g7(String __typename, String id3, String entityId, Object obj, f7 f7Var) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f132432a = __typename;
        this.f132433b = id3;
        this.f132434c = entityId;
        this.f132435d = obj;
        this.f132436e = f7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g7)) {
            return false;
        }
        g7 g7Var = (g7) obj;
        return Intrinsics.d(this.f132432a, g7Var.f132432a) && Intrinsics.d(this.f132433b, g7Var.f132433b) && Intrinsics.d(this.f132434c, g7Var.f132434c) && Intrinsics.d(this.f132435d, g7Var.f132435d) && Intrinsics.d(this.f132436e, g7Var.f132436e);
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.f132434c, a.cb.d(this.f132433b, this.f132432a.hashCode() * 31, 31), 31);
        Object obj = this.f132435d;
        int hashCode = (d2 + (obj == null ? 0 : obj.hashCode())) * 31;
        f7 f7Var = this.f132436e;
        return hashCode + (f7Var != null ? f7Var.hashCode() : 0);
    }

    public final String toString() {
        return "Node(__typename=" + this.f132432a + ", id=" + this.f132433b + ", entityId=" + this.f132434c + ", status=" + this.f132435d + ", invitedUser=" + this.f132436e + ")";
    }
}
