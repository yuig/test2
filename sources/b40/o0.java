package b40;

import c50.l2;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o0 implements pc.j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final n00.z f21732c = new n00.z(28, 0);

    /* renamed from: a, reason: collision with root package name */
    public final String f21733a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21734b;

    public o0(String newsId, String pin) {
        Intrinsics.checkNotNullParameter(newsId, "newsId");
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f21733a = newsId;
        this.f21734b = pin;
    }

    @Override // pc.o0
    public final String a() {
        return "a5527c3baba9336462e5425b35d6a73917bb5a8cb305c755639820c026c13cfc";
    }

    @Override // pc.o0
    public final pc.a b() {
        return pc.c.c(c40.k0.f25729a);
    }

    @Override // pc.o0
    public final String c() {
        return f21732c.b();
    }

    @Override // pc.o0
    public final pc.m d() {
        pc.m0 type = l2.f26125a.n();
        Intrinsics.checkNotNullParameter("data", "name");
        Intrinsics.checkNotNullParameter(type, "type");
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        List list = f40.d.f61064a;
        List selections = f40.d.f61068e;
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
        writer.M0("newsId");
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, this.f21733a);
        writer.M0("pin");
        eVar.d(writer, customScalarAdapters, this.f21734b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return Intrinsics.d(this.f21733a, o0Var.f21733a) && Intrinsics.d(this.f21734b, o0Var.f21734b);
    }

    public final int hashCode() {
        return this.f21734b.hashCode() + (this.f21733a.hashCode() * 31);
    }

    @Override // pc.o0
    public final String name() {
        return "HideNewsHubPinMutation";
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("HideNewsHubPinMutation(newsId=");
        sb3.append(this.f21733a);
        sb3.append(", pin=");
        return a.a.p(sb3, this.f21734b, ")");
    }
}
