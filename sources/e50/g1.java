package e50;

import a.cb;
import c50.l3;
import c50.ma;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g1 implements pc.u0 {

    /* renamed from: e, reason: collision with root package name */
    public static final ma f57348e = new ma(3, 0);

    /* renamed from: a, reason: collision with root package name */
    public final String f57349a;

    /* renamed from: b, reason: collision with root package name */
    public final String f57350b;

    /* renamed from: c, reason: collision with root package name */
    public final pc.r0 f57351c;

    /* renamed from: d, reason: collision with root package name */
    public final pc.r0 f57352d;

    public g1(String query, String referrerSource, pc.q0 first, pc.r0 after) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter("345x", "imageSpec");
        Intrinsics.checkNotNullParameter(referrerSource, "referrerSource");
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(after, "after");
        this.f57349a = query;
        this.f57350b = referrerSource;
        this.f57351c = first;
        this.f57352d = after;
    }

    @Override // pc.o0
    public final String a() {
        return "022bf2d4169338a913b43a20d7f00e8bf97bfda4c19c4a689ce3e1c07c19dfbd";
    }

    @Override // pc.o0
    public final pc.a b() {
        return pc.c.c(f50.e1.f61130a);
    }

    @Override // pc.o0
    public final String c() {
        return f57348e.e();
    }

    @Override // pc.o0
    public final pc.m d() {
        pc.m0 v13 = ep.b.v(l3.f26127a, "data", "name", "type");
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        List list = h50.b.f67675a;
        List selections = h50.b.f67696v;
        Intrinsics.checkNotNullParameter(selections, "selections");
        return new pc.m("data", v13, null, q0Var, q0Var, selections);
    }

    @Override // pc.o0
    public final void e(tc.g writer, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        kh2.w.B0(writer, customScalarAdapters, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return Intrinsics.d(this.f57349a, g1Var.f57349a) && Intrinsics.d("345x", "345x") && Intrinsics.d(this.f57350b, g1Var.f57350b) && Intrinsics.d(this.f57351c, g1Var.f57351c) && Intrinsics.d(this.f57352d, g1Var.f57352d);
    }

    public final int hashCode() {
        return this.f57352d.hashCode() + pk2.f.a(this.f57351c, cb.d(this.f57350b, ((this.f57349a.hashCode() * 31) + 1571076) * 31, 31), 31);
    }

    @Override // pc.o0
    public final String name() {
        return "SearchGridUsersQuery";
    }

    public final String toString() {
        return "SearchGridUsersQuery(query=" + this.f57349a + ", imageSpec=345x, referrerSource=" + this.f57350b + ", first=" + this.f57351c + ", after=" + this.f57352d + ")";
    }
}
