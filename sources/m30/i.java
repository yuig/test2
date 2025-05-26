package m30;

import c50.l3;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import n00.z;
import pc.m;
import pc.m0;
import pc.u0;
import pc.v;

/* loaded from: classes2.dex */
public final class i implements u0 {

    /* renamed from: b, reason: collision with root package name */
    public static final z f85755b = new z(10, 0);

    /* renamed from: a, reason: collision with root package name */
    public final String f85756a;

    public i(String pinId) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f85756a = pinId;
    }

    @Override // pc.o0
    public final String a() {
        return "43b0c9d27b00dbf34c086507ec1f021b05a9c9dfd418a871cb480573598c91e9";
    }

    @Override // pc.o0
    public final pc.a b() {
        return pc.c.c(n30.h.f89156a);
    }

    @Override // pc.o0
    public final String c() {
        return f85755b.b();
    }

    @Override // pc.o0
    public final m d() {
        m0 v13 = ep.b.v(l3.f26127a, "data", "name", "type");
        q0 q0Var = q0.f80391a;
        List list = o30.a.f92863a;
        List selections = o30.a.f92868f;
        Intrinsics.checkNotNullParameter(selections, "selections");
        return new m("data", v13, null, q0Var, q0Var, selections);
    }

    @Override // pc.o0
    public final void e(tc.g writer, v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(this, "value");
        writer.M0("pinId");
        pc.c.f99520a.d(writer, customScalarAdapters, this.f85756a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && Intrinsics.d(this.f85756a, ((i) obj).f85756a);
    }

    public final int hashCode() {
        return this.f85756a.hashCode();
    }

    @Override // pc.o0
    public final String name() {
        return "BoardTitleSuggestionsQuery";
    }

    public final String toString() {
        return a.a.p(new StringBuilder("BoardTitleSuggestionsQuery(pinId="), this.f85756a, ")");
    }
}
