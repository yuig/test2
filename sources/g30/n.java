package g30;

import c50.l2;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import n00.z;
import pc.j0;
import pc.m0;
import pc.v;

/* loaded from: classes2.dex */
public final class n implements j0 {

    /* renamed from: b, reason: collision with root package name */
    public static final z f63431b = new z(8, 0);

    /* renamed from: a, reason: collision with root package name */
    public final String f63432a;

    public n(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.f63432a = token;
    }

    @Override // pc.o0
    public final String a() {
        return "78e4d26fc5c47b0a2314b9c7e2b9cbbf9f65206a5f10d2f431e878fa3684181e";
    }

    @Override // pc.o0
    public final pc.a b() {
        return pc.c.c(h30.l.f66790a);
    }

    @Override // pc.o0
    public final String c() {
        return f63431b.b();
    }

    @Override // pc.o0
    public final pc.m d() {
        m0 type = l2.f26125a.n();
        Intrinsics.checkNotNullParameter("data", "name");
        Intrinsics.checkNotNullParameter(type, "type");
        q0 q0Var = q0.f80391a;
        List list = i30.b.f71456a;
        List selections = i30.b.f71459d;
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
        writer.M0("token");
        pc.c.f99520a.d(writer, customScalarAdapters, this.f63432a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && Intrinsics.d(this.f63432a, ((n) obj).f63432a);
    }

    public final int hashCode() {
        return this.f63432a.hashCode();
    }

    @Override // pc.o0
    public final String name() {
        return "RemoveDeviceTokenMutation";
    }

    public final String toString() {
        return a.a.p(new StringBuilder("RemoveDeviceTokenMutation(token="), this.f63432a, ")");
    }
}
