package i50;

import c50.l3;
import c50.ma;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import pc.m0;
import pc.u0;
import pc.v;

/* loaded from: classes5.dex */
public final class h implements u0 {

    /* renamed from: b, reason: collision with root package name */
    public static final ma f71548b = new ma(8, 0);

    /* renamed from: a, reason: collision with root package name */
    public final String f71549a;

    public h(String pinId) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f71549a = pinId;
    }

    @Override // pc.o0
    public final String a() {
        return "19509bbe35af5b1abc2e68a9ded2c2c11bae056a5da35ae365863ff128c26f7f";
    }

    @Override // pc.o0
    public final pc.a b() {
        return pc.c.c(j50.g.f74691a);
    }

    @Override // pc.o0
    public final String c() {
        return f71548b.e();
    }

    @Override // pc.o0
    public final pc.m d() {
        m0 v13 = ep.b.v(l3.f26127a, "data", "name", "type");
        q0 q0Var = q0.f80391a;
        List list = m50.a.f85866a;
        List selections = m50.a.f85870e;
        Intrinsics.checkNotNullParameter(selections, "selections");
        return new pc.m("data", v13, null, q0Var, q0Var, selections);
    }

    @Override // pc.o0
    public final void e(tc.g writer, v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(this, "value");
        writer.M0("pinId");
        pc.c.f99520a.d(writer, customScalarAdapters, this.f71549a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Intrinsics.d(this.f71549a, ((h) obj).f71549a);
    }

    public final int hashCode() {
        return this.f71549a.hashCode();
    }

    @Override // pc.o0
    public final String name() {
        return "DownloadIdeaPinQuery";
    }

    public final String toString() {
        return a.a.p(new StringBuilder("DownloadIdeaPinQuery(pinId="), this.f71549a, ")");
    }
}
