package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v8 implements z40.r {

    /* renamed from: a, reason: collision with root package name */
    public final String f133542a;

    /* renamed from: b, reason: collision with root package name */
    public final String f133543b;

    /* renamed from: c, reason: collision with root package name */
    public final String f133544c;

    /* renamed from: d, reason: collision with root package name */
    public final u8 f133545d;

    /* renamed from: e, reason: collision with root package name */
    public final s8 f133546e;

    /* renamed from: f, reason: collision with root package name */
    public final String f133547f;

    /* renamed from: g, reason: collision with root package name */
    public final List f133548g;

    public v8(String __typename, String id3, String entityId, u8 u8Var, s8 s8Var, String str, List list) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f133542a = __typename;
        this.f133543b = id3;
        this.f133544c = entityId;
        this.f133545d = u8Var;
        this.f133546e = s8Var;
        this.f133547f = str;
        this.f133548g = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v8)) {
            return false;
        }
        v8 v8Var = (v8) obj;
        return Intrinsics.d(this.f133542a, v8Var.f133542a) && Intrinsics.d(this.f133543b, v8Var.f133543b) && Intrinsics.d(this.f133544c, v8Var.f133544c) && Intrinsics.d(this.f133545d, v8Var.f133545d) && Intrinsics.d(this.f133546e, v8Var.f133546e) && Intrinsics.d(this.f133547f, v8Var.f133547f) && Intrinsics.d(this.f133548g, v8Var.f133548g);
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.f133544c, a.cb.d(this.f133543b, this.f133542a.hashCode() * 31, 31), 31);
        u8 u8Var = this.f133545d;
        int hashCode = (d2 + (u8Var == null ? 0 : u8Var.hashCode())) * 31;
        s8 s8Var = this.f133546e;
        int hashCode2 = (hashCode + (s8Var == null ? 0 : s8Var.hashCode())) * 31;
        String str = this.f133547f;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.f133548g;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("UserDidItData(__typename=");
        sb3.append(this.f133542a);
        sb3.append(", id=");
        sb3.append(this.f133543b);
        sb3.append(", entityId=");
        sb3.append(this.f133544c);
        sb3.append(", user=");
        sb3.append(this.f133545d);
        sb3.append(", pin=");
        sb3.append(this.f133546e);
        sb3.append(", details=");
        sb3.append(this.f133547f);
        sb3.append(", images=");
        return a.c.j(sb3, this.f133548g, ")");
    }
}
