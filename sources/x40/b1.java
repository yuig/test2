package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b1 implements pc.j0 {

    /* renamed from: b, reason: collision with root package name */
    public static final m0 f131999b = new m0(1, 0);

    /* renamed from: a, reason: collision with root package name */
    public final List f132000a;

    public b1(List contactRequestIds) {
        Intrinsics.checkNotNullParameter(contactRequestIds, "contactRequestIds");
        this.f132000a = contactRequestIds;
    }

    @Override // pc.o0
    public final String a() {
        return "750cf15b1b65c4fc0301021ef29de14cd19a46019d196dcafa7c8684926933a4";
    }

    @Override // pc.o0
    public final pc.a b() {
        return pc.c.c(y40.t0.f137490a);
    }

    @Override // pc.o0
    public final String c() {
        return f131999b.a();
    }

    @Override // pc.o0
    public final pc.m d() {
        pc.m0 type = c50.l2.f26125a.n();
        Intrinsics.checkNotNullParameter("data", "name");
        Intrinsics.checkNotNullParameter(type, "type");
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        List list = b50.g.f21853a;
        List selections = b50.g.f21857e;
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
        writer.M0("contactRequestIds");
        pc.c.a(pc.c.f99524e).b(writer, customScalarAdapters, this.f132000a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b1) && Intrinsics.d(this.f132000a, ((b1) obj).f132000a);
    }

    public final int hashCode() {
        return this.f132000a.hashCode();
    }

    @Override // pc.o0
    public final String name() {
        return "BatchDeclineContactRequestsMutation";
    }

    public final String toString() {
        return a.c.j(new StringBuilder("BatchDeclineContactRequestsMutation(contactRequestIds="), this.f132000a, ")");
    }
}
