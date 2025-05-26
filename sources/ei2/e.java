package ei2;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import xf2.c0;
import xf2.k0;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f58970a;

    /* renamed from: b, reason: collision with root package name */
    public final oi2.a f58971b;

    /* renamed from: c, reason: collision with root package name */
    public vi2.b f58972c;

    /* renamed from: d, reason: collision with root package name */
    public final String f58973d;

    /* renamed from: e, reason: collision with root package name */
    public Long f58974e;

    /* renamed from: f, reason: collision with root package name */
    public final ui2.k f58975f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f58976g;

    /* renamed from: h, reason: collision with root package name */
    public final LinkedHashMap f58977h;

    public e(ui2.p tracer, String name, c0 telemetryType, boolean z13, boolean z14, oi2.a autoTerminationMode, oi2.b bVar) {
        Intrinsics.checkNotNullParameter(tracer, "tracer");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(telemetryType, "telemetryType");
        Intrinsics.checkNotNullParameter(autoTerminationMode, "autoTerminationMode");
        this.f58970a = z13;
        this.f58971b = autoTerminationMode;
        if (z13) {
            Intrinsics.checkNotNullParameter(name, "<this>");
            name = "emb-" + name;
        }
        this.f58973d = name;
        this.f58975f = tracer.a(name);
        ArrayList l13 = f0.l(telemetryType);
        this.f58976g = l13;
        this.f58977h = new LinkedHashMap();
        if (bVar instanceof q) {
            k kVar = (k) ((q) bVar);
            ui2.j jVar = (ui2.j) kVar.f59004f.get();
            vi2.b bVar2 = null;
            if (jVar != null) {
                vi2.b bVar3 = kVar.f58999a.f58972c;
                if (bVar3 == null) {
                    Intrinsics.r("parentContext");
                    throw null;
                }
                bVar2 = jVar.a(bVar3);
            }
            bVar2 = bVar2 == null ? vi2.g.f125879b.root() : bVar2;
            bVar2.getClass();
            vi2.a a13 = ((vi2.f) bVar).a(bVar2);
            Intrinsics.checkNotNullExpressionValue(a13, "newParentContext.with(parentSpan)");
            b(a13);
        } else {
            a();
        }
        if (z14) {
            l13.add(k0.f134870a);
        }
    }

    public final void a() {
        vi2.b root = vi2.g.f125879b.root();
        Intrinsics.checkNotNullExpressionValue(root, "root()");
        this.f58972c = root;
        this.f58975f.b();
    }

    public final void b(vi2.b context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f58972c = context;
        if (context != null) {
            this.f58975f.c(context);
        } else {
            Intrinsics.r("parentContext");
            throw null;
        }
    }
}
