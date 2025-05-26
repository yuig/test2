package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g1 implements pc.u0 {

    /* renamed from: b, reason: collision with root package name */
    public static final zy.b0 f132424b = new zy.b0(12, 0);

    /* renamed from: a, reason: collision with root package name */
    public final String f132425a;

    public g1(String id3) {
        Intrinsics.checkNotNullParameter(id3, "id");
        this.f132425a = id3;
    }

    @Override // pc.o0
    public final String a() {
        return "8c49559a336e403871edf6bd3cad225da28eee096a48ed4a01014c94edbdc70d";
    }

    @Override // pc.o0
    public final pc.a b() {
        return pc.c.c(y40.x0.f137611a);
    }

    @Override // pc.o0
    public final String c() {
        return f132424b.b();
    }

    @Override // pc.o0
    public final pc.m d() {
        pc.m0 v13 = ep.b.v(c50.l3.f26127a, "data", "name", "type");
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        List list = b50.h.f21873a;
        List selections = b50.h.f21875c;
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
        pc.c.f99520a.d(writer, customScalarAdapters, this.f132425a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g1) && Intrinsics.d(this.f132425a, ((g1) obj).f132425a);
    }

    public final int hashCode() {
        return this.f132425a.hashCode();
    }

    @Override // pc.o0
    public final String name() {
        return "BoardConnectionQuery";
    }

    public final String toString() {
        return a.a.p(new StringBuilder("BoardConnectionQuery(id="), this.f132425a, ")");
    }
}
