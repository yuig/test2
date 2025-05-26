package p30;

import c50.l2;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import n00.z;
import pc.j0;
import pc.m0;

/* loaded from: classes2.dex */
public final class n implements j0 {

    /* renamed from: b, reason: collision with root package name */
    public static final z f98745b = new z(12, 0);

    /* renamed from: a, reason: collision with root package name */
    public final String f98746a;

    public n(String followee) {
        Intrinsics.checkNotNullParameter(followee, "followee");
        this.f98746a = followee;
    }

    @Override // pc.o0
    public final String a() {
        return "7cd738c4036c5f022963b66773f0dda468436360fa3e721a509c0fde4c5e8a77";
    }

    @Override // pc.o0
    public final pc.a b() {
        return pc.c.c(q30.l.f102292a);
    }

    @Override // pc.o0
    public final String c() {
        return f98745b.b();
    }

    @Override // pc.o0
    public final pc.m d() {
        m0 type = l2.f26125a.n();
        Intrinsics.checkNotNullParameter("data", "name");
        Intrinsics.checkNotNullParameter(type, "type");
        q0 q0Var = q0.f80391a;
        List list = r30.b.f106081a;
        List selections = r30.b.f106084d;
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
        writer.M0("followee");
        pc.c.f99520a.d(writer, customScalarAdapters, this.f98746a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && Intrinsics.d(this.f98746a, ((n) obj).f98746a);
    }

    public final int hashCode() {
        return this.f98746a.hashCode();
    }

    @Override // pc.o0
    public final String name() {
        return "EmailFollowUserMutation";
    }

    public final String toString() {
        return a.a.p(new StringBuilder("EmailFollowUserMutation(followee="), this.f98746a, ")");
    }
}
