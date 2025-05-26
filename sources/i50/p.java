package i50;

import c50.l3;
import c50.ma;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import pc.m0;
import pc.u0;
import pc.v;

/* loaded from: classes5.dex */
public final class p implements u0 {

    /* renamed from: c, reason: collision with root package name */
    public static final ma f71561c = new ma(10, 0);

    /* renamed from: a, reason: collision with root package name */
    public final String f71562a;

    /* renamed from: b, reason: collision with root package name */
    public final String f71563b;

    public p(String pinId, String trackingId) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(trackingId, "trackingId");
        this.f71562a = pinId;
        this.f71563b = trackingId;
    }

    @Override // pc.o0
    public final String a() {
        return "e4f6b95101ceb7fc1877fb7965a14a22c392605d1770c1eda12e6152d8bf69ea";
    }

    @Override // pc.o0
    public final pc.a b() {
        return pc.c.c(j50.n.f74701a);
    }

    @Override // pc.o0
    public final String c() {
        return f71561c.e();
    }

    @Override // pc.o0
    public final pc.m d() {
        m0 v13 = ep.b.v(l3.f26127a, "data", "name", "type");
        q0 q0Var = q0.f80391a;
        List list = m50.b.f85871a;
        List selections = m50.b.f85875e;
        Intrinsics.checkNotNullParameter(selections, "selections");
        return new pc.m("data", v13, null, q0Var, q0Var, selections);
    }

    @Override // pc.o0
    public final void e(tc.g writer, v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(this, "value");
        writer.M0("pinId");
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, this.f71562a);
        writer.M0("trackingId");
        eVar.d(writer, customScalarAdapters, this.f71563b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.d(this.f71562a, pVar.f71562a) && Intrinsics.d(this.f71563b, pVar.f71563b);
    }

    public final int hashCode() {
        return this.f71563b.hashCode() + (this.f71562a.hashCode() * 31);
    }

    @Override // pc.o0
    public final String name() {
        return "PollDownloadIdeaPinQuery";
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PollDownloadIdeaPinQuery(pinId=");
        sb3.append(this.f71562a);
        sb3.append(", trackingId=");
        return a.a.p(sb3, this.f71563b, ")");
    }
}
