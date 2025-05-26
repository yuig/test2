package j40;

import c50.l3;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import pc.m0;
import pc.u0;

/* loaded from: classes5.dex */
public final class e0 implements u0 {

    /* renamed from: a, reason: collision with root package name */
    public static final g40.a f74601a = new g40.a(4, 0);

    @Override // pc.o0
    public final String a() {
        return "736c65bd729ae09865098479abc9e7d04ede94b2b2cc37b1d9d8893b9133036f";
    }

    @Override // pc.o0
    public final pc.a b() {
        return pc.c.c(k40.b0.f78267a);
    }

    @Override // pc.o0
    public final String c() {
        return f74601a.a();
    }

    @Override // pc.o0
    public final pc.m d() {
        m0 v13 = ep.b.v(l3.f26127a, "data", "name", "type");
        q0 q0Var = q0.f80391a;
        List list = l40.c.f81547a;
        List selections = l40.c.f81550d;
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
        writer.M0("redoHomeFeed");
        pc.c.f99522c.d(writer, customScalarAdapters, Boolean.FALSE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        ((e0) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(false);
    }

    @Override // pc.o0
    public final String name() {
        return "OrientationStatusQuery";
    }

    public final String toString() {
        return "OrientationStatusQuery(redoHomeFeed=false)";
    }
}
