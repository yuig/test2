package g40;

import c50.l2;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import pc.j0;
import pc.m;
import pc.m0;
import pc.v;

/* loaded from: classes5.dex */
public final class i implements j0 {

    /* renamed from: b, reason: collision with root package name */
    public static final a f63499b = new a(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final String f63500a;

    public i(String interestId) {
        Intrinsics.checkNotNullParameter(interestId, "interestId");
        this.f63500a = interestId;
    }

    @Override // pc.o0
    public final String a() {
        return "cff1ea79026534c4cca713199fca2a04e646fb6101aafd8a0c89e50e99f2bc07";
    }

    @Override // pc.o0
    public final pc.a b() {
        return pc.c.c(h40.g.f67625a);
    }

    @Override // pc.o0
    public final String c() {
        return f63499b.a();
    }

    @Override // pc.o0
    public final m d() {
        m0 type = l2.f26125a.n();
        Intrinsics.checkNotNullParameter("data", "name");
        Intrinsics.checkNotNullParameter(type, "type");
        q0 q0Var = q0.f80391a;
        List list = i40.a.f71507a;
        List selections = i40.a.f71511e;
        Intrinsics.checkNotNullParameter(selections, "selections");
        return new m("data", type, null, q0Var, q0Var, selections);
    }

    @Override // pc.o0
    public final void e(tc.g writer, v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(this, "value");
        writer.M0("interestId");
        pc.c.f99520a.d(writer, customScalarAdapters, this.f63500a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && Intrinsics.d(this.f63500a, ((i) obj).f63500a);
    }

    public final int hashCode() {
        return this.f63500a.hashCode();
    }

    @Override // pc.o0
    public final String name() {
        return "RemoveFatigueForInterestAfterFeedbackMutation";
    }

    public final String toString() {
        return a.a.p(new StringBuilder("RemoveFatigueForInterestAfterFeedbackMutation(interestId="), this.f63500a, ")");
    }
}
