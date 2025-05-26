package j40;

import c50.l3;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import pc.m0;
import pc.p0;
import pc.q0;
import pc.r0;
import pc.u0;

/* loaded from: classes5.dex */
public final class x implements u0 {

    /* renamed from: c, reason: collision with root package name */
    public static final g40.a f74632c = new g40.a(2, 0);

    /* renamed from: a, reason: collision with root package name */
    public final r0 f74633a;

    /* renamed from: b, reason: collision with root package name */
    public final r0 f74634b;

    public x(q0 pageSize) {
        p0 imageSpec = p0.f99597a;
        Intrinsics.checkNotNullParameter(pageSize, "pageSize");
        Intrinsics.checkNotNullParameter(imageSpec, "imageSpec");
        this.f74633a = pageSize;
        this.f74634b = imageSpec;
    }

    @Override // pc.o0
    public final String a() {
        return "4a05363da5af7b6c3af19bd7c089ddfdf1e4708acee50f868092e75e7f1eaa8d";
    }

    @Override // pc.o0
    public final pc.a b() {
        return pc.c.c(k40.v.f78296a);
    }

    @Override // pc.o0
    public final String c() {
        return f74632c.a();
    }

    @Override // pc.o0
    public final pc.m d() {
        m0 v13 = ep.b.v(l3.f26127a, "data", "name", "type");
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        List list = l40.b.f81536a;
        List selections = l40.b.f81546k;
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
        r0 r0Var = this.f74633a;
        if (r0Var instanceof q0) {
            writer.M0("pageSize");
            pc.c.d(pc.c.f99521b).a(writer, customScalarAdapters, (q0) r0Var);
        }
        r0 r0Var2 = this.f74634b;
        if (r0Var2 instanceof q0) {
            writer.M0("imageSpec");
            pc.c.d(pc.c.f99520a).a(writer, customScalarAdapters, (q0) r0Var2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Intrinsics.d(this.f74633a, xVar.f74633a) && Intrinsics.d(this.f74634b, xVar.f74634b);
    }

    public final int hashCode() {
        return this.f74634b.hashCode() + (this.f74633a.hashCode() * 31);
    }

    @Override // pc.o0
    public final String name() {
        return "NuxInterestsQuery";
    }

    public final String toString() {
        return "NuxInterestsQuery(pageSize=" + this.f74633a + ", imageSpec=" + this.f74634b + ")";
    }
}
