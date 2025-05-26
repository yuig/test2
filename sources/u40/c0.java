package u40;

import c50.l3;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c0 implements pc.u0 {

    /* renamed from: a, reason: collision with root package name */
    public static final g40.a f120312a = new g40.a(15, 0);

    @Override // pc.o0
    public final String a() {
        return "8cc95f6a4871bd8f22cad554cd323377f1902761098c1cca53d21611ab7c4e05";
    }

    @Override // pc.o0
    public final pc.a b() {
        return pc.c.c(v40.a0.f124030a);
    }

    @Override // pc.o0
    public final String c() {
        return f120312a.a();
    }

    @Override // pc.o0
    public final pc.m d() {
        pc.m0 v13 = ep.b.v(l3.f26127a, "data", "name", "type");
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        List list = w40.b.f127955a;
        List selections = w40.b.f127960f;
        Intrinsics.checkNotNullParameter(selections, "selections");
        return new pc.m("data", v13, null, q0Var, q0Var, selections);
    }

    @Override // pc.o0
    public final void e(tc.g writer, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == c0.class;
    }

    public final int hashCode() {
        return kotlin.jvm.internal.k0.f80436a.b(c0.class).hashCode();
    }

    @Override // pc.o0
    public final String name() {
        return "SettingsEditProfileQueryV3";
    }
}
