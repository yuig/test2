package p50;

import c50.l3;
import c50.ma;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import pc.m0;
import pc.r0;
import pc.u0;

/* loaded from: classes5.dex */
public final class k implements u0 {

    /* renamed from: d, reason: collision with root package name */
    public static final ma f98870d = new ma(12, 0);

    /* renamed from: a, reason: collision with root package name */
    public final String f98871a;

    /* renamed from: b, reason: collision with root package name */
    public final r0 f98872b;

    /* renamed from: c, reason: collision with root package name */
    public final r0 f98873c;

    public k(String board, r0 widgetCountForStyle, r0 widgetStyle) {
        Intrinsics.checkNotNullParameter(board, "board");
        Intrinsics.checkNotNullParameter(widgetCountForStyle, "widgetCountForStyle");
        Intrinsics.checkNotNullParameter(widgetStyle, "widgetStyle");
        this.f98871a = board;
        this.f98872b = widgetCountForStyle;
        this.f98873c = widgetStyle;
    }

    @Override // pc.o0
    public final String a() {
        return "22ffaa7edb2377ce9419ea201c14b9598f372e7fdf1fae6599ffc76d53c33204";
    }

    @Override // pc.o0
    public final pc.a b() {
        return pc.c.c(q50.j.f102561a);
    }

    @Override // pc.o0
    public final String c() {
        return f98870d.e();
    }

    @Override // pc.o0
    public final pc.m d() {
        m0 v13 = ep.b.v(l3.f26127a, "data", "name", "type");
        q0 q0Var = q0.f80391a;
        List list = r50.a.f106235a;
        List selections = r50.a.f106242h;
        Intrinsics.checkNotNullParameter(selections, "selections");
        return new pc.m("data", v13, null, q0Var, q0Var, selections);
    }

    @Override // pc.o0
    public final void e(tc.g writer, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        lf.a.l(writer, customScalarAdapters, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.d(this.f98871a, kVar.f98871a) && Intrinsics.d(this.f98872b, kVar.f98872b) && Intrinsics.d(this.f98873c, kVar.f98873c);
    }

    public final int hashCode() {
        return this.f98873c.hashCode() + pk2.f.a(this.f98872b, ep.b.b(50, this.f98871a.hashCode() * 31, 31), 31);
    }

    @Override // pc.o0
    public final String name() {
        return "WidgetBoardPins";
    }

    public final String toString() {
        return "WidgetBoardPinsQuery(board=" + this.f98871a + ", pageSize=50, widgetCountForStyle=" + this.f98872b + ", widgetStyle=" + this.f98873c + ")";
    }
}
