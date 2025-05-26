package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class fg implements pc.u0 {

    /* renamed from: b, reason: collision with root package name */
    public static final zy.b0 f132416b = new zy.b0(13, 0);

    /* renamed from: a, reason: collision with root package name */
    public final String f132417a;

    public fg(String id3) {
        Intrinsics.checkNotNullParameter(id3, "id");
        this.f132417a = id3;
    }

    @Override // pc.o0
    public final String a() {
        return "c7417e2fd6b52278cadbf533e45f6b5bb019acd65ccf70b56a32b313133e3b8b";
    }

    @Override // pc.o0
    public final pc.a b() {
        return pc.c.c(y40.ze.f137697a);
    }

    @Override // pc.o0
    public final String c() {
        return f132416b.b();
    }

    @Override // pc.o0
    public final pc.m d() {
        pc.m0 v13 = ep.b.v(c50.l3.f26127a, "data", "name", "type");
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        List list = b50.c0.f21800a;
        List selections = b50.c0.f21819t;
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
        pc.c.f99520a.d(writer, customScalarAdapters, this.f132417a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fg) && Intrinsics.d(this.f132417a, ((fg) obj).f132417a);
    }

    public final int hashCode() {
        return this.f132417a.hashCode();
    }

    @Override // pc.o0
    public final String name() {
        return "PinConnectionQuery";
    }

    public final String toString() {
        return a.a.p(new StringBuilder("PinConnectionQuery(id="), this.f132417a, ")");
    }
}
