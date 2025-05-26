package r40;

import c50.l2;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import pc.j0;
import pc.m;
import pc.m0;
import pc.v;

/* loaded from: classes5.dex */
public final class k implements j0 {

    /* renamed from: b, reason: collision with root package name */
    public static final g40.a f106170b = new g40.a(6, 0);

    /* renamed from: a, reason: collision with root package name */
    public final String f106171a;

    public k(String deviceId) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        this.f106171a = deviceId;
    }

    @Override // pc.o0
    public final String a() {
        return "5b2bfb0b18c5ea9b70409b83958e68d1c776e1dbcf2b1d3b10155079c6e2a2b5";
    }

    @Override // pc.o0
    public final pc.a b() {
        return pc.c.c(s40.j.f111126a);
    }

    @Override // pc.o0
    public final String c() {
        return f106170b.a();
    }

    @Override // pc.o0
    public final m d() {
        m0 type = l2.f26125a.n();
        Intrinsics.checkNotNullParameter("data", "name");
        Intrinsics.checkNotNullParameter(type, "type");
        q0 q0Var = q0.f80391a;
        List list = t40.a.f116406a;
        List selections = t40.a.f116411f;
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
        writer.M0("deviceId");
        pc.c.f99520a.d(writer, customScalarAdapters, this.f106171a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && Intrinsics.d(this.f106171a, ((k) obj).f106171a);
    }

    public final int hashCode() {
        return this.f106171a.hashCode();
    }

    @Override // pc.o0
    public final String name() {
        return "DeleteAddressBookMutation";
    }

    public final String toString() {
        return a.a.p(new StringBuilder("DeleteAddressBookMutation(deviceId="), this.f106171a, ")");
    }
}
