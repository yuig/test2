package u40;

import c50.l3;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p0 implements pc.u0 {

    /* renamed from: b, reason: collision with root package name */
    public static final g40.a f120413b = new g40.a(20, 0);

    /* renamed from: a, reason: collision with root package name */
    public final String f120414a;

    public p0(String id3) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter("345x", "imageSpec");
        this.f120414a = id3;
    }

    @Override // pc.o0
    public final String a() {
        return "6c86fbad6d6f5cb28a82b8bb25abaa5b5e6eba76d54cdc0a5e108cbda7abb4df";
    }

    @Override // pc.o0
    public final pc.a b() {
        return pc.c.c(v40.l0.f124068a);
    }

    @Override // pc.o0
    public final String c() {
        return f120413b.a();
    }

    @Override // pc.o0
    public final pc.m d() {
        pc.m0 v13 = ep.b.v(l3.f26127a, "data", "name", "type");
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        List list = w40.d.f127964a;
        List selections = w40.d.f127966c;
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
        writer.M0("id");
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, this.f120414a);
        writer.M0("imageSpec");
        eVar.d(writer, customScalarAdapters, "345x");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p0) {
            return Intrinsics.d(this.f120414a, ((p0) obj).f120414a) && Intrinsics.d("345x", "345x");
        }
        return false;
    }

    public final int hashCode() {
        return (this.f120414a.hashCode() * 31) + 1571076;
    }

    @Override // pc.o0
    public final String name() {
        return "UserFollowerWatcherQuery";
    }

    public final String toString() {
        return a.a.p(new StringBuilder("UserFollowerWatcherQuery(id="), this.f120414a, ", imageSpec=345x)");
    }
}
