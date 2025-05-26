package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r4 implements z40.r {

    /* renamed from: a, reason: collision with root package name */
    public final String f133150a;

    /* renamed from: b, reason: collision with root package name */
    public final String f133151b;

    /* renamed from: c, reason: collision with root package name */
    public final String f133152c;

    /* renamed from: d, reason: collision with root package name */
    public final q4 f133153d;

    /* renamed from: e, reason: collision with root package name */
    public final o4 f133154e;

    /* renamed from: f, reason: collision with root package name */
    public final String f133155f;

    /* renamed from: g, reason: collision with root package name */
    public final List f133156g;

    public r4(String __typename, String id3, String entityId, q4 q4Var, o4 o4Var, String str, List list) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f133150a = __typename;
        this.f133151b = id3;
        this.f133152c = entityId;
        this.f133153d = q4Var;
        this.f133154e = o4Var;
        this.f133155f = str;
        this.f133156g = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r4)) {
            return false;
        }
        r4 r4Var = (r4) obj;
        return Intrinsics.d(this.f133150a, r4Var.f133150a) && Intrinsics.d(this.f133151b, r4Var.f133151b) && Intrinsics.d(this.f133152c, r4Var.f133152c) && Intrinsics.d(this.f133153d, r4Var.f133153d) && Intrinsics.d(this.f133154e, r4Var.f133154e) && Intrinsics.d(this.f133155f, r4Var.f133155f) && Intrinsics.d(this.f133156g, r4Var.f133156g);
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.f133152c, a.cb.d(this.f133151b, this.f133150a.hashCode() * 31, 31), 31);
        q4 q4Var = this.f133153d;
        int hashCode = (d2 + (q4Var == null ? 0 : q4Var.hashCode())) * 31;
        o4 o4Var = this.f133154e;
        int hashCode2 = (hashCode + (o4Var == null ? 0 : o4Var.hashCode())) * 31;
        String str = this.f133155f;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.f133156g;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("UserDidItData(__typename=");
        sb3.append(this.f133150a);
        sb3.append(", id=");
        sb3.append(this.f133151b);
        sb3.append(", entityId=");
        sb3.append(this.f133152c);
        sb3.append(", user=");
        sb3.append(this.f133153d);
        sb3.append(", pin=");
        sb3.append(this.f133154e);
        sb3.append(", details=");
        sb3.append(this.f133155f);
        sb3.append(", images=");
        return a.c.j(sb3, this.f133156g, ")");
    }
}
