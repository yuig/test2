package u40;

import c50.l2;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p implements pc.j0 {

    /* renamed from: b, reason: collision with root package name */
    public static final g40.a f120411b = new g40.a(11, 0);

    /* renamed from: a, reason: collision with root package name */
    public final pc.r0 f120412a;

    public p(pc.r0 input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.f120412a = input;
    }

    @Override // pc.o0
    public final String a() {
        return "8b2205bd4818891f85b45f8cba489b3c9a875dd85e967ceef9195041e575f425";
    }

    @Override // pc.o0
    public final pc.a b() {
        return pc.c.c(v40.o.f124076a);
    }

    @Override // pc.o0
    public final String c() {
        return f120411b.a();
    }

    @Override // pc.o0
    public final pc.m d() {
        pc.m0 type = l2.f26125a.n();
        Intrinsics.checkNotNullParameter("data", "name");
        Intrinsics.checkNotNullParameter(type, "type");
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        List list = w40.a.f127947a;
        List selections = w40.a.f127954h;
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
        pc.r0 r0Var = this.f120412a;
        if (r0Var instanceof pc.q0) {
            writer.M0("input");
            pc.c.d(pc.c.b(pc.c.c(d50.b.f53683a))).a(writer, customScalarAdapters, (pc.q0) r0Var);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && Intrinsics.d(this.f120412a, ((p) obj).f120412a);
    }

    public final int hashCode() {
        return this.f120412a.hashCode();
    }

    @Override // pc.o0
    public final String name() {
        return "EditSettingsMutation";
    }

    public final String toString() {
        return "EditSettingsMutation(input=" + this.f120412a + ")";
    }
}
