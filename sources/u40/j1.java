package u40;

import c50.l3;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j1 implements pc.u0 {

    /* renamed from: d, reason: collision with root package name */
    public static final g40.a f120349d = new g40.a(22, 0);

    /* renamed from: a, reason: collision with root package name */
    public final String f120350a;

    /* renamed from: b, reason: collision with root package name */
    public final pc.r0 f120351b;

    /* renamed from: c, reason: collision with root package name */
    public final pc.r0 f120352c;

    public j1(String entityId, pc.q0 first, pc.r0 after) {
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        Intrinsics.checkNotNullParameter("345x", "imageSpec");
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(after, "after");
        this.f120350a = entityId;
        this.f120351b = first;
        this.f120352c = after;
    }

    @Override // pc.o0
    public final String a() {
        return "ed6eb32ea1b377ee53fd8255e679629ef8846c51f9eb146727730fd084d29de0";
    }

    @Override // pc.o0
    public final pc.a b() {
        return pc.c.c(v40.e1.f124047a);
    }

    @Override // pc.o0
    public final String c() {
        return f120349d.a();
    }

    @Override // pc.o0
    public final pc.m d() {
        pc.m0 v13 = ep.b.v(l3.f26127a, "data", "name", "type");
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        List list = w40.e.f127967a;
        List selections = w40.e.f127978l;
        Intrinsics.checkNotNullParameter(selections, "selections");
        return new pc.m("data", v13, null, q0Var, q0Var, selections);
    }

    @Override // pc.o0
    public final void e(tc.g writer, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        kg.a.e0(writer, customScalarAdapters, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        return Intrinsics.d(this.f120350a, j1Var.f120350a) && Intrinsics.d("345x", "345x") && Intrinsics.d(this.f120351b, j1Var.f120351b) && Intrinsics.d(this.f120352c, j1Var.f120352c);
    }

    public final int hashCode() {
        return this.f120352c.hashCode() + pk2.f.a(this.f120351b, ((this.f120350a.hashCode() * 31) + 1571076) * 31, 31);
    }

    @Override // pc.o0
    public final String name() {
        return "UserFollowersQuery";
    }

    public final String toString() {
        return "UserFollowersQuery(entityId=" + this.f120350a + ", imageSpec=345x, first=" + this.f120351b + ", after=" + this.f120352c + ")";
    }
}
