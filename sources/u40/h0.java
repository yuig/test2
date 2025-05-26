package u40;

import c50.l3;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h0 implements pc.u0 {

    /* renamed from: b, reason: collision with root package name */
    public static final g40.a f120331b = new g40.a(19, 0);

    /* renamed from: a, reason: collision with root package name */
    public final String f120332a;

    public h0(String id3) {
        Intrinsics.checkNotNullParameter(id3, "id");
        this.f120332a = id3;
    }

    @Override // pc.o0
    public final String a() {
        return "311440f41a22abeae696d110f1d1ee193507086a8b547149ed0c5ce9be21e65e";
    }

    @Override // pc.o0
    public final pc.a b() {
        return pc.c.c(v40.e0.f124045a);
    }

    @Override // pc.o0
    public final String c() {
        return f120331b.a();
    }

    @Override // pc.o0
    public final pc.m d() {
        pc.m0 v13 = ep.b.v(l3.f26127a, "data", "name", "type");
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        List list = w40.c.f127961a;
        List selections = w40.c.f127963c;
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
        pc.c.f99520a.d(writer, customScalarAdapters, this.f120332a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h0) && Intrinsics.d(this.f120332a, ((h0) obj).f120332a);
    }

    public final int hashCode() {
        return this.f120332a.hashCode();
    }

    @Override // pc.o0
    public final String name() {
        return "UserFollowerCountWatcherQuery";
    }

    public final String toString() {
        return a.a.p(new StringBuilder("UserFollowerCountWatcherQuery(id="), this.f120332a, ")");
    }
}
