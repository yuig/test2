package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u2 implements z40.r {

    /* renamed from: a, reason: collision with root package name */
    public final String f133401a;

    /* renamed from: b, reason: collision with root package name */
    public final String f133402b;

    /* renamed from: c, reason: collision with root package name */
    public final String f133403c;

    /* renamed from: d, reason: collision with root package name */
    public final t2 f133404d;

    /* renamed from: e, reason: collision with root package name */
    public final r2 f133405e;

    /* renamed from: f, reason: collision with root package name */
    public final String f133406f;

    /* renamed from: g, reason: collision with root package name */
    public final List f133407g;

    public u2(String __typename, String id3, String entityId, t2 t2Var, r2 r2Var, String str, List list) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f133401a = __typename;
        this.f133402b = id3;
        this.f133403c = entityId;
        this.f133404d = t2Var;
        this.f133405e = r2Var;
        this.f133406f = str;
        this.f133407g = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2)) {
            return false;
        }
        u2 u2Var = (u2) obj;
        return Intrinsics.d(this.f133401a, u2Var.f133401a) && Intrinsics.d(this.f133402b, u2Var.f133402b) && Intrinsics.d(this.f133403c, u2Var.f133403c) && Intrinsics.d(this.f133404d, u2Var.f133404d) && Intrinsics.d(this.f133405e, u2Var.f133405e) && Intrinsics.d(this.f133406f, u2Var.f133406f) && Intrinsics.d(this.f133407g, u2Var.f133407g);
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.f133403c, a.cb.d(this.f133402b, this.f133401a.hashCode() * 31, 31), 31);
        t2 t2Var = this.f133404d;
        int hashCode = (d2 + (t2Var == null ? 0 : t2Var.hashCode())) * 31;
        r2 r2Var = this.f133405e;
        int hashCode2 = (hashCode + (r2Var == null ? 0 : r2Var.hashCode())) * 31;
        String str = this.f133406f;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.f133407g;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("UserDidItData(__typename=");
        sb3.append(this.f133401a);
        sb3.append(", id=");
        sb3.append(this.f133402b);
        sb3.append(", entityId=");
        sb3.append(this.f133403c);
        sb3.append(", user=");
        sb3.append(this.f133404d);
        sb3.append(", pin=");
        sb3.append(this.f133405e);
        sb3.append(", details=");
        sb3.append(this.f133406f);
        sb3.append(", images=");
        return a.c.j(sb3, this.f133407g, ")");
    }
}
