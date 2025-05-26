package y30;

import c50.l3;
import com.pinterest.shuffles.scene.composer.AnimatedTarget;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import pc.m0;
import pc.u0;
import zy.b0;

/* loaded from: classes.dex */
public final class w implements u0 {

    /* renamed from: a, reason: collision with root package name */
    public static final b0 f136770a = new b0(11, 0);

    public w() {
        Intrinsics.checkNotNullParameter("ACTIVITY_STATE", AnimatedTarget.PROPERTY_STATE);
    }

    @Override // pc.o0
    public final String a() {
        return "4b7d9a33314006455d4d8343202e6cdcc9d380d1f62610db7010bd56feecd27a";
    }

    @Override // pc.o0
    public final pc.a b() {
        return pc.c.c(z30.u.f140790a);
    }

    @Override // pc.o0
    public final String c() {
        return f136770a.b();
    }

    @Override // pc.o0
    public final pc.m d() {
        m0 v13 = ep.b.v(l3.f26127a, "data", "name", "type");
        q0 q0Var = q0.f80391a;
        List list = a40.b.f538a;
        List selections = a40.b.f541d;
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
        writer.M0(AnimatedTarget.PROPERTY_STATE);
        pc.c.f99520a.d(writer, customScalarAdapters, "ACTIVITY_STATE");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        ((w) obj).getClass();
        return Intrinsics.d("ACTIVITY_STATE", "ACTIVITY_STATE");
    }

    public final int hashCode() {
        return 974015297;
    }

    @Override // pc.o0
    public final String name() {
        return "GetUserStateQuery";
    }

    public final String toString() {
        return "GetUserStateQuery(state=ACTIVITY_STATE)";
    }
}
