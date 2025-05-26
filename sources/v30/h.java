package v30;

import c50.l2;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import n00.z;
import pc.j0;
import pc.m0;
import pc.v;

/* loaded from: classes3.dex */
public final class h implements j0 {

    /* renamed from: b, reason: collision with root package name */
    public static final z f123931b = new z(16, 0);

    /* renamed from: a, reason: collision with root package name */
    public final String f123932a;

    public h(String followeeEntityId) {
        Intrinsics.checkNotNullParameter(followeeEntityId, "followeeEntityId");
        this.f123932a = followeeEntityId;
    }

    @Override // pc.o0
    public final String a() {
        return "345fadf971c77d2762d774289d438abd8d52f6aa61e81d86ad7b434d30753fc6";
    }

    @Override // pc.o0
    public final pc.a b() {
        return pc.c.c(w30.g.f127903a);
    }

    @Override // pc.o0
    public final String c() {
        return f123931b.b();
    }

    @Override // pc.o0
    public final pc.m d() {
        m0 type = l2.f26125a.n();
        Intrinsics.checkNotNullParameter("data", "name");
        Intrinsics.checkNotNullParameter(type, "type");
        q0 q0Var = q0.f80391a;
        List list = x30.a.f131605a;
        List selections = x30.a.f131609e;
        Intrinsics.checkNotNullParameter(selections, "selections");
        return new pc.m("data", type, null, q0Var, q0Var, selections);
    }

    @Override // pc.o0
    public final void e(tc.g writer, v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(this, "value");
        writer.M0("followeeEntityId");
        pc.c.f99520a.d(writer, customScalarAdapters, this.f123932a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Intrinsics.d(this.f123932a, ((h) obj).f123932a);
    }

    public final int hashCode() {
        return this.f123932a.hashCode();
    }

    @Override // pc.o0
    public final String name() {
        return "FollowUserMutation";
    }

    public final String toString() {
        return a.a.p(new StringBuilder("FollowUserMutation(followeeEntityId="), this.f123932a, ")");
    }
}
