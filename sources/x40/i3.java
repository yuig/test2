package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i3 implements pc.u0 {

    /* renamed from: b, reason: collision with root package name */
    public static final m0 f132518b = new m0(3, 0);

    /* renamed from: a, reason: collision with root package name */
    public final String f132519a;

    public i3(String id3) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter("236x", "imageSpec");
        this.f132519a = id3;
    }

    @Override // pc.o0
    public final String a() {
        return "ce0ac94a3a9d6214ae1bcb98b17810c051dfbe4e021991dfdacd3b20e8fe71eb";
    }

    @Override // pc.o0
    public final pc.a b() {
        return pc.c.c(y40.x2.f137615a);
    }

    @Override // pc.o0
    public final String c() {
        return f132518b.a();
    }

    @Override // pc.o0
    public final pc.m d() {
        pc.m0 v13 = ep.b.v(c50.l3.f26127a, "data", "name", "type");
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        List list = b50.j.f21879a;
        List selections = b50.j.f21888j;
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
        eVar.d(writer, customScalarAdapters, this.f132519a);
        writer.M0("imageSpec");
        eVar.d(writer, customScalarAdapters, "236x");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i3) {
            return Intrinsics.d(this.f132519a, ((i3) obj).f132519a) && Intrinsics.d("236x", "236x");
        }
        return false;
    }

    public final int hashCode() {
        return (this.f132519a.hashCode() * 31) + 1540355;
    }

    @Override // pc.o0
    public final String name() {
        return "ConversationConnectionQuery";
    }

    public final String toString() {
        return a.a.p(new StringBuilder("ConversationConnectionQuery(id="), this.f132519a, ", imageSpec=236x)");
    }
}
