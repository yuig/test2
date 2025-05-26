package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p6 implements pc.j0 {

    /* renamed from: b, reason: collision with root package name */
    public static final j6 f133024b = new j6(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final String f133025a;

    public p6(String contactRequestId) {
        Intrinsics.checkNotNullParameter(contactRequestId, "contactRequestId");
        this.f133025a = contactRequestId;
    }

    @Override // pc.o0
    public final String a() {
        return "65517113cc4023335920249032e7eb82bb66bebd4460d9184015d2d461f5106b";
    }

    @Override // pc.o0
    public final pc.a b() {
        return pc.c.c(y40.y5.f137651a);
    }

    @Override // pc.o0
    public final String c() {
        return f133024b.a();
    }

    @Override // pc.o0
    public final pc.m d() {
        pc.m0 type = c50.l2.f26125a.n();
        Intrinsics.checkNotNullParameter("data", "name");
        Intrinsics.checkNotNullParameter(type, "type");
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        List list = b50.o.f21910a;
        List selections = b50.o.f21912c;
        Intrinsics.checkNotNullParameter(selections, "selections");
        return new pc.m("data", type, null, q0Var, q0Var, selections);
    }

    @Override // pc.o0
    public final void e(tc.g writer, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(this, "value");
        writer.M0("contactRequestId");
        pc.c.f99520a.d(writer, customScalarAdapters, this.f133025a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p6) && Intrinsics.d(this.f133025a, ((p6) obj).f133025a);
    }

    public final int hashCode() {
        return this.f133025a.hashCode();
    }

    @Override // pc.o0
    public final String name() {
        return "DeclineContactRequestMutation";
    }

    public final String toString() {
        return a.a.p(new StringBuilder("DeclineContactRequestMutation(contactRequestId="), this.f133025a, ")");
    }
}
