package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class bd implements pc.u0 {

    /* renamed from: c, reason: collision with root package name */
    public static final j6 f132051c = new j6(28, 0);

    /* renamed from: a, reason: collision with root package name */
    public final pc.r0 f132052a;

    /* renamed from: b, reason: collision with root package name */
    public final pc.r0 f132053b;

    public bd(pc.r0 first, pc.r0 after) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(after, "after");
        this.f132052a = first;
        this.f132053b = after;
    }

    @Override // pc.o0
    public final String a() {
        return "414f8b2cf32f0be5a3a861f7e7e54bfb900db1c10d36642c9b4e86d82285ebf4";
    }

    @Override // pc.o0
    public final pc.a b() {
        return pc.c.c(y40.dc.f136994a);
    }

    @Override // pc.o0
    public final String c() {
        return f132051c.a();
    }

    @Override // pc.o0
    public final pc.m d() {
        pc.m0 v13 = ep.b.v(c50.l3.f26127a, "data", "name", "type");
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        List list = b50.u.f21951a;
        List selections = b50.u.f21961k;
        Intrinsics.checkNotNullParameter(selections, "selections");
        return new pc.m("data", v13, null, q0Var, q0Var, selections);
    }

    @Override // pc.o0
    public final void e(tc.g writer, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(this, "value");
        pc.r0 r0Var = this.f132052a;
        if (r0Var instanceof pc.q0) {
            writer.M0("first");
            pc.c.d(pc.c.f99526g).a(writer, customScalarAdapters, (pc.q0) r0Var);
        }
        pc.r0 r0Var2 = this.f132053b;
        if (r0Var2 instanceof pc.q0) {
            writer.M0("after");
            pc.c.d(pc.c.b(pc.c.f99520a)).a(writer, customScalarAdapters, (pc.q0) r0Var2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bd)) {
            return false;
        }
        bd bdVar = (bd) obj;
        return Intrinsics.d(this.f132052a, bdVar.f132052a) && Intrinsics.d(this.f132053b, bdVar.f132053b);
    }

    public final int hashCode() {
        return this.f132053b.hashCode() + (this.f132052a.hashCode() * 31);
    }

    @Override // pc.o0
    public final String name() {
        return "GetUserContactRequestsByUserQuery";
    }

    public final String toString() {
        return "GetUserContactRequestsByUserQuery(first=" + this.f132052a + ", after=" + this.f132053b + ")";
    }
}
