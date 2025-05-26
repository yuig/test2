package b40;

import c50.l2;
import java.util.List;
import kh2.j1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v0 implements pc.j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final n00.z f21756c = new n00.z(29, 0);

    /* renamed from: a, reason: collision with root package name */
    public final pc.r0 f21757a;

    /* renamed from: b, reason: collision with root package name */
    public final pc.r0 f21758b;

    public v0(pc.q0 objectIdsToUnsubscribe, pc.q0 objectIdsToResubscribe) {
        Intrinsics.checkNotNullParameter(objectIdsToUnsubscribe, "objectIdsToUnsubscribe");
        Intrinsics.checkNotNullParameter(objectIdsToResubscribe, "objectIdsToResubscribe");
        this.f21757a = objectIdsToUnsubscribe;
        this.f21758b = objectIdsToResubscribe;
    }

    @Override // pc.o0
    public final String a() {
        return "ed701abc628ee45177a74a77e5bac606318ea9f812a956140ed3d7c339982db7";
    }

    @Override // pc.o0
    public final pc.a b() {
        return pc.c.c(c40.q0.f25746a);
    }

    @Override // pc.o0
    public final String c() {
        return f21756c.b();
    }

    @Override // pc.o0
    public final pc.m d() {
        pc.m0 type = l2.f26125a.n();
        Intrinsics.checkNotNullParameter("data", "name");
        Intrinsics.checkNotNullParameter(type, "type");
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        List list = f40.e.f61069a;
        List selections = f40.e.f61072d;
        Intrinsics.checkNotNullParameter(selections, "selections");
        return new pc.m("data", type, null, q0Var, q0Var, selections);
    }

    @Override // pc.o0
    public final void e(tc.g writer, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        j1.F1(writer, customScalarAdapters, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return Intrinsics.d(this.f21757a, v0Var.f21757a) && Intrinsics.d(this.f21758b, v0Var.f21758b);
    }

    public final int hashCode() {
        return this.f21758b.hashCode() + (this.f21757a.hashCode() * 31);
    }

    @Override // pc.o0
    public final String name() {
        return "UpdateObjectSubscriptionsForNotificationsGraphqlMutation";
    }

    public final String toString() {
        return "UpdateObjectSubscriptionsForNotificationsGraphqlMutation(objectIdsToUnsubscribe=" + this.f21757a + ", objectIdsToResubscribe=" + this.f21758b + ")";
    }
}
