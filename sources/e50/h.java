package e50;

import c50.l3;
import c50.ma;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h implements pc.u0 {

    /* renamed from: b, reason: collision with root package name */
    public static final ma f57353b = new ma(1, 0);

    /* renamed from: a, reason: collision with root package name */
    public final String f57354a;

    public h(String id3) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter("345x", "imageSpec");
        this.f57354a = id3;
    }

    @Override // pc.o0
    public final String a() {
        return "35cde40acea9f3a57776c94508e506afe09e10c01207e1803ba348d9a7049646";
    }

    @Override // pc.o0
    public final pc.a b() {
        return pc.c.c(f50.g.f61135a);
    }

    @Override // pc.o0
    public final String c() {
        return f57353b.e();
    }

    @Override // pc.o0
    public final pc.m d() {
        pc.m0 v13 = ep.b.v(l3.f26127a, "data", "name", "type");
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        List list = h50.a.f67672a;
        List selections = h50.a.f67674c;
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
        eVar.d(writer, customScalarAdapters, this.f57354a);
        writer.M0("imageSpec");
        eVar.d(writer, customScalarAdapters, "345x");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            return Intrinsics.d(this.f57354a, ((h) obj).f57354a) && Intrinsics.d("345x", "345x");
        }
        return false;
    }

    public final int hashCode() {
        return (this.f57354a.hashCode() * 31) + 1571076;
    }

    @Override // pc.o0
    public final String name() {
        return "SearchGridUserWatcherQuery";
    }

    public final String toString() {
        return a.a.p(new StringBuilder("SearchGridUserWatcherQuery(id="), this.f57354a, ", imageSpec=345x)");
    }
}
