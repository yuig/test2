package p30;

import a.cb;
import c50.l2;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import n00.z;
import pc.j0;
import pc.m0;

/* loaded from: classes2.dex */
public final class g implements j0 {

    /* renamed from: d, reason: collision with root package name */
    public static final z f98734d = new z(11, 0);

    /* renamed from: a, reason: collision with root package name */
    public final String f98735a;

    /* renamed from: b, reason: collision with root package name */
    public final String f98736b;

    /* renamed from: c, reason: collision with root package name */
    public final String f98737c;

    public g(String od3, String targetUrl, String viewingUser) {
        Intrinsics.checkNotNullParameter(od3, "od");
        Intrinsics.checkNotNullParameter(targetUrl, "targetUrl");
        Intrinsics.checkNotNullParameter(viewingUser, "viewingUser");
        this.f98735a = od3;
        this.f98736b = targetUrl;
        this.f98737c = viewingUser;
    }

    @Override // pc.o0
    public final String a() {
        return "b59d2608854de313310a96c7e978d6b0278a10b10d4a3d774a6e16e75521d82e";
    }

    @Override // pc.o0
    public final pc.a b() {
        return pc.c.c(q30.f.f102284a);
    }

    @Override // pc.o0
    public final String c() {
        return f98734d.b();
    }

    @Override // pc.o0
    public final pc.m d() {
        m0 type = l2.f26125a.n();
        Intrinsics.checkNotNullParameter("data", "name");
        Intrinsics.checkNotNullParameter(type, "type");
        q0 q0Var = q0.f80391a;
        List list = r30.a.f106077a;
        List selections = r30.a.f106080d;
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
        writer.M0("od");
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, this.f98735a);
        writer.M0("targetUrl");
        eVar.d(writer, customScalarAdapters, this.f98736b);
        writer.M0("viewingUser");
        eVar.d(writer, customScalarAdapters, this.f98737c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f98735a, gVar.f98735a) && Intrinsics.d(this.f98736b, gVar.f98736b) && Intrinsics.d(this.f98737c, gVar.f98737c);
    }

    public final int hashCode() {
        return this.f98737c.hashCode() + cb.d(this.f98736b, this.f98735a.hashCode() * 31, 31);
    }

    @Override // pc.o0
    public final String name() {
        return "EmailClickMutation";
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("EmailClickMutation(od=");
        sb3.append(this.f98735a);
        sb3.append(", targetUrl=");
        sb3.append(this.f98736b);
        sb3.append(", viewingUser=");
        return a.a.p(sb3, this.f98737c, ")");
    }
}
