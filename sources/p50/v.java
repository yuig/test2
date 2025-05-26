package p50;

import a.cb;
import c50.l2;
import c50.ma;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import pc.j0;
import pc.m0;
import pc.q0;
import pc.r0;

/* loaded from: classes5.dex */
public final class v implements j0 {

    /* renamed from: d, reason: collision with root package name */
    public static final ma f98888d = new ma(14, 0);

    /* renamed from: a, reason: collision with root package name */
    public final String f98889a;

    /* renamed from: b, reason: collision with root package name */
    public final String f98890b;

    /* renamed from: c, reason: collision with root package name */
    public final r0 f98891c;

    public v(String widgetName, q0 widgetId) {
        Intrinsics.checkNotNullParameter("homeFeed", "widgetContentSource");
        Intrinsics.checkNotNullParameter(widgetName, "widgetName");
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        this.f98889a = "homeFeed";
        this.f98890b = widgetName;
        this.f98891c = widgetId;
    }

    @Override // pc.o0
    public final String a() {
        return "28f0c9677b3cb989afa7b2d7c41083c9a0c261a0fdb7f5e3fe7758849c3dbf27";
    }

    @Override // pc.o0
    public final pc.a b() {
        return pc.c.c(q50.s.f102573a);
    }

    @Override // pc.o0
    public final String c() {
        return f98888d.e();
    }

    @Override // pc.o0
    public final pc.m d() {
        m0 type = l2.f26125a.n();
        Intrinsics.checkNotNullParameter("data", "name");
        Intrinsics.checkNotNullParameter(type, "type");
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        List list = r50.c.f106247a;
        List selections = r50.c.f106249c;
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
        writer.M0("widgetContentSource");
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, this.f98889a);
        writer.M0("widgetName");
        eVar.d(writer, customScalarAdapters, this.f98890b);
        r0 r0Var = this.f98891c;
        if (r0Var instanceof q0) {
            writer.M0("widgetId");
            pc.c.d(pc.c.f99524e).a(writer, customScalarAdapters, (q0) r0Var);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Intrinsics.d(this.f98889a, vVar.f98889a) && Intrinsics.d(this.f98890b, vVar.f98890b) && Intrinsics.d(this.f98891c, vVar.f98891c);
    }

    public final int hashCode() {
        return this.f98891c.hashCode() + cb.d(this.f98890b, this.f98889a.hashCode() * 31, 31);
    }

    @Override // pc.o0
    public final String name() {
        return "WidgetTap";
    }

    public final String toString() {
        return "WidgetTapMutation(widgetContentSource=" + this.f98889a + ", widgetName=" + this.f98890b + ", widgetId=" + this.f98891c + ")";
    }
}
