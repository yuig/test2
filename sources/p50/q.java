package p50;

import c50.l3;
import c50.ma;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import pc.m0;
import pc.q0;
import pc.r0;
import pc.u0;

/* loaded from: classes5.dex */
public final class q implements u0 {

    /* renamed from: d, reason: collision with root package name */
    public static final ma f98880d = new ma(13, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f98881a;

    /* renamed from: b, reason: collision with root package name */
    public final r0 f98882b;

    /* renamed from: c, reason: collision with root package name */
    public final r0 f98883c;

    public q(int i13, q0 widgetCountForStyle, q0 widgetStyle) {
        Intrinsics.checkNotNullParameter(widgetCountForStyle, "widgetCountForStyle");
        Intrinsics.checkNotNullParameter(widgetStyle, "widgetStyle");
        this.f98881a = i13;
        this.f98882b = widgetCountForStyle;
        this.f98883c = widgetStyle;
    }

    @Override // pc.o0
    public final String a() {
        return "68f2843fae24f933dc1f60513f0e409efe1aea5f7af27bb33da4288b6a2f9832";
    }

    @Override // pc.o0
    public final pc.a b() {
        return pc.c.c(q50.o.f102568a);
    }

    @Override // pc.o0
    public final String c() {
        return f98880d.e();
    }

    @Override // pc.o0
    public final pc.m d() {
        m0 v13 = ep.b.v(l3.f26127a, "data", "name", "type");
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        List list = r50.b.f106243a;
        List selections = r50.b.f106246d;
        Intrinsics.checkNotNullParameter(selections, "selections");
        return new pc.m("data", v13, null, q0Var, q0Var, selections);
    }

    @Override // pc.o0
    public final void e(tc.g writer, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        lp2.b.s(writer, customScalarAdapters, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f98881a == qVar.f98881a && Intrinsics.d(this.f98882b, qVar.f98882b) && Intrinsics.d(this.f98883c, qVar.f98883c);
    }

    public final int hashCode() {
        return this.f98883c.hashCode() + pk2.f.a(this.f98882b, Integer.hashCode(this.f98881a) * 31, 31);
    }

    @Override // pc.o0
    public final String name() {
        return "WidgetHomeFeedPins";
    }

    public final String toString() {
        return "WidgetHomeFeedPinsQuery(pinRequestSize=" + this.f98881a + ", widgetCountForStyle=" + this.f98882b + ", widgetStyle=" + this.f98883c + ")";
    }
}
