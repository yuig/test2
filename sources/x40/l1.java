package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l1 implements pc.u0 {

    /* renamed from: b, reason: collision with root package name */
    public static final m0 f132692b = new m0(2, 0);

    /* renamed from: a, reason: collision with root package name */
    public final String f132693a;

    public l1(String id3) {
        Intrinsics.checkNotNullParameter(id3, "id");
        this.f132693a = id3;
    }

    @Override // pc.o0
    public final String a() {
        return "0f8ccfc7ddb3a63fbdbfb9b28991ec790fab95a6d3cc423bac5448dfe1f96a65";
    }

    @Override // pc.o0
    public final pc.a b() {
        return pc.c.c(y40.b1.f136914a);
    }

    @Override // pc.o0
    public final String c() {
        return f132692b.a();
    }

    @Override // pc.o0
    public final pc.m d() {
        pc.m0 v13 = ep.b.v(c50.l3.f26127a, "data", "name", "type");
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        List list = b50.i.f21876a;
        List selections = b50.i.f21878c;
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
        pc.c.f99520a.d(writer, customScalarAdapters, this.f132693a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l1) && Intrinsics.d(this.f132693a, ((l1) obj).f132693a);
    }

    public final int hashCode() {
        return this.f132693a.hashCode();
    }

    @Override // pc.o0
    public final String name() {
        return "BoardSectionConnectionQuery";
    }

    public final String toString() {
        return a.a.p(new StringBuilder("BoardSectionConnectionQuery(id="), this.f132693a, ")");
    }
}
