package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ii implements pc.j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final pc f132578c = new pc(24, 0);

    /* renamed from: a, reason: collision with root package name */
    public final String f132579a;

    /* renamed from: b, reason: collision with root package name */
    public final c50.l0 f132580b;

    public ii(String contactRequestId, c50.l0 reason) {
        Intrinsics.checkNotNullParameter(contactRequestId, "contactRequestId");
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f132579a = contactRequestId;
        this.f132580b = reason;
    }

    @Override // pc.o0
    public final String a() {
        return "3371521a9ddebeaeee4825cd5fce304884faadde06d8a94a0c7f4055737edfa8";
    }

    @Override // pc.o0
    public final pc.a b() {
        return pc.c.c(y40.zg.f137701a);
    }

    @Override // pc.o0
    public final String c() {
        return f132578c.a();
    }

    @Override // pc.o0
    public final pc.m d() {
        pc.m0 type = c50.l2.f26125a.n();
        Intrinsics.checkNotNullParameter("data", "name");
        Intrinsics.checkNotNullParameter(type, "type");
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        List list = b50.f0.f21848a;
        List selections = b50.f0.f21852e;
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
        writer.M0("contactRequestId");
        pc.c.f99520a.d(writer, customScalarAdapters, this.f132579a);
        writer.M0("reason");
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        c50.l0 value = this.f132580b;
        Intrinsics.checkNotNullParameter(value, "value");
        writer.n1(value.getRawValue());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ii)) {
            return false;
        }
        ii iiVar = (ii) obj;
        return Intrinsics.d(this.f132579a, iiVar.f132579a) && this.f132580b == iiVar.f132580b;
    }

    public final int hashCode() {
        return this.f132580b.hashCode() + (this.f132579a.hashCode() * 31);
    }

    @Override // pc.o0
    public final String name() {
        return "ReportContactRequestMutation";
    }

    public final String toString() {
        return "ReportContactRequestMutation(contactRequestId=" + this.f132579a + ", reason=" + this.f132580b + ")";
    }
}
