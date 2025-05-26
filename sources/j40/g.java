package j40;

import c50.l2;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import pc.j0;
import pc.m0;

/* loaded from: classes5.dex */
public final class g implements j0 {

    /* renamed from: b, reason: collision with root package name */
    public static final g40.a f74603b = new g40.a(1, 0);

    /* renamed from: a, reason: collision with root package name */
    public final List f74604a;

    public g(ArrayList interests) {
        Intrinsics.checkNotNullParameter(interests, "interests");
        this.f74604a = interests;
    }

    @Override // pc.o0
    public final String a() {
        return "87d6044d1984399c93859c7962302f02dc7f7b21a3c14801fc00fd98c387581a";
    }

    @Override // pc.o0
    public final pc.a b() {
        return pc.c.c(k40.f.f78272a);
    }

    @Override // pc.o0
    public final String c() {
        return f74603b.a();
    }

    @Override // pc.o0
    public final pc.m d() {
        m0 type = l2.f26125a.n();
        Intrinsics.checkNotNullParameter("data", "name");
        Intrinsics.checkNotNullParameter(type, "type");
        q0 q0Var = q0.f80391a;
        List list = l40.a.f81532a;
        List selections = l40.a.f81535d;
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
        writer.M0("redoHomeFeed");
        pc.c.f99522c.d(writer, customScalarAdapters, Boolean.FALSE);
        writer.M0("interests");
        pc.c.a(pc.c.f99524e).b(writer, customScalarAdapters, this.f74604a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        gVar.getClass();
        return Intrinsics.d(this.f74604a, gVar.f74604a);
    }

    public final int hashCode() {
        return this.f74604a.hashCode() + (Boolean.hashCode(false) * 31);
    }

    @Override // pc.o0
    public final String name() {
        return "NUXFollowInterestsMutation";
    }

    public final String toString() {
        return a.c.j(new StringBuilder("NUXFollowInterestsMutation(redoHomeFeed=false, interests="), this.f74604a, ")");
    }
}
